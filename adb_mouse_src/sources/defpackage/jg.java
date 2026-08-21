package defpackage;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class jg extends qq0 implements zy {
    public final /* synthetic */ int g = 1;
    public /* synthetic */ Object h;
    public int i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jg(hn0 hn0Var, int i, qk qkVar) {
        super(qkVar);
        this.j = hn0Var;
        this.i = i;
    }

    @Override // defpackage.zy
    public final Object g(Object obj, Object obj2) {
        int i = this.g;
        nw0 nw0Var = nw0.a;
        switch (i) {
            case 0:
                return ((jg) j((qk) obj2, (hf0) obj)).l(nw0Var);
            default:
                return ((jg) j((qk) obj2, (String) obj)).l(nw0Var);
        }
    }

    @Override // defpackage.rk
    public final qk j(qk qkVar, Object obj) {
        int i = this.g;
        Object obj2 = this.j;
        switch (i) {
            case 0:
                jg jgVar = new jg((mg) obj2, qkVar);
                jgVar.h = obj;
                return jgVar;
            default:
                jg jgVar2 = new jg((hn0) obj2, this.i, qkVar);
                jgVar2.h = obj;
                return jgVar2;
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [rm0, qm0] */
    @Override // defpackage.rk
    public final Object l(Object obj) {
        int i = this.g;
        int i2 = 2;
        Object obj2 = this.j;
        switch (i) {
            case 0:
                int i3 = this.i;
                nw0 nw0Var = nw0.a;
                if (i3 != 0) {
                    if (i3 == 1) {
                        hi0.p(obj);
                    } else {
                        c.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    hi0.p(obj);
                    hf0 hf0Var = (hf0) this.h;
                    mg mgVar = (mg) obj2;
                    this.i = 1;
                    int i4 = mgVar.e;
                    int i5 = sm0.a;
                    ?? qm0Var = new qm0(i4);
                    cw cwVar = new cw(2, hf0Var);
                    dl dlVar = this.d;
                    dlVar.getClass();
                    Object a = mgVar.d.a(new lg((q30) dlVar.h(os.e), qm0Var, hf0Var, cwVar), this);
                    ml mlVar = ml.c;
                    if (a != mlVar) {
                        a = nw0Var;
                    }
                    if (a == mlVar) {
                        return mlVar;
                    }
                }
                return nw0Var;
            default:
                String str = (String) this.h;
                hi0.p(obj);
                return new zv(i2, new n20((hn0) obj2, str, this.i, null));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jg(mg mgVar, qk qkVar) {
        super(qkVar);
        this.j = mgVar;
    }
}
