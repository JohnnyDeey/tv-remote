package defpackage;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public class ju implements qu0 {
    @Override // defpackage.qu0
    public final pu0 a(k00 k00Var, xv0 xv0Var) {
        Class cls = xv0Var.a;
        if (Enum.class.isAssignableFrom(cls) && cls != Enum.class) {
            if (!cls.isEnum()) {
                cls = cls.getSuperclass();
            }
            return new ku(cls);
        }
        return null;
    }
}
