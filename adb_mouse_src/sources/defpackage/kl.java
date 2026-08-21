package defpackage;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class kl implements Executor, Closeable {
    public static final /* synthetic */ AtomicLongFieldUpdater j = AtomicLongFieldUpdater.newUpdater(kl.class, "parkedWorkersStack$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater k = AtomicLongFieldUpdater.newUpdater(kl.class, "controlState$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater l = AtomicIntegerFieldUpdater.newUpdater(kl.class, "_isTerminated$volatile");
    public static final ce m = new ce("NOT_IN_STACK", 2);
    private volatile /* synthetic */ int _isTerminated$volatile;
    public final int c;
    private volatile /* synthetic */ long controlState$volatile;
    public final int d;
    public final long e;
    public final String f;
    public final yz g;
    public final yz h;
    public final hj0 i;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    /* JADX WARN: Type inference failed for: r4v3, types: [h70, yz] */
    /* JADX WARN: Type inference failed for: r4v4, types: [h70, yz] */
    public kl(int i, int i2, long j2, String str) {
        this.c = i;
        this.d = i2;
        this.e = j2;
        this.f = str;
        if (i >= 1) {
            if (i2 >= i) {
                if (i2 <= 2097150) {
                    if (j2 > 0) {
                        this.g = new h70();
                        this.h = new h70();
                        this.i = new hj0((i + 1) * 2);
                        this.controlState$volatile = i << 42;
                        this._isTerminated$volatile = 0;
                        return;
                    }
                    throw new IllegalArgumentException(("Idle worker keep alive time " + j2 + " must be positive").toString());
                }
                f40.b(qo0.n("Max pool size ", i2, " should not exceed maximal supported number of threads 2097150"));
                throw null;
            }
            f40.b(qo0.o("Max pool size ", i2, " should be greater than or equals to core pool size ", i));
            throw null;
        }
        f40.b(qo0.n("Core pool size ", i, " should be at least 1"));
        throw null;
    }

    public final int a() {
        boolean z;
        synchronized (this.i) {
            try {
                if (l.get(this) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = k;
                long j2 = atomicLongFieldUpdater.get(this);
                int i = (int) (j2 & 2097151);
                int i2 = i - ((int) ((j2 & 4398044413952L) >> 21));
                if (i2 < 0) {
                    i2 = 0;
                }
                if (i2 >= this.c) {
                    return 0;
                }
                if (i >= this.d) {
                    return 0;
                }
                int i3 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i3 > 0 && this.i.b(i3) == null) {
                    il ilVar = new il(this, i3);
                    this.i.c(i3, ilVar);
                    if (i3 == ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                        int i4 = i2 + 1;
                        ilVar.start();
                        return i4;
                    }
                    throw new IllegalArgumentException("Failed requirement.");
                }
                throw new IllegalArgumentException("Failed requirement.");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(Runnable runnable, boolean z) {
        yq0 br0Var;
        long j2;
        il ilVar;
        boolean a;
        jl jlVar;
        cr0.f.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof yq0) {
            br0Var = (yq0) runnable;
            br0Var.c = nanoTime;
            br0Var.d = z;
        } else {
            br0Var = new br0(runnable, nanoTime, z);
        }
        boolean z2 = br0Var.d;
        AtomicLongFieldUpdater atomicLongFieldUpdater = k;
        if (z2) {
            j2 = atomicLongFieldUpdater.addAndGet(this, 2097152L);
        } else {
            j2 = 0;
        }
        Thread currentThread = Thread.currentThread();
        if (currentThread instanceof il) {
            ilVar = (il) currentThread;
        } else {
            ilVar = null;
        }
        if (ilVar == null || ilVar.j != this) {
            ilVar = null;
        }
        if (ilVar != null && (jlVar = ilVar.e) != jl.g && (br0Var.d || jlVar != jl.d)) {
            ilVar.i = true;
            s11 s11Var = ilVar.c;
            s11Var.getClass();
            br0Var = (yq0) s11.b.getAndSet(s11Var, br0Var);
            if (br0Var != null) {
                AtomicReferenceArray atomicReferenceArray = s11Var.a;
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = s11.c;
                if (atomicIntegerFieldUpdater.get(s11Var) - s11.d.get(s11Var) != 127) {
                    if (br0Var.d) {
                        s11.e.incrementAndGet(s11Var);
                    }
                    int i = atomicIntegerFieldUpdater.get(s11Var) & 127;
                    while (atomicReferenceArray.get(i) != null) {
                        Thread.yield();
                    }
                    atomicReferenceArray.lazySet(i, br0Var);
                    atomicIntegerFieldUpdater.incrementAndGet(s11Var);
                }
            }
            br0Var = null;
        }
        if (br0Var != null) {
            if (br0Var.d) {
                a = this.h.a(br0Var);
            } else {
                a = this.g.a(br0Var);
            }
            if (!a) {
                throw new RejectedExecutionException(qo0.s(new StringBuilder(), this.f, " was terminated"));
            }
        }
        if (z2) {
            if (!e() && !d(j2)) {
                e();
                return;
            }
            return;
        }
        if (e() || d(atomicLongFieldUpdater.get(this))) {
            return;
        }
        e();
    }

    public final void c(il ilVar, int i, int i2) {
        while (true) {
            long j2 = j.get(this);
            int i3 = (int) (2097151 & j2);
            long j3 = (2097152 + j2) & (-2097152);
            if (i3 == i) {
                if (i2 == 0) {
                    Object c = ilVar.c();
                    while (true) {
                        if (c == m) {
                            i3 = -1;
                            break;
                        }
                        if (c == null) {
                            i3 = 0;
                            break;
                        }
                        il ilVar2 = (il) c;
                        int b = ilVar2.b();
                        if (b != 0) {
                            i3 = b;
                            break;
                        }
                        c = ilVar2.c();
                    }
                } else {
                    i3 = i2;
                }
            }
            if (i3 >= 0) {
                kl klVar = this;
                if (j.compareAndSet(klVar, j2, i3 | j3)) {
                    return;
                } else {
                    this = klVar;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0083, code lost:
    
        if (r1 == null) goto L38;
     */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void close() {
        /*
            r8 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = defpackage.kl.l
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r8, r1, r2)
            if (r0 != 0) goto Lb
            return
        Lb:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r1 = r0 instanceof defpackage.il
            r3 = 0
            if (r1 == 0) goto L17
            il r0 = (defpackage.il) r0
            goto L18
        L17:
            r0 = r3
        L18:
            if (r0 == 0) goto L1e
            kl r1 = r0.j
            if (r1 == r8) goto L1f
        L1e:
            r0 = r3
        L1f:
            hj0 r1 = r8.i
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = defpackage.kl.k     // Catch: java.lang.Throwable -> Lbe
            long r4 = r4.get(r8)     // Catch: java.lang.Throwable -> Lbe
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r4 = (int) r4
            monitor-exit(r1)
            if (r2 > r4) goto L73
            r1 = r2
        L31:
            hj0 r5 = r8.i
            java.lang.Object r5 = r5.b(r1)
            r5.getClass()
            il r5 = (defpackage.il) r5
            if (r5 == r0) goto L6e
        L3e:
            java.lang.Thread$State r6 = r5.getState()
            java.lang.Thread$State r7 = java.lang.Thread.State.TERMINATED
            if (r6 == r7) goto L4f
            java.util.concurrent.locks.LockSupport.unpark(r5)
            r6 = 10000(0x2710, double:4.9407E-320)
            r5.join(r6)
            goto L3e
        L4f:
            s11 r5 = r5.c
            yz r6 = r8.h
            r5.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = defpackage.s11.b
            java.lang.Object r7 = r7.getAndSet(r5, r3)
            yq0 r7 = (defpackage.yq0) r7
            if (r7 == 0) goto L63
            r6.a(r7)
        L63:
            yq0 r7 = r5.a()
            if (r7 != 0) goto L6a
            goto L6e
        L6a:
            r6.a(r7)
            goto L63
        L6e:
            if (r1 == r4) goto L73
            int r1 = r1 + 1
            goto L31
        L73:
            yz r1 = r8.h
            r1.b()
            yz r1 = r8.g
            r1.b()
        L7d:
            if (r0 == 0) goto L85
            yq0 r1 = r0.a(r2)
            if (r1 != 0) goto Lad
        L85:
            yz r1 = r8.g
            java.lang.Object r1 = r1.d()
            yq0 r1 = (defpackage.yq0) r1
            if (r1 != 0) goto Lad
            yz r1 = r8.h
            java.lang.Object r1 = r1.d()
            yq0 r1 = (defpackage.yq0) r1
            if (r1 != 0) goto Lad
            if (r0 == 0) goto La0
            jl r1 = defpackage.jl.g
            r0.h(r1)
        La0:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.kl.j
            r1 = 0
            r0.set(r8, r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.kl.k
            r0.set(r8, r1)
            return
        Lad:
            r1.run()     // Catch: java.lang.Throwable -> Lb1
            goto L7d
        Lb1:
            r1 = move-exception
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.Thread$UncaughtExceptionHandler r4 = r3.getUncaughtExceptionHandler()
            r4.uncaughtException(r3, r1)
            goto L7d
        Lbe:
            r8 = move-exception
            monitor-exit(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kl.close():void");
    }

    public final boolean d(long j2) {
        int i = ((int) (2097151 & j2)) - ((int) ((j2 & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i2 = this.c;
        if (i < i2) {
            int a = a();
            if (a == 1 && i2 > 1) {
                a();
            }
            if (a > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean e() {
        kl klVar;
        ce ceVar;
        int i;
        while (true) {
            long j2 = j.get(this);
            il ilVar = (il) this.i.b((int) (2097151 & j2));
            if (ilVar == null) {
                ilVar = null;
                klVar = this;
            } else {
                long j3 = (2097152 + j2) & (-2097152);
                Object c = ilVar.c();
                while (true) {
                    ceVar = m;
                    if (c == ceVar) {
                        i = -1;
                        break;
                    }
                    if (c == null) {
                        i = 0;
                        break;
                    }
                    il ilVar2 = (il) c;
                    i = ilVar2.b();
                    if (i != 0) {
                        break;
                    }
                    c = ilVar2.c();
                    j2 = j2;
                }
                if (i >= 0) {
                    kl klVar2 = this;
                    boolean compareAndSet = j.compareAndSet(klVar2, j2, i | j3);
                    klVar = klVar2;
                    if (compareAndSet) {
                        ilVar.g(ceVar);
                    }
                    this = klVar;
                } else {
                    continue;
                }
            }
            if (ilVar == null) {
                return false;
            }
            if (il.k.compareAndSet(ilVar, -1, 0)) {
                LockSupport.unpark(ilVar);
                return true;
            }
            this = klVar;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        b(runnable, false);
    }

    public final String toString() {
        int i;
        ArrayList arrayList = new ArrayList();
        hj0 hj0Var = this.i;
        int a = hj0Var.a();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 1; i7 < a; i7++) {
            il ilVar = (il) hj0Var.b(i7);
            if (ilVar != null) {
                s11 s11Var = ilVar.c;
                s11Var.getClass();
                if (s11.b.get(s11Var) != null) {
                    i = (s11.c.get(s11Var) - s11.d.get(s11Var)) + 1;
                } else {
                    i = s11.c.get(s11Var) - s11.d.get(s11Var);
                }
                int ordinal = ilVar.e.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal != 3) {
                                if (ordinal == 4) {
                                    i6++;
                                } else {
                                    throw new RuntimeException();
                                }
                            } else {
                                i5++;
                                if (i > 0) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(i);
                                    sb.append('d');
                                    arrayList.add(sb.toString());
                                }
                            }
                        } else {
                            i4++;
                        }
                    } else {
                        i3++;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(i);
                        sb2.append('b');
                        arrayList.add(sb2.toString());
                    }
                } else {
                    i2++;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(i);
                    sb3.append('c');
                    arrayList.add(sb3.toString());
                }
            }
        }
        long j2 = k.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f);
        sb4.append('@');
        sb4.append(mn.r(this));
        sb4.append("[Pool Size {core = ");
        int i8 = this.c;
        sb4.append(i8);
        sb4.append(", max = ");
        sb4.append(this.d);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(i2);
        sb4.append(", blocking = ");
        sb4.append(i3);
        sb4.append(", parked = ");
        sb4.append(i4);
        sb4.append(", dormant = ");
        sb4.append(i5);
        sb4.append(", terminated = ");
        sb4.append(i6);
        sb4.append("}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.g.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.h.c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j2));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j2) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i8 - ((int) ((j2 & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}
