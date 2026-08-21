package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import svarzee.android.apps.adb_mouse.R;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class e7 extends t60 implements g7 {
    public CharSequence E;
    public b7 F;
    public final Rect G;
    public int H;
    public final /* synthetic */ h7 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e7(h7 h7Var, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle, 0);
        this.I = h7Var;
        this.G = new Rect();
        this.q = h7Var;
        this.A = true;
        this.B.setFocusable(true);
        this.r = new c7(0, this);
    }

    @Override // defpackage.g7
    public final void g(CharSequence charSequence) {
        this.E = charSequence;
    }

    @Override // defpackage.g7
    public final void l(int i) {
        this.H = i;
    }

    @Override // defpackage.g7
    public final void n(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        q6 q6Var = this.B;
        boolean isShowing = q6Var.isShowing();
        s();
        q6Var.setInputMethodMode(2);
        d();
        wr wrVar = this.e;
        wrVar.setChoiceMode(1);
        wrVar.setTextDirection(i);
        wrVar.setTextAlignment(i2);
        h7 h7Var = this.I;
        int selectedItemPosition = h7Var.getSelectedItemPosition();
        wr wrVar2 = this.e;
        if (q6Var.isShowing() && wrVar2 != null) {
            wrVar2.setListSelectionHidden(false);
            wrVar2.setSelection(selectedItemPosition);
            if (wrVar2.getChoiceMode() != 0) {
                wrVar2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (!isShowing && (viewTreeObserver = h7Var.getViewTreeObserver()) != null) {
            y6 y6Var = new y6(1, this);
            viewTreeObserver.addOnGlobalLayoutListener(y6Var);
            q6Var.setOnDismissListener(new d7(this, y6Var));
        }
    }

    @Override // defpackage.g7
    public final CharSequence p() {
        return this.E;
    }

    @Override // defpackage.t60, defpackage.g7
    public final void q(ListAdapter listAdapter) {
        super.q(listAdapter);
        this.F = (b7) listAdapter;
    }

    public final void s() {
        int i;
        int i2;
        q6 q6Var = this.B;
        Drawable background = q6Var.getBackground();
        h7 h7Var = this.I;
        Rect rect = h7Var.j;
        if (background != null) {
            background.getPadding(rect);
            boolean z = lz0.a;
            if (h7Var.getLayoutDirection() == 1) {
                i = rect.right;
            } else {
                i = -rect.left;
            }
        } else {
            i = 0;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = h7Var.getPaddingLeft();
        int paddingRight = h7Var.getPaddingRight();
        int width = h7Var.getWidth();
        int i3 = h7Var.i;
        if (i3 == -2) {
            int a = h7Var.a(this.F, q6Var.getBackground());
            int i4 = (h7Var.getContext().getResources().getDisplayMetrics().widthPixels - rect.left) - rect.right;
            if (a > i4) {
                a = i4;
            }
            r(Math.max(a, (width - paddingLeft) - paddingRight));
        } else if (i3 == -1) {
            r((width - paddingLeft) - paddingRight);
        } else {
            r(i3);
        }
        boolean z2 = lz0.a;
        if (h7Var.getLayoutDirection() == 1) {
            i2 = (((width - paddingRight) - this.g) - this.H) + i;
        } else {
            i2 = paddingLeft + this.H + i;
        }
        this.h = i2;
    }
}
