package defpackage;

import android.view.View;
import android.widget.AdapterView;
import androidx.preference.DropDownPreference;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class xr implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ xr(int i, Object obj) {
        this.c = i;
        this.d = obj;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        wr wrVar;
        int i2 = this.c;
        Object obj = this.d;
        switch (i2) {
            case 0:
                DropDownPreference dropDownPreference = (DropDownPreference) obj;
                if (i >= 0) {
                    String charSequence = dropDownPreference.W[i].toString();
                    if (!charSequence.equals(dropDownPreference.X) && dropDownPreference.a(charSequence)) {
                        dropDownPreference.A(charSequence);
                        return;
                    }
                    return;
                }
                return;
            default:
                if (i != -1 && (wrVar = ((t60) obj).e) != null) {
                    wrVar.setListSelectionHidden(false);
                    return;
                }
                return;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        int i = this.c;
    }

    private final void a(AdapterView adapterView) {
    }

    private final void b(AdapterView adapterView) {
    }
}
