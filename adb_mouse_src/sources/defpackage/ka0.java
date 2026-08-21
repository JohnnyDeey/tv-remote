package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class ka0 extends t60 implements y90 {
    public static final Method F;
    public i81 E;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                F = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // defpackage.t60
    public final wr a(Context context, boolean z) {
        ja0 ja0Var = new ja0(context, z);
        ja0Var.setHoverListener(this);
        return ja0Var;
    }

    @Override // defpackage.y90
    public final void f(w90 w90Var, MenuItem menuItem) {
        i81 i81Var = this.E;
        if (i81Var != null) {
            i81Var.f(w90Var, menuItem);
        }
    }

    @Override // defpackage.y90
    public final void j(w90 w90Var, z90 z90Var) {
        i81 i81Var = this.E;
        if (i81Var != null) {
            i81Var.j(w90Var, z90Var);
        }
    }
}
