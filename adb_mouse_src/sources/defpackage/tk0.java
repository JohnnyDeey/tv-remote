package defpackage;

/* loaded from: classes.dex */
public final class tk0 extends p {
    public int c;
    public byte[] d;
    public byte[] e;
    public uk0 f;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [i, java.lang.Object, uk0] */
    @Override // defpackage.p, defpackage.i
    public final x c() {
        j jVar = new j();
        jVar.d(new o(this.c));
        jVar.d(new t(this.d));
        jVar.d(new t(this.e));
        uk0 uk0Var = this.f;
        if (uk0Var != null) {
            byte[] e = f20.e(uk0Var.c);
            byte[] e2 = f20.e(uk0Var.d);
            ?? obj = new Object();
            obj.c = e;
            obj.d = e2;
            jVar.d(obj);
        }
        nm nmVar = new nm(jVar, 0);
        nmVar.f = -1;
        return nmVar;
    }
}
