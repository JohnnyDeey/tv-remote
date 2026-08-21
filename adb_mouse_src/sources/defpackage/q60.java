package defpackage;

import android.database.DataSetObserver;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class q60 extends DataSetObserver {
    public final /* synthetic */ t60 a;

    public q60(t60 t60Var) {
        this.a = t60Var;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        t60 t60Var = this.a;
        if (t60Var.B.isShowing()) {
            t60Var.d();
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.a.dismiss();
    }
}
