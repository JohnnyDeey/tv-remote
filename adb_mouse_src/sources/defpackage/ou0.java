package defpackage;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class ou0 extends pu0 {
    public final /* synthetic */ pu0 a;

    public ou0(pu0 pu0Var) {
        this.a = pu0Var;
    }

    @Override // defpackage.pu0
    public final void b(g40 g40Var, Object obj) {
        if (obj == null) {
            g40Var.i();
        } else {
            this.a.b(g40Var, obj);
        }
    }

    public final String toString() {
        return "NullSafeTypeAdapter[" + this.a + "]";
    }
}
