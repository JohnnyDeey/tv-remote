package defpackage;

import java.io.IOException;
import java.security.Key;
import java.security.PrivateKey;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class gb implements PrivateKey, Key {
    public transient s c;
    public transient yk0 d;
    public transient b0 e;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gb) {
            gb gbVar = (gb) obj;
            if (this.c.m(gbVar.c) && Arrays.equals(f20.e(this.d.e), f20.e(gbVar.d.e))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "SPHINCS-256";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            yk0 yk0Var = this.d;
            String str = yk0Var.d;
            return k20.n(yk0Var, this.e).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "PKCS#8";
    }

    public final int hashCode() {
        return (f20.K(f20.e(this.d.e)) * 37) + f20.K(this.c.c);
    }
}
