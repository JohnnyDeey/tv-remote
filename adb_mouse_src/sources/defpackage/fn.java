package defpackage;

import java.math.BigInteger;

/* loaded from: classes.dex */
public final class fn {
    public final BigInteger a;
    public final BigInteger b;
    public final BigInteger c;
    public final gn d;

    public fn(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, gn gnVar) {
        this.a = bigInteger3;
        this.c = bigInteger;
        this.b = bigInteger2;
        this.d = gnVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof fn) {
            fn fnVar = (fn) obj;
            if (fnVar.c.equals(this.c) && fnVar.b.equals(this.b) && fnVar.a.equals(this.a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ (this.c.hashCode() ^ this.b.hashCode());
    }
}
