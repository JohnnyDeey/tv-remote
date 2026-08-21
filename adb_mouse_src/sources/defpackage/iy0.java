package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class iy0 implements View.OnApplyWindowInsetsListener {
    public m11 a = null;
    public final /* synthetic */ View b;
    public final /* synthetic */ ad0 c;

    public iy0(View view, ad0 ad0Var) {
        this.b = view;
        this.c = ad0Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        m11 g = m11.g(view, windowInsets);
        int i = Build.VERSION.SDK_INT;
        ad0 ad0Var = this.c;
        if (i < 30) {
            jy0.a(windowInsets, this.b);
            if (g.equals(this.a)) {
                return ad0Var.g(view, g).f();
            }
        }
        this.a = g;
        m11 g2 = ad0Var.g(view, g);
        if (i >= 30) {
            return g2.f();
        }
        WeakHashMap weakHashMap = ry0.a;
        view.requestApplyInsets();
        return g2.f();
    }
}
