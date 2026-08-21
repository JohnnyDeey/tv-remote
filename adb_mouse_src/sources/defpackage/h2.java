package defpackage;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class h2 implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ ActionBarOverlayLayout d;

    public /* synthetic */ h2(ActionBarOverlayLayout actionBarOverlayLayout, int i) {
        this.c = i;
        this.d = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        ActionBarOverlayLayout actionBarOverlayLayout = this.d;
        switch (i) {
            case 0:
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.y = actionBarOverlayLayout.f.animate().translationY(0.0f).setListener(actionBarOverlayLayout.z);
                return;
            default:
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.y = actionBarOverlayLayout.f.animate().translationY(-actionBarOverlayLayout.f.getHeight()).setListener(actionBarOverlayLayout.z);
                return;
        }
    }
}
