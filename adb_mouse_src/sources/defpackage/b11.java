package defpackage;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public class b11 extends a11 {
    public b11(m11 m11Var, WindowInsets windowInsets) {
        super(m11Var, windowInsets);
    }

    @Override // defpackage.i11
    public m11 a() {
        WindowInsets consumeDisplayCutout;
        consumeDisplayCutout = this.c.consumeDisplayCutout();
        return m11.g(null, consumeDisplayCutout);
    }

    @Override // defpackage.z01, defpackage.i11
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b11)) {
            return false;
        }
        b11 b11Var = (b11) obj;
        if (Objects.equals(this.c, b11Var.c) && Objects.equals(this.g, b11Var.g) && z01.J(this.h, b11Var.h)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.i11
    public ar g() {
        DisplayCutout displayCutout;
        displayCutout = this.c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new ar(displayCutout);
    }

    @Override // defpackage.i11
    public int hashCode() {
        return this.c.hashCode();
    }
}
