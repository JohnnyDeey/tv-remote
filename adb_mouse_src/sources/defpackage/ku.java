package defpackage;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class ku extends pu0 {
    public static final ju d = new ju();
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();

    public ku(Class cls) {
        try {
            Field[] declaredFields = cls.getDeclaredFields();
            int i = 0;
            for (Field field : declaredFields) {
                if (field.isEnumConstant()) {
                    declaredFields[i] = field;
                    i++;
                }
            }
            Field[] fieldArr = (Field[]) Arrays.copyOf(declaredFields, i);
            AccessibleObject.setAccessible(fieldArr, true);
            for (Field field2 : fieldArr) {
                Enum r4 = (Enum) field2.get(null);
                String name = r4.name();
                String str = r4.toString();
                an0 an0Var = (an0) field2.getAnnotation(an0.class);
                if (an0Var != null) {
                    name = an0Var.value();
                    for (String str2 : an0Var.alternate()) {
                        this.a.put(str2, r4);
                    }
                }
                this.a.put(name, r4);
                this.b.put(str, r4);
                this.c.put(r4, name);
            }
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.pu0
    public final void b(g40 g40Var, Object obj) {
        String str;
        Enum r2 = (Enum) obj;
        if (r2 == null) {
            str = null;
        } else {
            str = (String) this.c.get(r2);
        }
        g40Var.q(str);
    }
}
