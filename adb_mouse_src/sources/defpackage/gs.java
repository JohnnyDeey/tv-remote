package defpackage;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Random;

/* loaded from: classes.dex */
public final class gs extends is {
    public int g;
    public int h;
    public int i;
    public int j;
    public ls k;

    @Override // defpackage.is
    public final ls a(BigInteger bigInteger, BigInteger bigInteger2) {
        k20 e = e(bigInteger);
        k20 e2 = e(bigInteger2);
        int i = this.f;
        if (i == 5 || i == 6) {
            if (((js) e).J.n()) {
                if (!e2.k0().equals(this.c)) {
                    throw new IllegalArgumentException();
                }
            } else {
                e2 = ((js) e2).T(e.J()).a(e);
            }
        }
        return new ls(this, e, e2, 0);
    }

    @Override // defpackage.is
    public final ls b(k20 k20Var, k20 k20Var2) {
        return new ls(this, k20Var, k20Var2, 0);
    }

    @Override // defpackage.is
    public final ls c(int i, BigInteger bigInteger) {
        k20 k20Var;
        k20 e = e(bigInteger);
        if (((js) e).J.n()) {
            k20Var = this.c.j0();
        } else {
            k20 j = j(e.k0().J().T(this.c).a(this.b).a(e));
            if (j != null) {
                boolean o0 = j.o0();
                boolean z = true;
                if (i != 1) {
                    z = false;
                }
                if (o0 != z) {
                    j = j.b();
                }
                int i2 = this.f;
                if (i2 != 5 && i2 != 6) {
                    k20Var = j.T(e);
                } else {
                    k20Var = j.a(e);
                }
            } else {
                k20Var = null;
            }
        }
        if (k20Var != null) {
            return new ls(this, e, k20Var, 0);
        }
        c.k("Invalid point compression");
        return null;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, q70] */
    @Override // defpackage.is
    public final k20 e(BigInteger bigInteger) {
        int[] iArr;
        if (bigInteger != null && bigInteger.signum() >= 0) {
            int bitLength = bigInteger.bitLength();
            int i = this.g;
            if (bitLength <= i) {
                int i2 = this.i;
                int i3 = this.j;
                int i4 = i2 | i3;
                int i5 = this.h;
                char c = 2;
                int i6 = 1;
                if (i4 == 0) {
                    iArr = new int[]{i5};
                } else {
                    iArr = new int[]{i5, i2, i3};
                }
                ?? obj = new Object();
                if (bigInteger.signum() >= 0) {
                    if (bigInteger.signum() == 0) {
                        obj.c = new long[]{0};
                    } else {
                        byte[] byteArray = bigInteger.toByteArray();
                        int length = byteArray.length;
                        if (byteArray[0] == 0) {
                            length--;
                        } else {
                            i6 = 0;
                        }
                        int i7 = (length + 7) / 8;
                        obj.c = new long[i7];
                        int i8 = i7 - 1;
                        int i9 = (length % 8) + i6;
                        if (i6 < i9) {
                            long j = 0;
                            while (i6 < i9) {
                                j = (j << 8) | (byteArray[i6] & 255);
                                i6++;
                                c = c;
                            }
                            obj.c[i8] = j;
                            i8 = i7 - 2;
                        }
                        while (i8 >= 0) {
                            long j2 = 0;
                            int i10 = 0;
                            while (i10 < 8) {
                                j2 = (j2 << 8) | (byteArray[i6] & 255);
                                i10++;
                                i6++;
                            }
                            obj.c[i8] = j2;
                            i8--;
                        }
                    }
                    return new js(i, iArr, obj);
                }
                c.k("invalid F2m field value");
                return null;
            }
        }
        c.k("x value invalid in F2m field element");
        return null;
    }

    @Override // defpackage.is
    public final int f() {
        return this.g;
    }

    @Override // defpackage.is
    public final ls g() {
        return this.k;
    }

    @Override // defpackage.is
    public final k20 i(SecureRandom secureRandom) {
        BigInteger b;
        BigInteger b2;
        int i = this.g;
        do {
            b = kd.b(i, secureRandom);
        } while (b.signum() <= 0);
        k20 e = e(b);
        do {
            b2 = kd.b(i, secureRandom);
        } while (b2.signum() <= 0);
        return e.T(e(b2));
    }

    public final k20 j(k20 k20Var) {
        k20 k20Var2;
        js jsVar = (js) k20Var;
        jsVar.getClass();
        int i = this.g;
        if ((i & 1) != 0) {
            int i2 = jsVar.H;
            if ((i2 & 1) != 0) {
                int i3 = (i2 + 1) >>> 1;
                int numberOfLeadingZeros = 31 - Integer.numberOfLeadingZeros(i3);
                k20 k20Var3 = jsVar;
                int i4 = 1;
                while (numberOfLeadingZeros > 0) {
                    k20Var3 = k20Var3.m0(i4 << 1).a(k20Var3);
                    numberOfLeadingZeros--;
                    i4 = i3 >>> numberOfLeadingZeros;
                    if ((i4 & 1) != 0) {
                        k20Var3 = k20Var3.m0(2).a(jsVar);
                    }
                }
                if (k20Var3.k0().a(k20Var3).a(k20Var).O()) {
                    return k20Var3;
                }
            } else {
                c.o("Half-trace only defined for odd m");
                return null;
            }
        } else {
            if (k20Var.O()) {
                return k20Var;
            }
            k20 e = e(fs.a);
            Random random = new Random();
            do {
                k20 e2 = e(new BigInteger(i, random));
                k20 k20Var4 = k20Var;
                k20Var2 = e;
                for (int i5 = 1; i5 < i; i5++) {
                    k20 k0 = k20Var4.k0();
                    k20Var2 = k20Var2.k0().a(k0.T(e2));
                    k20Var4 = k0.a(k20Var);
                }
                if (!k20Var4.O()) {
                }
            } while (k20Var2.k0().a(k20Var2).O());
            return k20Var2;
        }
        return null;
    }
}
