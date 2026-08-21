package defpackage;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class w51 implements Runnable {
    public final x61 c;
    public final u61 d;

    public w51(x61 x61Var, u61 u61Var) {
        this.c = x61Var;
        this.d = u61Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c.c == this) {
            u61 u61Var = this.d;
            if (e61.i.L(this.c, this, x61.g(u61Var))) {
                x61.i(this.c);
            }
        }
    }
}
