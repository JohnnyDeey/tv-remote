package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class fj0 implements Executor {
    public final /* synthetic */ int c;
    public final Object d;

    public fj0() {
        this.c = 2;
        Handler handler = new Handler(Looper.getMainLooper());
        Looper.getMainLooper();
        this.d = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.c;
        Object obj = this.d;
        switch (i) {
            case 0:
                Handler handler = (Handler) obj;
                runnable.getClass();
                if (handler.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler + " is shutting down");
            case 1:
                ((Executor) obj).execute(new l9(11, runnable));
                return;
            default:
                ((y31) obj).post(runnable);
                return;
        }
    }

    public /* synthetic */ fj0(int i, Object obj) {
        this.c = i;
        this.d = obj;
    }
}
