package defpackage;

import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class qv {
    public final String a;
    public final Map b;

    public qv(String str, Map map) {
        this.a = str;
        this.b = map;
    }

    public static qv a(String str) {
        return new qv(str, Collections.EMPTY_MAP);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof qv) {
                qv qvVar = (qv) obj;
                if (this.a.equals(qvVar.a) && this.b.equals(qvVar.b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.a + ", properties=" + this.b.values() + "}";
    }
}
