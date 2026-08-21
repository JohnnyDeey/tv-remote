package defpackage;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class ve extends r21 {
    public final int k;
    public final int l;
    public final String m;

    public ve(String str, int i, int i2) {
        this.k = i;
        this.l = i2;
        this.m = str;
    }

    @Override // defpackage.r21
    public final s3 N() {
        byte[] bytes = this.m.getBytes(qg.a);
        bytes.getClass();
        int length = bytes.length;
        int i = 0;
        for (byte b : bytes) {
            i += b & 255;
        }
        return new s3(new q3("CNXN", this.k, this.l, length, i), bytes);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ve) {
                ve veVar = (ve) obj;
                if (this.k != veVar.k || this.l != veVar.l || !this.m.equals(veVar.m)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.m.hashCode() + ((Integer.hashCode(this.l) + (Integer.hashCode(this.k) * 31)) * 31);
    }

    public final String toString() {
        return "CNXN(version=" + this.k + ", maxPayloadSize=" + this.l + ", systemIdentityString=" + this.m + ')';
    }
}
