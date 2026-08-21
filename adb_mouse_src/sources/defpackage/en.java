package defpackage;

/* loaded from: classes.dex */
public final class en extends zb {
    public final boolean f;

    public en(int i, int i2, boolean z, c0 c0Var) {
        super(i, i2, c0Var);
        this.f = z;
    }

    @Override // defpackage.zb, defpackage.o10
    public final x f() {
        boolean z = this.f;
        int i = 4;
        c0 c0Var = this.e;
        int i2 = this.c;
        int i3 = this.d;
        if (!z) {
            return new yb(i, i2, i3, new t(((vo) ((w50) c0Var.e)).b()), 2);
        }
        j o = c0Var.o();
        if (o.b == 1) {
            return new yb(3, i2, i3, o.f(0), 2);
        }
        return new yb(i, i2, i3, bn.a(o), 2);
    }
}
