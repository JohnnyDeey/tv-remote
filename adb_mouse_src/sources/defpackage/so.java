package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class so {
    public static final Map c;
    public final int a;
    public final String b;

    static {
        HashMap hashMap = new HashMap();
        qo0.u(1, "XMSSMT_SHA2_20/2_256", hashMap, a("SHA-256", 32, 16, 67, 20, 2));
        qo0.u(2, "XMSSMT_SHA2_20/4_256", hashMap, a("SHA-256", 32, 16, 67, 20, 4));
        qo0.u(3, "XMSSMT_SHA2_40/2_256", hashMap, a("SHA-256", 32, 16, 67, 40, 2));
        qo0.u(4, "XMSSMT_SHA2_40/4_256", hashMap, a("SHA-256", 32, 16, 67, 40, 4));
        qo0.u(5, "XMSSMT_SHA2_40/8_256", hashMap, a("SHA-256", 32, 16, 67, 40, 8));
        qo0.u(6, "XMSSMT_SHA2_60/3_256", hashMap, a("SHA-256", 32, 16, 67, 60, 3));
        qo0.u(7, "XMSSMT_SHA2_60/6_256", hashMap, a("SHA-256", 32, 16, 67, 60, 6));
        qo0.u(8, "XMSSMT_SHA2_60/12_256", hashMap, a("SHA-256", 32, 16, 67, 60, 12));
        qo0.u(9, "XMSSMT_SHA2_20/2_512", hashMap, a("SHA-512", 64, 16, 131, 20, 2));
        qo0.u(10, "XMSSMT_SHA2_20/4_512", hashMap, a("SHA-512", 64, 16, 131, 20, 4));
        qo0.u(11, "XMSSMT_SHA2_40/2_512", hashMap, a("SHA-512", 64, 16, 131, 40, 2));
        qo0.u(12, "XMSSMT_SHA2_40/4_512", hashMap, a("SHA-512", 64, 16, 131, 40, 4));
        qo0.u(13, "XMSSMT_SHA2_40/8_512", hashMap, a("SHA-512", 64, 16, 131, 40, 8));
        qo0.u(14, "XMSSMT_SHA2_60/3_512", hashMap, a("SHA-512", 64, 16, 131, 60, 3));
        qo0.u(15, "XMSSMT_SHA2_60/6_512", hashMap, a("SHA-512", 64, 16, 131, 60, 6));
        qo0.u(16, "XMSSMT_SHA2_60/12_512", hashMap, a("SHA-512", 64, 16, 131, 60, 12));
        qo0.u(17, "XMSSMT_SHAKE_20/2_256", hashMap, a("SHAKE128", 32, 16, 67, 20, 2));
        qo0.u(18, "XMSSMT_SHAKE_20/4_256", hashMap, a("SHAKE128", 32, 16, 67, 20, 4));
        qo0.u(19, "XMSSMT_SHAKE_40/2_256", hashMap, a("SHAKE128", 32, 16, 67, 40, 2));
        qo0.u(20, "XMSSMT_SHAKE_40/4_256", hashMap, a("SHAKE128", 32, 16, 67, 40, 4));
        qo0.u(21, "XMSSMT_SHAKE_40/8_256", hashMap, a("SHAKE128", 32, 16, 67, 40, 8));
        qo0.u(22, "XMSSMT_SHAKE_60/3_256", hashMap, a("SHAKE128", 32, 16, 67, 60, 3));
        qo0.u(23, "XMSSMT_SHAKE_60/6_256", hashMap, a("SHAKE128", 32, 16, 67, 60, 6));
        qo0.u(24, "XMSSMT_SHAKE_60/12_256", hashMap, a("SHAKE128", 32, 16, 67, 60, 12));
        qo0.u(25, "XMSSMT_SHAKE_20/2_512", hashMap, a("SHAKE256", 64, 16, 131, 20, 2));
        qo0.u(26, "XMSSMT_SHAKE_20/4_512", hashMap, a("SHAKE256", 64, 16, 131, 20, 4));
        qo0.u(27, "XMSSMT_SHAKE_40/2_512", hashMap, a("SHAKE256", 64, 16, 131, 40, 2));
        qo0.u(28, "XMSSMT_SHAKE_40/4_512", hashMap, a("SHAKE256", 64, 16, 131, 40, 4));
        qo0.u(29, "XMSSMT_SHAKE_40/8_512", hashMap, a("SHAKE256", 64, 16, 131, 40, 8));
        qo0.u(30, "XMSSMT_SHAKE_60/3_512", hashMap, a("SHAKE256", 64, 16, 131, 60, 3));
        qo0.u(31, "XMSSMT_SHAKE_60/6_512", hashMap, a("SHAKE256", 64, 16, 131, 60, 6));
        hashMap.put(a("SHAKE256", 64, 16, 131, 60, 12), new so("XMSSMT_SHAKE_60/12_512", 32));
        c = Collections.unmodifiableMap(hashMap);
    }

    public so(String str, int i) {
        this.a = i;
        this.b = str;
    }

    public static String a(String str, int i, int i2, int i3, int i4, int i5) {
        if (str != null) {
            return str + "-" + i + "-" + i2 + "-" + i3 + "-" + i4 + "-" + i5;
        }
        c.g("algorithmName == null");
        return null;
    }

    public final String toString() {
        return this.b;
    }
}
