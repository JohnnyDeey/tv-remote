package defpackage;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class ig extends qq0 implements zy {
    public final /* synthetic */ int g = 1;
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ xv j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ig(vv vvVar, cw cwVar, rm0 rm0Var, qk qkVar) {
        super(qkVar);
        this.i = vvVar;
        this.j = cwVar;
        this.k = rm0Var;
    }

    @Override // defpackage.zy
    public final Object g(Object obj, Object obj2) {
        int i = this.g;
        nw0 nw0Var = nw0.a;
        ll llVar = (ll) obj;
        qk qkVar = (qk) obj2;
        switch (i) {
            case 0:
                return ((ig) j(qkVar, llVar)).l(nw0Var);
            default:
                return ((ig) j(qkVar, llVar)).l(nw0Var);
        }
    }

    @Override // defpackage.rk
    public final qk j(qk qkVar, Object obj) {
        int i = this.g;
        Object obj2 = this.k;
        xv xvVar = this.j;
        switch (i) {
            case 0:
                ig igVar = new ig(xvVar, (mg) obj2, qkVar);
                igVar.i = obj;
                return igVar;
            default:
                return new ig((vv) this.i, (cw) xvVar, (rm0) obj2, qkVar);
        }
    }

    @Override // defpackage.rk
    public final Object l(Object obj) {
        int i = this.g;
        nw0 nw0Var = nw0.a;
        xv xvVar = this.j;
        ml mlVar = ml.c;
        Object obj2 = this.k;
        switch (i) {
            case 0:
                int i2 = this.h;
                if (i2 != 0) {
                    if (i2 == 1) {
                        hi0.p(obj);
                        return nw0Var;
                    }
                    c.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hi0.p(obj);
                ll llVar = (ll) this.i;
                mg mgVar = (mg) obj2;
                dl dlVar = mgVar.a;
                int i3 = mgVar.b;
                zy jgVar = new jg(mgVar, null);
                he a = r21.a(i3, 4);
                dl n = r21.n(llVar.b(), dlVar, true);
                ho hoVar = yq.a;
                if (n != hoVar && n.h(g00.e) == null) {
                    n = n.g(hoVar);
                }
                hf0 hf0Var = new hf0(n, a);
                hf0Var.T(ol.c, hf0Var, jgVar);
                this.h = 1;
                Object l = r21.l(xvVar, hf0Var, true, this);
                if (l != mlVar) {
                    l = nw0Var;
                }
                if (l == mlVar) {
                    return mlVar;
                }
                return nw0Var;
            default:
                rm0 rm0Var = (rm0) obj2;
                int i4 = this.h;
                try {
                    if (i4 != 0) {
                        if (i4 == 1) {
                            hi0.p(obj);
                        } else {
                            c.o("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        hi0.p(obj);
                        this.h = 1;
                        if (((vv) this.i).a((cw) xvVar, this) == mlVar) {
                            return mlVar;
                        }
                    }
                    return nw0Var;
                } finally {
                    rm0Var.b();
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ig(xv xvVar, mg mgVar, qk qkVar) {
        super(qkVar);
        this.j = xvVar;
        this.k = mgVar;
    }
}
