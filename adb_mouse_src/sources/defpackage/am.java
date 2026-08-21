package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class am extends m90 {
    public static final /* synthetic */ int J = 0;
    public zl I;

    @Override // defpackage.m90
    public final void f(Canvas canvas) {
        if (this.I.r.isEmpty()) {
            super.f(canvas);
            return;
        }
        canvas.save();
        int i = Build.VERSION.SDK_INT;
        zl zlVar = this.I;
        if (i >= 26) {
            canvas.clipOutRect(zlVar.r);
        } else {
            canvas.clipRect(zlVar.r, Region.Op.DIFFERENCE);
        }
        super.f(canvas);
        canvas.restore();
    }

    @Override // defpackage.m90, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.I = new zl(this.I);
        return this;
    }

    public final void t(float f, float f2, float f3, float f4) {
        RectF rectF = this.I.r;
        if (f == rectF.left && f2 == rectF.top && f3 == rectF.right && f4 == rectF.bottom) {
            return;
        }
        rectF.set(f, f2, f3, f4);
        invalidateSelf();
    }
}
