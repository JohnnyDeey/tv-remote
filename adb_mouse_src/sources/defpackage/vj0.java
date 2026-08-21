package defpackage;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.graphics.Path;
import java.math.BigInteger;
import java.util.LinkedHashMap;
import org.json.JSONObject;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public class vj0 implements cl, em0 {
    public static vj0 c;
    public static final /* synthetic */ vj0 d = new Object();
    public static final vj0 e = new Object();
    public static final vj0 f = new Object();
    public static vj0 g;

    public vj0(JSONObject jSONObject) {
        jSONObject.optString("billingPeriod");
        jSONObject.optString("priceCurrencyCode");
        jSONObject.optString("formattedPrice");
        jSONObject.optLong("priceAmountMicros");
        jSONObject.optInt("recurrenceMode");
        jSONObject.optInt("billingCycleCount");
    }

    public static final BigInteger a(byte[] bArr) {
        BigInteger bigInteger = so0.a;
        byte[] bArr2 = new byte[bArr.length];
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            bArr2[i] = bArr[(bArr.length - 1) - i];
        }
        BigInteger mod = new BigInteger(1, bArr2).mod(so0.c);
        mod.getClass();
        return mod;
    }

    public static byte[] b(BigInteger bigInteger, BigInteger bigInteger2) {
        bigInteger.getClass();
        bigInteger2.getClass();
        byte[] bArr = new byte[32];
        byte[] byteArray = bigInteger2.toByteArray();
        int min = Math.min(byteArray.length, 32);
        for (int i = 0; i < min; i++) {
            int length = (byteArray.length - 1) - i;
            if (length >= 0) {
                bArr[i] = byteArray[length];
            }
        }
        if (bigInteger.testBit(0)) {
            bArr[31] = (byte) (bArr[31] | 128);
        }
        return bArr;
    }

    public static Path c(float f2, float f3, float f4, float f5) {
        Path path = new Path();
        path.moveTo(f2, f3);
        path.lineTo(f4, f5);
        return path;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0045, code lost:
    
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0082, code lost:
    
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0075, code lost:
    
        if (r11 != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00a2, code lost:
    
        if (r10 != (-1)) goto L70;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean e(defpackage.et r7, android.text.Editable r8, int r9, int r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vj0.e(et, android.text.Editable, int, int, boolean):boolean");
    }

    public static BigInteger[] f(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        BigInteger multiply = bigInteger.multiply(bigInteger4);
        BigInteger bigInteger5 = so0.a;
        BigInteger mod = multiply.mod(bigInteger5);
        BigInteger mod2 = bigInteger2.multiply(bigInteger3).mod(bigInteger5);
        BigInteger mod3 = bigInteger.multiply(bigInteger3).mod(bigInteger5);
        BigInteger mod4 = bigInteger2.multiply(bigInteger4).mod(bigInteger5);
        BigInteger mod5 = so0.b.multiply(mod3).mod(bigInteger5).multiply(mod4).mod(bigInteger5);
        BigInteger mod6 = mod.add(mod2).mod(bigInteger5);
        BigInteger bigInteger6 = BigInteger.ONE;
        BigInteger mod7 = mod6.multiply(bigInteger6.add(mod5).mod(bigInteger5).modInverse(bigInteger5)).mod(bigInteger5);
        BigInteger mod8 = mod4.add(mod3).mod(bigInteger5);
        BigInteger mod9 = bigInteger6.subtract(mod5).mod(bigInteger5);
        if (mod9.signum() < 0) {
            mod9 = mod9.add(bigInteger5);
        }
        BigInteger mod10 = mod8.multiply(mod9.modInverse(bigInteger5)).mod(bigInteger5);
        mod7.getClass();
        mod10.getClass();
        return new BigInteger[]{mod7, mod10};
    }

    public static BigInteger g(BigInteger bigInteger, boolean z) {
        BigInteger multiply = bigInteger.multiply(bigInteger);
        BigInteger bigInteger2 = so0.a;
        BigInteger mod = multiply.mod(bigInteger2);
        BigInteger bigInteger3 = BigInteger.ONE;
        BigInteger mod2 = mod.subtract(bigInteger3).mod(bigInteger2);
        if (mod2.signum() < 0) {
            mod2 = mod2.add(bigInteger2);
        }
        BigInteger mod3 = mod2.multiply(so0.b.multiply(mod).add(bigInteger3).mod(bigInteger2).modInverse(bigInteger2)).mod(bigInteger2);
        mod3.getClass();
        BigInteger bigInteger4 = BigInteger.ZERO;
        if (mod3.equals(bigInteger4)) {
            bigInteger4.getClass();
        } else {
            bigInteger4 = mod3.modPow(bigInteger2.add(BigInteger.valueOf(3L)).divide(BigInteger.valueOf(8L)), bigInteger2);
            if (!k20.c(bigInteger4.multiply(bigInteger4).mod(bigInteger2), mod3)) {
                bigInteger4 = bigInteger4.multiply(BigInteger.valueOf(2L).modPow(bigInteger2.subtract(bigInteger3).divide(BigInteger.valueOf(4L)), bigInteger2)).mod(bigInteger2);
                if (!k20.c(bigInteger4.multiply(bigInteger4).mod(bigInteger2), mod3)) {
                    throw new ArithmeticException("No square root exists");
                }
            }
        }
        if (bigInteger4.testBit(0) != z) {
            BigInteger subtract = bigInteger2.subtract(bigInteger4);
            subtract.getClass();
            return subtract;
        }
        return bigInteger4;
    }

    public static BigInteger[] h(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        BigInteger bigInteger4 = BigInteger.ZERO;
        BigInteger bigInteger5 = BigInteger.ONE;
        while (bigInteger.signum() > 0) {
            if (bigInteger.testBit(0)) {
                bigInteger4.getClass();
                bigInteger5.getClass();
                BigInteger[] f2 = f(bigInteger4, bigInteger5, bigInteger2, bigInteger3);
                BigInteger bigInteger6 = f2[0];
                bigInteger5 = f2[1];
                bigInteger4 = bigInteger6;
            }
            BigInteger[] f3 = f(bigInteger2, bigInteger3, bigInteger2, bigInteger3);
            BigInteger bigInteger7 = f3[0];
            BigInteger bigInteger8 = f3[1];
            bigInteger = bigInteger.shiftRight(1);
            bigInteger.getClass();
            bigInteger3 = bigInteger8;
            bigInteger2 = bigInteger7;
        }
        bigInteger4.getClass();
        bigInteger5.getClass();
        return new BigInteger[]{bigInteger4, bigInteger5};
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.LinkedHashMap, j81] */
    public static final j81 i(Object obj, Object obj2) {
        j81 j81Var = (j81) obj;
        j81 j81Var2 = (j81) obj2;
        if (!j81Var2.isEmpty()) {
            if (!j81Var.c) {
                if (j81Var.isEmpty()) {
                    j81Var = new j81();
                } else {
                    ?? linkedHashMap = new LinkedHashMap(j81Var);
                    linkedHashMap.c = true;
                    j81Var = linkedHashMap;
                }
            }
            j81Var.b();
            if (!j81Var2.isEmpty()) {
                j81Var.putAll(j81Var2);
            }
        }
        return j81Var;
    }

    public Signature[] d(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    @Override // defpackage.em0
    public void onScrollLimit(int i, int i2, int i3, boolean z) {
    }

    @Override // defpackage.em0
    public void onScrollProgress(int i, int i2, int i3, int i4) {
    }
}
