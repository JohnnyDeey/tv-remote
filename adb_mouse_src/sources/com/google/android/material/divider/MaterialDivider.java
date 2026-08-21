package com.google.android.material.divider;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import defpackage.k20;
import defpackage.m90;
import defpackage.mg0;
import defpackage.r21;
import svarzee.android.apps.adb_mouse.R;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public class MaterialDivider extends View {
    public final m90 c;
    public int d;
    public int e;
    public int f;
    public int g;

    public MaterialDivider(Context context, AttributeSet attributeSet) {
        super(r21.Q(context, attributeSet, R.attr.materialDividerStyle, R.style.Widget_MaterialComponents_MaterialDivider), attributeSet, R.attr.materialDividerStyle);
        Context context2 = getContext();
        this.c = new m90();
        TypedArray X = k20.X(context2, attributeSet, mg0.r, R.attr.materialDividerStyle, R.style.Widget_MaterialComponents_MaterialDivider, new int[0]);
        this.d = X.getDimensionPixelSize(3, getResources().getDimensionPixelSize(R.dimen.material_divider_thickness));
        this.f = X.getDimensionPixelOffset(2, 0);
        this.g = X.getDimensionPixelOffset(1, 0);
        setDividerColor(k20.w(context2, X, 0).getDefaultColor());
        X.recycle();
    }

    public int getDividerColor() {
        return this.e;
    }

    public int getDividerInsetEnd() {
        return this.g;
    }

    public int getDividerInsetStart() {
        return this.f;
    }

    public int getDividerThickness() {
        return this.d;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        int width;
        int i2;
        super.onDraw(canvas);
        boolean z = true;
        if (getLayoutDirection() != 1) {
            z = false;
        }
        if (z) {
            i = this.g;
        } else {
            i = this.f;
        }
        if (z) {
            width = getWidth();
            i2 = this.f;
        } else {
            width = getWidth();
            i2 = this.g;
        }
        int i3 = width - i2;
        int bottom = getBottom() - getTop();
        m90 m90Var = this.c;
        m90Var.setBounds(i, 0, i3, bottom);
        m90Var.draw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        int measuredHeight = getMeasuredHeight();
        if (mode != Integer.MIN_VALUE && mode != 0) {
            return;
        }
        int i3 = this.d;
        if (i3 > 0 && measuredHeight != i3) {
            measuredHeight = i3;
        }
        setMeasuredDimension(getMeasuredWidth(), measuredHeight);
    }

    public void setDividerColor(int i) {
        if (this.e != i) {
            this.e = i;
            this.c.n(ColorStateList.valueOf(i));
            invalidate();
        }
    }

    public void setDividerColorResource(int i) {
        setDividerColor(getContext().getColor(i));
    }

    public void setDividerInsetEnd(int i) {
        this.g = i;
    }

    public void setDividerInsetEndResource(int i) {
        setDividerInsetEnd(getContext().getResources().getDimensionPixelOffset(i));
    }

    public void setDividerInsetStart(int i) {
        this.f = i;
    }

    public void setDividerInsetStartResource(int i) {
        setDividerInsetStart(getContext().getResources().getDimensionPixelOffset(i));
    }

    public void setDividerThickness(int i) {
        if (this.d != i) {
            this.d = i;
            requestLayout();
        }
    }

    public void setDividerThicknessResource(int i) {
        setDividerThickness(getContext().getResources().getDimensionPixelSize(i));
    }
}
