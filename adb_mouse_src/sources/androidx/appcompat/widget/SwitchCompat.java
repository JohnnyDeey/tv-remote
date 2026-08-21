package androidx.appcompat.widget;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import defpackage.b8;
import defpackage.bg;
import defpackage.fy0;
import defpackage.k20;
import defpackage.l4;
import defpackage.lr;
import defpackage.lz0;
import defpackage.m6;
import defpackage.mn;
import defpackage.ng0;
import defpackage.nt;
import defpackage.o7;
import defpackage.oi0;
import defpackage.r21;
import defpackage.ry0;
import defpackage.sr0;
import defpackage.zs;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {
    public static final bg T = new bg(Float.class, "thumbPos", 10);
    public static final int[] U = {R.attr.state_checked};
    public final int A;
    public float B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public boolean J;
    public final TextPaint K;
    public final ColorStateList L;
    public StaticLayout M;
    public StaticLayout N;
    public final l4 O;
    public ObjectAnimator P;
    public m6 Q;
    public nt R;
    public final Rect S;
    public Drawable c;
    public ColorStateList d;
    public PorterDuff.Mode e;
    public boolean f;
    public boolean g;
    public Drawable h;
    public ColorStateList i;
    public PorterDuff.Mode j;
    public boolean k;
    public boolean l;
    public int m;
    public int n;
    public int o;
    public boolean p;
    public CharSequence q;
    public CharSequence r;
    public CharSequence s;
    public CharSequence t;
    public boolean u;
    public int v;
    public final int w;
    public float x;
    public float y;
    public final VelocityTracker z;

    /* JADX WARN: Type inference failed for: r12v11, types: [l4, java.lang.Object] */
    public SwitchCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, svarzee.android.apps.adb_mouse.R.attr.switchStyle);
        Typeface typeface;
        Typeface create;
        int i;
        int resourceId;
        this.d = null;
        this.e = null;
        this.f = false;
        this.g = false;
        this.i = null;
        this.j = null;
        this.k = false;
        this.l = false;
        this.z = VelocityTracker.obtain();
        this.J = true;
        this.S = new Rect();
        sr0.a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.K = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = ng0.v;
        b8 J = b8.J(context, attributeSet, iArr, svarzee.android.apps.adb_mouse.R.attr.switchStyle);
        TypedArray typedArray = (TypedArray) J.d;
        ry0.l(this, context, iArr, attributeSet, typedArray, svarzee.android.apps.adb_mouse.R.attr.switchStyle);
        Drawable z = J.z(2);
        this.c = z;
        if (z != null) {
            z.setCallback(this);
        }
        Drawable z2 = J.z(11);
        this.h = z2;
        if (z2 != null) {
            z2.setCallback(this);
        }
        setTextOnInternal(typedArray.getText(0));
        setTextOffInternal(typedArray.getText(1));
        this.u = typedArray.getBoolean(3, true);
        this.m = typedArray.getDimensionPixelSize(8, 0);
        this.n = typedArray.getDimensionPixelSize(5, 0);
        this.o = typedArray.getDimensionPixelSize(6, 0);
        this.p = typedArray.getBoolean(4, false);
        ColorStateList y = J.y(9);
        if (y != null) {
            this.d = y;
            this.f = true;
        }
        PorterDuff.Mode c = lr.c(typedArray.getInt(10, -1), null);
        if (this.e != c) {
            this.e = c;
            this.g = true;
        }
        if (this.f || this.g) {
            a();
        }
        ColorStateList y2 = J.y(12);
        if (y2 != null) {
            this.i = y2;
            this.k = true;
        }
        PorterDuff.Mode c2 = lr.c(typedArray.getInt(13, -1), null);
        if (this.j != c2) {
            this.j = c2;
            this.l = true;
        }
        if (this.k || this.l) {
            b();
        }
        int resourceId2 = typedArray.getResourceId(7, 0);
        if (resourceId2 != 0) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(resourceId2, ng0.w);
            ColorStateList colorStateList = (!obtainStyledAttributes.hasValue(3) || (resourceId = obtainStyledAttributes.getResourceId(3, 0)) == 0 || (colorStateList = mn.q(context, resourceId)) == null) ? obtainStyledAttributes.getColorStateList(3) : colorStateList;
            if (colorStateList != null) {
                this.L = colorStateList;
            } else {
                this.L = getTextColors();
            }
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            if (dimensionPixelSize != 0) {
                float f = dimensionPixelSize;
                if (f != textPaint.getTextSize()) {
                    textPaint.setTextSize(f);
                    requestLayout();
                }
            }
            int i2 = obtainStyledAttributes.getInt(1, -1);
            int i3 = obtainStyledAttributes.getInt(2, -1);
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        typeface = null;
                    } else {
                        typeface = Typeface.MONOSPACE;
                    }
                } else {
                    typeface = Typeface.SERIF;
                }
            } else {
                typeface = Typeface.SANS_SERIF;
            }
            if (i3 > 0) {
                if (typeface == null) {
                    create = Typeface.defaultFromStyle(i3);
                } else {
                    create = Typeface.create(typeface, i3);
                }
                setSwitchTypeface(create);
                if (create != null) {
                    i = create.getStyle();
                } else {
                    i = 0;
                }
                int i4 = (~i) & i3;
                textPaint.setFakeBoldText((i4 & 1) != 0);
                textPaint.setTextSkewX((2 & i4) != 0 ? -0.25f : 0.0f);
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setTextSkewX(0.0f);
                setSwitchTypeface(typeface);
            }
            if (obtainStyledAttributes.getBoolean(14, false)) {
                Context context2 = getContext();
                ?? obj = new Object();
                obj.c = context2.getResources().getConfiguration().locale;
                this.O = obj;
            } else {
                this.O = null;
            }
            setTextOnInternal(this.q);
            setTextOffInternal(this.s);
            obtainStyledAttributes.recycle();
        }
        new o7(this).f(attributeSet, svarzee.android.apps.adb_mouse.R.attr.switchStyle);
        J.N();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.w = viewConfiguration.getScaledTouchSlop();
        this.A = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().b(attributeSet, svarzee.android.apps.adb_mouse.R.attr.switchStyle);
        refreshDrawableState();
        setChecked(isChecked());
    }

    private m6 getEmojiTextViewHelper() {
        if (this.Q == null) {
            this.Q = new m6(this);
        }
        return this.Q;
    }

    private boolean getTargetCheckedState() {
        if (this.B > 0.5f) {
            return true;
        }
        return false;
    }

    private int getThumbOffset() {
        boolean z = lz0.a;
        int layoutDirection = getLayoutDirection();
        float f = this.B;
        if (layoutDirection == 1) {
            f = 1.0f - f;
        }
        return (int) ((f * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Rect rect;
        Drawable drawable = this.h;
        if (drawable != null) {
            Rect rect2 = this.S;
            drawable.getPadding(rect2);
            Drawable drawable2 = this.c;
            if (drawable2 != null) {
                rect = lr.b(drawable2);
            } else {
                rect = lr.c;
            }
            return ((((this.C - this.E) - rect2.left) - rect2.right) - rect.left) - rect.right;
        }
        return 0;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.s = charSequence;
        TransformationMethod t0 = ((k20) getEmojiTextViewHelper().b.d).t0(this.O);
        if (t0 != null) {
            charSequence = t0.getTransformation(charSequence, this);
        }
        this.t = charSequence;
        this.N = null;
        if (this.u) {
            d();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.q = charSequence;
        TransformationMethod t0 = ((k20) getEmojiTextViewHelper().b.d).t0(this.O);
        if (t0 != null) {
            charSequence = t0.getTransformation(charSequence, this);
        }
        this.r = charSequence;
        this.M = null;
        if (this.u) {
            d();
        }
    }

    public final void a() {
        Drawable drawable = this.c;
        if (drawable != null) {
            if (this.f || this.g) {
                Drawable mutate = drawable.mutate();
                this.c = mutate;
                if (this.f) {
                    mutate.setTintList(this.d);
                }
                if (this.g) {
                    this.c.setTintMode(this.e);
                }
                if (this.c.isStateful()) {
                    this.c.setState(getDrawableState());
                }
            }
        }
    }

    public final void b() {
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
                    this.h.setState(getDrawableState());
                }
            }
        }
    }

    public final void c() {
        setTextOnInternal(this.q);
        setTextOffInternal(this.s);
        requestLayout();
    }

    public final void d() {
        if (this.R == null && ((k20) this.Q.b.d).L() && zs.k != null) {
            zs a = zs.a();
            int b = a.b();
            if (b == 3 || b == 0) {
                nt ntVar = new nt(this);
                this.R = ntVar;
                a.f(ntVar);
            }
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        Rect rect;
        int i;
        int i2;
        int i3 = this.F;
        int i4 = this.G;
        int i5 = this.H;
        int i6 = this.I;
        int thumbOffset = getThumbOffset() + i3;
        Drawable drawable = this.c;
        if (drawable != null) {
            rect = lr.b(drawable);
        } else {
            rect = lr.c;
        }
        Drawable drawable2 = this.h;
        Rect rect2 = this.S;
        if (drawable2 != null) {
            drawable2.getPadding(rect2);
            int i7 = rect2.left;
            thumbOffset += i7;
            if (rect != null) {
                int i8 = rect.left;
                if (i8 > i7) {
                    i3 += i8 - i7;
                }
                int i9 = rect.top;
                int i10 = rect2.top;
                if (i9 > i10) {
                    i = (i9 - i10) + i4;
                } else {
                    i = i4;
                }
                int i11 = rect.right;
                int i12 = rect2.right;
                if (i11 > i12) {
                    i5 -= i11 - i12;
                }
                int i13 = rect.bottom;
                int i14 = rect2.bottom;
                if (i13 > i14) {
                    i2 = i6 - (i13 - i14);
                    this.h.setBounds(i3, i, i5, i2);
                }
            } else {
                i = i4;
            }
            i2 = i6;
            this.h.setBounds(i3, i, i5, i2);
        }
        Drawable drawable3 = this.c;
        if (drawable3 != null) {
            drawable3.getPadding(rect2);
            int i15 = thumbOffset - rect2.left;
            int i16 = thumbOffset + this.E + rect2.right;
            this.c.setBounds(i15, i4, i16, i6);
            Drawable background = getBackground();
            if (background != null) {
                background.setHotspotBounds(i15, i4, i16, i6);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
        Drawable drawable2 = this.h;
        if (drawable2 != null) {
            drawable2.setHotspot(f, f2);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        boolean z;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.c;
        if (drawable != null && drawable.isStateful()) {
            z = drawable.setState(drawableState);
        } else {
            z = false;
        }
        Drawable drawable2 = this.h;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        boolean z = lz0.a;
        if (getLayoutDirection() == 1) {
            int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.C;
            if (!TextUtils.isEmpty(getText())) {
                return compoundPaddingLeft + this.o;
            }
            return compoundPaddingLeft;
        }
        return super.getCompoundPaddingLeft();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        boolean z = lz0.a;
        if (getLayoutDirection() == 1) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.C;
        if (!TextUtils.isEmpty(getText())) {
            return compoundPaddingRight + this.o;
        }
        return compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return oi0.y(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.u;
    }

    public boolean getSplitTrack() {
        return this.p;
    }

    public int getSwitchMinWidth() {
        return this.n;
    }

    public int getSwitchPadding() {
        return this.o;
    }

    public CharSequence getTextOff() {
        return this.s;
    }

    public CharSequence getTextOn() {
        return this.q;
    }

    public Drawable getThumbDrawable() {
        return this.c;
    }

    public final float getThumbPosition() {
        return this.B;
    }

    public int getThumbTextPadding() {
        return this.m;
    }

    public ColorStateList getThumbTintList() {
        return this.d;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.e;
    }

    public Drawable getTrackDrawable() {
        return this.h;
    }

    public ColorStateList getTrackTintList() {
        return this.i;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.j;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.h;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.P;
        if (objectAnimator != null && objectAnimator.isStarted()) {
            this.P.end();
            this.P = null;
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, U);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        StaticLayout staticLayout;
        int width;
        super.onDraw(canvas);
        Drawable drawable = this.h;
        Rect rect = this.S;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i = this.G;
        int i2 = this.I;
        int i3 = i + rect.top;
        int i4 = i2 - rect.bottom;
        Drawable drawable2 = this.c;
        if (drawable != null) {
            if (this.p && drawable2 != null) {
                Rect b = lr.b(drawable2);
                drawable2.copyBounds(rect);
                rect.left += b.left;
                rect.right -= b.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            } else {
                drawable.draw(canvas);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        if (getTargetCheckedState()) {
            staticLayout = this.M;
        } else {
            staticLayout = this.N;
        }
        if (staticLayout != null) {
            int[] drawableState = getDrawableState();
            TextPaint textPaint = this.K;
            ColorStateList colorStateList = this.L;
            if (colorStateList != null) {
                textPaint.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            textPaint.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (staticLayout.getWidth() / 2), ((i3 + i4) / 2) - (staticLayout.getHeight() / 2));
            staticLayout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence charSequence;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            if (isChecked()) {
                charSequence = this.q;
            } else {
                charSequence = this.s;
            }
            if (!TextUtils.isEmpty(charSequence)) {
                CharSequence text = accessibilityNodeInfo.getText();
                if (TextUtils.isEmpty(text)) {
                    accessibilityNodeInfo.setText(charSequence);
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(text);
                sb.append(' ');
                sb.append(charSequence);
                accessibilityNodeInfo.setText(sb);
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int width;
        int i6;
        int i7;
        int i8;
        super.onLayout(z, i, i2, i3, i4);
        int i9 = 0;
        if (this.c != null) {
            Drawable drawable = this.h;
            Rect rect = this.S;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect b = lr.b(this.c);
            i5 = Math.max(0, b.left - rect.left);
            i9 = Math.max(0, b.right - rect.right);
        } else {
            i5 = 0;
        }
        boolean z2 = lz0.a;
        if (getLayoutDirection() == 1) {
            i6 = getPaddingLeft() + i5;
            width = ((this.C + i6) - i5) - i9;
        } else {
            width = (getWidth() - getPaddingRight()) - i9;
            i6 = (width - this.C) + i5 + i9;
        }
        int gravity = getGravity() & 112;
        if (gravity != 16) {
            if (gravity != 80) {
                i8 = getPaddingTop();
                i7 = this.D + i8;
            } else {
                i7 = getHeight() - getPaddingBottom();
                i8 = i7 - this.D;
            }
        } else {
            int height = ((getHeight() + getPaddingTop()) - getPaddingBottom()) / 2;
            int i10 = this.D;
            int i11 = height - (i10 / 2);
            i7 = i10 + i11;
            i8 = i11;
        }
        this.F = i6;
        this.G = i8;
        this.I = i7;
        this.H = width;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = 0;
        if (this.u) {
            StaticLayout staticLayout = this.M;
            TextPaint textPaint = this.K;
            if (staticLayout == null) {
                CharSequence charSequence = this.r;
                if (charSequence != null) {
                    i7 = (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint));
                } else {
                    i7 = 0;
                }
                this.M = new StaticLayout(charSequence, textPaint, i7, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
            if (this.N == null) {
                CharSequence charSequence2 = this.t;
                if (charSequence2 != null) {
                    i6 = (int) Math.ceil(Layout.getDesiredWidth(charSequence2, textPaint));
                } else {
                    i6 = 0;
                }
                this.N = new StaticLayout(charSequence2, textPaint, i6, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
        }
        Drawable drawable = this.c;
        Rect rect = this.S;
        if (drawable != null) {
            drawable.getPadding(rect);
            i3 = (this.c.getIntrinsicWidth() - rect.left) - rect.right;
            i4 = this.c.getIntrinsicHeight();
        } else {
            i3 = 0;
            i4 = 0;
        }
        if (this.u) {
            i5 = (this.m * 2) + Math.max(this.M.getWidth(), this.N.getWidth());
        } else {
            i5 = 0;
        }
        this.E = Math.max(i5, i3);
        Drawable drawable2 = this.h;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i8 = this.h.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i9 = rect.left;
        int i10 = rect.right;
        Drawable drawable3 = this.c;
        if (drawable3 != null) {
            Rect b = lr.b(drawable3);
            i9 = Math.max(i9, b.left);
            i10 = Math.max(i10, b.right);
        }
        boolean z = this.J;
        int i11 = this.n;
        if (z) {
            i11 = Math.max(i11, (this.E * 2) + i9 + i10);
        }
        int max = Math.max(i8, i4);
        this.C = i11;
        this.D = max;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < max) {
            setMeasuredDimension(getMeasuredWidthAndState(), max);
        }
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        CharSequence charSequence;
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        if (isChecked()) {
            charSequence = this.q;
        } else {
            charSequence = this.s;
        }
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0015, code lost:
    
        if (r1 != 3) goto L82;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        super.setChecked(z);
        boolean isChecked = isChecked();
        if (isChecked) {
            if (Build.VERSION.SDK_INT >= 30) {
                Object obj = this.q;
                if (obj == null) {
                    obj = getResources().getString(svarzee.android.apps.adb_mouse.R.string.abc_capital_on);
                }
                Object obj2 = obj;
                WeakHashMap weakHashMap = ry0.a;
                new fy0(svarzee.android.apps.adb_mouse.R.id.tag_state_description, CharSequence.class, 64, 30, 2).d(this, obj2);
            }
        } else if (Build.VERSION.SDK_INT >= 30) {
            Object obj3 = this.s;
            if (obj3 == null) {
                obj3 = getResources().getString(svarzee.android.apps.adb_mouse.R.string.abc_capital_off);
            }
            Object obj4 = obj3;
            WeakHashMap weakHashMap2 = ry0.a;
            new fy0(svarzee.android.apps.adb_mouse.R.id.tag_state_description, CharSequence.class, 64, 30, 2).d(this, obj4);
        }
        float f = 0.0f;
        if (getWindowToken() != null && isLaidOut()) {
            if (isChecked) {
                f = 1.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, T, f);
            this.P = ofFloat;
            ofFloat.setDuration(250L);
            this.P.setAutoCancel(true);
            this.P.start();
            return;
        }
        ObjectAnimator objectAnimator = this.P;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        if (isChecked) {
            f = 1.0f;
        }
        setThumbPosition(f);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(oi0.z(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().d(z);
        setTextOnInternal(this.q);
        setTextOffInternal(this.s);
        requestLayout();
    }

    public final void setEnforceSwitchWidth(boolean z) {
        this.J = z;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setShowText(boolean z) {
        if (this.u != z) {
            this.u = z;
            requestLayout();
            if (z) {
                d();
            }
        }
    }

    public void setSplitTrack(boolean z) {
        this.p = z;
        invalidate();
    }

    public void setSwitchMinWidth(int i) {
        this.n = i;
        requestLayout();
    }

    public void setSwitchPadding(int i) {
        this.o = i;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        TextPaint textPaint = this.K;
        if ((textPaint.getTypeface() != null && !textPaint.getTypeface().equals(typeface)) || (textPaint.getTypeface() == null && typeface != null)) {
            textPaint.setTypeface(typeface);
            requestLayout();
            invalidate();
        }
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (!isChecked() && Build.VERSION.SDK_INT >= 30) {
            Object obj = this.s;
            if (obj == null) {
                obj = getResources().getString(svarzee.android.apps.adb_mouse.R.string.abc_capital_off);
            }
            WeakHashMap weakHashMap = ry0.a;
            new fy0(svarzee.android.apps.adb_mouse.R.id.tag_state_description, CharSequence.class, 64, 30, 2).d(this, obj);
        }
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (isChecked() && Build.VERSION.SDK_INT >= 30) {
            Object obj = this.q;
            if (obj == null) {
                obj = getResources().getString(svarzee.android.apps.adb_mouse.R.string.abc_capital_on);
            }
            WeakHashMap weakHashMap = ry0.a;
            new fy0(svarzee.android.apps.adb_mouse.R.id.tag_state_description, CharSequence.class, 64, 30, 2).d(this, obj);
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.c;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.c = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f) {
        this.B = f;
        invalidate();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(r21.r(getContext(), i));
    }

    public void setThumbTextPadding(int i) {
        this.m = i;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.d = colorStateList;
        this.f = true;
        a();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.e = mode;
        this.g = true;
        a();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.h;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.h = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i) {
        setTrackDrawable(r21.r(getContext(), i));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.i = colorStateList;
        this.k = true;
        b();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.j = mode;
        this.l = true;
        b();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.c && drawable != this.h) {
            return false;
        }
        return true;
    }
}
