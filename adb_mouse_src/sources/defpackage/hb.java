package defpackage;

import java.io.IOException;
import java.security.Key;
import java.security.PublicKey;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class hb implements PublicKey, Key {
    public transient s c;
    public transient zk0 d;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hb) {
            hb hbVar = (hb) obj;
            if (this.c.m(hbVar.c) && Arrays.equals(f20.e(this.d.e), f20.e(hbVar.d.e))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "SPHINCS-256";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            zk0 zk0Var = this.d;
            String str = zk0Var.d;
            return wg0.h(zk0Var).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    public final int hashCode() {
        return (f20.K(f20.e(this.d.e)) * 37) + f20.K(this.c.c);
    }
}
