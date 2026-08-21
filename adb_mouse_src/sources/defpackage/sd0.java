package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class sd0 extends qh0 {
    public RecyclerView a;
    public final ko0 b = new ko0(this);
    public md0 c;
    public md0 d;

    public static int b(View view, ws wsVar) {
        return ((wsVar.c(view) / 2) + wsVar.e(view)) - ((wsVar.l() / 2) + wsVar.k());
    }

    public static View c(oh0 oh0Var, ws wsVar) {
        int v = oh0Var.v();
        View view = null;
        if (v == 0) {
            return null;
        }
        int l = (wsVar.l() / 2) + wsVar.k();
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < v; i2++) {
            View u = oh0Var.u(i2);
            int abs = Math.abs(((wsVar.c(u) / 2) + wsVar.e(u)) - l);
            if (abs < i) {
                view = u;
                i = abs;
            }
        }
        return view;
    }

    public final int[] a(oh0 oh0Var, View view) {
        int[] iArr = new int[2];
        if (oh0Var.d()) {
            iArr[0] = b(view, d(oh0Var));
        } else {
            iArr[0] = 0;
        }
        if (oh0Var.e()) {
            iArr[1] = b(view, e(oh0Var));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    public final ws d(oh0 oh0Var) {
        md0 md0Var = this.d;
        if (md0Var == null || ((oh0) md0Var.b) != oh0Var) {
            this.d = new md0(oh0Var, 0);
        }
        return this.d;
    }

    public final ws e(oh0 oh0Var) {
        md0 md0Var = this.c;
        if (md0Var == null || ((oh0) md0Var.b) != oh0Var) {
            this.c = new md0(oh0Var, 1);
        }
        return this.c;
    }

    public final void f() {
        oh0 layoutManager;
        View view;
        RecyclerView recyclerView = this.a;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null) {
            if (layoutManager.e()) {
                view = c(layoutManager, e(layoutManager));
            } else if (layoutManager.d()) {
                view = c(layoutManager, d(layoutManager));
            } else {
                view = null;
            }
            if (view != null) {
                int[] a = a(layoutManager, view);
                int i = a[0];
                if (i == 0 && a[1] == 0) {
                    return;
                }
                this.a.b0(i, a[1], false);
            }
        }
    }
}
