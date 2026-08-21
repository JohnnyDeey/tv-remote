package defpackage;

import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class qx {
    public static final io0 b = new io0(0);
    public final /* synthetic */ vx a;

    public qx(vx vxVar) {
        this.a = vxVar;
    }

    public static Class b(ClassLoader classLoader, String str) {
        io0 io0Var = b;
        io0 io0Var2 = (io0) io0Var.get(classLoader);
        if (io0Var2 == null) {
            io0Var2 = new io0(0);
            io0Var.put(classLoader, io0Var2);
        }
        Class cls = (Class) io0Var2.get(str);
        if (cls == null) {
            Class<?> cls2 = Class.forName(str, false, classLoader);
            io0Var2.put(str, cls2);
            return cls2;
        }
        return cls;
    }

    public static Class c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str);
        } catch (ClassCastException e) {
            throw new RuntimeException(qo0.r("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e);
        } catch (ClassNotFoundException e2) {
            throw new RuntimeException(qo0.r("Unable to instantiate fragment ", str, ": make sure class name exists"), e2);
        }
    }

    public final gx a(String str) {
        try {
            return (gx) c(this.a.t.t.getClassLoader(), str).getConstructor(null).newInstance(null);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(qo0.r("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(qo0.r("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException(qo0.r("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e3);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException(qo0.r("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e4);
        }
    }
}
