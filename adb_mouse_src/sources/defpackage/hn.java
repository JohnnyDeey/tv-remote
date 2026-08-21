package defpackage;

import android.content.Context;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class hn implements ys {
    public Context a;

    public hn(Context context, int i) {
        switch (i) {
            case 2:
                this.a = context;
                return;
            default:
                this.a = context.getApplicationContext();
                return;
        }
    }

    @Override // defpackage.ys
    public void a(mn mnVar) {
        fj fjVar = new fj("EmojiCompatInitializer");
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), fjVar);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new fo(this, mnVar, threadPoolExecutor));
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [in, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [rd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [vt0, java.lang.Object] */
    public in b() {
        Context context = this.a;
        if (context != null) {
            ?? obj = new Object();
            obj.c = er.a(r21.c);
            d3 d3Var = new d3(context);
            obj.d = d3Var;
            boolean z = false;
            obj.e = er.a(new r6(d3Var, new i81(16, d3Var), 24, z));
            d3 d3Var2 = obj.d;
            obj.f = new qu(d3Var2, 1);
            yf0 a = er.a(new r6(obj.f, er.a(new qu(d3Var2, 0)), 29, z));
            obj.g = a;
            g00 g00Var = new g00(15);
            d3 d3Var3 = obj.d;
            b8 b8Var = new b8(d3Var3, a, g00Var, 21);
            yf0 yf0Var = obj.c;
            yf0 yf0Var2 = obj.e;
            ?? obj2 = new Object();
            obj2.c = yf0Var;
            obj2.d = yf0Var2;
            obj2.e = b8Var;
            obj2.f = a;
            obj2.g = a;
            ?? obj3 = new Object();
            obj3.c = d3Var3;
            obj3.d = yf0Var2;
            obj3.e = a;
            obj3.f = b8Var;
            obj3.g = yf0Var;
            obj3.h = a;
            obj3.i = a;
            obj.h = er.a(new b8((Object) obj2, (Object) obj3, new l3(yf0Var, a, b8Var, a, 13), 25));
            return obj;
        }
        throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
    }
}
