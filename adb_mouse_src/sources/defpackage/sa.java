package defpackage;

import java.io.IOException;
import java.security.Key;
import java.security.PublicKey;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class sa implements PublicKey, Key {
    public transient b80 c;
    public transient String d;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sa) {
            return Arrays.equals(getEncoded(), ((sa) obj).getEncoded());
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return this.d;
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return wg0.h(this.c).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    public final int hashCode() {
        return f20.K(getEncoded());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String str = yp0.a;
        byte[] encoded = this.c.getEncoded();
        sb.append(this.d);
        sb.append(" Public Key [");
        ik0 ik0Var = new ik0(256);
        ik0Var.update(encoded, 0, encoded.length);
        byte[] bArr = new byte[20];
        ik0Var.k(bArr, 0, 20);
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i != 20; i++) {
            if (i > 0) {
                sb2.append(":");
            }
            char[] cArr = mn.d;
            sb2.append(cArr[(bArr[i] >>> 4) & 15]);
            sb2.append(cArr[bArr[i] & 15]);
        }
        sb.append(sb2.toString());
        sb.append("]");
        sb.append(str);
        sb.append("    public data: ");
        sb.append(yp0.a(h10.b(encoded.length, encoded)));
        sb.append(str);
        return sb.toString();
    }
}
