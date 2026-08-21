package defpackage;

/* loaded from: classes.dex */
public final class re extends p {
    public int c;
    public byte[] d;
    public byte[] e;
    public byte[] f;
    public byte[] g;
    public byte[] h;
    public te i;

    @Override // defpackage.p, defpackage.i
    public final x c() {
        j jVar = new j();
        jVar.d(new o(this.c));
        jVar.d(new t(this.d));
        jVar.d(new t(this.e));
        jVar.d(new t(this.f));
        jVar.d(new t(this.g));
        jVar.d(new t(this.h));
        te teVar = this.i;
        if (teVar != null) {
            jVar.d(new te(f20.e(teVar.c)));
        }
        nm nmVar = new nm(jVar, 0);
        nmVar.f = -1;
        return nmVar;
    }
}
