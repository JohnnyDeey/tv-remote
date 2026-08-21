package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.AbsSeekBar;
import svarzee.android.apps.adb_mouse.R;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class w6 extends r6 {
    public final v6 g;
    public Drawable h;
    public ColorStateList i;
    public PorterDuff.Mode j;
    public boolean k;
    public boolean l;

    public w6(v6 v6Var) {
        super((AbsSeekBar) v6Var);
        this.i = null;
        this.j = null;
        this.k = false;
        this.l = false;
        this.g = v6Var;
    }

    @Override // defpackage.r6
    public final void F(AttributeSet attributeSet, int i) {
        super.F(attributeSet, R.attr.seekBarStyle);
        v6 v6Var = this.g;
        Context context = v6Var.getContext();
        int[] iArr = ng0.g;
        b8 J = b8.J(context, attributeSet, iArr, R.attr.seekBarStyle);
        TypedArray typedArray = (TypedArray) J.d;
        ry0.l(v6Var, v6Var.getContext(), iArr, attributeSet, (TypedArray) J.d, R.attr.seekBarStyle);
        Drawable A = J.A(0);
        if (A != null) {
            v6Var.setThumb(A);
        }
        Drawable z = J.z(1);
        Drawable drawable = this.h;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.h = z;
        if (z != null) {
            z.setCallback(v6Var);
            z.setLayoutDirection(v6Var.getLayoutDirection());
            if (z.isStateful()) {
                z.setState(v6Var.getDrawableState());
            }
            Q();
        }
        v6Var.invalidate();
        if (typedArray.hasValue(3)) {
            this.j = lr.c(typedArray.getInt(3, -1), this.j);
            this.l = true;
        }
        if (typedArray.hasValue(2)) {
            this.i = J.y(2);
            this.k = true;
        }
        J.N();
        Q();
    }

    public final void Q() {
        Drawable drawable = this.h;
        if (drawable != null) {
            if (this.k || this.l) {
                Drawable mutate = drawable.mutate();
                this.h = mutate;
                if (this.k) {
                    mutate.setTintList(this.i);
                }
                if (this.l) {
                    this.h.setTintMode(this.j);
                }
                if (this.h.isStateful()) {
                    this.h.setState(this.g.getDrawableState());
                }
            }
        }
    }

    public final void R(Canvas canvas) {
        int i;
        if (this.h != null) {
            int max = this.g.getMax();
            int i2 = 1;
            if (max > 1) {
                int intrinsicWidth = this.h.getIntrinsicWidth();
                int intrinsicHeight = this.h.getIntrinsicHeight();
                if (intrinsicWidth >= 0) {
                    i = intrinsicWidth / 2;
                } else {
                    i = 1;
                }
                if (intrinsicHeight >= 0) {
                    i2 = intrinsicHeight / 2;
                }
                this.h.setBounds(-i, -i2, i, i2);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.h.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
