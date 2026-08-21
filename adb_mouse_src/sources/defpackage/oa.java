package defpackage;

import java.security.Key;
import java.security.PublicKey;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class oa implements PublicKey, Key {
    public transient b80 c;
    public transient String d;
    public transient byte[] e;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof oa) {
            return Arrays.equals(getEncoded(), ((oa) obj).getEncoded());
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
            this.e = r21.s(this.c);
        }
        return f20.e(this.e);
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    public final int hashCode() {
        return f20.K(getEncoded());
    }
}
