package androidx.activity;

import android.view.inputmethod.InputMethodManager;
import defpackage.l50;
import defpackage.p50;
import defpackage.s50;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
final class ImmLeaksCleaner implements p50 {
    public static int c;

    @Override // defpackage.p50
    public final void c(s50 s50Var, l50 l50Var) {
        if (l50Var == l50.ON_DESTROY) {
            if (c == 0) {
                try {
                    c = 2;
                    InputMethodManager.class.getDeclaredField("mServedView").setAccessible(true);
                    InputMethodManager.class.getDeclaredField("mNextServedView").setAccessible(true);
                    InputMethodManager.class.getDeclaredField("mH").setAccessible(true);
                    c = 1;
                } catch (NoSuchFieldException unused) {
                }
            }
            if (c != 1) {
            } else {
                throw null;
            }
        }
    }
}
