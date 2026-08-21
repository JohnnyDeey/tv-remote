package defpackage;

/* loaded from: classes.dex */
public final class tb extends t {
    public final int f;
    public final t[] g;

    public tb(byte[] bArr, t[] tVarArr) {
        super(bArr);
        this.g = tVarArr;
        this.f = 1000;
    }

    public static byte[] r(t[] tVarArr) {
        int length = tVarArr.length;
        if (length != 0) {
            if (length != 1) {
                int i = 0;
                for (t tVar : tVarArr) {
                    i += tVar.c.length;
                }
                byte[] bArr = new byte[i];
                int i2 = 0;
                for (t tVar2 : tVarArr) {
                    byte[] bArr2 = tVar2.c;
                    System.arraycopy(bArr2, 0, bArr, i2, bArr2.length);
                    i2 += bArr2.length;
                }
                return bArr;
            }
            return tVarArr[0].c;
        }
        return t.e;
    }

    @Override // defpackage.x
    public final void j(v vVar, boolean z) {
        vVar.p(36, z);
        vVar.i(128);
        t[] tVarArr = this.g;
        if (tVarArr != null) {
            vVar.r(tVarArr);
        } else {
            int i = 0;
            while (true) {
                byte[] bArr = this.c;
                if (i >= bArr.length) {
                    break;
                }
                int min = Math.min(bArr.length - i, this.f);
                vVar.p(4, true);
                vVar.k(min);
                vVar.j(bArr, i, min);
                i += min;
            }
        }
        vVar.i(0);
        vVar.i(0);
    }

    @Override // defpackage.x
    public final boolean k() {
        return true;
    }

    @Override // defpackage.x
    public final int l(boolean z) {
        int i;
        if (z) {
            i = 4;
        } else {
            i = 3;
        }
        t[] tVarArr = this.g;
        if (tVarArr != null) {
            for (t tVar : tVarArr) {
                i += tVar.l(true);
            }
            return i;
        }
        byte[] bArr = this.c;
        int length = bArr.length;
        int i2 = this.f;
        int i3 = length / i2;
        int f = (v.f(i2, true) * i3) + i;
        int length2 = bArr.length - (i3 * i2);
        if (length2 > 0) {
            return v.f(length2, true) + f;
        }
        return f;
    }
}
