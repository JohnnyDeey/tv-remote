package defpackage;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class yc0 extends pu0 {
    public static final xc0 b = new xc0(1);
    public final k00 a;

    public yc0(k00 k00Var) {
        this.a = k00Var;
    }

    @Override // defpackage.pu0
    public final void b(g40 g40Var, Object obj) {
        if (obj == null) {
            g40Var.i();
            return;
        }
        Class<?> cls = obj.getClass();
        k00 k00Var = this.a;
        k00Var.getClass();
        pu0 b2 = k00Var.b(new xv0(cls));
        if (b2 instanceof yc0) {
            g40Var.c();
            g40Var.f();
        } else {
            b2.b(g40Var, obj);
        }
    }
}
