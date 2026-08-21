package defpackage;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public abstract class sn {
    public static final wo a;

    static {
        String str;
        boolean z;
        wo woVar;
        int i = vq0.a;
        try {
            str = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null) {
            z = Boolean.parseBoolean(str);
        } else {
            z = false;
        }
        if (!z) {
            woVar = rn.k;
        } else {
            ho hoVar = yq.a;
            y00 y00Var = p80.a;
            y00 y00Var2 = y00Var.g;
            woVar = y00Var;
            if (y00Var == null) {
                woVar = rn.k;
            }
        }
        a = woVar;
    }
}
