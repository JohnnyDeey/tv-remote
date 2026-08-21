package defpackage;

import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public class f11 extends e11 {
    public static final m11 w;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        w = m11.g(null, windowInsets);
    }

    public f11(m11 m11Var, WindowInsets windowInsets) {
        super(m11Var, windowInsets);
    }

    @Override // defpackage.d11, defpackage.z01
    public d20 E(int i) {
        Insets insetsIgnoringVisibility;
        insetsIgnoringVisibility = this.c.getInsetsIgnoringVisibility(l11.a(i));
        return d20.c(insetsIgnoringVisibility);
    }

    @Override // defpackage.d11, defpackage.z01, defpackage.i11
    public d20 h(int i) {
        Insets insets;
        insets = this.c.getInsets(l11.a(i));
        return d20.c(insets);
    }

    @Override // defpackage.z01, defpackage.i11
    public void n(View view) {
    }
}
