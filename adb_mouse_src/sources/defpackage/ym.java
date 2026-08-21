package defpackage;

import java.math.BigInteger;

/* loaded from: classes.dex */
public final class ym {
    public BigInteger a;
    public BigInteger b;
    public BigInteger c;

    public final boolean equals(Object obj) {
        if (!(obj instanceof ym)) {
            return false;
        }
        ym ymVar = (ym) obj;
        BigInteger bigInteger = this.c;
        BigInteger bigInteger2 = ymVar.c;
        if (bigInteger != null) {
            if (!bigInteger.equals(bigInteger2)) {
                return false;
            }
        } else if (bigInteger2 != null) {
            return false;
        }
        if (!ymVar.b.equals(this.b) || !ymVar.a.equals(this.a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.b.hashCode() ^ this.a.hashCode();
        BigInteger bigInteger = this.c;
        if (bigInteger != null) {
            i = bigInteger.hashCode();
        } else {
            i = 0;
        }
        return i ^ hashCode;
    }
}
