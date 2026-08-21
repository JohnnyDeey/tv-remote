package defpackage;

import java.io.IOException;
import java.security.PrivateKey;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class lb implements PrivateKey {
    public transient l21 c;
    public transient s d;
    public transient b0 e;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lb) {
            lb lbVar = (lb) obj;
            if (this.d.m(lbVar.d) && Arrays.equals(this.c.a(), lbVar.c.a())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "XMSS";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
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
        return (f20.K(this.c.a()) * 37) + f20.K(this.d.c);
    }
}
