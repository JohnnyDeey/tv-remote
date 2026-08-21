package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.os.Build;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public abstract class qr {
    public final hh a;
    public final Path b;
    public final Path c;
    public final PathMeasure d;
    public final Matrix e;

    public qr(hh hhVar) {
        Path path = new Path();
        this.b = path;
        this.c = new Path();
        this.d = new PathMeasure(path, false);
        this.a = hhVar;
        this.e = new Matrix();
    }

    public abstract void a();

    public final void b(Canvas canvas, Rect rect, float f, boolean z, boolean z2) {
        int i;
        this.a.b();
        ch chVar = (ch) this;
        float width = rect.width() / chVar.g();
        float height = rect.height() / chVar.g();
        hh hhVar = chVar.a;
        float f2 = (hhVar.p / 2.0f) + hhVar.q;
        canvas.translate((f2 * width) + rect.left, (f2 * height) + rect.top);
        canvas.rotate(-90.0f);
        canvas.scale(width, height);
        if (hhVar.r != 0) {
            canvas.scale(1.0f, -1.0f);
            if (Build.VERSION.SDK_INT == 29) {
                canvas.rotate(0.1f);
            }
        }
        float f3 = -f2;
        canvas.clipRect(f3, f3, f2, f2);
        int i2 = hhVar.a;
        float f4 = i2;
        chVar.f = f4 * f;
        int i3 = i2 / 2;
        if (hhVar.d) {
            i = (int) (f4 * hhVar.c);
        } else {
            i = hhVar.b;
        }
        chVar.g = Math.min(i3, i) * f;
        chVar.h = hhVar.l * f;
        int i4 = hhVar.p;
        int i5 = hhVar.a;
        float f5 = (i4 - i5) / 2.0f;
        chVar.i = f5;
        if (z || z2) {
            float f6 = ((1.0f - f) * i5) / 2.0f;
            if ((z && hhVar.g == 2) || (z2 && hhVar.h == 1)) {
                chVar.i = f5 + f6;
            } else if ((z && hhVar.g == 1) || (z2 && hhVar.h == 2)) {
                chVar.i = f5 - f6;
            }
        }
        if (z2 && hhVar.h == 3) {
            chVar.o = f;
        } else {
            chVar.o = 1.0f;
        }
    }
}
