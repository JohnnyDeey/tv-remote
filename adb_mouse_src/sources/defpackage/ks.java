package defpackage;

import java.math.BigInteger;
import java.util.Random;

/* loaded from: classes.dex */
public final class ks extends k20 {
    public final BigInteger G;
    public final BigInteger H;
    public final BigInteger I;

    public ks(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        super(17);
        this.G = bigInteger;
        this.H = bigInteger2;
        this.I = bigInteger3;
    }

    @Override // defpackage.k20
    public final int A() {
        return this.G.bitLength();
    }

    @Override // defpackage.k20
    public final k20 J() {
        return new ks(this.G, this.H, u0(this.I));
    }

    @Override // defpackage.k20
    public final k20 T(k20 k20Var) {
        return new ks(this.G, this.H, v0(this.I, k20Var.r0()));
    }

    @Override // defpackage.k20
    public final k20 U(k20 k20Var, k20 k20Var2, k20 k20Var3) {
        return new ks(this.G, this.H, w0(this.I.multiply(k20Var.r0()).subtract(k20Var2.r0().multiply(k20Var3.r0()))));
    }

    @Override // defpackage.k20
    public final k20 V(k20 k20Var, k20 k20Var2, k20 k20Var3) {
        return new ks(this.G, this.H, w0(this.I.multiply(k20Var.r0()).add(k20Var2.r0().multiply(k20Var3.r0()))));
    }

    @Override // defpackage.k20
    public final k20 W() {
        BigInteger bigInteger = this.I;
        if (bigInteger.signum() == 0) {
            return this;
        }
        BigInteger bigInteger2 = this.H;
        BigInteger bigInteger3 = this.G;
        return new ks(bigInteger3, bigInteger2, bigInteger3.subtract(bigInteger));
    }

    @Override // defpackage.k20
    public final k20 a(k20 k20Var) {
        BigInteger add = this.I.add(k20Var.r0());
        BigInteger bigInteger = this.G;
        if (add.compareTo(bigInteger) >= 0) {
            add = add.subtract(bigInteger);
        }
        return new ks(bigInteger, this.H, add);
    }

    @Override // defpackage.k20
    public final k20 b() {
        BigInteger add = this.I.add(fs.b);
        BigInteger bigInteger = this.G;
        if (add.compareTo(bigInteger) == 0) {
            add = fs.a;
        }
        return new ks(bigInteger, this.H, add);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ks)) {
            return false;
        }
        ks ksVar = (ks) obj;
        if (this.G.equals(ksVar.G) && this.I.equals(ksVar.I)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.I.hashCode() ^ this.G.hashCode();
    }

    @Override // defpackage.k20
    public final k20 j0() {
        k20 k20Var;
        int i;
        BigInteger bigInteger;
        if (O() || N()) {
            return this;
        }
        BigInteger bigInteger2 = this.G;
        int i2 = 0;
        k20 k20Var2 = null;
        if (bigInteger2.testBit(0)) {
            int i3 = 1;
            boolean testBit = bigInteger2.testBit(1);
            BigInteger bigInteger3 = this.H;
            BigInteger bigInteger4 = this.I;
            BigInteger bigInteger5 = fs.b;
            if (testBit) {
                ks ksVar = new ks(bigInteger2, bigInteger3, bigInteger4.modPow(bigInteger2.shiftRight(2).add(bigInteger5), bigInteger2));
                if (!ksVar.k0().equals(this)) {
                    return null;
                }
                return ksVar;
            }
            boolean testBit2 = bigInteger2.testBit(2);
            BigInteger bigInteger6 = fs.c;
            if (testBit2) {
                BigInteger modPow = bigInteger4.modPow(bigInteger2.shiftRight(3), bigInteger2);
                BigInteger v0 = v0(modPow, bigInteger4);
                if (v0(v0, modPow).equals(bigInteger5)) {
                    ks ksVar2 = new ks(bigInteger2, bigInteger3, v0);
                    if (!ksVar2.k0().equals(this)) {
                        return null;
                    }
                    return ksVar2;
                }
                ks ksVar3 = new ks(bigInteger2, bigInteger3, w0(v0.multiply(bigInteger6.modPow(bigInteger2.shiftRight(2), bigInteger2))));
                if (!ksVar3.k0().equals(this)) {
                    return null;
                }
                return ksVar3;
            }
            BigInteger shiftRight = bigInteger2.shiftRight(1);
            if (!bigInteger4.modPow(shiftRight, bigInteger2).equals(bigInteger5)) {
                return null;
            }
            BigInteger shiftLeft = bigInteger4.shiftLeft(1);
            if (shiftLeft.compareTo(bigInteger2) >= 0) {
                shiftLeft = shiftLeft.subtract(bigInteger2);
            }
            BigInteger shiftLeft2 = shiftLeft.shiftLeft(1);
            if (shiftLeft2.compareTo(bigInteger2) >= 0) {
                shiftLeft2 = shiftLeft2.subtract(bigInteger2);
            }
            BigInteger add = shiftRight.add(bigInteger5);
            BigInteger subtract = bigInteger2.subtract(bigInteger5);
            Random random = new Random();
            while (true) {
                BigInteger bigInteger7 = new BigInteger(bigInteger2.bitLength(), random);
                if (bigInteger7.compareTo(bigInteger2) < 0 && w0(bigInteger7.multiply(bigInteger7).subtract(shiftLeft2)).modPow(shiftRight, bigInteger2).equals(subtract)) {
                    int bitLength = add.bitLength();
                    k20Var = k20Var2;
                    int lowestSetBit = add.getLowestSetBit();
                    int i4 = bitLength - i3;
                    int i5 = i2;
                    BigInteger bigInteger8 = shiftRight;
                    BigInteger bigInteger9 = bigInteger5;
                    BigInteger bigInteger10 = bigInteger9;
                    BigInteger bigInteger11 = bigInteger10;
                    BigInteger bigInteger12 = bigInteger6;
                    Random random2 = random;
                    BigInteger bigInteger13 = bigInteger7;
                    while (true) {
                        bigInteger = subtract;
                        int i6 = lowestSetBit + 1;
                        bigInteger9 = v0(bigInteger9, bigInteger10);
                        if (i4 < i6) {
                            break;
                        }
                        if (add.testBit(i4)) {
                            bigInteger10 = v0(bigInteger9, bigInteger4);
                            BigInteger v02 = v0(bigInteger11, bigInteger13);
                            bigInteger6 = w0(bigInteger13.multiply(bigInteger6).subtract(bigInteger7.multiply(bigInteger9)));
                            bigInteger13 = w0(bigInteger13.multiply(bigInteger13).subtract(bigInteger10.shiftLeft(1)));
                            bigInteger11 = v02;
                        } else {
                            BigInteger w0 = w0(bigInteger11.multiply(bigInteger6).subtract(bigInteger9));
                            BigInteger w02 = w0(bigInteger13.multiply(bigInteger6).subtract(bigInteger7.multiply(bigInteger9)));
                            bigInteger6 = w0(bigInteger6.multiply(bigInteger6).subtract(bigInteger9.shiftLeft(1)));
                            bigInteger13 = w02;
                            bigInteger11 = w0;
                            bigInteger10 = bigInteger9;
                        }
                        i4--;
                        subtract = bigInteger;
                    }
                    BigInteger v03 = v0(bigInteger9, bigInteger4);
                    BigInteger w03 = w0(bigInteger11.multiply(bigInteger6).subtract(bigInteger9));
                    BigInteger w04 = w0(bigInteger13.multiply(bigInteger6).subtract(bigInteger7.multiply(bigInteger9)));
                    BigInteger w05 = w0(bigInteger9.multiply(v03));
                    for (int i7 = 1; i7 <= lowestSetBit; i7++) {
                        w03 = v0(w03, w04);
                        w04 = w0(w04.multiply(w04).subtract(w05.shiftLeft(1)));
                        w05 = w0(w05.multiply(w05));
                    }
                    BigInteger[] bigIntegerArr = {w03, w04};
                    BigInteger bigInteger14 = bigIntegerArr[i5];
                    BigInteger bigInteger15 = bigIntegerArr[1];
                    if (v0(bigInteger15, bigInteger15).equals(shiftLeft2)) {
                        if (bigInteger15.testBit(i5)) {
                            bigInteger15 = bigInteger2.subtract(bigInteger15);
                        }
                        return new ks(bigInteger2, bigInteger3, bigInteger15.shiftRight(1));
                    }
                    i = i5;
                    if (!bigInteger14.equals(bigInteger5)) {
                        if (!bigInteger14.equals(bigInteger)) {
                            return k20Var;
                        }
                        i3 = 1;
                        shiftRight = bigInteger8;
                        bigInteger6 = bigInteger12;
                        random = random2;
                        subtract = bigInteger;
                    } else {
                        i2 = i;
                        i3 = 1;
                        k20Var2 = k20Var;
                        shiftRight = bigInteger8;
                        bigInteger6 = bigInteger12;
                        random = random2;
                        subtract = bigInteger;
                    }
                } else {
                    k20Var = k20Var2;
                    i = i2;
                }
                i2 = i;
                k20Var2 = k20Var;
            }
        } else {
            f40.f("not done yet");
            return null;
        }
    }

    @Override // defpackage.k20
    public final k20 k0() {
        BigInteger bigInteger = this.I;
        return new ks(this.G, this.H, v0(bigInteger, bigInteger));
    }

    @Override // defpackage.k20
    public final k20 l0(k20 k20Var, k20 k20Var2) {
        BigInteger r0 = k20Var.r0();
        BigInteger r02 = k20Var2.r0();
        BigInteger bigInteger = this.I;
        return new ks(this.G, this.H, w0(bigInteger.multiply(bigInteger).add(r0.multiply(r02))));
    }

    @Override // defpackage.k20
    public final k20 n0(k20 k20Var) {
        BigInteger subtract = this.I.subtract(k20Var.r0());
        int signum = subtract.signum();
        BigInteger bigInteger = this.G;
        if (signum < 0) {
            subtract = subtract.add(bigInteger);
        }
        return new ks(bigInteger, this.H, subtract);
    }

    @Override // defpackage.k20
    public final k20 q(k20 k20Var) {
        return new ks(this.G, this.H, v0(this.I, u0(k20Var.r0())));
    }

    @Override // defpackage.k20
    public final BigInteger r0() {
        return this.I;
    }

    public final BigInteger u0(BigInteger bigInteger) {
        BigInteger mod;
        BigInteger bigInteger2 = kd.a;
        BigInteger bigInteger3 = this.G;
        int i = 0;
        if (bigInteger3.testBit(0)) {
            int i2 = 1;
            if (bigInteger3.signum() == 1) {
                if (bigInteger.signum() >= 0 && bigInteger.bitLength() <= bigInteger3.bitLength()) {
                    mod = bigInteger;
                } else {
                    mod = bigInteger.mod(bigInteger3);
                }
                int bitLength = bigInteger3.bitLength();
                int[] o = r21.o(bitLength, bigInteger3);
                int[] o2 = r21.o(bitLength, mod);
                int length = o.length;
                int[] iArr = new int[length];
                int length2 = o.length;
                int numberOfLeadingZeros = (length2 << 5) - Integer.numberOfLeadingZeros(o[length2 - 1]);
                int i3 = 30;
                int i4 = (numberOfLeadingZeros + 29) / 30;
                int[] iArr2 = new int[i4];
                int[] iArr3 = new int[i4];
                int[] iArr4 = new int[i4];
                int[] iArr5 = new int[i4];
                int[] iArr6 = new int[i4];
                iArr3[0] = 1;
                k20.r(numberOfLeadingZeros, o2, iArr5);
                k20.r(numberOfLeadingZeros, o, iArr6);
                System.arraycopy(iArr6, 0, iArr4, 0, i4);
                int i5 = iArr6[0];
                int i6 = (2 - (i5 * i5)) * i5;
                int i7 = (2 - (i5 * i6)) * i6;
                int i8 = (2 - (i5 * i7)) * i7;
                int i9 = (2 - (i5 * i8)) * i8;
                int i10 = (int) (((numberOfLeadingZeros * 150964) + 99243) >>> 16);
                int i11 = 0;
                int i12 = 0;
                while (i11 < i10) {
                    int i13 = iArr4[i];
                    int i14 = iArr5[i];
                    int i15 = i9;
                    int i16 = i;
                    int i17 = i10;
                    int i18 = i2;
                    int[] iArr7 = iArr;
                    int i19 = 1073741824;
                    int i20 = i16;
                    int i21 = i20;
                    int i22 = 1073741824;
                    while (i16 < i3) {
                        int i23 = i3;
                        int i24 = i12 >> 31;
                        int i25 = i16;
                        int i26 = -(i14 & 1);
                        int i27 = i14 - ((i13 ^ i24) & i26);
                        int i28 = i21 - ((i22 ^ i24) & i26);
                        int i29 = i19 - ((i20 ^ i24) & i26);
                        int i30 = i26 & (~i24);
                        i12 = (i12 ^ i30) + 1;
                        i13 += i27 & i30;
                        i22 += i28 & i30;
                        i20 += i30 & i29;
                        i14 = i27 >> 1;
                        i21 = i28 >> 1;
                        i19 = i29 >> 1;
                        i16 = i25 + 1;
                        i3 = i23;
                    }
                    int i31 = i3;
                    int[] iArr8 = {i22, i20, i21, i19};
                    int i32 = iArr8[i21];
                    int i33 = iArr8[i18];
                    int i34 = iArr8[2];
                    int i35 = iArr8[3];
                    int i36 = i4 - 1;
                    int i37 = iArr2[i36] >> 31;
                    int i38 = iArr3[i36] >> 31;
                    int i39 = (i32 & i37) + (i33 & i38);
                    int i40 = (i34 & i37) + (i35 & i38);
                    int i41 = iArr6[i21];
                    int i42 = iArr2[i21];
                    int i43 = numberOfLeadingZeros;
                    int[] iArr9 = iArr2;
                    int[] iArr10 = iArr3;
                    long j = i32;
                    long j2 = i42;
                    long j3 = j * j2;
                    long j4 = i33;
                    long j5 = iArr3[i21];
                    long j6 = (j4 * j5) + j3;
                    long j7 = i34;
                    long j8 = i35;
                    long j9 = (j8 * j5) + (j7 * j2);
                    int i44 = i39 - (((((int) j6) * i15) + i39) & 1073741823);
                    long j10 = i41;
                    long j11 = i44;
                    long j12 = i40 - (((((int) j9) * i15) + i40) & 1073741823);
                    long j13 = (j10 * j12) + j9;
                    long j14 = ((j10 * j11) + j6) >> i31;
                    long j15 = j13 >> i31;
                    int i45 = i18;
                    while (i45 < i4) {
                        int i46 = i45;
                        int i47 = iArr6[i46];
                        long j16 = j12;
                        long j17 = j;
                        long j18 = iArr9[i46];
                        long j19 = iArr10[i46];
                        long j20 = j4 * j19;
                        long j21 = i47;
                        long j22 = (j21 * j11) + j20 + (j17 * j18) + j14;
                        long j23 = (j21 * j16) + (j19 * j8) + (j18 * j7) + j15;
                        int i48 = i46 - 1;
                        iArr9[i48] = ((int) j22) & 1073741823;
                        j14 = j22 >> i31;
                        iArr10[i48] = ((int) j23) & 1073741823;
                        j15 = j23 >> i31;
                        i45 = i46 + 1;
                        j12 = j16;
                        j = j17;
                    }
                    iArr9[i36] = (int) j14;
                    iArr10[i36] = (int) j15;
                    int i49 = iArr8[i21];
                    int i50 = iArr8[i18];
                    int i51 = iArr8[2];
                    int i52 = iArr8[3];
                    long j24 = i49;
                    long j25 = iArr4[i21];
                    long j26 = i50;
                    long j27 = iArr5[i21];
                    long j28 = (j26 * j27) + (j24 * j25);
                    long j29 = i51;
                    long j30 = i52;
                    long j31 = j28 >> i31;
                    long j32 = ((j27 * j30) + (j25 * j29)) >> i31;
                    int i53 = i18;
                    while (i53 < i4) {
                        long j33 = j29;
                        long j34 = j30;
                        long j35 = iArr4[i53];
                        long j36 = iArr5[i53];
                        long j37 = (j26 * j36) + (j24 * j35) + j31;
                        long j38 = (j36 * j34) + (j35 * j33) + j32;
                        int i54 = i53 - 1;
                        iArr4[i54] = ((int) j37) & 1073741823;
                        j31 = j37 >> i31;
                        iArr5[i54] = ((int) j38) & 1073741823;
                        j32 = j38 >> i31;
                        i53++;
                        j29 = j33;
                        j30 = j34;
                    }
                    iArr4[i36] = (int) j31;
                    iArr5[i36] = (int) j32;
                    i11 += 30;
                    i9 = i15;
                    i = i21;
                    i2 = i18;
                    i10 = i17;
                    iArr = iArr7;
                    i3 = i31;
                    numberOfLeadingZeros = i43;
                    iArr2 = iArr9;
                    iArr3 = iArr10;
                }
                int i55 = i;
                int i56 = i2;
                int[] iArr11 = iArr;
                int i57 = numberOfLeadingZeros;
                int[] iArr12 = iArr2;
                int i58 = i4 - 1;
                int i59 = iArr4[i58] >> 31;
                int i60 = i55;
                int i61 = i60;
                while (i60 < i58) {
                    int i62 = ((iArr4[i60] ^ i59) - i59) + i61;
                    iArr4[i60] = i62 & 1073741823;
                    i61 = i62 >> 30;
                    i60++;
                }
                iArr4[i58] = ((iArr4[i58] ^ i59) - i59) + i61;
                int i63 = iArr12[i58] >> 31;
                int i64 = i55;
                int i65 = i64;
                while (i64 < i58) {
                    int i66 = (((iArr12[i64] + (iArr6[i64] & i63)) ^ i59) - i59) + i65;
                    iArr12[i64] = i66 & 1073741823;
                    i65 = i66 >> 30;
                    i64++;
                }
                int i67 = (((iArr12[i58] + (i63 & iArr6[i58])) ^ i59) - i59) + i65;
                iArr12[i58] = i67;
                int i68 = i67 >> 31;
                int i69 = i55;
                int i70 = i69;
                while (i69 < i58) {
                    int i71 = iArr12[i69] + (iArr6[i69] & i68) + i70;
                    iArr12[i69] = i71 & 1073741823;
                    i70 = i71 >> 30;
                    i69++;
                }
                iArr12[i58] = iArr12[i58] + (i68 & iArr6[i58]) + i70;
                long j39 = 0;
                int i72 = i55;
                int i73 = i72;
                int i74 = i73;
                int i75 = i57;
                while (i75 > 0) {
                    while (i72 < Math.min(32, i75)) {
                        j39 |= iArr12[i73] << i72;
                        i72 += 30;
                        i73++;
                    }
                    iArr11[i74] = (int) j39;
                    j39 >>>= 32;
                    i72 -= 32;
                    i75 -= 32;
                    i74++;
                }
                int i76 = i55;
                if ((k20.s(i4, i56, iArr4) & k20.s(i4, i76, iArr5)) != 0) {
                    byte[] bArr = new byte[length << 2];
                    while (i76 < length) {
                        int i77 = iArr11[i76];
                        if (i77 != 0) {
                            k20.H(bArr, i77, ((length - 1) - i76) << 2);
                        }
                        i76++;
                    }
                    return new BigInteger(1, bArr);
                }
                throw new ArithmeticException("BigInteger not invertible.");
            }
            throw new ArithmeticException("BigInteger: modulus not positive");
        }
        c.k("'M' must be odd");
        return null;
    }

    public final BigInteger v0(BigInteger bigInteger, BigInteger bigInteger2) {
        return w0(bigInteger.multiply(bigInteger2));
    }

    public final BigInteger w0(BigInteger bigInteger) {
        boolean z;
        BigInteger bigInteger2 = this.G;
        BigInteger bigInteger3 = this.H;
        if (bigInteger3 != null) {
            if (bigInteger.signum() < 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                bigInteger = bigInteger.abs();
            }
            int bitLength = bigInteger2.bitLength();
            boolean equals = bigInteger3.equals(fs.b);
            while (bigInteger.bitLength() > bitLength + 1) {
                BigInteger shiftRight = bigInteger.shiftRight(bitLength);
                BigInteger subtract = bigInteger.subtract(shiftRight.shiftLeft(bitLength));
                if (!equals) {
                    shiftRight = shiftRight.multiply(bigInteger3);
                }
                bigInteger = shiftRight.add(subtract);
            }
            while (bigInteger.compareTo(bigInteger2) >= 0) {
                bigInteger = bigInteger.subtract(bigInteger2);
            }
            if (z && bigInteger.signum() != 0) {
                return bigInteger2.subtract(bigInteger);
            }
            return bigInteger;
        }
        return bigInteger.mod(bigInteger2);
    }
}
