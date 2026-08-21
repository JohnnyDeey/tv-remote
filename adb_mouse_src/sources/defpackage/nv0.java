package defpackage;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class nv0 implements qu0 {
    public final /* synthetic */ Class c;
    public final /* synthetic */ Class d;
    public final /* synthetic */ pu0 e;

    public nv0(Class cls, Class cls2, pu0 pu0Var) {
        this.c = cls;
        this.d = cls2;
        this.e = pu0Var;
    }

    @Override // defpackage.qu0
    public final pu0 a(k00 k00Var, xv0 xv0Var) {
        Class cls = xv0Var.a;
        if (cls != this.c && cls != this.d) {
            return null;
        }
        return this.e;
    }

    public final String toString() {
        return "Factory[type=" + this.d.getName() + "+" + this.c.getName() + ",adapter=" + this.e + "]";
    }
}
