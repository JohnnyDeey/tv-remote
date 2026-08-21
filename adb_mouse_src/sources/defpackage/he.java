package defpackage;

import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public class he implements hg {
    public static final /* synthetic */ AtomicLongFieldUpdater d = AtomicLongFieldUpdater.newUpdater(he.class, "sendersAndCloseStatus$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater e = AtomicLongFieldUpdater.newUpdater(he.class, "receivers$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater f = AtomicLongFieldUpdater.newUpdater(he.class, "bufferEnd$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater g = AtomicLongFieldUpdater.newUpdater(he.class, "completedExpandBuffersAndPauseFlag$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(he.class, Object.class, "sendSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater i = AtomicReferenceFieldUpdater.newUpdater(he.class, Object.class, "receiveSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater j = AtomicReferenceFieldUpdater.newUpdater(he.class, Object.class, "bufferEndSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater k = AtomicReferenceFieldUpdater.newUpdater(he.class, Object.class, "_closeCause$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater l = AtomicReferenceFieldUpdater.newUpdater(he.class, Object.class, "closeHandler$volatile");
    private volatile /* synthetic */ Object _closeCause$volatile;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    public final int c;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    public he(int i2) {
        long j2;
        this.c = i2;
        if (i2 >= 0) {
            pg pgVar = je.a;
            if (i2 != 0) {
                if (i2 != Integer.MAX_VALUE) {
                    j2 = i2;
                } else {
                    j2 = Long.MAX_VALUE;
                }
            } else {
                j2 = 0;
            }
            this.bufferEnd$volatile = j2;
            this.completedExpandBuffersAndPauseFlag$volatile = f.get(this);
            pg pgVar2 = new pg(0L, null, this, 3);
            this.sendSegment$volatile = pgVar2;
            this.receiveSegment$volatile = pgVar2;
            if (u()) {
                pgVar2 = je.a;
                pgVar2.getClass();
            }
            this.bufferEndSegment$volatile = pgVar2;
            this._closeCause$volatile = je.s;
            return;
        }
        f40.b(qo0.n("Invalid channel capacity: ", i2, ", should be >=0"));
        throw null;
    }

    public static final pg b(he heVar, long j2, pg pgVar) {
        Object u;
        he heVar2;
        pg pgVar2 = je.a;
        ie ieVar = ie.k;
        loop0: while (true) {
            u = k20.u(pgVar, j2, ieVar);
            if (!gi0.h(u)) {
                mm0 g2 = gi0.g(u);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
                    mm0 mm0Var = (mm0) atomicReferenceFieldUpdater.get(heVar);
                    if (mm0Var.c >= g2.c) {
                        break loop0;
                    }
                    if (!g2.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(heVar, mm0Var, g2)) {
                        if (atomicReferenceFieldUpdater.get(heVar) != mm0Var) {
                            if (g2.e()) {
                                g2.d();
                            }
                        }
                    }
                    if (mm0Var.e()) {
                        mm0Var.d();
                    }
                }
            } else {
                break;
            }
        }
        boolean h2 = gi0.h(u);
        AtomicLongFieldUpdater atomicLongFieldUpdater = e;
        if (h2) {
            heVar.h();
            if (pgVar.c * je.b < atomicLongFieldUpdater.get(heVar)) {
                pgVar.a();
                return null;
            }
        } else {
            pg pgVar3 = (pg) gi0.g(u);
            long j3 = pgVar3.c;
            if (j3 > j2) {
                long j4 = je.b * j3;
                while (true) {
                    long j5 = d.get(heVar);
                    long j6 = 1152921504606846975L & j5;
                    if (j6 >= j4) {
                        heVar2 = heVar;
                        break;
                    }
                    heVar2 = heVar;
                    if (d.compareAndSet(heVar2, j5, (((int) (j5 >> 60)) << 60) + j6)) {
                        break;
                    }
                    heVar = heVar2;
                }
                if (j3 * je.b < atomicLongFieldUpdater.get(heVar2)) {
                    pgVar3.a();
                }
            } else {
                return pgVar3;
            }
        }
        return null;
    }

    public static final void c(he heVar, Object obj, ff ffVar) {
        ffVar.e(new sj0(heVar.o()));
    }

    public static final int d(he heVar, pg pgVar, int i2, Object obj, long j2, Object obj2, boolean z) {
        pgVar.m(i2, obj);
        if (z) {
            return heVar.B(pgVar, i2, obj, j2, obj2, z);
        }
        Object k2 = pgVar.k(i2);
        if (k2 == null) {
            if (heVar.e(j2)) {
                if (pgVar.j(null, i2, je.d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (pgVar.j(null, i2, obj2)) {
                    return 2;
                }
            }
        } else if (k2 instanceof a01) {
            pgVar.m(i2, null);
            if (heVar.y(k2, obj)) {
                pgVar.n(i2, je.i);
                return 0;
            }
            ce ceVar = je.k;
            if (pgVar.f.getAndSet((i2 * 2) + 1, ceVar) != ceVar) {
                pgVar.l(i2, true);
                return 5;
            }
            return 5;
        }
        return heVar.B(pgVar, i2, obj, j2, obj2, z);
    }

    public static void r(he heVar) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = g;
        if ((atomicLongFieldUpdater.addAndGet(heVar, 1L) & 4611686018427387904L) == 0) {
            return;
        }
        do {
        } while ((atomicLongFieldUpdater.get(heVar) & 4611686018427387904L) != 0);
    }

    public static boolean z(Object obj) {
        if (obj instanceof ff) {
            ff ffVar = (ff) obj;
            pg pgVar = je.a;
            if (ffVar.B(nw0.a, null) == null) {
                return false;
            }
            ffVar.o();
            return true;
        }
        c.t(obj, "Unexpected waiter: ");
        return false;
    }

    public final Object A(pg pgVar, int i2, long j2, ge geVar) {
        AtomicReferenceArray atomicReferenceArray = pgVar.f;
        Object k2 = pgVar.k(i2);
        AtomicLongFieldUpdater atomicLongFieldUpdater = d;
        if (k2 == null) {
            if (j2 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (geVar == null) {
                    return je.n;
                }
                if (pgVar.j(k2, i2, geVar)) {
                    l();
                    return je.m;
                }
            }
        } else if (k2 == je.d && pgVar.j(k2, i2, je.i)) {
            l();
            Object obj = atomicReferenceArray.get(i2 * 2);
            pgVar.m(i2, null);
            return obj;
        }
        while (true) {
            Object k3 = pgVar.k(i2);
            if (k3 != null && k3 != je.e) {
                if (k3 == je.d) {
                    if (pgVar.j(k3, i2, je.i)) {
                        l();
                        Object obj2 = atomicReferenceArray.get(i2 * 2);
                        pgVar.m(i2, null);
                        return obj2;
                    }
                } else {
                    ce ceVar = je.j;
                    if (k3 == ceVar) {
                        return je.o;
                    }
                    if (k3 == je.h) {
                        return je.o;
                    }
                    if (k3 == je.l) {
                        l();
                        return je.o;
                    }
                    if (k3 != je.g && pgVar.j(k3, i2, je.f)) {
                        boolean z = k3 instanceof b01;
                        if (z) {
                            k3 = ((b01) k3).a;
                        }
                        if (z(k3)) {
                            pgVar.n(i2, je.i);
                            l();
                            Object obj3 = atomicReferenceArray.get(i2 * 2);
                            pgVar.m(i2, null);
                            return obj3;
                        }
                        pgVar.n(i2, ceVar);
                        pgVar.h();
                        if (z) {
                            l();
                        }
                        return je.o;
                    }
                }
            } else if (j2 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (pgVar.j(k3, i2, je.h)) {
                    l();
                    return je.o;
                }
            } else {
                if (geVar == null) {
                    return je.n;
                }
                if (pgVar.j(k3, i2, geVar)) {
                    l();
                    return je.m;
                }
            }
        }
    }

    public final int B(pg pgVar, int i2, Object obj, long j2, Object obj2, boolean z) {
        while (true) {
            Object k2 = pgVar.k(i2);
            if (k2 == null) {
                if (e(j2) && !z) {
                    if (pgVar.j(null, i2, je.d)) {
                        break;
                    }
                } else if (z) {
                    if (pgVar.j(null, i2, je.j)) {
                        pgVar.h();
                        return 4;
                    }
                } else {
                    if (obj2 == null) {
                        return 3;
                    }
                    if (pgVar.j(null, i2, obj2)) {
                        return 2;
                    }
                }
            } else if (k2 == je.e) {
                if (pgVar.j(k2, i2, je.d)) {
                    break;
                }
            } else {
                ce ceVar = je.k;
                if (k2 == ceVar) {
                    pgVar.m(i2, null);
                    return 5;
                }
                if (k2 == je.h) {
                    pgVar.m(i2, null);
                    return 5;
                }
                if (k2 == je.l) {
                    pgVar.m(i2, null);
                    h();
                    return 4;
                }
                pgVar.m(i2, null);
                if (k2 instanceof b01) {
                    k2 = ((b01) k2).a;
                }
                if (y(k2, obj)) {
                    pgVar.n(i2, je.i);
                    return 0;
                }
                if (pgVar.f.getAndSet((i2 * 2) + 1, ceVar) != ceVar) {
                    pgVar.l(i2, true);
                }
                return 5;
            }
        }
        return 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0144 A[RETURN] */
    @Override // defpackage.um0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(defpackage.qk r24, java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.he.a(qk, java.lang.Object):java.lang.Object");
    }

    public final boolean e(long j2) {
        if (j2 >= f.get(this) && j2 >= e.get(this) + this.c) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003d, code lost:
    
        if (r15 != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003f, code lost:
    
        r5 = r3.get(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004b, code lost:
    
        if (r3.compareAndSet(r4, r5, 3458764513820540928L + (r5 & 1152921504606846975L)) == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006b, code lost:
    
        r4.h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006e, code lost:
    
        if (r10 == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0070, code lost:
    
        r13 = defpackage.he.l;
        r14 = r13.get(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0076, code lost:
    
        if (r14 != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0078, code lost:
    
        r15 = defpackage.je.q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0081, code lost:
    
        if (r13.compareAndSet(r4, r14, r15) == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0097, code lost:
    
        if (r13.get(r4) == r14) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0083, code lost:
    
        if (r14 != null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0086, code lost:
    
        defpackage.wv0.j(1, r14);
        ((defpackage.vy) r14).h(r4.n());
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0092, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x007b, code lost:
    
        r15 = defpackage.je.r;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009a, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x004e, code lost:
    
        r5 = r3.get(r4);
        r13 = (int) (r5 >> 60);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0055, code lost:
    
        if (r13 == 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0057, code lost:
    
        if (r13 == 1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x005a, code lost:
    
        r13 = (r5 & 1152921504606846975L) + 3458764513820540928L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0069, code lost:
    
        if (r3.compareAndSet(r4, r5, r13) == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x005f, code lost:
    
        r13 = (r5 & 1152921504606846975L) + 2305843009213693952L;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f(java.lang.Throwable r14, boolean r15) {
        /*
            r13 = this;
            r0 = 60
            r1 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = defpackage.he.d
            if (r15 == 0) goto L25
        Lb:
            long r5 = r3.get(r13)
            long r7 = r5 >> r0
            int r4 = (int) r7
            if (r4 != 0) goto L25
            long r7 = r5 & r1
            pg r4 = defpackage.je.a
            r9 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r7 = r7 + r9
            r4 = r13
            boolean r13 = r3.compareAndSet(r4, r5, r7)
            if (r13 == 0) goto L23
            goto L26
        L23:
            r13 = r4
            goto Lb
        L25:
            r4 = r13
        L26:
            ce r13 = defpackage.je.s
        L28:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = defpackage.he.k
            boolean r6 = r5.compareAndSet(r4, r13, r14)
            r9 = 1
            if (r6 == 0) goto L33
            r10 = r9
            goto L3b
        L33:
            java.lang.Object r5 = r5.get(r4)
            if (r5 == r13) goto L28
            r13 = 0
            r10 = r13
        L3b:
            r11 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            if (r15 == 0) goto L4e
        L3f:
            long r5 = r3.get(r4)
            long r13 = r5 & r1
            long r7 = r11 + r13
            boolean r13 = r3.compareAndSet(r4, r5, r7)
            if (r13 == 0) goto L3f
            goto L6b
        L4e:
            long r5 = r3.get(r4)
            long r13 = r5 >> r0
            int r13 = (int) r13
            if (r13 == 0) goto L5f
            if (r13 == r9) goto L5a
            goto L6b
        L5a:
            long r13 = r5 & r1
            long r13 = r13 + r11
        L5d:
            r7 = r13
            goto L65
        L5f:
            long r13 = r5 & r1
            r7 = 2305843009213693952(0x2000000000000000, double:1.4916681462400413E-154)
            long r13 = r13 + r7
            goto L5d
        L65:
            boolean r13 = r3.compareAndSet(r4, r5, r7)
            if (r13 == 0) goto L4e
        L6b:
            r4.h()
            if (r10 == 0) goto L9a
        L70:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r13 = defpackage.he.l
            java.lang.Object r14 = r13.get(r4)
            if (r14 != 0) goto L7b
            ce r15 = defpackage.je.q
            goto L7d
        L7b:
            ce r15 = defpackage.je.r
        L7d:
            boolean r0 = r13.compareAndSet(r4, r14, r15)
            if (r0 == 0) goto L93
            if (r14 != 0) goto L86
            goto L9a
        L86:
            defpackage.wv0.j(r9, r14)
            vy r14 = (defpackage.vy) r14
            java.lang.Throwable r13 = r4.n()
            r14.h(r13)
            return r10
        L93:
            java.lang.Object r0 = r13.get(r4)
            if (r0 == r14) goto L7d
            goto L70
        L9a:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.he.f(java.lang.Throwable, boolean):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x008d, code lost:
    
        r1 = (defpackage.pg) ((defpackage.hj) defpackage.hj.b.get(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.pg g(long r13) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.he.g(long):pg");
    }

    public final void h() {
        s(d.get(this), false);
    }

    @Override // defpackage.um0
    public Object i(Object obj) {
        boolean z;
        og ogVar = mn.a;
        AtomicLongFieldUpdater atomicLongFieldUpdater = d;
        long j2 = atomicLongFieldUpdater.get(this);
        boolean z2 = false;
        long j3 = 1152921504606846975L;
        if (s(j2, false)) {
            z = false;
        } else {
            z = !e(j2 & 1152921504606846975L);
        }
        if (z) {
            return ogVar;
        }
        jt jtVar = je.j;
        pg pgVar = (pg) h.get(this);
        while (true) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j4 = andIncrement & j3;
            boolean s = s(andIncrement, z2);
            int i2 = je.b;
            long j5 = i2;
            long j6 = j4 / j5;
            int i3 = (int) (j4 % j5);
            if (pgVar.c != j6) {
                pg b = b(this, j6, pgVar);
                if (b == null) {
                    if (s) {
                        return new ng(o());
                    }
                    z2 = false;
                    j3 = 1152921504606846975L;
                } else {
                    pgVar = b;
                }
            }
            int d2 = d(this, pgVar, i3, obj, j4, jtVar, s);
            nw0 nw0Var = nw0.a;
            if (d2 != 0) {
                if (d2 != 1) {
                    a01 a01Var = null;
                    if (d2 != 2) {
                        if (d2 != 3) {
                            if (d2 != 4) {
                                if (d2 == 5) {
                                    pgVar.a();
                                }
                                z2 = false;
                                j3 = 1152921504606846975L;
                            } else {
                                if (j4 < e.get(this)) {
                                    pgVar.a();
                                }
                                return new ng(o());
                            }
                        } else {
                            c.o("unexpected");
                            return null;
                        }
                    } else {
                        if (s) {
                            pgVar.h();
                            return new ng(o());
                        }
                        if (jtVar instanceof a01) {
                            a01Var = (a01) jtVar;
                        }
                        if (a01Var != null) {
                            a01Var.a(pgVar, i3 + i2);
                        }
                        pgVar.h();
                        return ogVar;
                    }
                } else {
                    return nw0Var;
                }
            } else {
                pgVar.a();
                return nw0Var;
            }
        }
    }

    @Override // defpackage.hg
    public final void j(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        f(cancellationException, true);
    }

    public final void k(long j2) {
        pg pgVar = (pg) i.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = e;
            long j3 = atomicLongFieldUpdater.get(this);
            if (j2 < Math.max(this.c + j3, f.get(this))) {
                return;
            }
            he heVar = this;
            if (atomicLongFieldUpdater.compareAndSet(heVar, j3, 1 + j3)) {
                long j4 = je.b;
                long j5 = j3 / j4;
                int i2 = (int) (j3 % j4);
                if (pgVar.c != j5) {
                    pg m = heVar.m(j5, pgVar);
                    if (m != null) {
                        pgVar = m;
                    }
                }
                pg pgVar2 = pgVar;
                if (heVar.A(pgVar2, i2, j3, null) == je.o) {
                    if (j3 < heVar.p()) {
                        pgVar2.a();
                    }
                } else {
                    pgVar2.a();
                }
                this = heVar;
                pgVar = pgVar2;
            }
            this = heVar;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x00bd, code lost:
    
        if ((r0.addAndGet(r15, r4 - r8) & 4611686018427387904L) != 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x00c6, code lost:
    
        if ((r0.get(r15) & 4611686018427387904L) == 0) goto L144;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l() {
        /*
            Method dump skipped, instructions count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.he.l():void");
    }

    public final pg m(long j2, pg pgVar) {
        Object u;
        he heVar;
        pg pgVar2 = je.a;
        ie ieVar = ie.k;
        loop0: while (true) {
            u = k20.u(pgVar, j2, ieVar);
            if (!gi0.h(u)) {
                mm0 g2 = gi0.g(u);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i;
                    mm0 mm0Var = (mm0) atomicReferenceFieldUpdater.get(this);
                    if (mm0Var.c >= g2.c) {
                        break loop0;
                    }
                    if (!g2.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, mm0Var, g2)) {
                        if (atomicReferenceFieldUpdater.get(this) != mm0Var) {
                            if (g2.e()) {
                                g2.d();
                            }
                        }
                    }
                    if (mm0Var.e()) {
                        mm0Var.d();
                    }
                }
            } else {
                break;
            }
        }
        if (gi0.h(u)) {
            h();
            if (pgVar.c * je.b < p()) {
                pgVar.a();
                return null;
            }
        } else {
            pg pgVar3 = (pg) gi0.g(u);
            long j3 = pgVar3.c;
            if (!u() && j2 <= f.get(this) / je.b) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = j;
                    mm0 mm0Var2 = (mm0) atomicReferenceFieldUpdater2.get(this);
                    if (mm0Var2.c >= j3) {
                        break;
                    }
                    if (!pgVar3.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, mm0Var2, pgVar3)) {
                        if (atomicReferenceFieldUpdater2.get(this) != mm0Var2) {
                            if (pgVar3.e()) {
                                pgVar3.d();
                            }
                        }
                    }
                    if (mm0Var2.e()) {
                        mm0Var2.d();
                    }
                }
            }
            if (j3 > j2) {
                long j4 = j3 * je.b;
                while (true) {
                    long j5 = e.get(this);
                    if (j5 >= j4) {
                        heVar = this;
                        break;
                    }
                    heVar = this;
                    if (e.compareAndSet(heVar, j5, j4)) {
                        break;
                    }
                    this = heVar;
                }
                if (j3 * je.b < heVar.p()) {
                    pgVar3.a();
                }
            } else {
                return pgVar3;
            }
        }
        return null;
    }

    public final Throwable n() {
        return (Throwable) k.get(this);
    }

    public final Throwable o() {
        Throwable n = n();
        if (n == null) {
            return new IllegalStateException("Channel was closed");
        }
        return n;
    }

    public final long p() {
        return d.get(this) & 1152921504606846975L;
    }

    public final boolean q() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i;
            pg pgVar = (pg) atomicReferenceFieldUpdater.get(this);
            AtomicLongFieldUpdater atomicLongFieldUpdater = e;
            long j2 = atomicLongFieldUpdater.get(this);
            if (p() <= j2) {
                return false;
            }
            int i2 = je.b;
            long j3 = j2 / i2;
            if (pgVar.c != j3 && (pgVar = m(j3, pgVar)) == null) {
                if (((pg) atomicReferenceFieldUpdater.get(this)).c < j3) {
                    return false;
                }
            } else {
                pgVar.a();
                int i3 = (int) (j2 % i2);
                while (true) {
                    Object k2 = pgVar.k(i3);
                    if (k2 != null && k2 != je.e) {
                        if (k2 != je.d) {
                            if (k2 != je.j && k2 != je.l && k2 != je.i && k2 != je.h) {
                                if (k2 != je.g) {
                                    if (k2 != je.f && j2 == atomicLongFieldUpdater.get(this)) {
                                        return true;
                                    }
                                } else {
                                    return true;
                                }
                            }
                        } else {
                            return true;
                        }
                    } else if (pgVar.j(k2, i3, je.h)) {
                        l();
                        break;
                    }
                }
                e.compareAndSet(this, j2, j2 + 1);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x00a3, code lost:
    
        r10 = (defpackage.pg) ((defpackage.hj) defpackage.hj.b.get(r10));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean s(long r10, boolean r12) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.he.s(long, boolean):boolean");
    }

    public boolean t() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:92:0x018e, code lost:
    
        r3 = (defpackage.pg) r3.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0195, code lost:
    
        if (r3 != null) goto L81;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 463
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.he.toString():java.lang.String");
    }

    public final boolean u() {
        long j2 = f.get(this);
        if (j2 != 0 && j2 != Long.MAX_VALUE) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v(long r5, defpackage.pg r7) {
        /*
            r4 = this;
        L0:
            long r0 = r7.c
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L11
            hj r0 = r7.b()
            pg r0 = (defpackage.pg) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r7 = r0
            goto L0
        L11:
            boolean r5 = r7.c()
            if (r5 == 0) goto L22
            hj r5 = r7.b()
            pg r5 = (defpackage.pg) r5
            if (r5 != 0) goto L20
            goto L22
        L20:
            r7 = r5
            goto L11
        L22:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = defpackage.he.j
            java.lang.Object r6 = r5.get(r4)
            mm0 r6 = (defpackage.mm0) r6
            long r0 = r6.c
            long r2 = r7.c
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L33
            goto L49
        L33:
            boolean r0 = r7.i()
            if (r0 != 0) goto L3a
            goto L11
        L3a:
            boolean r0 = r5.compareAndSet(r4, r6, r7)
            if (r0 == 0) goto L4a
            boolean r4 = r6.e()
            if (r4 == 0) goto L49
            r6.d()
        L49:
            return
        L4a:
            java.lang.Object r0 = r5.get(r4)
            if (r0 == r6) goto L3a
            boolean r5 = r7.e()
            if (r5 == 0) goto L22
            r7.d()
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.he.v(long, pg):void");
    }

    public final Object w(qk qkVar, Object obj) {
        ff ffVar = new ff(wv0.G(qkVar), 1);
        ffVar.s();
        ffVar.e(new sj0(o()));
        Object r = ffVar.r();
        if (r == ml.c) {
            return r;
        }
        return nw0.a;
    }

    public final void x(a01 a01Var, boolean z) {
        Throwable o;
        if (a01Var instanceof ff) {
            qk qkVar = (qk) a01Var;
            if (z) {
                o = n();
                if (o == null) {
                    o = new NoSuchElementException("Channel was closed");
                }
            } else {
                o = o();
            }
            qkVar.e(new sj0(o));
            return;
        }
        if (a01Var instanceof ge) {
            ge geVar = (ge) a01Var;
            ff ffVar = geVar.d;
            ffVar.getClass();
            geVar.d = null;
            geVar.c = je.l;
            Throwable n = geVar.e.n();
            if (n == null) {
                ffVar.e(Boolean.FALSE);
                return;
            } else {
                ffVar.e(new sj0(n));
                return;
            }
        }
        c.t(a01Var, "Unexpected waiter: ");
    }

    public final boolean y(Object obj, Object obj2) {
        if (obj instanceof ge) {
            ge geVar = (ge) obj;
            ff ffVar = geVar.d;
            ffVar.getClass();
            geVar.d = null;
            geVar.c = obj2;
            Boolean bool = Boolean.TRUE;
            pg pgVar = je.a;
            if (ffVar.B(bool, null) == null) {
                return false;
            }
            ffVar.o();
            return true;
        }
        if (obj instanceof ff) {
            ff ffVar2 = (ff) obj;
            pg pgVar2 = je.a;
            if (ffVar2.B(obj2, null) == null) {
                return false;
            }
            ffVar2.o();
            return true;
        }
        c.t(obj, "Unexpected receiver type: ");
        return false;
    }
}
