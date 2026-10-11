#!/usr/bin/env python3
"""Task manager for the DIGI decoder. Runs on your laptop and uses your laptop's adb.
Start it with:  python taskmanager.py     (optionally:  python taskmanager.py 192.168.68.107)
"""
import json
import os
import re
import secrets
import subprocess
import sys
import threading
import time
import webbrowser
from http.server import BaseHTTPRequestHandler, ThreadingHTTPServer
from urllib.parse import urlparse, parse_qs

ADB = r"C:\Users\johndamilola.s\AppData\Local\Android\Sdk\platform-tools\adb.exe"
if not os.path.exists(ADB):
    ADB = "adb"
DECODER_IPS = ["192.168.68.107", "10.136.134.200"]   # home, hotspot
PORT = 8800
TOKEN = secrets.token_urlsafe(16)          # stops other web pages from calling the buttons
device = None
lock = threading.Lock()
cache = {"t": 0, "data": None}
meta_cache = {"t": 0, "data": {}}

# apps that should not be ended from here (the decoder needs them)
PROTECTED = ("system", "android", "com.android.", "com.google.android.gms", "com.google.android.tvlauncher",
             "com.google.android.inputmethod", "com.google.android.webview", "com.google.android.katniss",
             "com.google.android.backdrop", "com.google.android.tv.", "com.mediatek", "com.ita.livetv")


def run(cmd, timeout=15):
    try:
        r = subprocess.run(cmd, capture_output=True, text=True, timeout=timeout)
        return r.stdout
    except Exception:
        return ""


def adb(*args, timeout=15):
    return run([ADB, "-s", device, *args], timeout)


def pick_device(ips):
    global device
    for ip in ips:
        out = run([ADB, "connect", f"{ip}:5555"], 8)
        if "connected to" in out:
            device = f"{ip}:5555"
            return True
    return False


def load_meta():
    if time.time() - meta_cache["t"] > 60:
        try:
            meta_cache["data"] = json.loads(adb("shell", "cat", "/sdcard/app_meta.json") or "{}")
        except Exception:
            meta_cache["data"] = {}
        meta_cache["t"] = time.time()
    return meta_cache["data"]


PSS_LINE = re.compile(r"^\s*([\d,]+)K:\s+(\S+)\s+\(pid\s+(\d+)(.*?)\)")


def snapshot():
    with lock:
        if time.time() - cache["t"] < 2 and cache["data"]:
            return cache["data"]
        mem = adb("shell", "dumpsys", "meminfo", timeout=25)
        start = mem.find("Total PSS by process:")
        end = mem.find("Total PSS by OOM adjustment:", start)
        if end < 0:
            end = len(mem)
        section = mem[start:end] if start >= 0 else ""

        fg = None
        m = re.search(r"ResumedActivity: ActivityRecord\{\S+ u\d+ ([\w.]+)/",
                      adb("shell", "dumpsys activity activities | grep ResumedActivity"))
        if m:
            fg = m.group(1)

        apps = {}
        for line in section.splitlines():
            m = PSS_LINE.match(line)
            if not m:
                continue
            kb = int(m.group(1).replace(",", ""))
            pkg = m.group(2).split(":")[0]
            a = apps.setdefault(pkg, {"pkg": pkg, "mb": 0.0, "procs": 0, "visible": False})
            a["mb"] += kb / 1024.0
            a["procs"] += 1
            if "activities" in m.group(4):
                a["visible"] = True

        meta = load_meta()
        rows = []
        for a in apps.values():
            pkg = a["pkg"]
            system = pkg.startswith(PROTECTED)
            if system:
                status = "System"
            elif pkg == fg:
                status = "Foreground"
            elif a["visible"]:
                status = "Open"
            else:
                status = "Background"
            name = (meta.get(pkg) or {}).get("name") or pkg.split(".")[-1].replace("_", " ").title()
            rows.append({"pkg": pkg, "name": name, "mb": round(a["mb"], 1), "procs": a["procs"],
                         "status": status, "system": system})
        rows.sort(key=lambda r: -r["mb"])

        info = adb("shell", "head", "-3", "/proc/meminfo")
        total = re.search(r"MemTotal:\s+(\d+)", info)
        avail = re.search(r"MemAvailable:\s+(\d+)", info)
        data = {
            "device": device,
            "total_mb": round(int(total.group(1)) / 1024) if total else 0,
            "free_mb": round(int(avail.group(1)) / 1024) if avail else 0,
            "apps": rows,
        }
        cache.update(t=time.time(), data=data)
        return data


def stop(pkg):
    if not re.fullmatch(r"[A-Za-z0-9_.]+", pkg):
        return False
    adb("shell", "am", "force-stop", pkg)
    cache["t"] = 0
    return True


PAGE = """<!doctype html><html lang="en"><head><meta charset="utf-8">
<meta name="viewport" content="width=device-width,initial-scale=1"><title>Decoder Task Manager</title>
<style>
  :root { --bg:#0e0f13; --card:#17181e; --line:#2a2c35; --text:#eceef3; --dim:#8b8f9c; --accent:#4fc3f7; --red:#ef5350; --green:#66bb6a; }
  * { box-sizing:border-box; }
  body { margin:0; background:var(--bg); color:var(--text); font:14px/1.45 system-ui,Segoe UI,Arial,sans-serif; }
  header { padding:18px 24px; border-bottom:1px solid var(--line); display:flex; flex-wrap:wrap; gap:16px; align-items:center; }
  h1 { font-size:18px; margin:0; }
  .pill { background:var(--card); border:1px solid var(--line); border-radius:999px; padding:4px 12px; color:var(--dim); font-size:12px; }
  .bar { width:160px; height:8px; background:#2a2c35; border-radius:4px; overflow:hidden; display:inline-block; vertical-align:middle; margin-left:8px; }
  .bar > i { display:block; height:100%; background:var(--accent); }
  .tools { padding:12px 24px; display:flex; gap:12px; flex-wrap:wrap; align-items:center; }
  input[type=text] { background:var(--card); border:1px solid var(--line); border-radius:8px; color:var(--text); padding:8px 12px; min-width:240px; outline:none; }
  label { color:var(--dim); user-select:none; }
  button { background:#262833; border:1px solid var(--line); color:var(--text); border-radius:8px; padding:7px 14px; cursor:pointer; font-weight:600; }
  button:hover { border-color:var(--accent); }
  button.end { color:var(--red); border-color:#5a2a2a; }
  button.end:hover { background:#3a1f1f; }
  button:disabled { opacity:.35; cursor:not-allowed; }
  table { width:calc(100% - 48px); margin:0 24px 32px; border-collapse:collapse; background:var(--card); border:1px solid var(--line); border-radius:12px; overflow:hidden; }
  th, td { padding:10px 14px; text-align:left; border-bottom:1px solid var(--line); }
  th { color:var(--dim); font-weight:600; font-size:12px; text-transform:uppercase; letter-spacing:.5px; background:#13141a; }
  tr:last-child td { border-bottom:none; }
  td.num { text-align:right; font-variant-numeric:tabular-nums; white-space:nowrap; }
  .pkg { color:var(--dim); font-size:12px; }
  .st { font-size:12px; padding:2px 10px; border-radius:999px; border:1px solid var(--line); white-space:nowrap; }
  .st.Foreground { color:var(--green); border-color:#2f5a33; }
  .st.Open { color:var(--accent); border-color:#245a73; }
  .st.System { color:var(--dim); }
  .mem { display:flex; align-items:center; gap:10px; justify-content:flex-end; }
  .mem .bar { width:90px; margin:0; }
  #msg { color:var(--dim); padding:0 24px 24px; }
  td { word-break:break-word; }
  @media (max-width: 720px) {
    header, .tools { padding:12px 16px; gap:10px; }
    input[type=text] { min-width:0; width:100%; }
    table { width:calc(100% - 24px); margin:0 12px 24px; }
    th, td { padding:8px 10px; }
    th:nth-child(4), td:nth-child(4) { display:none; }   /* hide the processes column */
    .mem .bar { display:none; }
    .pkg { word-break:break-all; }
    button.end { padding:6px 10px; }
    #msg { padding:0 16px 16px; }
  }
</style></head><body>
<header>
  <h1>Decoder Task Manager</h1>
  <span class="pill" id="dev">connecting...</span>
  <span class="pill">Memory free: <b id="free">-</b><span class="bar"><i id="freebar" style="width:0"></i></span></span>
</header>
<div class="tools">
  <input type="text" id="q" placeholder="Search apps...">
  <label><input type="checkbox" class="flt" value="Foreground" checked> FG</label>
  <label><input type="checkbox" class="flt" value="Open" checked> Open</label>
  <label><input type="checkbox" class="flt" value="Background" checked> BG</label>
  <label><input type="checkbox" class="flt" value="System"> System</label>
  <button id="bg">End all background</button>
  <button id="refresh">Refresh</button>
</div>
<table>
  <thead><tr><th>App</th><th>Status</th><th style="text-align:right">Memory</th><th style="text-align:right">Processes</th><th></th></tr></thead>
  <tbody id="rows"></tbody>
</table>
<div id="msg"></div>
<script>
  const TOKEN = "__TOKEN__";
  let data = null;
  const $ = id => document.getElementById(id);
  const SHORT = {Foreground:'FG', Open:'OPEN', Background:'BG', System:'SYS'};
  const esc = s => String(s).replace(/[&<>"']/g, c => ({'&':'&amp;','<':'&lt;','>':'&gt;','"':'&quot;',"'":'&#39;'}[c]));

  async function load() {
    try {
      const r = await fetch('/api/apps');
      data = await r.json();
      $('msg').textContent = '';
      render();
    } catch (e) { $('msg').textContent = 'Lost connection to the script. Is it still running?'; }
  }

  function render() {
    if (!data) return;
    $('dev').textContent = data.device || 'no device';
    $('free').textContent = data.free_mb + ' MB of ' + data.total_mb + ' MB';
    $('freebar').style.width = (data.total_mb ? 100 * data.free_mb / data.total_mb : 0) + '%';
    const q = $('q').value.trim().toLowerCase();
    const on = new Set([...document.querySelectorAll('.flt:checked')].map(c => c.value));
    const list = data.apps.filter(a => on.has(a.status) && (!q || (a.name + ' ' + a.pkg).toLowerCase().includes(q)));
    const max = Math.max(1, ...list.map(a => a.mb));
    $('rows').innerHTML = list.map(a =>
      '<tr><td>' + esc(a.name) + '<div class="pkg">' + esc(a.pkg) + '</div></td>' +
      '<td><span class="st ' + a.status + '" title="' + a.status + '">' + (SHORT[a.status] || a.status) + '</span></td>' +
      '<td class="num"><div class="mem"><span>' + a.mb.toFixed(1) + ' MB</span><span class="bar"><i style="width:' + (100 * a.mb / max) + '%"></i></span></div></td>' +
      '<td class="num">' + a.procs + '</td>' +
      '<td style="text-align:right"><button class="end" ' + (a.system ? 'disabled title="The decoder needs this one"' : '') + ' data-pkg="' + esc(a.pkg) + '">End task</button></td></tr>'
    ).join('') || '<tr><td colspan="5" style="color:var(--dim)">Nothing to show</td></tr>';
  }

  async function post(path) { await fetch(path + (path.includes('?') ? '&' : '?') + 'token=' + TOKEN, { method: 'POST' }); await load(); }

  $('rows').addEventListener('click', e => {
    const b = e.target.closest('button.end');
    if (b && !b.disabled) { b.textContent = 'Ending...'; post('/api/stop?pkg=' + encodeURIComponent(b.dataset.pkg)); }
  });
  $('bg').onclick = () => { if (confirm('End every background app?')) post('/api/stop_background'); };
  $('refresh').onclick = load;
  $('q').oninput = render;
  document.querySelectorAll('.flt').forEach(c => c.onchange = render);
  load();
  setInterval(load, 4000);
</script></body></html>"""


class Handler(BaseHTTPRequestHandler):
    def log_message(self, *a):
        pass

    def _send(self, code, body, ctype="application/json"):
        raw = body.encode("utf-8") if isinstance(body, str) else body
        self.send_response(code)
        self.send_header("Content-Type", ctype + "; charset=utf-8")
        self.send_header("Content-Length", str(len(raw)))
        self.end_headers()
        self.wfile.write(raw)

    def _host_ok(self):
        return self.headers.get("Host", "").split(":")[0] in ("localhost", "127.0.0.1")

    def do_GET(self):
        if not self._host_ok():
            return self._send(403, "forbidden", "text/plain")
        path = urlparse(self.path).path
        if path == "/":
            return self._send(200, PAGE.replace("__TOKEN__", TOKEN), "text/html")
        if path == "/api/apps":
            return self._send(200, json.dumps(snapshot()))
        self._send(404, "not found", "text/plain")

    def do_POST(self):
        if not self._host_ok():
            return self._send(403, "forbidden", "text/plain")
        u = urlparse(self.path)
        q = parse_qs(u.query)
        if q.get("token", [""])[0] != TOKEN:
            return self._send(403, "bad token", "text/plain")
        if u.path == "/api/stop":
            ok = stop(q.get("pkg", [""])[0])
            return self._send(200 if ok else 400, json.dumps({"ok": ok}))
        if u.path == "/api/stop_background":
            for a in snapshot()["apps"]:
                if a["status"] == "Background" and not a["system"]:
                    stop(a["pkg"])
            return self._send(200, json.dumps({"ok": True}))
        self._send(404, "not found", "text/plain")


def main():
    ips = [sys.argv[1]] if len(sys.argv) > 1 else DECODER_IPS
    if not pick_device(ips):
        print("Could not connect to the decoder at", ", ".join(ips))
        print("Check that it is on the same network and that ADB over network is on.")
        sys.exit(1)
    server = ThreadingHTTPServer(("127.0.0.1", PORT), Handler)
    url = f"http://localhost:{PORT}"
    print(f"Task manager for {device} is running at {url}  (Ctrl+C to stop)")
    webbrowser.open(url)
    try:
        server.serve_forever()
    except KeyboardInterrupt:
        pass


if __name__ == "__main__":
    main()