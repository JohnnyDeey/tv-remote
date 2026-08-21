package defpackage;

/* loaded from: classes.dex */
public abstract class z11 {
    public final int a;
    public long b;
    public int c;
    public int d;

    public z11(z11 z11Var) {
        this.a = z11Var.c;
        this.b = z11Var.b;
        this.c = z11Var.a;
        this.d = z11Var.d;
    }

    public byte[] a() {
        byte[] bArr = new byte[32];
        k20.H(bArr, this.a, 0);
        k20.R(4, this.b, bArr);
        k20.H(bArr, this.c, 12);
        k20.H(bArr, this.d, 28);
        return bArr;
    }

    public z11(int i) {
        this.c = 0;
        this.b = 0L;
        this.d = 0;
        this.a = i;
    }
}
