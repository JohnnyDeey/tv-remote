package defpackage;

import android.view.WindowInsets;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public class a11 extends z01 {
    public d20 r;

    public a11(m11 m11Var, WindowInsets windowInsets) {
        super(m11Var, windowInsets);
        this.r = null;
    }

    @Override // defpackage.i11
    public m11 b() {
        return m11.g(null, this.c.consumeStableInsets());
    }

    @Override // defpackage.i11
    public m11 c() {
        return m11.g(null, this.c.consumeSystemWindowInsets());
    }

    @Override // defpackage.i11
    public final d20 j() {
        if (this.r == null) {
            WindowInsets windowInsets = this.c;
            this.r = d20.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.r;
    }

    @Override // defpackage.i11
    public boolean q() {
        return this.c.isConsumed();
    }

    @Override // defpackage.i11
    public void v(d20 d20Var) {
        this.r = d20Var;
    }
}
