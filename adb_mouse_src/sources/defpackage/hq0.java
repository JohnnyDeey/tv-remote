package defpackage;

import java.util.Enumeration;

/* loaded from: classes.dex */
public final class hq0 extends p {
    public k4 c;
    public e d;

    public hq0(k4 k4Var, p pVar) {
        this.d = new cm(0, pVar.c().h());
        this.c = k4Var;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [hq0, java.lang.Object] */
    public static hq0 i(Object obj) {
        if (obj instanceof hq0) {
            return (hq0) obj;
        }
        if (obj != null) {
            a0 s = a0.s(obj);
            ?? obj2 = new Object();
            if (s.size() == 2) {
                Enumeration u = s.u();
                obj2.c = k4.i(u.nextElement());
                obj2.d = e.s(u.nextElement());
                return obj2;
            }
            f40.h("Bad sequence size: ", s.size());
        }
        return null;
    }

    @Override // defpackage.p, defpackage.i
    public final x c() {
        return new nm(this.c, this.d);
    }

    public final x j() {
        return x.n(this.d.t());
    }

    public hq0(k4 k4Var, byte[] bArr) {
        this.d = new cm(0, bArr);
        this.c = k4Var;
    }
}
