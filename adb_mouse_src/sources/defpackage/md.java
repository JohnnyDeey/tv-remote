package defpackage;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public class md {
    public final Long A;
    public final hi0 B;
    public final String c;
    public final String d;
    public volatile a31 f;
    public final Context g;
    public final jp0 h;
    public volatile r41 i;
    public volatile j51 j;
    public boolean k;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public final g00 x;
    public final boolean y;
    public ExecutorService z;
    public final Object a = new Object();
    public volatile int b = 0;
    public final Handler e = new Handler(Looper.getMainLooper());
    public int l = 0;

    public md(g00 g00Var, f5 f5Var, rd rdVar, ld ldVar) {
        long nextLong = new Random().nextLong();
        this.A = Long.valueOf(nextLong);
        this.B = z41.a;
        this.c = "8.3.0";
        String h = h();
        this.d = h;
        this.g = f5Var.getApplicationContext();
        s91 A = t91.A();
        A.b();
        t91.y((t91) A.d);
        if (h != null) {
            A.b();
            t91.z((t91) A.d, h);
        }
        String packageName = this.g.getPackageName();
        A.b();
        t91.r((t91) A.d, packageName);
        A.b();
        t91.E((t91) A.d, nextLong);
        A.b();
        t91.x((t91) A.d);
        int i = Build.VERSION.SDK_INT;
        A.b();
        t91.B((t91) A.d, i);
        A.c();
        u(A, f5Var);
        try {
            int i2 = this.g.getPackageManager().getPackageInfo(this.g.getPackageName(), 0).versionCode;
            A.b();
            t91.C((t91) A.d, i2);
        } catch (Throwable th) {
            m51.i("BillingClient", "Error getting app version code.", th);
        }
        this.h = new jp0(this.g, (t91) A.a());
        if (rdVar == null) {
            m51.h("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.f = new a31(this.g, rdVar, this.h);
        this.x = g00Var;
        this.y = false;
        this.g.getPackageName();
    }

    public static Future f(Callable callable, long j, Runnable runnable, Handler handler, ExecutorService executorService) {
        try {
            Future submit = executorService.submit(callable);
            handler.postDelayed(new m61(submit, 14, runnable), (long) (j * 0.95d));
            return submit;
        } catch (Exception e) {
            m51.i("BillingClient", "Async task throws exception!", e);
            return null;
        }
    }

    public static String h() {
        try {
            return (String) Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            return null;
        }
    }

    public static void i(md mdVar, int i) {
        a31 a31Var;
        if (i == 0) {
            synchronized (mdVar.a) {
                try {
                    if (mdVar.b == 3) {
                        return;
                    }
                    int i2 = 2;
                    mdVar.p(2);
                    if (mdVar.f != null) {
                        a31Var = mdVar.f;
                    } else {
                        a31Var = null;
                    }
                    if (a31Var != null) {
                        boolean z = mdVar.u;
                        IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
                        IntentFilter intentFilter2 = new IntentFilter("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
                        intentFilter2.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
                        a31Var.c = z;
                        d41 d41Var = (d41) a31Var.h;
                        Context context = (Context) a31Var.d;
                        d41Var.a(context, intentFilter2);
                        boolean z2 = a31Var.c;
                        d41 d41Var2 = (d41) a31Var.g;
                        if (z2) {
                            synchronized (d41Var2) {
                                try {
                                    if (d41Var2.a) {
                                        return;
                                    }
                                    if (Build.VERSION.SDK_INT >= 33) {
                                        if (true != d41Var2.b) {
                                            i2 = 4;
                                        }
                                        context.registerReceiver(d41Var2, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null, i2);
                                    } else {
                                        context.registerReceiver(d41Var2, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null);
                                    }
                                    d41Var2.a = true;
                                    return;
                                } finally {
                                }
                            }
                        }
                        d41Var2.a(context, intentFilter);
                        return;
                    }
                    return;
                } finally {
                }
            }
        }
        mdVar.p(0);
    }

    public static final void u(s91 s91Var, f5 f5Var) {
        try {
            ActivityManager activityManager = (ActivityManager) f5Var.getSystemService("activity");
            if (activityManager != null) {
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                activityManager.getMemoryInfo(memoryInfo);
                int i = (int) (memoryInfo.totalMem / 1048576);
                s91Var.b();
                t91.w((t91) s91Var.d, i);
                String str = Build.BRAND;
                s91Var.b();
                t91.s((t91) s91Var.d);
                String str2 = Build.MODEL;
                s91Var.b();
                t91.v((t91) s91Var.d);
                String str3 = Build.MANUFACTURER;
                s91Var.b();
                t91.u((t91) s91Var.d);
                String str4 = Build.FINGERPRINT;
                s91Var.b();
                t91.t((t91) s91Var.d);
            }
        } catch (RuntimeException e) {
            m51.i("BillingClient", "Runtime error while populating device info.", e);
        }
    }

    public final void A(td tdVar) {
        if (Thread.interrupted()) {
            return;
        }
        this.e.post(new m61(this, 13, tdVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a() {
        /*
            r5 = this;
            int r0 = defpackage.o61.a     // Catch: java.lang.Throwable -> Le
            q91 r0 = defpackage.q91.BROADCAST_ACTION_UNSPECIFIED     // Catch: java.lang.Throwable -> Le
            r1 = 12
            m91 r0 = defpackage.o61.c(r1, r0)     // Catch: java.lang.Throwable -> Le
            r5.n(r0)     // Catch: java.lang.Throwable -> Le
            goto L16
        Le:
            r0 = move-exception
            java.lang.String r1 = "BillingClient"
            java.lang.String r2 = "Unable to log."
            defpackage.m51.i(r1, r2, r0)
        L16:
            java.lang.Object r0 = r5.a
            monitor-enter(r0)
            a31 r1 = r5.f     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto L3a
            a31 r1 = r5.f     // Catch: java.lang.Throwable -> L32
            java.lang.Object r2 = r1.g     // Catch: java.lang.Throwable -> L32
            d41 r2 = (defpackage.d41) r2     // Catch: java.lang.Throwable -> L32
            java.lang.Object r3 = r1.d     // Catch: java.lang.Throwable -> L32
            android.content.Context r3 = (android.content.Context) r3     // Catch: java.lang.Throwable -> L32
            r2.b(r3)     // Catch: java.lang.Throwable -> L32
            java.lang.Object r1 = r1.h     // Catch: java.lang.Throwable -> L32
            d41 r1 = (defpackage.d41) r1     // Catch: java.lang.Throwable -> L32
            r1.b(r3)     // Catch: java.lang.Throwable -> L32
            goto L3a
        L32:
            r1 = move-exception
            java.lang.String r2 = "BillingClient"
            java.lang.String r3 = "There was an exception while shutting down broadcast manager while ending connection!"
            defpackage.m51.i(r2, r3, r1)     // Catch: java.lang.Throwable -> L61
        L3a:
            java.lang.String r1 = "BillingClient"
            java.lang.String r2 = "Unbinding from service."
            defpackage.m51.g(r1, r2)     // Catch: java.lang.Throwable -> L45
            r5.r()     // Catch: java.lang.Throwable -> L45
            goto L4d
        L45:
            r1 = move-exception
            java.lang.String r2 = "BillingClient"
            java.lang.String r3 = "There was an exception while unbinding from the service while ending connection!"
            defpackage.m51.i(r2, r3, r1)     // Catch: java.lang.Throwable -> L61
        L4d:
            r1 = 3
            monitor-enter(r5)     // Catch: java.lang.Throwable -> L65
            java.util.concurrent.ExecutorService r2 = r5.z     // Catch: java.lang.Throwable -> L5b
            if (r2 == 0) goto L59
            r2.shutdownNow()     // Catch: java.lang.Throwable -> L5b
            r2 = 0
            r5.z = r2     // Catch: java.lang.Throwable -> L5b
        L59:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L65
            goto L5d
        L5b:
            r2 = move-exception
            goto L63
        L5d:
            r5.p(r1)     // Catch: java.lang.Throwable -> L61
            goto L6e
        L61:
            r5 = move-exception
            goto L75
        L63:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L5b
            throw r2     // Catch: java.lang.Throwable -> L65
        L65:
            r2 = move-exception
            java.lang.String r3 = "BillingClient"
            java.lang.String r4 = "There was an exception while shutting down the executor service while ending connection!"
            defpackage.m51.i(r3, r4, r2)     // Catch: java.lang.Throwable -> L70
            goto L5d
        L6e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L61
            return
        L70:
            r2 = move-exception
            r5.p(r1)     // Catch: java.lang.Throwable -> L61
            throw r2     // Catch: java.lang.Throwable -> L61
        L75:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L61
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.md.a():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:144:0x06d8  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x06e3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v45, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v37, types: [android.os.Bundle, android.os.BaseBundle] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.td b(defpackage.f5 r30, final defpackage.od r31) {
        /*
            Method dump skipped, instructions count: 1914
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.md.b(f5, od):td");
    }

    public void c(dg0 dg0Var, qd qdVar) {
        Handler handler;
        k41 k41Var = new k41(this, qdVar, dg0Var, 1);
        m61 m61Var = new m61(this, 15, qdVar);
        if (Looper.myLooper() == null) {
            handler = this.e;
        } else {
            handler = new Handler(Looper.myLooper());
        }
        if (f(k41Var, 30000L, m61Var, handler, e()) == null) {
            td l = l();
            w(25, 7, l);
            f51 f51Var = i51.d;
            p51 p51Var = p51.g;
            rd rdVar = qdVar.a;
            l.getClass();
            if (l.a == 0) {
                p51Var.getClass();
                if (!p51Var.isEmpty()) {
                    rdVar.e = (kf0) p51Var.get(0);
                    return;
                }
                return;
            }
            Log.e("BillingManager", "Failed to query product details: " + l.c);
        }
    }

    public void d(i81 i81Var) {
        q(i81Var);
    }

    public final synchronized ExecutorService e() {
        try {
            if (this.z == null) {
                this.z = Executors.newFixedThreadPool(m51.a, new c51(this));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.z;
    }

    public final void g() {
        if (!TextUtils.isEmpty(null)) {
            return;
        }
        this.g.getPackageName();
    }

    public final c0 j(td tdVar, int i, String str, Exception exc) {
        m51.i("BillingClient", str, exc);
        try {
            m(o61.b(i, 7, tdVar, o61.a(exc), q91.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable th) {
            m51.i("BillingClient", "Unable to log.", th);
        }
        return new c0(tdVar.a, tdVar.c, new ArrayList(), new ArrayList());
    }

    public final td k() {
        m51.g("BillingClient", "Service connection is valid. No need to re-initialize.");
        h91 r = m91.r();
        r.b();
        m91.q((m91) r.d, 6);
        ga1 q = ha1.q();
        q.b();
        ha1.v((ha1) q.d);
        q.c(false);
        q.d();
        r.b();
        m91.v((m91) r.d, (ha1) q.a());
        n((m91) r.a());
        return v61.g;
    }

    public final td l() {
        int[] iArr = {0, 3};
        synchronized (this.a) {
            for (int i = 0; i < 2; i++) {
                if (this.b == iArr[i]) {
                    return v61.h;
                }
            }
            return v61.f;
        }
    }

    public final void m(g91 g91Var) {
        try {
            jp0 jp0Var = this.h;
            int i = this.l;
            jp0Var.getClass();
            try {
                s91 s91Var = (s91) ((t91) jp0Var.d).l();
                s91Var.b();
                t91.D((t91) s91Var.d, i);
                jp0Var.d = (t91) s91Var.a();
                jp0Var.m(g91Var);
            } catch (Throwable th) {
                m51.i("BillingLogger", "Unable to log.", th);
            }
        } catch (Throwable th2) {
            m51.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void n(m91 m91Var) {
        try {
            jp0 jp0Var = this.h;
            int i = this.l;
            jp0Var.getClass();
            try {
                s91 s91Var = (s91) ((t91) jp0Var.d).l();
                s91Var.b();
                t91.D((t91) s91Var.d, i);
                t91 t91Var = (t91) s91Var.a();
                jp0Var.d = t91Var;
                try {
                    jp0Var.u(m91Var, t91Var);
                } catch (Throwable th) {
                    m51.i("BillingLogger", "Unable to log.", th);
                }
            } catch (Throwable th2) {
                m51.i("BillingLogger", "Unable to log.", th2);
            }
        } catch (Throwable th3) {
            m51.i("BillingClient", "Unable to log.", th3);
        }
    }

    public final void o(int i, td tdVar) {
        try {
            int i2 = o61.a;
            f91 f91Var = (f91) o61.b(i, 6, tdVar, null, q91.BROADCAST_ACTION_UNSPECIFIED).l();
            ga1 q = ha1.q();
            q.c(false);
            q.d();
            f91Var.d(q);
            m((g91) f91Var.a());
        } catch (Throwable th) {
            m51.i("BillingClient", "Unable to log.", th);
        }
    }

    public final void p(int i) {
        String str;
        String str2;
        synchronized (this.a) {
            try {
                if (this.b == 3) {
                    return;
                }
                int i2 = this.b;
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            str = "CLOSED";
                        } else {
                            str = "CONNECTED";
                        }
                    } else {
                        str = "CONNECTING";
                    }
                } else {
                    str = "DISCONNECTED";
                }
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            str2 = "CLOSED";
                        } else {
                            str2 = "CONNECTED";
                        }
                    } else {
                        str2 = "CONNECTING";
                    }
                } else {
                    str2 = "DISCONNECTED";
                }
                m51.g("BillingClient", "Setting clientState from " + str + " to " + str2);
                this.b = i;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void q(i81 i81Var) {
        int i;
        td tdVar;
        td tdVar2;
        synchronized (this.a) {
            try {
                if (t()) {
                    tdVar = k();
                } else {
                    if (this.b == 1) {
                        m51.h("BillingClient", "Client is already in the process of connecting to billing service.");
                        tdVar2 = v61.c;
                        o(37, tdVar2);
                    } else if (this.b == 3) {
                        m51.h("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
                        tdVar2 = v61.h;
                        o(38, tdVar2);
                    } else {
                        p(1);
                        r();
                        m51.g("BillingClient", "Starting in-app billing setup.");
                        this.j = new j51(this, i81Var);
                        j51 j51Var = this.j;
                        synchronized (j51Var.d.a) {
                            b51 b51Var = j51Var.b;
                            b51Var.c = 0L;
                            b51Var.b = false;
                            b51Var.a();
                        }
                        Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
                        intent.setPackage("com.android.vending");
                        List<ResolveInfo> queryIntentServices = this.g.getPackageManager().queryIntentServices(intent, 0);
                        if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                            ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
                            i = 40;
                            if (serviceInfo != null) {
                                String str = serviceInfo.packageName;
                                String str2 = serviceInfo.name;
                                if (Objects.equals(str, "com.android.vending") && str2 != null) {
                                    ComponentName componentName = new ComponentName(str, str2);
                                    Intent intent2 = new Intent(intent);
                                    intent2.setComponent(componentName);
                                    intent2.putExtra("playBillingLibraryVersion", this.c);
                                    synchronized (this.a) {
                                        try {
                                            if (this.b == 2) {
                                                tdVar = k();
                                            } else if (this.b != 1) {
                                                m51.h("BillingClient", "Client state no longer CONNECTING, returning service disconnected.");
                                                tdVar2 = v61.h;
                                                o(105, tdVar2);
                                            } else {
                                                j51 j51Var2 = this.j;
                                                if (this.g.bindService(intent2, j51Var2, 1)) {
                                                    m51.g("BillingClient", "Service was bonded successfully.");
                                                    tdVar = null;
                                                } else {
                                                    m51.h("BillingClient", "Connection to Billing service is blocked.");
                                                    i = 39;
                                                }
                                            }
                                        } finally {
                                        }
                                    }
                                } else {
                                    m51.h("BillingClient", "The device doesn't have valid Play Store.");
                                }
                            } else {
                                m51.h("BillingClient", "The device doesn't have valid Play Store.");
                            }
                        } else {
                            i = 41;
                        }
                        p(0);
                        m51.g("BillingClient", "Billing service unavailable on device.");
                        td tdVar3 = v61.a;
                        o(i, tdVar3);
                        tdVar = tdVar3;
                    }
                    tdVar = tdVar2;
                }
            } finally {
            }
        }
        if (tdVar != null) {
            i81Var.z(tdVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void r() {
        synchronized (this.a) {
            if (this.j != null) {
                try {
                    this.g.unbindService(this.j);
                } catch (Throwable th) {
                    try {
                        m51.i("BillingClient", "There was an exception while unbinding service!", th);
                        this.i = null;
                        this.j = null;
                    } finally {
                        this.i = null;
                        this.j = null;
                    }
                }
            }
        }
    }

    public final boolean s() {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        hi0 hi0Var = this.B;
        if (hi0Var != null) {
            long q = hi0Var.q();
            long j = 30000;
            int i = 1;
            long j2 = 30000;
            while (i <= 3) {
                try {
                } catch (Exception e) {
                    if (e instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    m51.i("BillingClient", "Error during reconnection attempt: ", e);
                }
                if (Math.max(0L, j2) <= 0) {
                    m51.h("BillingClient", "No time remaining for reconnection attempt.");
                    return t();
                }
                m51.g("BillingClient", "Already connected or not opted into auto reconnection.");
                td tdVar = v61.g;
                timeUnit.getClass();
                int i2 = tdVar.a;
                if (i2 == 0) {
                    m51.g("BillingClient", "Reconnection succeeded with result: " + i2);
                    return t();
                }
                m51.h("BillingClient", "Reconnection failed with result: " + i2);
                j2 = j - (((hi0Var.q() - q) + 0) / 1000000);
                long j3 = j;
                long pow = ((long) Math.pow(2.0d, i - 1)) * 1000;
                if (j2 < pow) {
                    m51.h("BillingClient", "Reconnection failed due to timeout limit reached.");
                    return t();
                }
                if (i < 3 && pow > 0) {
                    try {
                        Thread.sleep(pow);
                        j2 = j3 - (((hi0Var.q() - q) + 0) / 1000000);
                    } catch (InterruptedException e2) {
                        Thread.currentThread().interrupt();
                        m51.i("BillingClient", "Error sleeping during reconnection attempt: ", e2);
                    }
                }
                i++;
                j = j3;
            }
            m51.h("BillingClient", "Max retries reached.");
            return t();
        }
        c.g("ticker");
        return false;
    }

    public final boolean t() {
        boolean z;
        synchronized (this.a) {
            try {
                z = false;
                if (this.b == 2 && this.i != null && this.j != null) {
                    z = true;
                }
            } finally {
            }
        }
        return z;
    }

    public final jp0 v(td tdVar, int i, String str, Exception exc) {
        try {
            m(o61.b(i, 9, tdVar, o61.a(exc), q91.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable th) {
            m51.i("BillingClient", "Unable to log.", th);
        }
        m51.i("BillingClient", str, exc);
        return new jp0(tdVar, null, 13, false);
    }

    public final void w(int i, int i2, td tdVar) {
        try {
            int i3 = o61.a;
            m(o61.b(i, i2, tdVar, null, q91.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable th) {
            m51.i("BillingClient", "Unable to log.", th);
        }
    }

    public final void x(int i, td tdVar, long j) {
        try {
            int i2 = o61.a;
            try {
                this.h.n(o61.b(i, 2, tdVar, null, q91.BROADCAST_ACTION_UNSPECIFIED), this.l, j);
            } catch (Throwable th) {
                m51.i("BillingClient", "Unable to log.", th);
            }
        } catch (Throwable th2) {
            m51.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void y(int i, td tdVar, long j, boolean z) {
        try {
            int i2 = o61.a;
            try {
                this.h.p(o61.b(i, 2, tdVar, null, q91.BROADCAST_ACTION_UNSPECIFIED), this.l, j, z);
            } catch (Throwable th) {
                m51.i("BillingClient", "Unable to log.", th);
            }
        } catch (Throwable th2) {
            m51.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void z(int i, td tdVar, String str, long j, boolean z) {
        try {
            int i2 = o61.a;
            try {
                this.h.p(o61.b(i, 2, tdVar, str, q91.BROADCAST_ACTION_UNSPECIFIED), this.l, j, z);
            } catch (Throwable th) {
                m51.i("BillingClient", "Unable to log.", th);
            }
        } catch (Throwable th2) {
            m51.i("BillingClient", "Unable to log.", th2);
        }
    }

    public md(g00 g00Var, f5 f5Var, ld ldVar) {
        long nextLong = new Random().nextLong();
        this.A = Long.valueOf(nextLong);
        this.B = z41.a;
        this.c = "8.3.0";
        String h = h();
        this.d = h;
        this.g = f5Var.getApplicationContext();
        s91 A = t91.A();
        A.b();
        t91.y((t91) A.d);
        if (h != null) {
            A.b();
            t91.z((t91) A.d, h);
        }
        String packageName = this.g.getPackageName();
        A.b();
        t91.r((t91) A.d, packageName);
        A.b();
        t91.E((t91) A.d, nextLong);
        A.b();
        t91.x((t91) A.d);
        int i = Build.VERSION.SDK_INT;
        A.b();
        t91.B((t91) A.d, i);
        A.c();
        u(A, f5Var);
        try {
            int i2 = this.g.getPackageManager().getPackageInfo(this.g.getPackageName(), 0).versionCode;
            A.b();
            t91.C((t91) A.d, i2);
        } catch (Throwable th) {
            m51.i("BillingClient", "Error getting app version code.", th);
        }
        this.h = new jp0(this.g, (t91) A.a());
        m51.h("BillingClient", "Billing client should have a valid listener but the provided is null.");
        this.f = new a31(this.g, (rd) null, this.h);
        this.x = g00Var;
        this.g.getPackageName();
    }
}
