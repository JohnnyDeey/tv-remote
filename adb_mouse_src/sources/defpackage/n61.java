package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class n61 extends md {
    public final f5 C;
    public volatile int D;
    public volatile v41 E;
    public volatile l61 F;
    public volatile ScheduledExecutorService G;

    public n61(g00 g00Var, f5 f5Var, ld ldVar) {
        super(g00Var, f5Var, ldVar);
        this.D = 0;
        this.C = f5Var;
    }

    public final synchronized boolean B() {
        if (this.D == 2 && this.E != null) {
            if (this.F != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [pa1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [ua1, java.lang.Object] */
    public final u61 C(int i) {
        if (!B()) {
            m51.h("BillingClientTesting", "Billing Override Service is not ready.");
            D(94, 28, v61.a("Billing Override Service connection is disconnected.", -1));
            return new s61(0);
        }
        f61 f61Var = new f61(i, this);
        ?? obj = new Object();
        obj.c = new Object();
        sa1 sa1Var = new sa1(obj);
        obj.b = sa1Var;
        obj.a = f61.class;
        try {
            f61Var.g(obj);
            obj.a = "billingOverrideService.getBillingOverride";
            return sa1Var;
        } catch (Exception e) {
            c81 c81Var = new c81(e);
            hi0 hi0Var = na1.h;
            ra1 ra1Var = sa1Var.d;
            if (hi0Var.u(ra1Var, null, c81Var)) {
                na1.c(ra1Var);
            }
            return sa1Var;
        }
    }

    public final void D(int i, int i2, td tdVar) {
        int i3 = o61.a;
        g91 b = o61.b(i, i2, tdVar, null, q91.BROADCAST_ACTION_UNSPECIFIED);
        Objects.requireNonNull(b, "ApiFailure should not be null");
        this.h.m(b);
    }

    public final void E(int i) {
        int i2 = o61.a;
        m91 c = o61.c(i, q91.BROADCAST_ACTION_UNSPECIFIED);
        Objects.requireNonNull(c, "ApiSuccess should not be null");
        jp0 jp0Var = this.h;
        jp0Var.getClass();
        try {
            jp0Var.u(c, (t91) jp0Var.d);
        } catch (Throwable th) {
            m51.i("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // defpackage.md
    public final void a() {
        synchronized (this) {
            E(27);
            try {
                try {
                    if (this.F != null && this.E != null) {
                        m51.g("BillingClientTesting", "Unbinding from Billing Override Service.");
                        this.C.unbindService(this.F);
                        this.F = new l61(this);
                    }
                    this.E = null;
                    if (this.G != null) {
                        this.G.shutdownNow();
                        this.G = null;
                    }
                } catch (RuntimeException e) {
                    m51.i("BillingClientTesting", "There was an exception while ending Billing Override Service connection!", e);
                }
                this.D = 3;
            } catch (Throwable th) {
                this.D = 3;
                throw th;
            }
        }
        super.a();
    }

    @Override // defpackage.md
    public final td b(f5 f5Var, od odVar) {
        int i = 0;
        try {
            i = ((Integer) C(2).get(28500L, TimeUnit.MILLISECONDS)).intValue();
        } catch (TimeoutException e) {
            D(102, 28, v61.p);
            m51.i("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", e);
        } catch (Exception e2) {
            if (e2 instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            D(95, 28, v61.p);
            m51.i("BillingClientTesting", "An error occurred while retrieving billing override.", e2);
        }
        if (i > 0) {
            td a = v61.a("Billing override value was set by a license tester.", i);
            D(93, 2, a);
            A(a);
            return a;
        }
        try {
            return super.b(f5Var, odVar);
        } catch (Exception e3) {
            td tdVar = v61.f;
            D(103, 2, tdVar);
            m51.i("BillingClientTesting", "An internal error occurred.", e3);
            return tdVar;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:24:0x0064
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
        */
    /* JADX WARN: Type inference failed for: r1v7, types: [x61, java.lang.Object] */
    @Override // defpackage.md
    public final void c(defpackage.dg0 r8, defpackage.qd r9) {
        /*
            r7 = this;
            rw r2 = new rw
            r0 = 2
            r2.<init>(r0, r9)
            gj0 r3 = new gj0
            r3.<init>(r7, r8, r9)
            r8 = 7
            u61 r8 = r7.C(r8)
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MILLISECONDS
            monitor-enter(r7)
            java.util.concurrent.ScheduledExecutorService r0 = r7.G     // Catch: java.lang.Throwable -> L5f
            if (r0 != 0) goto L22
            java.util.concurrent.ScheduledExecutorService r0 = java.util.concurrent.Executors.newSingleThreadScheduledExecutor()     // Catch: java.lang.Throwable -> L1e
            r7.G = r0     // Catch: java.lang.Throwable -> L1e
            goto L22
        L1e:
            r0 = move-exception
            r8 = r0
            r1 = r7
            goto L62
        L22:
            java.util.concurrent.ScheduledExecutorService r0 = r7.G     // Catch: java.lang.Throwable -> L5f
            monitor-exit(r7)
            boolean r1 = r8.isDone()
            if (r1 == 0) goto L2c
            goto L48
        L2c:
            x61 r1 = new x61
            r1.<init>()
            r1.j = r8
            l9 r4 = new l9
            r4.<init>()
            r4.d = r1
            r5 = 28500(0x6f54, double:1.4081E-319)
            java.util.concurrent.ScheduledFuture r9 = r0.schedule(r4, r5, r9)
            r1.k = r9
            j61 r9 = defpackage.j61.c
            r8.a(r4, r9)
            r8 = r1
        L48:
            b8 r0 = new b8
            r4 = 28
            r5 = 0
            r1 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            java.util.concurrent.ExecutorService r7 = r1.e()
            m61 r9 = new m61
            r1 = 0
            r9.<init>(r8, r1, r0)
            r8.a(r9, r7)
            return
        L5f:
            r0 = move-exception
            r1 = r7
        L61:
            r8 = r0
        L62:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L64
            throw r8
        L64:
            r0 = move-exception
            goto L61
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n61.c(dg0, qd):void");
    }

    @Override // defpackage.md
    public final void d(i81 i81Var) {
        synchronized (this) {
            if (B()) {
                m51.g("BillingClientTesting", "Billing Override Service connection is valid. No need to re-initialize.");
                E(26);
            } else {
                int i = 1;
                if (this.D == 1) {
                    m51.h("BillingClientTesting", "Client is already in the process of connecting to Billing Override Service.");
                } else if (this.D == 3) {
                    m51.h("BillingClientTesting", "Billing Override Service Client was already closed and can't be reused. Please create another instance.");
                    D(38, 26, v61.a("Billing Override Service connection is disconnected.", -1));
                } else {
                    this.D = 1;
                    m51.g("BillingClientTesting", "Starting Billing Override Service setup.");
                    this.F = new l61(this);
                    Intent intent = new Intent("com.google.android.apps.play.billingtestcompanion.BillingOverrideService.BIND");
                    intent.setPackage("com.google.android.apps.play.billingtestcompanion");
                    f5 f5Var = this.C;
                    List<ResolveInfo> queryIntentServices = f5Var.getPackageManager().queryIntentServices(intent, 0);
                    if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                        ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
                        if (serviceInfo != null) {
                            String str = serviceInfo.packageName;
                            String str2 = serviceInfo.name;
                            if (Objects.equals(str, "com.google.android.apps.play.billingtestcompanion") && str2 != null) {
                                ComponentName componentName = new ComponentName(str, str2);
                                Intent intent2 = new Intent(intent);
                                intent2.setComponent(componentName);
                                if (f5Var.bindService(intent2, this.F, 1)) {
                                    m51.g("BillingClientTesting", "Billing Override Service was bonded successfully.");
                                } else {
                                    m51.h("BillingClientTesting", "Connection to Billing Override Service is blocked.");
                                }
                            } else {
                                m51.h("BillingClientTesting", "The device doesn't have valid Play Billing Lab.");
                            }
                            i = 39;
                        }
                    } else {
                        i = 41;
                    }
                    this.D = 0;
                    m51.g("BillingClientTesting", "Billing Override Service unavailable on device.");
                    D(i, 26, v61.a("Billing Override Service unavailable on device.", 2));
                }
            }
        }
        q(i81Var);
    }

    public n61(g00 g00Var, f5 f5Var, rd rdVar, ld ldVar) {
        super(g00Var, f5Var, rdVar, ldVar);
        this.D = 0;
        this.C = f5Var;
    }
}
