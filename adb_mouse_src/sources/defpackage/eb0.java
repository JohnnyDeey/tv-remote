package defpackage;

import android.content.DialogInterface;
import java.util.HashSet;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class eb0 implements DialogInterface.OnMultiChoiceClickListener {
    public final /* synthetic */ fb0 a;

    public eb0(fb0 fb0Var) {
        this.a = fb0Var;
    }

    @Override // android.content.DialogInterface.OnMultiChoiceClickListener
    public final void onClick(DialogInterface dialogInterface, int i, boolean z) {
        fb0 fb0Var = this.a;
        HashSet hashSet = fb0Var.s0;
        boolean z2 = fb0Var.t0;
        if (z) {
            fb0Var.t0 = hashSet.add(fb0Var.v0[i].toString()) | z2;
        } else {
            fb0Var.t0 = hashSet.remove(fb0Var.v0[i].toString()) | z2;
        }
    }
}
