package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import android.util.StateSet;
import java.util.BitSet;
import java.util.Objects;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public class m90 extends Drawable implements zn0 {
    public static final Paint G;
    public static final l90[] H;
    public on0 A;
    public zo0 B;
    public final yo0[] C;
    public float[] D;
    public float[] E;
    public sf F;
    public final j90 c;
    public k90 d;
    public final xn0[] e;
    public final xn0[] f;
    public final BitSet g;
    public boolean h;
    public boolean i;
    public final Matrix j;
    public final Path k;
    public final Path l;
    public final RectF m;
    public final RectF n;
    public final Region o;
    public final Region p;
    public final Paint q;
    public final Paint r;
    public final mn0 s;
    public final j90 t;
    public final qn0 u;
    public PorterDuffColorFilter v;
    public PorterDuffColorFilter w;
    public final RectF x;
    public final boolean y;
    public boolean z;

    static {
        Paint paint = new Paint(1);
        G = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        H = new l90[4];
        int i = 0;
        while (true) {
            l90[] l90VarArr = H;
            if (i < l90VarArr.length) {
                l90VarArr[i] = new l90(i);
                i++;
            } else {
                return;
            }
        }
    }

    public m90(k90 k90Var) {
        qn0 qn0Var;
        this.c = new j90(this);
        this.e = new xn0[4];
        this.f = new xn0[4];
        this.g = new BitSet(8);
        this.j = new Matrix();
        this.k = new Path();
        this.l = new Path();
        this.m = new RectF();
        this.n = new RectF();
        this.o = new Region();
        this.p = new Region();
        Paint paint = new Paint(1);
        this.q = paint;
        Paint paint2 = new Paint(1);
        this.r = paint2;
        this.s = new mn0();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            qn0Var = pn0.a;
        } else {
            qn0Var = new qn0();
        }
        this.u = qn0Var;
        this.x = new RectF();
        this.y = true;
        this.z = true;
        this.C = new yo0[4];
        this.d = k90Var;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        r();
        p(getState());
        this.t = new j90(this);
    }

    public static float b(RectF rectF, on0 on0Var, float[] fArr) {
        if (fArr == null) {
            if (on0Var.e(rectF)) {
                return on0Var.e.a(rectF);
            }
            return -1.0f;
        }
        if (fArr.length > 1) {
            float f = fArr[0];
            for (int i = 1; i < fArr.length; i++) {
                if (fArr[i] != f) {
                    return -1.0f;
                }
            }
        }
        if (on0Var.d()) {
            return fArr[0];
        }
        return -1.0f;
    }

    public final void a(RectF rectF, Path path) {
        k90 k90Var = this.d;
        this.u.a(k90Var.a, this.D, k90Var.j, rectF, this.t, path);
        if (this.d.i != 1.0f) {
            Matrix matrix = this.j;
            matrix.reset();
            float f = this.d.i;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.x, true);
    }

    public final int c(int i) {
        float f;
        int i2;
        k90 k90Var = this.d;
        float f2 = k90Var.n + 0.0f + k90Var.m;
        us usVar = k90Var.c;
        if (usVar != null && usVar.a && oi.d(i, 255) == usVar.d) {
            if (usVar.e > 0.0f && f2 > 0.0f) {
                f = Math.min(((((float) Math.log1p(f2 / r3)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
            } else {
                f = 0.0f;
            }
            int alpha = Color.alpha(i);
            int O = f20.O(oi.d(i, 255), usVar.b, f);
            if (f > 0.0f && (i2 = usVar.c) != 0) {
                O = oi.b(oi.d(i2, us.f), O);
            }
            return oi.d(O, alpha);
        }
        return i;
    }

    public final void d(Canvas canvas) {
        if (this.g.cardinality() > 0) {
            Log.w("m90", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i = this.d.p;
        Path path = this.k;
        mn0 mn0Var = this.s;
        if (i != 0) {
            canvas.drawPath(path, mn0Var.a);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            xn0 xn0Var = this.e[i2];
            int i3 = this.d.o;
            Matrix matrix = xn0.b;
            xn0Var.a(matrix, mn0Var, i3, canvas);
            this.f[i2].a(matrix, mn0Var, this.d.o, canvas);
        }
        if (this.y) {
            int sin = (int) (Math.sin(Math.toRadians(0.0d)) * this.d.p);
            int cos = (int) (Math.cos(Math.toRadians(0.0d)) * this.d.p);
            canvas.translate(-sin, -cos);
            canvas.drawPath(path, G);
            canvas.translate(sin, cos);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0093, code lost:
    
        if (r19.d.a.d() != false) goto L43;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void draw(android.graphics.Canvas r20) {
        /*
            Method dump skipped, instructions count: 499
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m90.draw(android.graphics.Canvas):void");
    }

    public final void e(Canvas canvas, Paint paint, Path path, on0 on0Var, float[] fArr, RectF rectF) {
        float b = b(rectF, on0Var, fArr);
        if (b >= 0.0f) {
            float f = b * this.d.j;
            canvas.drawRoundRect(rectF, f, f, paint);
        } else {
            canvas.drawPath(path, paint);
        }
    }

    public void f(Canvas canvas) {
        on0 on0Var = this.A;
        float[] fArr = this.E;
        RectF g = g();
        RectF rectF = this.n;
        rectF.set(g);
        float i = i();
        rectF.inset(i, i);
        e(canvas, this.r, this.l, on0Var, fArr, rectF);
    }

    public final RectF g() {
        Rect bounds = getBounds();
        RectF rectF = this.m;
        rectF.set(bounds);
        return rectF;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.d.l;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.d;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.d.getClass();
        RectF g = g();
        if (!g.isEmpty()) {
            float b = b(g, this.d.a, this.D);
            if (b >= 0.0f) {
                outline.setRoundRect(getBounds(), b * this.d.j);
                return;
            }
            boolean z = this.h;
            Path path = this.k;
            if (z) {
                a(g, path);
                this.h = false;
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                kr.a(outline, path);
                return;
            }
            if (i >= 29) {
                try {
                    jr.a(outline, path);
                } catch (IllegalArgumentException unused) {
                }
            } else if (path.isConvex()) {
                jr.a(outline, path);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.d.h;
        if (rect2 != null) {
            rect.set(rect2);
            return true;
        }
        return super.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.o;
        region.set(bounds);
        RectF g = g();
        Path path = this.k;
        a(g, path);
        Region region2 = this.p;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final float h() {
        float[] fArr = this.D;
        if (fArr != null) {
            return (((fArr[3] + fArr[2]) - fArr[1]) - fArr[0]) / 2.0f;
        }
        RectF g = g();
        on0 on0Var = this.d.a;
        qn0 qn0Var = this.u;
        qn0Var.getClass();
        float a = on0Var.e.a(g);
        on0 on0Var2 = this.d.a;
        qn0Var.getClass();
        float a2 = on0Var2.h.a(g) + a;
        on0 on0Var3 = this.d.a;
        qn0Var.getClass();
        float a3 = a2 - on0Var3.g.a(g);
        on0 on0Var4 = this.d.a;
        qn0Var.getClass();
        return (a3 - on0Var4.f.a(g)) / 2.0f;
    }

    public final float i() {
        if (j()) {
            return this.r.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.h = true;
        this.i = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (!super.isStateful()) {
            ColorStateList colorStateList = this.d.f;
            if (colorStateList == null || !colorStateList.isStateful()) {
                this.d.getClass();
                ColorStateList colorStateList2 = this.d.e;
                if (colorStateList2 == null || !colorStateList2.isStateful()) {
                    ColorStateList colorStateList3 = this.d.d;
                    if (colorStateList3 == null || !colorStateList3.isStateful()) {
                        rp0 rp0Var = this.d.b;
                        if (rp0Var == null || !rp0Var.d()) {
                            return false;
                        }
                        return true;
                    }
                    return true;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public final boolean j() {
        Paint.Style style = this.d.q;
        if ((style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.r.getStrokeWidth() > 0.0f) {
            return true;
        }
        return false;
    }

    public final void k(Context context) {
        this.d.c = new us(context);
        s();
    }

    public final void l(zo0 zo0Var) {
        if (this.B != zo0Var) {
            this.B = zo0Var;
            int i = 0;
            while (true) {
                yo0[] yo0VarArr = this.C;
                if (i < yo0VarArr.length) {
                    if (yo0VarArr[i] == null) {
                        yo0VarArr[i] = new yo0(this, H[i]);
                    }
                    yo0 yo0Var = yo0VarArr[i];
                    zo0 zo0Var2 = new zo0();
                    zo0Var2.a((float) zo0Var.b);
                    double d = zo0Var.a;
                    zo0Var2.b((float) (d * d));
                    yo0Var.k = zo0Var2;
                    i++;
                } else {
                    q(getState(), true);
                    invalidateSelf();
                    return;
                }
            }
        }
    }

    public final void m(float f) {
        k90 k90Var = this.d;
        if (k90Var.n != f) {
            k90Var.n = f;
            s();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.d = new k90(this.d);
        return this;
    }

    public final void n(ColorStateList colorStateList) {
        k90 k90Var = this.d;
        if (k90Var.d != colorStateList) {
            k90Var.d = colorStateList;
            onStateChange(getState());
        }
    }

    public final void o(rp0 rp0Var) {
        k90 k90Var = this.d;
        if (k90Var.b != rp0Var) {
            k90Var.b = rp0Var;
            q(getState(), true);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.h = true;
        this.i = true;
        super.onBoundsChange(rect);
        if (this.d.b != null && !rect.isEmpty()) {
            q(getState(), this.z);
        }
        this.z = rect.isEmpty();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z = false;
        if (this.d.b != null) {
            q(iArr, false);
        }
        boolean p = p(iArr);
        boolean r = r();
        if (p || r) {
            z = true;
        }
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    public final boolean p(int[] iArr) {
        boolean z;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.d.d != null && color2 != (colorForState2 = this.d.d.getColorForState(iArr, (color2 = (paint2 = this.q).getColor())))) {
            paint2.setColor(colorForState2);
            z = true;
        } else {
            z = false;
        }
        if (this.d.e != null && color != (colorForState = this.d.e.getColorForState(iArr, (color = (paint = this.r).getColor())))) {
            paint.setColor(colorForState);
            return true;
        }
        return z;
    }

    public final void q(int[] iArr, boolean z) {
        boolean z2;
        on0 a;
        al alVar;
        int i;
        RectF g = g();
        if (this.d.b != null && !g.isEmpty()) {
            if (this.B == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z3 = z | z2;
            if (this.D == null) {
                this.D = new float[4];
            }
            rp0 rp0Var = this.d.b;
            on0[] on0VarArr = rp0Var.d;
            int i2 = rp0Var.a;
            int[][] iArr2 = rp0Var.c;
            pp0 pp0Var = rp0Var.h;
            pp0 pp0Var2 = rp0Var.g;
            pp0 pp0Var3 = rp0Var.f;
            pp0 pp0Var4 = rp0Var.e;
            int i3 = 0;
            while (true) {
                if (i3 < i2) {
                    if (StateSet.stateSetMatches(iArr2[i3], iArr)) {
                        break;
                    } else {
                        i3++;
                    }
                } else {
                    i3 = -1;
                    break;
                }
            }
            if (i3 < 0) {
                int[] iArr3 = StateSet.WILD_CARD;
                int i4 = 0;
                while (true) {
                    if (i4 < i2) {
                        if (StateSet.stateSetMatches(iArr2[i4], iArr3)) {
                            i = i4;
                            break;
                        }
                        i4++;
                    } else {
                        i = -1;
                        break;
                    }
                }
                i3 = i;
            }
            if (pp0Var4 == null && pp0Var3 == null && pp0Var2 == null && pp0Var == null) {
                a = on0VarArr[i3];
            } else {
                nn0 f = on0VarArr[i3].f();
                if (pp0Var4 != null) {
                    f.e = pp0Var4.c(iArr);
                }
                if (pp0Var3 != null) {
                    f.f = pp0Var3.c(iArr);
                }
                if (pp0Var2 != null) {
                    f.h = pp0Var2.c(iArr);
                }
                if (pp0Var != null) {
                    f.g = pp0Var.c(iArr);
                }
                a = f.a();
            }
            for (int i5 = 0; i5 < 4; i5++) {
                this.u.getClass();
                if (i5 != 1) {
                    if (i5 != 2) {
                        if (i5 != 3) {
                            alVar = a.f;
                        } else {
                            alVar = a.e;
                        }
                    } else {
                        alVar = a.h;
                    }
                } else {
                    alVar = a.g;
                }
                float a2 = alVar.a(g);
                if (z3) {
                    this.D[i5] = a2;
                }
                yo0[] yo0VarArr = this.C;
                yo0 yo0Var = yo0VarArr[i5];
                if (yo0Var != null) {
                    yo0Var.a(a2);
                    if (z3) {
                        yo0VarArr[i5].d();
                    }
                }
            }
            if (z3) {
                invalidateSelf();
            }
        }
    }

    public final boolean r() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.v;
        PorterDuffColorFilter porterDuffColorFilter3 = this.w;
        k90 k90Var = this.d;
        ColorStateList colorStateList = k90Var.f;
        PorterDuff.Mode mode = k90Var.g;
        if (colorStateList != null && mode != null) {
            porterDuffColorFilter = new PorterDuffColorFilter(c(colorStateList.getColorForState(getState(), 0)), mode);
        } else {
            int color = this.q.getColor();
            int c = c(color);
            if (c != color) {
                porterDuffColorFilter = new PorterDuffColorFilter(c, PorterDuff.Mode.SRC_IN);
            } else {
                porterDuffColorFilter = null;
            }
        }
        this.v = porterDuffColorFilter;
        this.d.getClass();
        this.w = null;
        this.d.getClass();
        if (Objects.equals(porterDuffColorFilter2, this.v) && Objects.equals(porterDuffColorFilter3, this.w)) {
            return false;
        }
        return true;
    }

    public final void s() {
        k90 k90Var = this.d;
        float f = k90Var.n + 0.0f;
        k90Var.o = (int) Math.ceil(0.75f * f);
        this.d.p = (int) Math.ceil(f * 0.25f);
        r();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        k90 k90Var = this.d;
        if (k90Var.l != i) {
            k90Var.l = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.d.getClass();
        super.invalidateSelf();
    }

    @Override // defpackage.zn0
    public final void setShapeAppearanceModel(on0 on0Var) {
        k90 k90Var = this.d;
        k90Var.a = on0Var;
        k90Var.b = null;
        this.D = null;
        this.E = null;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.d.f = colorStateList;
        r();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        k90 k90Var = this.d;
        if (k90Var.g != mode) {
            k90Var.g = mode;
            r();
            super.invalidateSelf();
        }
    }

    public m90(Context context, AttributeSet attributeSet, int i, int i2) {
        this(on0.b(context, attributeSet, i, i2).a());
    }

    public m90(on0 on0Var) {
        this(new k90(on0Var));
    }

    public m90() {
        this(new on0());
    }
}
