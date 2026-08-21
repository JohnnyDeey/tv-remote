package defpackage;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public abstract class z5 {
    public static OnBackInvokedDispatcher a(Activity activity) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
        return onBackInvokedDispatcher;
    }

    public static OnBackInvokedCallback b(Object obj, g6 g6Var) {
        Objects.requireNonNull(g6Var);
        y5 y5Var = new y5(0, g6Var);
        l1.f(obj).registerOnBackInvokedCallback(1000000, y5Var);
        return y5Var;
    }

    public static void c(Object obj, Object obj2) {
        l1.f(obj).unregisterOnBackInvokedCallback(l1.c(obj2));
    }
}
