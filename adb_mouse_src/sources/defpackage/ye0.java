package defpackage;

import java.math.BigInteger;

/* loaded from: classes.dex */
public final class ye0 implements rv {
    public final BigInteger a;

    public ye0(BigInteger bigInteger) {
        this.a = bigInteger;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ye0)) {
            return false;
        }
        return this.a.equals(((ye0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
