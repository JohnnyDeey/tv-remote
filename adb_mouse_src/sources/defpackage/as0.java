package defpackage;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class as0 implements is0 {
    public boolean c;
    public boolean d;
    public Object e;
    public Object f;

    public as0(sb0 sb0Var, ws0 ws0Var, ws0 ws0Var2) {
        if (!xf0.g.i(sb0Var.p().H.d())) {
            this.c = !true;
            this.d = !true;
            int d = ws0Var2.d() + ws0Var.d();
            byte[] c = mi0.c(sb0Var, d);
            ws0Var.a(c, 0, ws0Var.d());
            int d2 = ws0Var.d();
            ws0Var2.a(c, d2, ws0Var2.d());
            if (ws0Var2.d() + d2 == d) {
                sb0Var.q();
                this.f = new gt0(sb0Var, ws0Var);
                this.e = new gt0(sb0Var, ws0Var2);
                return;
            }
            throw new us0((short) 80, null, null);
        }
        throw new us0((short) 80, null, null);
    }

    @Override // defpackage.is0
    public int b(int i) {
        return i + (this.c ? 1 : 0) + ((gt0) this.e).e;
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [boolean] */
    @Override // defpackage.is0
    public ps0 c(long j, short s, xf0 xf0Var, byte[] bArr, int i) {
        short s2;
        gt0 gt0Var = (gt0) this.e;
        int i2 = gt0Var.e;
        int i3 = i - i2;
        ?? r7 = this.c;
        if (i3 >= r7) {
            if (ht0.j(i2, 5 + i3, gt0Var.a(j, s, bArr, 5, i3), bArr)) {
                if (r7 != 0) {
                    while (true) {
                        int i4 = i3 - 1;
                        if (i4 >= 0) {
                            byte b = bArr[i3 + 4];
                            if (b != 0) {
                                s2 = (short) (b & 255);
                                i3 = i4;
                                break;
                            }
                            i3 = i4;
                        } else {
                            throw new us0((short) 10, null, null);
                        }
                    }
                } else {
                    s2 = s;
                }
                return new ps0(5, i3, s2, bArr);
            }
            throw new us0((short) 20, null, null);
        }
        throw new us0((short) 50, null, null);
    }

    @Override // defpackage.is0
    public boolean e() {
        return this.c;
    }

    @Override // defpackage.is0
    public ss0 i(long j, short s, xf0 xf0Var, byte[] bArr, int i, int i2) {
        int i3 = ((gt0) this.f).e;
        boolean z = this.d;
        int i4 = i2 + (z ? 1 : 0);
        int i5 = 5 + i4;
        int i6 = i3 + i5;
        byte[] bArr2 = new byte[i6];
        System.arraycopy(bArr, i, bArr2, 5, i2);
        if (z) {
            bArr2[i2 + 5] = (byte) s;
            s = 25;
        }
        short s2 = s;
        byte[] a = ((gt0) this.f).a(j, s2, bArr2, 5, i4);
        System.arraycopy(a, 0, bArr2, i5, a.length);
        return new ss0(bArr2, i6, s2);
    }

    @Override // defpackage.is0
    public void j() {
        throw new us0((short) 80, null, null);
    }

    @Override // defpackage.is0
    public void k() {
        throw new us0((short) 80, null, null);
    }
}
