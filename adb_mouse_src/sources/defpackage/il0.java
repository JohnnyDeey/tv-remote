package defpackage;

import java.math.BigInteger;

/* loaded from: classes.dex */
public abstract class il0 {
    public static final BigInteger a = BigInteger.valueOf(0);

    static {
        BigInteger.valueOf(1L);
    }

    public static BigInteger a(c30 c30Var, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        int bitLength = (bigInteger.bitLength() + 7) / 8;
        BigInteger bigInteger4 = kd.a;
        byte[] byteArray = bigInteger2.toByteArray();
        if (byteArray[0] == 0 && byteArray.length != 1) {
            int length = byteArray.length - 1;
            byte[] bArr = new byte[length];
            System.arraycopy(byteArray, 1, bArr, 0, length);
            byteArray = bArr;
        }
        if (byteArray.length < bitLength) {
            byte[] bArr2 = new byte[bitLength];
            System.arraycopy(byteArray, 0, bArr2, bitLength - byteArray.length, byteArray.length);
            byteArray = bArr2;
        }
        byte[] byteArray2 = bigInteger3.toByteArray();
        if (byteArray2[0] == 0 && byteArray2.length != 1) {
            int length2 = byteArray2.length - 1;
            byte[] bArr3 = new byte[length2];
            System.arraycopy(byteArray2, 1, bArr3, 0, length2);
            byteArray2 = bArr3;
        }
        if (byteArray2.length < bitLength) {
            byte[] bArr4 = new byte[bitLength];
            System.arraycopy(byteArray2, 0, bArr4, bitLength - byteArray2.length, byteArray2.length);
            byteArray2 = bArr4;
        }
        c30Var.update(byteArray, 0, byteArray.length);
        c30Var.update(byteArray2, 0, byteArray2.length);
        return new BigInteger(1, c30Var.a.digest());
    }
}
