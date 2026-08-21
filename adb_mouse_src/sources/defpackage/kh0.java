package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public abstract class kh0 {
    public fh0 a;
    public ArrayList b;
    public long c;
    public long d;
    public long e;
    public long f;

    public static void b(di0 di0Var) {
        RecyclerView recyclerView;
        int i = di0Var.j;
        if (!di0Var.f() && (i & 4) == 0 && (recyclerView = di0Var.r) != null) {
            recyclerView.F(di0Var);
        }
    }

    public abstract boolean a(di0 di0Var, di0 di0Var2, yb0 yb0Var, yb0 yb0Var2);

    public final void c(di0 di0Var) {
        fh0 fh0Var = this.a;
        if (fh0Var != null) {
            RecyclerView recyclerView = fh0Var.a;
            boolean z = true;
            di0Var.n(true);
            View view = di0Var.a;
            if (di0Var.h != null && di0Var.i == null) {
                di0Var.h = null;
            }
            di0Var.i = null;
            if ((di0Var.j & 16) == 0) {
                uh0 uh0Var = recyclerView.d;
                recyclerView.c0();
                b8 b8Var = recyclerView.g;
                xg xgVar = (xg) b8Var.e;
                fh0 fh0Var2 = (fh0) b8Var.d;
                int indexOfChild = fh0Var2.a.indexOfChild(view);
                if (indexOfChild == -1) {
                    b8Var.U(view);
                } else if (xgVar.d(indexOfChild)) {
                    xgVar.f(indexOfChild);
                    b8Var.U(view);
                    fh0Var2.h(indexOfChild);
                } else {
                    z = false;
                }
                if (z) {
                    di0 I = RecyclerView.I(view);
                    uh0Var.k(I);
                    uh0Var.h(I);
                }
                recyclerView.d0(!z);
                if (!z && di0Var.j()) {
                    recyclerView.removeDetachedView(view, false);
                }
            }
        }
    }

    public abstract void d(di0 di0Var);

    public abstract void e();

    public abstract boolean f();
}
