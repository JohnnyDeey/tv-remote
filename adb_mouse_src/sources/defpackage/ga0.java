package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import svarzee.android.apps.adb_mouse.R;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public class ga0 {
    public final Context a;
    public final w90 b;
    public final boolean c;
    public final int d;
    public View e;
    public boolean g;
    public la0 h;
    public ea0 i;
    public PopupWindow.OnDismissListener j;
    public int f = 8388611;
    public final fa0 k = new fa0(this);

    public ga0(Context context, w90 w90Var, View view, boolean z, int i, int i2) {
        this.a = context;
        this.b = w90Var;
        this.e = view;
        this.c = z;
        this.d = i;
    }

    public final ea0 a() {
        ea0 np0Var;
        if (this.i == null) {
            Context context = this.a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            int min = Math.min(point.x, point.y);
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width);
            Context context2 = this.a;
            if (min >= dimensionPixelSize) {
                np0Var = new rf(context2, this.e, this.d, this.c);
            } else {
                np0Var = new np0(context2, this.b, this.e, this.d, this.c);
            }
            np0Var.l(this.b);
            np0Var.r(this.k);
            np0Var.n(this.e);
            np0Var.e(this.h);
            np0Var.o(this.g);
            np0Var.p(this.f);
            this.i = np0Var;
        }
        return this.i;
    }

    public final boolean b() {
        ea0 ea0Var = this.i;
        if (ea0Var != null && ea0Var.b()) {
            return true;
        }
        return false;
    }

    public void c() {
        this.i = null;
        PopupWindow.OnDismissListener onDismissListener = this.j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i, int i2, boolean z, boolean z2) {
        ea0 a = a();
        a.s(z2);
        if (z) {
            if ((Gravity.getAbsoluteGravity(this.f, this.e.getLayoutDirection()) & 7) == 5) {
                i -= this.e.getWidth();
            }
            a.q(i);
            a.t(i2);
            int i3 = (int) ((this.a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a.c = new Rect(i - i3, i2 - i3, i + i3, i2 + i3);
        }
        a.d();
    }
}
