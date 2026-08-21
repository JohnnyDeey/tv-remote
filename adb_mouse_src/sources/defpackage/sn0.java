package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class sn0 extends xn0 {
    public final un0 c;

    public sn0(un0 un0Var) {
        this.c = un0Var;
    }

    @Override // defpackage.xn0
    public final void a(Matrix matrix, mn0 mn0Var, int i, Canvas canvas) {
        boolean z;
        un0 un0Var = this.c;
        float f = un0Var.f;
        float f2 = un0Var.g;
        RectF rectF = new RectF(un0Var.b, un0Var.c, un0Var.d, un0Var.e);
        Paint paint = mn0Var.b;
        if (f2 < 0.0f) {
            z = true;
        } else {
            z = false;
        }
        Path path = mn0Var.g;
        int[] iArr = mn0.k;
        if (z) {
            iArr[0] = 0;
            iArr[1] = mn0Var.f;
            iArr[2] = mn0Var.e;
            iArr[3] = mn0Var.d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f, f2);
            path.close();
            float f3 = -i;
            rectF.inset(f3, f3);
            iArr[0] = 0;
            iArr[1] = mn0Var.d;
            iArr[2] = mn0Var.e;
            iArr[3] = mn0Var.f;
        }
        float width = rectF.width() / 2.0f;
        if (width <= 0.0f) {
            return;
        }
        float f4 = 1.0f - (i / width);
        float[] fArr = mn0.l;
        fArr[1] = f4;
        fArr[2] = ((1.0f - f4) / 2.0f) + f4;
        paint.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), width, iArr, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, mn0Var.h);
        }
        canvas.drawArc(rectF, f, f2, true, paint);
        canvas.restore();
    }
}
