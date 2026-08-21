package defpackage;

import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class pq {
    public static final HashMap a;
    public static final HashMap b;

    static {
        HashMap hashMap = new HashMap();
        a = hashMap;
        HashMap hashMap2 = new HashMap();
        b = hashMap2;
        s sVar = kb0.a;
        hashMap.put("SHA-256", sVar);
        s sVar2 = kb0.c;
        hashMap.put("SHA-512", sVar2);
        s sVar3 = kb0.g;
        hashMap.put("SHAKE128", sVar3);
        s sVar4 = kb0.h;
        hashMap.put("SHAKE256", sVar4);
        hashMap2.put(sVar, "SHA-256");
        hashMap2.put(sVar2, "SHA-512");
        hashMap2.put(sVar3, "SHAKE128");
        hashMap2.put(sVar4, "SHAKE256");
    }

    public static mq a(s sVar) {
        if (sVar.m(kb0.a)) {
            return new fk0();
        }
        if (sVar.m(kb0.c)) {
            return new gk0(1);
        }
        if (sVar.m(kb0.g)) {
            return new ik0(128);
        }
        if (sVar.m(kb0.h)) {
            return new ik0(256);
        }
        c.r(sVar, "unrecognized digest OID: ");
        return null;
    }

    public static s b(String str) {
        s sVar = (s) a.get(str);
        if (sVar != null) {
            return sVar;
        }
        c.r(str, "unrecognized digest name: ");
        return null;
    }
}
