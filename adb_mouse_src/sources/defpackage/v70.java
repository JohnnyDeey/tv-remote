package defpackage;

/* loaded from: classes.dex */
public final class v70 extends bc {
    public final byte[] e;
    public final byte[] f;

    public v70(t70 t70Var, byte[] bArr, byte[] bArr2) {
        super((Object) t70Var, false);
        if (bArr != null) {
            if (bArr2 != null) {
                this.e = f20.e(bArr);
                this.f = f20.e(bArr2);
                return;
            } else {
                c.g("t1 cannot be null");
                throw null;
            }
        }
        c.g("rho cannot be null");
        throw null;
    }

    public v70(t70 t70Var, byte[] bArr) {
        super((Object) t70Var, false);
        this.e = f20.p(bArr, 0, 32);
        byte[] p = f20.p(bArr, 32, bArr.length);
        this.f = p;
        if (p.length != 0) {
            return;
        }
        c.k("encoding too short");
        throw null;
    }
}
