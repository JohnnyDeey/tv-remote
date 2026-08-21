package defpackage;

import java.io.IOException;
import java.security.PrivateKey;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class jb implements PrivateKey {
    public transient s c;
    public transient f21 d;
    public transient b0 e;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jb) {
            jb jbVar = (jb) obj;
            if (this.c.m(jbVar.c) && Arrays.equals(this.d.a(), jbVar.d.a())) {
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
            return k20.n(this.d, this.e).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "PKCS#8";
    }

    public final int hashCode() {
        return (f20.K(this.d.a()) * 37) + f20.K(this.c.c);
    }
}
