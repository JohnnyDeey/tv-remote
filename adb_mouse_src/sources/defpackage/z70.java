package defpackage;

/* loaded from: classes.dex */
public final class z70 extends bc {
    public final byte[] e;
    public final byte[] f;
    public final byte[] g;
    public final byte[] h;
    public final byte[] i;
    public final byte[] j;
    public final int k;

    public z70(y70 y70Var, byte[] bArr, b80 b80Var) {
        super((Object) y70Var, true);
        z70 z70Var;
        int i;
        int i2;
        int i3;
        rj rjVar = new rj(y70Var.b, 2);
        int i4 = rjVar.d;
        int i5 = rjVar.e;
        if (bArr.length == 64) {
            byte[] p = f20.p(bArr, 0, 32);
            byte[] p2 = f20.p(bArr, 32, bArr.length);
            s70 s70Var = (s70) rjVar.g;
            rj rjVar2 = (rj) s70Var.f;
            sd sdVar = new sd(rjVar2);
            sd sdVar2 = new sd(rjVar2);
            i = 2;
            sd sdVar3 = new sd(rjVar2);
            byte[] bArr2 = new byte[64];
            l3 l3Var = (l3) s70Var.g;
            int i6 = s70Var.b;
            int length = p.length;
            byte[] bArr3 = new byte[length + 1];
            System.arraycopy(p, 0, bArr3, 0, length);
            bArr3[length] = (byte) i6;
            hk0 hk0Var = (hk0) l3Var.d;
            ik0 ik0Var = (ik0) l3Var.g;
            hk0Var.update(bArr3, 0, bArr3.length);
            hk0Var.c(0, bArr2);
            byte[] bArr4 = new byte[32];
            byte[] bArr5 = new byte[32];
            System.arraycopy(bArr2, 0, bArr4, 0, 32);
            System.arraycopy(bArr2, 32, bArr5, 0, 32);
            sd[] sdVarArr = new sd[i6];
            for (int i7 = 0; i7 < i6; i7++) {
                sdVarArr[i7] = new sd(rjVar2);
            }
            int i8 = s70Var.e * 168;
            byte[] bArr6 = new byte[i8 + 2];
            int i9 = 0;
            while (i9 < i6) {
                int i10 = 0;
                while (i10 < i6) {
                    int i11 = i4;
                    int i12 = i9;
                    ik0Var.i(ik0Var.e);
                    byte[] bArr7 = new byte[34];
                    int i13 = i10;
                    System.arraycopy(bArr4, 0, bArr7, 0, 32);
                    bArr7[32] = (byte) i10;
                    bArr7[33] = (byte) i9;
                    ik0Var.update(bArr7, 0, 34);
                    ik0Var.l(bArr6, 0, i8);
                    int k = s70.k(((c0[]) sdVarArr[i12].d)[i13], 0, 256, bArr6, i8);
                    int i14 = i8;
                    for (int i15 = 256; k < i15; i15 = 256) {
                        int i16 = i14 % 3;
                        int i17 = i14;
                        for (int i18 = 0; i18 < i16; i18++) {
                            bArr6[i18] = bArr6[(i17 - i16) + i18];
                        }
                        ik0Var.l(bArr6, i16, 336);
                        i14 = i16 + 168;
                        k += s70.k(((c0[]) sdVarArr[i12].d)[i13], k, 256 - k, bArr6, i14);
                        i8 = i8;
                    }
                    i10 = i13 + 1;
                    i4 = i11;
                    i9 = i12;
                }
                i9++;
            }
            int i19 = i4;
            byte b = 0;
            for (int i20 = 0; i20 < i6; i20++) {
                ((c0[]) sdVar.d)[i20].h(bArr5, b);
                b = (byte) (b + 1);
            }
            for (int i21 = 0; i21 < i6; i21++) {
                ((c0[]) sdVar3.d)[i21].h(bArr5, b);
                b = (byte) (b + 1);
            }
            sdVar.b();
            sdVar3.b();
            int i22 = 0;
            while (i22 < i6) {
                c0 c0Var = ((c0[]) sdVar2.d)[i22];
                sd sdVar4 = sdVarArr[i22];
                c0 c0Var2 = new c0(rjVar2);
                c0.f(c0Var, ((c0[]) sdVar4.d)[0], ((c0[]) sdVar.d)[0]);
                for (int i23 = 1; i23 < rjVar2.a; i23++) {
                    c0.f(c0Var2, ((c0[]) sdVar4.d)[i23], ((c0[]) sdVar.d)[i23]);
                    int i24 = 0;
                    while (i24 < 256) {
                        short[] sArr = (short[]) c0Var.e;
                        sArr[i24] = (short) (sArr[i24] + ((short[]) c0Var2.e)[i24]);
                        i24++;
                        i22 = i22;
                    }
                    c0Var.getClass();
                }
                int i25 = i22;
                c0Var.p();
                c0 c0Var3 = ((c0[]) sdVar2.d)[i25];
                for (int i26 = 0; i26 < 256; i26++) {
                    ((short[]) c0Var3.e)[i26] = gi0.i(((short[]) c0Var3.e)[i26] * 1353);
                }
                c0Var3.getClass();
                i22 = i25 + 1;
            }
            for (int i27 = 0; i27 < sdVar2.b; i27++) {
                c0 c0Var4 = ((c0[]) sdVar2.d)[i27];
                c0 c0Var5 = ((c0[]) sdVar3.d)[i27];
                for (int i28 = 0; i28 < 256; i28++) {
                    short[] sArr2 = (short[]) c0Var4.e;
                    sArr2[i28] = (short) (sArr2[i28] + ((short[]) c0Var5.e)[i28]);
                }
                c0Var4.getClass();
            }
            for (int i29 = 0; i29 < sdVar2.b; i29++) {
                ((c0[]) sdVar2.d)[i29].p();
            }
            byte[] bArr8 = new byte[s70Var.c];
            byte[] c = sdVar2.c();
            int i30 = s70Var.d;
            System.arraycopy(c, 0, bArr8, 0, i30);
            System.arraycopy(bArr4, 0, bArr8, i30, 32);
            byte[][] bArr9 = {bArr8, sdVar.c()};
            byte[] bArr10 = new byte[i5];
            System.arraycopy(bArr9[1], 0, bArr10, 0, i5);
            byte[] bArr11 = new byte[32];
            l3 l3Var2 = (l3) rjVar.h;
            byte[] bArr12 = bArr9[0];
            hk0 hk0Var2 = (hk0) l3Var2.e;
            hk0Var2.update(bArr12, 0, bArr12.length);
            hk0Var2.c(0, bArr11);
            byte[] bArr13 = new byte[i19];
            System.arraycopy(bArr9[0], 0, bArr13, 0, i19);
            int i31 = i19 - 32;
            byte[][] bArr14 = {f20.p(bArr13, 0, i31), f20.p(bArr13, i31, i19), bArr10, bArr11, p2, f20.h(p, p2)};
            z70Var = this;
            z70Var.e = bArr14[2];
            z70Var.f = bArr14[3];
            z70Var.g = bArr14[4];
            i2 = 0;
            z70Var.h = bArr14[0];
            z70Var.i = bArr14[1];
            z70Var.j = bArr14[5];
        } else {
            z70Var = this;
            i = 2;
            i2 = 0;
            z70Var.e = f20.p(bArr, 0, i5);
            z70Var.h = f20.p(bArr, i5, (i5 + i4) - 32);
            int i32 = (i4 - 32) + i5;
            int i33 = i32 + 32;
            z70Var.i = f20.p(bArr, i32, i33);
            int i34 = i32 + 64;
            z70Var.f = f20.p(bArr, i33, i34);
            z70Var.g = f20.p(bArr, i34, i32 + 96);
            z70Var.j = null;
        }
        if (b80Var != null && (!f20.l(z70Var.h, b80Var.e) || !f20.l(z70Var.i, b80Var.f))) {
            c.k("passed in public key does not match private values");
            throw null;
        }
        if (z70Var.j == null) {
            i3 = i;
        } else {
            i3 = i2;
        }
        z70Var.k = i3;
    }

    public final byte[] getEncoded() {
        return f20.j(new byte[][]{this.e, this.h, this.i, this.f, this.g});
    }
}
