package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class t30 implements qu0 {
    public static final s30 e = new s30(0);
    public final g00 c;
    public final ConcurrentHashMap d = new ConcurrentHashMap();

    static {
        new s30(0);
    }

    public t30(g00 g00Var) {
        this.c = g00Var;
    }

    @Override // defpackage.qu0
    public final pu0 a(k00 k00Var, xv0 xv0Var) {
        r30 r30Var = (r30) xv0Var.a.getAnnotation(r30.class);
        if (r30Var == null) {
            return null;
        }
        return b(this.c, k00Var, xv0Var, r30Var, true);
    }

    public final pu0 b(g00 g00Var, k00 k00Var, xv0 xv0Var, r30 r30Var, boolean z) {
        pu0 a;
        Object b = g00Var.e(new xv0(r30Var.value()), true).b();
        boolean nullSafe = r30Var.nullSafe();
        if (b instanceof pu0) {
            a = (pu0) b;
        } else if (b instanceof qu0) {
            qu0 qu0Var = (qu0) b;
            if (z) {
                qu0 qu0Var2 = (qu0) this.d.putIfAbsent(xv0Var.a, qu0Var);
                if (qu0Var2 != null) {
                    qu0Var = qu0Var2;
                }
            }
            a = qu0Var.a(k00Var, xv0Var);
        } else {
            throw new IllegalArgumentException("Invalid attempt to bind an instance of " + b.getClass().getName() + " as a @JsonAdapter for " + f20.i0(xv0Var.b) + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
        }
        if (a != null && nullSafe) {
            return a.a();
        }
        return a;
    }
}
