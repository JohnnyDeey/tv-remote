package defpackage;

import java.io.IOException;
import java.security.Key;
import java.security.PublicKey;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class ga implements PublicKey, Key {
    public transient ue c;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ga) {
            return Arrays.equals(f20.e(this.c.e), f20.e(((ga) obj).c.e));
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return yp0.f(((qe) this.c.d).a);
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
        return f20.K(f20.e(this.c.e));
    }
}
