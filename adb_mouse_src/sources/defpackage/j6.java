package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;
import svarzee.android.apps.adb_mouse.R;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class j6 {
    public static final PorterDuff.Mode b = PorterDuff.Mode.SRC_IN;
    public static j6 c;
    public lj0 a;

    public static synchronized j6 a() {
        j6 j6Var;
        synchronized (j6.class) {
            try {
                if (c == null) {
                    d();
                }
                j6Var = c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return j6Var;
    }

    public static synchronized PorterDuffColorFilter c(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter e;
        synchronized (j6.class) {
            e = lj0.e(i, mode);
        }
        return e;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, j6] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, i6] */
    /* JADX WARN: Type inference failed for: r3v5, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r3v9, types: [int[], java.io.Serializable] */
    public static synchronized void d() {
        synchronized (j6.class) {
            if (c == null) {
                ?? obj = new Object();
                c = obj;
                obj.a = lj0.b();
                lj0 lj0Var = c.a;
                ?? obj2 = new Object();
                obj2.a = new int[]{2131165300, 2131165298, 2131165224};
                obj2.b = new int[]{2131165248, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
                obj2.c = new int[]{2131165297, 2131165299, 2131165241, R.drawable.abc_text_cursor_material, 2131165294, 2131165295, 2131165296};
                obj2.d = new int[]{2131165273, R.drawable.abc_cab_background_internal_bg, 2131165272};
                obj2.e = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
                obj2.f = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
                synchronized (lj0Var) {
                    lj0Var.e = obj2;
                }
            }
        }
    }

    public static void e(Drawable drawable, as0 as0Var, int[] iArr) {
        ColorStateList colorStateList;
        PorterDuff.Mode mode;
        PorterDuff.Mode mode2 = lj0.f;
        int[] state = drawable.getState();
        if (drawable.mutate() == drawable) {
            if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            boolean z = as0Var.d;
            if (!z && !as0Var.c) {
                drawable.clearColorFilter();
                return;
            }
            PorterDuffColorFilter porterDuffColorFilter = null;
            if (z) {
                colorStateList = (ColorStateList) as0Var.e;
            } else {
                colorStateList = null;
            }
            if (as0Var.c) {
                mode = (PorterDuff.Mode) as0Var.f;
            } else {
                mode = lj0.f;
            }
            if (colorStateList != null && mode != null) {
                porterDuffColorFilter = lj0.e(colorStateList.getColorForState(iArr, 0), mode);
            }
            drawable.setColorFilter(porterDuffColorFilter);
            return;
        }
        Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
    }

    public final synchronized Drawable b(Context context, int i) {
        return this.a.c(context, i);
    }
}
