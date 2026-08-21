package defpackage;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class d4 implements AdapterView.OnItemClickListener {
    public final /* synthetic */ i4 c;
    public final /* synthetic */ f4 d;

    public d4(f4 f4Var, i4 i4Var) {
        this.d = f4Var;
        this.c = i4Var;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        f4 f4Var = this.d;
        DialogInterface.OnClickListener onClickListener = f4Var.o;
        i4 i4Var = this.c;
        onClickListener.onClick(i4Var.b, i);
        if (!f4Var.s) {
            i4Var.b.dismiss();
        }
    }
}
