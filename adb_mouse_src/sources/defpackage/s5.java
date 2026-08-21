package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public abstract class s5 {
    public static final q5 c = new q5(new Object());
    public static final int d = -100;
    public static c70 e = null;
    public static c70 f = null;
    public static Boolean g = null;
    public static boolean h = false;
    public static final p8 i = new p8(0);
    public static final Object j = new Object();
    public static final Object k = new Object();

    public static boolean b(Context context) {
        if (g == null) {
            try {
                int i2 = d8.c;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) d8.class), c8.a() | 128).metaData;
                if (bundle != null) {
                    g = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                g = Boolean.FALSE;
            }
        }
        return g.booleanValue();
    }

    public static void f(g6 g6Var) {
        synchronized (j) {
            try {
                p8 p8Var = i;
                p8Var.getClass();
                j8 j8Var = new j8(p8Var);
                while (j8Var.hasNext()) {
                    s5 s5Var = (s5) ((WeakReference) j8Var.next()).get();
                    if (s5Var == g6Var || s5Var == null) {
                        j8Var.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void a();

    public abstract void c();

    public abstract void e();

    public abstract boolean g(int i2);

    public abstract void h(int i2);

    public abstract void i(View view);

    public abstract void j(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void l(CharSequence charSequence);
}
