package com.google.android.material.chip;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import defpackage.ah;
import defpackage.bh;
import defpackage.c;
import defpackage.f90;
import defpackage.i80;
import defpackage.ir0;
import defpackage.j5;
import defpackage.jd;
import defpackage.jr0;
import defpackage.k20;
import defpackage.kr0;
import defpackage.mg0;
import defpackage.mn;
import defpackage.on0;
import defpackage.r21;
import defpackage.ry0;
import defpackage.uj0;
import defpackage.wv0;
import defpackage.yd;
import defpackage.yg;
import defpackage.za0;
import defpackage.zg;
import defpackage.zn0;
import java.lang.ref.WeakReference;
import java.util.Locale;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public class Chip extends j5 implements zn0, Checkable {
    public bh g;
    public InsetDrawable h;
    public RippleDrawable i;
    public View.OnClickListener j;
    public CompoundButton.OnCheckedChangeListener k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public int q;
    public int r;
    public CharSequence s;
    public final ah t;
    public boolean u;
    public final Rect v;
    public final RectF w;
    public final yg x;
    public static final Rect y = new Rect();
    public static final int[] z = {R.attr.state_selected};
    public static final int[] A = {R.attr.state_checkable};

    public Chip(Context context, AttributeSet attributeSet) {
        super(r21.Q(context, attributeSet, svarzee.android.apps.adb_mouse.R.attr.chipStyle, svarzee.android.apps.adb_mouse.R.style.Widget_MaterialComponents_Chip_Action), attributeSet, svarzee.android.apps.adb_mouse.R.attr.chipStyle);
        ir0 ir0Var;
        za0 za0Var;
        za0 za0Var2;
        float dimension;
        int resourceId;
        int resourceId2;
        int resourceId3;
        this.v = new Rect();
        this.w = new RectF();
        this.x = new yg(0, this);
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") == null) {
                if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") == null) {
                    if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") == null) {
                        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") == null) {
                            if (attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) == 1 && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) == 1 && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) == 1) {
                                if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                                    Log.w("Chip", "Chip text must be vertically center and start aligned");
                                }
                            } else {
                                c.q("Chip does not support multi-line text");
                                throw null;
                            }
                        } else {
                            c.q("Please set end drawable using R.attr#closeIcon.");
                            throw null;
                        }
                    } else {
                        c.q("Please set end drawable using R.attr#closeIcon.");
                        throw null;
                    }
                } else {
                    c.q("Please set start drawable using R.attr#chipIcon.");
                    throw null;
                }
            } else {
                c.q("Please set left drawable using R.attr#chipIcon.");
                throw null;
            }
        }
        bh bhVar = new bh(context2, attributeSet);
        Context context3 = bhVar.p0;
        int[] iArr = mg0.d;
        TypedArray X = k20.X(context3, attributeSet, iArr, svarzee.android.apps.adb_mouse.R.attr.chipStyle, svarzee.android.apps.adb_mouse.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        bhVar.P0 = X.hasValue(37);
        Context context4 = bhVar.p0;
        ColorStateList w = k20.w(context4, X, 24);
        if (bhVar.I != w) {
            bhVar.I = w;
            bhVar.onStateChange(bhVar.getState());
        }
        ColorStateList w2 = k20.w(context4, X, 11);
        if (bhVar.J != w2) {
            bhVar.J = w2;
            bhVar.onStateChange(bhVar.getState());
        }
        float dimension2 = X.getDimension(19, 0.0f);
        if (bhVar.K != dimension2) {
            bhVar.K = dimension2;
            bhVar.invalidateSelf();
            bhVar.A();
        }
        if (X.hasValue(12)) {
            bhVar.G(X.getDimension(12, 0.0f));
        }
        bhVar.L(k20.w(context4, X, 22));
        bhVar.M(X.getDimension(23, 0.0f));
        bhVar.W(k20.w(context4, X, 36));
        String text = X.getText(5);
        text = text == null ? "" : text;
        if (!TextUtils.equals(bhVar.P, text)) {
            bhVar.P = text;
            bhVar.v0.d = true;
            bhVar.invalidateSelf();
            bhVar.A();
        }
        if (X.hasValue(0) && (resourceId3 = X.getResourceId(0, 0)) != 0) {
            ir0Var = new ir0(context4, resourceId3);
        } else {
            ir0Var = null;
        }
        ir0Var.l = X.getDimension(1, ir0Var.l);
        bhVar.X(ir0Var);
        int i = X.getInt(3, 0);
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    bhVar.M0 = TextUtils.TruncateAt.END;
                }
            } else {
                bhVar.M0 = TextUtils.TruncateAt.MIDDLE;
            }
        } else {
            bhVar.M0 = TextUtils.TruncateAt.START;
        }
        bhVar.K(X.getBoolean(18, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            bhVar.K(X.getBoolean(15, false));
        }
        bhVar.H(k20.z(context4, X, 14));
        if (X.hasValue(17)) {
            bhVar.J(k20.w(context4, X, 17));
        }
        bhVar.I(X.getDimension(16, -1.0f));
        bhVar.T(X.getBoolean(31, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            bhVar.T(X.getBoolean(26, false));
        }
        bhVar.N(k20.z(context4, X, 25));
        bhVar.S(k20.w(context4, X, 30));
        bhVar.P(X.getDimension(28, 0.0f));
        bhVar.C(X.getBoolean(6, false));
        bhVar.F(X.getBoolean(10, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            bhVar.F(X.getBoolean(8, false));
        }
        bhVar.D(k20.z(context4, X, 7));
        if (X.hasValue(9)) {
            bhVar.E(k20.w(context4, X, 9));
        }
        if (X.hasValue(39) && (resourceId2 = X.getResourceId(39, 0)) != 0) {
            za0Var = za0.a(context4, resourceId2);
        } else {
            za0Var = null;
        }
        bhVar.f0 = za0Var;
        if (X.hasValue(33) && (resourceId = X.getResourceId(33, 0)) != 0) {
            za0Var2 = za0.a(context4, resourceId);
        } else {
            za0Var2 = null;
        }
        bhVar.g0 = za0Var2;
        float dimension3 = X.getDimension(21, 0.0f);
        if (bhVar.h0 != dimension3) {
            bhVar.h0 = dimension3;
            bhVar.invalidateSelf();
            bhVar.A();
        }
        bhVar.V(X.getDimension(35, 0.0f));
        bhVar.U(X.getDimension(34, 0.0f));
        float dimension4 = X.getDimension(41, 0.0f);
        if (bhVar.k0 != dimension4) {
            bhVar.k0 = dimension4;
            bhVar.invalidateSelf();
            bhVar.A();
        }
        float dimension5 = X.getDimension(40, 0.0f);
        if (bhVar.l0 != dimension5) {
            bhVar.l0 = dimension5;
            bhVar.invalidateSelf();
            bhVar.A();
        }
        bhVar.Q(X.getDimension(29, 0.0f));
        bhVar.O(X.getDimension(27, 0.0f));
        float dimension6 = X.getDimension(13, 0.0f);
        if (bhVar.o0 != dimension6) {
            bhVar.o0 = dimension6;
            bhVar.invalidateSelf();
            bhVar.A();
        }
        bhVar.O0 = X.getDimensionPixelSize(4, Integer.MAX_VALUE);
        X.recycle();
        k20.i(context2, attributeSet, svarzee.android.apps.adb_mouse.R.attr.chipStyle, svarzee.android.apps.adb_mouse.R.style.Widget_MaterialComponents_Chip_Action);
        k20.j(context2, attributeSet, iArr, svarzee.android.apps.adb_mouse.R.attr.chipStyle, svarzee.android.apps.adb_mouse.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, svarzee.android.apps.adb_mouse.R.attr.chipStyle, svarzee.android.apps.adb_mouse.R.style.Widget_MaterialComponents_Chip_Action);
        this.p = obtainStyledAttributes.getBoolean(32, false);
        TypedValue L = mn.L(context2, svarzee.android.apps.adb_mouse.R.attr.minTouchTargetSize);
        if (L != null && L.type == 5) {
            dimension = L.getDimension(context2.getResources().getDisplayMetrics());
        } else {
            dimension = context2.getResources().getDimension(svarzee.android.apps.adb_mouse.R.dimen.mtrl_min_touch_target_size);
        }
        this.r = (int) Math.ceil(obtainStyledAttributes.getDimension(20, (int) dimension));
        obtainStyledAttributes.recycle();
        setChipDrawable(bhVar);
        bhVar.m(getElevation());
        k20.i(context2, attributeSet, svarzee.android.apps.adb_mouse.R.attr.chipStyle, svarzee.android.apps.adb_mouse.R.style.Widget_MaterialComponents_Chip_Action);
        k20.j(context2, attributeSet, iArr, svarzee.android.apps.adb_mouse.R.attr.chipStyle, svarzee.android.apps.adb_mouse.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr, svarzee.android.apps.adb_mouse.R.attr.chipStyle, svarzee.android.apps.adb_mouse.R.style.Widget_MaterialComponents_Chip_Action);
        boolean hasValue = obtainStyledAttributes2.hasValue(37);
        obtainStyledAttributes2.recycle();
        this.t = new ah(this, this);
        d();
        if (!hasValue) {
            setOutlineProvider(new zg(this));
        }
        setChecked(this.l);
        setText(bhVar.P);
        setEllipsize(bhVar.M0);
        g();
        if (!this.g.N0) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        f();
        if (this.p) {
            setMinHeight(this.r);
        }
        this.q = getLayoutDirection();
        super.setOnCheckedChangeListener(new i80(2, this));
    }

    private RectF getCloseIconTouchBounds() {
        RectF rectF = this.w;
        rectF.setEmpty();
        if (c() && this.j != null) {
            bh bhVar = this.g;
            Rect bounds = bhVar.getBounds();
            rectF.setEmpty();
            if (bhVar.a0()) {
                float f = bhVar.o0 + bhVar.n0 + bhVar.Z + bhVar.m0 + bhVar.l0;
                if (bhVar.getLayoutDirection() == 0) {
                    float f2 = bounds.right;
                    rectF.right = f2;
                    rectF.left = f2 - f;
                } else {
                    float f3 = bounds.left;
                    rectF.left = f3;
                    rectF.right = f3 + f;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
        }
        return rectF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        int i = (int) closeIconTouchBounds.left;
        int i2 = (int) closeIconTouchBounds.top;
        int i3 = (int) closeIconTouchBounds.right;
        int i4 = (int) closeIconTouchBounds.bottom;
        Rect rect = this.v;
        rect.set(i, i2, i3, i4);
        return rect;
    }

    private ir0 getTextAppearance() {
        bh bhVar = this.g;
        if (bhVar != null) {
            return bhVar.v0.f;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z2) {
        if (this.n != z2) {
            this.n = z2;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z2) {
        if (this.m != z2) {
            this.m = z2;
            refreshDrawableState();
        }
    }

    public final void b(int i) {
        int i2;
        this.r = i;
        int i3 = 0;
        if (!this.p) {
            InsetDrawable insetDrawable = this.h;
            if (insetDrawable != null) {
                if (insetDrawable != null) {
                    this.h = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    e();
                    return;
                }
                return;
            }
            e();
            return;
        }
        int max = Math.max(0, i - ((int) this.g.K));
        int max2 = Math.max(0, i - this.g.getIntrinsicWidth());
        if (max2 <= 0 && max <= 0) {
            InsetDrawable insetDrawable2 = this.h;
            if (insetDrawable2 != null) {
                if (insetDrawable2 != null) {
                    this.h = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    e();
                    return;
                }
                return;
            }
            e();
            return;
        }
        if (max2 > 0) {
            i2 = max2 / 2;
        } else {
            i2 = 0;
        }
        if (max > 0) {
            i3 = max / 2;
        }
        int i4 = i3;
        if (this.h != null) {
            Rect rect = new Rect();
            this.h.getPadding(rect);
            if (rect.top == i4 && rect.bottom == i4 && rect.left == i2 && rect.right == i2) {
                e();
                return;
            }
        }
        if (getMinHeight() != i) {
            setMinHeight(i);
        }
        if (getMinWidth() != i) {
            setMinWidth(i);
        }
        this.h = new InsetDrawable((Drawable) this.g, i2, i4, i2, i4);
        e();
    }

    public final boolean c() {
        bh bhVar = this.g;
        if (bhVar != null) {
            Drawable drawable = bhVar.W;
            if (drawable == null) {
                drawable = null;
            }
            if (drawable != null) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void d() {
        bh bhVar;
        if (c() && (bhVar = this.g) != null && bhVar.V && this.j != null) {
            ry0.m(this, this.t);
            this.u = true;
        } else {
            ry0.m(this, null);
            this.u = false;
        }
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i;
        if (!this.u) {
            return super.dispatchHoverEvent(motionEvent);
        }
        ah ahVar = this.t;
        AccessibilityManager accessibilityManager = ahVar.h;
        int i2 = 0;
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action != 7 && action != 9) {
                if (action == 10 && (i = ahVar.m) != Integer.MIN_VALUE) {
                    if (i != Integer.MIN_VALUE) {
                        ahVar.m = Integer.MIN_VALUE;
                        ahVar.q(Integer.MIN_VALUE, 128);
                        ahVar.q(i, 256);
                        return true;
                    }
                }
            } else {
                float x = motionEvent.getX();
                float y2 = motionEvent.getY();
                Chip chip = ahVar.n;
                if (chip.c() && chip.getCloseIconTouchBounds().contains(x, y2)) {
                    i2 = 1;
                }
                int i3 = ahVar.m;
                if (i3 != i2) {
                    ahVar.m = i2;
                    ahVar.q(i2, 128);
                    ahVar.q(i3, 256);
                    return true;
                }
            }
            return true;
        }
        if (!super.dispatchHoverEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.u) {
            return super.dispatchKeyEvent(keyEvent);
        }
        ah ahVar = this.t;
        ahVar.getClass();
        boolean z2 = false;
        int i = 0;
        z2 = false;
        z2 = false;
        z2 = false;
        z2 = false;
        z2 = false;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i2 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode != 19) {
                                    if (keyCode != 21) {
                                        if (keyCode != 22) {
                                            i2 = 130;
                                        }
                                    } else {
                                        i2 = 17;
                                    }
                                } else {
                                    i2 = 33;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z3 = false;
                                while (i < repeatCount && ahVar.m(i2, null)) {
                                    i++;
                                    z3 = true;
                                }
                                z2 = z3;
                                break;
                            }
                            break;
                    }
                }
                if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                    int i3 = ahVar.l;
                    if (i3 != Integer.MIN_VALUE) {
                        Chip chip = ahVar.n;
                        if (i3 == 0) {
                            chip.performClick();
                        } else if (i3 == 1) {
                            chip.playSoundEffect(0);
                            View.OnClickListener onClickListener = chip.j;
                            if (onClickListener != null) {
                                onClickListener.onClick(chip);
                            }
                            if (chip.u) {
                                chip.t.q(1, 1);
                            }
                        }
                    }
                    z2 = true;
                }
            } else if (keyEvent.hasNoModifiers()) {
                z2 = ahVar.m(2, null);
            } else if (keyEvent.hasModifiers(1)) {
                z2 = ahVar.m(1, null);
            }
        }
        if (z2 && ahVar.l != Integer.MIN_VALUE) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [int, boolean] */
    @Override // defpackage.j5, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        bh bhVar = this.g;
        boolean z2 = false;
        int i = 0;
        z2 = false;
        if (bhVar != null && bh.z(bhVar.W)) {
            bh bhVar2 = this.g;
            ?? isEnabled = isEnabled();
            int i2 = isEnabled;
            if (this.o) {
                i2 = isEnabled + 1;
            }
            int i3 = i2;
            if (this.n) {
                i3 = i2 + 1;
            }
            int i4 = i3;
            if (this.m) {
                i4 = i3 + 1;
            }
            int i5 = i4;
            if (isChecked()) {
                i5 = i4 + 1;
            }
            int[] iArr = new int[i5];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i = 1;
            }
            if (this.o) {
                iArr[i] = 16842908;
                i++;
            }
            if (this.n) {
                iArr[i] = 16843623;
                i++;
            }
            if (this.m) {
                iArr[i] = 16842919;
                i++;
            }
            if (isChecked()) {
                iArr[i] = 16842913;
            }
            z2 = bhVar2.R(iArr);
        }
        if (z2) {
            invalidate();
        }
    }

    public final void e() {
        this.i = new RippleDrawable(uj0.a(this.g.O), getBackgroundDrawable(), null);
        this.g.getClass();
        setBackground(this.i);
        f();
    }

    public final void f() {
        bh bhVar;
        if (!TextUtils.isEmpty(getText()) && (bhVar = this.g) != null) {
            int w = (int) (bhVar.w() + bhVar.o0 + bhVar.l0);
            bh bhVar2 = this.g;
            int v = (int) (bhVar2.v() + bhVar2.h0 + bhVar2.k0);
            if (this.h != null) {
                Rect rect = new Rect();
                this.h.getPadding(rect);
                v += rect.left;
                w += rect.right;
            }
            setPaddingRelative(v, getPaddingTop(), w, getPaddingBottom());
        }
    }

    public final void g() {
        TextPaint paint = getPaint();
        bh bhVar = this.g;
        if (bhVar != null) {
            paint.drawableState = bhVar.getState();
        }
        ir0 textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.d(getContext(), paint, this.x);
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.s)) {
            return this.s;
        }
        bh bhVar = this.g;
        if (bhVar != null && bhVar.b0) {
            getParent();
            return "android.widget.Button";
        }
        if (isClickable()) {
            return "android.widget.Button";
        }
        return "android.view.View";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.h;
        if (insetDrawable == null) {
            return this.g;
        }
        return insetDrawable;
    }

    public Drawable getCheckedIcon() {
        bh bhVar = this.g;
        if (bhVar != null) {
            return bhVar.d0;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        bh bhVar = this.g;
        if (bhVar != null) {
            return bhVar.e0;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        bh bhVar = this.g;
        if (bhVar != null) {
            return bhVar.J;
        }
        return null;
    }

    public float getChipCornerRadius() {
        bh bhVar = this.g;
        if (bhVar == null) {
            return 0.0f;
        }
        return Math.max(0.0f, bhVar.x());
    }

    public Drawable getChipDrawable() {
        return this.g;
    }

    public float getChipEndPadding() {
        bh bhVar = this.g;
        if (bhVar != null) {
            return bhVar.o0;
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        Drawable drawable;
        bh bhVar = this.g;
        if (bhVar == null || (drawable = bhVar.R) == null) {
            return null;
        }
        return drawable;
    }

    public float getChipIconSize() {
        bh bhVar = this.g;
        if (bhVar != null) {
            return bhVar.T;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        bh bhVar = this.g;
        if (bhVar != null) {
            return bhVar.S;
        }
        return null;
    }

    public float getChipMinHeight() {
        bh bhVar = this.g;
        if (bhVar != null) {
            return bhVar.K;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        bh bhVar = this.g;
        if (bhVar != null) {
            return bhVar.h0;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        bh bhVar = this.g;
        if (bhVar != null) {
            return bhVar.M;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        bh bhVar = this.g;
        if (bhVar != null) {
            return bhVar.N;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        Drawable drawable;
        bh bhVar = this.g;
        if (bhVar == null || (drawable = bhVar.W) == null) {
            return null;
        }
        return drawable;
    }

    public CharSequence getCloseIconContentDescription() {
        bh bhVar = this.g;
        if (bhVar != null) {
            return bhVar.a0;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        bh bhVar = this.g;
        if (bhVar != null) {
            return bhVar.n0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        bh bhVar = this.g;
        if (bhVar != null) {
            return bhVar.Z;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        bh bhVar = this.g;
        if (bhVar != null) {
            return bhVar.m0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        bh bhVar = this.g;
        if (bhVar != null) {
            return bhVar.Y;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        bh bhVar = this.g;
        if (bhVar != null) {
            return bhVar.M0;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.u) {
            ah ahVar = this.t;
            if (ahVar.l == 1 || ahVar.k == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public za0 getHideMotionSpec() {
        bh bhVar = this.g;
        if (bhVar != null) {
            return bhVar.g0;
        }
        return null;
    }

    public float getIconEndPadding() {
        bh bhVar = this.g;
        if (bhVar != null) {
            return bhVar.j0;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        bh bhVar = this.g;
        if (bhVar != null) {
            return bhVar.i0;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        bh bhVar = this.g;
        if (bhVar != null) {
            return bhVar.O;
        }
        return null;
    }

    public on0 getShapeAppearanceModel() {
        return this.g.d.a;
    }

    public za0 getShowMotionSpec() {
        bh bhVar = this.g;
        if (bhVar != null) {
            return bhVar.f0;
        }
        return null;
    }

    public float getTextEndPadding() {
        bh bhVar = this.g;
        if (bhVar != null) {
            return bhVar.l0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        bh bhVar = this.g;
        if (bhVar != null) {
            return bhVar.k0;
        }
        return 0.0f;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        wv0.X(this, this.g);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, z);
        }
        bh bhVar = this.g;
        if (bhVar != null && bhVar.b0) {
            View.mergeDrawableStates(onCreateDrawableState, A);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z2, int i, Rect rect) {
        super.onFocusChanged(z2, i, rect);
        if (this.u) {
            ah ahVar = this.t;
            int i2 = ahVar.l;
            if (i2 != Integer.MIN_VALUE) {
                ahVar.j(i2);
            }
            if (z2) {
                ahVar.m(i, rect);
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10) {
                setCloseIconHovered(false);
            }
        } else {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z2;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        bh bhVar = this.g;
        if (bhVar != null && bhVar.b0) {
            z2 = true;
        } else {
            z2 = false;
        }
        accessibilityNodeInfo.setCheckable(z2);
        accessibilityNodeInfo.setClickable(isClickable());
        getParent();
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        if (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) {
            return PointerIcon.getSystemIcon(getContext(), 1002);
        }
        return super.onResolvePointerIcon(motionEvent, i);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.q != i) {
            this.q = i;
            f();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
    
        if (r0 != 3) goto L28;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L4a
            if (r0 == r2) goto L2c
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L45
            goto L50
        L21:
            boolean r0 = r5.m
            if (r0 == 0) goto L50
            if (r1 != 0) goto L2a
            r5.setCloseIconPressed(r3)
        L2a:
            r0 = r2
            goto L51
        L2c:
            boolean r0 = r5.m
            if (r0 == 0) goto L45
            r5.playSoundEffect(r3)
            android.view.View$OnClickListener r0 = r5.j
            if (r0 == 0) goto L3a
            r0.onClick(r5)
        L3a:
            boolean r0 = r5.u
            if (r0 == 0) goto L43
            ah r0 = r5.t
            r0.q(r2, r2)
        L43:
            r0 = r2
            goto L46
        L45:
            r0 = r3
        L46:
            r5.setCloseIconPressed(r3)
            goto L51
        L4a:
            if (r1 == 0) goto L50
            r5.setCloseIconPressed(r2)
            goto L2a
        L50:
            r0 = r3
        L51:
            if (r0 != 0) goto L5b
            boolean r5 = super.onTouchEvent(r6)
            if (r5 == 0) goto L5a
            goto L5b
        L5a:
            return r3
        L5b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.s = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable != getBackgroundDrawable() && drawable != this.i) {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        } else {
            super.setBackground(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // defpackage.j5, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != getBackgroundDrawable() && drawable != this.i) {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        } else {
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // defpackage.j5, android.view.View
    public void setBackgroundResource(int i) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z2) {
        bh bhVar = this.g;
        if (bhVar != null) {
            bhVar.C(z2);
        }
    }

    public void setCheckableResource(int i) {
        bh bhVar = this.g;
        if (bhVar != null) {
            bhVar.C(bhVar.p0.getResources().getBoolean(i));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z2) {
        bh bhVar = this.g;
        if (bhVar == null) {
            this.l = z2;
        } else if (bhVar.b0) {
            super.setChecked(z2);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        bh bhVar = this.g;
        if (bhVar != null) {
            bhVar.D(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z2) {
        setCheckedIconVisible(z2);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(int i) {
        bh bhVar = this.g;
        if (bhVar != null) {
            bhVar.D(r21.r(bhVar.p0, i));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        bh bhVar = this.g;
        if (bhVar != null) {
            bhVar.E(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        bh bhVar = this.g;
        if (bhVar != null) {
            bhVar.E(mn.q(bhVar.p0, i));
        }
    }

    public void setCheckedIconVisible(int i) {
        bh bhVar = this.g;
        if (bhVar != null) {
            bhVar.F(bhVar.p0.getResources().getBoolean(i));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        bh bhVar = this.g;
        if (bhVar != null && bhVar.J != colorStateList) {
            bhVar.J = colorStateList;
            bhVar.onStateChange(bhVar.getState());
        }
    }

    public void setChipBackgroundColorResource(int i) {
        ColorStateList q;
        bh bhVar = this.g;
        if (bhVar != null && bhVar.J != (q = mn.q(bhVar.p0, i))) {
            bhVar.J = q;
            bhVar.onStateChange(bhVar.getState());
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        bh bhVar = this.g;
        if (bhVar != null) {
            bhVar.G(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        bh bhVar = this.g;
        if (bhVar != null) {
            bhVar.G(bhVar.p0.getResources().getDimension(i));
        }
    }

    public void setChipDrawable(bh bhVar) {
        bh bhVar2 = this.g;
        if (bhVar2 != bhVar) {
            if (bhVar2 != null) {
                bhVar2.L0 = new WeakReference(null);
            }
            this.g = bhVar;
            bhVar.N0 = false;
            bhVar.L0 = new WeakReference(this);
            b(this.r);
        }
    }

    public void setChipEndPadding(float f) {
        bh bhVar = this.g;
        if (bhVar != null && bhVar.o0 != f) {
            bhVar.o0 = f;
            bhVar.invalidateSelf();
            bhVar.A();
        }
    }

    public void setChipEndPaddingResource(int i) {
        bh bhVar = this.g;
        if (bhVar != null) {
            float dimension = bhVar.p0.getResources().getDimension(i);
            if (bhVar.o0 != dimension) {
                bhVar.o0 = dimension;
                bhVar.invalidateSelf();
                bhVar.A();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        bh bhVar = this.g;
        if (bhVar != null) {
            bhVar.H(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z2) {
        setChipIconVisible(z2);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(int i) {
        bh bhVar = this.g;
        if (bhVar != null) {
            bhVar.H(r21.r(bhVar.p0, i));
        }
    }

    public void setChipIconSize(float f) {
        bh bhVar = this.g;
        if (bhVar != null) {
            bhVar.I(f);
        }
    }

    public void setChipIconSizeResource(int i) {
        bh bhVar = this.g;
        if (bhVar != null) {
            bhVar.I(bhVar.p0.getResources().getDimension(i));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        bh bhVar = this.g;
        if (bhVar != null) {
            bhVar.J(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        bh bhVar = this.g;
        if (bhVar != null) {
            bhVar.J(mn.q(bhVar.p0, i));
        }
    }

    public void setChipIconVisible(int i) {
        bh bhVar = this.g;
        if (bhVar != null) {
            bhVar.K(bhVar.p0.getResources().getBoolean(i));
        }
    }

    public void setChipMinHeight(float f) {
        bh bhVar = this.g;
        if (bhVar != null && bhVar.K != f) {
            bhVar.K = f;
            bhVar.invalidateSelf();
            bhVar.A();
        }
    }

    public void setChipMinHeightResource(int i) {
        bh bhVar = this.g;
        if (bhVar != null) {
            float dimension = bhVar.p0.getResources().getDimension(i);
            if (bhVar.K != dimension) {
                bhVar.K = dimension;
                bhVar.invalidateSelf();
                bhVar.A();
            }
        }
    }

    public void setChipStartPadding(float f) {
        bh bhVar = this.g;
        if (bhVar != null && bhVar.h0 != f) {
            bhVar.h0 = f;
            bhVar.invalidateSelf();
            bhVar.A();
        }
    }

    public void setChipStartPaddingResource(int i) {
        bh bhVar = this.g;
        if (bhVar != null) {
            float dimension = bhVar.p0.getResources().getDimension(i);
            if (bhVar.h0 != dimension) {
                bhVar.h0 = dimension;
                bhVar.invalidateSelf();
                bhVar.A();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        bh bhVar = this.g;
        if (bhVar != null) {
            bhVar.L(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        bh bhVar = this.g;
        if (bhVar != null) {
            bhVar.L(mn.q(bhVar.p0, i));
        }
    }

    public void setChipStrokeWidth(float f) {
        bh bhVar = this.g;
        if (bhVar != null) {
            bhVar.M(f);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        bh bhVar = this.g;
        if (bhVar != null) {
            bhVar.M(bhVar.p0.getResources().getDimension(i));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(Drawable drawable) {
        bh bhVar = this.g;
        if (bhVar != null) {
            bhVar.N(drawable);
        }
        d();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        jd jdVar;
        bh bhVar = this.g;
        if (bhVar != null && bhVar.a0 != charSequence) {
            String str = jd.b;
            if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
                jdVar = jd.e;
            } else {
                jdVar = jd.d;
            }
            jdVar.getClass();
            yd ydVar = jr0.a;
            bhVar.a0 = jdVar.c(charSequence);
            bhVar.invalidateSelf();
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z2) {
        setCloseIconVisible(z2);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f) {
        bh bhVar = this.g;
        if (bhVar != null) {
            bhVar.O(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        bh bhVar = this.g;
        if (bhVar != null) {
            bhVar.O(bhVar.p0.getResources().getDimension(i));
        }
    }

    public void setCloseIconResource(int i) {
        bh bhVar = this.g;
        if (bhVar != null) {
            bhVar.N(r21.r(bhVar.p0, i));
        }
        d();
    }

    public void setCloseIconSize(float f) {
        bh bhVar = this.g;
        if (bhVar != null) {
            bhVar.P(f);
        }
    }

    public void setCloseIconSizeResource(int i) {
        bh bhVar = this.g;
        if (bhVar != null) {
            bhVar.P(bhVar.p0.getResources().getDimension(i));
        }
    }

    public void setCloseIconStartPadding(float f) {
        bh bhVar = this.g;
        if (bhVar != null) {
            bhVar.Q(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        bh bhVar = this.g;
        if (bhVar != null) {
            bhVar.Q(bhVar.p0.getResources().getDimension(i));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        bh bhVar = this.g;
        if (bhVar != null) {
            bhVar.S(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        bh bhVar = this.g;
        if (bhVar != null) {
            bhVar.S(mn.q(bhVar.p0, i));
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    @Override // defpackage.j5, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable == null) {
            if (drawable3 == null) {
                super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
                return;
            } else {
                c.q("Please set end drawable using R.attr#closeIcon.");
                return;
            }
        }
        c.q("Please set start drawable using R.attr#chipIcon.");
    }

    @Override // defpackage.j5, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable == null) {
            if (drawable3 == null) {
                super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
                return;
            } else {
                c.q("Please set end drawable using R.attr#closeIcon.");
                return;
            }
        }
        c.q("Please set start drawable using R.attr#chipIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i == 0) {
            if (i3 == 0) {
                super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
                return;
            } else {
                c.q("Please set end drawable using R.attr#closeIcon.");
                return;
            }
        }
        c.q("Please set start drawable using R.attr#chipIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i == 0) {
            if (i3 == 0) {
                super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
                return;
            } else {
                c.q("Please set end drawable using R.attr#closeIcon.");
                return;
            }
        }
        c.q("Please set start drawable using R.attr#chipIcon.");
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        bh bhVar = this.g;
        if (bhVar != null) {
            bhVar.m(f);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.g != null) {
            if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
                super.setEllipsize(truncateAt);
                bh bhVar = this.g;
                if (bhVar != null) {
                    bhVar.M0 = truncateAt;
                    return;
                }
                return;
            }
            c.q("Text within a chip are not allowed to scroll.");
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z2) {
        this.p = z2;
        b(this.r);
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        if (i != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i);
        }
    }

    public void setHideMotionSpec(za0 za0Var) {
        bh bhVar = this.g;
        if (bhVar != null) {
            bhVar.g0 = za0Var;
        }
    }

    public void setHideMotionSpecResource(int i) {
        bh bhVar = this.g;
        if (bhVar != null) {
            bhVar.g0 = za0.a(bhVar.p0, i);
        }
    }

    public void setIconEndPadding(float f) {
        bh bhVar = this.g;
        if (bhVar != null) {
            bhVar.U(f);
        }
    }

    public void setIconEndPaddingResource(int i) {
        bh bhVar = this.g;
        if (bhVar != null) {
            bhVar.U(bhVar.p0.getResources().getDimension(i));
        }
    }

    public void setIconStartPadding(float f) {
        bh bhVar = this.g;
        if (bhVar != null) {
            bhVar.V(f);
        }
    }

    public void setIconStartPaddingResource(int i) {
        bh bhVar = this.g;
        if (bhVar != null) {
            bhVar.V(bhVar.p0.getResources().getDimension(i));
        }
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        if (this.g == null) {
            return;
        }
        super.setLayoutDirection(i);
    }

    @Override // android.widget.TextView
    public void setLines(int i) {
        if (i <= 1) {
            super.setLines(i);
        } else {
            c.q("Chip does not support multi-line text");
        }
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        if (i <= 1) {
            super.setMaxLines(i);
        } else {
            c.q("Chip does not support multi-line text");
        }
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        bh bhVar = this.g;
        if (bhVar != null) {
            bhVar.O0 = i;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i) {
        if (i <= 1) {
            super.setMinLines(i);
        } else {
            c.q("Chip does not support multi-line text");
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.k = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.j = onClickListener;
        d();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        bh bhVar = this.g;
        if (bhVar != null) {
            bhVar.W(colorStateList);
        }
        this.g.getClass();
        e();
    }

    public void setRippleColorResource(int i) {
        bh bhVar = this.g;
        if (bhVar != null) {
            bhVar.W(mn.q(bhVar.p0, i));
            this.g.getClass();
            e();
        }
    }

    @Override // defpackage.zn0
    public void setShapeAppearanceModel(on0 on0Var) {
        this.g.setShapeAppearanceModel(on0Var);
    }

    public void setShowMotionSpec(za0 za0Var) {
        bh bhVar = this.g;
        if (bhVar != null) {
            bhVar.f0 = za0Var;
        }
    }

    public void setShowMotionSpecResource(int i) {
        bh bhVar = this.g;
        if (bhVar != null) {
            bhVar.f0 = za0.a(bhVar.p0, i);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z2) {
        if (z2) {
            super.setSingleLine(z2);
        } else {
            c.q("Chip does not support multi-line text");
        }
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        CharSequence charSequence2;
        bh bhVar = this.g;
        if (bhVar != null) {
            if (charSequence == null) {
                charSequence = "";
            }
            if (bhVar.N0) {
                charSequence2 = null;
            } else {
                charSequence2 = charSequence;
            }
            super.setText(charSequence2, bufferType);
            bh bhVar2 = this.g;
            if (bhVar2 != null && !TextUtils.equals(bhVar2.P, charSequence)) {
                bhVar2.P = charSequence;
                bhVar2.v0.d = true;
                bhVar2.invalidateSelf();
                bhVar2.A();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        bh bhVar = this.g;
        if (bhVar != null) {
            bhVar.X(new ir0(bhVar.p0, i));
        }
        g();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f) {
        bh bhVar = this.g;
        if (bhVar != null && bhVar.l0 != f) {
            bhVar.l0 = f;
            bhVar.invalidateSelf();
            bhVar.A();
        }
    }

    public void setTextEndPaddingResource(int i) {
        bh bhVar = this.g;
        if (bhVar != null) {
            float dimension = bhVar.p0.getResources().getDimension(i);
            if (bhVar.l0 != dimension) {
                bhVar.l0 = dimension;
                bhVar.invalidateSelf();
                bhVar.A();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        bh bhVar = this.g;
        if (bhVar != null) {
            float applyDimension = TypedValue.applyDimension(i, f, getResources().getDisplayMetrics());
            kr0 kr0Var = bhVar.v0;
            ir0 ir0Var = kr0Var.f;
            if (ir0Var != null) {
                ir0Var.l = applyDimension;
                kr0Var.a.setTextSize(applyDimension);
                bhVar.A();
                bhVar.invalidateSelf();
            }
        }
        g();
    }

    public void setTextStartPadding(float f) {
        bh bhVar = this.g;
        if (bhVar != null && bhVar.k0 != f) {
            bhVar.k0 = f;
            bhVar.invalidateSelf();
            bhVar.A();
        }
    }

    public void setTextStartPaddingResource(int i) {
        bh bhVar = this.g;
        if (bhVar != null) {
            float dimension = bhVar.p0.getResources().getDimension(i);
            if (bhVar.k0 != dimension) {
                bhVar.k0 = dimension;
                bhVar.invalidateSelf();
                bhVar.A();
            }
        }
    }

    public void setCloseIconVisible(boolean z2) {
        bh bhVar = this.g;
        if (bhVar != null) {
            bhVar.T(z2);
        }
        d();
    }

    public void setCheckedIconVisible(boolean z2) {
        bh bhVar = this.g;
        if (bhVar != null) {
            bhVar.F(z2);
        }
    }

    public void setChipIconVisible(boolean z2) {
        bh bhVar = this.g;
        if (bhVar != null) {
            bhVar.K(z2);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            c.q("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            c.q("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            c.q("Please set left drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            c.q("Please set right drawable using R.attr#closeIcon.");
        }
    }

    public void setTextAppearance(ir0 ir0Var) {
        bh bhVar = this.g;
        if (bhVar != null) {
            bhVar.X(ir0Var);
        }
        g();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        bh bhVar = this.g;
        if (bhVar != null) {
            bhVar.X(new ir0(bhVar.p0, i));
        }
        g();
    }

    public void setInternalOnCheckedChangeListener(f90 f90Var) {
    }
}
