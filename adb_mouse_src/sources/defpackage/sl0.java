package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public class sl0 implements Iterable {
    public pl0 c;
    public pl0 d;
    public final WeakHashMap e = new WeakHashMap();
    public int f = 0;

    public pl0 b(Object obj) {
        pl0 pl0Var = this.c;
        while (pl0Var != null && !pl0Var.c.equals(obj)) {
            pl0Var = pl0Var.e;
        }
        return pl0Var;
    }

    public Object c(Object obj) {
        pl0 b = b(obj);
        if (b == null) {
            return null;
        }
        this.f--;
        WeakHashMap weakHashMap = this.e;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((rl0) it.next()).a(b);
            }
        }
        pl0 pl0Var = b.f;
        pl0 pl0Var2 = b.e;
        if (pl0Var != null) {
            pl0Var.e = pl0Var2;
        } else {
            this.c = pl0Var2;
        }
        pl0 pl0Var3 = b.e;
        if (pl0Var3 != null) {
            pl0Var3.f = pl0Var;
        } else {
            this.d = pl0Var;
        }
        b.e = null;
        b.f = null;
        return b.d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0048, code lost:
    
        if (r1.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (((defpackage.ol0) r6).hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0052, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0053, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 1
            if (r6 != r5) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof defpackage.sl0
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            sl0 r6 = (defpackage.sl0) r6
            int r1 = r5.f
            int r3 = r6.f
            if (r1 == r3) goto L13
            return r2
        L13:
            java.util.Iterator r5 = r5.iterator()
            java.util.Iterator r6 = r6.iterator()
        L1b:
            r1 = r5
            ol0 r1 = (defpackage.ol0) r1
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L44
            r3 = r6
            ol0 r3 = (defpackage.ol0) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L44
            java.lang.Object r1 = r1.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r3 = r3.next()
            if (r1 != 0) goto L3b
            if (r3 != 0) goto L43
        L3b:
            if (r1 == 0) goto L1b
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L1b
        L43:
            return r2
        L44:
            boolean r5 = r1.hasNext()
            if (r5 != 0) goto L53
            ol0 r6 = (defpackage.ol0) r6
            boolean r5 = r6.hasNext()
            if (r5 != 0) goto L53
            return r0
        L53:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sl0.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (true) {
            ol0 ol0Var = (ol0) it;
            if (ol0Var.hasNext()) {
                i += ((Map.Entry) ol0Var.next()).hashCode();
            } else {
                return i;
            }
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        ol0 ol0Var = new ol0(this.c, this.d, 0);
        this.e.put(ol0Var, Boolean.FALSE);
        return ol0Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            ol0 ol0Var = (ol0) it;
            if (ol0Var.hasNext()) {
                sb.append(((Map.Entry) ol0Var.next()).toString());
                if (ol0Var.hasNext()) {
                    sb.append(", ");
                }
            } else {
                sb.append("]");
                return sb.toString();
            }
        }
    }
}
