package defpackage;

import android.os.SystemClock;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class yc implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ ad d;

    public /* synthetic */ yc(ad adVar, int i) {
        this.c = i;
        this.d = adVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        ad adVar = this.d;
        switch (i) {
            case 0:
                if (adVar.f > 0) {
                    SystemClock.uptimeMillis();
                }
                adVar.setVisibility(0);
                return;
            default:
                ((nr) adVar.getCurrentDrawable()).d(false, false, true);
                if (adVar.getProgressDrawable() == null || !adVar.getProgressDrawable().isVisible()) {
                    if (adVar.getIndeterminateDrawable() == null || !adVar.getIndeterminateDrawable().isVisible()) {
                        adVar.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
