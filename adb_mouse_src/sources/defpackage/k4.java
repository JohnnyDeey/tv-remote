package defpackage;

/* loaded from: classes.dex */
public final class k4 extends p {
    public s c;
    public i d;

    public k4(s sVar, p pVar) {
        this.c = sVar;
        this.d = pVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [k4, java.lang.Object] */
    public static k4 i(Object obj) {
        if (obj instanceof k4) {
            return (k4) obj;
        }
        if (obj != null) {
            a0 s = a0.s(obj);
            ?? obj2 = new Object();
            if (s.size() >= 1 && s.size() <= 2) {
                obj2.c = s.u(s.t(0));
                if (s.size() == 2) {
                    obj2.d = s.t(1);
                    return obj2;
                }
                obj2.d = null;
                return obj2;
            }
            f40.h("Bad sequence size: ", s.size());
        }
        return null;
    }

    @Override // defpackage.p, defpackage.i
    public final x c() {
        j jVar = new j(2);
        jVar.d(this.c);
        i iVar = this.d;
        if (iVar != null) {
            jVar.d(iVar);
        }
        nm nmVar = new nm(jVar, 0);
        nmVar.f = -1;
        return nmVar;
    }

    public k4(s sVar) {
        this.c = sVar;
    }
}
