package defpackage;

import android.view.WindowInsets;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public class s01 extends y01 {
    public final WindowInsets.Builder e;

    public s01(m11 m11Var) {
        super(m11Var);
        WindowInsets.Builder d;
        WindowInsets f = m11Var.f();
        if (f != null) {
            d = yv0.e(f);
        } else {
            d = yv0.d();
        }
        this.e = d;
    }

    @Override // defpackage.y01
    public m11 b() {
        WindowInsets build;
        a();
        build = this.e.build();
        m11 g = m11.g(null, build);
        d20[] d20VarArr = this.b;
        i11 i11Var = g.a;
        i11Var.t(d20VarArr);
        i11Var.s(null);
        i11Var.x(this.c);
        i11Var.y(this.d);
        return g;
    }

    @Override // defpackage.y01
    public void e(d20 d20Var) {
        this.e.setMandatorySystemGestureInsets(d20Var.d());
    }

    @Override // defpackage.y01
    public void f(d20 d20Var) {
        this.e.setStableInsets(d20Var.d());
    }

    @Override // defpackage.y01
    public void g(d20 d20Var) {
        this.e.setSystemGestureInsets(d20Var.d());
    }

    @Override // defpackage.y01
    public void h(d20 d20Var) {
        this.e.setSystemWindowInsets(d20Var.d());
    }

    @Override // defpackage.y01
    public void i(d20 d20Var) {
        this.e.setTappableElementInsets(d20Var.d());
    }

    public s01() {
        this.e = yv0.d();
    }
}
