package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class si0 {
    public final String a;
    public final Field b;
    public final /* synthetic */ Method c;
    public final /* synthetic */ pu0 d;

    public si0(String str, Field field, Method method, pu0 pu0Var) {
        this.c = method;
        this.d = pu0Var;
        this.a = str;
        this.b = field;
        field.getName();
    }

    public final void a(g40 g40Var, Object obj) {
        Object obj2;
        Method method = this.c;
        if (method != null) {
            try {
                obj2 = method.invoke(obj, null);
            } catch (InvocationTargetException e) {
                throw new RuntimeException(qo0.r("Accessor ", ri0.d(method, false), " threw exception"), e.getCause());
            }
        } else {
            obj2 = this.b.get(obj);
        }
        if (obj2 == obj) {
            return;
        }
        g40Var.g(this.a);
        this.d.b(g40Var, obj2);
    }
}
