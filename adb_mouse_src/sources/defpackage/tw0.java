package defpackage;

import java.lang.reflect.Method;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class tw0 extends vw0 {
    public final /* synthetic */ Method b;

    public tw0(Method method) {
        this.b = method;
    }

    @Override // defpackage.vw0
    public final Object a(Class cls) {
        String a = g00.a(cls);
        if (a == null) {
            return this.b.invoke(null, cls, Object.class);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(a));
    }
}
