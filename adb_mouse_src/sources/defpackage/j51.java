package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class j51 implements ServiceConnection {
    public final i81 a;
    public final b51 b;
    public final b51 c;
    public final /* synthetic */ md d;

    public j51(md mdVar, i81 i81Var) {
        this.d = mdVar;
        hi0 hi0Var = mdVar.B;
        this.b = new b51(hi0Var);
        this.c = new b51(hi0Var);
        this.a = i81Var;
    }

    public final Long a(boolean z) {
        md mdVar = this.d;
        try {
            if (z) {
                synchronized (mdVar.a) {
                    try {
                        b51 b51Var = this.b;
                        if (!b51Var.b) {
                            return null;
                        }
                        long q = b51Var.a.q();
                        if (b51Var.b) {
                            b51Var.b = false;
                            long j = (q - b51Var.d) + b51Var.c;
                            b51Var.c = j;
                            return Long.valueOf(j / 1000000);
                        }
                        throw new IllegalStateException("This stopwatch is already stopped.");
                    } finally {
                    }
                }
            }
            synchronized (mdVar.a) {
                try {
                    b51 b51Var2 = this.c;
                    if (!b51Var2.b) {
                        return null;
                    }
                    long q2 = b51Var2.a.q();
                    if (b51Var2.b) {
                        b51Var2.b = false;
                        long j2 = (q2 - b51Var2.d) + b51Var2.c;
                        b51Var2.c = j2;
                        return Long.valueOf(j2 / 1000000);
                    }
                    throw new IllegalStateException("This stopwatch is already stopped.");
                } finally {
                }
            }
        } catch (Throwable th) {
            m51.i("BillingClient", "Exception getting connection establishment duration.", th);
            return null;
        }
        m51.i("BillingClient", "Exception getting connection establishment duration.", th);
        return null;
    }

    public final void b(td tdVar, int i, String str, boolean z) {
        try {
            n91 r = o91.r();
            int i2 = tdVar.a;
            r.b();
            o91.q((o91) r.d, i2);
            String str2 = tdVar.c;
            r.b();
            o91.t((o91) r.d, str2);
            r.b();
            o91.w((o91) r.d, i);
            r.b();
            o91.u((o91) r.d);
            if (str != null) {
                r.b();
                o91.s((o91) r.d, str);
            }
            Long a = a(z);
            md mdVar = this.d;
            if (z) {
                ga1 q = ha1.q();
                q.c(false);
                q.d();
                q.b();
                ha1.u((ha1) q.d);
                if (a != null) {
                    long longValue = a.longValue();
                    q.b();
                    ha1.t((ha1) q.d, longValue);
                }
                f91 t = g91.t();
                t.c(r);
                t.b();
                g91.s((g91) t.d, 6);
                t.d(q);
                mdVar.m((g91) t.a());
                return;
            }
            da1 q2 = ea1.q();
            q2.b();
            ea1.r((ea1) q2.d, (o91) r.a());
            if (a != null) {
                long longValue2 = a.longValue();
                q2.b();
                ea1.s((ea1) q2.d, longValue2);
            }
            mdVar.h.r((ea1) q2.a());
        } catch (Throwable th) {
            m51.i("BillingClient", "Unable to log.", th);
        }
    }

    public final void c(td tdVar) {
        md mdVar = this.d;
        synchronized (mdVar.a) {
            try {
                if (mdVar.b == 3) {
                    return;
                }
                try {
                    this.a.z(tdVar);
                } catch (Throwable th) {
                    m51.i("BillingClient", "Exception while calling onBillingSetupFinished.", th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        boolean z;
        m51.h("BillingClient", "Billing service died.");
        try {
            md mdVar = this.d;
            synchronized (mdVar.a) {
                z = true;
                if (mdVar.b != 1) {
                    z = false;
                }
            }
            jp0 jp0Var = mdVar.h;
            if (z) {
                f91 t = g91.t();
                t.b();
                g91.s((g91) t.d, 6);
                n91 r = o91.r();
                r.b();
                o91.w((o91) r.d, 110);
                t.c(r);
                ga1 q = ha1.q();
                q.c(false);
                q.d();
                t.d(q);
                jp0Var.m((g91) t.a());
            } else {
                jp0Var.q(p91.q());
            }
        } catch (Throwable th) {
            m51.i("BillingClient", "Unable to log.", th);
        }
        md mdVar2 = this.d;
        synchronized (mdVar2.a) {
            if (mdVar2.b != 3 && mdVar2.b != 0) {
                mdVar2.p(0);
                mdVar2.r();
                try {
                    this.a.y();
                } catch (Throwable th2) {
                    m51.i("BillingClient", "Exception while calling onBillingServiceDisconnected.", th2);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v4, types: [r41] */
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        ?? u21Var;
        Handler handler;
        m51.g("BillingClient", "Billing service connected.");
        md mdVar = this.d;
        synchronized (mdVar.a) {
            try {
                if (mdVar.b == 3) {
                    return;
                }
                int i = q41.b;
                if (iBinder == null) {
                    u21Var = 0;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.android.vending.billing.IInAppBillingService");
                    if (queryLocalInterface instanceof r41) {
                        u21Var = (r41) queryLocalInterface;
                    } else {
                        u21Var = new u21(iBinder, "com.android.vending.billing.IInAppBillingService", 1);
                    }
                }
                mdVar.i = u21Var;
                Callable callable = new Callable() { // from class: g51
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        boolean z;
                        Bundle bundle;
                        r41 r41Var;
                        int i2;
                        String str;
                        td tdVar;
                        td tdVar2;
                        boolean z2;
                        int i3;
                        boolean z3;
                        boolean z4;
                        boolean z5;
                        boolean z6;
                        boolean z7;
                        boolean z8;
                        boolean z9;
                        boolean z10;
                        boolean z11;
                        boolean z12;
                        j51 j51Var = j51.this;
                        md mdVar2 = j51Var.d;
                        synchronized (mdVar2.a) {
                            try {
                                if (mdVar2.b == 3) {
                                    return null;
                                }
                                boolean z13 = true;
                                if (mdVar2.b == 1) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (!TextUtils.isEmpty(null)) {
                                    bundle = new Bundle();
                                    bundle.putString("accountName", null);
                                    m51.b(bundle, mdVar2.c, mdVar2.d, mdVar2.A.longValue());
                                } else {
                                    bundle = null;
                                }
                                synchronized (mdVar2.a) {
                                    r41Var = mdVar2.i;
                                }
                                md mdVar3 = j51Var.d;
                                if (r41Var == null) {
                                    mdVar3.p(0);
                                    td tdVar3 = v61.h;
                                    mdVar3.o(107, tdVar3);
                                    j51Var.c(tdVar3);
                                    return null;
                                }
                                String packageName = mdVar3.g.getPackageName();
                                int i4 = 27;
                                int i5 = 3;
                                int i6 = 27;
                                while (true) {
                                    if (i6 >= 3) {
                                        try {
                                            m51.g("BillingClient", "trying subs apiVersion: " + i6);
                                            if (bundle == null) {
                                                p41 p41Var = (p41) r41Var;
                                                Parcel a = p41Var.a();
                                                a.writeInt(i6);
                                                a.writeString(packageName);
                                                a.writeString("subs");
                                                Parcel b = p41Var.b(a, 1);
                                                int readInt = b.readInt();
                                                b.recycle();
                                                i5 = readInt;
                                            } else {
                                                i5 = ((p41) r41Var).c(i6, packageName, "subs", bundle);
                                            }
                                            if (i5 == 0) {
                                                m51.g("BillingClient", "highestLevelSupportedForSubs: " + i6);
                                                break;
                                            }
                                            i6--;
                                        } catch (Exception e) {
                                            m51.i("BillingClient", "Exception while checking if billing is supported; try to reconnect", e);
                                            boolean z14 = e instanceof DeadObjectException;
                                            if (z14) {
                                                i2 = 91;
                                            } else if (e instanceof RemoteException) {
                                                i2 = 90;
                                            } else if (e instanceof SecurityException) {
                                                i2 = 92;
                                            } else {
                                                i2 = 42;
                                            }
                                            if (qo0.g(i2, 42)) {
                                                str = o61.a(e);
                                            } else {
                                                str = null;
                                            }
                                            j51Var.d.p(0);
                                            if (z14) {
                                                tdVar = v61.h;
                                            } else {
                                                tdVar = v61.f;
                                            }
                                            j51Var.b(tdVar, i2, str, z);
                                            if (z14) {
                                                tdVar2 = v61.h;
                                            } else {
                                                tdVar2 = v61.f;
                                            }
                                            j51Var.c(tdVar2);
                                        }
                                    } else {
                                        i6 = 0;
                                        break;
                                    }
                                }
                                if (i6 >= 3) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                mdVar3.k = z2;
                                if (i6 < 3) {
                                    m51.g("BillingClient", "In-app billing API does not support subscription on this device.");
                                    i3 = 9;
                                } else {
                                    i3 = 1;
                                }
                                while (true) {
                                    if (i4 < 3) {
                                        break;
                                    }
                                    m51.g("BillingClient", "trying inapp apiVersion: " + i4);
                                    if (bundle == null) {
                                        p41 p41Var2 = (p41) r41Var;
                                        Parcel a2 = p41Var2.a();
                                        a2.writeInt(i4);
                                        a2.writeString(packageName);
                                        a2.writeString("inapp");
                                        Parcel b2 = p41Var2.b(a2, 1);
                                        int readInt2 = b2.readInt();
                                        b2.recycle();
                                        i5 = readInt2;
                                    } else {
                                        i5 = ((p41) r41Var).c(i4, packageName, "inapp", bundle);
                                    }
                                    if (i5 == 0) {
                                        mdVar3.l = i4;
                                        m51.g("BillingClient", "mHighestLevelSupportedForInApp: " + i4);
                                        break;
                                    }
                                    i4--;
                                }
                                int i7 = mdVar3.l;
                                mdVar3.l = i7;
                                if (i7 >= 26) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                mdVar3.w = z3;
                                if (i7 >= 24) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                mdVar3.v = z4;
                                if (i7 >= 21) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                mdVar3.u = z5;
                                if (i7 >= 20) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                mdVar3.t = z6;
                                if (i7 >= 19) {
                                    z7 = true;
                                } else {
                                    z7 = false;
                                }
                                mdVar3.s = z7;
                                if (i7 >= 17) {
                                    z8 = true;
                                } else {
                                    z8 = false;
                                }
                                mdVar3.r = z8;
                                if (i7 >= 16) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                mdVar3.q = z9;
                                if (i7 >= 15) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                mdVar3.p = z10;
                                if (i7 >= 14) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                mdVar3.o = z11;
                                if (i7 >= 9) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                mdVar3.n = z12;
                                if (i7 < 6) {
                                    z13 = false;
                                }
                                mdVar3.m = z13;
                                if (i7 < 3) {
                                    m51.h("BillingClient", "In-app billing API version 3 is not supported on this device.");
                                    i3 = 36;
                                }
                                md.i(mdVar3, i5);
                                if (i5 != 0) {
                                    td tdVar4 = v61.a;
                                    j51Var.b(tdVar4, i3, null, z);
                                    j51Var.c(tdVar4);
                                    return null;
                                }
                                try {
                                    Long a3 = j51Var.a(z);
                                    if (z) {
                                        h91 r = m91.r();
                                        r.b();
                                        m91.q((m91) r.d, 6);
                                        ga1 q = ha1.q();
                                        q.c(false);
                                        q.d();
                                        q.b();
                                        ha1.u((ha1) q.d);
                                        if (a3 != null) {
                                            long longValue = a3.longValue();
                                            q.b();
                                            ha1.t((ha1) q.d, longValue);
                                        }
                                        md mdVar4 = j51Var.d;
                                        r.b();
                                        m91.v((m91) r.d, (ha1) q.a());
                                        mdVar4.n((m91) r.a());
                                    } else {
                                        da1 q2 = ea1.q();
                                        n91 r2 = o91.r();
                                        r2.b();
                                        o91.q((o91) r2.d, 0);
                                        r2.b();
                                        o91.u((o91) r2.d);
                                        q2.b();
                                        ea1.r((ea1) q2.d, (o91) r2.a());
                                        if (a3 != null) {
                                            long longValue2 = a3.longValue();
                                            q2.b();
                                            ea1.s((ea1) q2.d, longValue2);
                                        }
                                        j51Var.d.h.r((ea1) q2.a());
                                    }
                                } catch (Throwable th) {
                                    m51.i("BillingClient", "Unable to log.", th);
                                }
                                j51Var.c(v61.g);
                                return null;
                            } finally {
                            }
                        }
                    }
                };
                l9 l9Var = new l9(21, this);
                if (Looper.myLooper() == null) {
                    handler = mdVar.e;
                } else {
                    handler = new Handler(Looper.myLooper());
                }
                if (md.f(callable, 30000L, l9Var, handler, mdVar.e()) == null) {
                    td l = mdVar.l();
                    mdVar.o(25, l);
                    c(l);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        boolean z;
        m51.h("BillingClient", "Billing service disconnected.");
        try {
            md mdVar = this.d;
            synchronized (mdVar.a) {
                z = true;
                if (mdVar.b != 1) {
                    z = false;
                }
            }
            jp0 jp0Var = mdVar.h;
            if (z) {
                f91 t = g91.t();
                t.b();
                g91.s((g91) t.d, 6);
                n91 r = o91.r();
                r.b();
                o91.w((o91) r.d, 109);
                t.c(r);
                ga1 q = ha1.q();
                q.c(false);
                q.d();
                t.d(q);
                jp0Var.m((g91) t.a());
            } else {
                jp0Var.s(fa1.q());
            }
        } catch (Throwable th) {
            m51.i("BillingClient", "Unable to log.", th);
        }
        md mdVar2 = this.d;
        synchronized (mdVar2.a) {
            try {
                b51 b51Var = this.c;
                b51Var.c = 0L;
                b51Var.b = false;
                b51Var.a();
                if (mdVar2.b != 3) {
                    mdVar2.p(0);
                    try {
                        this.a.y();
                    } catch (Throwable th2) {
                        m51.i("BillingClient", "Exception while calling onBillingServiceDisconnected.", th2);
                    }
                }
            } finally {
            }
        }
    }
}
