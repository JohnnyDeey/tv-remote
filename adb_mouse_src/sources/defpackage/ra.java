package defpackage;

import java.io.IOException;
import java.security.Key;
import java.security.PrivateKey;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class ra implements PrivateKey, Key {
    public transient z70 c;
    public transient String d;
    public transient b0 e;
    public transient byte[] f;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ra) {
            return Arrays.equals(this.c.getEncoded(), ((ra) obj).c.getEncoded());
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
            byte[] bArr = this.f;
            if (bArr != null) {
                return bArr;
            }
            return k20.n(this.c, this.e).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "PKCS#8";
    }

    public final int hashCode() {
        return f20.K(this.c.getEncoded());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String str = yp0.a;
        z70 z70Var = this.c;
        byte[] h = f20.h(z70Var.h, z70Var.i);
        sb.append(this.d);
        sb.append(" Private Key [");
        ik0 ik0Var = new ik0(256);
        ik0Var.update(h, 0, h.length);
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
        sb.append(yp0.a(h10.b(h.length, h)));
        sb.append(str);
        return sb.toString();
    }
}
