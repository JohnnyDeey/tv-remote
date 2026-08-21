package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class du0 extends cu0 {
    public final /* synthetic */ n8 a;
    public final /* synthetic */ eu0 b;

    public du0(eu0 eu0Var, n8 n8Var) {
        this.b = eu0Var;
        this.a = n8Var;
    }

    @Override // defpackage.au0
    public final void d(bu0 bu0Var) {
        ((ArrayList) this.a.get(this.b.d)).remove(bu0Var);
        bu0Var.x(this);
    }
}
