package defpackage;

import java.math.BigInteger;
import java.security.SecureRandom;

/* loaded from: classes.dex */
public abstract class is {
    public final rv a;
    public k20 b;
    public k20 c;
    public BigInteger d;
    public BigInteger e;
    public int f = 0;

    public is(rv rvVar) {
        this.a = rvVar;
    }

    public ls a(BigInteger bigInteger, BigInteger bigInteger2) {
        return b(e(bigInteger), e(bigInteger2));
    }

    public abstract ls b(k20 k20Var, k20 k20Var2);

    public abstract ls c(int i, BigInteger bigInteger);

    public final boolean d(is isVar) {
        if (this != isVar) {
            if (isVar == null || !this.a.equals(isVar.a) || !this.b.r0().equals(isVar.b.r0()) || !this.c.r0().equals(isVar.c.r0())) {
                return false;
            }
            return true;
        }
        return true;
    }

    public abstract k20 e(BigInteger bigInteger);

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof is) || !d((is) obj)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public abstract int f();

    public abstract ls g();

    public ls h(ls lsVar) {
        if (this == lsVar.a) {
            return lsVar;
        }
        if (lsVar.h()) {
            return g();
        }
        ls j = lsVar.j();
        return a(j.b.r0(), j.e().r0());
    }

    public final int hashCode() {
        return Integer.rotateLeft(this.c.r0().hashCode(), 16) ^ (this.a.hashCode() ^ Integer.rotateLeft(this.b.r0().hashCode(), 8));
    }

    public abstract k20 i(SecureRandom secureRandom);
}
