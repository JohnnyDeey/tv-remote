package com.google.android.material.textfield;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.Editable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.internal.CheckableImageButton;
import defpackage.al;
import defpackage.am;
import defpackage.ap;
import defpackage.b8;
import defpackage.bs;
import defpackage.bv;
import defpackage.c;
import defpackage.df;
import defpackage.di;
import defpackage.eu;
import defpackage.f20;
import defpackage.f40;
import defpackage.fu0;
import defpackage.gu;
import defpackage.i81;
import defpackage.ir0;
import defpackage.j0;
import defpackage.j6;
import defpackage.jd;
import defpackage.jr0;
import defpackage.k0;
import defpackage.k20;
import defpackage.k90;
import defpackage.l9;
import defpackage.lr;
import defpackage.lr0;
import defpackage.m90;
import defpackage.mg0;
import defpackage.mn;
import defpackage.mr0;
import defpackage.nn0;
import defpackage.nr0;
import defpackage.oi;
import defpackage.on0;
import defpackage.op0;
import defpackage.or0;
import defpackage.r21;
import defpackage.ry0;
import defpackage.s7;
import defpackage.s80;
import defpackage.sf;
import defpackage.up0;
import defpackage.v10;
import defpackage.w10;
import defpackage.wv0;
import defpackage.x2;
import defpackage.x4;
import defpackage.xd;
import defpackage.y80;
import defpackage.yd;
import defpackage.zl;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final int[][] F0 = {new int[]{R.attr.state_pressed}, new int[0]};
    public bv A;
    public boolean A0;
    public ColorStateList B;
    public ValueAnimator B0;
    public ColorStateList C;
    public boolean C0;
    public ColorStateList D;
    public boolean D0;
    public ColorStateList E;
    public boolean E0;
    public boolean F;
    public CharSequence G;
    public boolean H;
    public m90 I;
    public m90 J;
    public StateListDrawable K;
    public boolean L;
    public m90 M;
    public m90 N;
    public on0 O;
    public boolean P;
    public final int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public int W;
    public int a0;
    public final Rect b0;
    public final FrameLayout c;
    public final Rect c0;
    public final op0 d;
    public final RectF d0;
    public final gu e;
    public Typeface e0;
    public final int f;
    public ColorDrawable f0;
    public EditText g;
    public int g0;
    public CharSequence h;
    public final LinkedHashSet h0;
    public int i;
    public ColorDrawable i0;
    public int j;
    public int j0;
    public int k;
    public Drawable k0;
    public int l;
    public ColorStateList l0;
    public final w10 m;
    public ColorStateList m0;
    public boolean n;
    public int n0;
    public int o;
    public int o0;
    public boolean p;
    public int p0;
    public nr0 q;
    public ColorStateList q0;
    public s7 r;
    public int r0;
    public int s;
    public int s0;
    public int t;
    public int t0;
    public CharSequence u;
    public int u0;
    public boolean v;
    public int v0;
    public s7 w;
    public int w0;
    public ColorStateList x;
    public boolean x0;
    public int y;
    public final di y0;
    public bv z;
    public boolean z0;

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        super(r21.Q(context, attributeSet, svarzee.android.apps.adb_mouse.R.attr.textInputStyle, svarzee.android.apps.adb_mouse.R.style.Widget_Design_TextInputLayout), attributeSet, svarzee.android.apps.adb_mouse.R.attr.textInputStyle);
        this.i = -1;
        this.j = -1;
        this.k = -1;
        this.l = -1;
        this.m = new w10(this);
        this.q = new f40(10);
        this.b0 = new Rect();
        this.c0 = new Rect();
        this.d0 = new RectF();
        this.h0 = new LinkedHashSet();
        di diVar = new di(this);
        this.y0 = diVar;
        this.E0 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.c = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = x4.a;
        diVar.R = linearInterpolator;
        diVar.j(false);
        diVar.Q = linearInterpolator;
        diVar.j(false);
        if (diVar.g != 8388659) {
            diVar.g = 8388659;
            diVar.j(false);
        }
        k20.i(context2, attributeSet, svarzee.android.apps.adb_mouse.R.attr.textInputStyle, svarzee.android.apps.adb_mouse.R.style.Widget_Design_TextInputLayout);
        int[] iArr = mg0.F;
        k20.j(context2, attributeSet, iArr, svarzee.android.apps.adb_mouse.R.attr.textInputStyle, svarzee.android.apps.adb_mouse.R.style.Widget_Design_TextInputLayout, 22, 20, 40, 45, 50);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, svarzee.android.apps.adb_mouse.R.attr.textInputStyle, svarzee.android.apps.adb_mouse.R.style.Widget_Design_TextInputLayout);
        b8 b8Var = new b8(context2, obtainStyledAttributes);
        op0 op0Var = new op0(this, b8Var);
        this.d = op0Var;
        this.F = obtainStyledAttributes.getBoolean(48, true);
        setHint(obtainStyledAttributes.getText(4));
        this.A0 = obtainStyledAttributes.getBoolean(47, true);
        this.z0 = obtainStyledAttributes.getBoolean(42, true);
        if (obtainStyledAttributes.hasValue(6)) {
            setMinEms(obtainStyledAttributes.getInt(6, -1));
        } else if (obtainStyledAttributes.hasValue(3)) {
            setMinWidth(obtainStyledAttributes.getDimensionPixelSize(3, -1));
        }
        if (obtainStyledAttributes.hasValue(5)) {
            setMaxEms(obtainStyledAttributes.getInt(5, -1));
        } else if (obtainStyledAttributes.hasValue(2)) {
            setMaxWidth(obtainStyledAttributes.getDimensionPixelSize(2, -1));
        }
        this.O = on0.b(context2, attributeSet, svarzee.android.apps.adb_mouse.R.attr.textInputStyle, svarzee.android.apps.adb_mouse.R.style.Widget_Design_TextInputLayout).a();
        this.Q = context2.getResources().getDimensionPixelOffset(svarzee.android.apps.adb_mouse.R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.S = obtainStyledAttributes.getDimensionPixelOffset(9, 0);
        this.f = getResources().getDimensionPixelSize(svarzee.android.apps.adb_mouse.R.dimen.m3_multiline_hint_filled_text_extra_space);
        this.U = obtainStyledAttributes.getDimensionPixelSize(16, context2.getResources().getDimensionPixelSize(svarzee.android.apps.adb_mouse.R.dimen.mtrl_textinput_box_stroke_width_default));
        this.V = obtainStyledAttributes.getDimensionPixelSize(17, context2.getResources().getDimensionPixelSize(svarzee.android.apps.adb_mouse.R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.T = this.U;
        float dimension = obtainStyledAttributes.getDimension(13, -1.0f);
        float dimension2 = obtainStyledAttributes.getDimension(12, -1.0f);
        float dimension3 = obtainStyledAttributes.getDimension(10, -1.0f);
        float dimension4 = obtainStyledAttributes.getDimension(11, -1.0f);
        nn0 f = this.O.f();
        if (dimension >= 0.0f) {
            f.e = new k0(dimension);
        }
        if (dimension2 >= 0.0f) {
            f.f = new k0(dimension2);
        }
        if (dimension3 >= 0.0f) {
            f.g = new k0(dimension3);
        }
        if (dimension4 >= 0.0f) {
            f.h = new k0(dimension4);
        }
        this.O = f.a();
        ColorStateList v = k20.v(context2, b8Var, 7);
        if (v != null) {
            int defaultColor = v.getDefaultColor();
            this.r0 = defaultColor;
            this.a0 = defaultColor;
            if (v.isStateful()) {
                this.s0 = v.getColorForState(new int[]{-16842910}, -1);
                this.t0 = v.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.u0 = v.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.t0 = this.r0;
                ColorStateList q = mn.q(context2, svarzee.android.apps.adb_mouse.R.color.mtrl_filled_background_color);
                this.s0 = q.getColorForState(new int[]{-16842910}, -1);
                this.u0 = q.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.a0 = 0;
            this.r0 = 0;
            this.s0 = 0;
            this.t0 = 0;
            this.u0 = 0;
        }
        if (obtainStyledAttributes.hasValue(1)) {
            ColorStateList y = b8Var.y(1);
            this.m0 = y;
            this.l0 = y;
        }
        ColorStateList v2 = k20.v(context2, b8Var, 14);
        this.p0 = obtainStyledAttributes.getColor(14, 0);
        this.n0 = context2.getColor(svarzee.android.apps.adb_mouse.R.color.mtrl_textinput_default_box_stroke_color);
        this.v0 = context2.getColor(svarzee.android.apps.adb_mouse.R.color.mtrl_textinput_disabled_color);
        this.o0 = context2.getColor(svarzee.android.apps.adb_mouse.R.color.mtrl_textinput_hovered_box_stroke_color);
        if (v2 != null) {
            setBoxStrokeColorStateList(v2);
        }
        if (obtainStyledAttributes.hasValue(15)) {
            setBoxStrokeErrorColor(k20.v(context2, b8Var, 15));
        }
        if (obtainStyledAttributes.getResourceId(50, -1) != -1) {
            setHintTextAppearance(obtainStyledAttributes.getResourceId(50, 0));
        }
        this.D = b8Var.y(24);
        this.E = b8Var.y(25);
        int resourceId = obtainStyledAttributes.getResourceId(40, 0);
        CharSequence text = obtainStyledAttributes.getText(35);
        int i = obtainStyledAttributes.getInt(34, 1);
        boolean z = obtainStyledAttributes.getBoolean(36, false);
        int resourceId2 = obtainStyledAttributes.getResourceId(45, 0);
        boolean z2 = obtainStyledAttributes.getBoolean(44, false);
        CharSequence text2 = obtainStyledAttributes.getText(43);
        int resourceId3 = obtainStyledAttributes.getResourceId(58, 0);
        CharSequence text3 = obtainStyledAttributes.getText(57);
        boolean z3 = obtainStyledAttributes.getBoolean(18, false);
        setCounterMaxLength(obtainStyledAttributes.getInt(19, -1));
        this.t = obtainStyledAttributes.getResourceId(22, 0);
        this.s = obtainStyledAttributes.getResourceId(20, 0);
        setBoxBackgroundMode(obtainStyledAttributes.getInt(8, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i);
        setCounterOverflowTextAppearance(this.s);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.t);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (obtainStyledAttributes.hasValue(41)) {
            setErrorTextColor(b8Var.y(41));
        }
        if (obtainStyledAttributes.hasValue(46)) {
            setHelperTextColor(b8Var.y(46));
        }
        if (obtainStyledAttributes.hasValue(51)) {
            setHintTextColor(b8Var.y(51));
        }
        if (obtainStyledAttributes.hasValue(23)) {
            setCounterTextColor(b8Var.y(23));
        }
        if (obtainStyledAttributes.hasValue(21)) {
            setCounterOverflowTextColor(b8Var.y(21));
        }
        if (obtainStyledAttributes.hasValue(59)) {
            setPlaceholderTextColor(b8Var.y(59));
        }
        gu guVar = new gu(this, b8Var);
        this.e = guVar;
        boolean z4 = obtainStyledAttributes.getBoolean(0, true);
        setHintMaxLines(obtainStyledAttributes.getInt(49, 1));
        b8Var.N();
        setImportantForAccessibility(2);
        if (Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(1);
        }
        frameLayout.addView(op0Var);
        frameLayout.addView(guVar);
        addView(frameLayout);
        setEnabled(z4);
        setHelperTextEnabled(z2);
        setErrorEnabled(z);
        setCounterEnabled(z3);
        setHelperText(text2);
    }

    private Drawable getEditTextBoxBackground() {
        int i;
        EditText editText = this.g;
        if ((editText instanceof AutoCompleteTextView) && editText.getInputType() == 0) {
            int x = f20.x(this.g, svarzee.android.apps.adb_mouse.R.attr.colorControlHighlight);
            int i2 = this.R;
            int[][] iArr = F0;
            if (i2 == 2) {
                Context context = getContext();
                m90 m90Var = this.I;
                TypedValue N = mn.N(svarzee.android.apps.adb_mouse.R.attr.colorSurface, context, "TextInputLayout");
                int i3 = N.resourceId;
                if (i3 != 0) {
                    i = context.getColor(i3);
                } else {
                    i = N.data;
                }
                m90 m90Var2 = new m90(m90Var.d.a);
                int O = f20.O(x, i, 0.1f);
                m90Var2.n(new ColorStateList(iArr, new int[]{O, 0}));
                m90Var2.setTint(i);
                ColorStateList colorStateList = new ColorStateList(iArr, new int[]{O, i});
                m90 m90Var3 = new m90(m90Var.d.a);
                m90Var3.setTint(-1);
                return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, m90Var2, m90Var3), m90Var});
            }
            if (i2 == 1) {
                m90 m90Var4 = this.I;
                int i4 = this.a0;
                return new RippleDrawable(new ColorStateList(iArr, new int[]{f20.O(x, i4, 0.1f), i4}), m90Var4, m90Var4);
            }
            return null;
        }
        return this.I;
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.K == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.K = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.K.addState(new int[0], h(false));
        }
        return this.K;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.J == null) {
            this.J = h(true);
        }
        return this.J;
    }

    public static void m(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                m((ViewGroup) childAt, z);
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.g == null) {
            if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
                Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
            }
            this.g = editText;
            int i = this.i;
            if (i != -1) {
                setMinEms(i);
            } else {
                setMinWidth(this.k);
            }
            int i2 = this.j;
            if (i2 != -1) {
                setMaxEms(i2);
            } else {
                setMaxWidth(this.l);
            }
            this.L = false;
            k();
            setTextInputAccessibilityDelegate(new mr0(this));
            Typeface typeface = this.g.getTypeface();
            di diVar = this.y0;
            diVar.n(typeface);
            float textSize = this.g.getTextSize();
            if (diVar.h != textSize) {
                diVar.h = textSize;
                diVar.j(false);
            }
            float letterSpacing = this.g.getLetterSpacing();
            if (diVar.X != letterSpacing) {
                diVar.X = letterSpacing;
                diVar.j(false);
            }
            int gravity = this.g.getGravity();
            int i3 = (gravity & (-113)) | 48;
            if (diVar.g != i3) {
                diVar.g = i3;
                diVar.j(false);
            }
            if (diVar.f != gravity) {
                diVar.f = gravity;
                diVar.j(false);
            }
            this.w0 = editText.getMinimumHeight();
            this.g.addTextChangedListener(new lr0(this, editText));
            if (this.l0 == null) {
                this.l0 = this.g.getHintTextColors();
            }
            if (this.F) {
                if (TextUtils.isEmpty(this.G)) {
                    CharSequence hint = this.g.getHint();
                    this.h = hint;
                    setHint(hint);
                    this.g.setHint((CharSequence) null);
                }
                this.H = true;
            }
            if (Build.VERSION.SDK_INT >= 29) {
                r();
            }
            if (this.r != null) {
                p(this.g.getText());
            }
            t();
            this.m.b();
            this.d.bringToFront();
            gu guVar = this.e;
            guVar.bringToFront();
            Iterator it = this.h0.iterator();
            while (it.hasNext()) {
                ((eu) it.next()).a(this);
            }
            guVar.m();
            if (!isEnabled()) {
                editText.setEnabled(false);
            }
            w(false, true);
            return;
        }
        c.k("We already have an EditText, can only have one");
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.G)) {
            this.G = charSequence;
            di diVar = this.y0;
            if (charSequence == null || !TextUtils.equals(diVar.B, charSequence)) {
                diVar.B = charSequence;
                diVar.C = null;
                diVar.j(false);
            }
            if (!this.x0) {
                l();
            }
        }
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.v == z) {
            return;
        }
        s7 s7Var = this.w;
        if (z) {
            if (s7Var != null) {
                this.c.addView(s7Var);
                this.w.setVisibility(0);
            }
        } else {
            if (s7Var != null) {
                s7Var.setVisibility(8);
            }
            this.w = null;
        }
        this.v = z;
    }

    public final void a() {
        if (this.g != null && this.R == 1) {
            if (getHintMaxLines() == 1) {
                if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                    EditText editText = this.g;
                    editText.setPaddingRelative(editText.getPaddingStart(), getResources().getDimensionPixelSize(svarzee.android.apps.adb_mouse.R.dimen.material_filled_edittext_font_2_0_padding_top), this.g.getPaddingEnd(), getResources().getDimensionPixelSize(svarzee.android.apps.adb_mouse.R.dimen.material_filled_edittext_font_2_0_padding_bottom));
                    return;
                } else {
                    if (k20.M(getContext())) {
                        EditText editText2 = this.g;
                        editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(svarzee.android.apps.adb_mouse.R.dimen.material_filled_edittext_font_1_3_padding_top), this.g.getPaddingEnd(), getResources().getDimensionPixelSize(svarzee.android.apps.adb_mouse.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
                        return;
                    }
                    return;
                }
            }
            EditText editText3 = this.g;
            editText3.setPaddingRelative(editText3.getPaddingStart(), (int) (this.y0.f() + this.f), this.g.getPaddingEnd(), getResources().getDimensionPixelSize(svarzee.android.apps.adb_mouse.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
            FrameLayout frameLayout = this.c;
            frameLayout.addView(view, layoutParams2);
            frameLayout.setLayoutParams(layoutParams);
            v();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i, layoutParams);
    }

    public final void b(float f) {
        di diVar = this.y0;
        if (diVar.b == f) {
            return;
        }
        int i = 2;
        if (this.B0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.B0 = valueAnimator;
            valueAnimator.setInterpolator(wv0.V(getContext(), svarzee.android.apps.adb_mouse.R.attr.motionEasingEmphasizedInterpolator, x4.b));
            this.B0.setDuration(wv0.U(getContext(), svarzee.android.apps.adb_mouse.R.attr.motionDurationMedium4, 167));
            this.B0.addUpdateListener(new xd(i, this));
        }
        this.B0.setFloatValues(diVar.b, f);
        this.B0.start();
    }

    public final void c() {
        ColorStateList valueOf;
        int i;
        int i2;
        m90 m90Var = this.I;
        if (m90Var == null) {
            return;
        }
        on0 on0Var = m90Var.d.a;
        on0 on0Var2 = this.O;
        if (on0Var != on0Var2) {
            m90Var.setShapeAppearanceModel(on0Var2);
        }
        if (this.R == 2 && (i = this.T) > -1 && (i2 = this.W) != 0) {
            m90 m90Var2 = this.I;
            m90Var2.d.k = i;
            m90Var2.invalidateSelf();
            ColorStateList valueOf2 = ColorStateList.valueOf(i2);
            k90 k90Var = m90Var2.d;
            if (k90Var.e != valueOf2) {
                k90Var.e = valueOf2;
                m90Var2.onStateChange(m90Var2.getState());
            }
        }
        int i3 = this.a0;
        if (this.R == 1) {
            i3 = oi.b(this.a0, f20.w(getContext(), svarzee.android.apps.adb_mouse.R.attr.colorSurface, 0));
        }
        this.a0 = i3;
        this.I.n(ColorStateList.valueOf(i3));
        m90 m90Var3 = this.M;
        if (m90Var3 != null && this.N != null) {
            if (this.T > -1 && this.W != 0) {
                if (this.g.isFocused()) {
                    valueOf = ColorStateList.valueOf(this.n0);
                } else {
                    valueOf = ColorStateList.valueOf(this.W);
                }
                m90Var3.n(valueOf);
                this.N.n(ColorStateList.valueOf(this.W));
            }
            invalidate();
        }
        u();
    }

    public final Rect d(Rect rect) {
        boolean z;
        if (this.g != null) {
            if (getLayoutDirection() == 1) {
                z = true;
            } else {
                z = false;
            }
            int i = rect.bottom;
            Rect rect2 = this.c0;
            rect2.bottom = i;
            int i2 = this.R;
            if (i2 != 1) {
                int i3 = rect.left;
                if (i2 != 2) {
                    rect2.left = i(i3, z);
                    rect2.top = getPaddingTop();
                    rect2.right = j(rect.right, z);
                    return rect2;
                }
                rect2.left = this.g.getPaddingLeft() + i3;
                rect2.top = rect.top - e();
                rect2.right = rect.right - this.g.getPaddingRight();
                return rect2;
            }
            rect2.left = i(rect.left, z);
            rect2.top = rect.top + this.S;
            rect2.right = j(rect.right, z);
            return rect2;
        }
        throw new IllegalStateException();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.g;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.h != null) {
            boolean z = this.H;
            this.H = false;
            CharSequence hint = editText.getHint();
            this.g.setHint(this.h);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.g.setHint(hint);
                this.H = z;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        FrameLayout frameLayout = this.c;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i2 = 0; i2 < frameLayout.getChildCount(); i2++) {
            View childAt = frameLayout.getChildAt(i2);
            ViewStructure newChild = viewStructure.newChild(i2);
            childAt.dispatchProvideAutofillStructure(newChild, i);
            if (childAt == this.g) {
                newChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.D0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.D0 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        m90 m90Var;
        super.draw(canvas);
        boolean z = this.F;
        di diVar = this.y0;
        if (z) {
            TextPaint textPaint = diVar.O;
            RectF rectF = diVar.e;
            int save = canvas.save();
            if (diVar.C != null && rectF.width() > 0.0f && rectF.height() > 0.0f) {
                textPaint.setTextSize(diVar.G);
                float f = diVar.q;
                float f2 = diVar.r;
                float f3 = diVar.F;
                if (f3 != 1.0f) {
                    canvas.scale(f3, f3, f, f2);
                }
                if ((diVar.e0 > 1 || diVar.f0 > 1) && !diVar.D && diVar.o()) {
                    float lineStart = diVar.q - diVar.Z.getLineStart(0);
                    int alpha = textPaint.getAlpha();
                    canvas.translate(lineStart, f2);
                    float f4 = alpha;
                    textPaint.setAlpha((int) (diVar.c0 * f4));
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 31) {
                        textPaint.setShadowLayer(diVar.H, diVar.I, diVar.J, f20.g(diVar.K, textPaint.getAlpha()));
                    }
                    diVar.Z.draw(canvas);
                    textPaint.setAlpha((int) (diVar.b0 * f4));
                    if (i >= 31) {
                        textPaint.setShadowLayer(diVar.H, diVar.I, diVar.J, f20.g(diVar.K, textPaint.getAlpha()));
                    }
                    int lineBaseline = diVar.Z.getLineBaseline(0);
                    CharSequence charSequence = diVar.d0;
                    float f5 = lineBaseline;
                    canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f5, textPaint);
                    if (i >= 31) {
                        textPaint.setShadowLayer(diVar.H, diVar.I, diVar.J, diVar.K);
                    }
                    String trim = diVar.d0.toString().trim();
                    if (trim.endsWith("…")) {
                        trim = trim.substring(0, trim.length() - 1);
                    }
                    String str = trim;
                    textPaint.setAlpha(alpha);
                    canvas.drawText(str, 0, Math.min(diVar.Z.getLineEnd(0), str.length()), 0.0f, f5, (Paint) textPaint);
                    canvas = canvas;
                } else {
                    canvas.translate(f, f2);
                    diVar.Z.draw(canvas);
                }
                canvas.restoreToCount(save);
            }
        }
        if (this.N != null && (m90Var = this.M) != null) {
            m90Var.draw(canvas);
            if (this.g.isFocused()) {
                Rect bounds = this.N.getBounds();
                Rect bounds2 = this.M.getBounds();
                float f6 = diVar.b;
                int centerX = bounds2.centerX();
                bounds.left = x4.c(centerX, bounds2.left, f6);
                bounds.right = x4.c(centerX, bounds2.right, f6);
                this.N.draw(canvas);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void drawableStateChanged() {
        /*
            r4 = this;
            boolean r0 = r4.C0
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r4.C0 = r0
            super.drawableStateChanged()
            int[] r1 = r4.getDrawableState()
            r2 = 0
            di r3 = r4.y0
            if (r3 == 0) goto L2f
            r3.M = r1
            android.content.res.ColorStateList r1 = r3.k
            if (r1 == 0) goto L20
            boolean r1 = r1.isStateful()
            if (r1 != 0) goto L2a
        L20:
            android.content.res.ColorStateList r1 = r3.j
            if (r1 == 0) goto L2f
            boolean r1 = r1.isStateful()
            if (r1 == 0) goto L2f
        L2a:
            r3.j(r2)
            r1 = r0
            goto L30
        L2f:
            r1 = r2
        L30:
            android.widget.EditText r3 = r4.g
            if (r3 == 0) goto L45
            boolean r3 = r4.isLaidOut()
            if (r3 == 0) goto L41
            boolean r3 = r4.isEnabled()
            if (r3 == 0) goto L41
            goto L42
        L41:
            r0 = r2
        L42:
            r4.w(r0, r2)
        L45:
            r4.t()
            r4.z()
            if (r1 == 0) goto L50
            r4.invalidate()
        L50:
            r4.C0 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.drawableStateChanged():void");
    }

    public final int e() {
        if (this.F) {
            int i = this.R;
            di diVar = this.y0;
            if (i != 0) {
                if (i == 2) {
                    if (getHintMaxLines() == 1) {
                        return (int) (diVar.f() / 2.0f);
                    }
                    float f = diVar.f();
                    TextPaint textPaint = diVar.P;
                    textPaint.setTextSize(diVar.i);
                    textPaint.setTypeface(diVar.s);
                    textPaint.setLetterSpacing(diVar.W);
                    return Math.max(0, (int) (f - ((-textPaint.ascent()) / 2.0f)));
                }
            } else {
                return (int) diVar.f();
            }
        }
        return 0;
    }

    public final bv f() {
        bv bvVar = new bv();
        bvVar.e = wv0.U(getContext(), svarzee.android.apps.adb_mouse.R.attr.motionDurationShort2, 87);
        bvVar.f = wv0.V(getContext(), svarzee.android.apps.adb_mouse.R.attr.motionEasingLinearInterpolator, x4.a);
        return bvVar;
    }

    public final boolean g() {
        if (this.F && !TextUtils.isEmpty(this.G) && (this.I instanceof am)) {
            return true;
        }
        return false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.g;
        if (editText != null) {
            return e() + getPaddingTop() + editText.getBaseline();
        }
        return super.getBaseline();
    }

    public m90 getBoxBackground() {
        int i = this.R;
        if (i != 1 && i != 2) {
            throw new IllegalStateException();
        }
        return this.I;
    }

    public int getBoxBackgroundColor() {
        return this.a0;
    }

    public int getBoxBackgroundMode() {
        return this.R;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.S;
    }

    public float getBoxCornerRadiusBottomEnd() {
        int layoutDirection = getLayoutDirection();
        on0 on0Var = this.O;
        RectF rectF = this.d0;
        if (layoutDirection == 1) {
            return on0Var.h.a(rectF);
        }
        return on0Var.g.a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        int layoutDirection = getLayoutDirection();
        on0 on0Var = this.O;
        RectF rectF = this.d0;
        if (layoutDirection == 1) {
            return on0Var.g.a(rectF);
        }
        return on0Var.h.a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        int layoutDirection = getLayoutDirection();
        on0 on0Var = this.O;
        RectF rectF = this.d0;
        if (layoutDirection == 1) {
            return on0Var.e.a(rectF);
        }
        return on0Var.f.a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        int layoutDirection = getLayoutDirection();
        on0 on0Var = this.O;
        RectF rectF = this.d0;
        if (layoutDirection == 1) {
            return on0Var.f.a(rectF);
        }
        return on0Var.e.a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.p0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.q0;
    }

    public int getBoxStrokeWidth() {
        return this.U;
    }

    public int getBoxStrokeWidthFocused() {
        return this.V;
    }

    public int getCounterMaxLength() {
        return this.o;
    }

    public CharSequence getCounterOverflowDescription() {
        s7 s7Var;
        if (this.n && this.p && (s7Var = this.r) != null) {
            return s7Var.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.C;
    }

    public ColorStateList getCounterTextColor() {
        return this.B;
    }

    public ColorStateList getCursorColor() {
        return this.D;
    }

    public ColorStateList getCursorErrorColor() {
        return this.E;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.l0;
    }

    public EditText getEditText() {
        return this.g;
    }

    public CharSequence getEndIconContentDescription() {
        return this.e.i.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.e.i.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.e.o;
    }

    public int getEndIconMode() {
        return this.e.k;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.e.p;
    }

    public CheckableImageButton getEndIconView() {
        return this.e.i;
    }

    public CharSequence getError() {
        w10 w10Var = this.m;
        if (w10Var.q) {
            return w10Var.p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.m.t;
    }

    public CharSequence getErrorContentDescription() {
        return this.m.s;
    }

    public int getErrorCurrentTextColors() {
        s7 s7Var = this.m.r;
        if (s7Var != null) {
            return s7Var.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.e.e.getDrawable();
    }

    public CharSequence getHelperText() {
        w10 w10Var = this.m;
        if (w10Var.x) {
            return w10Var.w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        s7 s7Var = this.m.y;
        if (s7Var != null) {
            return s7Var.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.F) {
            return this.G;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.y0.f();
    }

    public final int getHintCurrentCollapsedTextColor() {
        di diVar = this.y0;
        return diVar.g(diVar.k);
    }

    public int getHintMaxLines() {
        return this.y0.e0;
    }

    public ColorStateList getHintTextColor() {
        return this.m0;
    }

    public nr0 getLengthCounter() {
        return this.q;
    }

    public int getMaxEms() {
        return this.j;
    }

    public int getMaxWidth() {
        return this.l;
    }

    public int getMinEms() {
        return this.i;
    }

    public int getMinWidth() {
        return this.k;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.e.i.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.e.i.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.v) {
            return this.u;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.y;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.x;
    }

    public CharSequence getPrefixText() {
        return this.d.e;
    }

    public ColorStateList getPrefixTextColor() {
        return this.d.d.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.d.d;
    }

    public on0 getShapeAppearanceModel() {
        return this.O;
    }

    public CharSequence getStartIconContentDescription() {
        return this.d.f.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.d.f.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.d.i;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.d.j;
    }

    public CharSequence getSuffixText() {
        return this.e.r;
    }

    public ColorStateList getSuffixTextColor() {
        return this.e.s.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.e.s;
    }

    public Typeface getTypeface() {
        return this.e0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [on0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v0, types: [os, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [f20, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [f20, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [f20, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [f20, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [os, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [os, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [os, java.lang.Object] */
    public final m90 h(boolean z) {
        float f;
        float dimensionPixelOffset;
        ColorStateList colorStateList;
        int i;
        float dimensionPixelOffset2 = getResources().getDimensionPixelOffset(svarzee.android.apps.adb_mouse.R.dimen.mtrl_shape_corner_size_small_component);
        if (z) {
            f = dimensionPixelOffset2;
        } else {
            f = 0.0f;
        }
        EditText editText = this.g;
        if (editText instanceof s80) {
            dimensionPixelOffset = ((s80) editText).getPopupElevation();
        } else {
            dimensionPixelOffset = getResources().getDimensionPixelOffset(svarzee.android.apps.adb_mouse.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        }
        int dimensionPixelOffset3 = getResources().getDimensionPixelOffset(svarzee.android.apps.adb_mouse.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        ?? obj = new Object();
        ?? obj2 = new Object();
        ?? obj3 = new Object();
        ?? obj4 = new Object();
        ?? obj5 = new Object();
        ?? obj6 = new Object();
        ?? obj7 = new Object();
        ?? obj8 = new Object();
        k0 k0Var = new k0(f);
        k0 k0Var2 = new k0(f);
        k0 k0Var3 = new k0(dimensionPixelOffset2);
        k0 k0Var4 = new k0(dimensionPixelOffset2);
        ?? obj9 = new Object();
        obj9.a = obj;
        obj9.b = obj2;
        obj9.c = obj3;
        obj9.d = obj4;
        obj9.e = k0Var;
        obj9.f = k0Var2;
        obj9.g = k0Var4;
        obj9.h = k0Var3;
        obj9.i = obj5;
        obj9.j = obj6;
        obj9.k = obj7;
        obj9.l = obj8;
        EditText editText2 = this.g;
        if (editText2 instanceof s80) {
            colorStateList = ((s80) editText2).getDropDownBackgroundTintList();
        } else {
            colorStateList = null;
        }
        Context context = getContext();
        if (colorStateList == null) {
            Paint paint = m90.G;
            TypedValue N = mn.N(svarzee.android.apps.adb_mouse.R.attr.colorSurface, context, m90.class.getSimpleName());
            int i2 = N.resourceId;
            if (i2 != 0) {
                i = context.getColor(i2);
            } else {
                i = N.data;
            }
            colorStateList = ColorStateList.valueOf(i);
        }
        m90 m90Var = new m90();
        m90Var.k(context);
        m90Var.n(colorStateList);
        m90Var.m(dimensionPixelOffset);
        m90Var.setShapeAppearanceModel(obj9);
        k90 k90Var = m90Var.d;
        if (k90Var.h == null) {
            k90Var.h = new Rect();
        }
        m90Var.d.h.set(0, dimensionPixelOffset3, 0, dimensionPixelOffset3);
        m90Var.invalidateSelf();
        return m90Var;
    }

    public final int i(int i, boolean z) {
        int compoundPaddingLeft;
        if (!z && getPrefixText() != null) {
            compoundPaddingLeft = this.d.a();
        } else if (z && getSuffixText() != null) {
            compoundPaddingLeft = this.e.c();
        } else {
            compoundPaddingLeft = this.g.getCompoundPaddingLeft();
        }
        return compoundPaddingLeft + i;
    }

    public final int j(int i, boolean z) {
        int compoundPaddingRight;
        if (!z && getSuffixText() != null) {
            compoundPaddingRight = this.e.c();
        } else if (z && getPrefixText() != null) {
            compoundPaddingRight = this.d.a();
        } else {
            compoundPaddingRight = this.g.getCompoundPaddingRight();
        }
        return i - compoundPaddingRight;
    }

    /* JADX WARN: Type inference failed for: r0v26, types: [m90, am] */
    public final void k() {
        int i = this.R;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    if (this.F && !(this.I instanceof am)) {
                        on0 on0Var = this.O;
                        int i2 = am.J;
                        if (on0Var == null) {
                            on0Var = new on0();
                        }
                        zl zlVar = new zl(on0Var, new RectF());
                        ?? m90Var = new m90(zlVar);
                        m90Var.I = zlVar;
                        this.I = m90Var;
                    } else {
                        this.I = new m90(this.O);
                    }
                    this.M = null;
                    this.N = null;
                } else {
                    throw new IllegalArgumentException(this.R + " is illegal; only @BoxBackgroundMode constants are supported.");
                }
            } else {
                this.I = new m90(this.O);
                this.M = new m90();
                this.N = new m90();
            }
        } else {
            this.I = null;
            this.M = null;
            this.N = null;
        }
        u();
        z();
        if (this.R == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.S = getResources().getDimensionPixelSize(svarzee.android.apps.adb_mouse.R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (k20.M(getContext())) {
                this.S = getResources().getDimensionPixelSize(svarzee.android.apps.adb_mouse.R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        a();
        if (this.R != 0) {
            v();
        }
        EditText editText = this.g;
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i3 = this.R;
                if (i3 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i3 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l() {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.l():void");
    }

    public final void n(s7 s7Var, int i) {
        try {
            s7Var.setTextAppearance(i);
            if (s7Var.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        s7Var.setTextAppearance(svarzee.android.apps.adb_mouse.R.style.TextAppearance_AppCompat_Caption);
        s7Var.setTextColor(getContext().getColor(svarzee.android.apps.adb_mouse.R.color.design_error));
    }

    public final boolean o() {
        w10 w10Var = this.m;
        if (w10Var.o == 1 && w10Var.r != null && !TextUtils.isEmpty(w10Var.p)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.y0.i(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int max;
        gu guVar = this.e;
        guVar.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z = false;
        this.E0 = false;
        if (this.g != null && this.g.getMeasuredHeight() < (max = Math.max(guVar.getMeasuredHeight(), this.d.getMeasuredHeight()))) {
            this.g.setMinimumHeight(max);
            z = true;
        }
        boolean s = s();
        if (!z && !s) {
            return;
        }
        this.g.post(new x2(14, this));
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float descent;
        int i5;
        int compoundPaddingTop;
        int compoundPaddingBottom;
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.g;
        if (editText != null) {
            Rect rect = this.b0;
            ap.a(this, editText, rect);
            m90 m90Var = this.M;
            if (m90Var != null) {
                int i6 = rect.bottom;
                m90Var.setBounds(rect.left, i6 - this.U, rect.right, i6);
            }
            m90 m90Var2 = this.N;
            if (m90Var2 != null) {
                int i7 = rect.bottom;
                m90Var2.setBounds(rect.left, i7 - this.V, rect.right, i7);
            }
            if (this.F) {
                float textSize = this.g.getTextSize();
                di diVar = this.y0;
                float f = diVar.h;
                TextPaint textPaint = diVar.P;
                if (f != textSize) {
                    diVar.h = textSize;
                    diVar.j(false);
                }
                int gravity = this.g.getGravity();
                int i8 = (gravity & (-113)) | 48;
                if (diVar.g != i8) {
                    diVar.g = i8;
                    diVar.j(false);
                }
                if (diVar.f != gravity) {
                    diVar.f = gravity;
                    diVar.j(false);
                }
                Rect d = d(rect);
                int i9 = d.left;
                int i10 = d.top;
                int i11 = d.right;
                int i12 = d.bottom;
                Rect rect2 = diVar.d;
                if (rect2.left != i9 || rect2.top != i10 || rect2.right != i11 || rect2.bottom != i12) {
                    rect2.set(i9, i10, i11, i12);
                    diVar.N = true;
                }
                if (this.g != null) {
                    if (getHintMaxLines() == 1) {
                        textPaint.setTextSize(diVar.h);
                        textPaint.setTypeface(diVar.v);
                        textPaint.setLetterSpacing(diVar.X);
                        descent = -textPaint.ascent();
                    } else {
                        textPaint.setTextSize(diVar.h);
                        textPaint.setTypeface(diVar.v);
                        textPaint.setLetterSpacing(diVar.X);
                        descent = diVar.l * (textPaint.descent() + (-textPaint.ascent()));
                    }
                    int compoundPaddingLeft = this.g.getCompoundPaddingLeft() + rect.left;
                    Rect rect3 = this.c0;
                    rect3.left = compoundPaddingLeft;
                    if (this.R == 1 && this.g.getMinLines() <= 1) {
                        compoundPaddingTop = (int) (rect.centerY() - (descent / 2.0f));
                    } else {
                        if (this.R == 0 && getHintMaxLines() != 1) {
                            textPaint.setTextSize(diVar.h);
                            textPaint.setTypeface(diVar.v);
                            textPaint.setLetterSpacing(diVar.X);
                            i5 = (int) ((-textPaint.ascent()) / 2.0f);
                        } else {
                            i5 = 0;
                        }
                        compoundPaddingTop = (this.g.getCompoundPaddingTop() + rect.top) - i5;
                    }
                    rect3.top = compoundPaddingTop;
                    rect3.right = rect.right - this.g.getCompoundPaddingRight();
                    if (this.R == 1 && this.g.getMinLines() <= 1) {
                        compoundPaddingBottom = (int) (rect3.top + descent);
                    } else {
                        compoundPaddingBottom = rect.bottom - this.g.getCompoundPaddingBottom();
                    }
                    rect3.bottom = compoundPaddingBottom;
                    int i13 = rect3.left;
                    int i14 = rect3.top;
                    int i15 = rect3.right;
                    Rect rect4 = diVar.c;
                    if (rect4.left != i13 || rect4.top != i14 || rect4.right != i15 || rect4.bottom != compoundPaddingBottom || true != diVar.k0) {
                        rect4.set(i13, i14, i15, compoundPaddingBottom);
                        diVar.N = true;
                        diVar.k0 = true;
                    }
                    diVar.j(false);
                    if (g() && !this.x0) {
                        l();
                        return;
                    }
                    return;
                }
                throw new IllegalStateException();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        float f;
        boolean z;
        EditText editText;
        super.onMeasure(i, i2);
        boolean z2 = this.E0;
        gu guVar = this.e;
        if (!z2) {
            guVar.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.E0 = true;
        }
        if (this.w != null && (editText = this.g) != null) {
            this.w.setGravity(editText.getGravity());
            this.w.setPadding(this.g.getCompoundPaddingLeft(), this.g.getCompoundPaddingTop(), this.g.getCompoundPaddingRight(), this.g.getCompoundPaddingBottom());
        }
        guVar.m();
        if (getHintMaxLines() != 1) {
            int measuredWidth = (this.g.getMeasuredWidth() - this.g.getCompoundPaddingLeft()) - this.g.getCompoundPaddingRight();
            di diVar = this.y0;
            TextPaint textPaint = diVar.P;
            textPaint.setTextSize(diVar.i);
            textPaint.setTypeface(diVar.s);
            textPaint.setLetterSpacing(diVar.W);
            float f2 = measuredWidth;
            diVar.i0 = diVar.e(diVar.f0, textPaint, diVar.B, (diVar.i / diVar.h) * f2, diVar.D).getHeight();
            textPaint.setTextSize(diVar.h);
            textPaint.setTypeface(diVar.v);
            textPaint.setLetterSpacing(diVar.X);
            diVar.j0 = diVar.e(diVar.e0, textPaint, diVar.B, f2, diVar.D).getHeight();
            EditText editText2 = this.g;
            Rect rect = this.b0;
            ap.a(this, editText2, rect);
            Rect d = d(rect);
            int i3 = d.left;
            int i4 = d.top;
            int i5 = d.right;
            int i6 = d.bottom;
            Rect rect2 = diVar.d;
            if (rect2.left != i3 || rect2.top != i4 || rect2.right != i5 || rect2.bottom != i6) {
                rect2.set(i3, i4, i5, i6);
                diVar.N = true;
            }
            v();
            a();
            if (this.g != null) {
                int i7 = diVar.j0;
                if (i7 != -1) {
                    f = i7;
                } else {
                    TextPaint textPaint2 = diVar.P;
                    textPaint2.setTextSize(diVar.h);
                    textPaint2.setTypeface(diVar.v);
                    textPaint2.setLetterSpacing(diVar.X);
                    f = -textPaint2.ascent();
                }
                float f3 = 0.0f;
                if (this.u != null) {
                    TextPaint textPaint3 = new TextPaint(129);
                    textPaint3.set(this.w.getPaint());
                    textPaint3.setTextSize(this.w.getTextSize());
                    textPaint3.setTypeface(this.w.getTypeface());
                    textPaint3.setLetterSpacing(this.w.getLetterSpacing());
                    up0 up0Var = new up0(this.u, textPaint3, measuredWidth);
                    if (getLayoutDirection() == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    up0Var.k = z;
                    up0Var.j = true;
                    float lineSpacingExtra = this.w.getLineSpacingExtra();
                    float lineSpacingMultiplier = this.w.getLineSpacingMultiplier();
                    up0Var.g = lineSpacingExtra;
                    up0Var.h = lineSpacingMultiplier;
                    up0Var.m = new sf(6, this);
                    StaticLayout a = up0Var.a();
                    if (this.R == 1) {
                        f3 = diVar.f() + this.S + this.f;
                    }
                    f3 += a.getHeight();
                }
                float max = Math.max(f, f3);
                if (this.g.getMeasuredHeight() < max) {
                    this.g.setMinimumHeight(Math.round(max));
                }
            }
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof or0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        or0 or0Var = (or0) parcelable;
        super.onRestoreInstanceState(or0Var.c);
        setError(or0Var.e);
        if (or0Var.f) {
            post(new l9(14, this));
        }
        requestLayout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [os, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v0, types: [os, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [on0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [os, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [os, java.lang.Object] */
    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        if (z != this.P) {
            al alVar = this.O.e;
            RectF rectF = this.d0;
            float a = alVar.a(rectF);
            float a2 = this.O.f.a(rectF);
            float a3 = this.O.h.a(rectF);
            float a4 = this.O.g.a(rectF);
            on0 on0Var = this.O;
            f20 f20Var = on0Var.a;
            f20 f20Var2 = on0Var.b;
            f20 f20Var3 = on0Var.d;
            f20 f20Var4 = on0Var.c;
            ?? obj = new Object();
            ?? obj2 = new Object();
            ?? obj3 = new Object();
            ?? obj4 = new Object();
            k0 k0Var = new k0(a2);
            k0 k0Var2 = new k0(a);
            k0 k0Var3 = new k0(a4);
            k0 k0Var4 = new k0(a3);
            ?? obj5 = new Object();
            obj5.a = f20Var2;
            obj5.b = f20Var;
            obj5.c = f20Var3;
            obj5.d = f20Var4;
            obj5.e = k0Var;
            obj5.f = k0Var2;
            obj5.g = k0Var4;
            obj5.h = k0Var3;
            obj5.i = obj;
            obj5.j = obj2;
            obj5.k = obj3;
            obj5.l = obj4;
            this.P = z;
            setShapeAppearanceModel(obj5);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.os.Parcelable, j0, or0] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z;
        ?? j0Var = new j0(super.onSaveInstanceState());
        if (o()) {
            j0Var.e = getError();
        }
        gu guVar = this.e;
        if (guVar.k != 0 && guVar.i.f) {
            z = true;
        } else {
            z = false;
        }
        j0Var.f = z;
        return j0Var;
    }

    public final void p(Editable editable) {
        int i;
        boolean z;
        int i2;
        jd jdVar;
        ((f40) this.q).getClass();
        if (editable != null) {
            i = editable.length();
        } else {
            i = 0;
        }
        boolean z2 = this.p;
        int i3 = this.o;
        String str = null;
        if (i3 == -1) {
            this.r.setText(String.valueOf(i));
            this.r.setContentDescription(null);
            this.p = false;
        } else {
            if (i > i3) {
                z = true;
            } else {
                z = false;
            }
            this.p = z;
            Context context = getContext();
            s7 s7Var = this.r;
            int i4 = this.o;
            if (this.p) {
                i2 = svarzee.android.apps.adb_mouse.R.string.character_counter_overflowed_content_description;
            } else {
                i2 = svarzee.android.apps.adb_mouse.R.string.character_counter_content_description;
            }
            s7Var.setContentDescription(context.getString(i2, Integer.valueOf(i), Integer.valueOf(i4)));
            if (z2 != this.p) {
                q();
            }
            String str2 = jd.b;
            if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
                jdVar = jd.e;
            } else {
                jdVar = jd.d;
            }
            s7 s7Var2 = this.r;
            String string = getContext().getString(svarzee.android.apps.adb_mouse.R.string.character_counter_pattern, Integer.valueOf(i), Integer.valueOf(this.o));
            jdVar.getClass();
            yd ydVar = jr0.a;
            if (string != null) {
                str = jdVar.c(string).toString();
            }
            s7Var2.setText(str);
        }
        if (this.g != null && z2 != this.p) {
            w(false, false);
            z();
            t();
        }
    }

    public final void q() {
        int i;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        s7 s7Var = this.r;
        if (s7Var != null) {
            if (this.p) {
                i = this.s;
            } else {
                i = this.t;
            }
            n(s7Var, i);
            if (!this.p && (colorStateList2 = this.B) != null) {
                this.r.setTextColor(colorStateList2);
            }
            if (this.p && (colorStateList = this.C) != null) {
                this.r.setTextColor(colorStateList);
            }
        }
    }

    public final void r() {
        Drawable textCursorDrawable;
        Drawable textCursorDrawable2;
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.D;
        if (colorStateList2 == null) {
            Context context = getContext();
            TypedValue L = mn.L(context, svarzee.android.apps.adb_mouse.R.attr.colorControlActivated);
            if (L != null) {
                int i = L.resourceId;
                if (i != 0) {
                    colorStateList2 = mn.q(context, i);
                } else {
                    int i2 = L.data;
                    if (i2 != 0) {
                        colorStateList2 = ColorStateList.valueOf(i2);
                    }
                }
            }
            colorStateList2 = null;
        }
        EditText editText = this.g;
        if (editText != null) {
            textCursorDrawable = editText.getTextCursorDrawable();
            if (textCursorDrawable != null) {
                textCursorDrawable2 = this.g.getTextCursorDrawable();
                Drawable mutate = textCursorDrawable2.mutate();
                if ((o() || (this.r != null && this.p)) && (colorStateList = this.E) != null) {
                    colorStateList2 = colorStateList;
                }
                mutate.setTintList(colorStateList2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean s() {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.s():boolean");
    }

    public void setBoxBackgroundColor(int i) {
        if (this.a0 != i) {
            this.a0 = i;
            this.r0 = i;
            this.t0 = i;
            this.u0 = i;
            c();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(getContext().getColor(i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.r0 = defaultColor;
        this.a0 = defaultColor;
        this.s0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.t0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.u0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        c();
    }

    public void setBoxBackgroundMode(int i) {
        if (i != this.R) {
            this.R = i;
            if (this.g != null) {
                k();
            }
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.S = i;
    }

    public void setBoxCornerFamily(int i) {
        nn0 f = this.O.f();
        al alVar = this.O.e;
        f.a = wv0.t(i);
        f.e = alVar;
        al alVar2 = this.O.f;
        f.b = wv0.t(i);
        f.f = alVar2;
        al alVar3 = this.O.h;
        f.d = wv0.t(i);
        f.h = alVar3;
        al alVar4 = this.O.g;
        f.c = wv0.t(i);
        f.g = alVar4;
        this.O = f.a();
        c();
    }

    public void setBoxStrokeColor(int i) {
        if (this.p0 != i) {
            this.p0 = i;
            z();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.n0 = colorStateList.getDefaultColor();
            this.v0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.o0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.p0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.p0 != colorStateList.getDefaultColor()) {
            this.p0 = colorStateList.getDefaultColor();
        }
        z();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.q0 != colorStateList) {
            this.q0 = colorStateList;
            z();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.U = i;
        z();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.V = i;
        z();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z) {
        if (this.n != z) {
            w10 w10Var = this.m;
            Editable editable = null;
            if (z) {
                s7 s7Var = new s7(getContext(), null);
                this.r = s7Var;
                s7Var.setId(svarzee.android.apps.adb_mouse.R.id.textinput_counter);
                Typeface typeface = this.e0;
                if (typeface != null) {
                    this.r.setTypeface(typeface);
                }
                this.r.setMaxLines(1);
                w10Var.a(this.r, 2);
                ((ViewGroup.MarginLayoutParams) this.r.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(svarzee.android.apps.adb_mouse.R.dimen.mtrl_textinput_counter_margin_start));
                q();
                if (this.r != null) {
                    EditText editText = this.g;
                    if (editText != null) {
                        editable = editText.getText();
                    }
                    p(editable);
                }
            } else {
                w10Var.g(this.r, 2);
                this.r = null;
            }
            this.n = z;
        }
    }

    public void setCounterMaxLength(int i) {
        Editable text;
        if (this.o != i) {
            if (i > 0) {
                this.o = i;
            } else {
                this.o = -1;
            }
            if (this.n && this.r != null) {
                EditText editText = this.g;
                if (editText == null) {
                    text = null;
                } else {
                    text = editText.getText();
                }
                p(text);
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.s != i) {
            this.s = i;
            q();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.C != colorStateList) {
            this.C = colorStateList;
            q();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.t != i) {
            this.t = i;
            q();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.B != colorStateList) {
            this.B = colorStateList;
            q();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.D != colorStateList) {
            this.D = colorStateList;
            r();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.E != colorStateList) {
            this.E = colorStateList;
            if (!o() && (this.r == null || !this.p)) {
                return;
            }
            r();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.l0 = colorStateList;
        this.m0 = colorStateList;
        if (this.g != null) {
            w(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        m(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.e.i.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.e.i.setCheckable(z);
    }

    public void setEndIconContentDescription(int i) {
        CharSequence charSequence;
        gu guVar = this.e;
        if (i != 0) {
            charSequence = guVar.getResources().getText(i);
        } else {
            charSequence = null;
        }
        CheckableImageButton checkableImageButton = guVar.i;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(int i) {
        Drawable drawable;
        gu guVar = this.e;
        if (i != 0) {
            drawable = r21.r(guVar.getContext(), i);
        } else {
            drawable = null;
        }
        TextInputLayout textInputLayout = guVar.c;
        CheckableImageButton checkableImageButton = guVar.i;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            r21.b(textInputLayout, checkableImageButton, guVar.m, guVar.n);
            r21.G(textInputLayout, checkableImageButton, guVar.m);
        }
    }

    public void setEndIconMinSize(int i) {
        gu guVar = this.e;
        if (i >= 0) {
            if (i != guVar.o) {
                guVar.o = i;
                CheckableImageButton checkableImageButton = guVar.i;
                checkableImageButton.setMinimumWidth(i);
                checkableImageButton.setMinimumHeight(i);
                CheckableImageButton checkableImageButton2 = guVar.e;
                checkableImageButton2.setMinimumWidth(i);
                checkableImageButton2.setMinimumHeight(i);
                return;
            }
            return;
        }
        guVar.getClass();
        c.k("endIconSize cannot be less than 0");
    }

    public void setEndIconMode(int i) {
        this.e.g(i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        gu guVar = this.e;
        CheckableImageButton checkableImageButton = guVar.i;
        View.OnLongClickListener onLongClickListener = guVar.q;
        checkableImageButton.setOnClickListener(onClickListener);
        r21.I(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        gu guVar = this.e;
        guVar.q = onLongClickListener;
        CheckableImageButton checkableImageButton = guVar.i;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        r21.I(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        gu guVar = this.e;
        guVar.p = scaleType;
        guVar.i.setScaleType(scaleType);
        guVar.e.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        gu guVar = this.e;
        if (guVar.m != colorStateList) {
            guVar.m = colorStateList;
            r21.b(guVar.c, guVar.i, colorStateList, guVar.n);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        gu guVar = this.e;
        if (guVar.n != mode) {
            guVar.n = mode;
            r21.b(guVar.c, guVar.i, guVar.m, mode);
        }
    }

    public void setEndIconVisible(boolean z) {
        this.e.h(z);
    }

    public void setError(CharSequence charSequence) {
        w10 w10Var = this.m;
        if (!w10Var.q) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            w10Var.c();
            w10Var.p = charSequence;
            w10Var.r.setText(charSequence);
            int i = w10Var.n;
            if (i != 1) {
                w10Var.o = 1;
            }
            w10Var.i(i, w10Var.o, w10Var.h(w10Var.r, charSequence));
            return;
        }
        w10Var.f();
    }

    public void setErrorAccessibilityLiveRegion(int i) {
        w10 w10Var = this.m;
        w10Var.t = i;
        s7 s7Var = w10Var.r;
        if (s7Var != null) {
            s7Var.setAccessibilityLiveRegion(i);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        w10 w10Var = this.m;
        w10Var.s = charSequence;
        s7 s7Var = w10Var.r;
        if (s7Var != null) {
            s7Var.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z) {
        w10 w10Var = this.m;
        TextInputLayout textInputLayout = w10Var.h;
        if (w10Var.q == z) {
            return;
        }
        w10Var.c();
        if (z) {
            s7 s7Var = new s7(w10Var.g, null);
            w10Var.r = s7Var;
            s7Var.setId(svarzee.android.apps.adb_mouse.R.id.textinput_error);
            w10Var.r.setTextAlignment(5);
            Typeface typeface = w10Var.B;
            if (typeface != null) {
                w10Var.r.setTypeface(typeface);
            }
            int i = w10Var.u;
            w10Var.u = i;
            s7 s7Var2 = w10Var.r;
            if (s7Var2 != null) {
                w10Var.h.n(s7Var2, i);
            }
            ColorStateList colorStateList = w10Var.v;
            w10Var.v = colorStateList;
            s7 s7Var3 = w10Var.r;
            if (s7Var3 != null && colorStateList != null) {
                s7Var3.setTextColor(colorStateList);
            }
            CharSequence charSequence = w10Var.s;
            w10Var.s = charSequence;
            s7 s7Var4 = w10Var.r;
            if (s7Var4 != null) {
                s7Var4.setContentDescription(charSequence);
            }
            int i2 = w10Var.t;
            w10Var.t = i2;
            s7 s7Var5 = w10Var.r;
            if (s7Var5 != null) {
                s7Var5.setAccessibilityLiveRegion(i2);
            }
            w10Var.r.setVisibility(4);
            w10Var.a(w10Var.r, 0);
        } else {
            w10Var.f();
            w10Var.g(w10Var.r, 0);
            w10Var.r = null;
            textInputLayout.t();
            textInputLayout.z();
        }
        w10Var.q = z;
    }

    public void setErrorIconDrawable(int i) {
        Drawable drawable;
        gu guVar = this.e;
        if (i != 0) {
            drawable = r21.r(guVar.getContext(), i);
        } else {
            drawable = null;
        }
        guVar.i(drawable);
        r21.G(guVar.c, guVar.e, guVar.f);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        gu guVar = this.e;
        CheckableImageButton checkableImageButton = guVar.e;
        View.OnLongClickListener onLongClickListener = guVar.h;
        checkableImageButton.setOnClickListener(onClickListener);
        r21.I(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        gu guVar = this.e;
        guVar.h = onLongClickListener;
        CheckableImageButton checkableImageButton = guVar.e;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        r21.I(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        gu guVar = this.e;
        if (guVar.f != colorStateList) {
            guVar.f = colorStateList;
            r21.b(guVar.c, guVar.e, colorStateList, guVar.g);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        gu guVar = this.e;
        if (guVar.g != mode) {
            guVar.g = mode;
            r21.b(guVar.c, guVar.e, guVar.f, mode);
        }
    }

    public void setErrorTextAppearance(int i) {
        w10 w10Var = this.m;
        w10Var.u = i;
        s7 s7Var = w10Var.r;
        if (s7Var != null) {
            w10Var.h.n(s7Var, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        w10 w10Var = this.m;
        w10Var.v = colorStateList;
        s7 s7Var = w10Var.r;
        if (s7Var != null && colorStateList != null) {
            s7Var.setTextColor(colorStateList);
        }
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.z0 != z) {
            this.z0 = z;
            w(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        w10 w10Var = this.m;
        if (isEmpty) {
            if (w10Var.x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!w10Var.x) {
            setHelperTextEnabled(true);
        }
        w10Var.c();
        w10Var.w = charSequence;
        w10Var.y.setText(charSequence);
        int i = w10Var.n;
        if (i != 2) {
            w10Var.o = 2;
        }
        w10Var.i(i, w10Var.o, w10Var.h(w10Var.y, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        w10 w10Var = this.m;
        w10Var.A = colorStateList;
        s7 s7Var = w10Var.y;
        if (s7Var != null && colorStateList != null) {
            s7Var.setTextColor(colorStateList);
        }
    }

    public void setHelperTextEnabled(boolean z) {
        w10 w10Var = this.m;
        TextInputLayout textInputLayout = w10Var.h;
        if (w10Var.x == z) {
            return;
        }
        w10Var.c();
        if (z) {
            s7 s7Var = new s7(w10Var.g, null);
            w10Var.y = s7Var;
            s7Var.setId(svarzee.android.apps.adb_mouse.R.id.textinput_helper_text);
            w10Var.y.setTextAlignment(5);
            Typeface typeface = w10Var.B;
            if (typeface != null) {
                w10Var.y.setTypeface(typeface);
            }
            w10Var.y.setVisibility(4);
            w10Var.y.setAccessibilityLiveRegion(1);
            int i = w10Var.z;
            w10Var.z = i;
            s7 s7Var2 = w10Var.y;
            if (s7Var2 != null) {
                s7Var2.setTextAppearance(i);
            }
            ColorStateList colorStateList = w10Var.A;
            w10Var.A = colorStateList;
            s7 s7Var3 = w10Var.y;
            if (s7Var3 != null && colorStateList != null) {
                s7Var3.setTextColor(colorStateList);
            }
            w10Var.a(w10Var.y, 1);
            w10Var.y.setAccessibilityDelegate(new v10(w10Var));
        } else {
            w10Var.c();
            int i2 = w10Var.n;
            if (i2 == 2) {
                w10Var.o = 0;
            }
            w10Var.i(i2, w10Var.o, w10Var.h(w10Var.y, ""));
            w10Var.g(w10Var.y, 1);
            w10Var.y = null;
            textInputLayout.t();
            textInputLayout.z();
        }
        w10Var.x = z;
    }

    public void setHelperTextTextAppearance(int i) {
        w10 w10Var = this.m;
        w10Var.z = i;
        s7 s7Var = w10Var.y;
        if (s7Var != null) {
            s7Var.setTextAppearance(i);
        }
    }

    public void setHint(int i) {
        CharSequence charSequence;
        if (i != 0) {
            charSequence = getResources().getText(i);
        } else {
            charSequence = null;
        }
        setHint(charSequence);
    }

    public void setHintAnimationEnabled(boolean z) {
        this.A0 = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.F) {
            this.F = z;
            if (!z) {
                this.H = false;
                if (!TextUtils.isEmpty(this.G) && TextUtils.isEmpty(this.g.getHint())) {
                    this.g.setHint(this.G);
                }
                setHintInternal(null);
            } else {
                CharSequence hint = this.g.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.G)) {
                        setHint(hint);
                    }
                    this.g.setHint((CharSequence) null);
                }
                this.H = true;
            }
            if (this.g != null) {
                v();
            }
        }
    }

    public void setHintMaxLines(int i) {
        di diVar = this.y0;
        if (i != diVar.f0) {
            diVar.f0 = i;
            diVar.j(false);
        }
        if (i != diVar.e0) {
            diVar.e0 = i;
            diVar.j(false);
        }
        requestLayout();
    }

    public void setHintTextAppearance(int i) {
        di diVar = this.y0;
        TextInputLayout textInputLayout = diVar.a;
        ir0 ir0Var = new ir0(textInputLayout.getContext(), i);
        ColorStateList colorStateList = ir0Var.k;
        if (colorStateList != null) {
            diVar.k = colorStateList;
        }
        float f = ir0Var.l;
        if (f != 0.0f) {
            diVar.i = f;
        }
        ColorStateList colorStateList2 = ir0Var.a;
        if (colorStateList2 != null) {
            diVar.V = colorStateList2;
        }
        diVar.T = ir0Var.f;
        diVar.U = ir0Var.g;
        diVar.S = ir0Var.h;
        diVar.W = ir0Var.j;
        df dfVar = diVar.z;
        if (dfVar != null) {
            dfVar.f = true;
        }
        i81 i81Var = new i81(11, diVar);
        ir0Var.a();
        diVar.z = new df(i81Var, ir0Var.p);
        ir0Var.b(textInputLayout.getContext(), diVar.z);
        diVar.j(false);
        this.m0 = diVar.k;
        if (this.g != null) {
            w(false, false);
            v();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.m0 != colorStateList) {
            if (this.l0 == null) {
                di diVar = this.y0;
                if (diVar.k != colorStateList) {
                    diVar.k = colorStateList;
                    diVar.j(false);
                }
            }
            this.m0 = colorStateList;
            if (this.g != null) {
                w(false, false);
            }
        }
    }

    public void setLengthCounter(nr0 nr0Var) {
        this.q = nr0Var;
    }

    public void setMaxEms(int i) {
        this.j = i;
        EditText editText = this.g;
        if (editText != null && i != -1) {
            editText.setMaxEms(i);
        }
    }

    public void setMaxWidth(int i) {
        this.l = i;
        EditText editText = this.g;
        if (editText != null && i != -1) {
            editText.setMaxWidth(i);
        }
    }

    public void setMaxWidthResource(int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinEms(int i) {
        this.i = i;
        EditText editText = this.g;
        if (editText != null && i != -1) {
            editText.setMinEms(i);
        }
    }

    public void setMinWidth(int i) {
        this.k = i;
        EditText editText = this.g;
        if (editText != null && i != -1) {
            editText.setMinWidth(i);
        }
    }

    public void setMinWidthResource(int i) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        CharSequence charSequence;
        gu guVar = this.e;
        if (i != 0) {
            charSequence = guVar.getResources().getText(i);
        } else {
            charSequence = null;
        }
        guVar.i.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        Drawable drawable;
        gu guVar = this.e;
        if (i != 0) {
            drawable = r21.r(guVar.getContext(), i);
        } else {
            drawable = null;
        }
        guVar.i.setImageDrawable(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        gu guVar = this.e;
        if (z && guVar.k != 1) {
            guVar.g(1);
        } else if (!z) {
            guVar.g(0);
        } else {
            guVar.getClass();
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        gu guVar = this.e;
        guVar.m = colorStateList;
        r21.b(guVar.c, guVar.i, colorStateList, guVar.n);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        gu guVar = this.e;
        guVar.n = mode;
        r21.b(guVar.c, guVar.i, guVar.m, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        Editable editable = null;
        if (this.w == null) {
            s7 s7Var = new s7(getContext(), null);
            this.w = s7Var;
            s7Var.setId(svarzee.android.apps.adb_mouse.R.id.textinput_placeholder);
            this.w.setImportantForAccessibility(1);
            this.w.setAccessibilityLiveRegion(1);
            bv f = f();
            this.z = f;
            f.d = 67L;
            this.A = f();
            setPlaceholderTextAppearance(this.y);
            setPlaceholderTextColor(this.x);
            ry0.m(this.w, new y80(4));
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.v) {
                setPlaceholderTextEnabled(true);
            }
            this.u = charSequence;
        }
        EditText editText = this.g;
        if (editText != null) {
            editable = editText.getText();
        }
        x(editable);
    }

    public void setPlaceholderTextAppearance(int i) {
        this.y = i;
        s7 s7Var = this.w;
        if (s7Var != null) {
            s7Var.setTextAppearance(i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.x != colorStateList) {
            this.x = colorStateList;
            s7 s7Var = this.w;
            if (s7Var != null && colorStateList != null) {
                s7Var.setTextColor(colorStateList);
            }
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        CharSequence charSequence2;
        op0 op0Var = this.d;
        op0Var.getClass();
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        op0Var.e = charSequence2;
        op0Var.d.setText(charSequence);
        op0Var.e();
    }

    public void setPrefixTextAppearance(int i) {
        this.d.d.setTextAppearance(i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.d.d.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(on0 on0Var) {
        m90 m90Var = this.I;
        if (m90Var != null && m90Var.d.a != on0Var) {
            this.O = on0Var;
            c();
        }
    }

    public void setStartIconCheckable(boolean z) {
        this.d.f.setCheckable(z);
    }

    public void setStartIconContentDescription(int i) {
        CharSequence charSequence;
        if (i != 0) {
            charSequence = getResources().getText(i);
        } else {
            charSequence = null;
        }
        setStartIconContentDescription(charSequence);
    }

    public void setStartIconDrawable(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = r21.r(getContext(), i);
        } else {
            drawable = null;
        }
        setStartIconDrawable(drawable);
    }

    public void setStartIconMinSize(int i) {
        op0 op0Var = this.d;
        if (i >= 0) {
            if (i != op0Var.i) {
                op0Var.i = i;
                CheckableImageButton checkableImageButton = op0Var.f;
                checkableImageButton.setMinimumWidth(i);
                checkableImageButton.setMinimumHeight(i);
                return;
            }
            return;
        }
        op0Var.getClass();
        c.k("startIconSize cannot be less than 0");
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        op0 op0Var = this.d;
        CheckableImageButton checkableImageButton = op0Var.f;
        View.OnLongClickListener onLongClickListener = op0Var.k;
        checkableImageButton.setOnClickListener(onClickListener);
        r21.I(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        op0 op0Var = this.d;
        op0Var.k = onLongClickListener;
        CheckableImageButton checkableImageButton = op0Var.f;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        r21.I(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        op0 op0Var = this.d;
        op0Var.j = scaleType;
        op0Var.f.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        op0 op0Var = this.d;
        if (op0Var.g != colorStateList) {
            op0Var.g = colorStateList;
            r21.b(op0Var.c, op0Var.f, colorStateList, op0Var.h);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        op0 op0Var = this.d;
        if (op0Var.h != mode) {
            op0Var.h = mode;
            r21.b(op0Var.c, op0Var.f, op0Var.g, mode);
        }
    }

    public void setStartIconVisible(boolean z) {
        this.d.c(z);
    }

    public void setSuffixText(CharSequence charSequence) {
        CharSequence charSequence2;
        gu guVar = this.e;
        guVar.getClass();
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        guVar.r = charSequence2;
        guVar.s.setText(charSequence);
        guVar.n();
    }

    public void setSuffixTextAppearance(int i) {
        this.e.s.setTextAppearance(i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.e.s.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(mr0 mr0Var) {
        EditText editText = this.g;
        if (editText != null) {
            ry0.m(editText, mr0Var);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.e0) {
            this.e0 = typeface;
            this.y0.n(typeface);
            w10 w10Var = this.m;
            if (typeface != w10Var.B) {
                w10Var.B = typeface;
                s7 s7Var = w10Var.r;
                if (s7Var != null) {
                    s7Var.setTypeface(typeface);
                }
                s7 s7Var2 = w10Var.y;
                if (s7Var2 != null) {
                    s7Var2.setTypeface(typeface);
                }
            }
            s7 s7Var3 = this.r;
            if (s7Var3 != null) {
                s7Var3.setTypeface(typeface);
            }
        }
    }

    public final void t() {
        Drawable background;
        s7 s7Var;
        EditText editText = this.g;
        if (editText != null && this.R == 0 && (background = editText.getBackground()) != null) {
            int[] iArr = lr.a;
            Drawable mutate = background.mutate();
            if (o()) {
                mutate.setColorFilter(j6.c(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
            } else if (this.p && (s7Var = this.r) != null) {
                mutate.setColorFilter(j6.c(s7Var.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
            } else {
                mutate.clearColorFilter();
                this.g.refreshDrawableState();
            }
        }
    }

    public final void u() {
        EditText editText = this.g;
        if (editText != null && this.I != null) {
            if ((this.L || editText.getBackground() == null) && this.R != 0) {
                this.g.setBackground(getEditTextBoxBackground());
                this.L = true;
            }
        }
    }

    public final void v() {
        if (this.R != 1) {
            FrameLayout frameLayout = this.c;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int e = e();
            if (e != layoutParams.topMargin) {
                layoutParams.topMargin = e;
                frameLayout.requestLayout();
            }
        }
    }

    public final void w(boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        ColorStateList colorStateList;
        s7 s7Var;
        ColorStateList colorStateList2;
        boolean isEnabled = isEnabled();
        EditText editText = this.g;
        if (editText != null && !TextUtils.isEmpty(editText.getText())) {
            z3 = true;
        } else {
            z3 = false;
        }
        EditText editText2 = this.g;
        if (editText2 != null && editText2.hasFocus()) {
            z4 = true;
        } else {
            z4 = false;
        }
        ColorStateList colorStateList3 = this.l0;
        di diVar = this.y0;
        if (colorStateList3 != null) {
            diVar.k(colorStateList3);
        }
        Editable editable = null;
        if (!isEnabled) {
            ColorStateList colorStateList4 = this.l0;
            int i = this.v0;
            if (colorStateList4 != null) {
                i = colorStateList4.getColorForState(new int[]{-16842910}, i);
            }
            diVar.k(ColorStateList.valueOf(i));
        } else if (o()) {
            s7 s7Var2 = this.m.r;
            if (s7Var2 != null) {
                colorStateList2 = s7Var2.getTextColors();
            } else {
                colorStateList2 = null;
            }
            diVar.k(colorStateList2);
        } else if (this.p && (s7Var = this.r) != null) {
            diVar.k(s7Var.getTextColors());
        } else if (z4 && (colorStateList = this.m0) != null && diVar.k != colorStateList) {
            diVar.k = colorStateList;
            diVar.j(false);
        }
        gu guVar = this.e;
        op0 op0Var = this.d;
        if (!z3 && this.z0 && (!isEnabled() || !z4)) {
            if (z2 || !this.x0) {
                ValueAnimator valueAnimator = this.B0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.B0.cancel();
                }
                if (z && this.A0) {
                    b(0.0f);
                } else {
                    diVar.m(0.0f);
                }
                if (g() && !((am) this.I).I.r.isEmpty() && g()) {
                    ((am) this.I).t(0.0f, 0.0f, 0.0f, 0.0f);
                }
                this.x0 = true;
                s7 s7Var3 = this.w;
                if (s7Var3 != null && this.v) {
                    s7Var3.setText((CharSequence) null);
                    fu0.a(this.c, this.A);
                    this.w.setVisibility(4);
                }
                op0Var.l = true;
                op0Var.e();
                guVar.t = true;
                guVar.n();
                return;
            }
            return;
        }
        if (!z2 && !this.x0) {
            return;
        }
        ValueAnimator valueAnimator2 = this.B0;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            this.B0.cancel();
        }
        if (z && this.A0) {
            b(1.0f);
        } else {
            diVar.m(1.0f);
        }
        this.x0 = false;
        if (g()) {
            l();
        }
        EditText editText3 = this.g;
        if (editText3 != null) {
            editable = editText3.getText();
        }
        x(editable);
        op0Var.l = false;
        op0Var.e();
        guVar.t = false;
        guVar.n();
    }

    public final void x(Editable editable) {
        int i;
        ((f40) this.q).getClass();
        if (editable != null) {
            i = editable.length();
        } else {
            i = 0;
        }
        FrameLayout frameLayout = this.c;
        if (i == 0 && !this.x0) {
            if (this.w != null && this.v && !TextUtils.isEmpty(this.u)) {
                this.w.setText(this.u);
                fu0.a(frameLayout, this.z);
                this.w.setVisibility(0);
                this.w.bringToFront();
                return;
            }
            return;
        }
        s7 s7Var = this.w;
        if (s7Var != null && this.v) {
            s7Var.setText((CharSequence) null);
            fu0.a(frameLayout, this.A);
            this.w.setVisibility(4);
        }
    }

    public final void y(boolean z, boolean z2) {
        int defaultColor = this.q0.getDefaultColor();
        int colorForState = this.q0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.q0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z) {
            this.W = colorForState2;
        } else if (z2) {
            this.W = colorForState;
        } else {
            this.W = defaultColor;
        }
    }

    public final void z() {
        boolean z;
        s7 s7Var;
        EditText editText;
        EditText editText2;
        if (this.I != null && this.R != 0) {
            boolean z2 = false;
            if (!isFocused() && ((editText2 = this.g) == null || !editText2.hasFocus())) {
                z = false;
            } else {
                z = true;
            }
            if (isHovered() || ((editText = this.g) != null && editText.isHovered())) {
                z2 = true;
            }
            if (!isEnabled()) {
                this.W = this.v0;
            } else if (o()) {
                if (this.q0 != null) {
                    y(z, z2);
                } else {
                    this.W = getErrorCurrentTextColors();
                }
            } else if (this.p && (s7Var = this.r) != null) {
                if (this.q0 != null) {
                    y(z, z2);
                } else {
                    this.W = s7Var.getCurrentTextColor();
                }
            } else if (z) {
                this.W = this.p0;
            } else if (z2) {
                this.W = this.o0;
            } else {
                this.W = this.n0;
            }
            if (Build.VERSION.SDK_INT >= 29) {
                r();
            }
            gu guVar = this.e;
            TextInputLayout textInputLayout = guVar.c;
            CheckableImageButton checkableImageButton = guVar.i;
            TextInputLayout textInputLayout2 = guVar.c;
            guVar.l();
            r21.G(textInputLayout2, guVar.e, guVar.f);
            r21.G(textInputLayout2, checkableImageButton, guVar.m);
            if (guVar.b() instanceof bs) {
                if (textInputLayout.o() && checkableImageButton.getDrawable() != null) {
                    Drawable mutate = checkableImageButton.getDrawable().mutate();
                    mutate.setTint(textInputLayout.getErrorCurrentTextColors());
                    checkableImageButton.setImageDrawable(mutate);
                } else {
                    r21.b(textInputLayout, checkableImageButton, guVar.m, guVar.n);
                }
            }
            op0 op0Var = this.d;
            r21.G(op0Var.c, op0Var.f, op0Var.g);
            if (this.R == 2) {
                int i = this.T;
                if (z && isEnabled()) {
                    this.T = this.V;
                } else {
                    this.T = this.U;
                }
                if (this.T != i && g() && !this.x0) {
                    if (g()) {
                        ((am) this.I).t(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    l();
                }
            }
            if (this.R == 1) {
                if (!isEnabled()) {
                    this.a0 = this.s0;
                } else if (z2 && !z) {
                    this.a0 = this.u0;
                } else if (z) {
                    this.a0 = this.t0;
                } else {
                    this.a0 = this.r0;
                }
            }
            c();
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.F) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.d.f;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.d.b(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.e.i.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.e.i.setImageDrawable(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.e.i;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.e.i(drawable);
    }

    public void setEndIconDrawable(Drawable drawable) {
        gu guVar = this.e;
        TextInputLayout textInputLayout = guVar.c;
        CheckableImageButton checkableImageButton = guVar.i;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            r21.b(textInputLayout, checkableImageButton, guVar.m, guVar.n);
            r21.G(textInputLayout, checkableImageButton, guVar.m);
        }
    }
}
