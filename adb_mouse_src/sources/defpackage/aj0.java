package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import androidx.lifecycle.a;
import defpackage.cj0;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public abstract class aj0 {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, l50 l50Var) {
        a e;
        l50Var.getClass();
        if ((activity instanceof s50) && (e = ((s50) activity).e()) != null) {
            e.d(l50Var);
        }
    }

    public static void b(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            cj0.a.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new cj0.a());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new Fragment(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
