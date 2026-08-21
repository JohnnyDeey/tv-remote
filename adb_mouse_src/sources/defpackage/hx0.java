package defpackage;

/* loaded from: classes.dex */
public final class hx0 {
    public o a;
    public k4 b;
    public v11 c;
    public wr0 d;
    public wr0 e;
    public v11 f;
    public hq0 g;

    static {
        o oVar = new o(2L);
        if ((128 & 192) == 128) {
            boolean z = oVar instanceof h;
        } else {
            c.k(qo0.m("invalid tag class: ", 128));
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [wq0, java.lang.Object] */
    public final wq0 a() {
        if (this.a != null && this.b != null && this.c != null && this.d != null && this.e != null && this.f != null && this.g != null) {
            o oVar = new o(2L);
            o oVar2 = this.a;
            k4 k4Var = this.b;
            v11 v11Var = this.c;
            ix0 ix0Var = new ix0(this.d, this.e);
            v11 v11Var2 = this.f;
            if (v11Var2 == null) {
                nm nmVar = new nm(0);
                nmVar.f = -1;
                v11Var2 = v11.i(nmVar);
            }
            hq0 hq0Var = this.g;
            ?? obj = new Object();
            if (oVar2 != null) {
                if (k4Var != null) {
                    if (v11Var != null) {
                        if (v11Var2 != null) {
                            if (hq0Var != null) {
                                obj.d = oVar;
                                obj.e = oVar2;
                                obj.f = k4Var;
                                obj.g = v11Var;
                                obj.h = ix0Var;
                                obj.i = v11Var2;
                                obj.j = hq0Var;
                                obj.k = null;
                                obj.l = null;
                                obj.c = null;
                                return obj;
                            }
                            c.g("'subjectPublicKeyInfo' cannot be null");
                            return null;
                        }
                        c.g("'subject' cannot be null");
                        return null;
                    }
                    c.g("'issuer' cannot be null");
                    return null;
                }
                c.g("'signature' cannot be null");
                return null;
            }
            c.g("'serialNumber' cannot be null");
            return null;
        }
        c.o("not all mandatory fields set in V3 TBScertificate generator");
        return null;
    }
}
