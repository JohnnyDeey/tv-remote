package defpackage;

/* loaded from: classes.dex */
public final class wq0 extends p {
    public a0 c;
    public o d;
    public o e;
    public k4 f;
    public v11 g;
    public ix0 h;
    public v11 i;
    public hq0 j;
    public e k;
    public e l;

    @Override // defpackage.p, defpackage.i
    public final x c() {
        o oVar = this.d;
        a0 a0Var = this.c;
        if (a0Var != null && (qf0.a("org.bouncycastle.x509.allow_non-der_tbscert") == null || qf0.b("org.bouncycastle.x509.allow_non-der_tbscert"))) {
            return a0Var;
        }
        j jVar = new j(10);
        if (!oVar.r(0)) {
            jVar.d(new yb(true, 0, (i) oVar, 1));
        }
        jVar.d(this.e);
        jVar.d(this.f);
        jVar.d(this.g);
        jVar.d(this.h);
        jVar.d(this.i);
        jVar.d(this.j);
        e eVar = this.k;
        if (eVar != null) {
            jVar.d(new yb(false, 1, (i) eVar, 1));
        }
        e eVar2 = this.l;
        if (eVar2 != null) {
            jVar.d(new yb(false, 2, (i) eVar2, 1));
        }
        nm nmVar = new nm(jVar, 0);
        nmVar.f = -1;
        return nmVar;
    }
}
