package defpackage;

import android.graphics.Rect;
import android.view.View;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public abstract class ws {
    public int a;
    public final Object b;
    public final Object c;

    public ws(oh0 oh0Var) {
        this.a = Integer.MIN_VALUE;
        this.c = new Rect();
        this.b = oh0Var;
    }

    public static ws a(oh0 oh0Var, int i) {
        if (i != 0) {
            int i2 = 1;
            if (i == 1) {
                return new md0(oh0Var, i2);
            }
            c.k("invalid orientation");
            return null;
        }
        return new md0(oh0Var, 0);
    }

    public abstract int b(View view);

    public abstract int c(View view);

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m(View view);

    public abstract int n(View view);

    public abstract void o(int i);

    public ws(ys ysVar) {
        this.a = 0;
        this.c = new tn();
        this.b = ysVar;
    }
}
