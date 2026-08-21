package defpackage;

/* loaded from: classes.dex */
public final class m40 {
    public final int a;
    public final byte[] b;

    public m40(int i, byte[] bArr) {
        if (ht0.C(i)) {
            if (bArr != null) {
                int length = bArr.length;
                if (length > 0 && length < 65536) {
                    this.a = i;
                    this.b = bArr;
                    return;
                } else {
                    c.k("'keyExchange' must have length from 1 to (2^16 - 1)");
                    throw null;
                }
            }
            c.g("'keyExchange' cannot be null");
            throw null;
        }
        c.k("'namedGroup' should be a uint16");
        throw null;
    }
}
