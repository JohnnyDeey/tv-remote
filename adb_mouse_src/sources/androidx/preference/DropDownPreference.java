package androidx.preference;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import defpackage.xe0;
import defpackage.xr;
import svarzee.android.apps.adb_mouse.R;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public class DropDownPreference extends ListPreference {
    public final ArrayAdapter a0;
    public Spinner b0;
    public final xr c0;

    public DropDownPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.dropdownPreferenceStyle);
        this.c0 = new xr(0, this);
        ArrayAdapter arrayAdapter = new ArrayAdapter(context, android.R.layout.simple_spinner_dropdown_item);
        this.a0 = arrayAdapter;
        arrayAdapter.clear();
        CharSequence[] charSequenceArr = this.V;
        if (charSequenceArr != null) {
            for (CharSequence charSequence : charSequenceArr) {
                arrayAdapter.add(charSequence.toString());
            }
        }
    }

    @Override // androidx.preference.Preference
    public final void h() {
        super.h();
        ArrayAdapter arrayAdapter = this.a0;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }

    @Override // androidx.preference.Preference
    public final void l(xe0 xe0Var) {
        int i;
        Spinner spinner = (Spinner) xe0Var.a.findViewById(R.id.spinner);
        this.b0 = spinner;
        spinner.setAdapter((SpinnerAdapter) this.a0);
        this.b0.setOnItemSelectedListener(this.c0);
        Spinner spinner2 = this.b0;
        String str = this.X;
        CharSequence[] charSequenceArr = this.W;
        if (str != null && charSequenceArr != null) {
            i = charSequenceArr.length - 1;
            while (i >= 0) {
                if (TextUtils.equals(charSequenceArr[i].toString(), str)) {
                    break;
                } else {
                    i--;
                }
            }
        }
        i = -1;
        spinner2.setSelection(i);
        super.l(xe0Var);
    }

    @Override // androidx.preference.DialogPreference, androidx.preference.Preference
    public final void m() {
        this.b0.performClick();
    }

    @Override // androidx.preference.ListPreference
    public final void z(CharSequence[] charSequenceArr) {
        this.V = charSequenceArr;
        ArrayAdapter arrayAdapter = this.a0;
        arrayAdapter.clear();
        CharSequence[] charSequenceArr2 = this.V;
        if (charSequenceArr2 != null) {
            for (CharSequence charSequence : charSequenceArr2) {
                arrayAdapter.add(charSequence.toString());
            }
        }
    }
}
