package defpackage;

import java.security.Key;
import java.security.PrivateKey;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class ja implements PrivateKey, Key {
    public transient fv c;
    public transient String d;
    public transient byte[] e;
    public transient b0 f;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ja) {
            return Arrays.equals(getEncoded(), ((ja) obj).getEncoded());
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return this.d;
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        if (this.e == null) {
            fv fvVar = this.c;
            b0 b0Var = this.f;
            byte[] bArr = null;
            if (fvVar.c) {
                try {
                    bArr = k20.n(fvVar, b0Var).h();
                } catch (Exception unused) {
                }
                this.e = bArr;
            } else {
                c.k("public key found");
                return null;
            }
        }
        return f20.e(this.e);
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "PKCS#8";
    }

    public final int hashCode() {
        return f20.K(getEncoded());
    }
}
