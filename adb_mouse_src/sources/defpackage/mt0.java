package defpackage;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class mt0 implements ma0 {
    public w90 c;
    public z90 d;
    public final /* synthetic */ Toolbar e;

    public mt0(Toolbar toolbar) {
        this.e = toolbar;
    }

    @Override // defpackage.ma0
    public final boolean c(z90 z90Var) {
        Toolbar toolbar = this.e;
        KeyEvent.Callback callback = toolbar.k;
        if (callback instanceof ci) {
            ((ba0) ((ci) callback)).c.onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.k);
        toolbar.removeView(toolbar.j);
        toolbar.k = null;
        ArrayList arrayList = toolbar.G;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.d = null;
        toolbar.requestLayout();
        z90Var.C = false;
        z90Var.n.p(false);
        toolbar.t();
        return true;
    }

    @Override // defpackage.ma0
    public final boolean f(z90 z90Var) {
        Toolbar toolbar = this.e;
        toolbar.c();
        ViewParent parent = toolbar.j.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.j);
            }
            toolbar.addView(toolbar.j);
        }
        View actionView = z90Var.getActionView();
        toolbar.k = actionView;
        this.d = z90Var;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.k);
            }
            nt0 h = Toolbar.h();
            h.a = (toolbar.p & 112) | 8388611;
            h.b = 2;
            toolbar.k.setLayoutParams(h);
            toolbar.addView(toolbar.k);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((nt0) childAt.getLayoutParams()).b != 2 && childAt != toolbar.c) {
                toolbar.removeViewAt(childCount);
                toolbar.G.add(childAt);
            }
        }
        toolbar.requestLayout();
        z90Var.C = true;
        z90Var.n.p(false);
        KeyEvent.Callback callback = toolbar.k;
        if (callback instanceof ci) {
            ((ba0) ((ci) callback)).c.onActionViewExpanded();
        }
        toolbar.t();
        return true;
    }

    @Override // defpackage.ma0
    public final void g() {
        if (this.d != null) {
            w90 w90Var = this.c;
            if (w90Var != null) {
                int size = w90Var.f.size();
                for (int i = 0; i < size; i++) {
                    if (this.c.getItem(i) == this.d) {
                        return;
                    }
                }
            }
            c(this.d);
        }
    }

    @Override // defpackage.ma0
    public final void i(Context context, w90 w90Var) {
        z90 z90Var;
        w90 w90Var2 = this.c;
        if (w90Var2 != null && (z90Var = this.d) != null) {
            w90Var2.d(z90Var);
        }
        this.c = w90Var;
    }

    @Override // defpackage.ma0
    public final boolean j(gq0 gq0Var) {
        return false;
    }

    @Override // defpackage.ma0
    public final boolean k() {
        return false;
    }

    @Override // defpackage.ma0
    public final void a(w90 w90Var, boolean z) {
    }
}
