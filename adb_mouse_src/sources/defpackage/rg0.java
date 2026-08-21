package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import svarzee.android.apps.adb_mouse.R;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public abstract class rg0 extends ConstraintLayout {
    public final x2 s;
    public int t;
    public final m90 u;

    public rg0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        m90 m90Var = new m90();
        this.u = m90Var;
        yi0 yi0Var = new yi0(0.5f);
        nn0 f = m90Var.d.a.f();
        f.e = yi0Var;
        f.f = yi0Var;
        f.g = yi0Var;
        f.h = yi0Var;
        m90Var.setShapeAppearanceModel(f.a());
        this.u.n(ColorStateList.valueOf(-1));
        setBackground(this.u);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, mg0.y, R.attr.materialClockStyle, 0);
        this.t = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.s = new x2(12, this);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            x2 x2Var = this.s;
            handler.removeCallbacks(x2Var);
            handler.post(x2Var);
        }
    }

    public abstract void m();

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        m();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            x2 x2Var = this.s;
            handler.removeCallbacks(x2Var);
            handler.post(x2Var);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        this.u.n(ColorStateList.valueOf(i));
    }
}
