package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class il extends Thread {
    public static final /* synthetic */ AtomicIntegerFieldUpdater k = AtomicIntegerFieldUpdater.newUpdater(il.class, "workerCtl$volatile");
    public final s11 c;
    public final ki0 d;
    public jl e;
    public long f;
    public long g;
    public int h;
    public boolean i;
    private volatile int indexInArray;
    public final /* synthetic */ kl j;
    private volatile Object nextParkedWorker;
    private volatile /* synthetic */ int workerCtl$volatile;

    public il(kl klVar, int i) {
        this.j = klVar;
        setDaemon(true);
        setContextClassLoader(kl.class.getClassLoader());
        this.c = new s11();
        this.d = new ki0();
        this.e = jl.f;
        this.nextParkedWorker = kl.m;
        int nanoTime = (int) System.nanoTime();
        this.h = nanoTime == 0 ? 42 : nanoTime;
        f(i);
    }

    public final yq0 a(boolean z) {
        yq0 e;
        yq0 e2;
        long j;
        jl jlVar = this.e;
        kl klVar = this.j;
        yq0 yq0Var = null;
        boolean z2 = true;
        s11 s11Var = this.c;
        jl jlVar2 = jl.c;
        if (jlVar != jlVar2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = kl.k;
            do {
                j = atomicLongFieldUpdater.get(klVar);
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    s11Var.getClass();
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = s11.b;
                        yq0 yq0Var2 = (yq0) atomicReferenceFieldUpdater.get(s11Var);
                        if (yq0Var2 == null || !yq0Var2.d) {
                            break;
                        }
                        while (!atomicReferenceFieldUpdater.compareAndSet(s11Var, yq0Var2, null)) {
                            if (atomicReferenceFieldUpdater.get(s11Var) != yq0Var2) {
                                break;
                            }
                        }
                        yq0Var = yq0Var2;
                    }
                    int i = s11.d.get(s11Var);
                    int i2 = s11.c.get(s11Var);
                    while (true) {
                        if (i == i2 || s11.e.get(s11Var) == 0) {
                            break;
                        }
                        i2--;
                        yq0 b = s11Var.b(i2, true);
                        if (b != null) {
                            yq0Var = b;
                            break;
                        }
                    }
                    if (yq0Var == null) {
                        yq0 yq0Var3 = (yq0) klVar.h.d();
                        if (yq0Var3 == null) {
                            return i(1);
                        }
                        return yq0Var3;
                    }
                    return yq0Var;
                }
            } while (!kl.k.compareAndSet(klVar, j, j - 4398046511104L));
            this.e = jlVar2;
        }
        if (z) {
            if (d(klVar.c * 2) != 0) {
                z2 = false;
            }
            if (z2 && (e2 = e()) != null) {
                return e2;
            }
            s11Var.getClass();
            yq0 yq0Var4 = (yq0) s11.b.getAndSet(s11Var, null);
            if (yq0Var4 == null) {
                yq0Var4 = s11Var.a();
            }
            if (yq0Var4 != null) {
                return yq0Var4;
            }
            if (!z2 && (e = e()) != null) {
                return e;
            }
        } else {
            yq0 e3 = e();
            if (e3 != null) {
                return e3;
            }
        }
        return i(3);
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i) {
        int i2 = this.h;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.h = i5;
        int i6 = i - 1;
        if ((i6 & i) == 0) {
            return i6 & i5;
        }
        return (Integer.MAX_VALUE & i5) % i;
    }

    public final yq0 e() {
        int d = d(2);
        kl klVar = this.j;
        yz yzVar = klVar.h;
        yz yzVar2 = klVar.g;
        if (d == 0) {
            yq0 yq0Var = (yq0) yzVar2.d();
            if (yq0Var != null) {
                return yq0Var;
            }
            return (yq0) yzVar.d();
        }
        yq0 yq0Var2 = (yq0) yzVar.d();
        if (yq0Var2 != null) {
            return yq0Var2;
        }
        return (yq0) yzVar2.d();
    }

    public final void f(int i) {
        String valueOf;
        StringBuilder sb = new StringBuilder();
        sb.append(this.j.f);
        sb.append("-worker-");
        if (i == 0) {
            valueOf = "TERMINATED";
        } else {
            valueOf = String.valueOf(i);
        }
        sb.append(valueOf);
        setName(sb.toString());
        this.indexInArray = i;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(jl jlVar) {
        boolean z;
        jl jlVar2 = this.e;
        if (jlVar2 == jl.c) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            kl.k.addAndGet(this.j, 4398046511104L);
        }
        if (jlVar2 != jlVar) {
            this.e = jlVar;
        }
        return z;
    }

    public final yq0 i(int i) {
        boolean z;
        long j;
        yq0 yq0Var;
        long j2;
        long j3;
        yq0 yq0Var2;
        int i2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = kl.k;
        kl klVar = this.j;
        int i3 = (int) (atomicLongFieldUpdater.get(klVar) & 2097151);
        yq0 yq0Var3 = null;
        if (i3 < 2) {
            return null;
        }
        int d = d(i3);
        int i4 = 0;
        long j4 = Long.MAX_VALUE;
        while (i4 < i3) {
            d++;
            if (d > i3) {
                d = 1;
            }
            il ilVar = (il) klVar.i.b(d);
            if (ilVar != null && ilVar != this) {
                s11 s11Var = ilVar.c;
                if (i == 3) {
                    yq0Var = s11Var.a();
                    j = 0;
                } else {
                    s11Var.getClass();
                    int i5 = s11.d.get(s11Var);
                    int i6 = s11.c.get(s11Var);
                    if (i == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    while (true) {
                        if (i5 != i6) {
                            j = 0;
                            if (!z || s11.e.get(s11Var) != 0) {
                                int i7 = i5 + 1;
                                yq0Var = s11Var.b(i5, z);
                                if (yq0Var != null) {
                                    break;
                                }
                                i5 = i7;
                            } else {
                                break;
                            }
                        } else {
                            j = 0;
                            break;
                        }
                    }
                    yq0Var = yq0Var3;
                }
                ki0 ki0Var = this.d;
                if (yq0Var != null) {
                    ki0Var.d = yq0Var;
                    yq0Var2 = yq0Var3;
                    j3 = -1;
                    j2 = -1;
                } else {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = s11.b;
                        yq0 yq0Var4 = (yq0) atomicReferenceFieldUpdater.get(s11Var);
                        if (yq0Var4 == null) {
                            j2 = -1;
                            break;
                        }
                        j2 = -1;
                        if (yq0Var4.d) {
                            i2 = 1;
                        } else {
                            i2 = 2;
                        }
                        if ((i2 & i) == 0) {
                            break;
                        }
                        cr0.f.getClass();
                        s11 s11Var2 = s11Var;
                        long nanoTime = System.nanoTime() - yq0Var4.c;
                        long j5 = cr0.b;
                        if (nanoTime < j5) {
                            j3 = j5 - nanoTime;
                            yq0Var2 = null;
                            break;
                        }
                        do {
                            yq0Var2 = null;
                            if (atomicReferenceFieldUpdater.compareAndSet(s11Var2, yq0Var4, null)) {
                                ki0Var.d = yq0Var4;
                                j3 = -1;
                                break;
                            }
                        } while (atomicReferenceFieldUpdater.get(s11Var2) == yq0Var4);
                        s11Var = s11Var2;
                        yq0Var3 = null;
                    }
                    j3 = -2;
                    yq0Var2 = yq0Var3;
                }
                if (j3 == j2) {
                    yq0 yq0Var5 = (yq0) ki0Var.d;
                    ki0Var.d = yq0Var2;
                    return yq0Var5;
                }
                if (j3 > j) {
                    j4 = Math.min(j4, j3);
                }
            }
            i4++;
            yq0Var3 = null;
        }
        if (j4 == Long.MAX_VALUE) {
            j4 = 0;
        }
        this.g = j4;
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0004, code lost:
    
        continue;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.il.run():void");
    }
}
