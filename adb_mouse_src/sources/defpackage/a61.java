package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class a61 extends wg0 {
    public static final AtomicReferenceFieldUpdater d = AtomicReferenceFieldUpdater.newUpdater(d61.class, Thread.class, "a");
    public static final AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(d61.class, d61.class, "b");
    public static final AtomicReferenceFieldUpdater f = AtomicReferenceFieldUpdater.newUpdater(e61.class, d61.class, "e");
    public static final AtomicReferenceFieldUpdater g = AtomicReferenceFieldUpdater.newUpdater(e61.class, z51.class, "d");
    public static final AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(e61.class, Object.class, "c");

    @Override // defpackage.wg0
    public final z51 C(x61 x61Var) {
        return (z51) g.getAndSet(x61Var, z51.d);
    }

    @Override // defpackage.wg0
    public final d61 E(x61 x61Var) {
        return (d61) f.getAndSet(x61Var, d61.c);
    }

    @Override // defpackage.wg0
    public final void G(d61 d61Var, d61 d61Var2) {
        e.lazySet(d61Var, d61Var2);
    }

    @Override // defpackage.wg0
    public final void I(d61 d61Var, Thread thread) {
        d.lazySet(d61Var, thread);
    }

    @Override // defpackage.wg0
    public final boolean J(x61 x61Var, z51 z51Var, z51 z51Var2) {
        return gi0.p(g, x61Var, z51Var, z51Var2);
    }

    @Override // defpackage.wg0
    public final boolean L(e61 e61Var, Object obj, Object obj2) {
        return gi0.p(h, e61Var, obj, obj2);
    }

    @Override // defpackage.wg0
    public final boolean M(e61 e61Var, d61 d61Var, d61 d61Var2) {
        return gi0.p(f, e61Var, d61Var, d61Var2);
    }
}
