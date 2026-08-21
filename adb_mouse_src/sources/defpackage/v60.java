package defpackage;

import android.content.DialogInterface;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class v60 implements DialogInterface.OnClickListener {
    public final /* synthetic */ w60 c;

    public v60(w60 w60Var) {
        this.c = w60Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        w60 w60Var = this.c;
        w60Var.s0 = i;
        w60Var.r0 = -1;
        dialogInterface.dismiss();
    }
}
