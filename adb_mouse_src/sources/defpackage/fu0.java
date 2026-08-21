package defpackage;

import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import svarzee.android.apps.adb_mouse.R;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public abstract class fu0 {
    public static final m9 a;
    public static final ThreadLocal b;
    public static final ArrayList c;

    /* JADX WARN: Type inference failed for: r0v0, types: [bu0, m9] */
    static {
        ?? bu0Var = new bu0();
        bu0Var.C = new ArrayList();
        bu0Var.F = false;
        bu0Var.G = 0;
        bu0Var.D = false;
        bu0Var.I(new bv(2));
        bu0Var.I(new bu0());
        bu0Var.I(new bv(1));
        a = bu0Var;
        b = new ThreadLocal();
        c = new ArrayList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [eu0, android.view.ViewTreeObserver$OnPreDrawListener, java.lang.Object, android.view.View$OnAttachStateChangeListener] */
    public static void a(FrameLayout frameLayout, bu0 bu0Var) {
        ArrayList arrayList = c;
        if (!arrayList.contains(frameLayout) && frameLayout.isLaidOut()) {
            arrayList.add(frameLayout);
            if (bu0Var == null) {
                bu0Var = a;
            }
            bu0 clone = bu0Var.clone();
            ArrayList arrayList2 = (ArrayList) b().get(frameLayout);
            if (arrayList2 != null && arrayList2.size() > 0) {
                int size = arrayList2.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList2.get(i);
                    i++;
                    ((bu0) obj).w(frameLayout);
                }
            }
            clone.h(frameLayout, true);
            if (frameLayout.getTag(R.id.transition_current_scene) == null) {
                frameLayout.setTag(R.id.transition_current_scene, null);
                ?? obj2 = new Object();
                obj2.c = clone;
                obj2.d = frameLayout;
                frameLayout.addOnAttachStateChangeListener(obj2);
                frameLayout.getViewTreeObserver().addOnPreDrawListener(obj2);
                return;
            }
            c.a();
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [n8, java.lang.Object, io0] */
    public static n8 b() {
        n8 n8Var;
        ThreadLocal threadLocal = b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (n8Var = (n8) weakReference.get()) != null) {
            return n8Var;
        }
        ?? io0Var = new io0(0);
        threadLocal.set(new WeakReference(io0Var));
        return io0Var;
    }
}
