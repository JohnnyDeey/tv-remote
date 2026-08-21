package defpackage;

import java.io.Serializable;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class ob implements Serializable {
    public final TreeMap c = new TreeMap();
    public final transient long d;

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00cb, code lost:
    
        if ((r26 % ((long) java.lang.Math.pow(r7, r6 + 1))) == 0) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ob(defpackage.c21 r29, long r30, byte[] r32, byte[] r33) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ob.<init>(c21, long, byte[], byte[]):void");
    }

    public final ob a(s sVar) {
        ob obVar = new ob(this.d);
        TreeMap treeMap = this.c;
        for (Integer num : treeMap.keySet()) {
            nb nbVar = (nb) treeMap.get(num);
            nbVar.getClass();
            obVar.c.put(num, new nb(nbVar, sVar));
        }
        return obVar;
    }

    public ob(ob obVar, long j) {
        for (Integer num : obVar.c.keySet()) {
            this.c.put(num, new nb((nb) obVar.c.get(num)));
        }
        this.d = j;
    }

    public ob(long j) {
        this.d = j;
    }
}
