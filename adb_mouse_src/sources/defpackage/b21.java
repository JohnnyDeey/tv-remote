package defpackage;

/* loaded from: classes.dex */
public final class b21 extends p {
    public final o c;
    public final int d;
    public final int e;
    public final k4 f;

    public b21(a0 a0Var) {
        this.c = o.q(a0Var.t(0));
        this.d = o.q(a0Var.t(1)).t();
        this.e = o.q(a0Var.t(2)).t();
        this.f = k4.i(a0Var.t(3));
    }

    public static b21 i(Object obj) {
        if (obj instanceof b21) {
            return (b21) obj;
        }
        if (obj != null) {
            return new b21(a0.s(obj));
        }
        return null;
    }

    @Override // defpackage.p, defpackage.i
    public final x c() {
        j jVar = new j();
        jVar.d(this.c);
        jVar.d(new o(this.d));
        jVar.d(new o(this.e));
        jVar.d(this.f);
        nm nmVar = new nm(jVar, 0);
        nmVar.f = -1;
        return nmVar;
    }

    public b21(int i, int i2, k4 k4Var) {
        this.c = new o(0L);
        this.d = i;
        this.e = i2;
        this.f = k4Var;
    }
}
