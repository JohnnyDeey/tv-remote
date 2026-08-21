package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public class lu extends DialogFragment {
    public Dialog c;
    public DialogInterface.OnCancelListener d;
    public AlertDialog e;

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.d;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.c;
        if (dialog == null) {
            setShowsDialog(false);
            if (this.e == null) {
                Activity activity = getActivity();
                wv0.p(activity);
                this.e = new AlertDialog.Builder(activity).create();
            }
            return this.e;
        }
        return dialog;
    }
}
