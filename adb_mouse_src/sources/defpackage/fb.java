package defpackage;

import java.io.IOException;
import java.security.Key;
import java.security.PublicKey;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class fb implements PublicKey, Key {
    public transient oo0 c;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fb) {
            return Arrays.equals(f20.e(this.c.d), f20.e(((fb) obj).c.d));
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
        return f20.K(f20.e(this.c.d));
    }
}
