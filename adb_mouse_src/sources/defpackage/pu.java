package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public abstract class pu extends gl implements wo {
    public static final /* synthetic */ AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(pu.class, Object.class, "_queue$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater i = AtomicReferenceFieldUpdater.newUpdater(pu.class, Object.class, "_delayed$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater j = AtomicIntegerFieldUpdater.newUpdater(pu.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;
    public long e;
    public boolean f;
    public h8 g;

    @Override // defpackage.wo
    public final void a(ff ffVar) {
        long nanoTime = System.nanoTime();
        mu muVar = new mu(this, 2000000000 + nanoTime, ffVar);
        s(nanoTime, muVar);
        ffVar.u(new cf(1, muVar));
    }

    @Override // defpackage.gl
    public final void b(dl dlVar, Runnable runnable) {
        i(runnable);
    }

    public final void e() {
        long j2 = this.e - 4294967296L;
        this.e = j2;
        if (j2 <= 0 && this.f) {
            shutdown();
        }
    }

    public void i(Runnable runnable) {
        j();
        if (l(runnable)) {
            Thread m = m();
            if (Thread.currentThread() != m) {
                LockSupport.unpark(m);
                return;
            }
            return;
        }
        rn.k.i(runnable);
    }

    public final void j() {
        nu nuVar;
        nu nuVar2;
        boolean z;
        ou ouVar = (ou) i.get(this);
        if (ouVar == null || ur0.b.get(ouVar) == 0) {
            return;
        }
        long nanoTime = System.nanoTime();
        do {
            synchronized (ouVar) {
                try {
                    nu[] nuVarArr = ouVar.a;
                    nuVar = null;
                    if (nuVarArr != null) {
                        nuVar2 = nuVarArr[0];
                    } else {
                        nuVar2 = null;
                    }
                    if (nuVar2 != null) {
                        if (nanoTime - nuVar2.c >= 0) {
                            z = l(nuVar2);
                        } else {
                            z = false;
                        }
                        if (z) {
                            nuVar = ouVar.b(0);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (nuVar != null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean l(java.lang.Runnable r7) {
        /*
            r6 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.pu.h
            java.lang.Object r1 = r0.get(r6)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = defpackage.pu.j
            int r2 = r2.get(r6)
            r3 = 0
            if (r2 == 0) goto L10
            return r3
        L10:
            r2 = 1
            if (r1 != 0) goto L22
        L13:
            r1 = 0
            boolean r1 = r0.compareAndSet(r6, r1, r7)
            if (r1 == 0) goto L1b
            goto L62
        L1b:
            java.lang.Object r1 = r0.get(r6)
            if (r1 == 0) goto L13
            goto L0
        L22:
            boolean r4 = r1 instanceof defpackage.j70
            if (r4 == 0) goto L47
            r4 = r1
            j70 r4 = (defpackage.j70) r4
            int r5 = r4.a(r7)
            if (r5 == 0) goto L62
            if (r5 == r2) goto L35
            r0 = 2
            if (r5 == r0) goto L4b
            goto L0
        L35:
            j70 r3 = r4.c()
        L39:
            boolean r2 = r0.compareAndSet(r6, r1, r3)
            if (r2 == 0) goto L40
            goto L0
        L40:
            java.lang.Object r2 = r0.get(r6)
            if (r2 == r1) goto L39
            goto L0
        L47:
            ce r4 = defpackage.wv0.j
            if (r1 != r4) goto L4c
        L4b:
            return r3
        L4c:
            j70 r3 = new j70
            r4 = 8
            r3.<init>(r4, r2)
            r4 = r1
            java.lang.Runnable r4 = (java.lang.Runnable) r4
            r3.a(r4)
            r3.a(r7)
        L5c:
            boolean r4 = r0.compareAndSet(r6, r1, r3)
            if (r4 == 0) goto L63
        L62:
            return r2
        L63:
            java.lang.Object r4 = r0.get(r6)
            if (r4 == r1) goto L5c
            goto L0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pu.l(java.lang.Runnable):boolean");
    }

    public abstract Thread m();

    public final void n(boolean z) {
        long j2;
        long j3 = this.e;
        if (z) {
            j2 = 4294967296L;
        } else {
            j2 = 1;
        }
        this.e = j2 + j3;
        if (!z) {
            this.f = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        if (r0 == false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean o() {
        /*
            r7 = this;
            h8 r0 = r7.g
            r1 = 1
            if (r0 == 0) goto La
            boolean r0 = r0.isEmpty()
            goto Lb
        La:
            r0 = r1
        Lb:
            r2 = 0
            if (r0 != 0) goto Lf
            goto L54
        Lf:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.pu.i
            java.lang.Object r0 = r0.get(r7)
            ou r0 = (defpackage.ou) r0
            if (r0 == 0) goto L27
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = defpackage.ur0.b
            int r0 = r3.get(r0)
            if (r0 != 0) goto L23
            r0 = r1
            goto L24
        L23:
            r0 = r2
        L24:
            if (r0 != 0) goto L27
            goto L54
        L27:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.pu.h
            java.lang.Object r7 = r0.get(r7)
            if (r7 != 0) goto L30
            goto L53
        L30:
            boolean r0 = r7 instanceof defpackage.j70
            if (r0 == 0) goto L4f
            j70 r7 = (defpackage.j70) r7
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.j70.f
            long r3 = r0.get(r7)
            r5 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r5 = r5 & r3
            int r7 = (int) r5
            r5 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r3 = r3 & r5
            r0 = 30
            long r3 = r3 >> r0
            int r0 = (int) r3
            if (r7 != r0) goto L4e
            return r1
        L4e:
            return r2
        L4f:
            ce r0 = defpackage.wv0.j
            if (r7 != r0) goto L54
        L53:
            return r1
        L54:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pu.o():boolean");
    }

    public final long p() {
        nu nuVar;
        Runnable runnable;
        long j2;
        ce ceVar = wv0.j;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
        if (!q()) {
            j();
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                nuVar = null;
                if (obj == null) {
                    break;
                }
                if (obj instanceof j70) {
                    j70 j70Var = (j70) obj;
                    Object d = j70Var.d();
                    if (d != j70.g) {
                        runnable = (Runnable) d;
                        break;
                    }
                    j70 c = j70Var.c();
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c) && atomicReferenceFieldUpdater.get(this) == obj) {
                    }
                } else {
                    if (obj == ceVar) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    runnable = (Runnable) obj;
                    break loop0;
                }
            }
            runnable = null;
            if (runnable != null) {
                runnable.run();
                return 0L;
            }
            h8 h8Var = this.g;
            if (h8Var == null || h8Var.isEmpty()) {
                j2 = Long.MAX_VALUE;
            } else {
                j2 = 0;
            }
            if (j2 != 0) {
                Object obj2 = atomicReferenceFieldUpdater.get(this);
                if (obj2 != null) {
                    if (obj2 instanceof j70) {
                        long j3 = j70.f.get((j70) obj2);
                        if (((int) (1073741823 & j3)) != ((int) ((j3 & 1152921503533105152L) >> 30))) {
                            return 0L;
                        }
                    } else if (obj2 == ceVar) {
                        return Long.MAX_VALUE;
                    }
                }
                ou ouVar = (ou) i.get(this);
                if (ouVar != null) {
                    synchronized (ouVar) {
                        nu[] nuVarArr = ouVar.a;
                        if (nuVarArr != null) {
                            nuVar = nuVarArr[0];
                        }
                    }
                    if (nuVar != null) {
                        long nanoTime = nuVar.c - System.nanoTime();
                        if (nanoTime >= 0) {
                            return nanoTime;
                        }
                    }
                }
                return Long.MAX_VALUE;
            }
        }
        return 0L;
    }

    public final boolean q() {
        Object removeFirst;
        h8 h8Var = this.g;
        if (h8Var == null) {
            return false;
        }
        if (h8Var.isEmpty()) {
            removeFirst = null;
        } else {
            removeFirst = h8Var.removeFirst();
        }
        xq xqVar = (xq) removeFirst;
        if (xqVar == null) {
            return false;
        }
        xqVar.run();
        return true;
    }

    public void r(long j2, nu nuVar) {
        rn.k.s(j2, nuVar);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [ou, java.lang.Object] */
    public final void s(long j2, nu nuVar) {
        int b;
        Thread m;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i;
        nu nuVar2 = null;
        if (j.get(this) != 0) {
            b = 1;
        } else {
            ou ouVar = (ou) atomicReferenceFieldUpdater.get(this);
            if (ouVar == null) {
                ?? obj = new Object();
                obj.c = j2;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, obj) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj2 = atomicReferenceFieldUpdater.get(this);
                obj2.getClass();
                ouVar = (ou) obj2;
            }
            b = nuVar.b(j2, ouVar, this);
        }
        if (b != 0) {
            if (b != 1) {
                if (b != 2) {
                    c.o("unexpected result");
                    return;
                }
                return;
            }
            r(j2, nuVar);
            return;
        }
        ou ouVar2 = (ou) atomicReferenceFieldUpdater.get(this);
        if (ouVar2 != null) {
            synchronized (ouVar2) {
                nu[] nuVarArr = ouVar2.a;
                if (nuVarArr != null) {
                    nuVar2 = nuVarArr[0];
                }
            }
        }
        if (nuVar2 == nuVar && Thread.currentThread() != (m = m())) {
            LockSupport.unpark(m);
        }
    }

    public void shutdown() {
        nu nuVar;
        tr0.a.set(null);
        j.set(this, 1);
        ce ceVar = wv0.j;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, ceVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != null) {
                        break;
                    }
                }
                break loop0;
            } else {
                if (obj instanceof j70) {
                    ((j70) obj).b();
                    break;
                }
                if (obj != ceVar) {
                    j70 j70Var = new j70(8, true);
                    j70Var.a((Runnable) obj);
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, j70Var)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                break;
            }
        }
        do {
        } while (p() <= 0);
        long nanoTime = System.nanoTime();
        while (true) {
            ou ouVar = (ou) i.get(this);
            if (ouVar != null) {
                synchronized (ouVar) {
                    if (ur0.b.get(ouVar) > 0) {
                        nuVar = ouVar.b(0);
                    } else {
                        nuVar = null;
                    }
                }
                if (nuVar != null) {
                    r(nanoTime, nuVar);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }
}
