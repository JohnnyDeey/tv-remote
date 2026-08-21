package defpackage;

/* loaded from: classes.dex */
public final class d extends b91 {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i, Class cls) {
        super(1, cls);
        this.c = i;
    }

    @Override // defpackage.b91
    public x b(a0 a0Var) {
        switch (this.c) {
            case 0:
                return a0Var.v();
            case 6:
                return a0Var.w();
            case 7:
                return a0Var;
            case 8:
                return a0Var.x();
            default:
                return super.b(a0Var);
        }
    }

    @Override // defpackage.b91
    public x c(km kmVar) {
        switch (this.c) {
            case 0:
                return e.q(kmVar.c);
            case 1:
                return g.q(kmVar.c);
            case 2:
                return k.q(kmVar.c, false);
            case 3:
                return new gm(kmVar.c);
            case 4:
                return new o(kmVar.c);
            case 5:
                return s.s(kmVar.c, false);
            case 6:
                return kmVar;
            default:
                return super.c(kmVar);
        }
    }
}
