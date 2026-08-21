package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class bx implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ cx d;

    public /* synthetic */ bx(cx cxVar, int i) {
        this.c = i;
        this.d = cxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        cx cxVar = this.d;
        switch (i) {
            case 0:
                ViewParent parent = cxVar.f.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    return;
                }
                return;
            default:
                cxVar.a();
                View view = cxVar.f;
                if (view.isEnabled() && !view.isLongClickable() && cxVar.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    cxVar.i = true;
                    return;
                }
                return;
        }
    }
}
