package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class yz0 {
    public static final Map b;
    public final String a;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(a("SHA-256", 32, 67), new yz0("WOTSP_SHA2-256_W16", 16777217));
        hashMap.put(a("SHA-512", 64, 131), new yz0("WOTSP_SHA2-512_W16", 33554434));
        hashMap.put(a("SHAKE128", 32, 67), new yz0("WOTSP_SHAKE128_W16", 50331651));
        hashMap.put(a("SHAKE256", 64, 131), new yz0("WOTSP_SHAKE256_W16", 67108868));
        b = Collections.unmodifiableMap(hashMap);
    }

    public yz0(String str, int i) {
        this.a = str;
    }

    public static String a(String str, int i, int i2) {
        return str + "-" + i + "-16-" + i2;
    }

    public final String toString() {
        return this.a;
    }
}
