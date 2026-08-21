package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import java.util.ArrayList;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class sx0 {
    public static final Matrix p = new Matrix();
    public final Path a;
    public final Path b;
    public final Matrix c;
    public Paint d;
    public Paint e;
    public PathMeasure f;
    public final px0 g;
    public float h;
    public float i;
    public float j;
    public float k;
    public int l;
    public String m;
    public Boolean n;
    public final n8 o;

    /* JADX WARN: Type inference failed for: r0v4, types: [n8, io0] */
    public sx0(sx0 sx0Var) {
        this.c = new Matrix();
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = 0.0f;
        this.k = 0.0f;
        this.l = 255;
        this.m = null;
        this.n = null;
        ?? io0Var = new io0(0);
        this.o = io0Var;
        this.g = new px0(sx0Var.g, io0Var);
        this.a = new Path(sx0Var.a);
        this.b = new Path(sx0Var.b);
        this.h = sx0Var.h;
        this.i = sx0Var.i;
        this.j = sx0Var.j;
        this.k = sx0Var.k;
        this.l = sx0Var.l;
        this.m = sx0Var.m;
        String str = sx0Var.m;
        if (str != null) {
            io0Var.put(str, this);
        }
        this.n = sx0Var.n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(px0 px0Var, Matrix matrix, Canvas canvas, int i, int i2) {
        int i3;
        float f;
        float f2;
        int i4;
        float f3;
        Path.FillType fillType;
        Path.FillType fillType2;
        Matrix matrix2 = px0Var.a;
        ArrayList arrayList = px0Var.b;
        matrix2.set(matrix);
        Matrix matrix3 = px0Var.a;
        matrix3.preConcat(px0Var.j);
        canvas.save();
        char c = 0;
        int i5 = 0;
        while (i5 < arrayList.size()) {
            qx0 qx0Var = (qx0) arrayList.get(i5);
            if (qx0Var instanceof px0) {
                a((px0) qx0Var, matrix3, canvas, i, i2);
            } else if (qx0Var instanceof rx0) {
                rx0 rx0Var = (rx0) qx0Var;
                float f4 = i / this.j;
                float f5 = i2 / this.k;
                float min = Math.min(f4, f5);
                Matrix matrix4 = this.c;
                matrix4.set(matrix3);
                matrix4.postScale(f4, f5);
                float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                matrix3.mapVectors(fArr);
                float hypot = (float) Math.hypot(fArr[c], fArr[1]);
                boolean z = c;
                i3 = i5;
                float hypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                float f6 = (fArr[z ? 1 : 0] * fArr[3]) - (fArr[1] * fArr[2]);
                float max = Math.max(hypot, hypot2);
                if (max > 0.0f) {
                    f = Math.abs(f6) / max;
                } else {
                    f = 0.0f;
                }
                if (f != 0.0f) {
                    Path path = this.a;
                    path.reset();
                    vd0[] vd0VarArr = rx0Var.a;
                    if (vd0VarArr != null) {
                        vd0.b(vd0VarArr, path);
                    }
                    Path path2 = this.b;
                    path2.reset();
                    if (rx0Var instanceof nx0) {
                        if (rx0Var.c == 0) {
                            fillType2 = Path.FillType.WINDING;
                        } else {
                            fillType2 = Path.FillType.EVEN_ODD;
                        }
                        path2.setFillType(fillType2);
                        path2.addPath(path, matrix4);
                        canvas.clipPath(path2);
                    } else {
                        ox0 ox0Var = (ox0) rx0Var;
                        float f7 = ox0Var.i;
                        if (f7 != 0.0f || ox0Var.j != 1.0f) {
                            float f8 = ox0Var.k;
                            float f9 = (f7 + f8) % 1.0f;
                            float f10 = (ox0Var.j + f8) % 1.0f;
                            if (this.f == null) {
                                this.f = new PathMeasure();
                            }
                            this.f.setPath(path, z);
                            float length = this.f.getLength();
                            float f11 = f9 * length;
                            float f12 = f10 * length;
                            path.reset();
                            PathMeasure pathMeasure = this.f;
                            if (f11 > f12) {
                                pathMeasure.getSegment(f11, length, path, true);
                                f2 = 0.0f;
                                this.f.getSegment(0.0f, f12, path, true);
                            } else {
                                f2 = 0.0f;
                                pathMeasure.getSegment(f11, f12, path, true);
                            }
                            path.rLineTo(f2, f2);
                        }
                        path2.addPath(path, matrix4);
                        c0 c0Var = ox0Var.f;
                        if (((Shader) c0Var.e) != null || c0Var.d != 0) {
                            if (this.e == null) {
                                i4 = 16777215;
                                Paint paint = new Paint(1);
                                this.e = paint;
                                paint.setStyle(Paint.Style.FILL);
                            } else {
                                i4 = 16777215;
                            }
                            Paint paint2 = this.e;
                            Shader shader = (Shader) c0Var.e;
                            if (shader != null) {
                                shader.setLocalMatrix(matrix4);
                                paint2.setShader(shader);
                                paint2.setAlpha(Math.round(ox0Var.h * 255.0f));
                                f3 = 255.0f;
                            } else {
                                paint2.setShader(null);
                                paint2.setAlpha(255);
                                int i6 = c0Var.d;
                                float f13 = ox0Var.h;
                                PorterDuff.Mode mode = vx0.l;
                                f3 = 255.0f;
                                paint2.setColor((i6 & i4) | (((int) (Color.alpha(i6) * f13)) << 24));
                            }
                            paint2.setColorFilter(null);
                            if (ox0Var.c == 0) {
                                fillType = Path.FillType.WINDING;
                            } else {
                                fillType = Path.FillType.EVEN_ODD;
                            }
                            path2.setFillType(fillType);
                            canvas.drawPath(path2, paint2);
                        } else {
                            f3 = 255.0f;
                            i4 = 16777215;
                        }
                        c0 c0Var2 = ox0Var.d;
                        if (((Shader) c0Var2.e) != null || c0Var2.d != 0) {
                            if (this.d == null) {
                                Paint paint3 = new Paint(1);
                                this.d = paint3;
                                paint3.setStyle(Paint.Style.STROKE);
                            }
                            Paint paint4 = this.d;
                            Paint.Join join = ox0Var.m;
                            if (join != null) {
                                paint4.setStrokeJoin(join);
                            }
                            Paint.Cap cap = ox0Var.l;
                            if (cap != null) {
                                paint4.setStrokeCap(cap);
                            }
                            paint4.setStrokeMiter(ox0Var.n);
                            Shader shader2 = (Shader) c0Var2.e;
                            if (shader2 != null) {
                                shader2.setLocalMatrix(matrix4);
                                paint4.setShader(shader2);
                                paint4.setAlpha(Math.round(ox0Var.g * f3));
                            } else {
                                paint4.setShader(null);
                                paint4.setAlpha(255);
                                int i7 = c0Var2.d;
                                float f14 = ox0Var.g;
                                PorterDuff.Mode mode2 = vx0.l;
                                paint4.setColor((i7 & i4) | (((int) (Color.alpha(i7) * f14)) << 24));
                            }
                            paint4.setColorFilter(null);
                            paint4.setStrokeWidth(ox0Var.e * min * f);
                            canvas.drawPath(path2, paint4);
                        }
                    }
                }
                i5 = i3 + 1;
                c = 0;
            }
            i3 = i5;
            i5 = i3 + 1;
            c = 0;
        }
        canvas.restore();
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.l;
    }

    public void setAlpha(float f) {
        setRootAlpha((int) (f * 255.0f));
    }

    public void setRootAlpha(int i) {
        this.l = i;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [n8, io0] */
    public sx0() {
        this.c = new Matrix();
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = 0.0f;
        this.k = 0.0f;
        this.l = 255;
        this.m = null;
        this.n = null;
        this.o = new io0(0);
        this.g = new px0();
        this.a = new Path();
        this.b = new Path();
    }
}
