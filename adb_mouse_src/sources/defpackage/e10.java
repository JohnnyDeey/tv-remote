package defpackage;

/* loaded from: classes.dex */
public final class e10 extends z11 {
    public final int e;
    public final int f;

    public e10(d10 d10Var) {
        super(d10Var);
        this.e = d10Var.e;
        this.f = d10Var.f;
    }

    @Override // defpackage.z11
    public final byte[] a() {
        byte[] a = super.a();
        k20.H(a, 0, 16);
        k20.H(a, this.e, 20);
        k20.H(a, this.f, 24);
        return a;
    }
}
