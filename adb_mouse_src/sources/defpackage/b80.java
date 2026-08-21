package defpackage;

/* loaded from: classes.dex */
public final class b80 extends bc {
    public final byte[] e;
    public final byte[] f;

    public b80(y70 y70Var, byte[] bArr, byte[] bArr2) {
        super((Object) y70Var, false);
        rj rjVar = new rj(y70Var.b, 2);
        if (bArr.length == rjVar.b) {
            if (bArr2.length == 32) {
                byte[] e = f20.e(bArr);
                this.e = e;
                this.f = f20.e(bArr2);
                if (rjVar.a(e)) {
                    return;
                }
                c.k("Modulus check failed for ML-KEM public key");
                throw null;
            }
            c.k("'rho' has invalid length");
            throw null;
        }
        c.k("'t' has invalid length");
        throw null;
    }

    public final byte[] getEncoded() {
        return f20.h(this.e, this.f);
    }

    public b80(y70 y70Var, byte[] bArr) {
        super((Object) y70Var, false);
        rj rjVar = new rj(y70Var.b, 2);
        if (bArr.length != rjVar.d) {
            c.k("'encoding' has invalid length");
            throw null;
        }
        byte[] p = f20.p(bArr, 0, bArr.length - 32);
        this.e = p;
        this.f = f20.p(bArr, bArr.length - 32, bArr.length);
        if (rjVar.a(p)) {
            return;
        }
        c.k("Modulus check failed for ML-KEM public key");
        throw null;
    }
}
