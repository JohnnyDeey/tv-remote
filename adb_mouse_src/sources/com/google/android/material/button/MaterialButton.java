package com.google.android.material.button;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import defpackage.c;
import defpackage.dp;
import defpackage.h5;
import defpackage.hi0;
import defpackage.i81;
import defpackage.j0;
import defpackage.k0;
import defpackage.k20;
import defpackage.m90;
import defpackage.mg0;
import defpackage.mn;
import defpackage.nn0;
import defpackage.on0;
import defpackage.qo0;
import defpackage.r21;
import defpackage.rp0;
import defpackage.sf;
import defpackage.t80;
import defpackage.tp0;
import defpackage.u80;
import defpackage.uj0;
import defpackage.v80;
import defpackage.w80;
import defpackage.wv0;
import defpackage.x2;
import defpackage.yo0;
import defpackage.zn0;
import defpackage.zo0;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public class MaterialButton extends h5 implements Checkable, zn0 {
    public static final int[] H = {R.attr.state_checkable};
    public static final int[] I = {R.attr.state_checked};
    public static final dp J = new dp(1);
    public boolean A;
    public int B;
    public tp0 C;
    public int D;
    public float E;
    public float F;
    public yo0 G;
    public final w80 f;
    public final LinkedHashSet g;
    public t80 h;
    public PorterDuff.Mode i;
    public ColorStateList j;
    public Drawable k;
    public String l;
    public int m;
    public int n;
    public int o;
    public int p;
    public boolean q;
    public boolean r;
    public int s;
    public int t;
    public float u;
    public int v;
    public int w;
    public LinearLayout.LayoutParams x;
    public boolean y;
    public int z;

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(r21.R(context, attributeSet, svarzee.android.apps.adb_mouse.R.attr.materialButtonStyle, svarzee.android.apps.adb_mouse.R.style.Widget_MaterialComponents_Button, new int[]{svarzee.android.apps.adb_mouse.R.attr.materialSizeOverlay}), attributeSet, svarzee.android.apps.adb_mouse.R.attr.materialButtonStyle);
        on0 a;
        this.g = new LinkedHashSet();
        this.q = false;
        this.r = false;
        this.t = -1;
        this.u = -1.0f;
        this.v = -1;
        this.w = -1;
        this.B = -1;
        Context context2 = getContext();
        TypedArray X = k20.X(context2, attributeSet, mg0.l, svarzee.android.apps.adb_mouse.R.attr.materialButtonStyle, svarzee.android.apps.adb_mouse.R.style.Widget_MaterialComponents_Button, new int[0]);
        this.p = X.getDimensionPixelSize(13, 0);
        int i = X.getInt(16, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.i = hi0.k(i, mode);
        this.j = k20.w(getContext(), X, 15);
        this.k = k20.z(getContext(), X, 11);
        this.s = X.getInteger(12, 1);
        this.m = X.getDimensionPixelSize(14, 0);
        rp0 b = rp0.b(context2, X, 19);
        if (b != null) {
            a = b.c();
        } else {
            a = on0.b(context2, attributeSet, svarzee.android.apps.adb_mouse.R.attr.materialButtonStyle, svarzee.android.apps.adb_mouse.R.style.Widget_MaterialComponents_Button).a();
        }
        boolean z = X.getBoolean(17, false);
        w80 w80Var = new w80(this, a);
        this.f = w80Var;
        w80Var.f = X.getDimensionPixelOffset(2, 0);
        w80Var.g = X.getDimensionPixelOffset(3, 0);
        w80Var.h = X.getDimensionPixelOffset(4, 0);
        w80Var.i = X.getDimensionPixelOffset(5, 0);
        if (X.hasValue(9)) {
            int dimensionPixelSize = X.getDimensionPixelSize(9, -1);
            w80Var.j = dimensionPixelSize;
            float f = dimensionPixelSize;
            nn0 f2 = w80Var.b.f();
            f2.e = new k0(f);
            f2.f = new k0(f);
            f2.g = new k0(f);
            f2.h = new k0(f);
            w80Var.b = f2.a();
            w80Var.c = null;
            w80Var.d();
            w80Var.s = true;
        }
        w80Var.k = X.getDimensionPixelSize(22, 0);
        w80Var.l = hi0.k(X.getInt(8, -1), mode);
        w80Var.m = k20.w(getContext(), X, 7);
        w80Var.n = k20.w(getContext(), X, 21);
        w80Var.o = k20.w(getContext(), X, 18);
        w80Var.t = X.getBoolean(6, false);
        w80Var.w = X.getDimensionPixelSize(10, 0);
        w80Var.u = X.getBoolean(23, true);
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (X.hasValue(0)) {
            w80Var.r = true;
            setSupportBackgroundTintList(w80Var.m);
            setSupportBackgroundTintMode(w80Var.l);
        } else {
            w80Var.c();
        }
        setPaddingRelative(paddingStart + w80Var.f, paddingTop + w80Var.h, paddingEnd + w80Var.g, paddingBottom + w80Var.i);
        setCheckedInternal(X.getBoolean(1, false));
        if (b != null) {
            w80Var.d = d();
            if (w80Var.c != null) {
                w80Var.d();
            }
            w80Var.c = b;
            w80Var.d();
        }
        setOpticalCenterEnabled(z);
        X.recycle();
        setCompoundDrawablePadding(this.p);
        h(this.k != null);
    }

    public static /* synthetic */ void a(MaterialButton materialButton) {
        materialButton.z = materialButton.getOpticalCenterShift();
        materialButton.j();
        materialButton.invalidate();
    }

    public static /* synthetic */ float b(MaterialButton materialButton) {
        return materialButton.getDisplayedWidthIncrease();
    }

    public static /* synthetic */ void c(MaterialButton materialButton, float f) {
        materialButton.setDisplayedWidthIncrease(f);
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        if (textAlignment != 1) {
            if (textAlignment != 6 && textAlignment != 3) {
                if (textAlignment != 4) {
                    return Layout.Alignment.ALIGN_NORMAL;
                }
                return Layout.Alignment.ALIGN_CENTER;
            }
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return getGravityTextAlignment();
    }

    public float getDisplayedWidthIncrease() {
        return this.E;
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        if (gravity != 1) {
            if (gravity != 5 && gravity != 8388613) {
                return Layout.Alignment.ALIGN_NORMAL;
            }
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    private int getOpticalCenterShift() {
        m90 a;
        if (!this.y || !this.A || (a = this.f.a(false)) == null) {
            return 0;
        }
        return (int) (a.h() * 0.11f);
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float f = 0.0f;
        for (int i = 0; i < lineCount; i++) {
            f = Math.max(f, getLayout().getLineWidth(i));
        }
        return (int) Math.ceil(f);
    }

    private void setCheckedInternal(boolean z) {
        w80 w80Var = this.f;
        if (w80Var != null && w80Var.t && this.q != z) {
            this.q = z;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
                boolean z2 = this.q;
                if (!materialButtonToggleGroup.n) {
                    materialButtonToggleGroup.f(getId(), z2);
                }
            }
            if (!this.r) {
                this.r = true;
                Iterator it = this.g.iterator();
                if (!it.hasNext()) {
                    this.r = false;
                    return;
                }
                throw qo0.l(it);
            }
        }
    }

    public void setDisplayedWidthIncrease(float f) {
        MaterialButton materialButton;
        MaterialButton materialButton2;
        if (this.E != f) {
            this.E = f;
            j();
            invalidate();
            if (getParent() instanceof v80) {
                v80 v80Var = (v80) getParent();
                int i = (int) this.E;
                int indexOfChild = v80Var.indexOfChild(this);
                if (indexOfChild >= 0) {
                    int i2 = indexOfChild - 1;
                    while (true) {
                        materialButton = null;
                        if (i2 >= 0) {
                            if (v80Var.c(i2)) {
                                materialButton2 = (MaterialButton) v80Var.getChildAt(i2);
                                break;
                            }
                            i2--;
                        } else {
                            materialButton2 = null;
                            break;
                        }
                    }
                    int childCount = v80Var.getChildCount();
                    while (true) {
                        indexOfChild++;
                        if (indexOfChild >= childCount) {
                            break;
                        } else if (v80Var.c(indexOfChild)) {
                            materialButton = (MaterialButton) v80Var.getChildAt(indexOfChild);
                            break;
                        }
                    }
                    if (materialButton2 != null || materialButton != null) {
                        if (materialButton2 == null) {
                            materialButton.setDisplayedWidthDecrease(i);
                        }
                        if (materialButton == null) {
                            materialButton2.setDisplayedWidthDecrease(i);
                        }
                        if (materialButton2 != null && materialButton != null) {
                            materialButton2.setDisplayedWidthDecrease(i / 2);
                            materialButton.setDisplayedWidthDecrease((i + 1) / 2);
                        }
                    }
                }
            }
        }
    }

    public final zo0 d() {
        TypedArray obtainStyledAttributes;
        Context context = getContext();
        TypedValue L = mn.L(context, svarzee.android.apps.adb_mouse.R.attr.motionSpringFastSpatial);
        int[] iArr = mg0.u;
        if (L == null) {
            obtainStyledAttributes = context.obtainStyledAttributes(null, iArr, 0, svarzee.android.apps.adb_mouse.R.style.Motion_Material3_Spring_Standard_Fast_Spatial);
        } else {
            obtainStyledAttributes = context.obtainStyledAttributes(L.resourceId, iArr);
        }
        zo0 zo0Var = new zo0();
        try {
            float f = obtainStyledAttributes.getFloat(1, Float.MIN_VALUE);
            if (f != Float.MIN_VALUE) {
                float f2 = obtainStyledAttributes.getFloat(0, Float.MIN_VALUE);
                if (f2 != Float.MIN_VALUE) {
                    zo0Var.b(f);
                    zo0Var.a(f2);
                    return zo0Var;
                }
                throw new IllegalArgumentException("A MaterialSpring style must have a damping value.");
            }
            throw new IllegalArgumentException("A MaterialSpring style must have stiffness value.");
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public final boolean e() {
        w80 w80Var = this.f;
        if (w80Var != null && !w80Var.r) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0071, code lost:
    
        if (r1 == 2) goto L81;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(boolean r9) {
        /*
            r8 = this;
            tp0 r0 = r8.C
            if (r0 != 0) goto L6
            goto L85
        L6:
            yo0 r0 = r8.G
            if (r0 != 0) goto L19
            yo0 r0 = new yo0
            dp r1 = com.google.android.material.button.MaterialButton.J
            r0.<init>(r8, r1)
            r8.G = r0
            zo0 r1 = r8.d()
            r0.k = r1
        L19:
            boolean r0 = r8.A
            if (r0 == 0) goto L85
            int r0 = r8.D
            tp0 r1 = r8.C
            int[] r2 = r8.getDrawableState()
            int[][] r3 = r1.c
            r4 = 0
            r5 = r4
        L29:
            int r6 = r1.a
            r7 = -1
            if (r5 >= r6) goto L3a
            r6 = r3[r5]
            boolean r6 = android.util.StateSet.stateSetMatches(r6, r2)
            if (r6 == 0) goto L37
            goto L3b
        L37:
            int r5 = r5 + 1
            goto L29
        L3a:
            r5 = r7
        L3b:
            if (r5 >= 0) goto L54
            int[] r2 = android.util.StateSet.WILD_CARD
            int[][] r3 = r1.c
            r5 = r4
        L42:
            int r6 = r1.a
            if (r5 >= r6) goto L53
            r6 = r3[r5]
            boolean r6 = android.util.StateSet.stateSetMatches(r6, r2)
            if (r6 == 0) goto L50
            r7 = r5
            goto L53
        L50:
            int r5 = r5 + 1
            goto L42
        L53:
            r5 = r7
        L54:
            if (r5 >= 0) goto L59
            sb0 r1 = r1.b
            goto L5d
        L59:
            sb0[] r1 = r1.d
            r1 = r1[r5]
        L5d:
            java.lang.Object r1 = r1.c
            sp0 r1 = (defpackage.sp0) r1
            int r2 = r8.getWidth()
            float r3 = r1.b
            int r1 = r1.a
            r5 = 1
            if (r1 != r5) goto L70
            float r1 = (float) r2
            float r3 = r3 * r1
        L6e:
            int r4 = (int) r3
            goto L74
        L70:
            r2 = 2
            if (r1 != r2) goto L74
            goto L6e
        L74:
            int r0 = java.lang.Math.min(r0, r4)
            yo0 r1 = r8.G
            float r0 = (float) r0
            r1.a(r0)
            if (r9 == 0) goto L85
            yo0 r8 = r8.G
            r8.d()
        L85:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButton.f(boolean):void");
    }

    public final void g() {
        int i = this.s;
        if (i != 1 && i != 2) {
            if (i != 3 && i != 4) {
                if (i != 16 && i != 32) {
                    return;
                }
                setCompoundDrawablesRelative(null, this.k, null, null);
                return;
            }
            setCompoundDrawablesRelative(null, null, this.k, null);
            return;
        }
        setCompoundDrawablesRelative(this.k, null, null, null);
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public String getA11yClassName() {
        Class cls;
        if (!TextUtils.isEmpty(this.l)) {
            return this.l;
        }
        w80 w80Var = this.f;
        if (w80Var != null && w80Var.t) {
            cls = CompoundButton.class;
        } else {
            cls = Button.class;
        }
        return cls.getName();
    }

    public int getAllowedWidthDecrease() {
        return this.B;
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (e()) {
            return this.f.j;
        }
        return 0;
    }

    public zo0 getCornerSpringForce() {
        return this.f.d;
    }

    public Drawable getIcon() {
        return this.k;
    }

    public int getIconGravity() {
        return this.s;
    }

    public int getIconPadding() {
        return this.p;
    }

    public int getIconSize() {
        return this.m;
    }

    public ColorStateList getIconTint() {
        return this.j;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.i;
    }

    public int getInsetBottom() {
        return this.f.i;
    }

    public int getInsetTop() {
        return this.f.h;
    }

    public ColorStateList getRippleColor() {
        if (e()) {
            return this.f.o;
        }
        return null;
    }

    public on0 getShapeAppearanceModel() {
        if (e()) {
            return this.f.b;
        }
        c.o("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
        return null;
    }

    public rp0 getStateListShapeAppearanceModel() {
        if (e()) {
            return this.f.c;
        }
        c.o("Attempted to get StateListShapeAppearanceModel from a MaterialButton which has an overwritten background.");
        return null;
    }

    public ColorStateList getStrokeColor() {
        if (e()) {
            return this.f.n;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (e()) {
            return this.f.k;
        }
        return 0;
    }

    @Override // defpackage.h5
    public ColorStateList getSupportBackgroundTintList() {
        if (e()) {
            return this.f.m;
        }
        return super.getSupportBackgroundTintList();
    }

    @Override // defpackage.h5
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (e()) {
            return this.f.l;
        }
        return super.getSupportBackgroundTintMode();
    }

    public final void h(boolean z) {
        Drawable drawable = this.k;
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.k = mutate;
            mutate.setTintList(this.j);
            PorterDuff.Mode mode = this.i;
            if (mode != null) {
                this.k.setTintMode(mode);
            }
            int i = this.m;
            if (i == 0) {
                i = this.k.getIntrinsicWidth();
            }
            int i2 = this.m;
            if (i2 == 0) {
                i2 = this.k.getIntrinsicHeight();
            }
            Drawable drawable2 = this.k;
            int i3 = this.n;
            int i4 = this.o;
            drawable2.setBounds(i3, i4, i + i3, i2 + i4);
            this.k.setVisible(true, z);
        }
        if (z) {
            g();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        int i5 = this.s;
        if (((i5 != 1 && i5 != 2) || drawable3 == this.k) && (((i5 != 3 && i5 != 4) || drawable5 == this.k) && ((i5 != 16 && i5 != 32) || drawable4 == this.k))) {
            return;
        }
        g();
    }

    public final void i(int i, int i2) {
        boolean z;
        if (this.k != null && getLayout() != null) {
            int i3 = this.s;
            boolean z2 = true;
            if (i3 != 1 && i3 != 2 && i3 != 3 && i3 != 4) {
                if (i3 != 16 && i3 != 32) {
                    return;
                }
                this.n = 0;
                if (i3 == 16) {
                    this.o = 0;
                    h(false);
                    return;
                }
                int i4 = this.m;
                if (i4 == 0) {
                    i4 = this.k.getIntrinsicHeight();
                }
                int max = Math.max(0, (((((i2 - getTextHeight()) - getPaddingTop()) - i4) - this.p) - getPaddingBottom()) / 2);
                if (this.o != max) {
                    this.o = max;
                    h(false);
                    return;
                }
                return;
            }
            this.o = 0;
            Layout.Alignment actualTextAlignment = getActualTextAlignment();
            int i5 = this.s;
            if (i5 != 1 && i5 != 3 && ((i5 != 2 || actualTextAlignment != Layout.Alignment.ALIGN_NORMAL) && (i5 != 4 || actualTextAlignment != Layout.Alignment.ALIGN_OPPOSITE))) {
                int i6 = this.m;
                if (i6 == 0) {
                    i6 = this.k.getIntrinsicWidth();
                }
                int textLayoutWidth = ((((i - getTextLayoutWidth()) - getPaddingEnd()) - i6) - this.p) - getPaddingStart();
                if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
                    textLayoutWidth /= 2;
                }
                if (getLayoutDirection() == 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (this.s != 4) {
                    z2 = false;
                }
                if (z != z2) {
                    textLayoutWidth = -textLayoutWidth;
                }
                if (this.n != textLayoutWidth) {
                    this.n = textLayoutWidth;
                    h(false);
                    return;
                }
                return;
            }
            this.n = 0;
            h(false);
        }
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.q;
    }

    public final void j() {
        int i = (int) (this.E - this.F);
        int i2 = (i / 2) + this.z;
        getLayoutParams().width = (int) (this.u + i);
        setPaddingRelative(this.v + i2, getPaddingTop(), (this.w + i) - i2, getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (e()) {
            wv0.X(this, this.f.a(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        w80 w80Var = this.f;
        if (w80Var != null && w80Var.t) {
            View.mergeDrawableStates(onCreateDrawableState, H);
        }
        if (this.q) {
            View.mergeDrawableStates(onCreateDrawableState, I);
        }
        return onCreateDrawableState;
    }

    @Override // defpackage.h5, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.q);
    }

    @Override // defpackage.h5, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        w80 w80Var = this.f;
        if (w80Var != null && w80Var.t) {
            z = true;
        } else {
            z = false;
        }
        accessibilityNodeInfo.setCheckable(z);
        accessibilityNodeInfo.setChecked(this.q);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // defpackage.h5, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        i(getMeasuredWidth(), getMeasuredHeight());
        int i6 = getResources().getConfiguration().orientation;
        if (this.t != i6) {
            this.t = i6;
            this.u = -1.0f;
        }
        if (this.u == -1.0f) {
            this.u = getMeasuredWidth();
            if (this.x == null && (getParent() instanceof v80) && ((v80) getParent()).getButtonSizeChange() != null) {
                this.x = (LinearLayout.LayoutParams) getLayoutParams();
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.x);
                layoutParams.width = (int) this.u;
                setLayoutParams(layoutParams);
            }
        }
        boolean z2 = false;
        if (this.B == -1) {
            if (this.k == null) {
                i5 = 0;
            } else {
                int iconPadding = getIconPadding();
                int i7 = this.m;
                if (i7 == 0) {
                    i7 = this.k.getIntrinsicWidth();
                }
                i5 = iconPadding + i7;
            }
            this.B = (getMeasuredWidth() - getTextLayoutWidth()) - i5;
        }
        if (this.v == -1) {
            this.v = getPaddingStart();
        }
        if (this.w == -1) {
            this.w = getPaddingEnd();
        }
        if ((getParent() instanceof v80) && ((v80) getParent()).getOrientation() == 0) {
            z2 = true;
        }
        this.A = z2;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof u80)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        u80 u80Var = (u80) parcelable;
        super.onRestoreInstanceState(u80Var.c);
        setChecked(u80Var.e);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.os.Parcelable, j0, u80] */
    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? j0Var = new j0(super.onSaveInstanceState());
        j0Var.e = this.q;
        return j0Var;
    }

    @Override // defpackage.h5, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (isEnabled() && this.f.u) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.k != null) {
            if (this.k.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.l = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (e()) {
            w80 w80Var = this.f;
            if (w80Var.a(false) != null) {
                w80Var.a(false).setTint(i);
                return;
            }
            return;
        }
        super.setBackgroundColor(i);
    }

    @Override // defpackage.h5, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (e()) {
            if (drawable != getBackground()) {
                Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
                w80 w80Var = this.f;
                w80Var.r = true;
                MaterialButton materialButton = w80Var.a;
                materialButton.setSupportBackgroundTintList(w80Var.m);
                materialButton.setSupportBackgroundTintMode(w80Var.l);
                super.setBackgroundDrawable(drawable);
                return;
            }
            getBackground().setState(drawable.getState());
            return;
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // defpackage.h5, android.view.View
    public void setBackgroundResource(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = r21.r(getContext(), i);
        } else {
            drawable = null;
        }
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (e()) {
            this.f.t = z;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        setCheckedInternal(z);
    }

    public void setCornerRadius(int i) {
        if (e()) {
            w80 w80Var = this.f;
            if (!w80Var.s || w80Var.j != i) {
                w80Var.j = i;
                w80Var.s = true;
                float f = i;
                nn0 f2 = w80Var.b.f();
                f2.e = new k0(f);
                f2.f = new k0(f);
                f2.g = new k0(f);
                f2.h = new k0(f);
                w80Var.b = f2.a();
                w80Var.c = null;
                w80Var.d();
            }
        }
    }

    public void setCornerRadiusResource(int i) {
        if (e()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    public void setCornerSpringForce(zo0 zo0Var) {
        w80 w80Var = this.f;
        w80Var.d = zo0Var;
        if (w80Var.c != null) {
            w80Var.d();
        }
    }

    public void setDisplayedWidthDecrease(int i) {
        this.F = Math.min(i, this.B);
        j();
        invalidate();
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        if (e()) {
            this.f.a(false).m(f);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.k != drawable) {
            this.k = drawable;
            h(true);
            i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.s != i) {
            this.s = i;
            i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i) {
        if (this.p != i) {
            this.p = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = r21.r(getContext(), i);
        } else {
            drawable = null;
        }
        setIcon(drawable);
    }

    public void setIconSize(int i) {
        if (i >= 0) {
            if (this.m != i) {
                this.m = i;
                h(true);
                return;
            }
            return;
        }
        c.k("iconSize cannot be less than 0");
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.j != colorStateList) {
            this.j = colorStateList;
            h(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.i != mode) {
            this.i = mode;
            h(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(mn.q(getContext(), i));
    }

    public void setInsetBottom(int i) {
        w80 w80Var = this.f;
        w80Var.b(w80Var.h, i);
    }

    public void setInsetTop(int i) {
        w80 w80Var = this.f;
        w80Var.b(i, w80Var.i);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(t80 t80Var) {
        this.h = t80Var;
    }

    public void setOpticalCenterEnabled(boolean z) {
        if (this.y != z) {
            this.y = z;
            w80 w80Var = this.f;
            if (z) {
                sf sfVar = new sf(4, this);
                w80Var.e = sfVar;
                m90 a = w80Var.a(false);
                if (a != null) {
                    a.F = sfVar;
                }
            } else {
                w80Var.e = null;
                m90 a2 = w80Var.a(false);
                if (a2 != null) {
                    a2.F = null;
                }
            }
            post(new x2(10, this));
        }
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        t80 t80Var = this.h;
        if (t80Var != null) {
            ((MaterialButtonToggleGroup) ((i81) t80Var).d).invalidate();
        }
        super.setPressed(z);
        f(false);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (e()) {
            w80 w80Var = this.f;
            MaterialButton materialButton = w80Var.a;
            if (w80Var.o != colorStateList) {
                w80Var.o = colorStateList;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(uj0.a(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        if (e()) {
            setRippleColor(mn.q(getContext(), i));
        }
    }

    @Override // defpackage.zn0
    public void setShapeAppearanceModel(on0 on0Var) {
        if (e()) {
            w80 w80Var = this.f;
            w80Var.b = on0Var;
            w80Var.c = null;
            w80Var.d();
            return;
        }
        c.o("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (e()) {
            w80 w80Var = this.f;
            w80Var.q = z;
            w80Var.e();
        }
    }

    public void setSizeChange(tp0 tp0Var) {
        if (this.C != tp0Var) {
            this.C = tp0Var;
            f(true);
        }
    }

    public void setStateListShapeAppearanceModel(rp0 rp0Var) {
        if (e()) {
            w80 w80Var = this.f;
            if (w80Var.d == null && rp0Var.d()) {
                w80Var.d = d();
                if (w80Var.c != null) {
                    w80Var.d();
                }
            }
            w80Var.c = rp0Var;
            w80Var.d();
            return;
        }
        c.o("Attempted to set StateListShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (e()) {
            w80 w80Var = this.f;
            if (w80Var.n != colorStateList) {
                w80Var.n = colorStateList;
                w80Var.e();
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (e()) {
            setStrokeColor(mn.q(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (e()) {
            w80 w80Var = this.f;
            if (w80Var.k != i) {
                w80Var.k = i;
                w80Var.e();
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (e()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // defpackage.h5
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (e()) {
            w80 w80Var = this.f;
            if (w80Var.m != colorStateList) {
                w80Var.m = colorStateList;
                if (w80Var.a(false) != null) {
                    w80Var.a(false).setTintList(w80Var.m);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintList(colorStateList);
    }

    @Override // defpackage.h5
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (e()) {
            w80 w80Var = this.f;
            if (w80Var.l != mode) {
                w80Var.l = mode;
                if (w80Var.a(false) != null && w80Var.l != null) {
                    w80Var.a(false).setTintMode(w80Var.l);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintMode(mode);
    }

    @Override // android.view.View
    public void setTextAlignment(int i) {
        super.setTextAlignment(i);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z) {
        this.f.u = z;
    }

    @Override // android.widget.TextView
    public void setWidth(int i) {
        this.u = -1.0f;
        super.setWidth(i);
    }

    public void setWidthChangeMax(int i) {
        if (this.D != i) {
            this.D = i;
            f(true);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.q);
    }
}
