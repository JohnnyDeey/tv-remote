package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.animation.Interpolator;
import java.util.Objects;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class l01 implements View.OnApplyWindowInsetsListener {
    public final e20 a;
    public m11 b;

    public l01(View view, e20 e20Var) {
        m11 m11Var;
        y01 r01Var;
        this.a = e20Var;
        WeakHashMap weakHashMap = ry0.a;
        m11 a = ky0.a(view);
        if (a != null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 36) {
                r01Var = new x01(a);
            } else if (i >= 35) {
                r01Var = new w01(a);
            } else if (i >= 34) {
                r01Var = new v01(a);
            } else if (i >= 31) {
                r01Var = new u01(a);
            } else if (i >= 30) {
                r01Var = new t01(a);
            } else if (i >= 29) {
                r01Var = new s01(a);
            } else {
                r01Var = new r01(a);
            }
            m11Var = r01Var.b();
        } else {
            m11Var = null;
        }
        this.b = m11Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        Interpolator interpolator;
        long j;
        int[] iArr;
        boolean z;
        boolean z2;
        if (!view.isLaidOut()) {
            this.b = m11.g(view, windowInsets);
            return m01.i(view, windowInsets);
        }
        m11 g = m11.g(view, windowInsets);
        i11 i11Var = g.a;
        if (this.b == null) {
            WeakHashMap weakHashMap = ry0.a;
            this.b = ky0.a(view);
        }
        if (this.b == null) {
            this.b = g;
            return m01.i(view, windowInsets);
        }
        e20 j2 = m01.j(view);
        if (j2 != null && Objects.equals((m11) j2.c, g)) {
            return m01.i(view, windowInsets);
        }
        int[] iArr2 = new int[1];
        int[] iArr3 = new int[1];
        m11 m11Var = this.b;
        int i = 1;
        while (i <= 512) {
            d20 h = i11Var.h(i);
            d20 h2 = m11Var.a.h(i);
            int i2 = h.a;
            int i3 = h.d;
            int i4 = h.c;
            int i5 = h.b;
            int i6 = h2.a;
            int i7 = h2.d;
            int i8 = h2.c;
            int i9 = h2.b;
            if (i2 <= i6 && i5 <= i9 && i4 <= i8 && i3 <= i7) {
                iArr = iArr2;
                z = false;
            } else {
                iArr = iArr2;
                z = true;
            }
            if (i2 >= i6 && i5 >= i9 && i4 >= i8 && i3 >= i7) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z != z2) {
                if (z) {
                    iArr[0] = iArr[0] | i;
                } else {
                    iArr3[0] = iArr3[0] | i;
                }
            }
            i <<= 1;
            iArr2 = iArr;
        }
        int i10 = iArr2[0];
        int i11 = iArr3[0];
        int i12 = i10 | i11;
        if (i12 == 0) {
            this.b = g;
            return m01.i(view, windowInsets);
        }
        m11 m11Var2 = this.b;
        if ((i10 & 8) != 0) {
            interpolator = m01.e;
        } else if ((i11 & 8) != 0) {
            interpolator = m01.f;
        } else if ((i10 & 519) != 0) {
            interpolator = m01.g;
        } else if ((i11 & 519) != 0) {
            interpolator = m01.h;
        } else {
            interpolator = null;
        }
        if ((i12 & 8) != 0) {
            j = 160;
        } else {
            j = 250;
        }
        q01 q01Var = new q01(i12, interpolator, j);
        q01Var.a.d(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(q01Var.a.a());
        d20 h3 = i11Var.h(i12);
        d20 h4 = m11Var2.a.h(i12);
        int min = Math.min(h3.a, h4.a);
        int i13 = h3.b;
        int i14 = h4.b;
        int min2 = Math.min(i13, i14);
        int i15 = h3.c;
        int i16 = h4.c;
        int min3 = Math.min(i15, i16);
        int i17 = h3.d;
        int i18 = h4.d;
        jp0 jp0Var = new jp0(d20.b(min, min2, min3, Math.min(i17, i18)), 5, d20.b(Math.max(h3.a, h4.a), Math.max(i13, i14), Math.max(i15, i16), Math.max(i17, i18)));
        m01.f(view, g, false);
        duration.addUpdateListener(new k01(q01Var, g, m11Var2, i12, view));
        duration.addListener(new yt0(q01Var, view));
        ld0.a(view, new gj0(view, q01Var, jp0Var, duration));
        this.b = g;
        return m01.i(view, windowInsets);
    }
}
