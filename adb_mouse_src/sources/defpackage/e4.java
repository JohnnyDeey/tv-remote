package defpackage;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.AlertController$RecycleListView;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class e4 implements AdapterView.OnItemClickListener {
    public final /* synthetic */ AlertController$RecycleListView c;
    public final /* synthetic */ i4 d;
    public final /* synthetic */ f4 e;

    public e4(f4 f4Var, AlertController$RecycleListView alertController$RecycleListView, i4 i4Var) {
        this.e = f4Var;
        this.c = alertController$RecycleListView;
        this.d = i4Var;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        f4 f4Var = this.e;
        boolean[] zArr = f4Var.q;
        AlertController$RecycleListView alertController$RecycleListView = this.c;
        if (zArr != null) {
            zArr[i] = alertController$RecycleListView.isItemChecked(i);
        }
        f4Var.u.onClick(this.d.b, i, alertController$RecycleListView.isItemChecked(i));
    }
}
