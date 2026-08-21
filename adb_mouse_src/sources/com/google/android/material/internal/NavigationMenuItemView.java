package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import defpackage.na0;
import defpackage.oi0;
import defpackage.pj0;
import defpackage.ry0;
import defpackage.sg;
import defpackage.x50;
import defpackage.z90;
import defpackage.zw;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public class NavigationMenuItemView extends zw implements na0 {
    public static final int[] I = {R.attr.state_checked};
    public final boolean A;
    public final CheckedTextView B;
    public FrameLayout C;
    public z90 D;
    public ColorStateList E;
    public boolean F;
    public Drawable G;
    public final sg H;
    public int x;
    public boolean y;
    public boolean z;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A = true;
        sg sgVar = new sg(3, this);
        this.H = sgVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(svarzee.android.apps.adb_mouse.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(svarzee.android.apps.adb_mouse.R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(svarzee.android.apps.adb_mouse.R.id.design_menu_item_text);
        this.B = checkedTextView;
        ry0.m(checkedTextView, sgVar);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.C == null) {
                this.C = (FrameLayout) ((ViewStub) findViewById(svarzee.android.apps.adb_mouse.R.id.design_menu_item_action_area_stub)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.C.removeAllViews();
            this.C.addView(view);
        }
    }

    @Override // defpackage.na0
    public final void c(z90 z90Var) {
        int i;
        StateListDrawable stateListDrawable;
        this.D = z90Var;
        int i2 = z90Var.a;
        if (i2 > 0) {
            setId(i2);
        }
        if (z90Var.isVisible()) {
            i = 0;
        } else {
            i = 8;
        }
        setVisibility(i);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(svarzee.android.apps.adb_mouse.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(I, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            setBackground(stateListDrawable);
        }
        setCheckable(z90Var.isCheckable());
        setChecked(z90Var.isChecked());
        setEnabled(z90Var.isEnabled());
        setTitle(z90Var.e);
        setIcon(z90Var.getIcon());
        setActionView(z90Var.getActionView());
        setContentDescription(z90Var.q);
        oi0.w(this, z90Var.r);
        z90 z90Var2 = this.D;
        CharSequence charSequence = z90Var2.e;
        CheckedTextView checkedTextView = this.B;
        if (charSequence == null && z90Var2.getIcon() == null && this.D.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.C;
            if (frameLayout != null) {
                x50 x50Var = (x50) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) x50Var).width = -1;
                this.C.setLayoutParams(x50Var);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.C;
        if (frameLayout2 != null) {
            x50 x50Var2 = (x50) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) x50Var2).width = -2;
            this.C.setLayoutParams(x50Var2);
        }
    }

    @Override // defpackage.na0
    public z90 getItemData() {
        return this.D;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        z90 z90Var = this.D;
        if (z90Var != null && z90Var.isCheckable() && this.D.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, I);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.z != z) {
            this.z = z;
            this.H.h(this.B, 2048);
        }
    }

    public void setChecked(boolean z) {
        int i;
        refreshDrawableState();
        CheckedTextView checkedTextView = this.B;
        checkedTextView.setChecked(z);
        Typeface typeface = checkedTextView.getTypeface();
        if (z && this.A) {
            i = 1;
        } else {
            i = 0;
        }
        checkedTextView.setTypeface(typeface, i);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.F) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                drawable.setTintList(this.E);
            }
            int i = this.x;
            drawable.setBounds(0, 0, i, i);
        } else if (this.y) {
            if (this.G == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = pj0.a;
                Drawable drawable2 = resources.getDrawable(svarzee.android.apps.adb_mouse.R.drawable.navigation_empty_icon, theme);
                this.G = drawable2;
                if (drawable2 != null) {
                    int i2 = this.x;
                    drawable2.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.G;
        }
        this.B.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.B.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.x = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        boolean z;
        this.E = colorStateList;
        if (colorStateList != null) {
            z = true;
        } else {
            z = false;
        }
        this.F = z;
        z90 z90Var = this.D;
        if (z90Var != null) {
            setIcon(z90Var.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.B.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.y = z;
    }

    public void setTextAppearance(int i) {
        this.B.setTextAppearance(i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.B.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.B.setText(charSequence);
    }
}
