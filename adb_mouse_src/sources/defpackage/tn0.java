package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class tn0 extends xn0 {
    public final vn0 c;
    public final float d;
    public final float e;

    public tn0(vn0 vn0Var, float f, float f2) {
        this.c = vn0Var;
        this.d = f;
        this.e = f2;
    }

    @Override // defpackage.xn0
    public final void a(Matrix matrix, mn0 mn0Var, int i, Canvas canvas) {
        vn0 vn0Var = this.c;
        float f = vn0Var.c;
        float f2 = this.e;
        float f3 = vn0Var.b;
        float f4 = this.d;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f - f2, f3 - f4), 0.0f);
        Matrix matrix2 = this.a;
        matrix2.set(matrix);
        matrix2.preTranslate(f4, f2);
        matrix2.preRotate(b());
        mn0Var.getClass();
        rectF.bottom += i;
        rectF.offset(0.0f, -i);
        int i2 = mn0Var.f;
        int[] iArr = mn0.i;
        iArr[0] = i2;
        iArr[1] = mn0Var.e;
        iArr[2] = mn0Var.d;
        Paint paint = mn0Var.c;
        float f5 = rectF.left;
        paint.setShader(new LinearGradient(f5, rectF.top, f5, rectF.bottom, iArr, mn0.j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    public final float b() {
        vn0 vn0Var = this.c;
        return (float) Math.toDegrees(Math.atan((vn0Var.c - this.e) / (vn0Var.b - this.d)));
    }
}
