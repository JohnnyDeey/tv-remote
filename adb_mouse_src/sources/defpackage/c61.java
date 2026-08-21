package defpackage;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class c61 extends wg0 {
    public static final Unsafe d;
    public static final long e;
    public static final long f;
    public static final long g;
    public static final long h;
    public static final long i;

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.security.PrivilegedExceptionAction] */
    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (PrivilegedActionException e2) {
                f40.k("Could not initialize intrinsics", e2.getCause());
                return;
            }
        } catch (SecurityException unused) {
            unsafe = (Unsafe) AccessController.doPrivileged((PrivilegedExceptionAction) new Object());
        }
        try {
            f = unsafe.objectFieldOffset(e61.class.getDeclaredField("e"));
            e = unsafe.objectFieldOffset(e61.class.getDeclaredField("d"));
            g = unsafe.objectFieldOffset(e61.class.getDeclaredField("c"));
            h = unsafe.objectFieldOffset(d61.class.getDeclaredField("a"));
            i = unsafe.objectFieldOffset(d61.class.getDeclaredField("b"));
            d = unsafe;
        } catch (NoSuchFieldException e3) {
            throw new RuntimeException(e3);
        }
    }

    @Override // defpackage.wg0
    public final z51 C(x61 x61Var) {
        z51 z51Var;
        z51 z51Var2 = z51.d;
        do {
            z51Var = x61Var.d;
            if (z51Var2 == z51Var) {
                break;
            }
        } while (!J(x61Var, z51Var, z51Var2));
        return z51Var;
    }

    @Override // defpackage.wg0
    public final d61 E(x61 x61Var) {
        d61 d61Var;
        d61 d61Var2 = d61.c;
        do {
            d61Var = x61Var.e;
            if (d61Var2 == d61Var) {
                break;
            }
        } while (!M(x61Var, d61Var, d61Var2));
        return d61Var;
    }

    @Override // defpackage.wg0
    public final void G(d61 d61Var, d61 d61Var2) {
        d.putObject(d61Var, i, d61Var2);
    }

    @Override // defpackage.wg0
    public final void I(d61 d61Var, Thread thread) {
        d.putObject(d61Var, h, thread);
    }

    @Override // defpackage.wg0
    public final boolean J(x61 x61Var, z51 z51Var, z51 z51Var2) {
        return h61.a(d, x61Var, e, z51Var, z51Var2);
    }

    @Override // defpackage.wg0
    public final boolean L(e61 e61Var, Object obj, Object obj2) {
        return h61.a(d, e61Var, g, obj, obj2);
    }

    @Override // defpackage.wg0
    public final boolean M(e61 e61Var, d61 d61Var, d61 d61Var2) {
        return h61.a(d, e61Var, f, d61Var, d61Var2);
    }
}
