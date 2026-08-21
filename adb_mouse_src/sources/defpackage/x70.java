package defpackage;

import java.security.spec.AlgorithmParameterSpec;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class x70 implements AlgorithmParameterSpec {
    public static final HashMap b;
    public final String a;

    static {
        x70 x70Var = new x70("ML-KEM-512");
        x70 x70Var2 = new x70("ML-KEM-768");
        x70 x70Var3 = new x70("ML-KEM-1024");
        HashMap hashMap = new HashMap();
        b = hashMap;
        hashMap.put("ml-kem-512", x70Var);
        hashMap.put("ml-kem-768", x70Var2);
        hashMap.put("ml-kem-1024", x70Var3);
        hashMap.put("kyber512", x70Var);
        hashMap.put("kyber768", x70Var2);
        hashMap.put("kyber1024", x70Var3);
    }

    public x70(String str) {
        this.a = str;
    }

    public static x70 a(String str) {
        if (str != null) {
            x70 x70Var = (x70) b.get(yp0.c(str));
            if (x70Var != null) {
                return x70Var;
            }
            c.k("unknown parameter name: ".concat(str));
            return null;
        }
        c.g("name cannot be null");
        return null;
    }
}
