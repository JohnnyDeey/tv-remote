package defpackage;

import android.util.Base64;
import java.util.Arrays;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class ca {
    public final String a;
    public final byte[] b;
    public final af0 c;

    public ca(String str, byte[] bArr, af0 af0Var) {
        this.a = str;
        this.b = bArr;
        this.c = af0Var;
    }

    public static b8 a() {
        b8 b8Var = new b8(1);
        b8Var.f = af0.c;
        return b8Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ca) {
            ca caVar = (ca) obj;
            if (this.a.equals(caVar.a) && Arrays.equals(this.b, caVar.b) && this.c.equals(caVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b)) * 1000003);
    }

    public final String toString() {
        String encodeToString;
        byte[] bArr = this.b;
        if (bArr == null) {
            encodeToString = "";
        } else {
            encodeToString = Base64.encodeToString(bArr, 2);
        }
        StringBuilder sb = new StringBuilder("TransportContext(");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.c);
        sb.append(", ");
        return qo0.s(sb, encodeToString, ")");
    }
}
