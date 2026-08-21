package defpackage;

/* loaded from: classes.dex */
public final class a21 extends p {
    public final o c;
    public final int d;
    public final k4 e;

    public a21(a0 a0Var) {
        this.c = o.q(a0Var.t(0));
        this.d = o.q(a0Var.t(1)).t();
        this.e = k4.i(a0Var.t(2));
    }

    public static a21 i(Object obj) {
        if (obj instanceof a21) {
            return (a21) obj;
        }
        if (obj != null) {
            return new a21(a0.s(obj));
        }
        return null;
    }

    @Override // defpackage.p, defpackage.i
    public final x c() {
        j jVar = new j();
        jVar.d(this.c);
        jVar.d(new o(this.d));
        jVar.d(this.e);
        nm nmVar = new nm(jVar, 0);
        nmVar.f = -1;
        return nmVar;
    }

    public a21(int i, k4 k4Var) {
        this.c = new o(0L);
        this.d = i;
        this.e = k4Var;
    }
}
