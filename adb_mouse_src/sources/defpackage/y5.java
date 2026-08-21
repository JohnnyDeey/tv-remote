package defpackage;

import android.window.OnBackInvokedCallback;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final /* synthetic */ class y5 implements OnBackInvokedCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y5(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void onBackInvoked() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((g6) obj).C();
                return;
            case 1:
                ((ky) obj).a();
                return;
            default:
                ((Runnable) obj).run();
                return;
        }
    }
}
