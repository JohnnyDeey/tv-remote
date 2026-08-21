package defpackage;

/* loaded from: classes.dex */
public final class fm extends m {
    @Override // defpackage.m, defpackage.x
    public final void j(v vVar, boolean z) {
        vVar.m(24, z, z());
    }

    @Override // defpackage.m, defpackage.x
    public final int l(boolean z) {
        return v.f(z().length, z);
    }

    public final byte[] z() {
        byte[] bArr = this.c;
        if (bArr[bArr.length - 1] == 90) {
            if (!v()) {
                byte[] bArr2 = new byte[bArr.length + 4];
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length - 1);
                System.arraycopy(yp0.b("0000Z"), 0, bArr2, bArr.length - 1, 5);
                return bArr2;
            }
            if (!w()) {
                byte[] bArr3 = new byte[bArr.length + 2];
                System.arraycopy(bArr, 0, bArr3, 0, bArr.length - 1);
                System.arraycopy(yp0.b("00Z"), 0, bArr3, bArr.length - 1, 3);
                return bArr3;
            }
            if (u()) {
                int length = bArr.length - 2;
                while (length > 0 && bArr[length] == 48) {
                    length--;
                }
                if (bArr[length] == 46) {
                    byte[] bArr4 = new byte[length + 1];
                    System.arraycopy(bArr, 0, bArr4, 0, length);
                    bArr4[length] = 90;
                    return bArr4;
                }
                byte[] bArr5 = new byte[length + 2];
                int i = length + 1;
                System.arraycopy(bArr, 0, bArr5, 0, i);
                bArr5[i] = 90;
                return bArr5;
            }
        }
        return bArr;
    }

    @Override // defpackage.m, defpackage.x
    public final x o() {
        return this;
    }

    @Override // defpackage.x
    public final x p() {
        return this;
    }
}
