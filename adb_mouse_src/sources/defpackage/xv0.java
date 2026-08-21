package defpackage;

import java.lang.reflect.Type;
import java.util.Objects;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public class xv0<T> {
    public final Class a;
    public final Type b;
    public final int c;

    public xv0(Type type) {
        Objects.requireNonNull(type);
        Type a = f20.a(type);
        this.b = a;
        this.a = f20.E(a);
        this.c = a.hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xv0) {
            if (f20.u(this.b, ((xv0) obj).b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.c;
    }

    public final String toString() {
        return f20.i0(this.b);
    }
}
