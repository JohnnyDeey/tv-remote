package defpackage;

/* loaded from: classes.dex */
public final class ix0 extends p {
    public final wr0 c;
    public final wr0 d;

    public ix0(wr0 wr0Var, wr0 wr0Var2) {
        if (wr0Var != null) {
            if (wr0Var2 != null) {
                this.c = wr0Var;
                this.d = wr0Var2;
                return;
            } else {
                c.g("'notAfter' cannot be null");
                throw null;
            }
        }
        c.g("'notBefore' cannot be null");
        throw null;
    }

    @Override // defpackage.p, defpackage.i
    public final x c() {
        return new nm(this.c, this.d);
    }
}
