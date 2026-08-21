package defpackage;

/* loaded from: classes.dex */
public final class lk0 extends bc {
    public final i10 e;
    public final i10 f;

    public lk0(kk0 kk0Var, byte[] bArr) {
        super((Object) kk0Var, true);
        int a = kk0Var.a.a();
        int i = a * 4;
        if (bArr.length == i) {
            int i2 = a * 2;
            this.e = new i10(f20.p(bArr, 0, a), f20.p(bArr, a, i2));
            int i3 = a * 3;
            this.f = new i10(f20.p(bArr, i2, i3), f20.p(bArr, i3, i));
            return;
        }
        c.k("private key encoding does not match parameters");
        throw null;
    }
}
