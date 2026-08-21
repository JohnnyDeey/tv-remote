package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class v50 extends gl implements wo {
    public static final /* synthetic */ AtomicIntegerFieldUpdater j = AtomicIntegerFieldUpdater.newUpdater(v50.class, "runningWorkers$volatile");
    public final /* synthetic */ wo e;
    public final gl f;
    public final int g;
    public final h70 h;
    public final Object i;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX WARN: Multi-variable type inference failed */
    public v50(gl glVar, int i) {
        wo woVar;
        if (glVar instanceof wo) {
            woVar = (wo) glVar;
        } else {
            woVar = null;
        }
        this.e = woVar == null ? sn.a : woVar;
        this.f = glVar;
        this.g = i;
        this.h = new h70();
        this.i = new Object();
    }

    @Override // defpackage.wo
    public final void a(ff ffVar) {
        this.e.a(ffVar);
    }

    @Override // defpackage.gl
    public final void b(dl dlVar, Runnable runnable) {
        this.h.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = j;
        if (atomicIntegerFieldUpdater.get(this) < this.g) {
            synchronized (this.i) {
                if (atomicIntegerFieldUpdater.get(this) >= this.g) {
                    return;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
                Runnable e = e();
                if (e != null) {
                    this.f.b(this, new m61(this, e, 8, false));
                }
            }
        }
    }

    public final Runnable e() {
        while (true) {
            Runnable runnable = (Runnable) this.h.d();
            if (runnable == null) {
                synchronized (this.i) {
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = j;
                    atomicIntegerFieldUpdater.decrementAndGet(this);
                    if (this.h.c() == 0) {
                        return null;
                    }
                    atomicIntegerFieldUpdater.incrementAndGet(this);
                }
            } else {
                return runnable;
            }
        }
    }

    @Override // defpackage.gl
    public final String toString() {
        return this.f + ".limitedParallelism(" + this.g + ')';
    }
}
