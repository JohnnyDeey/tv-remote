package defpackage;

import android.view.ViewGroup;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class dg extends cu0 {
    public boolean a = false;
    public final ViewGroup b;

    public dg(ViewGroup viewGroup) {
        this.b = viewGroup;
    }

    @Override // defpackage.cu0, defpackage.au0
    public final void b() {
        wg0.A(this.b, false);
    }

    @Override // defpackage.cu0, defpackage.au0
    public final void c() {
        wg0.A(this.b, true);
    }

    @Override // defpackage.au0
    public final void d(bu0 bu0Var) {
        if (!this.a) {
            wg0.A(this.b, false);
        }
        bu0Var.x(this);
    }

    @Override // defpackage.cu0, defpackage.au0
    public final void f(bu0 bu0Var) {
        wg0.A(this.b, false);
        this.a = true;
    }
}
