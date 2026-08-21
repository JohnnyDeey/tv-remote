package defpackage;

/* loaded from: classes.dex */
public final class bn0 {
    public final short a;

    public bn0(short s, byte[] bArr) {
        byte[] bArr2 = ht0.a;
        if ((s & 255) == s) {
            if (bArr != null) {
                if (bArr.length >= 1 && ht0.C(bArr.length)) {
                    this.a = s;
                    return;
                } else {
                    c.k("'nameData' must have length from 1 to 65535");
                    throw null;
                }
            }
            c.g("'nameData' cannot be null");
            throw null;
        }
        c.k("'nameType' must be from 0 to 255");
        throw null;
    }
}
