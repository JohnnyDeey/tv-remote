package defpackage;

/* loaded from: classes.dex */
public final class ds0 implements is0 {
    public final sb0 c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final es0 h;
    public final es0 i;
    public final byte[] j;
    public final byte[] k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final int o;

    /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ds0(defpackage.sb0 r8, defpackage.es0 r9, defpackage.es0 r10, int r11, int r12, int r13) {
        /*
            r7 = this;
            r7.<init>()
            im0 r0 = r8.p()
            xf0 r1 = r0.H
            xf0 r2 = defpackage.xf0.f
            xf0 r3 = r1.d()
            boolean r2 = r2.i(r3)
            r3 = 80
            r4 = 0
            if (r2 == 0) goto La1
            xf0 r2 = defpackage.xf0.g
            xf0 r1 = r1.d()
            boolean r1 = r2.i(r1)
            r7.n = r1
            r2 = 2
            r5 = 1
            if (r13 == r5) goto L36
            if (r13 == r2) goto L34
            r6 = 3
            if (r13 != r6) goto L2e
            goto L36
        L2e:
            us0 r7 = new us0
            r7.<init>(r3, r4, r4)
            throw r7
        L34:
            r13 = r2
            goto L3a
        L36:
            if (r1 == 0) goto L39
            goto L34
        L39:
            r13 = r5
        L3a:
            r7.o = r13
            r7.l = r1
            r7.m = r1
            r6 = 0
            if (r13 == r5) goto L52
            if (r13 != r2) goto L4c
            r13 = 12
            r7.f = r13
            r7.g = r6
            goto L59
        L4c:
            us0 r7 = new us0
            r7.<init>(r3, r4, r4)
            throw r7
        L52:
            r13 = 4
            r7.f = r13
            r13 = 8
            r7.g = r13
        L59:
            r7.c = r8
            r7.d = r11
            r7.e = r12
            r7.h = r10
            r7.i = r9
            int r12 = r7.f
            byte[] r13 = new byte[r12]
            r7.j = r13
            byte[] r12 = new byte[r12]
            r7.k = r12
            r8.q()
            if (r1 == 0) goto L79
            r7.d(r0, r10, r13, r5)
            r7.d(r0, r9, r12, r6)
            return
        L79:
            int r0 = r11 * 2
            int r1 = r7.f
            int r1 = r1 * r2
            int r1 = r1 + r0
            byte[] r8 = defpackage.mi0.c(r8, r1)
            r9.a(r8, r6, r11)
            r10.a(r8, r11, r11)
            int r11 = r11 + r11
            int r9 = r7.f
            java.lang.System.arraycopy(r8, r11, r12, r6, r9)
            int r9 = r7.f
            int r11 = r11 + r9
            java.lang.System.arraycopy(r8, r11, r13, r6, r9)
            int r7 = r7.f
            int r11 = r11 + r7
            if (r1 != r11) goto L9b
            return
        L9b:
            us0 r7 = new us0
            r7.<init>(r3, r4, r4)
            throw r7
        La1:
            us0 r7 = new us0
            r7.<init>(r3, r4, r4)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ds0.<init>(sb0, es0, es0, int, int, int):void");
    }

    public final byte[] a(long j, short s, xf0 xf0Var, int i, int i2) {
        if (this.n) {
            byte[] bArr = new byte[5];
            bArr[0] = (byte) s;
            ht0.d0(xf0Var, bArr, 1);
            ht0.a0(bArr, i, 3);
            return bArr;
        }
        byte[] bArr2 = new byte[13];
        ht0.c0(0, j, bArr2);
        bArr2[8] = (byte) s;
        ht0.d0(xf0Var, bArr2, 9);
        ht0.a0(bArr2, i2, 11);
        return bArr2;
    }

    @Override // defpackage.is0
    public final int b(int i) {
        return i + (this.l ? 1 : 0) + this.e + this.g;
    }

    @Override // defpackage.is0
    public final ps0 c(long j, short s, xf0 xf0Var, byte[] bArr, int i) {
        long j2;
        short s2;
        int i2;
        byte b;
        int i3 = this.e;
        int i4 = this.g;
        boolean z = this.l;
        if (((i - i3) - i4) - (z ? 1 : 0) >= 0) {
            byte[] bArr2 = this.j;
            int length = bArr2.length + i4;
            byte[] bArr3 = new byte[length];
            int i5 = this.o;
            if (i5 != 1) {
                if (i5 == 2) {
                    j2 = j;
                    ht0.c0(length - 8, j2, bArr3);
                    for (int i6 = 0; i6 < bArr2.length; i6++) {
                        bArr3[i6] = (byte) (bArr3[i6] ^ bArr2[i6]);
                    }
                } else {
                    throw new us0((short) 80, null, null);
                }
            } else {
                j2 = j;
                System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
                System.arraycopy(bArr, 5, bArr3, length - i4, i4);
            }
            es0 es0Var = this.h;
            es0Var.b(i3, bArr3);
            int i7 = 5 + i4;
            int i8 = i - i4;
            int c = es0Var.c(i8);
            try {
                if (this.h.d(i7, i8, i7, a(j2, s, xf0Var, i, c), bArr, bArr) == c) {
                    if (z) {
                        i2 = c;
                        do {
                            i2--;
                            if (i2 >= 0) {
                                b = bArr[i7 + i2];
                            } else {
                                throw new us0((short) 10, null, null);
                            }
                        } while (b == 0);
                        s2 = (short) (b & 255);
                    } else {
                        s2 = s;
                        i2 = c;
                    }
                    return new ps0(i7, i2, s2, bArr);
                }
                throw new us0((short) 80, null, null);
            } catch (RuntimeException e) {
                f40.a(20, e, null);
                return null;
            }
        }
        throw new us0((short) 50, null, null);
    }

    public final void d(im0 im0Var, es0 es0Var, byte[] bArr, boolean z) {
        i30 i30Var;
        if (this.n) {
            if (z) {
                i30Var = im0Var.q;
            } else {
                i30Var = im0Var.p;
            }
            if (i30Var != null) {
                int i = im0Var.g;
                byte[] bArr2 = ht0.e;
                int i2 = this.d;
                byte[] e = r21.A(i, i2, i30Var, "key", bArr2).e();
                int i3 = this.f;
                byte[] e2 = r21.A(i, i3, i30Var, "iv", bArr2).e();
                es0Var.a(e, 0, i2);
                System.arraycopy(e2, 0, bArr, 0, i3);
                return;
            }
            throw new us0((short) 80, null, null);
        }
        throw new us0((short) 80, null, null);
    }

    @Override // defpackage.is0
    public final boolean e() {
        return this.l;
    }

    @Override // defpackage.is0
    public final ss0 i(long j, short s, xf0 xf0Var, byte[] bArr, int i, int i2) {
        short s2;
        byte[] bArr2 = this.k;
        int length = bArr2.length;
        int i3 = this.g;
        int i4 = length + i3;
        byte[] bArr3 = new byte[i4];
        int i5 = this.o;
        if (i5 != 1) {
            if (i5 == 2) {
                ht0.c0(i4 - 8, j, bArr3);
                for (int i6 = 0; i6 < bArr2.length; i6++) {
                    bArr3[i6] = (byte) (bArr3[i6] ^ bArr2[i6]);
                }
            } else {
                throw new us0((short) 80, null, null);
            }
        } else {
            System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
            ht0.c0(bArr2.length, j, bArr3);
        }
        boolean z = this.m;
        int i7 = i2 + (z ? 1 : 0);
        int i8 = this.e;
        es0 es0Var = this.i;
        es0Var.b(i8, bArr3);
        int c = es0Var.c(i7) + i3;
        int i9 = 5;
        int i10 = 5 + c;
        byte[] bArr4 = new byte[i10];
        if (i3 != 0) {
            System.arraycopy(bArr3, i4 - i3, bArr4, 5, i3);
            i9 = 5 + i3;
        }
        if (z) {
            if (this.n) {
                s2 = 23;
            } else {
                s2 = 25;
            }
        } else {
            s2 = s;
        }
        byte[] a = a(j, s2, xf0Var, c, i7);
        try {
            System.arraycopy(bArr, i, bArr4, i9, i2);
            if (z) {
                bArr4[i9 + i2] = (byte) s;
            }
            if (i9 + this.i.d(i9, i7, i9, a, bArr4, bArr4) == i10) {
                return new ss0(bArr4, i10, s2);
            }
            throw new us0((short) 80, null, null);
        } catch (RuntimeException e) {
            f40.a(80, e, null);
            return null;
        }
    }

    @Override // defpackage.is0
    public final void j() {
        sb0 sb0Var = this.c;
        im0 b = ((js0) sb0Var.c).b();
        sb0Var.q();
        d(b, this.i, this.k, false);
    }

    @Override // defpackage.is0
    public final void k() {
        sb0 sb0Var = this.c;
        im0 b = ((js0) sb0Var.c).b();
        sb0Var.q();
        d(b, this.h, this.j, true);
    }
}
