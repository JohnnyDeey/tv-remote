package defpackage;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class un extends uu implements Executor {
    public static final un e = new gl();
    public static final gl f;

    /* JADX WARN: Type inference failed for: r0v0, types: [gl, un] */
    static {
        ow0 ow0Var = ow0.e;
        int i = vq0.a;
        if (64 >= i) {
            i = 64;
        }
        f = ow0Var.d(gi0.o("kotlinx.coroutines.io.parallelism", i, 12));
    }

    @Override // defpackage.gl
    public final void b(dl dlVar, Runnable runnable) {
        f.b(dlVar, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        b(st.c, runnable);
    }

    @Override // defpackage.gl
    public final String toString() {
        return "Dispatchers.IO";
    }
}
