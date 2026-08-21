package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public class h70 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(h70.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile = new j70(8, false);

    public final boolean a(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            j70 j70Var = (j70) atomicReferenceFieldUpdater.get(this);
            int a2 = j70Var.a(runnable);
            if (a2 == 0) {
                return true;
            }
            if (a2 != 1) {
                if (a2 == 2) {
                    return false;
                }
            } else {
                j70 c = j70Var.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, j70Var, c) && atomicReferenceFieldUpdater.get(this) == j70Var) {
                }
            }
        }
    }

    public final void b() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            j70 j70Var = (j70) atomicReferenceFieldUpdater.get(this);
            if (j70Var.b()) {
                return;
            }
            j70 c = j70Var.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, j70Var, c) && atomicReferenceFieldUpdater.get(this) == j70Var) {
            }
        }
    }

    public final int c() {
        j70 j70Var = (j70) a.get(this);
        j70Var.getClass();
        long j = j70.f.get(j70Var);
        return 1073741823 & (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j)));
    }

    public final Object d() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            j70 j70Var = (j70) atomicReferenceFieldUpdater.get(this);
            Object d = j70Var.d();
            if (d != j70.g) {
                return d;
            }
            j70 c = j70Var.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, j70Var, c) && atomicReferenceFieldUpdater.get(this) == j70Var) {
            }
        }
    }
}
