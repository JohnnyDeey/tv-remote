package defpackage;

import java.io.IOException;
import java.security.Key;
import java.security.PrivateKey;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class va implements Key, PrivateKey {
    public transient ib0 c;
    public transient b0 d;

    public final boolean equals(Object obj) {
        if (!(obj instanceof va)) {
            return false;
        }
        return Arrays.equals(f20.f(this.c.d), f20.f(((va) obj).c.d));
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "NH";
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
        short[] f = f20.f(this.c.d);
        if (f == null) {
            return 0;
        }
        int length = f.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length >= 0) {
                i = (i * 257) ^ (f[length] & 255);
            } else {
                return i;
            }
        }
    }
}
