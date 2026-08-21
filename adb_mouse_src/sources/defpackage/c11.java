package defpackage;

import android.graphics.Insets;
import android.view.WindowInsets;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public class c11 extends b11 {
    public d20 s;
    public d20 t;
    public d20 u;

    public c11(m11 m11Var, WindowInsets windowInsets) {
        super(m11Var, windowInsets);
        this.s = null;
        this.t = null;
        this.u = null;
    }

    @Override // defpackage.i11
    public d20 i() {
        Insets mandatorySystemGestureInsets;
        if (this.t == null) {
            mandatorySystemGestureInsets = this.c.getMandatorySystemGestureInsets();
            this.t = d20.c(mandatorySystemGestureInsets);
        }
        return this.t;
    }

    @Override // defpackage.i11
    public d20 k() {
        Insets systemGestureInsets;
        if (this.s == null) {
            systemGestureInsets = this.c.getSystemGestureInsets();
            this.s = d20.c(systemGestureInsets);
        }
        return this.s;
    }

    @Override // defpackage.i11
    public d20 m() {
        Insets tappableElementInsets;
        if (this.u == null) {
            tappableElementInsets = this.c.getTappableElementInsets();
            this.u = d20.c(tappableElementInsets);
        }
        return this.u;
    }

    @Override // defpackage.z01, defpackage.i11
    public m11 p(int i, int i2, int i3, int i4) {
        WindowInsets inset;
        inset = this.c.inset(i, i2, i3, i4);
        return m11.g(null, inset);
    }

    @Override // defpackage.a11, defpackage.i11
    public void v(d20 d20Var) {
    }
}
