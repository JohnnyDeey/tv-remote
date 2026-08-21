package defpackage;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class rc0 extends r21 {
    public final int k;
    public final String l;

    public rc0(String str, int i) {
        this.k = i;
        this.l = str;
    }

    @Override // defpackage.r21
    public final s3 N() {
        byte[] bytes = this.l.getBytes(qg.a);
        bytes.getClass();
        int length = bytes.length;
        int i = 0;
        for (byte b : bytes) {
            i += b & 255;
        }
        return new s3(new q3("OPEN", this.k, 0, length, i), bytes);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof rc0) {
                rc0 rc0Var = (rc0) obj;
                if (this.k != rc0Var.k || !this.l.equals(rc0Var.l)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.l.hashCode() + (Integer.hashCode(this.k) * 31);
    }

    public final String toString() {
        return "OPEN(localId=" + this.k + ", destination=" + this.l + ')';
    }
}
