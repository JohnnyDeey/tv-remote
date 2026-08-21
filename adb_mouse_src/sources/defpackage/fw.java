package defpackage;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class fw implements vv {
    public final /* synthetic */ int a;
    public final /* synthetic */ vv b;
    public final /* synthetic */ qq0 c;

    public /* synthetic */ fw(vv vvVar, qq0 qq0Var, int i) {
        this.a = i;
        this.b = vvVar;
        this.c = qq0Var;
    }

    @Override // defpackage.vv
    public final Object a(xv xvVar, rk rkVar) {
        int i = this.a;
        nw0 nw0Var = nw0.a;
        ml mlVar = ml.c;
        qq0 qq0Var = this.c;
        vv vvVar = this.b;
        switch (i) {
            case 0:
                Object a = ((zv) vvVar).a(new ew(xvVar, (jg) qq0Var, 0), rkVar);
                if (a == mlVar) {
                    return a;
                }
                return nw0Var;
            default:
                Object a2 = ((zv) vvVar).a(new ew(xvVar, (zp) qq0Var, 1), rkVar);
                if (a2 == mlVar) {
                    return a2;
                }
                return nw0Var;
        }
    }
}
