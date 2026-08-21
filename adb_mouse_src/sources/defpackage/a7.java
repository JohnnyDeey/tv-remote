package defpackage;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class a7 implements g7, DialogInterface.OnClickListener {
    public j4 c;
    public b7 d;
    public CharSequence e;
    public final /* synthetic */ h7 f;

    public a7(h7 h7Var) {
        this.f = h7Var;
    }

    @Override // defpackage.g7
    public final boolean b() {
        j4 j4Var = this.c;
        if (j4Var != null) {
            return j4Var.isShowing();
        }
        return false;
    }

    @Override // defpackage.g7
    public final int c() {
        return 0;
    }

    @Override // defpackage.g7
    public final void dismiss() {
        j4 j4Var = this.c;
        if (j4Var != null) {
            j4Var.dismiss();
            this.c = null;
        }
    }

    @Override // defpackage.g7
    public final Drawable e() {
        return null;
    }

    @Override // defpackage.g7
    public final void g(CharSequence charSequence) {
        this.e = charSequence;
    }

    @Override // defpackage.g7
    public final void i(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.g7
    public final void k(int i) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.g7
    public final void l(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.g7
    public final void m(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.g7
    public final void n(int i, int i2) {
        if (this.d == null) {
            return;
        }
        h7 h7Var = this.f;
        f61 f61Var = new f61(h7Var.getPopupContext());
        f4 f4Var = (f4) f61Var.d;
        CharSequence charSequence = this.e;
        if (charSequence != null) {
            f4Var.d = charSequence;
        }
        b7 b7Var = this.d;
        int selectedItemPosition = h7Var.getSelectedItemPosition();
        f4Var.n = b7Var;
        f4Var.o = this;
        f4Var.t = selectedItemPosition;
        f4Var.s = true;
        j4 b = f61Var.b();
        this.c = b;
        AlertController$RecycleListView alertController$RecycleListView = b.h.f;
        alertController$RecycleListView.setTextDirection(i);
        alertController$RecycleListView.setTextAlignment(i2);
        this.c.show();
    }

    @Override // defpackage.g7
    public final int o() {
        return 0;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        h7 h7Var = this.f;
        h7Var.setSelection(i);
        if (h7Var.getOnItemClickListener() != null) {
            h7Var.performItemClick(null, i, this.d.getItemId(i));
        }
        dismiss();
    }

    @Override // defpackage.g7
    public final CharSequence p() {
        return this.e;
    }

    @Override // defpackage.g7
    public final void q(ListAdapter listAdapter) {
        this.d = (b7) listAdapter;
    }
}
