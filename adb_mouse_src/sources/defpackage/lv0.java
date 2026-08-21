package defpackage;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class lv0 implements qu0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Class d;
    public final /* synthetic */ pu0 e;

    public /* synthetic */ lv0(Class cls, pu0 pu0Var, int i) {
        this.c = i;
        this.d = cls;
        this.e = pu0Var;
    }

    @Override // defpackage.qu0
    public final pu0 a(k00 k00Var, xv0 xv0Var) {
        int i = this.c;
        Class cls = this.d;
        switch (i) {
            case 0:
                if (xv0Var.a != cls) {
                    return null;
                }
                return this.e;
            default:
                if (!cls.isAssignableFrom(xv0Var.a)) {
                    return null;
                }
                return new ei(2, this);
        }
    }

    public final String toString() {
        int i = this.c;
        pu0 pu0Var = this.e;
        Class cls = this.d;
        switch (i) {
            case 0:
                return "Factory[type=" + cls.getName() + ",adapter=" + pu0Var + "]";
            default:
                return "Factory[typeHierarchy=" + cls.getName() + ",adapter=" + pu0Var + "]";
        }
    }
}
