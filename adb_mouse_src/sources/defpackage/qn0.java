package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.BitSet;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class qn0 {
    public final yn0[] a = new yn0[4];
    public final Matrix[] b = new Matrix[4];
    public final Matrix[] c = new Matrix[4];
    public final PointF d = new PointF();
    public final Path e = new Path();
    public final Path f = new Path();
    public final yn0 g = new yn0();
    public final float[] h = new float[2];
    public final float[] i = new float[2];
    public final Path j = new Path();
    public final Path k = new Path();
    public final boolean l = true;

    public qn0() {
        for (int i = 0; i < 4; i++) {
            this.a[i] = new yn0();
            this.b[i] = new Matrix();
            this.c[i] = new Matrix();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v5 */
    public final void a(on0 on0Var, float[] fArr, float f, RectF rectF, j90 j90Var, Path path) {
        Matrix[] matrixArr;
        float[] fArr2;
        int i;
        yn0[] yn0VarArr;
        Matrix[] matrixArr2;
        boolean z;
        float f2;
        os osVar;
        boolean z2;
        al ihVar;
        f20 f20Var;
        int i2;
        path.rewind();
        Path path2 = this.e;
        path2.rewind();
        Path path3 = this.f;
        path3.rewind();
        path3.addRect(rectF, Path.Direction.CW);
        int i3 = 0;
        while (true) {
            matrixArr = this.c;
            fArr2 = this.h;
            yn0VarArr = this.a;
            matrixArr2 = this.b;
            z = 0;
            if (i3 >= 4) {
                break;
            }
            if (fArr == null) {
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            ihVar = on0Var.f;
                        } else {
                            ihVar = on0Var.e;
                        }
                    } else {
                        ihVar = on0Var.h;
                    }
                } else {
                    ihVar = on0Var.g;
                }
            } else {
                ihVar = new ih(fArr[i3]);
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        f20Var = on0Var.b;
                    } else {
                        f20Var = on0Var.a;
                    }
                } else {
                    f20Var = on0Var.d;
                }
            } else {
                f20Var = on0Var.c;
            }
            yn0 yn0Var = yn0VarArr[i3];
            f20Var.getClass();
            f20Var.z(yn0Var, f, ihVar.a(rectF));
            int i4 = i3 + 1;
            float f3 = (i4 % 4) * 90;
            matrixArr2[i3].reset();
            PointF pointF = this.d;
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        i2 = i3;
                        pointF.set(rectF.right, rectF.top);
                    } else {
                        i2 = i3;
                        pointF.set(rectF.left, rectF.top);
                    }
                } else {
                    i2 = i3;
                    pointF.set(rectF.left, rectF.bottom);
                }
            } else {
                i2 = i3;
                pointF.set(rectF.right, rectF.bottom);
            }
            matrixArr2[i2].setTranslate(pointF.x, pointF.y);
            matrixArr2[i2].preRotate(f3);
            yn0 yn0Var2 = yn0VarArr[i2];
            fArr2[0] = yn0Var2.b;
            fArr2[1] = yn0Var2.c;
            matrixArr2[i2].mapPoints(fArr2);
            matrixArr[i2].reset();
            matrixArr[i2].setTranslate(fArr2[0], fArr2[1]);
            matrixArr[i2].preRotate(f3);
            i3 = i4;
        }
        int i5 = 0;
        for (i = 4; i5 < i; i = 4) {
            yn0 yn0Var3 = yn0VarArr[i5];
            yn0Var3.getClass();
            fArr2[z] = 0.0f;
            fArr2[1] = yn0Var3.a;
            matrixArr2[i5].mapPoints(fArr2);
            if (i5 == 0) {
                path.moveTo(fArr2[z], fArr2[1]);
            } else {
                path.lineTo(fArr2[z], fArr2[1]);
            }
            yn0VarArr[i5].b(matrixArr2[i5], path);
            if (j90Var != null) {
                yn0 yn0Var4 = yn0VarArr[i5];
                Matrix matrix = matrixArr2[i5];
                m90 m90Var = j90Var.a;
                f2 = 0.0f;
                BitSet bitSet = m90Var.g;
                yn0Var4.getClass();
                bitSet.set(i5, z);
                xn0[] xn0VarArr = m90Var.e;
                yn0Var4.a(yn0Var4.e);
                xn0VarArr[i5] = new rn0(new ArrayList(yn0Var4.g), new Matrix(matrix));
            } else {
                f2 = 0.0f;
            }
            int i6 = i5 + 1;
            int i7 = i6 % 4;
            yn0 yn0Var5 = yn0VarArr[i5];
            fArr2[0] = yn0Var5.b;
            fArr2[1] = yn0Var5.c;
            matrixArr2[i5].mapPoints(fArr2);
            yn0 yn0Var6 = yn0VarArr[i7];
            yn0Var6.getClass();
            float[] fArr3 = this.i;
            fArr3[0] = f2;
            fArr3[1] = yn0Var6.a;
            matrixArr2[i7].mapPoints(fArr3);
            Matrix[] matrixArr3 = matrixArr;
            yn0[] yn0VarArr2 = yn0VarArr;
            float max = Math.max(((float) Math.hypot(fArr2[0] - fArr3[0], fArr2[1] - fArr3[1])) - 0.001f, f2);
            yn0 yn0Var7 = yn0VarArr2[i5];
            fArr2[0] = yn0Var7.b;
            fArr2[1] = yn0Var7.c;
            matrixArr2[i5].mapPoints(fArr2);
            if (i5 != 1 && i5 != 3) {
                Math.abs(rectF.centerY() - fArr2[1]);
            } else {
                Math.abs(rectF.centerX() - fArr2[0]);
            }
            yn0 yn0Var8 = this.g;
            yn0Var8.d(0.0f, 270.0f, 0.0f);
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 != 3) {
                        osVar = on0Var.j;
                    } else {
                        osVar = on0Var.i;
                    }
                } else {
                    osVar = on0Var.l;
                }
            } else {
                osVar = on0Var.k;
            }
            osVar.getClass();
            yn0Var8.c(max, 0.0f);
            Path path4 = this.j;
            path4.reset();
            yn0Var8.b(matrixArr3[i5], path4);
            if (this.l && (b(path4, i5) || b(path4, i7))) {
                path4.op(path4, path3, Path.Op.DIFFERENCE);
                fArr2[0] = 0.0f;
                fArr2[1] = yn0Var8.a;
                matrixArr3[i5].mapPoints(fArr2);
                path2.moveTo(fArr2[0], fArr2[1]);
                yn0Var8.b(matrixArr3[i5], path2);
            } else {
                yn0Var8.b(matrixArr3[i5], path);
            }
            if (j90Var != null) {
                Matrix matrix2 = matrixArr3[i5];
                m90 m90Var2 = j90Var.a;
                z2 = false;
                m90Var2.g.set(i5 + 4, false);
                xn0[] xn0VarArr2 = m90Var2.f;
                yn0Var8.a(yn0Var8.e);
                xn0VarArr2[i5] = new rn0(new ArrayList(yn0Var8.g), new Matrix(matrix2));
            } else {
                z2 = false;
            }
            matrixArr = matrixArr3;
            i5 = i6;
            z = z2;
            yn0VarArr = yn0VarArr2;
        }
        path.close();
        path2.close();
        if (!path2.isEmpty()) {
            path.op(path2, Path.Op.UNION);
        }
    }

    public final boolean b(Path path, int i) {
        Path path2 = this.k;
        path2.reset();
        this.a[i].b(this.b[i], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (!rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f)) {
            return true;
        }
        return false;
    }
}
