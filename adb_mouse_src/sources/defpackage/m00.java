package defpackage;

import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class m00 implements ParameterizedType, Serializable {
    public final Type c;
    public final Type d;
    public final Type[] e;

    public m00(Type type, Class cls, Type... typeArr) {
        Objects.requireNonNull(cls);
        if (type == null && !Modifier.isStatic(cls.getModifiers()) && cls.getDeclaringClass() != null) {
            c.r(cls, "Must specify owner type for ");
            throw null;
        }
        this.c = type != null ? f20.a(type) : null;
        this.d = f20.a(cls);
        Type[] typeArr2 = (Type[]) typeArr.clone();
        this.e = typeArr2;
        int length = typeArr2.length;
        for (int i = 0; i < length; i++) {
            Objects.requireNonNull(this.e[i]);
            f20.b(this.e[i]);
            Type[] typeArr3 = this.e;
            typeArr3[i] = f20.a(typeArr3[i]);
        }
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof ParameterizedType) && f20.u(this, (ParameterizedType) obj)) {
            return true;
        }
        return false;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.e.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.c;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.d;
    }

    public final int hashCode() {
        int i;
        int hashCode = Arrays.hashCode(this.e) ^ this.d.hashCode();
        Type type = this.c;
        if (type != null) {
            i = type.hashCode();
        } else {
            i = 0;
        }
        return i ^ hashCode;
    }

    public final String toString() {
        Type[] typeArr = this.e;
        int length = typeArr.length;
        Type type = this.d;
        if (length == 0) {
            return f20.i0(type);
        }
        StringBuilder sb = new StringBuilder((length + 1) * 30);
        sb.append(f20.i0(type));
        sb.append("<");
        sb.append(f20.i0(typeArr[0]));
        for (int i = 1; i < length; i++) {
            sb.append(", ");
            sb.append(f20.i0(typeArr[i]));
        }
        sb.append(">");
        return sb.toString();
    }
}
