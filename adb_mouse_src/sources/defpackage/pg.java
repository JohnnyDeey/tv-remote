package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class pg extends mm0 {
    public final he e;
    public final /* synthetic */ AtomicReferenceArray f;

    public pg(long j, pg pgVar, he heVar, int i) {
        super(j, pgVar, i);
        this.e = heVar;
        this.f = new AtomicReferenceArray(je.b * 2);
    }

    @Override // defpackage.mm0
    public final int f() {
        return je.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0047, code lost:
    
        m(r5, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x004a, code lost:
    
        if (r0 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x004c, code lost:
    
        r2.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x004f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:?, code lost:
    
        return;
     */
    @Override // defpackage.mm0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(int r5, defpackage.dl r6) {
        /*
            r4 = this;
            int r6 = defpackage.je.b
            if (r5 < r6) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            if (r0 == 0) goto La
            int r5 = r5 - r6
        La:
            int r6 = r5 * 2
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r4.f
            r1.get(r6)
        L11:
            java.lang.Object r6 = r4.k(r5)
            boolean r1 = r6 instanceof defpackage.a01
            he r2 = r4.e
            r3 = 0
            if (r1 != 0) goto L50
            boolean r1 = r6 instanceof defpackage.b01
            if (r1 == 0) goto L21
            goto L50
        L21:
            ce r1 = defpackage.je.j
            if (r6 == r1) goto L47
            ce r1 = defpackage.je.k
            if (r6 != r1) goto L2a
            goto L47
        L2a:
            ce r1 = defpackage.je.g
            if (r6 == r1) goto L11
            ce r1 = defpackage.je.f
            if (r6 != r1) goto L33
            goto L11
        L33:
            ce r4 = defpackage.je.i
            if (r6 == r4) goto L6a
            ce r4 = defpackage.je.d
            if (r6 != r4) goto L3c
            goto L6a
        L3c:
            ce r4 = defpackage.je.l
            if (r6 != r4) goto L41
            goto L6a
        L41:
            java.lang.String r4 = "unexpected state: "
            defpackage.c.t(r6, r4)
            return
        L47:
            r4.m(r5, r3)
            if (r0 == 0) goto L6a
            r2.getClass()
            return
        L50:
            if (r0 == 0) goto L55
            ce r1 = defpackage.je.j
            goto L57
        L55:
            ce r1 = defpackage.je.k
        L57:
            boolean r6 = r4.j(r6, r5, r1)
            if (r6 == 0) goto L11
            r4.m(r5, r3)
            r6 = r0 ^ 1
            r4.l(r5, r6)
            if (r0 == 0) goto L6a
            r2.getClass()
        L6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pg.g(int, dl):void");
    }

    public final boolean j(Object obj, int i, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i2 = (i * 2) + 1;
        do {
            atomicReferenceArray = this.f;
            if (atomicReferenceArray.compareAndSet(i2, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i2) == obj);
        return false;
    }

    public final Object k(int i) {
        return this.f.get((i * 2) + 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        if (r4 >= r3) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        r5 = r7.get(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
    
        if (r5 != (4611686018427387903L & r1.get(r2))) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
    
        if (r5 != r7.get(r2)) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0048, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004b, code lost:
    
        r3 = r1.get(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
    
        if (r1.compareAndSet(r2, r3, (r3 & 4611686018427387903L) + 4611686018427387904L) == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005a, code lost:
    
        r3 = r7.get(r2);
        r1 = defpackage.he.g;
        r3 = r1.get(r2);
        r13 = r3 & 4611686018427387903L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006d, code lost:
    
        if ((r3 & 4611686018427387904L) == 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006f, code lost:
    
        r15 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0074, code lost:
    
        if (r3 != r13) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007c, code lost:
    
        if (r3 != r7.get(r2)) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007e, code lost:
    
        r3 = r1.get(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0088, code lost:
    
        if (r1.compareAndSet(r2, r3, r3 & 4611686018427387903L) == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008b, code lost:
    
        if (r15 != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008d, code lost:
    
        r1.compareAndSet(r2, r3, 4611686018427387904L + r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0071, code lost:
    
        r15 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001b, code lost:
    
        if (r2.u() != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0025, code lost:
    
        if (r7.get(r2) <= r5) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
    
        r3 = defpackage.je.c;
        r4 = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(int r20, boolean r21) {
        /*
            r19 = this;
            r0 = r19
            if (r21 == 0) goto L93
            he r2 = r0.e
            r2.getClass()
            int r1 = defpackage.je.b
            long r3 = (long) r1
            long r5 = r0.c
            long r5 = r5 * r3
            r1 = r20
            long r3 = (long) r1
            long r5 = r5 + r3
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = defpackage.he.g
            java.util.concurrent.atomic.AtomicLongFieldUpdater r7 = defpackage.he.f
            boolean r3 = r2.u()
            if (r3 == 0) goto L1f
            goto L93
        L1f:
            long r3 = r7.get(r2)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto L1f
            int r3 = defpackage.je.c
            r8 = 0
            r4 = r8
        L2b:
            r9 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            if (r4 >= r3) goto L4b
            long r5 = r7.get(r2)
            long r11 = r1.get(r2)
            long r9 = r9 & r11
            int r9 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r9 != 0) goto L48
            long r9 = r7.get(r2)
            int r5 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r5 != 0) goto L48
            goto L93
        L48:
            int r4 = r4 + 1
            goto L2b
        L4b:
            long r3 = r1.get(r2)
            long r5 = r3 & r9
            r11 = 4611686018427387904(0x4000000000000000, double:2.0)
            long r5 = r5 + r11
            boolean r3 = r1.compareAndSet(r2, r3, r5)
            if (r3 == 0) goto L4b
        L5a:
            long r3 = r7.get(r2)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = defpackage.he.g
            r5 = r3
            long r3 = r1.get(r2)
            long r13 = r3 & r9
            long r15 = r3 & r11
            r17 = 0
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 == 0) goto L71
            r15 = 1
            goto L72
        L71:
            r15 = r8
        L72:
            int r16 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r16 != 0) goto L8b
            long r16 = r7.get(r2)
            int r5 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r5 != 0) goto L8b
        L7e:
            long r3 = r1.get(r2)
            long r5 = r3 & r9
            boolean r3 = r1.compareAndSet(r2, r3, r5)
            if (r3 == 0) goto L7e
            goto L93
        L8b:
            if (r15 != 0) goto L5a
            long r5 = r11 + r13
            r1.compareAndSet(r2, r3, r5)
            goto L5a
        L93:
            r0.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pg.l(int, boolean):void");
    }

    public final void m(int i, Object obj) {
        this.f.set(i * 2, obj);
    }

    public final void n(int i, Object obj) {
        this.f.set((i * 2) + 1, obj);
    }
}
