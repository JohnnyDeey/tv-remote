package defpackage;

/* loaded from: classes.dex */
public final class pg0 extends p {
    public static final k4 g;
    public static final k4 h;
    public static final o i;
    public static final o j;
    public k4 c;
    public k4 d;
    public o e;
    public o f;

    static {
        k4 k4Var = new k4(oc0.a, im.c);
        g = k4Var;
        h = new k4(od0.c, k4Var);
        i = new o(20L);
        j = new o(1L);
    }

    public pg0(k4 k4Var, k4 k4Var2, o oVar, o oVar2) {
        this.c = k4Var;
        this.d = k4Var2;
        this.e = oVar;
        this.f = oVar2;
    }

    @Override // defpackage.p, defpackage.i
    public final x c() {
        o oVar = this.f;
        o oVar2 = this.e;
        k4 k4Var = this.d;
        j jVar = new j(4);
        k4 k4Var2 = this.c;
        if (!k4Var2.equals(g)) {
            jVar.d(new yb(true, 0, (i) k4Var2, 1));
        }
        if (!k4Var.equals(h)) {
            jVar.d(new yb(true, 1, (i) k4Var, 1));
        }
        if (!oVar2.m(i)) {
            jVar.d(new yb(true, 2, (i) oVar2, 1));
        }
        if (!oVar.m(j)) {
            jVar.d(new yb(true, 3, (i) oVar, 1));
        }
        nm nmVar = new nm(jVar, 0);
        nmVar.f = -1;
        return nmVar;
    }
}
