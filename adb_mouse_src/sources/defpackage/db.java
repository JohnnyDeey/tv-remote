package defpackage;

import java.io.IOException;
import java.security.Key;
import java.security.PublicKey;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class db implements PublicKey, Key {
    public transient xk0 c;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof db) {
            i10 i10Var = this.c.e;
            byte[] h = f20.h(i10Var.a, i10Var.b);
            i10 i10Var2 = ((db) obj).c.e;
            return Arrays.equals(h, f20.h(i10Var2.a, i10Var2.b));
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "SPHINCS+-".concat(yp0.f(((vk0) this.c.d).b));
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
        i10 i10Var = this.c.e;
        return f20.K(f20.h(i10Var.a, i10Var.b));
    }
}
