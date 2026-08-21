package defpackage;

import android.graphics.Rect;
import java.util.List;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public abstract class y01 {
    public final m11 a;
    public d20[] b;
    public final Rect[][] c;
    public final Rect[][] d;

    public y01(m11 m11Var) {
        this.c = new Rect[10];
        this.d = new Rect[10];
        this.a = m11Var;
        c(m11Var);
    }

    public final void a() {
        d20[] d20VarArr = this.b;
        if (d20VarArr != null) {
            d20 d20Var = d20VarArr[0];
            d20 d20Var2 = d20VarArr[1];
            m11 m11Var = this.a;
            if (d20Var2 == null) {
                d20Var2 = m11Var.a.h(2);
            }
            if (d20Var == null) {
                d20Var = m11Var.a.h(1);
            }
            h(d20.a(d20Var, d20Var2));
            d20 d20Var3 = this.b[oi0.m(16)];
            if (d20Var3 != null) {
                g(d20Var3);
            }
            d20 d20Var4 = this.b[oi0.m(32)];
            if (d20Var4 != null) {
                e(d20Var4);
            }
            d20 d20Var5 = this.b[oi0.m(64)];
            if (d20Var5 != null) {
                i(d20Var5);
            }
        }
    }

    public abstract m11 b();

    public void c(m11 m11Var) {
        for (int i = 1; i <= 512; i <<= 1) {
            List<Rect> e = m11Var.a.e(i);
            int m = oi0.m(i);
            this.c[m] = (Rect[]) e.toArray(new Rect[e.size()]);
            if (i != 8) {
                List<Rect> f = m11Var.a.f(i);
                this.d[m] = (Rect[]) f.toArray(new Rect[f.size()]);
            }
        }
    }

    public void d(int i, d20 d20Var) {
        if (this.b == null) {
            this.b = new d20[10];
        }
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                this.b[oi0.m(i2)] = d20Var;
            }
        }
    }

    public abstract void f(d20 d20Var);

    public abstract void h(d20 d20Var);

    public y01() {
        this(new m11());
    }

    public void e(d20 d20Var) {
    }

    public void g(d20 d20Var) {
    }

    public void i(d20 d20Var) {
    }
}
