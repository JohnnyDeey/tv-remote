package defpackage;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class oh {
    public static final oh c = new oh();
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();

    public static void b(HashMap hashMap, nh nhVar, l50 l50Var, Class cls) {
        l50 l50Var2 = (l50) hashMap.get(nhVar);
        if (l50Var2 != null && l50Var != l50Var2) {
            throw new IllegalArgumentException("Method " + nhVar.b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + l50Var2 + ", new value " + l50Var);
        }
        if (l50Var2 == null) {
            hashMap.put(nhVar, l50Var);
        }
    }

    public final mh a(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = this.a;
        if (superclass != null) {
            mh mhVar = (mh) hashMap2.get(superclass);
            if (mhVar == null) {
                mhVar = a(superclass, null);
            }
            hashMap.putAll(mhVar.b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            mh mhVar2 = (mh) hashMap2.get(cls2);
            if (mhVar2 == null) {
                mhVar2 = a(cls2, null);
            }
            for (Map.Entry entry : mhVar2.b.entrySet()) {
                b(hashMap, (nh) entry.getKey(), (l50) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            jd0 jd0Var = (jd0) method.getAnnotation(jd0.class);
            if (jd0Var != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length > 0) {
                    if (s50.class.isAssignableFrom(parameterTypes[0])) {
                        i = 1;
                    } else {
                        c.k("invalid parameter type. Must be one and instanceof LifecycleOwner");
                        return null;
                    }
                } else {
                    i = 0;
                }
                l50 value = jd0Var.value();
                if (parameterTypes.length > 1) {
                    if (l50.class.isAssignableFrom(parameterTypes[1])) {
                        if (value == l50.ON_ANY) {
                            i = 2;
                        } else {
                            c.k("Second arg is supported only for ON_ANY value");
                            return null;
                        }
                    } else {
                        c.k("invalid parameter type. second arg must be an event");
                        return null;
                    }
                }
                if (parameterTypes.length <= 2) {
                    b(hashMap, new nh(i, method), value, cls);
                    z = true;
                } else {
                    c.k("cannot have more than 2 params");
                    return null;
                }
            }
        }
        mh mhVar3 = new mh(hashMap);
        hashMap2.put(cls, mhVar3);
        this.b.put(cls, Boolean.valueOf(z));
        return mhVar3;
    }
}
