package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class mh {
    public final HashMap a = new HashMap();
    public final HashMap b;

    public mh(HashMap hashMap) {
        this.b = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            l50 l50Var = (l50) entry.getValue();
            List list = (List) this.a.get(l50Var);
            if (list == null) {
                list = new ArrayList();
                this.a.put(l50Var, list);
            }
            list.add((nh) entry.getKey());
        }
    }

    public static void a(List list, s50 s50Var, l50 l50Var, r50 r50Var) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                nh nhVar = (nh) list.get(size);
                Method method = nhVar.b;
                try {
                    int i = nhVar.a;
                    if (i != 0) {
                        if (i != 1) {
                            if (i == 2) {
                                method.invoke(r50Var, s50Var, l50Var);
                            }
                        } else {
                            method.invoke(r50Var, s50Var);
                        }
                    } else {
                        method.invoke(r50Var, null);
                    }
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (InvocationTargetException e2) {
                    f40.k("Failed to call observer method", e2.getCause());
                    return;
                }
            }
        }
    }
}
