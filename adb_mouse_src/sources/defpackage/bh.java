package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.google.android.material.chip.Chip;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class bh extends m90 implements Drawable.Callback {
    public static final int[] Q0 = {R.attr.state_enabled};
    public static final ShapeDrawable R0 = new ShapeDrawable(new OvalShape());
    public int A0;
    public int B0;
    public boolean C0;
    public int D0;
    public int E0;
    public ColorFilter F0;
    public PorterDuffColorFilter G0;
    public ColorStateList H0;
    public ColorStateList I;
    public PorterDuff.Mode I0;
    public ColorStateList J;
    public int[] J0;
    public float K;
    public ColorStateList K0;
    public float L;
    public WeakReference L0;
    public ColorStateList M;
    public TextUtils.TruncateAt M0;
    public float N;
    public boolean N0;
    public ColorStateList O;
    public int O0;
    public CharSequence P;
    public boolean P0;
    public boolean Q;
    public Drawable R;
    public ColorStateList S;
    public float T;
    public boolean U;
    public boolean V;
    public Drawable W;
    public RippleDrawable X;
    public ColorStateList Y;
    public float Z;
    public SpannableStringBuilder a0;
    public boolean b0;
    public boolean c0;
    public Drawable d0;
    public ColorStateList e0;
    public za0 f0;
    public za0 g0;
    public float h0;
    public float i0;
    public float j0;
    public float k0;
    public float l0;
    public float m0;
    public float n0;
    public float o0;
    public final Context p0;
    public final Paint q0;
    public final Paint.FontMetrics r0;
    public final RectF s0;
    public final PointF t0;
    public final Path u0;
    public final kr0 v0;
    public int w0;
    public int x0;
    public int y0;
    public int z0;

    public bh(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, svarzee.android.apps.adb_mouse.R.attr.chipStyle, svarzee.android.apps.adb_mouse.R.style.Widget_MaterialComponents_Chip_Action);
        this.L = -1.0f;
        this.q0 = new Paint(1);
        this.r0 = new Paint.FontMetrics();
        this.s0 = new RectF();
        this.t0 = new PointF();
        this.u0 = new Path();
        this.E0 = 255;
        this.I0 = PorterDuff.Mode.SRC_IN;
        this.L0 = new WeakReference(null);
        k(context);
        this.p0 = context;
        kr0 kr0Var = new kr0(this);
        this.v0 = kr0Var;
        this.P = "";
        kr0Var.a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = Q0;
        setState(iArr);
        R(iArr);
        this.N0 = true;
        R0.setTint(-1);
    }

    public static void b0(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public static boolean y(ColorStateList colorStateList) {
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        return false;
    }

    public static boolean z(Drawable drawable) {
        if (drawable != null && drawable.isStateful()) {
            return true;
        }
        return false;
    }

    public final void A() {
        Chip chip = (Chip) this.L0.get();
        if (chip != null) {
            chip.b(chip.r);
            chip.requestLayout();
            chip.invalidateOutline();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x014d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean B(int[] r10, int[] r11) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bh.B(int[], int[]):boolean");
    }

    public final void C(boolean z) {
        if (this.b0 != z) {
            this.b0 = z;
            float v = v();
            if (!z && this.C0) {
                this.C0 = false;
            }
            float v2 = v();
            invalidateSelf();
            if (v != v2) {
                A();
            }
        }
    }

    public final void D(Drawable drawable) {
        if (this.d0 != drawable) {
            float v = v();
            this.d0 = drawable;
            float v2 = v();
            b0(this.d0);
            t(this.d0);
            invalidateSelf();
            if (v != v2) {
                A();
            }
        }
    }

    public final void E(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.e0 != colorStateList) {
            this.e0 = colorStateList;
            if (this.c0 && (drawable = this.d0) != null && this.b0) {
                drawable.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void F(boolean z) {
        if (this.c0 != z) {
            boolean Y = Y();
            this.c0 = z;
            boolean Y2 = Y();
            if (Y != Y2) {
                Drawable drawable = this.d0;
                if (Y2) {
                    t(drawable);
                } else {
                    b0(drawable);
                }
                invalidateSelf();
                A();
            }
        }
    }

    public final void G(float f) {
        if (this.L != f) {
            this.L = f;
            nn0 f2 = this.d.a.f();
            f2.e = new k0(f);
            f2.f = new k0(f);
            f2.g = new k0(f);
            f2.h = new k0(f);
            setShapeAppearanceModel(f2.a());
        }
    }

    public final void H(Drawable drawable) {
        Drawable drawable2 = this.R;
        Drawable drawable3 = null;
        if (drawable2 == null) {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float v = v();
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.R = drawable3;
            float v2 = v();
            b0(drawable2);
            if (Z()) {
                t(this.R);
            }
            invalidateSelf();
            if (v != v2) {
                A();
            }
        }
    }

    public final void I(float f) {
        if (this.T != f) {
            float v = v();
            this.T = f;
            float v2 = v();
            invalidateSelf();
            if (v != v2) {
                A();
            }
        }
    }

    public final void J(ColorStateList colorStateList) {
        this.U = true;
        if (this.S != colorStateList) {
            this.S = colorStateList;
            if (Z()) {
                this.R.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void K(boolean z) {
        if (this.Q != z) {
            boolean Z = Z();
            this.Q = z;
            boolean Z2 = Z();
            if (Z != Z2) {
                Drawable drawable = this.R;
                if (Z2) {
                    t(drawable);
                } else {
                    b0(drawable);
                }
                invalidateSelf();
                A();
            }
        }
    }

    public final void L(ColorStateList colorStateList) {
        if (this.M != colorStateList) {
            this.M = colorStateList;
            if (this.P0) {
                k90 k90Var = this.d;
                if (k90Var.e != colorStateList) {
                    k90Var.e = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    public final void M(float f) {
        if (this.N != f) {
            this.N = f;
            this.q0.setStrokeWidth(f);
            if (this.P0) {
                this.d.k = f;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    public final void N(Drawable drawable) {
        Drawable drawable2 = this.W;
        Drawable drawable3 = null;
        if (drawable2 == null) {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float w = w();
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.W = drawable3;
            this.X = new RippleDrawable(uj0.a(this.O), this.W, R0);
            float w2 = w();
            b0(drawable2);
            if (a0()) {
                t(this.W);
            }
            invalidateSelf();
            if (w != w2) {
                A();
            }
        }
    }

    public final void O(float f) {
        if (this.n0 != f) {
            this.n0 = f;
            invalidateSelf();
            if (a0()) {
                A();
            }
        }
    }

    public final void P(float f) {
        if (this.Z != f) {
            this.Z = f;
            invalidateSelf();
            if (a0()) {
                A();
            }
        }
    }

    public final void Q(float f) {
        if (this.m0 != f) {
            this.m0 = f;
            invalidateSelf();
            if (a0()) {
                A();
            }
        }
    }

    public final boolean R(int[] iArr) {
        if (!Arrays.equals(this.J0, iArr)) {
            this.J0 = iArr;
            if (a0()) {
                return B(getState(), iArr);
            }
            return false;
        }
        return false;
    }

    public final void S(ColorStateList colorStateList) {
        if (this.Y != colorStateList) {
            this.Y = colorStateList;
            if (a0()) {
                this.W.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void T(boolean z) {
        if (this.V != z) {
            boolean a0 = a0();
            this.V = z;
            boolean a02 = a0();
            if (a0 != a02) {
                Drawable drawable = this.W;
                if (a02) {
                    t(drawable);
                } else {
                    b0(drawable);
                }
                invalidateSelf();
                A();
            }
        }
    }

    public final void U(float f) {
        if (this.j0 != f) {
            float v = v();
            this.j0 = f;
            float v2 = v();
            invalidateSelf();
            if (v != v2) {
                A();
            }
        }
    }

    public final void V(float f) {
        if (this.i0 != f) {
            float v = v();
            this.i0 = f;
            float v2 = v();
            invalidateSelf();
            if (v != v2) {
                A();
            }
        }
    }

    public final void W(ColorStateList colorStateList) {
        if (this.O != colorStateList) {
            this.O = colorStateList;
            this.K0 = null;
            onStateChange(getState());
        }
    }

    public final void X(ir0 ir0Var) {
        kr0 kr0Var = this.v0;
        yg ygVar = kr0Var.b;
        TextPaint textPaint = kr0Var.a;
        if (kr0Var.f != ir0Var) {
            kr0Var.f = ir0Var;
            if (ir0Var != null) {
                Context context = this.p0;
                ir0Var.e(context, textPaint, ygVar);
                bh bhVar = (bh) kr0Var.e.get();
                if (bhVar != null) {
                    textPaint.drawableState = bhVar.getState();
                }
                ir0Var.d(context, textPaint, ygVar);
                kr0Var.d = true;
            }
            bh bhVar2 = (bh) kr0Var.e.get();
            if (bhVar2 != null) {
                bhVar2.A();
                bhVar2.invalidateSelf();
                bhVar2.onStateChange(bhVar2.getState());
            }
        }
    }

    public final boolean Y() {
        if (this.c0 && this.d0 != null && this.C0) {
            return true;
        }
        return false;
    }

    public final boolean Z() {
        if (this.Q && this.R != null) {
            return true;
        }
        return false;
    }

    public final boolean a0() {
        if (this.V && this.W != null) {
            return true;
        }
        return false;
    }

    @Override // defpackage.m90, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        Canvas canvas2;
        int i2;
        float f;
        boolean z;
        int i3;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && (i = this.E0) != 0) {
            if (i < 255) {
                canvas2 = canvas;
                i2 = canvas2.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i);
            } else {
                canvas2 = canvas;
                i2 = 0;
            }
            boolean z2 = this.P0;
            Paint paint = this.q0;
            RectF rectF = this.s0;
            if (!z2) {
                paint.setColor(this.w0);
                paint.setStyle(Paint.Style.FILL);
                rectF.set(bounds);
                canvas2.drawRoundRect(rectF, x(), x(), paint);
            }
            if (!this.P0) {
                paint.setColor(this.x0);
                paint.setStyle(Paint.Style.FILL);
                ColorFilter colorFilter = this.F0;
                if (colorFilter == null) {
                    colorFilter = this.G0;
                }
                paint.setColorFilter(colorFilter);
                rectF.set(bounds);
                canvas2.drawRoundRect(rectF, x(), x(), paint);
            }
            if (this.P0) {
                super.draw(canvas);
            }
            if (this.N > 0.0f && !this.P0) {
                paint.setColor(this.z0);
                paint.setStyle(Paint.Style.STROKE);
                if (!this.P0) {
                    ColorFilter colorFilter2 = this.F0;
                    if (colorFilter2 == null) {
                        colorFilter2 = this.G0;
                    }
                    paint.setColorFilter(colorFilter2);
                }
                float f2 = bounds.left;
                float f3 = this.N / 2.0f;
                rectF.set(f2 + f3, bounds.top + f3, bounds.right - f3, bounds.bottom - f3);
                float f4 = this.L - (this.N / 2.0f);
                canvas2.drawRoundRect(rectF, f4, f4, paint);
            }
            paint.setColor(this.A0);
            paint.setStyle(Paint.Style.FILL);
            rectF.set(bounds);
            if (!this.P0) {
                canvas2.drawRoundRect(rectF, x(), x(), paint);
                f = 2.0f;
            } else {
                RectF rectF2 = new RectF(bounds);
                k90 k90Var = this.d;
                on0 on0Var = k90Var.a;
                float[] fArr = this.D;
                float f5 = k90Var.j;
                j90 j90Var = this.t;
                qn0 qn0Var = this.u;
                f = 2.0f;
                Path path = this.u0;
                qn0Var.a(on0Var, fArr, f5, rectF2, j90Var, path);
                e(canvas2, paint, path, this.d.a, this.D, g());
            }
            if (Z()) {
                u(bounds, rectF);
                float f6 = rectF.left;
                float f7 = rectF.top;
                canvas2.translate(f6, f7);
                this.R.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
                this.R.draw(canvas2);
                canvas2.translate(-f6, -f7);
            }
            if (Y()) {
                u(bounds, rectF);
                float f8 = rectF.left;
                float f9 = rectF.top;
                canvas2.translate(f8, f9);
                this.d0.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
                this.d0.draw(canvas2);
                canvas2.translate(-f8, -f9);
            }
            if (this.N0 && this.P != null) {
                PointF pointF = this.t0;
                pointF.set(0.0f, 0.0f);
                Paint.Align align = Paint.Align.LEFT;
                CharSequence charSequence = this.P;
                kr0 kr0Var = this.v0;
                if (charSequence != null) {
                    float v = v() + this.h0 + this.k0;
                    if (getLayoutDirection() == 0) {
                        pointF.x = bounds.left + v;
                    } else {
                        pointF.x = bounds.right - v;
                        align = Paint.Align.RIGHT;
                    }
                    float centerY = bounds.centerY();
                    TextPaint textPaint = kr0Var.a;
                    Paint.FontMetrics fontMetrics = this.r0;
                    textPaint.getFontMetrics(fontMetrics);
                    pointF.y = centerY - ((fontMetrics.descent + fontMetrics.ascent) / f);
                }
                rectF.setEmpty();
                if (this.P != null) {
                    float v2 = v() + this.h0 + this.k0;
                    float w = w() + this.o0 + this.l0;
                    int layoutDirection = getLayoutDirection();
                    int i4 = bounds.left;
                    if (layoutDirection == 0) {
                        rectF.left = i4 + v2;
                        rectF.right = bounds.right - w;
                    } else {
                        rectF.left = i4 + w;
                        rectF.right = bounds.right - v2;
                    }
                    rectF.top = bounds.top;
                    rectF.bottom = bounds.bottom;
                }
                ir0 ir0Var = kr0Var.f;
                TextPaint textPaint2 = kr0Var.a;
                if (ir0Var != null) {
                    textPaint2.drawableState = getState();
                    kr0Var.f.d(this.p0, textPaint2, kr0Var.b);
                }
                textPaint2.setTextAlign(align);
                if (Math.round(kr0Var.a(this.P.toString())) > Math.round(rectF.width())) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    int save = canvas2.save();
                    canvas2.clipRect(rectF);
                    i3 = save;
                } else {
                    i3 = 0;
                }
                CharSequence charSequence2 = this.P;
                if (z && this.M0 != null) {
                    charSequence2 = TextUtils.ellipsize(charSequence2, textPaint2, rectF.width(), this.M0);
                }
                canvas.drawText(charSequence2, 0, charSequence2.length(), pointF.x, pointF.y, textPaint2);
                canvas2 = canvas;
                if (z) {
                    canvas2.restoreToCount(i3);
                }
            }
            if (a0()) {
                rectF.setEmpty();
                if (a0()) {
                    float f10 = this.o0 + this.n0;
                    if (getLayoutDirection() == 0) {
                        float f11 = bounds.right - f10;
                        rectF.right = f11;
                        rectF.left = f11 - this.Z;
                    } else {
                        float f12 = bounds.left + f10;
                        rectF.left = f12;
                        rectF.right = f12 + this.Z;
                    }
                    float exactCenterY = bounds.exactCenterY();
                    float f13 = this.Z;
                    float f14 = exactCenterY - (f13 / f);
                    rectF.top = f14;
                    rectF.bottom = f14 + f13;
                }
                float f15 = rectF.left;
                float f16 = rectF.top;
                canvas2.translate(f15, f16);
                this.W.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
                this.X.setBounds(this.W.getBounds());
                this.X.jumpToCurrentState();
                this.X.draw(canvas2);
                canvas2.translate(-f15, -f16);
            }
            if (this.E0 < 255) {
                canvas2.restoreToCount(i2);
            }
        }
    }

    @Override // defpackage.m90, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.E0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.F0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.K;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.min(Math.round(w() + this.v0.a(this.P.toString()) + v() + this.h0 + this.k0 + this.l0 + this.o0), this.O0);
    }

    @Override // defpackage.m90, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // defpackage.m90, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Outline outline2;
        if (this.P0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.L);
            outline2 = outline;
        } else {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.K, this.L);
        }
        outline2.setAlpha(this.E0 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // defpackage.m90, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        if (!y(this.I) && !y(this.J) && !y(this.M)) {
            ir0 ir0Var = this.v0.f;
            if (ir0Var == null || (colorStateList = ir0Var.k) == null || !colorStateList.isStateful()) {
                if ((!this.c0 || this.d0 == null || !this.b0) && !z(this.R) && !z(this.d0) && !y(this.H0)) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (Z()) {
            onLayoutDirectionChanged |= this.R.setLayoutDirection(i);
        }
        if (Y()) {
            onLayoutDirectionChanged |= this.d0.setLayoutDirection(i);
        }
        if (a0()) {
            onLayoutDirectionChanged |= this.W.setLayoutDirection(i);
        }
        if (onLayoutDirectionChanged) {
            invalidateSelf();
            return true;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        boolean onLevelChange = super.onLevelChange(i);
        if (Z()) {
            onLevelChange |= this.R.setLevel(i);
        }
        if (Y()) {
            onLevelChange |= this.d0.setLevel(i);
        }
        if (a0()) {
            onLevelChange |= this.W.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // defpackage.m90, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (this.P0) {
            super.onStateChange(iArr);
        }
        return B(iArr, this.J0);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // defpackage.m90, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.E0 != i) {
            this.E0 = i;
            invalidateSelf();
        }
    }

    @Override // defpackage.m90, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.F0 != colorFilter) {
            this.F0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // defpackage.m90, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.H0 != colorStateList) {
            this.H0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // defpackage.m90, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        if (this.I0 != mode) {
            this.I0 = mode;
            ColorStateList colorStateList = this.H0;
            if (colorStateList != null && mode != null) {
                porterDuffColorFilter = new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            } else {
                porterDuffColorFilter = null;
            }
            this.G0 = porterDuffColorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (Z()) {
            visible |= this.R.setVisible(z, z2);
        }
        if (Y()) {
            visible |= this.d0.setVisible(z, z2);
        }
        if (a0()) {
            visible |= this.W.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public final void t(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(this);
            drawable.setLayoutDirection(getLayoutDirection());
            drawable.setLevel(getLevel());
            drawable.setVisible(isVisible(), false);
            if (drawable == this.W) {
                if (drawable.isStateful()) {
                    drawable.setState(this.J0);
                }
                drawable.setTintList(this.Y);
                return;
            }
            Drawable drawable2 = this.R;
            if (drawable == drawable2 && this.U) {
                drawable2.setTintList(this.S);
            }
            if (drawable.isStateful()) {
                drawable.setState(getState());
            }
        }
    }

    public final void u(Rect rect, RectF rectF) {
        Drawable drawable;
        Drawable drawable2;
        rectF.setEmpty();
        if (!Z() && !Y()) {
            return;
        }
        float f = this.h0 + this.i0;
        if (this.C0) {
            drawable = this.d0;
        } else {
            drawable = this.R;
        }
        float f2 = this.T;
        if (f2 <= 0.0f && drawable != null) {
            f2 = drawable.getIntrinsicWidth();
        }
        if (getLayoutDirection() == 0) {
            float f3 = rect.left + f;
            rectF.left = f3;
            rectF.right = f3 + f2;
        } else {
            float f4 = rect.right - f;
            rectF.right = f4;
            rectF.left = f4 - f2;
        }
        if (this.C0) {
            drawable2 = this.d0;
        } else {
            drawable2 = this.R;
        }
        float f5 = this.T;
        if (f5 <= 0.0f && drawable2 != null) {
            f5 = (float) Math.ceil(TypedValue.applyDimension(1, 24.0f, this.p0.getResources().getDisplayMetrics()));
            if (drawable2.getIntrinsicHeight() <= f5) {
                f5 = drawable2.getIntrinsicHeight();
            }
        }
        float exactCenterY = rect.exactCenterY() - (f5 / 2.0f);
        rectF.top = exactCenterY;
        rectF.bottom = exactCenterY + f5;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final float v() {
        Drawable drawable;
        if (!Z() && !Y()) {
            return 0.0f;
        }
        float f = this.i0;
        if (this.C0) {
            drawable = this.d0;
        } else {
            drawable = this.R;
        }
        float f2 = this.T;
        if (f2 <= 0.0f && drawable != null) {
            f2 = drawable.getIntrinsicWidth();
        }
        return f2 + f + this.j0;
    }

    public final float w() {
        if (a0()) {
            return this.m0 + this.Z + this.n0;
        }
        return 0.0f;
    }

    public final float x() {
        if (this.P0) {
            float[] fArr = this.D;
            if (fArr != null) {
                return fArr[3];
            }
            return this.d.a.e.a(g());
        }
        return this.L;
    }
}
