package defpackage;

import java.util.Hashtable;

/* loaded from: classes.dex */
public final class c10 {
    public static final byte[] h = {1};
    public static final Hashtable i;
    public gk0 a;
    public byte[] b;
    public byte[] c;
    public long d;
    public i81 e;
    public int f;
    public int g;

    static {
        Hashtable hashtable = new Hashtable();
        i = hashtable;
        hashtable.put("SHA-1", 440);
        hashtable.put("SHA-224", 440);
        hashtable.put("SHA-256", 440);
        hashtable.put("SHA-512/256", 440);
        hashtable.put("SHA-512/224", 440);
        hashtable.put("SHA-384", 888);
        hashtable.put("SHA-512", 888);
    }

    public static void a(byte[] bArr, byte[] bArr2) {
        int i2 = 0;
        for (int i3 = 1; i3 <= bArr2.length; i3++) {
            int i4 = (bArr[bArr.length - i3] & 255) + (bArr2[bArr2.length - i3] & 255) + i2;
            if (i4 > 255) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            bArr[bArr.length - i3] = (byte) i4;
        }
        for (int length = bArr2.length + 1; length <= bArr.length; length++) {
            int i5 = (bArr[bArr.length - length] & 255) + i2;
            if (i5 > 255) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            bArr[bArr.length - length] = (byte) i5;
        }
    }

    public final int b(byte[] bArr) {
        gk0 gk0Var = this.a;
        int length = bArr.length * 8;
        if (length <= 262144) {
            if (this.d > 140737488355328L) {
                return -1;
            }
            byte[] bArr2 = this.b;
            gk0Var.getClass();
            int i2 = length / 8;
            int i3 = i2 / 64;
            int length2 = bArr2.length;
            byte[] bArr3 = new byte[length2];
            System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
            byte[] bArr4 = new byte[i2];
            byte[] bArr5 = new byte[64];
            for (int i4 = 0; i4 <= i3; i4++) {
                gk0Var.update(bArr3, 0, length2);
                gk0Var.c(0, bArr5);
                int i5 = i4 * 64;
                int i6 = i2 - i5;
                if (i6 > 64) {
                    i6 = 64;
                }
                System.arraycopy(bArr5, 0, bArr4, i5, i6);
                a(bArr3, h);
            }
            byte[] bArr6 = this.b;
            int length3 = bArr6.length + 1;
            byte[] bArr7 = new byte[length3];
            System.arraycopy(bArr6, 0, bArr7, 1, bArr6.length);
            bArr7[0] = 3;
            gk0Var.getClass();
            byte[] bArr8 = new byte[64];
            gk0Var.update(bArr7, 0, length3);
            gk0Var.c(0, bArr8);
            a(this.b, bArr8);
            a(this.b, this.c);
            a(this.b, new byte[]{(byte) (r8 >> 24), (byte) (r8 >> 16), (byte) (r8 >> 8), (byte) this.d});
            this.d++;
            System.arraycopy(bArr4, 0, bArr, 0, bArr.length);
            return length;
        }
        c.k("Number of bits per request limited to 262144");
        return 0;
    }

    public final void c() {
        byte[] i2;
        byte[] t = this.e.t();
        if (t.length >= (this.f + 7) / 8) {
            byte[] bArr = this.b;
            byte[] bArr2 = h;
            if (bArr == null) {
                i2 = f20.h(bArr2, t);
            } else {
                i2 = f20.i(bArr2, bArr, t);
            }
            gk0 gk0Var = this.a;
            int i3 = this.g;
            byte[] a = ex0.a(gk0Var, i2, i3);
            this.b = a;
            byte[] bArr3 = new byte[a.length + 1];
            bArr3[0] = 0;
            System.arraycopy(a, 0, bArr3, 1, a.length);
            this.c = ex0.a(gk0Var, bArr3, i3);
            this.d = 1L;
            return;
        }
        c.o("Insufficient entropy provided by entropy source");
    }
}
