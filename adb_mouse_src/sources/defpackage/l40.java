package defpackage;

/* loaded from: classes.dex */
public final class l40 {
    public byte[] a;

    public l40(byte[] bArr, cn0 cn0Var) {
        if (bArr != null) {
            if (bArr.length <= 32) {
                this.a = f20.e(bArr);
                return;
            } else {
                c.k("'sessionID' cannot be longer than 32 bytes");
                throw null;
            }
        }
        c.k("'sessionID' cannot be null");
        throw null;
    }
}
