package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.activity.a;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class cj implements ViewTreeObserver.OnDrawListener, Runnable, Executor {
    public Runnable d;
    public final /* synthetic */ a f;
    public final long c = SystemClock.uptimeMillis() + 10000;
    public boolean e = false;

    public cj(a aVar) {
        this.f = aVar;
    }

    public final void a(View view) {
        if (!this.e) {
            this.e = true;
            view.getViewTreeObserver().addOnDrawListener(this);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.d = runnable;
        View decorView = this.f.getWindow().getDecorView();
        if (this.e) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                decorView.invalidate();
                return;
            } else {
                decorView.postInvalidate();
                return;
            }
        }
        decorView.postOnAnimation(new x2(5, this));
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z;
        Runnable runnable = this.d;
        if (runnable != null) {
            runnable.run();
            this.d = null;
            jy jyVar = this.f.k;
            synchronized (jyVar.b) {
                z = jyVar.a;
            }
            if (z) {
                this.e = false;
                this.f.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        if (SystemClock.uptimeMillis() > this.c) {
            this.e = false;
            this.f.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
