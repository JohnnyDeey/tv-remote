package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import android.util.Pair;
import java.util.ArrayList;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class ch extends qr {
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public int l;
    public float m;
    public boolean n;
    public float o;
    public final RectF p;
    public final Pair q;

    public ch(hh hhVar) {
        super(hhVar);
        this.p = new RectF();
        this.q = new Pair(new pr(), new pr());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.qr
    public final void a() {
        int i;
        int i2;
        Path path = this.b;
        path.rewind();
        path.moveTo(1.0f, 0.0f);
        int i3 = 0;
        int i4 = 0;
        while (true) {
            i = 2;
            if (i4 >= 2) {
                break;
            }
            path.cubicTo(1.0f, 0.5522848f, 0.5522848f, 1.0f, 0.0f, 1.0f);
            path.cubicTo(-0.5522848f, 1.0f, -1.0f, 0.5522848f, -1.0f, 0.0f);
            path.cubicTo(-1.0f, -0.5522848f, -0.5522848f, -1.0f, 0.0f, -1.0f);
            path.cubicTo(0.5522848f, -1.0f, 1.0f, -0.5522848f, 1.0f, 0.0f);
            i4++;
        }
        Matrix matrix = this.e;
        matrix.reset();
        float f = this.i;
        matrix.setScale(f, f);
        path.transform(matrix);
        hh hhVar = this.a;
        boolean a = hhVar.a(this.n);
        PathMeasure pathMeasure = this.d;
        if (a) {
            pathMeasure.setPath(path, false);
            float f2 = this.k;
            path.rewind();
            float length = pathMeasure.getLength();
            if (this.n) {
                i2 = hhVar.j;
            } else {
                i2 = hhVar.k;
            }
            float f3 = 2.0f;
            int max = Math.max(3, (int) ((length / i2) / 2.0f)) * 2;
            this.j = length / max;
            ArrayList arrayList = new ArrayList();
            for (int i5 = 0; i5 < max; i5++) {
                pr prVar = new pr();
                float f4 = i5;
                pathMeasure.getPosTan(this.j * f4, prVar.a, prVar.b);
                pr prVar2 = new pr();
                float f5 = this.j;
                pathMeasure.getPosTan((f5 / 2.0f) + (f4 * f5), prVar2.a, prVar2.b);
                arrayList.add(prVar);
                prVar2.a(f2 * 2.0f);
                arrayList.add(prVar2);
            }
            arrayList.add((pr) arrayList.get(0));
            pr prVar3 = (pr) arrayList.get(0);
            float[] fArr = prVar3.a;
            char c = 1;
            path.moveTo(fArr[0], fArr[1]);
            int i6 = 1;
            while (i6 < arrayList.size()) {
                pr prVar4 = (pr) arrayList.get(i6);
                float f6 = (this.j / f3) * 0.48f;
                float[] fArr2 = prVar3.a;
                float[] fArr3 = new float[i];
                System.arraycopy(fArr2, i3, fArr3, i3, i);
                System.arraycopy(prVar3.b, i3, new float[i], i3, i);
                new Matrix();
                float[] fArr4 = prVar4.a;
                float[] fArr5 = new float[i];
                System.arraycopy(fArr4, i3, fArr5, i3, i);
                System.arraycopy(prVar4.b, i3, new float[i], i3, i);
                new Matrix();
                char c2 = c;
                float atan2 = (float) Math.atan2(r6[c], r6[i3]);
                double d = fArr3[i3];
                double d2 = f6;
                int i7 = i3;
                double d3 = atan2;
                fArr3[i7] = (float) ((Math.cos(d3) * d2) + d);
                fArr3[c2] = (float) ((Math.sin(d3) * d2) + fArr3[c2]);
                float f7 = -f6;
                double d4 = f7;
                double atan22 = (float) Math.atan2(r11[c2], r11[i7]);
                fArr5[i7] = (float) ((Math.cos(atan22) * d4) + fArr5[i7]);
                float sin = (float) ((Math.sin(atan22) * d4) + fArr5[c2]);
                fArr5[c2] = sin;
                float f8 = fArr3[i7];
                float f9 = fArr3[c2];
                float f10 = fArr5[i7];
                float[] fArr6 = prVar4.a;
                path.cubicTo(f8, f9, f10, sin, fArr6[i7], fArr6[c2]);
                i6++;
                prVar3 = prVar4;
                c = c2;
                i3 = i7;
                pathMeasure = pathMeasure;
                i = 2;
                f3 = 2.0f;
            }
        }
        pathMeasure.setPath(path, i3);
    }

    public final void c(Canvas canvas, Paint paint, float f, float f2, int i, int i2, int i3, float f3, float f4, boolean z) {
        float f5;
        float f6;
        Canvas canvas2;
        float f7 = f2 >= f ? f2 - f : (f2 + 1.0f) - f;
        float f8 = f % 1.0f;
        if (f8 < 0.0f) {
            f8 += 1.0f;
        }
        if (this.o < 1.0f) {
            float f9 = f8 + f7;
            if (f9 > 1.0f) {
                c(canvas, paint, f8, 1.0f, i, i2, 0, f3, f4, z);
                c(canvas, paint, 1.0f, f9, i, 0, i3, f3, f4, z);
                return;
            }
        }
        float degrees = (float) Math.toDegrees(this.g / this.i);
        float f10 = f7 - 0.99f;
        if (f10 >= 0.0f) {
            float f11 = ((f10 * degrees) / 180.0f) / 0.01f;
            f7 += f11;
            if (!z) {
                f8 -= f11 / 2.0f;
            }
        }
        float E = r21.E(1.0f - this.o, 1.0f, f8);
        float E2 = r21.E(0.0f, this.o, f7);
        float degrees2 = (float) Math.toDegrees(i2 / this.i);
        float degrees3 = ((E2 * 360.0f) - degrees2) - ((float) Math.toDegrees(i3 / this.i));
        float f12 = (E * 360.0f) + degrees2;
        if (degrees3 <= 0.0f) {
            return;
        }
        hh hhVar = this.a;
        boolean z2 = hhVar.a(this.n) && z && f3 > 0.0f;
        paint.setAntiAlias(true);
        paint.setColor(i);
        paint.setStrokeWidth(this.f);
        float f13 = this.g * 2.0f;
        float f14 = degrees * 2.0f;
        PathMeasure pathMeasure = this.d;
        if (degrees3 < f14) {
            float f15 = degrees3 / f14;
            float f16 = (degrees * f15) + f12;
            pr prVar = new pr();
            if (!z2) {
                prVar.c(f16 + 90.0f);
                prVar.a(-this.i);
            } else {
                float length = (pathMeasure.getLength() * (f16 / 360.0f)) / 2.0f;
                float f17 = this.h * f3;
                float f18 = this.i;
                if (f18 != this.m || f17 != this.k) {
                    this.k = f17;
                    this.m = f18;
                    a();
                }
                pathMeasure.getPosTan(length, prVar.a, prVar.b);
            }
            paint.setStyle(Paint.Style.FILL);
            d(canvas, paint, prVar, f13, this.f, f15);
            return;
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap((hhVar.d && hhVar.c == 0.5f) ? Paint.Cap.ROUND : Paint.Cap.BUTT);
        float f19 = f12 + degrees;
        float f20 = degrees3 - f14;
        Pair pair = this.q;
        ((pr) pair.first).b();
        ((pr) pair.second).b();
        if (!z2) {
            ((pr) pair.first).c(f19 + 90.0f);
            ((pr) pair.first).a(-this.i);
            ((pr) pair.second).c(f19 + f20 + 90.0f);
            ((pr) pair.second).a(-this.i);
            float f21 = this.i;
            float f22 = -f21;
            RectF rectF = this.p;
            rectF.set(f22, f22, f21, f21);
            canvas.drawArc(rectF, f19, f20, false, paint);
            canvas2 = canvas;
        } else {
            float f23 = f19 / 360.0f;
            float f24 = f20 / 360.0f;
            float f25 = this.h * f3;
            int i4 = this.n ? hhVar.j : hhVar.k;
            float f26 = this.i;
            if (f26 != this.m || f25 != this.k || i4 != this.l) {
                this.k = f25;
                this.l = i4;
                this.m = f26;
                a();
            }
            Path path = this.c;
            path.rewind();
            float l = mn.l(f24, 0.0f, 1.0f);
            if (hhVar.a(this.n)) {
                f5 = 1.0f;
                float f27 = f4 / ((float) ((this.i * 6.283185307179586d) / this.j));
                f23 += f27;
                f6 = 0.0f - (f27 * 360.0f);
            } else {
                f5 = 1.0f;
                f6 = 0.0f;
            }
            float f28 = f23 % f5;
            float length2 = (pathMeasure.getLength() * f28) / 2.0f;
            float length3 = (pathMeasure.getLength() * (f28 + l)) / 2.0f;
            pathMeasure.getSegment(length2, length3, path, true);
            pr prVar2 = (pr) pair.first;
            prVar2.b();
            pathMeasure.getPosTan(length2, prVar2.a, prVar2.b);
            pr prVar3 = (pr) pair.second;
            prVar3.b();
            pathMeasure.getPosTan(length3, prVar3.a, prVar3.b);
            Matrix matrix = this.e;
            matrix.reset();
            matrix.setRotate(f6);
            prVar2.c(f6);
            prVar3.c(f6);
            path.transform(matrix);
            canvas2 = canvas;
            canvas2.drawPath(path, paint);
        }
        if (!(hhVar.d && hhVar.c == 0.5f) && this.g > 0.0f) {
            paint.setStyle(Paint.Style.FILL);
            d(canvas2, paint, (pr) pair.first, f13, this.f, 1.0f);
            d(canvas, paint, (pr) pair.second, f13, this.f, 1.0f);
        }
    }

    public final void d(Canvas canvas, Paint paint, pr prVar, float f, float f2, float f3) {
        float min = Math.min(f2, this.f);
        float f4 = f / 2.0f;
        float min2 = Math.min(f4, (this.g * min) / this.f);
        RectF rectF = new RectF((-f) / 2.0f, (-min) / 2.0f, f4, min / 2.0f);
        canvas.save();
        float[] fArr = prVar.a;
        canvas.translate(fArr[0], fArr[1]);
        float[] fArr2 = prVar.b;
        canvas.rotate((float) Math.toDegrees(Math.atan2(fArr2[1], fArr2[0])));
        canvas.scale(f3, f3);
        canvas.drawRoundRect(rectF, min2, min2, paint);
        canvas.restore();
    }

    public final void e(Canvas canvas, Paint paint, or orVar, int i) {
        int g = f20.g(orVar.c, i);
        canvas.save();
        canvas.rotate(orVar.f);
        this.n = orVar.g;
        c(canvas, paint, orVar.a, orVar.b, g, 0, 0, orVar.d, orVar.e, true);
        canvas.restore();
    }

    public final void f(Canvas canvas, Paint paint, float f, float f2, int i, int i2, int i3) {
        int g = f20.g(i, i2);
        this.n = false;
        c(canvas, paint, f, f2, g, i3, i3, 0.0f, 0.0f, false);
    }

    public final int g() {
        hh hhVar = this.a;
        return (hhVar.q * 2) + hhVar.p;
    }
}
