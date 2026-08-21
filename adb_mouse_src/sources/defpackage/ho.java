package defpackage;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class ho extends uu {
    public static final ho f;
    public kl e;

    /* JADX WARN: Type inference failed for: r0v0, types: [gl, ho] */
    static {
        int i = cr0.c;
        int i2 = cr0.d;
        long j = cr0.e;
        String str = cr0.a;
        ?? glVar = new gl();
        glVar.e = new kl(i, i2, j, str);
        f = glVar;
    }

    @Override // defpackage.gl
    public final void b(dl dlVar, Runnable runnable) {
        this.e.b(runnable, false);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // defpackage.gl
    public final String toString() {
        return "Dispatchers.Default";
    }
}
