package defpackage;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public abstract class w71 implements Cloneable {
    public final x71 c;
    public x71 d;

    public w71(x71 x71Var) {
        this.c = x71Var;
        if (!x71Var.h()) {
            this.d = x71Var.n();
        } else {
            c.k("Default instance must be immutable.");
            throw null;
        }
    }

    public final x71 a() {
        boolean h = this.d.h();
        x71 x71Var = this.d;
        if (h) {
            x71Var.p();
            x71Var = this.d;
        }
        x71Var.getClass();
        if (x71.i(x71Var, true)) {
            return x71Var;
        }
        throw new w81();
    }

    public final void b() {
        if (!this.d.h()) {
            x71 n = this.c.n();
            r81.c.a(n.getClass()).b(n, this.d);
            this.d = n;
        }
    }

    public final Object clone() {
        w71 w71Var = (w71) this.c.j(5);
        boolean h = this.d.h();
        x71 x71Var = this.d;
        if (h) {
            x71Var.p();
            x71Var = this.d;
        }
        w71Var.d = x71Var;
        return w71Var;
    }
}
