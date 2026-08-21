package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public abstract class ky0 {
    public static m11 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        m11 g = m11.g(null, rootWindowInsets);
        i11 i11Var = g.a;
        i11Var.u(g);
        View rootView = view.getRootView();
        i11Var.d(rootView);
        i11Var.n(rootView);
        i11Var.o();
        return g;
    }
}
