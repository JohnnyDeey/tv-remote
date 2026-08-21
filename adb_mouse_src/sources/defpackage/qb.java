package defpackage;

/* loaded from: classes.dex */
public final class qb extends e {
    public final int f;
    public final e[] g;

    public qb(e[] eVarArr) {
        super(u(eVarArr));
        this.g = eVarArr;
        this.f = 1000;
    }

    public static byte[] u(e[] eVarArr) {
        int length = eVarArr.length;
        if (length != 0) {
            if (length != 1) {
                int i = length - 1;
                int i2 = 0;
                for (int i3 = 0; i3 < i; i3++) {
                    byte[] bArr = eVarArr[i3].c;
                    if (bArr[0] == 0) {
                        i2 += bArr.length - 1;
                    } else {
                        c.k("only the last nested bitstring can have padding");
                        return null;
                    }
                }
                byte[] bArr2 = eVarArr[i].c;
                byte b = bArr2[0];
                byte[] bArr3 = new byte[i2 + bArr2.length];
                bArr3[0] = b;
                int i4 = 1;
                for (e eVar : eVarArr) {
                    byte[] bArr4 = eVar.c;
                    int length2 = bArr4.length - 1;
                    System.arraycopy(bArr4, 1, bArr3, i4, length2);
                    i4 += length2;
                }
                return bArr3;
            }
            return eVarArr[0].c;
        }
        return new byte[]{0};
    }

    @Override // defpackage.x
    public final void j(v vVar, boolean z) {
        boolean k = k();
        byte[] bArr = this.c;
        if (!k) {
            int length = bArr.length;
            vVar.p(3, z);
            vVar.k(length);
            vVar.j(bArr, 0, length);
            return;
        }
        vVar.p(35, z);
        vVar.i(128);
        e[] eVarArr = this.g;
        if (eVarArr != null) {
            vVar.r(eVarArr);
        } else if (bArr.length >= 2) {
            byte b = bArr[0];
            int length2 = bArr.length;
            int i = length2 - 1;
            int i2 = this.f;
            int i3 = i2 - 1;
            while (i > i3) {
                vVar.i(3);
                vVar.k(i2);
                vVar.i(0);
                vVar.j(bArr, length2 - i, i3);
                i -= i3;
            }
            vVar.i(3);
            vVar.k(i + 1);
            vVar.i(b);
            vVar.j(bArr, length2 - i, i);
        }
        vVar.i(0);
        vVar.i(0);
    }

    @Override // defpackage.x
    public final boolean k() {
        if (this.g == null && this.c.length <= this.f) {
            return false;
        }
        return true;
    }

    @Override // defpackage.x
    public final int l(boolean z) {
        int i;
        boolean k = k();
        byte[] bArr = this.c;
        if (!k) {
            return v.f(bArr.length, z);
        }
        if (z) {
            i = 4;
        } else {
            i = 3;
        }
        e[] eVarArr = this.g;
        if (eVarArr != null) {
            for (e eVar : eVarArr) {
                i += eVar.l(true);
            }
            return i;
        }
        if (bArr.length < 2) {
            return i;
        }
        int length = bArr.length - 2;
        int i2 = this.f;
        int i3 = i2 - 1;
        int i4 = length / i3;
        return v.f(bArr.length - (i3 * i4), true) + (v.f(i2, true) * i4) + i;
    }

    public qb(int i, byte[] bArr) {
        super(i, bArr);
        this.g = null;
        this.f = 1000;
    }
}
