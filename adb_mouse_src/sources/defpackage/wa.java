package defpackage;

import java.io.IOException;
import java.security.Key;
import java.security.PublicKey;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class wa implements Key, PublicKey {
    public transient jb0 c;

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof wa)) {
            return Arrays.equals(f20.e(this.c.d), f20.e(((wa) obj).c.d));
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "NH";
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
