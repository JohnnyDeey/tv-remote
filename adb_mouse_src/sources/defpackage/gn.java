package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class gn {
    public final byte[] a;
    public final int b;

    public gn(int i, byte[] bArr) {
        this.a = f20.e(bArr);
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof gn) {
            gn gnVar = (gn) obj;
            if (gnVar.b != this.b) {
                return false;
            }
            return Arrays.equals(this.a, gnVar.a);
        }
        return false;
    }

    public final int hashCode() {
        return this.b ^ f20.K(this.a);
    }
}
