package defpackage;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class oe extends r21 {
    public final int k;
    public final int l;

    public oe(int i, int i2) {
        this.k = i;
        this.l = i2;
    }

    @Override // defpackage.r21
    public final s3 N() {
        return new s3(new q3("CLSE", this.k, this.l, 0, 0), new byte[0]);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oe)) {
            return false;
        }
        oe oeVar = (oe) obj;
        if (this.k == oeVar.k && this.l == oeVar.l) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.l) + (Integer.hashCode(this.k) * 31);
    }

    public final String toString() {
        return "CLSE(localId=" + this.k + ", remoteId=" + this.l + ')';
    }
}
