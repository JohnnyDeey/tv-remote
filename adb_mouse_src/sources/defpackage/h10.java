package defpackage;

import java.io.ByteArrayOutputStream;

/* loaded from: classes.dex */
public abstract class h10 {
    public static final i10 a = new i10();

    public static byte[] a(String str) {
        try {
            return a.a(str, 0, str.length());
        } catch (Exception e) {
            throw new w(1, e, "exception decoding Hex string: " + e.getMessage());
        }
    }

    public static byte[] b(int i, byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            i10 i10Var = a;
            i10Var.getClass();
            if (i >= 0) {
                byte[] bArr2 = new byte[72];
                int i2 = 0;
                while (i > 0) {
                    int min = Math.min(36, i);
                    int i3 = i2 + min;
                    int i4 = 0;
                    while (i2 < i3) {
                        int i5 = i2 + 1;
                        byte b = bArr[i2];
                        int i6 = i4 + 1;
                        byte[] bArr3 = i10Var.a;
                        bArr2[i4] = bArr3[(b & 255) >>> 4];
                        i4 += 2;
                        bArr2[i6] = bArr3[b & 15];
                        i2 = i5;
                    }
                    byteArrayOutputStream.write(bArr2, 0, i4);
                    i -= min;
                    i2 = i3;
                }
            }
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            w wVar = new w("exception encoding Hex string: " + e.getMessage(), 2);
            wVar.d = e;
            throw wVar;
        }
    }
}
