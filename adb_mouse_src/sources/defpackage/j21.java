package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class j21 {
    public static final Map h;
    public final to a;
    public final int b;
    public final int c;
    public final int d;
    public final String e;
    public final int f;
    public final qz g;

    static {
        HashMap hashMap = new HashMap();
        s sVar = kb0.a;
        hashMap.put(1, new j21(10, sVar));
        hashMap.put(2, new j21(16, sVar));
        hashMap.put(3, new j21(20, sVar));
        s sVar2 = kb0.c;
        hashMap.put(4, new j21(10, sVar2));
        hashMap.put(5, new j21(16, sVar2));
        hashMap.put(6, new j21(20, sVar2));
        s sVar3 = kb0.g;
        hashMap.put(7, new j21(10, sVar3));
        hashMap.put(8, new j21(16, sVar3));
        hashMap.put(9, new j21(20, sVar3));
        s sVar4 = kb0.h;
        hashMap.put(10, new j21(10, sVar4));
        hashMap.put(11, new j21(16, sVar4));
        hashMap.put(12, new j21(20, sVar4));
        h = Collections.unmodifiableMap(hashMap);
    }

    public j21(int i, s sVar) {
        if (i >= 2) {
            if (sVar != null) {
                this.b = i;
                int i2 = 2;
                while (true) {
                    int i3 = this.b;
                    if (i2 <= i3) {
                        if ((i3 - i2) % 2 == 0) {
                            this.c = i2;
                            String str = (String) pq.b.get(sVar);
                            if (str != null) {
                                this.e = str;
                                qz qzVar = new qz(sVar);
                                this.g = qzVar;
                                int i4 = qzVar.a;
                                this.f = i4;
                                int i5 = qzVar.b;
                                this.d = i5;
                                this.a = (to) to.c.get(to.a(str, i4, i5, qzVar.c, i));
                                return;
                            }
                            c.r(sVar, "unrecognized digest oid: ");
                            throw null;
                        }
                        i2++;
                    } else {
                        c.o("should never happen...");
                        throw null;
                    }
                }
            } else {
                c.g("digest == null");
                throw null;
            }
        } else {
            c.k("height must be >= 2");
            throw null;
        }
    }

    public j21(int i, mq mqVar) {
        this(i, pq.b(mqVar.a()));
    }
}
