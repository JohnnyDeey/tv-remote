package defpackage;

import java.io.IOException;
import java.security.Key;
import java.security.PrivateKey;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class da implements PrivateKey, Key {
    public transient dc c;
    public transient b0 d;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof da) {
            dc dcVar = this.c;
            byte[] i = f20.i(dcVar.e, dcVar.f, dcVar.g);
            dc dcVar2 = ((da) obj).c;
            return Arrays.equals(i, f20.i(dcVar2.e, dcVar2.f, dcVar2.g));
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return yp0.f(((cc) this.c.d).a);
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
        dc dcVar = this.c;
        return f20.K(f20.i(dcVar.e, dcVar.f, dcVar.g));
    }
}
