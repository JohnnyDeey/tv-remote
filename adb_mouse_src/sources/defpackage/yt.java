package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class yt {
    public final bu a;
    public final byte[] b;

    public yt(bu buVar, byte[] bArr) {
        if (buVar != null) {
            if (bArr != null) {
                this.a = buVar;
                this.b = bArr;
                return;
            } else {
                c.g("bytes is null");
                throw null;
            }
        }
        c.g("encoding is null");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yt)) {
            return false;
        }
        yt ytVar = (yt) obj;
        if (!this.a.equals(ytVar.a)) {
            return false;
        }
        return Arrays.equals(this.b, ytVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.a + ", bytes=[...]}";
    }
}
