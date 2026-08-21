package defpackage;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public class q8 implements qu0 {
    @Override // defpackage.qu0
    public final pu0 a(k00 k00Var, xv0 xv0Var) {
        Type componentType;
        Type type = xv0Var.b;
        boolean z = type instanceof GenericArrayType;
        if (!z && (!(type instanceof Class) || !((Class) type).isArray())) {
            return null;
        }
        if (z) {
            componentType = ((GenericArrayType) type).getGenericComponentType();
        } else {
            componentType = ((Class) type).getComponentType();
        }
        return new r8(k00Var, k00Var.b(new xv0(componentType)), f20.E(componentType));
    }
}
