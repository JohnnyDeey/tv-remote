package defpackage;

/* loaded from: classes.dex */
public final class hw extends rk {
    public /* synthetic */ Object f;
    public int g;
    public final /* synthetic */ cw h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hw(cw cwVar, qk qkVar) {
        super(qkVar);
        this.h = cwVar;
    }

    @Override // defpackage.rk
    public final Object l(Object obj) {
        this.f = obj;
        this.g |= Integer.MIN_VALUE;
        return this.h.i(null, this);
    }
}
