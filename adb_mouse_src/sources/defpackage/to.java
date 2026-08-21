package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class to {
    public static final Map c;
    public final int a;
    public final String b;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(a("SHA-256", 32, 16, 67, 10), new to("XMSS_SHA2_10_256", 1));
        hashMap.put(a("SHA-256", 32, 16, 67, 16), new to("XMSS_SHA2_16_256", 2));
        hashMap.put(a("SHA-256", 32, 16, 67, 20), new to("XMSS_SHA2_20_256", 3));
        hashMap.put(a("SHA-512", 64, 16, 131, 10), new to("XMSS_SHA2_10_512", 4));
        hashMap.put(a("SHA-512", 64, 16, 131, 16), new to("XMSS_SHA2_16_512", 5));
        hashMap.put(a("SHA-512", 64, 16, 131, 20), new to("XMSS_SHA2_20_512", 6));
        hashMap.put(a("SHAKE128", 32, 16, 67, 10), new to("XMSS_SHAKE_10_256", 7));
        hashMap.put(a("SHAKE128", 32, 16, 67, 16), new to("XMSS_SHAKE_16_256", 8));
        hashMap.put(a("SHAKE128", 32, 16, 67, 20), new to("XMSS_SHAKE_20_256", 9));
        hashMap.put(a("SHAKE256", 64, 16, 131, 10), new to("XMSS_SHAKE_10_512", 10));
        hashMap.put(a("SHAKE256", 64, 16, 131, 16), new to("XMSS_SHAKE_16_512", 11));
        hashMap.put(a("SHAKE256", 64, 16, 131, 20), new to("XMSS_SHAKE_20_512", 12));
        c = Collections.unmodifiableMap(hashMap);
    }

    public to(String str, int i) {
        this.a = i;
        this.b = str;
    }

    public static String a(String str, int i, int i2, int i3, int i4) {
        return str + "-" + i + "-" + i2 + "-" + i3 + "-" + i4;
    }

    public final String toString() {
        return this.b;
    }
}
