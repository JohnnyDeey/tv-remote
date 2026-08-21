package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class bm extends x implements d0 {
    public final char[] c;

    public bm(char[] cArr) {
        this.c = cArr;
    }

    @Override // defpackage.d0
    public final String d() {
        return new String(this.c);
    }

    @Override // defpackage.x, defpackage.p
    public final int hashCode() {
        char[] cArr = this.c;
        int length = cArr.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length >= 0) {
                i = (i * 257) ^ cArr[length];
            } else {
                return i;
            }
        }
    }

    @Override // defpackage.x
    public final boolean i(x xVar) {
        if (!(xVar instanceof bm)) {
            return false;
        }
        return Arrays.equals(this.c, ((bm) xVar).c);
    }

    @Override // defpackage.x
    public final void j(v vVar, boolean z) {
        char[] cArr = this.c;
        int length = cArr.length;
        vVar.p(30, z);
        vVar.k(length * 2);
        byte[] bArr = new byte[8];
        int i = length & (-4);
        int i2 = 0;
        while (i2 < i) {
            char c = cArr[i2];
            char c2 = cArr[i2 + 1];
            char c3 = cArr[i2 + 2];
            char c4 = cArr[i2 + 3];
            i2 += 4;
            bArr[0] = (byte) (c >> '\b');
            bArr[1] = (byte) c;
            bArr[2] = (byte) (c2 >> '\b');
            bArr[3] = (byte) c2;
            bArr[4] = (byte) (c3 >> '\b');
            bArr[5] = (byte) c3;
            bArr[6] = (byte) (c4 >> '\b');
            bArr[7] = (byte) c4;
            vVar.j(bArr, 0, 8);
        }
        if (i2 < length) {
            int i3 = 0;
            do {
                char c5 = cArr[i2];
                i2++;
                int i4 = i3 + 1;
                bArr[i3] = (byte) (c5 >> '\b');
                i3 += 2;
                bArr[i4] = (byte) c5;
            } while (i2 < length);
            vVar.j(bArr, 0, i3);
        }
    }

    @Override // defpackage.x
    public final boolean k() {
        return false;
    }

    @Override // defpackage.x
    public final int l(boolean z) {
        return v.f(this.c.length * 2, z);
    }

    public final String toString() {
        return d();
    }
}
