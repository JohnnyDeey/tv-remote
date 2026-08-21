package defpackage;

/* loaded from: classes.dex */
public final class gt0 {
    public final sb0 a;
    public final ws0 b;
    public final int c;
    public final int d;
    public final int e;

    public gt0(sb0 sb0Var, ws0 ws0Var) {
        this.a = sb0Var;
        this.b = ws0Var;
        int d = ws0Var.d();
        this.e = sb0Var.p().z ? Math.min(d, 10) : d;
        int b = ws0Var.b();
        this.c = b;
        if (((js0) sb0Var.c).a().H.k() && ws0Var.d() == 20) {
            this.d = 4;
        } else {
            this.d = b / 8;
        }
    }

    public final byte[] a(long j, short s, byte[] bArr, int i, int i2) {
        xf0 xf0Var = ((js0) this.a.c).a().H;
        byte[] bArr2 = new byte[13];
        ht0.c0(0, j, bArr2);
        bArr2[8] = (byte) s;
        ht0.d0(xf0Var, bArr2, 9);
        ht0.a0(bArr2, i2, 11);
        ws0 ws0Var = this.b;
        ws0Var.update(bArr2, 0, 13);
        ws0Var.update(bArr, i, i2);
        byte[] c = ws0Var.c();
        int length = c.length;
        int i3 = this.e;
        if (length <= i3) {
            return c;
        }
        return f20.o(i3, c);
    }
}
