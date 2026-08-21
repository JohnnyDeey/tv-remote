package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class ff0 extends rt {
    final /* synthetic */ gf0 this$0;

    /* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
    /* loaded from: classes.dex */
    public static final class a extends rt {
        final /* synthetic */ gf0 this$0;

        public a(gf0 gf0Var) {
            this.this$0 = gf0Var;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            activity.getClass();
            this.this$0.b();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            activity.getClass();
            gf0 gf0Var = this.this$0;
            int i = gf0Var.c + 1;
            gf0Var.c = i;
            if (i == 1 && gf0Var.f) {
                gf0Var.h.d(l50.ON_START);
                gf0Var.f = false;
            }
        }
    }

    public ff0(gf0 gf0Var) {
        this.this$0 = gf0Var;
    }

    @Override // defpackage.rt, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        if (Build.VERSION.SDK_INT < 29) {
            int i = cj0.d;
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            findFragmentByTag.getClass();
            ((cj0) findFragmentByTag).c = this.this$0.j;
        }
    }

    @Override // defpackage.rt, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        activity.getClass();
        gf0 gf0Var = this.this$0;
        int i = gf0Var.d - 1;
        gf0Var.d = i;
        if (i == 0) {
            Handler handler = gf0Var.g;
            handler.getClass();
            handler.postDelayed(gf0Var.i, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        ef0.a(activity, new a(this.this$0));
    }

    @Override // defpackage.rt, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        activity.getClass();
        gf0 gf0Var = this.this$0;
        int i = gf0Var.c - 1;
        gf0Var.c = i;
        if (i == 0 && gf0Var.e) {
            gf0Var.h.d(l50.ON_STOP);
            gf0Var.f = true;
        }
    }
}
