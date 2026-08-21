package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class rm extends x implements d0 {
    public final byte[] c;

    public rm(byte[] bArr) {
        this.c = bArr;
    }

    @Override // defpackage.d0
    public final String d() {
        String str = yp0.a;
        byte[] bArr = this.c;
        int length = bArr.length;
        char[] cArr = new char[length];
        short[] sArr = iw0.a;
        int i = 0;
        int i2 = 0;
        loop0: while (i < length) {
            int i3 = i + 1;
            byte b = bArr[i];
            if (b >= 0) {
                if (i2 >= length) {
                    i2 = -1;
                    break;
                }
                cArr[i2] = (char) b;
                i = i3;
                i2++;
            } else {
                short s = iw0.a[b & Byte.MAX_VALUE];
                int i4 = s >>> 8;
                byte b2 = (byte) s;
                while (true) {
                    if (b2 >= 0) {
                        if (i3 >= length) {
                            break loop0;
                        }
                        int i5 = i3 + 1;
                        byte b3 = bArr[i3];
                        i4 = (i4 << 6) | (b3 & 63);
                        b2 = iw0.b[b2 + ((b3 & 255) >>> 4)];
                        i3 = i5;
                    } else if (b2 != -2) {
                        if (i4 <= 65535) {
                            if (i2 < length) {
                                cArr[i2] = (char) i4;
                                i2++;
                                i = i3;
                            }
                        } else if (i2 < length - 1) {
                            int i6 = i2 + 1;
                            cArr[i2] = (char) ((i4 >>> 10) + 55232);
                            i2 += 2;
                            cArr[i6] = (char) ((i4 & 1023) | 56320);
                            i = i3;
                        }
                    }
                }
                i2 = -1;
                break;
            }
        }
        if (i2 >= 0) {
            return new String(cArr, 0, i2);
        }
        c.k("Invalid UTF-8 input");
        return null;
    }

    @Override // defpackage.x, defpackage.p
    public final int hashCode() {
        return f20.K(this.c);
    }

    @Override // defpackage.x
    public final boolean i(x xVar) {
        if (!(xVar instanceof rm)) {
            return false;
        }
        return Arrays.equals(this.c, ((rm) xVar).c);
    }

    @Override // defpackage.x
    public final void j(v vVar, boolean z) {
        vVar.m(12, z, this.c);
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
