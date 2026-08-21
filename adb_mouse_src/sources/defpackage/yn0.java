package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class yn0 {
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public final ArrayList f = new ArrayList();
    public final ArrayList g = new ArrayList();

    public yn0() {
        d(0.0f, 270.0f, 0.0f);
    }

    public final void a(float f) {
        float f2 = this.d;
        if (f2 != f) {
            float f3 = ((f - f2) + 360.0f) % 360.0f;
            if (f3 > 180.0f) {
                return;
            }
            float f4 = this.b;
            float f5 = this.c;
            un0 un0Var = new un0(f4, f5, f4, f5);
            un0Var.f = this.d;
            un0Var.g = f3;
            this.g.add(new sn0(un0Var));
            this.d = f;
        }
    }

    public final void b(Matrix matrix, Path path) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((wn0) arrayList.get(i)).a(matrix, path);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [wn0, vn0, java.lang.Object] */
    public final void c(float f, float f2) {
        ?? wn0Var = new wn0();
        wn0Var.b = f;
        wn0Var.c = f2;
        this.f.add(wn0Var);
        tn0 tn0Var = new tn0(wn0Var, this.b, this.c);
        float b = tn0Var.b() + 270.0f;
        float b2 = tn0Var.b() + 270.0f;
        a(b);
        this.g.add(tn0Var);
        this.d = b2;
        this.b = f;
        this.c = f2;
    }

    public final void d(float f, float f2, float f3) {
        this.a = f;
        this.b = 0.0f;
        this.c = f;
        this.d = f2;
        this.e = (f2 + f3) % 360.0f;
        this.f.clear();
        this.g.clear();
    }
}
