package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class hq implements DialogInterface.OnCancelListener {
    public final /* synthetic */ kq c;

    public hq(kq kqVar) {
        this.c = kqVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        kq kqVar = this.c;
        Dialog dialog = kqVar.f0;
        if (dialog != null) {
            kqVar.onCancel(dialog);
        }
    }
}
