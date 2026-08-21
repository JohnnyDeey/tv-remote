package defpackage;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class v8 implements tf0 {
    public final int a;

    public v8(int i) {
        this.a = i;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return tf0.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof tf0) {
                tf0 tf0Var = (tf0) obj;
                if (this.a == tf0Var.tag() && sf0.c.equals(tf0Var.intEncoding())) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.a ^ 14552422) + (sf0.c.hashCode() ^ 2041407134);
    }

    @Override // defpackage.tf0
    public final sf0 intEncoding() {
        return sf0.c;
    }

    @Override // defpackage.tf0
    public final int tag() {
        return this.a;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.a + "intEncoding=" + sf0.c + ')';
    }
}
