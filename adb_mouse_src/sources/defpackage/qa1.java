package defpackage;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class qa1 {
    public static final Object g = new Object();
    public static qa1 h;
    public static HandlerThread i;
    public final HashMap a = new HashMap();
    public final Context b;
    public volatile y31 c;
    public final os d;
    public final long e;
    public final long f;

    /* JADX WARN: Type inference failed for: r3v2, types: [y31, android.os.Handler] */
    /* JADX WARN: Type inference failed for: r4v2, types: [os, java.lang.Object] */
    public qa1(Context context, Looper looper) {
        jo0 jo0Var = new jo0(1, this);
        this.b = context.getApplicationContext();
        ?? handler = new Handler(looper, jo0Var);
        Looper.getMainLooper();
        this.c = handler;
        if (os.d == null) {
            synchronized (os.c) {
                try {
                    if (os.d == null) {
                        ?? obj = new Object();
                        new ConcurrentHashMap();
                        os.d = obj;
                    }
                } finally {
                }
            }
        }
        os osVar = os.d;
        wv0.p(osVar);
        this.d = osVar;
        this.e = 5000L;
        this.f = 300000L;
    }

    public final jj a(ka1 ka1Var, d71 d71Var, String str) {
        jj jjVar;
        HashMap hashMap = this.a;
        synchronized (hashMap) {
            try {
                ma1 ma1Var = (ma1) hashMap.get(ka1Var);
                if (ma1Var == null) {
                    ma1Var = new ma1(this, ka1Var);
                    ma1Var.a.put(d71Var, d71Var);
                    jjVar = ma1Var.a(str, null);
                    hashMap.put(ka1Var, ma1Var);
                } else {
                    this.c.removeMessages(0, ka1Var);
                    if (!ma1Var.a.containsKey(d71Var)) {
                        ma1Var.a.put(d71Var, d71Var);
                        int i2 = ma1Var.b;
                        if (i2 != 1) {
                            if (i2 == 2) {
                                jjVar = ma1Var.a(str, null);
                            }
                        } else {
                            d71Var.onServiceConnected(ma1Var.f, ma1Var.d);
                        }
                        jjVar = null;
                    } else {
                        String ka1Var2 = ka1Var.toString();
                        StringBuilder sb = new StringBuilder(ka1Var2.length() + 81);
                        sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                        sb.append(ka1Var2);
                        throw new IllegalStateException(sb.toString());
                    }
                }
                if (ma1Var.c) {
                    return jj.h;
                }
                if (jjVar == null) {
                    jjVar = new jj(-1, null, null);
                }
                return jjVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(String str, ServiceConnection serviceConnection, boolean z) {
        ka1 ka1Var = new ka1(str, z);
        wv0.q(serviceConnection, "ServiceConnection must not be null");
        HashMap hashMap = this.a;
        synchronized (hashMap) {
            try {
                ma1 ma1Var = (ma1) hashMap.get(ka1Var);
                if (ma1Var != null) {
                    if (ma1Var.a.containsKey(serviceConnection)) {
                        ma1Var.a.remove(serviceConnection);
                        if (ma1Var.a.isEmpty()) {
                            this.c.sendMessageDelayed(this.c.obtainMessage(0, ka1Var), this.e);
                        }
                    } else {
                        String ka1Var2 = ka1Var.toString();
                        StringBuilder sb = new StringBuilder(ka1Var2.length() + 76);
                        sb.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                        sb.append(ka1Var2);
                        throw new IllegalStateException(sb.toString());
                    }
                } else {
                    String ka1Var3 = ka1Var.toString();
                    StringBuilder sb2 = new StringBuilder(ka1Var3.length() + 50);
                    sb2.append("Nonexistent connection status for service config: ");
                    sb2.append(ka1Var3);
                    throw new IllegalStateException(sb2.toString());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
