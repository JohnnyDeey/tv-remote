package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import svarzee.android.apps.adb_mouse.R;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public abstract class dd extends FrameLayout {
    public static final cd k = new Object();
    public final on0 c;
    public int d;
    public final float e;
    public final float f;
    public final int g;
    public final int h;
    public ColorStateList i;
    public PorterDuff.Mode j;

    /* JADX WARN: Multi-variable type inference failed */
    public dd(Context context, AttributeSet attributeSet) {
        super(r21.Q(context, attributeSet, 0, 0), attributeSet);
        GradientDrawable gradientDrawable;
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, mg0.C);
        if (obtainStyledAttributes.hasValue(6)) {
            setElevation(obtainStyledAttributes.getDimensionPixelSize(6, 0));
        }
        this.d = obtainStyledAttributes.getInt(2, 0);
        if (obtainStyledAttributes.hasValue(8) || obtainStyledAttributes.hasValue(9)) {
            this.c = on0.b(context2, attributeSet, 0, 0).a();
        }
        this.e = obtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(k20.w(context2, obtainStyledAttributes, 4));
        setBackgroundTintMode(hi0.k(obtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.f = obtainStyledAttributes.getFloat(1, 1.0f);
        this.g = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.h = obtainStyledAttributes.getDimensionPixelSize(7, -1);
        obtainStyledAttributes.recycle();
        setOnTouchListener(k);
        setFocusable(true);
        if (getBackground() == null) {
            int O = f20.O(f20.x(this, R.attr.colorSurface), f20.x(this, R.attr.colorOnSurface), getBackgroundOverlayColorAlpha());
            on0 on0Var = this.c;
            if (on0Var != null) {
                int i = ed.a;
                m90 m90Var = new m90(on0Var);
                m90Var.n(ColorStateList.valueOf(O));
                gradientDrawable = m90Var;
            } else {
                Resources resources = getResources();
                int i2 = ed.a;
                float dimension = resources.getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setShape(0);
                gradientDrawable2.setCornerRadius(dimension);
                gradientDrawable2.setColor(O);
                gradientDrawable = gradientDrawable2;
            }
            ColorStateList colorStateList = this.i;
            if (colorStateList != null) {
                gradientDrawable.setTintList(colorStateList);
            }
            setBackground(gradientDrawable);
        }
    }

    public float getActionTextColorAlpha() {
        return this.f;
    }

    public int getAnimationMode() {
        return this.d;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.e;
    }

    public int getMaxInlineActionWidth() {
        return this.h;
    }

    public int getMaxWidth() {
        return this.g;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = this.g;
        if (i3 > 0 && getMeasuredWidth() > i3) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
        }
    }

    public void setAnimationMode(int i) {
        this.d = i;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.i != null) {
            drawable = drawable.mutate();
            drawable.setTintList(this.i);
            drawable.setTintMode(this.j);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.i = colorStateList;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            mutate.setTintList(colorStateList);
            mutate.setTintMode(this.j);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.j = mode;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            mutate.setTintMode(mode);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        cd cdVar;
        if (onClickListener != null) {
            cdVar = null;
        } else {
            cdVar = k;
        }
        setOnTouchListener(cdVar);
        super.setOnClickListener(onClickListener);
    }

    private void setBaseTransientBottomBar(ed edVar) {
    }
}
