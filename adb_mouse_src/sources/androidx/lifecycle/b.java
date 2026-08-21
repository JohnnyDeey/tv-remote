package androidx.lifecycle;

import android.os.Looper;
import android.util.Log;
import android.view.View;
import defpackage.a70;
import defpackage.c;
import defpackage.f8;
import defpackage.i81;
import defpackage.kq;
import defpackage.pl0;
import defpackage.ql0;
import defpackage.qo0;
import defpackage.s50;
import defpackage.sl0;
import defpackage.vx;
import java.util.Map;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public class b {
    public static final Object j = new Object();
    public final Object a = new Object();
    public final sl0 b = new sl0();
    public int c = 0;
    public boolean d;
    public volatile Object e;
    public volatile Object f;
    public int g;
    public boolean h;
    public boolean i;

    public b() {
        Object obj = j;
        this.f = obj;
        this.e = obj;
        this.g = -1;
    }

    public static void a(String str) {
        ((f8) f8.x().a).getClass();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        c.o(qo0.r("Cannot invoke ", str, " on a background thread"));
    }

    public final void b(a70 a70Var) {
        if (a70Var.d) {
            if (!a70Var.e()) {
                a70Var.b(false);
                return;
            }
            int i = a70Var.e;
            int i2 = this.g;
            if (i < i2) {
                a70Var.e = i2;
                i81 i81Var = a70Var.c;
                Object obj = this.e;
                i81Var.getClass();
                s50 s50Var = (s50) obj;
                kq kqVar = (kq) i81Var.d;
                if (s50Var != null && kqVar.b0) {
                    View I = kqVar.I();
                    if (I.getParent() == null) {
                        if (kqVar.f0 != null) {
                            if (vx.F(3)) {
                                Log.d("FragmentManager", "DialogFragment " + i81Var + " setting the content view on " + kqVar.f0);
                            }
                            kqVar.f0.setContentView(I);
                            return;
                        }
                        return;
                    }
                    c.o("DialogFragment can not be attached to a container view");
                }
            }
        }
    }

    public final void c(a70 a70Var) {
        if (this.h) {
            this.i = true;
            return;
        }
        this.h = true;
        do {
            this.i = false;
            if (a70Var != null) {
                b(a70Var);
                a70Var = null;
            } else {
                sl0 sl0Var = this.b;
                sl0Var.getClass();
                ql0 ql0Var = new ql0(sl0Var);
                sl0Var.e.put(ql0Var, Boolean.FALSE);
                while (ql0Var.hasNext()) {
                    b((a70) ((Map.Entry) ql0Var.next()).getValue());
                    if (this.i) {
                        break;
                    }
                }
            }
        } while (this.i);
        this.h = false;
    }

    public final void d(i81 i81Var) {
        Object obj;
        a("observeForever");
        a70 a70Var = new a70(this, i81Var);
        sl0 sl0Var = this.b;
        pl0 b = sl0Var.b(i81Var);
        if (b != null) {
            obj = b.d;
        } else {
            pl0 pl0Var = new pl0(i81Var, a70Var);
            sl0Var.f++;
            pl0 pl0Var2 = sl0Var.d;
            if (pl0Var2 == null) {
                sl0Var.c = pl0Var;
                sl0Var.d = pl0Var;
            } else {
                pl0Var2.e = pl0Var;
                pl0Var.f = pl0Var2;
                sl0Var.d = pl0Var;
            }
            obj = null;
        }
        a70 a70Var2 = (a70) obj;
        if (!(a70Var2 instanceof LiveData$LifecycleBoundObserver)) {
            if (a70Var2 != null) {
                return;
            }
            a70Var.b(true);
            return;
        }
        c.k("Cannot add the same observer with different lifecycles");
    }
}
