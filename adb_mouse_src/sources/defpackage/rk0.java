package defpackage;

/* loaded from: classes.dex */
public final class rk0 extends p {
    public final o c;
    public final k4 d;

    public rk0(a0 a0Var) {
        this.c = o.q(a0Var.t(0));
        this.d = k4.i(a0Var.t(1));
    }

    public static final rk0 i(Object obj) {
        if (obj instanceof rk0) {
            return (rk0) obj;
        }
        if (obj != null) {
            return new rk0(a0.s(obj));
        }
        return null;
    }

    @Override // defpackage.p, defpackage.i
    public final x c() {
        j jVar = new j();
        jVar.d(this.c);
        jVar.d(this.d);
        nm nmVar = new nm(jVar, 0);
        nmVar.f = -1;
        return nmVar;
    }

    public rk0(k4 k4Var) {
        this.c = new o(0L);
        this.d = k4Var;
    }
}
