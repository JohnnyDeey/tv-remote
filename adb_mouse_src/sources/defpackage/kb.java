package defpackage;

import java.io.IOException;
import java.security.PublicKey;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class kb implements PublicKey {
    public transient s c;
    public transient h21 d;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kb) {
            kb kbVar = (kb) obj;
            if (this.c.m(kbVar.c) && Arrays.equals(this.d.a(), kbVar.d.a())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "XMSSMT";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return wg0.h(this.d).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    public final int hashCode() {
        return (f20.K(this.d.a()) * 37) + f20.K(this.c.c);
    }
}
