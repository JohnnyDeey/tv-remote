package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class t11 {
    public static final t11 b;
    public hn a;

    /* JADX WARN: Type inference failed for: r0v0, types: [t11, java.lang.Object] */
    static {
        ?? obj = new Object();
        obj.a = null;
        b = obj;
    }

    public static hn a(Context context) {
        hn hnVar;
        t11 t11Var = b;
        synchronized (t11Var) {
            try {
                if (t11Var.a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    t11Var.a = new hn(context, 2);
                }
                hnVar = t11Var.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return hnVar;
    }
}
