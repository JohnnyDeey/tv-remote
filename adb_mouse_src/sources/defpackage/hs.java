package defpackage;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class hs extends is {
    public static final Set j = Collections.synchronizedSet(new HashSet());
    public static final c0 k = new c0(2);
    public BigInteger g;
    public BigInteger h;
    public ls i;

    @Override // defpackage.is
    public final ls b(k20 k20Var, k20 k20Var2) {
        return new ls(this, k20Var, k20Var2, 1);
    }

    @Override // defpackage.is
    public final ls c(int i, BigInteger bigInteger) {
        boolean z;
        k20 e = e(bigInteger);
        k20 j0 = e.k0().a(this.b).T(e).a(this.c).j0();
        if (j0 != null) {
            boolean o0 = j0.o0();
            if (i == 1) {
                z = true;
            } else {
                z = false;
            }
            if (o0 != z) {
                j0 = j0.W();
            }
            return new ls(this, e, j0, 1);
        }
        c.k("Invalid point compression");
        return null;
    }

    @Override // defpackage.is
    public final k20 e(BigInteger bigInteger) {
        BigInteger bigInteger2 = this.g;
        if (bigInteger != null && bigInteger.signum() >= 0 && bigInteger.compareTo(bigInteger2) < 0) {
            return new ks(bigInteger2, this.h, bigInteger);
        }
        c.k("x value invalid for Fp field element");
        return null;
    }

    @Override // defpackage.is
    public final int f() {
        return this.g.bitLength();
    }

    @Override // defpackage.is
    public final ls g() {
        return this.i;
    }

    @Override // defpackage.is
    public final ls h(ls lsVar) {
        int i;
        if (this != lsVar.a && this.f == 2 && !lsVar.h() && ((i = lsVar.a.f) == 2 || i == 3 || i == 4)) {
            return new ls(this, e(lsVar.b.r0()), e(lsVar.c.r0()), new k20[]{e(lsVar.d[0].r0())}, 1);
        }
        return super.h(lsVar);
    }

    @Override // defpackage.is
    public final k20 i(SecureRandom secureRandom) {
        BigInteger b;
        BigInteger bigInteger = this.g;
        while (true) {
            b = kd.b(bigInteger.bitLength(), secureRandom);
            if (b.signum() > 0 && b.compareTo(bigInteger) < 0) {
                break;
            }
        }
        k20 e = e(b);
        while (true) {
            BigInteger b2 = kd.b(bigInteger.bitLength(), secureRandom);
            if (b2.signum() > 0 && b2.compareTo(bigInteger) < 0) {
                return e.T(e(b2));
            }
        }
    }
}
