package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public abstract class e61 implements u61 {
    public static final Object f = new Object();
    public static final t61 g = new t61(x61.class);
    public static final boolean h;
    public static final wg0 i;
    public volatile Object c;
    public volatile z51 d;
    public volatile d61 e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [wg0] */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    static {
        boolean z;
        Object obj;
        Throwable th;
        Throwable th2;
        ?? r0;
        Object obj2;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        h = z;
        String property = System.getProperty("java.runtime.name", "");
        Throwable th3 = null;
        if (property != null && !property.contains("Android")) {
            try {
                obj2 = new Object();
            } catch (NoClassDefFoundError unused2) {
                obj2 = new Object();
            }
        } else {
            try {
                obj2 = new Object();
            } catch (Error | Exception e) {
                try {
                    obj = new Object();
                } catch (Error | Exception e2) {
                    th3 = e2;
                    obj = new Object();
                }
                th = th3;
                th2 = e;
                r0 = obj;
            }
        }
        th = null;
        th2 = null;
        r0 = obj2;
        i = r0;
        if (th != null) {
            t61 t61Var = g;
            Logger a = t61Var.a();
            Level level = Level.SEVERE;
            a.logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            t61Var.a().logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "AtomicReferenceFieldUpdaterAtomicHelper is broken!", th);
        }
    }

    public final void b(d61 d61Var) {
        d61Var.a = null;
        while (true) {
            d61 d61Var2 = this.e;
            if (d61Var2 != d61.c) {
                d61 d61Var3 = null;
                while (d61Var2 != null) {
                    d61 d61Var4 = d61Var2.b;
                    if (d61Var2.a != null) {
                        d61Var3 = d61Var2;
                    } else if (d61Var3 != null) {
                        d61Var3.b = d61Var4;
                        if (d61Var3.a == null) {
                            break;
                        }
                    } else if (!i.M(this, d61Var2, d61Var4)) {
                        break;
                    }
                    d61Var2 = d61Var4;
                }
                return;
            }
            return;
        }
    }

    public abstract Throwable c();
}
