package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.SavedStateHandleController;
import androidx.lifecycle.a;
import defpackage.az0;
import defpackage.bz0;
import defpackage.c;
import defpackage.d5;
import defpackage.f40;
import defpackage.h50;
import defpackage.l5;
import defpackage.l50;
import defpackage.p50;
import defpackage.qo0;
import defpackage.s50;
import defpackage.wl0;
import defpackage.yl0;
import defpackage.yy0;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class Recreator implements p50 {
    public final yl0 c;

    public Recreator(yl0 yl0Var) {
        this.c = yl0Var;
    }

    @Override // defpackage.p50
    public final void c(s50 s50Var, l50 l50Var) {
        Object obj;
        boolean z;
        if (l50Var == l50.ON_CREATE) {
            s50Var.e().f(this);
            Bundle c = this.c.a().c("androidx.savedstate.Restarter");
            if (c != null) {
                ArrayList<String> stringArrayList = c.getStringArrayList("classes_to_restore");
                if (stringArrayList != null) {
                    int size = stringArrayList.size();
                    int i = 0;
                    while (i < size) {
                        String str = stringArrayList.get(i);
                        i++;
                        String str2 = str;
                        try {
                            Class<? extends U> asSubclass = Class.forName(str2, false, Recreator.class.getClassLoader()).asSubclass(wl0.class);
                            asSubclass.getClass();
                            try {
                                Constructor declaredConstructor = asSubclass.getDeclaredConstructor(null);
                                declaredConstructor.setAccessible(true);
                                try {
                                    Object newInstance = declaredConstructor.newInstance(null);
                                    newInstance.getClass();
                                    yl0 yl0Var = this.c;
                                    if (yl0Var instanceof bz0) {
                                        az0 d = ((bz0) yl0Var).d();
                                        l5 a = yl0Var.a();
                                        d.getClass();
                                        Iterator it = new HashSet(d.a.keySet()).iterator();
                                        while (it.hasNext()) {
                                            String str3 = (String) it.next();
                                            str3.getClass();
                                            yy0 yy0Var = (yy0) d.a.get(str3);
                                            yy0Var.getClass();
                                            a e = yl0Var.e();
                                            a.getClass();
                                            e.getClass();
                                            HashMap hashMap = yy0Var.a;
                                            if (hashMap == null) {
                                                obj = null;
                                            } else {
                                                synchronized (hashMap) {
                                                    obj = yy0Var.a.get("androidx.lifecycle.savedstate.vm.tag");
                                                }
                                            }
                                            SavedStateHandleController savedStateHandleController = (SavedStateHandleController) obj;
                                            if (savedStateHandleController != null && !(z = savedStateHandleController.c)) {
                                                if (z) {
                                                    c.o("Already attached to lifecycleOwner");
                                                    return;
                                                } else {
                                                    savedStateHandleController.c = true;
                                                    e.a(savedStateHandleController);
                                                    throw null;
                                                }
                                            }
                                        }
                                        if (!new HashSet(d.a.keySet()).isEmpty()) {
                                            if (a.e) {
                                                d5 d5Var = (d5) a.b;
                                                if (d5Var == null) {
                                                    d5Var = new d5(a);
                                                }
                                                a.b = d5Var;
                                                try {
                                                    h50.class.getDeclaredConstructor(null);
                                                    d5 d5Var2 = (d5) a.b;
                                                    if (d5Var2 != null) {
                                                        ((LinkedHashSet) d5Var2.b).add(h50.class.getName());
                                                    }
                                                } catch (NoSuchMethodException e2) {
                                                    throw new IllegalArgumentException("Class " + h50.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                                                }
                                            } else {
                                                c.o("Can not perform this action after onSaveInstanceState");
                                                return;
                                            }
                                        }
                                    } else {
                                        c.o("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
                                        return;
                                    }
                                } catch (Exception e3) {
                                    throw new RuntimeException("Failed to instantiate " + str2, e3);
                                }
                            } catch (NoSuchMethodException e4) {
                                throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e4);
                            }
                        } catch (ClassNotFoundException e5) {
                            f40.k(qo0.r("Class ", str2, " wasn't found"), e5);
                            return;
                        }
                    }
                    return;
                }
                c.o("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                return;
            }
            return;
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }
}
