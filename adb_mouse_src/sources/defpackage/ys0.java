package defpackage;

/* loaded from: classes.dex */
public final class ys0 implements fs0 {
    public final rd a;
    public final fs0 b;
    public final fs0 c;
    public final int d;

    public ys0(rd rdVar, fs0 fs0Var, fs0 fs0Var2, int i) {
        this.a = rdVar;
        this.b = fs0Var;
        this.c = fs0Var2;
        this.d = i;
    }

    @Override // defpackage.fs0
    public final byte[] a() {
        return f20.h(this.b.a(), this.c.a());
    }

    @Override // defpackage.fs0
    public final i30 b() {
        return new i30(this.a, f20.h(this.b.b().e(), this.c.b().e()));
    }

    @Override // defpackage.fs0
    public final void c(byte[] bArr) {
        int length = bArr.length;
        int i = this.d;
        if (length >= i) {
            this.b.c(f20.p(bArr, 0, i));
            this.c.c(f20.p(bArr, i, bArr.length));
            return;
        }
        c.k("'peerValue' is too short");
    }
}
