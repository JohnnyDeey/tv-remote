package defpackage;

import java.io.IOException;
import java.security.Key;
import java.security.PrivateKey;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class eb implements PrivateKey, Key {
    public transient no0 c;
    public transient b0 d;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eb) {
            return Arrays.equals(f20.e(this.c.d), f20.e(((eb) obj).c.d));
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return yp0.f(this.c.e.a);
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
        return f20.K(f20.e(this.c.d));
    }
}
