package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import defpackage.m2;
import defpackage.n2;
import defpackage.na0;
import defpackage.ng0;
import defpackage.oi0;
import defpackage.s2;
import defpackage.s7;
import defpackage.v90;
import defpackage.w90;
import defpackage.z90;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public class ActionMenuItemView extends s7 implements na0, View.OnClickListener, s2 {
    public z90 j;
    public CharSequence k;
    public Drawable l;
    public v90 m;
    public m2 n;
    public n2 o;
    public boolean p;
    public boolean q;
    public final int r;
    public int s;
    public final int t;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.p = g();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ng0.c, 0, 0);
        this.r = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.t = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.s = -1;
        setSaveEnabled(false);
    }

    @Override // defpackage.s2
    public final boolean a() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // defpackage.s2
    public final boolean b() {
        if (!TextUtils.isEmpty(getText()) && this.j.getIcon() == null) {
            return true;
        }
        return false;
    }

    @Override // defpackage.na0
    public final void c(z90 z90Var) {
        int i;
        this.j = z90Var;
        setIcon(z90Var.getIcon());
        setTitle(z90Var.getTitleCondensed());
        setId(z90Var.a);
        if (z90Var.isVisible()) {
            i = 0;
        } else {
            i = 8;
        }
        setVisibility(i);
        setEnabled(z90Var.isEnabled());
        if (z90Var.hasSubMenu() && this.n == null) {
            this.n = new m2(this);
        }
    }

    public final boolean g() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (i < 480) {
            if ((i < 640 || i2 < 480) && configuration.orientation != 2) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // defpackage.na0
    public z90 getItemData() {
        return this.j;
    }

    public final void h() {
        CharSequence charSequence;
        CharSequence charSequence2;
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.k);
        if (this.l != null && ((this.j.y & 4) != 4 || (!this.p && !this.q))) {
            z = false;
        }
        boolean z3 = z2 & z;
        CharSequence charSequence3 = null;
        if (z3) {
            charSequence = this.k;
        } else {
            charSequence = null;
        }
        setText(charSequence);
        CharSequence charSequence4 = this.j.q;
        if (TextUtils.isEmpty(charSequence4)) {
            if (z3) {
                charSequence2 = null;
            } else {
                charSequence2 = this.j.e;
            }
            setContentDescription(charSequence2);
        } else {
            setContentDescription(charSequence4);
        }
        CharSequence charSequence5 = this.j.r;
        if (TextUtils.isEmpty(charSequence5)) {
            if (!z3) {
                charSequence3 = this.j.e;
            }
            oi0.w(this, charSequence3);
            return;
        }
        oi0.w(this, charSequence5);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        v90 v90Var = this.m;
        if (v90Var != null) {
            v90Var.a(this.j);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.p = g();
        h();
    }

    @Override // defpackage.s7, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        boolean isEmpty = TextUtils.isEmpty(getText());
        if (!isEmpty && (i4 = this.s) >= 0) {
            super.setPadding(i4, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int i5 = this.r;
        if (mode == Integer.MIN_VALUE) {
            i3 = Math.min(size, i5);
        } else {
            i3 = i5;
        }
        if (mode != 1073741824 && i5 > 0 && measuredWidth < i3) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
        }
        if (isEmpty && this.l != null) {
            super.setPadding((getMeasuredWidth() - this.l.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        m2 m2Var;
        if (this.j.hasSubMenu() && (m2Var = this.n) != null && m2Var.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setExpandedFormat(boolean z) {
        if (this.q != z) {
            this.q = z;
            z90 z90Var = this.j;
            if (z90Var != null) {
                w90 w90Var = z90Var.n;
                w90Var.k = true;
                w90Var.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.l = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.t;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (intrinsicWidth * (i / intrinsicHeight));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, null, null, null);
        h();
    }

    public void setItemInvoker(v90 v90Var) {
        this.m = v90Var;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.s = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(n2 n2Var) {
        this.o = n2Var;
    }

    public void setTitle(CharSequence charSequence) {
        this.k = charSequence;
        h();
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }
}
