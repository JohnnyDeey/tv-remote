package defpackage;

import java.io.Closeable;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class r3 implements Closeable {
    public o3 c;
    public final cb0 d = new cb0(0);
    public boolean e;
    public boolean f;

    public final synchronized void a() {
        this.f = false;
        o3 o3Var = this.c;
        if (o3Var != null) {
            o3Var.f(this.d.a(0, 0, this.e, false));
        } else {
            k20.p0("session");
            throw null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        o3 o3Var = this.c;
        if (o3Var != null) {
            if (o3Var != null) {
                o3Var.close();
            } else {
                k20.p0("session");
                throw null;
            }
        }
    }
}
