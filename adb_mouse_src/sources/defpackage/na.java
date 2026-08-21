package defpackage;

import java.io.IOException;
import java.security.Key;
import java.security.PrivateKey;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class na implements PrivateKey, Key {
    public transient z70 c;
    public transient String d;
    public transient b0 e;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof na) {
            return Arrays.equals(getEncoded(), ((na) obj).getEncoded());
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
        return f20.K(getEncoded());
    }
}
