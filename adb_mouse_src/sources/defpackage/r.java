package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class r {
    public final int a;
    public final byte[] b;

    public r(byte[] bArr) {
        this.a = f20.K(bArr);
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            return Arrays.equals(this.b, ((r) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }
}
