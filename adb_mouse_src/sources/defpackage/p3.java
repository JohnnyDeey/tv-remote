package defpackage;

import java.io.Closeable;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class p3 implements Closeable {
    public final /* synthetic */ int c;
    public o3 d;
    public final Object e;

    public p3(int i) {
        this.c = i;
        switch (i) {
            case 1:
                this.e = new cb0(1);
                return;
            default:
                this.e = new i81(25);
                return;
        }
    }

    public synchronized void a(int i) {
        o3 o3Var = this.d;
        if (o3Var != null) {
            i81 i81Var = (i81) this.e;
            i81Var.getClass();
            if (i >= 0 && i < 256) {
                o3Var.f(i81Var.C(new int[]{i, 0}).concat(((i81) this.e).C(new int[]{0, 0})));
            } else {
                throw new IllegalArgumentException("Failed requirement.");
            }
        } else {
            k20.p0("session");
            throw null;
        }
    }

    public synchronized void b(int i, int i2) {
        o3 o3Var = this.d;
        if (o3Var != null) {
            o3Var.f(((i81) this.e).B(i, 0) + ((i81) this.e).B(i, i2) + ((i81) this.e).B(i, 0) + ((i81) this.e).C(new int[]{0, 0}));
        } else {
            k20.p0("session");
            throw null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.c) {
            case 0:
                o3 o3Var = this.d;
                if (o3Var != null) {
                    if (o3Var != null) {
                        o3Var.close();
                        return;
                    } else {
                        k20.p0("session");
                        throw null;
                    }
                }
                return;
            default:
                o3 o3Var2 = this.d;
                if (o3Var2 != null) {
                    if (o3Var2 != null) {
                        o3Var2.close();
                        return;
                    } else {
                        k20.p0("session");
                        throw null;
                    }
                }
                return;
        }
    }
}
