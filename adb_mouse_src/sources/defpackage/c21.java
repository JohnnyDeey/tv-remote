package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class c21 {
    public static final Map e;
    public final so a;
    public final j21 b;
    public final int c;
    public final int d;

    static {
        HashMap hashMap = new HashMap();
        s sVar = kb0.a;
        hashMap.put(1, new c21(20, 2, sVar));
        qo0.t(20, 4, sVar, hashMap, 2);
        qo0.t(40, 2, sVar, hashMap, 3);
        qo0.t(40, 4, sVar, hashMap, 4);
        qo0.t(40, 8, sVar, hashMap, 5);
        qo0.t(60, 3, sVar, hashMap, 6);
        qo0.t(60, 6, sVar, hashMap, 7);
        qo0.t(60, 12, sVar, hashMap, 8);
        s sVar2 = kb0.c;
        hashMap.put(9, new c21(20, 2, sVar2));
        qo0.t(20, 4, sVar2, hashMap, 10);
        qo0.t(40, 2, sVar2, hashMap, 11);
        qo0.t(40, 4, sVar2, hashMap, 12);
        qo0.t(40, 8, sVar2, hashMap, 13);
        qo0.t(60, 3, sVar2, hashMap, 14);
        qo0.t(60, 6, sVar2, hashMap, 15);
        qo0.t(60, 12, sVar2, hashMap, 16);
        s sVar3 = kb0.g;
        hashMap.put(17, new c21(20, 2, sVar3));
        qo0.t(20, 4, sVar3, hashMap, 18);
        qo0.t(40, 2, sVar3, hashMap, 19);
        qo0.t(40, 4, sVar3, hashMap, 20);
        qo0.t(40, 8, sVar3, hashMap, 21);
        qo0.t(60, 3, sVar3, hashMap, 22);
        qo0.t(60, 6, sVar3, hashMap, 23);
        qo0.t(60, 12, sVar3, hashMap, 24);
        s sVar4 = kb0.h;
        hashMap.put(25, new c21(20, 2, sVar4));
        qo0.t(20, 4, sVar4, hashMap, 26);
        qo0.t(40, 2, sVar4, hashMap, 27);
        qo0.t(40, 4, sVar4, hashMap, 28);
        qo0.t(40, 8, sVar4, hashMap, 29);
        qo0.t(60, 3, sVar4, hashMap, 30);
        qo0.t(60, 6, sVar4, hashMap, 31);
        qo0.t(60, 12, sVar4, hashMap, 32);
        e = Collections.unmodifiableMap(hashMap);
    }

    public c21(int i, int i2, s sVar) {
        this.c = i;
        this.d = i2;
        if (i >= 2) {
            if (i % i2 == 0) {
                int i3 = i / i2;
                if (i3 != 1) {
                    j21 j21Var = new j21(i3, sVar);
                    this.b = j21Var;
                    int i4 = j21Var.g.c;
                    String str = j21Var.e;
                    if (str != null) {
                        this.a = (so) so.c.get(so.a(str, j21Var.f, j21Var.d, i4, i, i2));
                        return;
                    } else {
                        Map map = so.c;
                        c.g("algorithmName == null");
                        throw null;
                    }
                }
                c.k("height / layers must be greater than 1");
                throw null;
            }
            c.k("layers must divide totalHeight without remainder");
            throw null;
        }
        c.k("totalHeight must be > 1");
        throw null;
    }

    public c21(int i, int i2, mq mqVar) {
        this(i, i2, pq.b(mqVar.a()));
    }
}
