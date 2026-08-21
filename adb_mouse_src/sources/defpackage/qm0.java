package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public class qm0 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(qm0.class, Object.class, "head$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater d = AtomicLongFieldUpdater.newUpdater(qm0.class, "deqIdx$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(qm0.class, Object.class, "tail$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater f = AtomicLongFieldUpdater.newUpdater(qm0.class, "enqIdx$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater g = AtomicIntegerFieldUpdater.newUpdater(qm0.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;
    public final int a;
    public final nm0 b;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    /* JADX WARN: Type inference failed for: r6v1, types: [nm0] */
    public qm0(int i) {
        this.a = i;
        if (i > 0) {
            if (i >= 0) {
                tm0 tm0Var = new tm0(0L, null, 2);
                this.head$volatile = tm0Var;
                this.tail$volatile = tm0Var;
                this._availablePermits$volatile = i;
                this.b = new az() { // from class: nm0
                    @Override // defpackage.az
                    public final Object f(Object obj, Object obj2, Object obj3) {
                        qm0.this.b();
                        return nw0.a;
                    }
                };
                return;
            }
            f40.b(qo0.m("The number of acquired permits should be in 0..", i));
            throw null;
        }
        f40.b(qo0.m("Semaphore should have at least 1 permit, but had ", i));
        throw null;
    }

    public final boolean a(ff ffVar) {
        Object u;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
        tm0 tm0Var = (tm0) atomicReferenceFieldUpdater.get(this);
        long andIncrement = f.getAndIncrement(this);
        om0 om0Var = om0.k;
        long j = andIncrement / sm0.f;
        loop0: while (true) {
            u = k20.u(tm0Var, j, om0Var);
            if (!gi0.h(u)) {
                mm0 g2 = gi0.g(u);
                while (true) {
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
        tm0 tm0Var2 = (tm0) gi0.g(u);
        AtomicReferenceArray atomicReferenceArray = tm0Var2.e;
        int i = (int) (andIncrement % sm0.f);
        while (!atomicReferenceArray.compareAndSet(i, null, ffVar)) {
            if (atomicReferenceArray.get(i) != null) {
                ce ceVar = sm0.b;
                ce ceVar2 = sm0.c;
                while (!atomicReferenceArray.compareAndSet(i, ceVar, ceVar2)) {
                    if (atomicReferenceArray.get(i) != ceVar) {
                        return false;
                    }
                }
                ffVar.y(nw0.a, ffVar.e, this.b);
                return true;
            }
        }
        ffVar.a(tm0Var2, i);
        return true;
    }

    public final void b() {
        int i;
        Object u;
        boolean z;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = g;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            int i2 = this.a;
            if (andIncrement >= i2) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i <= i2) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i2));
                throw new IllegalStateException(("The number of released permits cannot be greater than " + i2).toString());
            }
            if (andIncrement < 0) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c;
                tm0 tm0Var = (tm0) atomicReferenceFieldUpdater.get(this);
                long andIncrement2 = d.getAndIncrement(this);
                long j = andIncrement2 / sm0.f;
                pm0 pm0Var = pm0.k;
                while (true) {
                    u = k20.u(tm0Var, j, pm0Var);
                    if (gi0.h(u)) {
                        break;
                    }
                    mm0 g2 = gi0.g(u);
                    while (true) {
                        mm0 mm0Var = (mm0) atomicReferenceFieldUpdater.get(this);
                        if (mm0Var.c >= g2.c) {
                            break;
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
                }
                tm0 tm0Var2 = (tm0) gi0.g(u);
                AtomicReferenceArray atomicReferenceArray = tm0Var2.e;
                tm0Var2.a();
                z = false;
                if (tm0Var2.c <= j) {
                    int i3 = (int) (andIncrement2 % sm0.f);
                    Object andSet = atomicReferenceArray.getAndSet(i3, sm0.b);
                    if (andSet == null) {
                        int i4 = sm0.a;
                        for (int i5 = 0; i5 < i4; i5++) {
                            if (atomicReferenceArray.get(i3) == sm0.c) {
                                z = true;
                                break;
                            }
                        }
                        ce ceVar = sm0.b;
                        ce ceVar2 = sm0.d;
                        while (true) {
                            if (atomicReferenceArray.compareAndSet(i3, ceVar, ceVar2)) {
                                z = true;
                                break;
                            } else if (atomicReferenceArray.get(i3) != ceVar) {
                                break;
                            }
                        }
                        z = !z;
                    } else if (andSet != sm0.e) {
                        if (andSet instanceof ff) {
                            ff ffVar = (ff) andSet;
                            if (ffVar.B(nw0.a, this.b) != null) {
                                ffVar.q(ffVar.e);
                                z = true;
                                break;
                                break;
                            }
                        } else {
                            c.t(andSet, "unexpected: ");
                            return;
                        }
                    }
                }
            } else {
                return;
            }
        } while (!z);
    }
}
