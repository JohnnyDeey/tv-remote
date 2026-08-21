package defpackage;

/* loaded from: classes.dex */
public final class gs0 implements is0 {
    public final sb0 c;
    public final byte[] d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final hs0 h;
    public final hs0 i;
    public final gt0 j;
    public final gt0 k;
    public final boolean l;
    public final boolean m;

    public gs0(sb0 sb0Var, hs0 hs0Var, hs0 hs0Var2, ws0 ws0Var, ws0 ws0Var2, int i) {
        im0 p = sb0Var.p();
        xf0 xf0Var = p.H;
        if (!xf0.g.i(xf0Var.d())) {
            this.l = !true;
            this.m = !true;
            this.c = sb0Var;
            i81 i81Var = ((js0) sb0Var.c).b;
            i81Var.getClass();
            byte[] bArr = new byte[256];
            ((qk0) i81Var.d).nextBytes(bArr);
            this.d = bArr;
            this.e = p.x;
            boolean i2 = xf0.e.i(xf0Var.d());
            this.f = i2;
            this.g = !xf0Var.k();
            this.i = hs0Var;
            this.h = hs0Var2;
            sb0Var.q();
            int d = ws0Var2.d() + ws0Var.d() + (i * 2);
            if (!i2) {
                d += hs0Var2.c() + hs0Var.c();
            }
            byte[] c = mi0.c(sb0Var, d);
            ws0Var.a(c, 0, ws0Var.d());
            int d2 = ws0Var.d();
            ws0Var2.a(c, d2, ws0Var2.d());
            int d3 = ws0Var2.d() + d2;
            hs0Var.a(c, d3, i);
            int i3 = d3 + i;
            hs0Var2.a(c, i3, i);
            int i4 = i3 + i;
            int c2 = hs0Var.c();
            int c3 = hs0Var2.c();
            if (i2) {
                hs0Var.b(new byte[c2], 0, c2);
                hs0Var2.b(new byte[c3], 0, c3);
            } else {
                hs0Var.b(c, i4, c2);
                int i5 = i4 + c2;
                hs0Var2.b(c, i5, c3);
                i4 = i5 + c3;
            }
            if (i4 == d) {
                sb0Var.q();
                this.k = new gt0(sb0Var, ws0Var);
                this.j = new gt0(sb0Var, ws0Var2);
                return;
            }
            throw new us0((short) 80, null, null);
        }
        throw new us0((short) 80, null, null);
    }

    @Override // defpackage.is0
    public final int b(int i) {
        int c = this.h.c();
        int i2 = this.j.e;
        int i3 = i + (this.l ? 1 : 0);
        if (this.f) {
            i3 += c;
        }
        int i4 = i3 + 256;
        if (this.e) {
            return (i4 - (i4 % c)) + i2;
        }
        int i5 = i4 + i2;
        return i5 - (i5 % c);
    }

    @Override // defpackage.is0
    public final ps0 c(long j, short s, xf0 xf0Var, byte[] bArr, int i) {
        int max;
        int i2;
        byte[] bArr2;
        int i3;
        int i4;
        boolean z;
        int i5;
        int i6;
        int i7;
        byte b;
        int i8;
        byte[] bArr3;
        boolean z2;
        short s2;
        byte b2;
        int i9;
        hs0 hs0Var = this.h;
        int c = hs0Var.c();
        gt0 gt0Var = this.j;
        int i10 = gt0Var.e;
        int i11 = gt0Var.c;
        boolean z3 = this.e;
        if (z3) {
            max = c + i10;
        } else {
            max = Math.max(c, i10 + 1);
        }
        boolean z4 = this.f;
        if (z4) {
            max += c;
        }
        if (i >= max) {
            if (z3) {
                i2 = i - i10;
            } else {
                i2 = i;
            }
            if (i2 % c == 0) {
                int i12 = 5;
                if (z3) {
                    bArr2 = bArr;
                    i3 = i2;
                    i4 = c;
                    z = z3;
                    if (!ht0.j(i10, (5 + i) - i10, this.j.a(j, s, bArr2, 5, i - i10), bArr2)) {
                        throw new us0((short) 20, null, null);
                    }
                } else {
                    bArr2 = bArr;
                    i3 = i2;
                    i4 = c;
                    z = z3;
                }
                hs0Var.d(i3, bArr2, bArr2);
                if (z4) {
                    i12 = 5 + i4;
                    i5 = i3 - i4;
                } else {
                    i5 = i3;
                }
                if (z) {
                    i6 = 0;
                } else {
                    i6 = i10;
                }
                int i13 = i12 + i5;
                byte b3 = bArr2[i13 - 1];
                int i14 = (b3 & 255) + 1;
                if (this.g) {
                    i7 = 256;
                } else {
                    i7 = i4;
                }
                if (i14 > Math.min(i7, i5 - i6)) {
                    i8 = 0;
                    i14 = 0;
                    b = 0;
                } else {
                    int i15 = i13 - i14;
                    b = 0;
                    while (true) {
                        int i16 = i15 + 1;
                        b = (byte) ((bArr2[i15] ^ b3) | b);
                        if (i16 >= i13) {
                            break;
                        }
                        i15 = i16;
                        gt0Var = gt0Var;
                    }
                    i8 = i14;
                    if (b != 0) {
                        i14 = 0;
                    }
                }
                while (true) {
                    bArr3 = this.d;
                    if (i8 >= 256) {
                        break;
                    }
                    b = (byte) ((bArr3[i8] ^ b3) | b);
                    i8++;
                }
                bArr3[0] = (byte) (bArr3[0] ^ b);
                if (i14 == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                int i17 = i5 - i14;
                if (!z) {
                    int i18 = i17 - i10;
                    int i19 = i5 - i10;
                    ws0 ws0Var = gt0Var.b;
                    gt0 gt0Var2 = gt0Var;
                    byte[] a = gt0Var2.a(j, s, bArr2, i12, i18);
                    if (((js0) gt0Var2.a.c).a().H.k()) {
                        i9 = 11;
                    } else {
                        i9 = 13;
                    }
                    int i20 = gt0Var2.d;
                    int i21 = (((i19 + i9) + i20) / i11) - (((i9 + i18) + i20) / i11);
                    while (true) {
                        i21--;
                        if (i21 < 0) {
                            break;
                        }
                        ws0Var.update(bArr3, 0, i11);
                    }
                    ws0Var.update(bArr3, 0, 1);
                    ws0Var.reset();
                    z2 |= !ht0.j(i10, i12 + i18, a, bArr2);
                    i17 = i18;
                }
                if (!z2) {
                    if (!this.l) {
                        s2 = s;
                        return new ps0(i12, i17, s2, bArr2);
                    }
                    do {
                        i17--;
                        if (i17 >= 0) {
                            b2 = bArr2[i12 + i17];
                        } else {
                            throw new us0((short) 10, null, null);
                        }
                    } while (b2 == 0);
                    s2 = (short) (b2 & 255);
                    return new ps0(i12, i17, s2, bArr2);
                }
                throw new us0((short) 20, null, null);
            }
            throw new us0((short) 21, null, null);
        }
        throw new us0((short) 50, null, null);
    }

    @Override // defpackage.is0
    public final boolean e() {
        return this.l;
    }

    @Override // defpackage.is0
    public final ss0 i(long j, short s, xf0 xf0Var, byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        byte[] bArr2;
        int i5;
        short s2;
        int i6;
        hs0 hs0Var = this.i;
        int c = hs0Var.c();
        int i7 = this.k.e;
        boolean z = this.m;
        int i8 = i2 + (z ? 1 : 0);
        boolean z2 = this.e;
        if (!z2) {
            i3 = i8 + i7;
        } else {
            i3 = i8;
        }
        int i9 = c - (i3 % c);
        int i10 = i7 + i8 + i9;
        boolean z3 = this.f;
        if (z3) {
            i10 += c;
        }
        int i11 = i10 + 5;
        byte[] bArr3 = new byte[i11];
        if (z3) {
            i81 i81Var = ((js0) this.c.c).b;
            i81Var.getClass();
            byte[] bArr4 = new byte[c];
            ((qk0) i81Var.d).nextBytes(bArr4);
            System.arraycopy(bArr4, 0, bArr3, 5, c);
            i4 = c + 5;
            i5 = i;
            bArr2 = bArr;
        } else {
            i4 = 5;
            bArr2 = bArr;
            i5 = i;
        }
        System.arraycopy(bArr2, i5, bArr3, i4, i2);
        int i12 = i2 + i4;
        if (z) {
            bArr3[i12] = (byte) s;
            s2 = 25;
            i12++;
        } else {
            s2 = s;
        }
        if (!z2) {
            i6 = 0;
            byte[] a = this.k.a(j, s2, bArr3, i4, i8);
            System.arraycopy(a, 0, bArr3, i12, a.length);
            i12 += a.length;
        } else {
            i6 = 0;
        }
        byte b = (byte) (i9 - 1);
        int i13 = i6;
        while (i13 < i9) {
            bArr3[i12] = b;
            i13++;
            i12++;
        }
        int i14 = i12 - 5;
        hs0Var.d(i14, bArr3, bArr3);
        if (z2) {
            byte[] a2 = this.k.a(j, s2, bArr3, 5, i14);
            System.arraycopy(a2, i6, bArr3, i12, a2.length);
            i12 += a2.length;
        }
        if (i12 == i11) {
            return new ss0(bArr3, i11, s2);
        }
        throw new us0((short) 80, null, null);
    }

    @Override // defpackage.is0
    public final void j() {
        throw new us0((short) 80, null, null);
    }

    @Override // defpackage.is0
    public final void k() {
        throw new us0((short) 80, null, null);
    }
}
