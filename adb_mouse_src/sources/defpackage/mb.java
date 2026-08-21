package defpackage;

import java.io.IOException;
import java.security.PublicKey;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class mb implements PublicKey {
    public transient n21 c;
    public transient s d;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mb) {
            mb mbVar = (mb) obj;
            try {
                if (this.d.m(mbVar.d)) {
                    if (Arrays.equals(this.c.getEncoded(), mbVar.c.getEncoded())) {
                        return true;
                    }
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "XMSS";
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
        try {
            return (f20.K(this.c.getEncoded()) * 37) + f20.K(this.d.c);
        } catch (IOException unused) {
            return f20.K(this.d.c);
        }
    }
}
