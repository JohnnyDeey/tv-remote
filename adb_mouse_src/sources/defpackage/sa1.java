package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class sa1 implements u61 {
    public final WeakReference c;
    public final ra1 d = new ra1(this);

    public sa1(pa1 pa1Var) {
        this.c = new WeakReference(pa1Var);
    }

    @Override // defpackage.u61
    public final void a(Runnable runnable, Executor executor) {
        this.d.a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        pa1 pa1Var = (pa1) this.c.get();
        boolean cancel = this.d.cancel(z);
        if (cancel && pa1Var != null) {
            pa1Var.a = null;
            pa1Var.b = null;
            pa1Var.c.h(null);
            return true;
        }
        return cancel;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.d.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.d.c instanceof e71;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.d.isDone();
    }

    public final String toString() {
        return this.d.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.d.get(j, timeUnit);
    }
}
