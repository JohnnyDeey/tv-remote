package defpackage;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class kl0 extends r21 {
    public final int k;

    public kl0(int i) {
        this.k = i;
    }

    @Override // defpackage.r21
    public final s3 N() {
        return new s3(new q3("STLS", this.k, 0, 0, 0), new byte[0]);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof kl0) && this.k == ((kl0) obj).k) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.k);
    }

    public final String toString() {
        return "STLS(version=" + this.k + ')';
    }
}
