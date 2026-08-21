package defpackage;

/* loaded from: classes.dex */
public final class mk0 extends bc {
    public final i10 e;

    public mk0(kk0 kk0Var, byte[] bArr) {
        super((Object) kk0Var, false);
        int a = kk0Var.a.a();
        int i = a * 2;
        if (bArr.length == i) {
            this.e = new i10(f20.p(bArr, 0, a), f20.p(bArr, a, i));
        } else {
            c.k("public key encoding does not match parameters");
            throw null;
        }
    }
}
