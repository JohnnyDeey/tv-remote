package defpackage;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class vp extends qq0 implements zy {
    public final /* synthetic */ cq g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vp(cq cqVar, qk qkVar) {
        super(qkVar);
        this.g = cqVar;
    }

    @Override // defpackage.zy
    public final Object g(Object obj, Object obj2) {
        vp vpVar = (vp) j((qk) obj2, (ll) obj);
        nw0 nw0Var = nw0.a;
        vpVar.l(nw0Var);
        return nw0Var;
    }

    @Override // defpackage.rk
    public final qk j(qk qkVar, Object obj) {
        return new vp(this.g, qkVar);
    }

    @Override // defpackage.rk
    public final Object l(Object obj) {
        hi0.p(obj);
        cq.a(this.g);
        return nw0.a;
    }
}
