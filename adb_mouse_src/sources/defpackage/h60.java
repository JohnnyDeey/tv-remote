package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class h60 extends AbstractSet {
    public final /* synthetic */ int c;
    public final /* synthetic */ Map d;

    public /* synthetic */ h60(Map map, int i) {
        this.c = i;
        this.d = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        int i = this.c;
        Map map = this.d;
        switch (i) {
            case 0:
                ((j60) map).clear();
                return;
            case 1:
                ((j60) map).clear();
                return;
            default:
                super.clear();
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003a A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean contains(java.lang.Object r4) {
        /*
            r3 = this;
            int r0 = r3.c
            java.util.Map r1 = r3.d
            switch(r0) {
                case 0: goto L13;
                case 1: goto Lc;
                default: goto L7;
            }
        L7:
            boolean r3 = super.contains(r4)
            return r3
        Lc:
            j60 r1 = (defpackage.j60) r1
            boolean r3 = r1.containsKey(r4)
            return r3
        L13:
            boolean r3 = r4 instanceof java.util.Map.Entry
            r0 = 0
            if (r3 == 0) goto L3b
            j60 r1 = (defpackage.j60) r1
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r3 = r4.getKey()
            r2 = 0
            if (r3 == 0) goto L28
            i60 r3 = r1.a(r3, r0)     // Catch: java.lang.ClassCastException -> L28
            goto L29
        L28:
            r3 = r2
        L29:
            if (r3 == 0) goto L38
            java.lang.Object r1 = r3.j
            java.lang.Object r4 = r4.getValue()
            boolean r4 = java.util.Objects.equals(r1, r4)
            if (r4 == 0) goto L38
            r2 = r3
        L38:
            if (r2 == 0) goto L3b
            r0 = 1
        L3b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h60.contains(java.lang.Object):boolean");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.c;
        Map map = this.d;
        switch (i) {
            case 0:
                return new g60((j60) map, 0);
            case 1:
                return new g60((j60) map, 1);
            default:
                return new l8((n8) map);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean remove(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.c
            r1 = 0
            java.util.Map r2 = r5.d
            r3 = 0
            r4 = 1
            switch(r0) {
                case 0: goto L20;
                case 1: goto Lf;
                default: goto La;
            }
        La:
            boolean r5 = super.remove(r6)
            return r5
        Lf:
            j60 r2 = (defpackage.j60) r2
            if (r6 == 0) goto L17
            i60 r1 = r2.a(r6, r3)     // Catch: java.lang.ClassCastException -> L17
        L17:
            if (r1 == 0) goto L1c
            r2.c(r1, r4)
        L1c:
            if (r1 == 0) goto L1f
            r3 = r4
        L1f:
            return r3
        L20:
            j60 r2 = (defpackage.j60) r2
            boolean r5 = r6 instanceof java.util.Map.Entry
            if (r5 != 0) goto L27
            goto L4b
        L27:
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r5 = r6.getKey()
            if (r5 == 0) goto L34
            i60 r5 = r2.a(r5, r3)     // Catch: java.lang.ClassCastException -> L34
            goto L35
        L34:
            r5 = r1
        L35:
            if (r5 == 0) goto L44
            java.lang.Object r0 = r5.j
            java.lang.Object r6 = r6.getValue()
            boolean r6 = java.util.Objects.equals(r0, r6)
            if (r6 == 0) goto L44
            r1 = r5
        L44:
            if (r1 != 0) goto L47
            goto L4b
        L47:
            r2.c(r1, r4)
            r3 = r4
        L4b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h60.remove(java.lang.Object):boolean");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i = this.c;
        Map map = this.d;
        switch (i) {
            case 0:
                return ((j60) map).f;
            case 1:
                return ((j60) map).f;
            default:
                return ((n8) map).e;
        }
    }
}
