package defpackage;

/* loaded from: classes.dex */
public final class ag0 {
    public final /* synthetic */ int a;

    public /* synthetic */ ag0(int i) {
        this.a = i;
    }

    public static tq a(rq rqVar, e eVar) {
        try {
            x n = x.n(eVar.t());
            if (n instanceof a0) {
                a0 s = a0.s(n);
                return new tq(rqVar, t.q(s.t(0)).c, t.q(s.t(1)).c);
            }
            return new tq(rqVar, t.q(n).c);
        } catch (Exception unused) {
            return new tq(rqVar, eVar.t());
        }
    }

    public static v70 b(t70 t70Var, e eVar) {
        try {
            x n = x.n(eVar.t());
            if (n instanceof a0) {
                a0 s = a0.s(n);
                return new v70(t70Var, t.q(s.t(0)).c, t.q(s.t(1)).c);
            }
            return new v70(t70Var, t.q(n).c);
        } catch (Exception unused) {
            return new v70(t70Var, eVar.t());
        }
    }
}
