package defpackage;

import android.os.Bundle;
import androidx.preference.ListPreference;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public class w60 extends oe0 {
    public int s0;
    public CharSequence[] t0;
    public CharSequence[] u0;

    @Override // defpackage.oe0
    public final void P(boolean z) {
        int i;
        if (z && (i = this.s0) >= 0) {
            String charSequence = this.u0[i].toString();
            ListPreference listPreference = (ListPreference) N();
            if (listPreference.a(charSequence)) {
                listPreference.A(charSequence);
            }
        }
    }

    @Override // defpackage.oe0
    public final void Q(f61 f61Var) {
        CharSequence[] charSequenceArr = this.t0;
        int i = this.s0;
        v60 v60Var = new v60(this);
        f4 f4Var = (f4) f61Var.d;
        f4Var.m = charSequenceArr;
        f4Var.o = v60Var;
        f4Var.t = i;
        f4Var.s = true;
        f4Var.g = null;
        f4Var.h = null;
    }

    @Override // defpackage.oe0, defpackage.kq, defpackage.gx
    public final void u(Bundle bundle) {
        super.u(bundle);
        if (bundle == null) {
            ListPreference listPreference = (ListPreference) N();
            if (listPreference.V != null && listPreference.W != null) {
                this.s0 = listPreference.y(listPreference.X);
                this.t0 = listPreference.V;
                this.u0 = listPreference.W;
                return;
            }
            c.o("ListPreference requires an entries array and an entryValues array.");
            return;
        }
        this.s0 = bundle.getInt("ListPreferenceDialogFragment.index", 0);
        this.t0 = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entries");
        this.u0 = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entryValues");
    }

    @Override // defpackage.oe0, defpackage.kq, defpackage.gx
    public final void z(Bundle bundle) {
        super.z(bundle);
        bundle.putInt("ListPreferenceDialogFragment.index", this.s0);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entries", this.t0);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entryValues", this.u0);
    }
}
