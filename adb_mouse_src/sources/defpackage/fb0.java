package defpackage;

import android.os.Bundle;
import androidx.preference.MultiSelectListPreference;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public class fb0 extends oe0 {
    public final HashSet s0 = new HashSet();
    public boolean t0;
    public CharSequence[] u0;
    public CharSequence[] v0;

    @Override // defpackage.oe0
    public final void P(boolean z) {
        if (z && this.t0) {
            MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference) N();
            HashSet hashSet = this.s0;
            if (multiSelectListPreference.a(hashSet)) {
                multiSelectListPreference.y(hashSet);
            }
        }
        this.t0 = false;
    }

    @Override // defpackage.oe0
    public final void Q(f61 f61Var) {
        int length = this.v0.length;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            zArr[i] = this.s0.contains(this.v0[i].toString());
        }
        CharSequence[] charSequenceArr = this.u0;
        eb0 eb0Var = new eb0(this);
        f4 f4Var = (f4) f61Var.d;
        f4Var.m = charSequenceArr;
        f4Var.u = eb0Var;
        f4Var.q = zArr;
        f4Var.r = true;
    }

    @Override // defpackage.oe0, defpackage.kq, defpackage.gx
    public final void u(Bundle bundle) {
        super.u(bundle);
        HashSet hashSet = this.s0;
        if (bundle == null) {
            MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference) N();
            CharSequence[] charSequenceArr = multiSelectListPreference.V;
            CharSequence[] charSequenceArr2 = multiSelectListPreference.W;
            if (charSequenceArr != null && charSequenceArr2 != null) {
                hashSet.clear();
                hashSet.addAll(multiSelectListPreference.X);
                this.t0 = false;
                this.u0 = multiSelectListPreference.V;
                this.v0 = charSequenceArr2;
                return;
            }
            c.o("MultiSelectListPreference requires an entries array and an entryValues array.");
            return;
        }
        hashSet.clear();
        hashSet.addAll(bundle.getStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values"));
        this.t0 = bundle.getBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", false);
        this.u0 = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries");
        this.v0 = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues");
    }

    @Override // defpackage.oe0, defpackage.kq, defpackage.gx
    public final void z(Bundle bundle) {
        super.z(bundle);
        bundle.putStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values", new ArrayList<>(this.s0));
        bundle.putBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", this.t0);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries", this.u0);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues", this.v0);
    }
}
