package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class zz0 extends r21 {
    public final int k;
    public final int l;
    public final byte[] m;

    public zz0(byte[] bArr, int i, int i2) {
        this.k = i;
        this.l = i2;
        this.m = bArr;
    }

    @Override // defpackage.r21
    public final s3 N() {
        byte[] bArr = this.m;
        int length = bArr.length;
        int i = 0;
        for (byte b : bArr) {
            i += b & 255;
        }
        return new s3(new q3("WRTE", this.k, this.l, length, i), bArr);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof zz0) {
                zz0 zz0Var = (zz0) obj;
                if (this.k != zz0Var.k || this.l != zz0Var.l || !this.m.equals(zz0Var.m)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.m) + ((Integer.hashCode(this.l) + (Integer.hashCode(this.k) * 31)) * 31);
    }

    public final String toString() {
        return "WRTE(localId=" + this.k + ", remoteId=" + this.l + ", data=" + Arrays.toString(this.m) + ')';
    }
}
