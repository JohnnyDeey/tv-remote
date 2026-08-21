package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class g0 extends r21 {
    public final f0 k;
    public final byte[] l;

    public g0(f0 f0Var, byte[] bArr) {
        this.k = f0Var;
        this.l = bArr;
    }

    @Override // defpackage.r21
    public final s3 N() {
        int i = this.k.c;
        byte[] bArr = this.l;
        int length = bArr.length;
        int i2 = 0;
        for (byte b : bArr) {
            i2 += b & 255;
        }
        return new s3(new q3("AUTH", i, 0, length, i2), bArr);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof g0) {
                g0 g0Var = (g0) obj;
                if (this.k != g0Var.k || !this.l.equals(g0Var.l)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.l) + (this.k.hashCode() * 31);
    }

    public final String toString() {
        return "AUTH(type=" + this.k + ", data=" + Arrays.toString(this.l) + ')';
    }
}
