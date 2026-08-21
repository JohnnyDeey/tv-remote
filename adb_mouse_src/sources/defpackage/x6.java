package defpackage;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class x6 extends cx {
    public final /* synthetic */ e7 l;
    public final /* synthetic */ h7 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x6(h7 h7Var, h7 h7Var2, e7 e7Var) {
        super(h7Var2);
        this.m = h7Var;
        this.l = e7Var;
    }

    @Override // defpackage.cx
    public final bo0 b() {
        return this.l;
    }

    @Override // defpackage.cx
    public final boolean c() {
        h7 h7Var = this.m;
        if (!h7Var.getInternalPopup().b()) {
            h7Var.h.n(h7Var.getTextDirection(), h7Var.getTextAlignment());
            return true;
        }
        return true;
    }
}
