package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public abstract class hj {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(hj.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(hj.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public hj(mm0 mm0Var) {
        this._prev$volatile = mm0Var;
    }

    public final void a() {
        b.set(this, null);
    }

    public final hj b() {
        Object obj = a.get(this);
        if (obj == k20.g) {
            return null;
        }
        return (hj) obj;
    }

    public abstract boolean c();

    public final void d() {
        hj hjVar;
        hj b2;
        if (b() == null) {
            return;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
            hj hjVar2 = (hj) atomicReferenceFieldUpdater.get(this);
            while (hjVar2 != null && hjVar2.c()) {
                hjVar2 = (hj) atomicReferenceFieldUpdater.get(hjVar2);
            }
            hj b3 = b();
            b3.getClass();
            while (b3.c() && (b2 = b3.b()) != null) {
                b3 = b2;
            }
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(b3);
                if (((hj) obj) == null) {
                    hjVar = null;
                } else {
                    hjVar = hjVar2;
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(b3, obj, hjVar)) {
                    if (atomicReferenceFieldUpdater.get(b3) != obj) {
                        break;
                    }
                }
            }
            if (hjVar2 != null) {
                a.set(hjVar2, b3);
            }
            if (!b3.c() || b3.b() == null) {
                if (hjVar2 == null || !hjVar2.c()) {
                    return;
                }
            }
        }
    }
}
