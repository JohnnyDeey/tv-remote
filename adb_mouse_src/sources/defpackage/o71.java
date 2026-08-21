package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class o71 extends n71 {
    public final byte[] e;

    public o71(byte[] bArr) {
        bArr.getClass();
        this.e = bArr;
    }

    @Override // defpackage.n71
    public final byte b(int i) {
        return this.e[i];
    }

    @Override // defpackage.n71
    public final byte c(int i) {
        return this.e[i];
    }

    @Override // defpackage.n71
    public final int d(int i, int i2) {
        return d81.a(i, this.e, 0, i2);
    }

    @Override // defpackage.n71
    public final int e() {
        return this.e.length;
    }

    @Override // defpackage.n71
    public final n71 f(int i, int i2) {
        byte[] bArr = this.e;
        int i3 = n71.i(0, i2, bArr.length);
        if (i3 == 0) {
            return n71.d;
        }
        return new m71(bArr, 0, i3);
    }

    @Override // defpackage.n71
    public final void g(p71 p71Var) {
        byte[] bArr = this.e;
        p71Var.b(bArr, 0, bArr.length);
    }

    @Override // defpackage.n71
    public final boolean h(n71 n71Var) {
        boolean z = n71Var instanceof o71;
        byte[] bArr = this.e;
        if (z) {
            return Arrays.equals(bArr, ((o71) n71Var).e);
        }
        boolean z2 = n71Var instanceof m71;
        if (z2) {
            m71 m71Var = (m71) n71Var;
            int i = m71Var.g;
            int length = bArr.length;
            if (length <= i) {
                if (length <= i) {
                    if (z) {
                        return n71.k(bArr, 0, ((o71) n71Var).e, 0, length);
                    }
                    if (z2) {
                        return n71.k(bArr, 0, m71Var.e, m71Var.f, length);
                    }
                    return n71Var.f(0, length).equals(f(0, length));
                }
                c.k(qo0.o("Ran off end of other: 0, ", length, ", ", i));
                return false;
            }
            throw new IllegalArgumentException("Length too large: " + length + length);
        }
        return n71Var.h(this);
    }
}
