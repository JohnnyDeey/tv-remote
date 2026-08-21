package defpackage;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Objects;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class n00 implements WildcardType, Serializable {
    public final Type c;
    public final Type d;

    public n00(Type[] typeArr, Type[] typeArr2) {
        if (typeArr2.length <= 1) {
            if (typeArr.length == 1) {
                if (typeArr2.length == 1) {
                    Objects.requireNonNull(typeArr2[0]);
                    f20.b(typeArr2[0]);
                    if (typeArr[0] == Object.class) {
                        this.d = f20.a(typeArr2[0]);
                        this.c = Object.class;
                        return;
                    } else {
                        c.k("When lower bound is specified, upper bound must be Object");
                        throw null;
                    }
                }
                Objects.requireNonNull(typeArr[0]);
                f20.b(typeArr[0]);
                this.d = null;
                this.c = f20.a(typeArr[0]);
                return;
            }
            c.k("Exactly one upper bound must be specified");
            throw null;
        }
        c.k("At most one lower bound is supported");
        throw null;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof WildcardType) && f20.u(this, (WildcardType) obj)) {
            return true;
        }
        return false;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.d;
        if (type != null) {
            return new Type[]{type};
        }
        return f20.k;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.c};
    }

    public final int hashCode() {
        int i;
        Type type = this.d;
        if (type != null) {
            i = type.hashCode() + 31;
        } else {
            i = 1;
        }
        return (this.c.hashCode() + 31) ^ i;
    }

    public final String toString() {
        Type type = this.d;
        if (type != null) {
            return "? super " + f20.i0(type);
        }
        Type type2 = this.c;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + f20.i0(type2);
    }
}
