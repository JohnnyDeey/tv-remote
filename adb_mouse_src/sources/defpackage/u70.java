package defpackage;

/* loaded from: classes.dex */
public final class u70 extends bc {
    public final byte[] e;
    public final byte[] f;
    public final byte[] g;
    public final byte[] h;
    public final byte[] i;
    public final byte[] j;
    public final byte[] k;
    public final byte[] l;
    public final int m;

    public u70(t70 t70Var, byte[] bArr, v70 v70Var) {
        super((Object) t70Var, true);
        u70 u70Var;
        b8[] b8VarArr;
        b8[] b8VarArr2;
        int i;
        Throwable th;
        b8[] b8VarArr3;
        b8[] b8VarArr4;
        rj rjVar = new rj(t70Var.a, 1);
        int i2 = rjVar.c;
        int i3 = rjVar.a;
        int i4 = rjVar.b;
        if (bArr.length == 32) {
            byte[] bArr2 = new byte[128];
            byte[] bArr3 = new byte[64];
            byte[] bArr4 = new byte[32];
            byte[] bArr5 = new byte[64];
            byte[] bArr6 = new byte[32];
            sb0 sb0Var = new sb0(rjVar);
            de0 de0Var = new de0(rjVar, 1);
            de0 de0Var2 = new de0(rjVar, 0);
            de0 de0Var3 = new de0(rjVar, 0);
            de0 de0Var4 = new de0(rjVar, 0);
            ik0 ik0Var = (ik0) rjVar.g;
            ik0Var.update(bArr, 0, 32);
            ik0Var.d((byte) i4);
            ik0Var.d((byte) i2);
            ik0Var.k(bArr2, 0, 128);
            System.arraycopy(bArr2, 0, bArr4, 0, 32);
            System.arraycopy(bArr2, 32, bArr5, 0, 64);
            System.arraycopy(bArr2, 96, bArr6, 0, 32);
            sb0Var.o(bArr4);
            int i5 = 0;
            short s = 0;
            while (true) {
                b8VarArr3 = de0Var.b;
                if (i5 >= b8VarArr3.length) {
                    break;
                }
                b8VarArr3[i5].V(s, bArr5);
                i5++;
                s = (short) (s + 1);
            }
            short s2 = (short) i2;
            int i6 = 0;
            while (true) {
                b8VarArr4 = de0Var2.b;
                if (i6 >= b8VarArr4.length) {
                    break;
                }
                b8VarArr4[i6].V(s2, bArr5);
                i6++;
                s2 = (short) (s2 + 1);
            }
            de0 de0Var5 = new de0(rjVar, 1);
            for (int i7 = 0; i7 < b8VarArr3.length; i7++) {
                System.arraycopy((int[]) b8VarArr3[i7].d, 0, (int[]) de0Var5.b[i7].d, 0, 256);
            }
            de0Var5.c();
            sb0Var.r(de0Var3, de0Var5);
            de0Var3.e();
            de0Var3.b();
            int i8 = 0;
            while (true) {
                b8[] b8VarArr5 = de0Var3.b;
                if (i8 >= b8VarArr5.length) {
                    break;
                }
                b8 b8Var = b8VarArr5[i8];
                b8 b8Var2 = b8VarArr4[i8];
                int i9 = 0;
                while (i9 < 256) {
                    int[] iArr = (int[]) b8Var.d;
                    iArr[i9] = iArr[i9] + ((int[]) b8Var2.d)[i9];
                    i9++;
                    i8 = i8;
                }
                b8Var.getClass();
                i8++;
            }
            de0Var3.a();
            de0Var3.d(de0Var4);
            byte[] P = wv0.P(de0Var3, rjVar);
            ik0Var.update(bArr4, 0, 32);
            ik0Var.update(P, 0, P.length);
            ik0Var.k(bArr3, 0, 64);
            byte[][] bArr7 = new byte[6];
            bArr7[0] = bArr4;
            bArr7[1] = bArr6;
            bArr7[2] = bArr3;
            bArr7[3] = new byte[i2 * i3];
            for (int i10 = 0; i10 < i2; i10++) {
                b8VarArr3[i10].K(i10 * i3, bArr7[3]);
            }
            bArr7[4] = new byte[i4 * i3];
            for (int i11 = 0; i11 < i4; i11++) {
                b8VarArr4[i11].K(i11 * i3, bArr7[4]);
            }
            bArr7[5] = new byte[i4 * 416];
            int i12 = 0;
            while (i12 < i4) {
                b8 b8Var3 = de0Var4.b[i12];
                byte[] bArr8 = bArr7[5];
                int i13 = i12 * 416;
                int i14 = 0;
                while (i14 < 32) {
                    int i15 = i14 * 8;
                    int[] iArr2 = (int[]) b8Var3.d;
                    int i16 = i12;
                    int[] iArr3 = {4096 - iArr2[i15], 4096 - iArr2[i15 + 1], 4096 - iArr2[i15 + 2], 4096 - iArr2[i15 + 3], 4096 - iArr2[i15 + 4], 4096 - iArr2[i15 + 5], 4096 - iArr2[i15 + 6], 4096 - iArr2[i15 + 7]};
                    int i17 = (i14 * 13) + i13;
                    int i18 = iArr3[0];
                    bArr8[i17] = (byte) i18;
                    int i19 = i17 + 1;
                    byte b = (byte) (i18 >> 8);
                    bArr8[i19] = b;
                    int i20 = iArr3[1];
                    bArr8[i19] = (byte) (b | ((byte) (i20 << 5)));
                    bArr8[i17 + 2] = (byte) (i20 >> 3);
                    int i21 = i17 + 3;
                    byte b2 = (byte) (i20 >> 11);
                    bArr8[i21] = b2;
                    int i22 = iArr3[2];
                    bArr8[i21] = (byte) (b2 | ((byte) (i22 << 2)));
                    int i23 = i17 + 4;
                    byte b3 = (byte) (i22 >> 6);
                    bArr8[i23] = b3;
                    int i24 = iArr3[3];
                    bArr8[i23] = (byte) (b3 | ((byte) (i24 << 7)));
                    bArr8[i17 + 5] = (byte) (i24 >> 1);
                    int i25 = i17 + 6;
                    byte b4 = (byte) (i24 >> 9);
                    bArr8[i25] = b4;
                    int i26 = iArr3[4];
                    bArr8[i25] = (byte) (b4 | ((byte) (i26 << 4)));
                    bArr8[i17 + 7] = (byte) (i26 >> 4);
                    int i27 = i17 + 8;
                    byte b5 = (byte) (i26 >> 12);
                    bArr8[i27] = b5;
                    int i28 = iArr3[5];
                    bArr8[i27] = (byte) (b5 | ((byte) (i28 << 1)));
                    int i29 = i17 + 9;
                    byte b6 = (byte) (i28 >> 7);
                    bArr8[i29] = b6;
                    int i30 = iArr3[6];
                    bArr8[i29] = (byte) (b6 | ((byte) (i30 << 6)));
                    bArr8[i17 + 10] = (byte) (i30 >> 2);
                    int i31 = i17 + 11;
                    byte b7 = (byte) (i30 >> 10);
                    bArr8[i31] = b7;
                    int i32 = iArr3[7];
                    bArr8[i31] = (byte) (b7 | ((byte) (i32 << 3)));
                    bArr8[i17 + 12] = (byte) (i32 >> 5);
                    i14++;
                    i12 = i16;
                }
                b8Var3.getClass();
                i12++;
            }
            byte[][] bArr9 = {bArr7[0], bArr7[1], bArr7[2], bArr7[3], bArr7[4], bArr7[5], P, bArr};
            u70Var = this;
            u70Var.e = bArr9[0];
            u70Var.f = bArr9[1];
            u70Var.g = bArr9[2];
            u70Var.h = bArr9[3];
            u70Var.i = bArr9[4];
            u70Var.j = bArr9[5];
            u70Var.k = bArr9[6];
            u70Var.l = bArr9[7];
            th = null;
            i = 0;
        } else {
            u70Var = this;
            byte[] p = f20.p(bArr, 0, 32);
            u70Var.e = p;
            u70Var.f = f20.p(bArr, 32, 64);
            u70Var.g = f20.p(bArr, 64, 128);
            int i33 = (i2 * i3) + 128;
            byte[] p2 = f20.p(bArr, 128, i33);
            u70Var.h = p2;
            int i34 = (i4 * i3) + i33;
            byte[] p3 = f20.p(bArr, i33, i34);
            u70Var.i = p3;
            byte[] p4 = f20.p(bArr, i34, (i4 * 416) + i34);
            u70Var.j = p4;
            sb0 sb0Var2 = new sb0(rjVar);
            de0 de0Var6 = new de0(rjVar, 1);
            de0 de0Var7 = new de0(rjVar, 0);
            de0 de0Var8 = new de0(rjVar, 0);
            de0 de0Var9 = new de0(rjVar, 0);
            int i35 = 0;
            while (true) {
                b8VarArr = de0Var6.b;
                if (i35 >= i2) {
                    break;
                }
                b8VarArr[i35].L(i35 * i3, p2);
                i35++;
            }
            int i36 = 0;
            while (true) {
                b8VarArr2 = de0Var7.b;
                if (i36 >= i4) {
                    break;
                }
                b8VarArr2[i36].L(i36 * i3, p3);
                i36++;
            }
            for (int i37 = 0; i37 < i4; i37++) {
                b8 b8Var4 = de0Var9.b[i37];
                int i38 = i37 * 416;
                b8Var4.getClass();
                int i39 = 0;
                while (i39 < 32) {
                    int i40 = (i39 * 13) + i38;
                    int i41 = i39 * 8;
                    int i42 = p4[i40] & 255;
                    b8[] b8VarArr6 = b8VarArr2;
                    int i43 = p4[i40 + 1] & 255;
                    int i44 = (i42 | (i43 << 8)) & 8191;
                    int[] iArr4 = (int[]) b8Var4.d;
                    iArr4[i41] = i44;
                    int i45 = i41 + 1;
                    int i46 = (i43 >> 5) | ((p4[i40 + 2] & 255) << 3);
                    int i47 = p4[i40 + 3] & 255;
                    iArr4[i45] = (i46 | (i47 << 11)) & 8191;
                    int i48 = i41 + 2;
                    int i49 = i47 >> 2;
                    int i50 = p4[i40 + 4] & 255;
                    iArr4[i48] = (i49 | (i50 << 6)) & 8191;
                    int i51 = i41 + 3;
                    int i52 = (i50 >> 7) | ((p4[i40 + 5] & 255) << 1);
                    int i53 = p4[i40 + 6] & 255;
                    iArr4[i51] = (i52 | (i53 << 9)) & 8191;
                    int i54 = i41 + 4;
                    int i55 = (i53 >> 4) | ((p4[i40 + 7] & 255) << 4);
                    int i56 = p4[i40 + 8] & 255;
                    iArr4[i54] = (i55 | (i56 << 12)) & 8191;
                    int i57 = i41 + 5;
                    int i58 = i56 >> 1;
                    int i59 = p4[i40 + 9] & 255;
                    iArr4[i57] = (i58 | (i59 << 7)) & 8191;
                    int i60 = i41 + 6;
                    int i61 = (i59 >> 6) | ((p4[i40 + 10] & 255) << 2);
                    int i62 = p4[i40 + 11] & 255;
                    iArr4[i60] = (i61 | (i62 << 10)) & 8191;
                    int i63 = i41 + 7;
                    iArr4[i63] = ((i62 >> 3) | ((p4[i40 + 12] & 255) << 5)) & 8191;
                    iArr4[i41] = 4096 - iArr4[i41];
                    iArr4[i45] = 4096 - iArr4[i45];
                    iArr4[i48] = 4096 - iArr4[i48];
                    iArr4[i51] = 4096 - iArr4[i51];
                    iArr4[i54] = 4096 - iArr4[i54];
                    iArr4[i57] = 4096 - iArr4[i57];
                    iArr4[i60] = 4096 - iArr4[i60];
                    iArr4[i63] = 4096 - iArr4[i63];
                    i39++;
                    b8VarArr2 = b8VarArr6;
                }
            }
            b8[] b8VarArr7 = b8VarArr2;
            sb0Var2.o(p);
            de0 de0Var10 = new de0(rjVar, 1);
            for (int i64 = 0; i64 < b8VarArr.length; i64++) {
                System.arraycopy((int[]) b8VarArr[i64].d, 0, (int[]) de0Var10.b[i64].d, 0, 256);
            }
            i = 0;
            de0Var10.c();
            sb0Var2.r(de0Var8, de0Var10);
            de0Var8.e();
            de0Var8.b();
            int i65 = 0;
            while (true) {
                b8[] b8VarArr8 = de0Var8.b;
                if (i65 >= b8VarArr8.length) {
                    break;
                }
                b8 b8Var5 = b8VarArr8[i65];
                b8 b8Var6 = b8VarArr7[i65];
                for (int i66 = 0; i66 < 256; i66++) {
                    int[] iArr5 = (int[]) b8Var5.d;
                    iArr5[i66] = iArr5[i66] + ((int[]) b8Var6.d)[i66];
                }
                b8Var5.getClass();
                i65++;
            }
            de0Var8.a();
            de0Var8.d(de0Var9);
            u70Var.k = wv0.P(de0Var8, rjVar);
            th = null;
            u70Var.l = null;
        }
        if (v70Var != null && !f20.l(u70Var.k, f20.e(v70Var.f))) {
            c.k("passed in public key does not match private values");
            throw th;
        }
        u70Var.m = u70Var.l == null ? 2 : i;
    }

    public final byte[] getEncoded() {
        return f20.j(new byte[][]{this.e, this.f, this.g, this.h, this.i, this.j});
    }
}
