package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class a4 implements al {
    public final al a;
    public final float b;

    public a4(float f, al alVar) {
        while (alVar instanceof a4) {
            alVar = ((a4) alVar).a;
            f += ((a4) alVar).b;
        }
        this.a = alVar;
        this.b = f;
    }

    @Override // defpackage.al
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.a.a(rectF) + this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a4)) {
            return false;
        }
        a4 a4Var = (a4) obj;
        if (this.a.equals(a4Var.a) && this.b == a4Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b)});
    }
}
