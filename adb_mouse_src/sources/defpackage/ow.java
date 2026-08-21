package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class ow implements ys {
    public final Context a;
    public final nw b;
    public final g00 c;
    public final Object d = new Object();
    public Handler e;
    public ThreadPoolExecutor f;
    public ThreadPoolExecutor g;
    public mn h;

    public ow(Context context, nw nwVar) {
        mn.k(context, "Context cannot be null");
        this.a = context.getApplicationContext();
        this.b = nwVar;
        this.c = pw.d;
    }

    @Override // defpackage.ys
    public final void a(mn mnVar) {
        synchronized (this.d) {
            this.h = mnVar;
        }
        synchronized (this.d) {
            try {
                if (this.h == null) {
                    return;
                }
                if (this.f == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new fj("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.g = threadPoolExecutor;
                    this.f = threadPoolExecutor;
                }
                this.f.execute(new x2(8, this));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        synchronized (this.d) {
            try {
                this.h = null;
                Handler handler = this.e;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.e = null;
                ThreadPoolExecutor threadPoolExecutor = this.g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f = null;
                this.g = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final yw c() {
        try {
            g00 g00Var = this.c;
            Context context = this.a;
            nw nwVar = this.b;
            g00Var.getClass();
            ArrayList arrayList = new ArrayList(1);
            Object obj = new Object[]{nwVar}[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            f61 a = mw.a(context, Collections.unmodifiableList(arrayList));
            int i = a.c;
            if (i == 0) {
                yw[] ywVarArr = (yw[]) ((List) a.d).get(0);
                if (ywVarArr != null && ywVarArr.length != 0) {
                    return ywVarArr[0];
                }
                f40.f("fetchFonts failed (empty result)");
                return null;
            }
            f40.f(qo0.n("fetchFonts failed (", i, ")"));
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            f40.k("provider not found", e);
            return null;
        }
    }
}
