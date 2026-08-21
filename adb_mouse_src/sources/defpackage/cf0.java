package defpackage;

import android.util.SparseArray;
import java.util.HashMap;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public abstract class cf0 {
    public static final SparseArray a = new SparseArray();
    public static final HashMap b;

    static {
        HashMap hashMap = new HashMap();
        b = hashMap;
        hashMap.put(af0.c, 0);
        hashMap.put(af0.d, 1);
        hashMap.put(af0.e, 2);
        for (af0 af0Var : hashMap.keySet()) {
            a.append(((Integer) b.get(af0Var)).intValue(), af0Var);
        }
    }

    public static int a(af0 af0Var) {
        Integer num = (Integer) b.get(af0Var);
        if (num != null) {
            return num.intValue();
        }
        c.p(af0Var, "PriorityMapping is missing known Priority value ");
        return 0;
    }

    public static af0 b(int i) {
        af0 af0Var = (af0) a.get(i);
        if (af0Var != null) {
            return af0Var;
        }
        c.k(qo0.m("Unknown Priority for value ", i));
        return null;
    }
}
