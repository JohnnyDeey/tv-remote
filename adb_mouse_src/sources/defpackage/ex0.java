package defpackage;

import java.util.Hashtable;

/* loaded from: classes.dex */
public abstract class ex0 {
    public static final Hashtable a;

    static {
        Hashtable hashtable = new Hashtable();
        a = hashtable;
        hashtable.put("SHA-1", 128);
        hashtable.put("SHA-224", 192);
        hashtable.put("SHA-256", 256);
        hashtable.put("SHA-384", 256);
        hashtable.put("SHA-512", 256);
        hashtable.put("SHA-512/224", 192);
        hashtable.put("SHA-512/256", 256);
    }

    public static byte[] a(gk0 gk0Var, byte[] bArr, int i) {
        int i2 = (i + 7) / 8;
        byte[] bArr2 = new byte[i2];
        gk0Var.getClass();
        int i3 = i2 / 64;
        byte[] bArr3 = new byte[64];
        int i4 = 1;
        int i5 = 0;
        for (int i6 = 0; i6 <= i3; i6++) {
            gk0Var.d((byte) i4);
            gk0Var.d((byte) (i >> 24));
            gk0Var.d((byte) (i >> 16));
            gk0Var.d((byte) (i >> 8));
            gk0Var.d((byte) i);
            gk0Var.update(bArr, 0, bArr.length);
            gk0Var.c(0, bArr3);
            int i7 = i6 * 64;
            int i8 = i2 - i7;
            if (i8 > 64) {
                i8 = 64;
            }
            System.arraycopy(bArr3, 0, bArr2, i7, i8);
            i4++;
        }
        int i9 = i % 8;
        if (i9 != 0) {
            int i10 = 8 - i9;
            int i11 = 0;
            while (i5 != i2) {
                int i12 = bArr2[i5] & 255;
                bArr2[i5] = (byte) ((i11 << (8 - i10)) | (i12 >>> i10));
                i5++;
                i11 = i12;
            }
        }
        return bArr2;
    }
}
