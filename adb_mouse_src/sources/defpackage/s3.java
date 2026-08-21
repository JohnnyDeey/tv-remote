package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class s3 {
    public final q3 a;
    public final byte[] b;

    public s3(q3 q3Var, byte[] bArr) {
        this.a = q3Var;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof s3) {
                s3 s3Var = (s3) obj;
                if (!this.a.equals(s3Var.a) || !this.b.equals(s3Var.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Message[header=");
        sb.append(this.a);
        sb.append(", data=");
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        int i = 0;
        for (byte b : this.b) {
            i++;
            if (i > 1) {
                sb2.append((CharSequence) "");
            }
            sb2.append((CharSequence) String.format("%02X", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1)));
        }
        sb2.append((CharSequence) "");
        sb.append(sb2.toString());
        sb.append(']');
        return sb.toString();
    }
}
