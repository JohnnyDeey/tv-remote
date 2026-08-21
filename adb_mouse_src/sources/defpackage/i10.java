package defpackage;

import java.io.IOException;

/* loaded from: classes.dex */
public final class i10 {
    public final byte[] a;
    public final byte[] b;

    public i10() {
        this.a = new byte[]{48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
        byte[] bArr = new byte[128];
        this.b = bArr;
        int i = 0;
        for (int i2 = 0; i2 < 128; i2++) {
            bArr[i2] = -1;
        }
        while (true) {
            byte[] bArr2 = this.a;
            if (i < bArr2.length) {
                bArr[bArr2[i]] = (byte) i;
                i++;
            } else {
                bArr[65] = bArr[97];
                bArr[66] = bArr[98];
                bArr[67] = bArr[99];
                bArr[68] = bArr[100];
                bArr[69] = bArr[101];
                bArr[70] = bArr[102];
                return;
            }
        }
    }

    public byte[] a(String str, int i, int i2) {
        if (i >= 0 && i2 >= 0 && i <= str.length() - i2) {
            if ((i2 & 1) == 0) {
                int i3 = i2 >>> 1;
                byte[] bArr = new byte[i3];
                for (int i4 = 0; i4 < i3; i4++) {
                    char charAt = str.charAt(i);
                    byte[] bArr2 = this.b;
                    i += 2;
                    int i5 = bArr2[str.charAt(i + 1)] | (bArr2[charAt] << 4);
                    if (i5 >= 0) {
                        bArr[i4] = (byte) i5;
                    } else {
                        throw new IOException("invalid characters encountered in Hex string");
                    }
                }
                return bArr;
            }
            throw new IOException("a hexadecimal encoding must have an even number of characters");
        }
        c.m("invalid offset and/or length specified");
        return null;
    }

    public /* synthetic */ i10(byte[] bArr, byte[] bArr2) {
        this.a = bArr;
        this.b = bArr2;
    }
}
