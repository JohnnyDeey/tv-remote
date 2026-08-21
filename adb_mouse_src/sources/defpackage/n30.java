package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public abstract class n30 extends g70 implements dr, q10 {
    public q30 f;

    @Override // defpackage.dr
    public final void a() {
        q30 j = j();
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = q30.c;
            Object obj = atomicReferenceFieldUpdater.get(j);
            if (obj instanceof n30) {
                if (obj == this) {
                    qt qtVar = k20.o;
                    while (!atomicReferenceFieldUpdater.compareAndSet(j, obj, qtVar)) {
                        if (atomicReferenceFieldUpdater.get(j) != obj) {
                            break;
                        }
                    }
                    return;
                }
                return;
            }
            if (!(obj instanceof q10) || ((q10) obj).d() == null) {
                return;
            }
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = g70.c;
                Object obj2 = atomicReferenceFieldUpdater2.get(this);
                if (!(obj2 instanceof zi0)) {
                    if (obj2 == this) {
                        return;
                    }
                    obj2.getClass();
                    g70 g70Var = (g70) obj2;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = g70.e;
                    zi0 zi0Var = (zi0) atomicReferenceFieldUpdater3.get(g70Var);
                    if (zi0Var == null) {
                        zi0Var = new zi0(g70Var);
                        atomicReferenceFieldUpdater3.set(g70Var, zi0Var);
                    }
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj2, zi0Var)) {
                        if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                            break;
                        }
                    }
                    g70Var.f();
                    return;
                }
                return;
            }
        }
    }

    @Override // defpackage.q10
    public final boolean b() {
        return true;
    }

    @Override // defpackage.q10
    public final cc0 d() {
        return null;
    }

    public q30 getParent() {
        return j();
    }

    public final q30 j() {
        q30 q30Var = this.f;
        if (q30Var != null) {
            return q30Var;
        }
        k20.p0("job");
        throw null;
    }

    public abstract boolean k();

    public abstract void l(Throwable th);

    @Override // defpackage.g70
    public final String toString() {
        return getClass().getSimpleName() + '@' + mn.r(this) + "[job@" + mn.r(j()) + ']';
    }
}
