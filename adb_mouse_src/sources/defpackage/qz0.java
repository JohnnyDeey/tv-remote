package defpackage;

import android.graphics.Matrix;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public class qz0 extends mi0 {
    public static boolean d = true;
    public static boolean e = true;
    public static boolean f = true;
    public static boolean g = true;

    public void k0(View view, int i, int i2, int i3, int i4) {
        if (f) {
            try {
                oz0.a(view, i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                f = false;
            }
        }
    }

    public void l0(View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            if (!mi0.c) {
                try {
                    Field declaredField = View.class.getDeclaredField("mViewFlags");
                    mi0.b = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException unused) {
                    Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
                }
                mi0.c = true;
            }
            Field field = mi0.b;
            if (field != null) {
                try {
                    mi0.b.setInt(view, (field.getInt(view) & (-13)) | i);
                    return;
                } catch (IllegalAccessException unused2) {
                    return;
                }
            }
            return;
        }
        if (g) {
            try {
                pz0.a(view, i);
            } catch (NoSuchMethodError unused3) {
                g = false;
            }
        }
    }

    public void m0(View view, Matrix matrix) {
        if (d) {
            try {
                nz0.b(view, matrix);
            } catch (NoSuchMethodError unused) {
                d = false;
            }
        }
    }

    public void n0(ViewGroup viewGroup, Matrix matrix) {
        if (e) {
            try {
                nz0.c(viewGroup, matrix);
            } catch (NoSuchMethodError unused) {
                e = false;
            }
        }
    }
}
