package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import svarzee.android.apps.adb_mouse.R;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class np0 extends ea0 implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public final Context d;
    public final w90 e;
    public final t90 f;
    public final boolean g;
    public final int h;
    public final int i;
    public final ka0 j;
    public PopupWindow.OnDismissListener m;
    public View n;
    public View o;
    public la0 p;
    public ViewTreeObserver q;
    public boolean r;
    public boolean s;
    public int t;
    public boolean v;
    public final y6 k = new y6(3, this);
    public final of l = new of(5, this);
    public int u = 0;

    /* JADX WARN: Type inference failed for: r7v1, types: [ka0, t60] */
    public np0(Context context, w90 w90Var, View view, int i, boolean z) {
        this.d = context;
        this.e = w90Var;
        this.g = z;
        this.f = new t90(w90Var, LayoutInflater.from(context), z, R.layout.abc_popup_menu_item_layout);
        this.i = i;
        Resources resources = context.getResources();
        this.h = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.n = view;
        this.j = new t60(context, null, i, 0);
        w90Var.b(this, context);
    }

    @Override // defpackage.ma0
    public final void a(w90 w90Var, boolean z) {
        if (w90Var == this.e) {
            dismiss();
            la0 la0Var = this.p;
            if (la0Var != null) {
                la0Var.a(w90Var, z);
            }
        }
    }

    @Override // defpackage.bo0
    public final boolean b() {
        if (!this.r && this.j.B.isShowing()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.bo0
    public final void d() {
        View view;
        boolean z;
        Rect rect;
        if (b()) {
            return;
        }
        if (!this.r && (view = this.n) != null) {
            this.o = view;
            ka0 ka0Var = this.j;
            q6 q6Var = ka0Var.B;
            q6 q6Var2 = ka0Var.B;
            q6Var.setOnDismissListener(this);
            ka0Var.r = this;
            ka0Var.A = true;
            q6Var2.setFocusable(true);
            View view2 = this.o;
            if (this.q == null) {
                z = true;
            } else {
                z = false;
            }
            ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
            this.q = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.k);
            }
            view2.addOnAttachStateChangeListener(this.l);
            ka0Var.q = view2;
            ka0Var.n = this.u;
            boolean z2 = this.s;
            Context context = this.d;
            t90 t90Var = this.f;
            if (!z2) {
                this.t = ea0.m(t90Var, context, this.h);
                this.s = true;
            }
            ka0Var.r(this.t);
            q6Var2.setInputMethodMode(2);
            Rect rect2 = this.c;
            if (rect2 != null) {
                rect = new Rect(rect2);
            } else {
                rect = null;
            }
            ka0Var.z = rect;
            ka0Var.d();
            wr wrVar = ka0Var.e;
            wrVar.setOnKeyListener(this);
            if (this.v) {
                w90 w90Var = this.e;
                if (w90Var.m != null) {
                    FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) wrVar, false);
                    TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                    if (textView != null) {
                        textView.setText(w90Var.m);
                    }
                    frameLayout.setEnabled(false);
                    wrVar.addHeaderView(frameLayout, null, false);
                }
            }
            ka0Var.q(t90Var);
            ka0Var.d();
            return;
        }
        c.o("StandardMenuPopup cannot be used without an anchor");
    }

    @Override // defpackage.bo0
    public final void dismiss() {
        if (b()) {
            this.j.dismiss();
        }
    }

    @Override // defpackage.ma0
    public final void e(la0 la0Var) {
        this.p = la0Var;
    }

    @Override // defpackage.ma0
    public final void g() {
        this.s = false;
        t90 t90Var = this.f;
        if (t90Var != null) {
            t90Var.notifyDataSetChanged();
        }
    }

    @Override // defpackage.bo0
    public final wr h() {
        return this.j.e;
    }

    @Override // defpackage.ma0
    public final boolean j(gq0 gq0Var) {
        boolean z;
        if (gq0Var.hasVisibleItems()) {
            ga0 ga0Var = new ga0(this.d, gq0Var, this.o, this.g, this.i, 0);
            la0 la0Var = this.p;
            ga0Var.h = la0Var;
            ea0 ea0Var = ga0Var.i;
            if (ea0Var != null) {
                ea0Var.e(la0Var);
            }
            int size = gq0Var.f.size();
            int i = 0;
            while (true) {
                if (i < size) {
                    MenuItem item = gq0Var.getItem(i);
                    if (item.isVisible() && item.getIcon() != null) {
                        z = true;
                        break;
                    }
                    i++;
                } else {
                    z = false;
                    break;
                }
            }
            ga0Var.g = z;
            ea0 ea0Var2 = ga0Var.i;
            if (ea0Var2 != null) {
                ea0Var2.o(z);
            }
            ga0Var.j = this.m;
            this.m = null;
            this.e.c(false);
            ka0 ka0Var = this.j;
            int i2 = ka0Var.h;
            int o = ka0Var.o();
            if ((Gravity.getAbsoluteGravity(this.u, this.n.getLayoutDirection()) & 7) == 5) {
                i2 += this.n.getWidth();
            }
            if (!ga0Var.b()) {
                if (ga0Var.e != null) {
                    ga0Var.d(i2, o, true, true);
                }
            }
            la0 la0Var2 = this.p;
            if (la0Var2 != null) {
                la0Var2.p(gq0Var);
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.ma0
    public final boolean k() {
        return false;
    }

    @Override // defpackage.ea0
    public final void n(View view) {
        this.n = view;
    }

    @Override // defpackage.ea0
    public final void o(boolean z) {
        this.f.c = z;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.r = true;
        this.e.c(true);
        ViewTreeObserver viewTreeObserver = this.q;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.q = this.o.getViewTreeObserver();
            }
            this.q.removeGlobalOnLayoutListener(this.k);
            this.q = null;
        }
        this.o.removeOnAttachStateChangeListener(this.l);
        PopupWindow.OnDismissListener onDismissListener = this.m;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i == 82) {
            dismiss();
            return true;
        }
        return false;
    }

    @Override // defpackage.ea0
    public final void p(int i) {
        this.u = i;
    }

    @Override // defpackage.ea0
    public final void q(int i) {
        this.j.h = i;
    }

    @Override // defpackage.ea0
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.m = onDismissListener;
    }

    @Override // defpackage.ea0
    public final void s(boolean z) {
        this.v = z;
    }

    @Override // defpackage.ea0
    public final void t(int i) {
        this.j.k(i);
    }

    @Override // defpackage.ea0
    public final void l(w90 w90Var) {
    }
}
