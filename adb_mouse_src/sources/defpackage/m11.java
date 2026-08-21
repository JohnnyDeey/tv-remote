package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class m11 {
    public static final m11 b;
    public final i11 a;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            b = f11.w;
        } else if (i >= 30) {
            b = d11.v;
        } else {
            b = i11.b;
        }
    }

    public m11(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            this.a = new h11(this, windowInsets);
            return;
        }
        if (i >= 34) {
            this.a = new f11(this, windowInsets);
            return;
        }
        if (i >= 31) {
            this.a = new e11(this, windowInsets);
            return;
        }
        if (i >= 30) {
            this.a = new d11(this, windowInsets);
            return;
        }
        if (i >= 29) {
            this.a = new c11(this, windowInsets);
        } else if (i >= 28) {
            this.a = new b11(this, windowInsets);
        } else {
            this.a = new a11(this, windowInsets);
        }
    }

    public static d20 e(d20 d20Var, int i, int i2, int i3, int i4) {
        int max = Math.max(0, d20Var.a - i);
        int max2 = Math.max(0, d20Var.b - i2);
        int max3 = Math.max(0, d20Var.c - i3);
        int max4 = Math.max(0, d20Var.d - i4);
        if (max == i && max2 == i2 && max3 == i3 && max4 == i4) {
            return d20Var;
        }
        return d20.b(max, max2, max3, max4);
    }

    public static m11 g(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        m11 m11Var = new m11(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = ry0.a;
            m11 a = ky0.a(view);
            i11 i11Var = m11Var.a;
            i11Var.u(a);
            View rootView = view.getRootView();
            i11Var.d(rootView);
            i11Var.n(rootView);
            i11Var.o();
            i11Var.w(view.getWindowSystemUiVisibility());
        }
        return m11Var;
    }

    public final int a() {
        return this.a.l().d;
    }

    public final int b() {
        return this.a.l().a;
    }

    public final int c() {
        return this.a.l().c;
    }

    public final int d() {
        return this.a.l().b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m11)) {
            return false;
        }
        return Objects.equals(this.a, ((m11) obj).a);
    }

    public final WindowInsets f() {
        i11 i11Var = this.a;
        if (i11Var instanceof z01) {
            return ((z01) i11Var).c;
        }
        return null;
    }

    public final int hashCode() {
        i11 i11Var = this.a;
        if (i11Var == null) {
            return 0;
        }
        return i11Var.hashCode();
    }

    public m11() {
        this.a = new i11(this);
    }
}
