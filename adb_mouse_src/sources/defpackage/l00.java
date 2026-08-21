package defpackage;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.Objects;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class l00 implements GenericArrayType, Serializable {
    public final Type c;

    public l00(Type type) {
        Objects.requireNonNull(type);
        this.c = f20.a(type);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof GenericArrayType) && f20.u(this, (GenericArrayType) obj)) {
            return true;
        }
        return false;
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.c;
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return f20.i0(this.c) + "[]";
    }
}
