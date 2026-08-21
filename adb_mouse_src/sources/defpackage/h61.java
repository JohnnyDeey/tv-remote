package defpackage;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public abstract /* synthetic */ class h61 {
    public static /* synthetic */ boolean a(Unsafe unsafe, e61 e61Var, long j, Object obj, Object obj2) {
        while (!g61.a(unsafe, e61Var, j, obj, obj2)) {
            if (unsafe.getObject(e61Var, j) != obj) {
                return false;
            }
        }
        return true;
    }
}
