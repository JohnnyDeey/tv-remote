package defpackage;

/* loaded from: classes.dex */
public final class ev extends p {
    public int c;
    public byte[] d;
    public byte[] e;
    public byte[] f;
    public gv g;

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, gv] */
    /* JADX WARN: Type inference failed for: r1v0, types: [ev, java.lang.Object] */
    public static ev i(x xVar) {
        gv gvVar = null;
        if (xVar != null) {
            a0 s = a0.s(xVar);
            ?? obj = new Object();
            int t = o.q(s.t(0)).t();
            obj.c = t;
            if (t == 0) {
                obj.d = f20.e(t.q(s.t(1)).c);
                obj.e = f20.e(t.q(s.t(2)).c);
                obj.f = f20.e(t.q(s.t(3)).c);
                if (s.size() == 5) {
                    i t2 = s.t(4);
                    if (t2 instanceof gv) {
                        gvVar = (gv) t2;
                    } else if (t2 != null) {
                        a0 s2 = a0.s(t2);
                        ?? obj2 = new Object();
                        obj2.c = f20.e(t.q(s2.t(0)).c);
                        gvVar = obj2;
                    }
                    obj.g = gvVar;
                }
                return obj;
            }
            c.k("unrecognized version");
        }
        return null;
    }

    @Override // defpackage.p, defpackage.i
    public final x c() {
        j jVar = new j();
        jVar.d(new o(this.c));
        jVar.d(new t(this.d));
        jVar.d(new t(this.e));
        jVar.d(new t(this.f));
        gv gvVar = this.g;
        if (gvVar != null) {
            jVar.d(new gv(gvVar.c));
        }
        nm nmVar = new nm(jVar, 0);
        nmVar.f = -1;
        return nmVar;
    }
}
