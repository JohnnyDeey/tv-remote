package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class q5 implements Executor {
    public final Object c = new Object();
    public final ArrayDeque d = new ArrayDeque();
    public final r5 e;
    public Runnable f;

    public q5(r5 r5Var) {
        this.e = r5Var;
    }

    public final void a() {
        synchronized (this.c) {
            try {
                Runnable runnable = (Runnable) this.d.poll();
                this.f = runnable;
                if (runnable != null) {
                    this.e.execute(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.c) {
            try {
                this.d.add(new p5(this, 0, runnable));
                if (this.f == null) {
                    a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
