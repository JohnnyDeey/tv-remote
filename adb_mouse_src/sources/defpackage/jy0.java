package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import svarzee.android.apps.adb_mouse.R;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public abstract class jy0 {
    public static void a(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static m11 b(View view, m11 m11Var, Rect rect) {
        WindowInsets f = m11Var.f();
        if (f != null) {
            return m11.g(view, view.computeSystemWindowInsets(f, rect));
        }
        rect.setEmpty();
        return m11Var;
    }

    public static void c(View view, ad0 ad0Var) {
        iy0 iy0Var;
        if (ad0Var != null) {
            iy0Var = new iy0(view, ad0Var);
        } else {
            iy0Var = null;
        }
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, iy0Var);
        }
        if (view.getTag(R.id.tag_compat_insets_dispatch) != null) {
            return;
        }
        if (iy0Var != null) {
            view.setOnApplyWindowInsetsListener(iy0Var);
        } else {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        }
    }
}
