package defpackage;

import android.widget.PopupWindow;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class fa0 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ ga0 c;

    public fa0(ga0 ga0Var) {
        this.c = ga0Var;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.c.c();
    }
}
