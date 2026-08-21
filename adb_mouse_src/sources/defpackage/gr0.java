package defpackage;

import android.graphics.Typeface;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class gr0 extends wg0 {
    public final /* synthetic */ mi0 d;
    public final /* synthetic */ ir0 e;

    public gr0(ir0 ir0Var, mi0 mi0Var) {
        this.e = ir0Var;
        this.d = mi0Var;
    }

    @Override // defpackage.wg0
    public final void v(int i) {
        this.e.n = true;
        this.d.I(i);
    }

    @Override // defpackage.wg0
    public final void w(Typeface typeface) {
        ir0 ir0Var = this.e;
        Typeface create = Typeface.create(typeface, ir0Var.d);
        ir0Var.p = create;
        ir0Var.n = true;
        this.d.J(create, false);
    }
}
