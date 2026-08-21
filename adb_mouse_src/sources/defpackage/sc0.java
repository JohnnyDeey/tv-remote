package defpackage;

/* loaded from: classes.dex */
public final class sc0 extends z11 {
    public final int e;
    public final int f;
    public final int g;

    public sc0(z40 z40Var) {
        super(z40Var);
        this.e = z40Var.e;
        this.f = z40Var.f;
        this.g = z40Var.g;
    }

    @Override // defpackage.z11
    public final byte[] a() {
        byte[] a = super.a();
        k20.H(a, this.e, 16);
        k20.H(a, this.f, 20);
        k20.H(a, this.g, 24);
        return a;
    }
}
