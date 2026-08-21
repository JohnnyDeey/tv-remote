package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class x0 extends mn {
    public final AtomicReferenceFieldUpdater l;
    public final AtomicReferenceFieldUpdater m;
    public final AtomicReferenceFieldUpdater n;
    public final AtomicReferenceFieldUpdater o;
    public final AtomicReferenceFieldUpdater p;

    public x0(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.l = atomicReferenceFieldUpdater;
        this.m = atomicReferenceFieldUpdater2;
        this.n = atomicReferenceFieldUpdater3;
        this.o = atomicReferenceFieldUpdater4;
        this.p = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.mn
    public final void I(z0 z0Var, z0 z0Var2) {
        this.m.lazySet(z0Var, z0Var2);
    }

    @Override // defpackage.mn
    public final void J(z0 z0Var, Thread thread) {
        this.l.lazySet(z0Var, thread);
    }

    @Override // defpackage.mn
    public final boolean f(a1 a1Var, w0 w0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.o;
            if (atomicReferenceFieldUpdater.compareAndSet(a1Var, w0Var, w0.b)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(a1Var) == w0Var);
        return false;
    }

    @Override // defpackage.mn
    public final boolean g(a1 a1Var, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.p;
            if (atomicReferenceFieldUpdater.compareAndSet(a1Var, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(a1Var) == obj);
        return false;
    }

    @Override // defpackage.mn
    public final boolean h(a1 a1Var, z0 z0Var, z0 z0Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.n;
            if (atomicReferenceFieldUpdater.compareAndSet(a1Var, z0Var, z0Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(a1Var) == z0Var);
        return false;
    }
}
