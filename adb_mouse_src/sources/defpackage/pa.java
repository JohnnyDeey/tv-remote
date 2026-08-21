package defpackage;

import java.io.IOException;
import java.security.Key;
import java.security.PrivateKey;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class pa implements PrivateKey, Key {
    public transient t40 c;
    public transient b0 d;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof pa) {
            try {
                return Arrays.equals(this.c.getEncoded(), ((pa) obj).c.getEncoded());
            } catch (IOException unused) {
                c.o("unable to perform equals");
            }
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "LMS";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return k20.n(this.c, this.d).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "PKCS#8";
    }

    public final int hashCode() {
        try {
            return f20.K(this.c.getEncoded());
        } catch (IOException unused) {
            c.o("unable to calculate hashCode");
            return 0;
        }
    }
}
