package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public abstract class q80 extends r21 {
    public static int S(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static Map T(td0... td0VarArr) {
        if (td0VarArr.length > 0) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(S(td0VarArr.length));
            for (td0 td0Var : td0VarArr) {
                linkedHashMap.put(td0Var.c, td0Var.d);
            }
            return linkedHashMap;
        }
        return vt.c;
    }

    public static Map U(ArrayList arrayList) {
        int size = arrayList.size();
        if (size != 0) {
            int i = 0;
            if (size != 1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(S(arrayList.size()));
                int size2 = arrayList.size();
                while (i < size2) {
                    Object obj = arrayList.get(i);
                    i++;
                    td0 td0Var = (td0) obj;
                    linkedHashMap.put(td0Var.c, td0Var.d);
                }
                return linkedHashMap;
            }
            td0 td0Var2 = (td0) arrayList.get(0);
            td0Var2.getClass();
            Map singletonMap = Collections.singletonMap(td0Var2.c, td0Var2.d);
            singletonMap.getClass();
            return singletonMap;
        }
        return vt.c;
    }
}
