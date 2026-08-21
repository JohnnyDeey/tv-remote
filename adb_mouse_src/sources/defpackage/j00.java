package defpackage;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public class j00 extends zm0 {
    public pu0 a = null;

    @Override // defpackage.pu0
    public final void b(g40 g40Var, Object obj) {
        pu0 pu0Var = this.a;
        if (pu0Var != null) {
            pu0Var.b(g40Var, obj);
        } else {
            c.o("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }
    }

    @Override // defpackage.zm0
    public final pu0 c() {
        pu0 pu0Var = this.a;
        if (pu0Var != null) {
            return pu0Var;
        }
        c.o("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        return null;
    }
}
