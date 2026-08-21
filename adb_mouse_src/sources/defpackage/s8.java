package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class s8 extends k20 {
    public static void u0(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        iArr.getClass();
        iArr2.getClass();
        System.arraycopy(iArr, i2, iArr2, i, i3 - i2);
    }

    public static void v0(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        objArr.getClass();
        objArr2.getClass();
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
    }

    public static /* synthetic */ void w0(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        v0(objArr, objArr2, 0, i, i2);
    }

    public static byte[] x0(byte[] bArr) {
        if (bArr.length == 0) {
            return bArr;
        }
        byte[] bArr2 = new byte[bArr.length];
        int length = bArr.length - 1;
        if (length >= 0) {
            int i = 0;
            while (true) {
                bArr2[length - i] = bArr[i];
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return bArr2;
    }

    public static Comparable[] y0(Comparable[] comparableArr) {
        comparableArr.getClass();
        if (comparableArr.length == 0) {
            return comparableArr;
        }
        Comparable[] comparableArr2 = (Comparable[]) Arrays.copyOf(comparableArr, comparableArr.length);
        if (comparableArr2.length > 1) {
            Arrays.sort(comparableArr2);
        }
        return comparableArr2;
    }
}
