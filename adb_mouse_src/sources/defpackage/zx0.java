package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public abstract class zx0 {
    public final n8 a;
    public final n8 b;
    public final n8 c;

    public zx0(n8 n8Var, n8 n8Var2, n8 n8Var3) {
        this.a = n8Var;
        this.b = n8Var2;
        this.c = n8Var3;
    }

    public abstract ay0 a();

    public final Class b(Class cls) {
        String name = cls.getName();
        n8 n8Var = this.c;
        Class cls2 = (Class) n8Var.get(name);
        if (cls2 == null) {
            Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
            n8Var.put(cls.getName(), cls3);
            return cls3;
        }
        return cls2;
    }

    public final Method c(String str) {
        n8 n8Var = this.a;
        Method method = (Method) n8Var.get(str);
        if (method == null) {
            System.currentTimeMillis();
            Method declaredMethod = Class.forName(str, true, zx0.class.getClassLoader()).getDeclaredMethod("read", zx0.class);
            n8Var.put(str, declaredMethod);
            return declaredMethod;
        }
        return method;
    }

    public final Method d(Class cls) {
        String name = cls.getName();
        n8 n8Var = this.b;
        Method method = (Method) n8Var.get(name);
        if (method == null) {
            Class b = b(cls);
            System.currentTimeMillis();
            Method declaredMethod = b.getDeclaredMethod("write", cls, zx0.class);
            n8Var.put(cls.getName(), declaredMethod);
            return declaredMethod;
        }
        return method;
    }

    public abstract boolean e(int i);

    public final Parcelable f(Parcelable parcelable, int i) {
        if (!e(i)) {
            return parcelable;
        }
        return ((ay0) this).e.readParcelable(ay0.class.getClassLoader());
    }

    public final by0 g() {
        String readString = ((ay0) this).e.readString();
        if (readString == null) {
            return null;
        }
        try {
            return (by0) c(readString).invoke(null, a());
        } catch (ClassNotFoundException e) {
            f40.k("VersionedParcel encountered ClassNotFoundException", e);
            return null;
        } catch (IllegalAccessException e2) {
            f40.k("VersionedParcel encountered IllegalAccessException", e2);
            return null;
        } catch (NoSuchMethodException e3) {
            f40.k("VersionedParcel encountered NoSuchMethodException", e3);
            return null;
        } catch (InvocationTargetException e4) {
            if (!(e4.getCause() instanceof RuntimeException)) {
                f40.k("VersionedParcel encountered InvocationTargetException", e4);
                return null;
            }
            throw ((RuntimeException) e4.getCause());
        }
    }

    public abstract void h(int i);

    public final void i(by0 by0Var) {
        if (by0Var == null) {
            ((ay0) this).e.writeString(null);
            return;
        }
        try {
            ((ay0) this).e.writeString(b(by0Var.getClass()).getName());
            ay0 a = a();
            try {
                d(by0Var.getClass()).invoke(null, by0Var, a);
                Parcel parcel = a.e;
                int i = a.i;
                if (i >= 0) {
                    int i2 = a.d.get(i);
                    int dataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i2);
                    parcel.writeInt(dataPosition - i2);
                    parcel.setDataPosition(dataPosition);
                }
            } catch (ClassNotFoundException e) {
                f40.k("VersionedParcel encountered ClassNotFoundException", e);
            } catch (IllegalAccessException e2) {
                f40.k("VersionedParcel encountered IllegalAccessException", e2);
            } catch (NoSuchMethodException e3) {
                f40.k("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (InvocationTargetException e4) {
                if (!(e4.getCause() instanceof RuntimeException)) {
                    f40.k("VersionedParcel encountered InvocationTargetException", e4);
                    return;
                }
                throw ((RuntimeException) e4.getCause());
            }
        } catch (ClassNotFoundException e5) {
            f40.k(by0Var.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }
}
