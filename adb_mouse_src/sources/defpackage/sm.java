package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class sm extends x implements d0 {
    public static final char[] d = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public final byte[] c;

    public sm(byte[] bArr) {
        this.c = bArr;
    }

    public static void q(int i, StringBuilder sb) {
        char[] cArr = d;
        sb.append(cArr[(i >>> 4) & 15]);
        sb.append(cArr[i & 15]);
    }

    @Override // defpackage.d0
    public final String d() {
        int i;
        byte[] bArr = this.c;
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(((v.e(length) + length) * 2) + 3);
        sb.append("#1C");
        if (length < 128) {
            q(length, sb);
        } else {
            byte[] bArr2 = new byte[5];
            int i2 = length;
            int i3 = 5;
            while (true) {
                i = i3 - 1;
                bArr2[i] = (byte) i2;
                i2 >>>= 8;
                if (i2 == 0) {
                    break;
                }
                i3 = i;
            }
            int i4 = i3 - 2;
            bArr2[i4] = (byte) (128 | (5 - i));
            while (true) {
                int i5 = i4 + 1;
                q(bArr2[i4], sb);
                if (i5 >= 5) {
                    break;
                }
                i4 = i5;
            }
        }
        for (byte b : bArr) {
            q(b, sb);
        }
        return sb.toString();
    }

    @Override // defpackage.x, defpackage.p
    public final int hashCode() {
        return f20.K(this.c);
    }

    @Override // defpackage.x
    public final boolean i(x xVar) {
        if (!(xVar instanceof sm)) {
            return false;
        }
        return Arrays.equals(this.c, ((sm) xVar).c);
    }

    @Override // defpackage.x
    public final void j(v vVar, boolean z) {
        vVar.m(28, z, this.c);
    }

    @Override // defpackage.x
    public final boolean k() {
        return false;
    }

    @Override // defpackage.x
    public final int l(boolean z) {
        return v.f(this.c.length, z);
    }

    public final String toString() {
        return d();
    }
}
