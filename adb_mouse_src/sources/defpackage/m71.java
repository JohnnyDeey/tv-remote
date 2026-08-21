package defpackage;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class m71 extends n71 {
    public final byte[] e;
    public final int f;
    public final int g;

    public m71(byte[] bArr, int i, int i2) {
        n71.i(i, i + i2, bArr.length);
        this.e = bArr;
        this.f = i;
        this.g = i2;
    }

    @Override // defpackage.n71
    public final byte b(int i) {
        int i2 = this.g;
        if (((i2 - (i + 1)) | i) < 0) {
            if (i < 0) {
                throw new ArrayIndexOutOfBoundsException(qo0.m("Index < 0: ", i));
            }
            throw new ArrayIndexOutOfBoundsException(qo0.o("Index > length: ", i, ", ", i2));
        }
        return this.e[this.f + i];
    }

    @Override // defpackage.n71
    public final byte c(int i) {
        return this.e[this.f + i];
    }

    @Override // defpackage.n71
    public final int d(int i, int i2) {
        return d81.a(i, this.e, this.f, i2);
    }

    @Override // defpackage.n71
    public final int e() {
        return this.g;
    }

    @Override // defpackage.n71
    public final n71 f(int i, int i2) {
        int i3 = n71.i(i, i2, this.g);
        if (i3 == 0) {
            return n71.d;
        }
        return new m71(this.e, this.f + i, i3);
    }

    @Override // defpackage.n71
    public final void g(p71 p71Var) {
        p71Var.b(this.e, this.f, this.g);
    }

    @Override // defpackage.n71
    public final boolean h(n71 n71Var) {
        boolean z = n71Var instanceof o71;
        if (!z && !(n71Var instanceof m71)) {
            return n71Var.h(this);
        }
        int e = n71Var.e();
        int i = this.g;
        if (i <= e) {
            if (i <= n71Var.e()) {
                byte[] bArr = this.e;
                int i2 = this.f;
                if (z) {
                    return n71.k(bArr, i2, ((o71) n71Var).e, 0, i);
                }
                if (n71Var instanceof m71) {
                    m71 m71Var = (m71) n71Var;
                    return n71.k(bArr, i2, m71Var.e, m71Var.f, i);
                }
                return n71Var.f(0, i).equals(f(i2, i + i2));
            }
            c.k(qo0.o("Ran off end of other: 0, ", i, ", ", n71Var.e()));
            return false;
        }
        throw new IllegalArgumentException("Length too large: " + i + i);
    }
}
