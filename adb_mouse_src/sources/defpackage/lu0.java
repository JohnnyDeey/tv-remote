package defpackage;

import android.content.Context;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class lu0 {
    public static volatile in e;
    public final xh a;
    public final xh b;
    public final io c;
    public final cx0 d;

    public lu0(xh xhVar, xh xhVar2, io ioVar, cx0 cx0Var, l3 l3Var) {
        this.a = xhVar;
        this.b = xhVar2;
        this.c = ioVar;
        this.d = cx0Var;
        ((Executor) l3Var.g).execute(new x2(16, l3Var));
    }

    public static lu0 a() {
        in inVar = e;
        if (inVar != null) {
            return (lu0) inVar.h.get();
        }
        c.o("Not initialized!");
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [hn, java.lang.Object] */
    public static void b(Context context) {
        if (e == null) {
            synchronized (lu0.class) {
                try {
                    if (e == null) {
                        ?? obj = new Object();
                        context.getClass();
                        obj.a = context;
                        e = obj.b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final b8 c(ne neVar) {
        Set singleton;
        if (neVar instanceof ne) {
            singleton = Collections.unmodifiableSet(ne.d);
        } else {
            singleton = Collections.singleton(new bu("proto"));
        }
        b8 a = ca.a();
        neVar.getClass();
        a.d = "cct";
        String str = neVar.a;
        String str2 = neVar.b;
        if (str2 == null) {
            str2 = "";
        }
        a.e = ("1$" + str + "\\" + str2).getBytes(Charset.forName("UTF-8"));
        return new b8(singleton, a.o(), this, 23);
    }
}
