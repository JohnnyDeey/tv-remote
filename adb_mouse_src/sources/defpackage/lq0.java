package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public class lq0 extends kq {
    public Dialog k0;
    public DialogInterface.OnCancelListener l0;
    public AlertDialog m0;

    @Override // defpackage.kq
    public final Dialog M() {
        Dialog dialog = this.k0;
        if (dialog == null) {
            this.b0 = false;
            if (this.m0 == null) {
                Context h = h();
                wv0.p(h);
                this.m0 = new AlertDialog.Builder(h).create();
            }
            return this.m0;
        }
        return dialog;
    }

    @Override // defpackage.kq, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.l0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
