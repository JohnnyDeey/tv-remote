package defpackage;

import java.lang.reflect.Method;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class rw0 extends vw0 {
    public final /* synthetic */ Method b;
    public final /* synthetic */ Object c;

    public rw0(Method method, Object obj) {
        this.b = method;
        this.c = obj;
    }

    @Override // defpackage.vw0
    public final Object a(Class cls) {
        String a = g00.a(cls);
        if (a == null) {
            return this.b.invoke(this.c, cls);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(a));
    }
}
