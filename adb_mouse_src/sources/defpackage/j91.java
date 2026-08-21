package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class j91 extends hi0 {
    public final AtomicReferenceFieldUpdater a;
    public final AtomicReferenceFieldUpdater b;
    public final AtomicReferenceFieldUpdater c;
    public final AtomicReferenceFieldUpdater d;
    public final AtomicReferenceFieldUpdater e;

    public j91(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.a = atomicReferenceFieldUpdater;
        this.b = atomicReferenceFieldUpdater2;
        this.c = atomicReferenceFieldUpdater3;
        this.d = atomicReferenceFieldUpdater4;
        this.e = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.hi0
    public final void r(ja1 ja1Var, ja1 ja1Var2) {
        this.b.lazySet(ja1Var, ja1Var2);
    }

    @Override // defpackage.hi0
    public final void s(ja1 ja1Var, Thread thread) {
        this.a.lazySet(ja1Var, thread);
    }

    @Override // defpackage.hi0
    public final boolean t(na1 na1Var, m81 m81Var, m81 m81Var2) {
        return gi0.q(this.d, na1Var, m81Var, m81Var2);
    }

    @Override // defpackage.hi0
    public final boolean u(na1 na1Var, Object obj, Object obj2) {
        return gi0.q(this.e, na1Var, obj, obj2);
    }

    @Override // defpackage.hi0
    public final boolean w(na1 na1Var, ja1 ja1Var, ja1 ja1Var2) {
        return gi0.q(this.c, na1Var, ja1Var, ja1Var2);
    }
}
