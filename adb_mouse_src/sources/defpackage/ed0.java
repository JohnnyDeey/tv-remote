package defpackage;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class ed0 implements OnBackAnimationCallback {
    public final /* synthetic */ vy a;
    public final /* synthetic */ vy b;
    public final /* synthetic */ ky c;
    public final /* synthetic */ ky d;

    public ed0(vy vyVar, vy vyVar2, ky kyVar, ky kyVar2) {
        this.a = vyVar;
        this.b = vyVar2;
        this.c = kyVar;
        this.d = kyVar2;
    }

    public final void onBackCancelled() {
        this.d.a();
    }

    public final void onBackInvoked() {
        this.c.a();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        backEvent.getClass();
        this.b.h(new gc(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        backEvent.getClass();
        this.a.h(new gc(backEvent));
    }
}
