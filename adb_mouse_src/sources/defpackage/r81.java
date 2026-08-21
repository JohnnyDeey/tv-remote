package defpackage;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class r81 {
    public static final r81 c = new r81();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final i81 a = new i81(0);

    public final u81 a(Class cls) {
        boolean z;
        u81 p81Var;
        Charset charset = d81.a;
        vj0 vj0Var = null;
        if (cls != null) {
            ConcurrentHashMap concurrentHashMap = this.b;
            u81 u81Var = (u81) concurrentHashMap.get(cls);
            if (u81Var == null) {
                i81 i81Var = this.a;
                i81Var.getClass();
                g00 g00Var = v81.a;
                if (!x71.class.isAssignableFrom(cls)) {
                    int i = j71.a;
                }
                t81 b = ((sb0) i81Var.d).b(cls);
                if ((b.d & 2) == 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    int i2 = j71.a;
                    int i3 = q81.a;
                    int i4 = h81.a;
                    g00 g00Var2 = v81.a;
                    if (b.a() - 1 != 1) {
                        vj0Var = u71.a;
                    }
                    int i5 = k81.a;
                    p81Var = o81.u(b, g00Var2, vj0Var);
                } else {
                    int i6 = j71.a;
                    g00 g00Var3 = v81.a;
                    vj0 vj0Var2 = u71.a;
                    p81Var = new p81(g00Var3, b.a);
                }
                u81 u81Var2 = (u81) concurrentHashMap.putIfAbsent(cls, p81Var);
                if (u81Var2 != null) {
                    return u81Var2;
                }
                return p81Var;
            }
            return u81Var;
        }
        c.g("messageType");
        return null;
    }
}
