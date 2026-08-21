package defpackage;

import android.app.Application;
import android.graphics.Typeface;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class m61 implements Runnable {
    public final /* synthetic */ int c;
    public Object d;
    public final Object e;

    public m61(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z) {
        this.c = 10;
        this.e = swipeDismissBehavior;
        this.d = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable c;
        u90 u90Var;
        m10 m10Var;
        m10 ta1Var;
        int i = 0;
        switch (this.c) {
            case 0:
                b8 b8Var = (b8) this.e;
                u61 u61Var = (u61) this.d;
                if ((u61Var instanceof e61) && (c = ((e61) u61Var).c()) != null) {
                    b8Var.X(c);
                    return;
                }
                try {
                    if (!u61Var.isDone()) {
                        throw new IllegalStateException(gi0.r("Future was expected to be done: %s", u61Var));
                    }
                    while (true) {
                        try {
                            Object obj = u61Var.get();
                            if (i != 0) {
                                Thread.currentThread().interrupt();
                            }
                            Integer num = (Integer) obj;
                            int intValue = num.intValue();
                            n61 n61Var = (n61) b8Var.f;
                            if (intValue > 0) {
                                int intValue2 = num.intValue();
                                n61Var.getClass();
                                td a = v61.a("Billing override value was set by a license tester.", intValue2);
                                n61Var.D(93, 7, a);
                                ((rw) b8Var.d).accept(a);
                                return;
                            }
                            ((gj0) b8Var.e).run();
                            return;
                        } catch (InterruptedException unused) {
                            i = 1;
                        } catch (Throwable th) {
                            if (i != 0) {
                                Thread.currentThread().interrupt();
                            }
                            throw th;
                        }
                    }
                } catch (ExecutionException e) {
                    b8Var.X(e.getCause());
                    return;
                } catch (Throwable th2) {
                    b8Var.X(th2);
                    return;
                }
                break;
            case 1:
                o2 o2Var = (o2) this.d;
                r2 r2Var = (r2) this.e;
                w90 w90Var = r2Var.e;
                if (w90Var != null && (u90Var = w90Var.e) != null) {
                    u90Var.k(w90Var);
                }
                View view = (View) r2Var.j;
                if (view != null && view.getWindowToken() != null) {
                    if (!o2Var.b()) {
                        if (o2Var.e != null) {
                            o2Var.d(0, 0, false, false);
                        }
                    }
                    r2Var.u = o2Var;
                }
                r2Var.w = null;
                return;
            case 2:
                ((y2) this.d).c = this.e;
                return;
            case 3:
                ((Application) this.d).unregisterActivityLifecycleCallbacks((y2) this.e);
                return;
            case 4:
                Object obj2 = this.e;
                Object obj3 = this.d;
                try {
                    Method method = z2.d;
                    if (method != null) {
                        method.invoke(obj3, obj2, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        z2.e.invoke(obj3, obj2, Boolean.FALSE);
                    }
                    return;
                } catch (RuntimeException e2) {
                    if (e2.getClass() == RuntimeException.class && e2.getMessage() != null && e2.getMessage().startsWith("Unable to stop")) {
                        throw e2;
                    }
                    return;
                } catch (Throwable th3) {
                    Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th3);
                    return;
                }
            case 5:
                sb0 sb0Var = (sb0) this.d;
                Typeface typeface = (Typeface) this.e;
                wg0 wg0Var = (wg0) sb0Var.c;
                if (wg0Var != null) {
                    wg0Var.w(typeface);
                    return;
                }
                return;
            case 6:
                ArrayList arrayList = (ArrayList) this.d;
                xo0 xo0Var = (xo0) this.e;
                if (arrayList.contains(xo0Var)) {
                    arrayList.remove(xo0Var);
                    qo0.a(xo0Var.c.G, xo0Var.a);
                    return;
                }
                return;
            case 7:
                ((ff) this.d).z((y00) this.e);
                return;
            case 8:
                v50 v50Var = (v50) this.e;
                gl glVar = v50Var.f;
                while (true) {
                    try {
                        ((Runnable) this.d).run();
                    } catch (Throwable th4) {
                        f20.J(st.c, th4);
                    }
                    Runnable e3 = v50Var.e();
                    if (e3 != null) {
                        this.d = e3;
                        i++;
                        if (i >= 16 && glVar.c(v50Var)) {
                            glVar.b(v50Var, this);
                            return;
                        }
                    } else {
                        return;
                    }
                }
                break;
            case 9:
                ((rw) this.d).accept(this.e);
                return;
            case 10:
                ty0 ty0Var = ((SwipeDismissBehavior) this.e).a;
                if (ty0Var != null && ty0Var.f()) {
                    ((View) this.d).postOnAnimation(this);
                    return;
                }
                return;
            case 11:
                jj jjVar = (jj) this.d;
                a31 a31Var = (a31) this.e;
                z4 z4Var = (z4) a31Var.d;
                y21 y21Var = (y21) ((e00) a31Var.h).j.get((c5) a31Var.e);
                if (y21Var != null) {
                    if (jjVar.d == 0) {
                        a31Var.c = true;
                        if (z4Var.k()) {
                            if (a31Var.c && (m10Var = (m10) a31Var.f) != null) {
                                z4Var.l(m10Var, (Set) a31Var.g);
                                return;
                            }
                            return;
                        }
                        try {
                            z4Var.l(null, z4Var.b());
                            return;
                        } catch (SecurityException e4) {
                            Log.e("GoogleApiManager", "Failed to get service from broker. ", e4);
                            z4Var.c("Failed to get service from broker.");
                            y21Var.o(new jj(10, null, null), null);
                            return;
                        }
                    }
                    y21Var.o(jjVar, null);
                    return;
                }
                return;
            case 12:
                i31 i31Var = (i31) this.e;
                t31 t31Var = (t31) this.d;
                jj jjVar2 = t31Var.d;
                if (jjVar2.d == 0) {
                    a41 a41Var = t31Var.e;
                    wv0.p(a41Var);
                    jj jjVar3 = a41Var.e;
                    if (jjVar3.d == 0) {
                        a31 a31Var2 = i31Var.h;
                        IBinder iBinder = a41Var.d;
                        if (iBinder == null) {
                            ta1Var = null;
                        } else {
                            int i2 = d2.b;
                            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                            if (queryLocalInterface instanceof m10) {
                                ta1Var = (m10) queryLocalInterface;
                            } else {
                                ta1Var = new ta1(iBinder);
                            }
                        }
                        Set set = i31Var.e;
                        a31Var2.getClass();
                        if (ta1Var != null && set != null) {
                            a31Var2.f = ta1Var;
                            a31Var2.g = set;
                            if (a31Var2.c) {
                                ((z4) a31Var2.d).l(ta1Var, set);
                            }
                        } else {
                            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                            a31Var2.a(new jj(4, null, null));
                        }
                    } else {
                        Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(jjVar3)), new Exception());
                        i31Var.h.a(jjVar3);
                        i31Var.g.n();
                        return;
                    }
                } else {
                    i31Var.h.a(jjVar2);
                }
                i31Var.g.n();
                return;
            case 13:
                md mdVar = (md) this.d;
                td tdVar = (td) this.e;
                rd rdVar = (rd) mdVar.f.e;
                a31 a31Var3 = mdVar.f;
                if (rdVar != null) {
                    ((rd) a31Var3.e).B(tdVar, null);
                    return;
                } else {
                    m51.h("BillingClient", "No valid listener is set in BroadcastManager");
                    return;
                }
            case 14:
                Future future = (Future) this.d;
                if (!future.isDone() && !future.isCancelled()) {
                    Runnable runnable = (Runnable) this.e;
                    future.cancel(true);
                    m51.h("BillingClient", "Async task is taking too long, cancel it!");
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
            case 15:
                md mdVar2 = (md) this.d;
                qd qdVar = (qd) this.e;
                td tdVar2 = v61.i;
                mdVar2.w(24, 7, tdVar2);
                f51 f51Var = i51.d;
                p51 p51Var = p51.g;
                rd rdVar2 = qdVar.a;
                tdVar2.getClass();
                if (tdVar2.a == 0) {
                    p51Var.getClass();
                    if (!p51Var.isEmpty()) {
                        rdVar2.e = (kf0) p51Var.get(0);
                        return;
                    }
                    return;
                }
                Log.e("BillingManager", "Failed to query product details: " + tdVar2.c);
                return;
            case 16:
                md mdVar3 = (md) this.d;
                qd qdVar2 = (qd) this.e;
                td tdVar3 = v61.i;
                mdVar3.w(24, 9, tdVar3);
                f51 f51Var2 = i51.d;
                qdVar2.a(tdVar3, p51.g);
                return;
            default:
                synchronized (((k91) this.e).b) {
                    jp0 jp0Var = ((k91) this.e).c;
                    ((Map) ((jp0) jp0Var.e).e).remove((zq0) jp0Var.d);
                }
                return;
        }
    }

    public String toString() {
        switch (this.c) {
            case 0:
                b8 b8Var = new b8(m61.class.getSimpleName());
                b8 b8Var2 = (b8) this.e;
                jp0 jp0Var = new jp0(11, false);
                ((jp0) b8Var.f).e = jp0Var;
                b8Var.f = jp0Var;
                jp0Var.d = b8Var2;
                return b8Var.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ m61(Object obj, Object obj2, int i, boolean z) {
        this.c = i;
        this.e = obj;
        this.d = obj2;
    }

    public m61(no noVar, ArrayList arrayList, xo0 xo0Var) {
        this.c = 6;
        this.d = arrayList;
        this.e = xo0Var;
    }

    public /* synthetic */ m61(Object obj, int i, Object obj2) {
        this.c = i;
        this.d = obj;
        this.e = obj2;
    }
}
