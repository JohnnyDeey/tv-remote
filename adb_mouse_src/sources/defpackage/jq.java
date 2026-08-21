package defpackage;

import android.app.Dialog;
import android.view.View;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class jq extends wv0 {
    public final /* synthetic */ ex s;
    public final /* synthetic */ kq t;

    public jq(kq kqVar, ex exVar) {
        this.t = kqVar;
        this.s = exVar;
    }

    @Override // defpackage.wv0
    public final View N(int i) {
        ex exVar = this.s;
        if (exVar.O()) {
            return exVar.N(i);
        }
        Dialog dialog = this.t.f0;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    @Override // defpackage.wv0
    public final boolean O() {
        if (!this.s.O() && !this.t.j0) {
            return false;
        }
        return true;
    }
}
