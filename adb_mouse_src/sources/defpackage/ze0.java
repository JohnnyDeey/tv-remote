package defpackage;

import java.math.BigInteger;

/* loaded from: classes.dex */
public abstract class ze0 {
    public static final BigInteger a = BigInteger.valueOf(1);
    public static final BigInteger b = BigInteger.valueOf(2);

    static {
        BigInteger.valueOf(3L);
    }

    public static void a(BigInteger bigInteger) {
        if (bigInteger.signum() >= 1 && bigInteger.bitLength() >= 2) {
            return;
        }
        c.k("'candidate' must be non-null and >= 2");
    }
}
