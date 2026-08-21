package defpackage;

import java.security.SecureRandom;

/* loaded from: classes.dex */
public final class sg0 extends SecureRandom {
    public final byte[] c;
    public final byte[] d;

    public sg0(byte[] bArr, gk0 gk0Var) {
        if (bArr.length >= 48) {
            byte[] bArr2 = new byte[48];
            System.arraycopy(bArr, 0, bArr2, 0, 48);
            byte[] bArr3 = new byte[32];
            this.c = bArr3;
            byte[] bArr4 = new byte[16];
            this.d = bArr4;
            a(bArr2, bArr3, bArr4);
            return;
        }
        int length = 48 - bArr.length;
        int b = gk0Var.b();
        gk0Var.update(bArr, 0, bArr.length);
        byte[] bArr5 = new byte[b];
        gk0Var.c(0, bArr5);
        if (length != b) {
            if (length < b) {
                bArr5 = f20.o(length, bArr5);
            } else {
                byte[] o = f20.o(b, bArr5);
                while (true) {
                    length -= b;
                    if (length < b) {
                        break;
                    }
                    gk0Var.update(bArr5, 0, b);
                    bArr5 = new byte[b];
                    gk0Var.c(0, bArr5);
                    o = f20.h(o, bArr5);
                }
                if (length > 0) {
                    gk0Var.update(bArr5, 0, b);
                    byte[] bArr6 = new byte[b];
                    gk0Var.c(0, bArr6);
                    int length2 = o.length;
                    bArr5 = f20.o(length2 + length, o);
                    System.arraycopy(bArr6, 0, bArr5, length2, length);
                } else {
                    bArr5 = o;
                }
            }
        }
        byte[] bArr7 = new byte[48];
        System.arraycopy(f20.h(bArr, bArr5), 0, bArr7, 0, 48);
        byte[] bArr8 = new byte[32];
        this.c = bArr8;
        byte[] bArr9 = new byte[16];
        this.d = bArr9;
        a(bArr7, bArr8, bArr9);
    }

    public static void a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] bArr4 = new byte[48];
        for (int i = 0; i < 3; i++) {
            int i2 = 15;
            while (true) {
                if (i2 >= 0) {
                    byte b = bArr3[i2];
                    if ((b & 255) == 255) {
                        bArr3[i2] = 0;
                        i2--;
                    } else {
                        bArr3[i2] = (byte) (b + 1);
                        break;
                    }
                }
            }
            b(bArr2, bArr3, bArr4, i * 16);
        }
        if (bArr != null) {
            for (int i3 = 0; i3 < 48; i3++) {
                bArr4[i3] = (byte) (bArr4[i3] ^ bArr[i3]);
            }
        }
        System.arraycopy(bArr4, 0, bArr2, 0, bArr2.length);
        System.arraycopy(bArr4, 32, bArr3, 0, bArr3.length);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [l40, java.lang.Object] */
    public static void b(byte[] bArr, byte[] bArr2, byte[] bArr3, int i) {
        try {
            b bVar = new b();
            int length = bArr.length;
            ?? obj = new Object();
            byte[] bArr4 = new byte[length];
            obj.a = bArr4;
            System.arraycopy(bArr, 0, bArr4, 0, length);
            bVar.b(obj);
            for (int i2 = 0; i2 != bArr2.length; i2 += 16) {
                bVar.c(i2, i + i2, bArr2, bArr3);
            }
        } catch (Throwable th) {
            f40.j("drbg failure: ", th.getMessage(), th);
        }
    }

    @Override // java.security.SecureRandom, java.util.Random
    public final void nextBytes(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int length = bArr.length;
        int i = 0;
        while (true) {
            byte[] bArr3 = this.c;
            byte[] bArr4 = this.d;
            if (length > 0) {
                int i2 = 15;
                while (true) {
                    if (i2 < 0) {
                        break;
                    }
                    byte b = bArr4[i2];
                    if ((b & 255) == 255) {
                        bArr4[i2] = 0;
                        i2--;
                    } else {
                        bArr4[i2] = (byte) (b + 1);
                        break;
                    }
                }
                b(bArr3, bArr4, bArr2, 0);
                if (length > 15) {
                    System.arraycopy(bArr2, 0, bArr, i, 16);
                    i += 16;
                    length -= 16;
                } else {
                    System.arraycopy(bArr2, 0, bArr, i, length);
                    length = 0;
                }
            } else {
                a(null, bArr3, bArr4);
                return;
            }
        }
    }
}
