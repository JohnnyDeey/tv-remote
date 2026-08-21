package defpackage;

import android.R;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.preference.EditTextPreference;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public class qs extends oe0 {
    public EditText s0;
    public CharSequence t0;
    public final l9 u0 = new l9(6, this);
    public long v0 = -1;

    @Override // defpackage.oe0
    public final void O(View view) {
        super.O(view);
        EditText editText = (EditText) view.findViewById(R.id.edit);
        this.s0 = editText;
        if (editText != null) {
            editText.requestFocus();
            this.s0.setText(this.t0);
            EditText editText2 = this.s0;
            editText2.setSelection(editText2.getText().length());
            ((EditTextPreference) N()).getClass();
            return;
        }
        c.o("Dialog view must contain an EditText with id @android:id/edit");
    }

    @Override // defpackage.oe0
    public final void P(boolean z) {
        if (z) {
            String obj = this.s0.getText().toString();
            EditTextPreference editTextPreference = (EditTextPreference) N();
            if (editTextPreference.a(obj)) {
                editTextPreference.y(obj);
            }
        }
    }

    public final void R() {
        long j = this.v0;
        if (j != -1 && j + 1000 > SystemClock.currentThreadTimeMillis()) {
            EditText editText = this.s0;
            if (editText != null && editText.isFocused()) {
                if (((InputMethodManager) this.s0.getContext().getSystemService("input_method")).showSoftInput(this.s0, 0)) {
                    this.v0 = -1L;
                    return;
                }
                EditText editText2 = this.s0;
                l9 l9Var = this.u0;
                editText2.removeCallbacks(l9Var);
                this.s0.postDelayed(l9Var, 50L);
                return;
            }
            this.v0 = -1L;
        }
    }

    @Override // defpackage.oe0, defpackage.kq, defpackage.gx
    public final void u(Bundle bundle) {
        super.u(bundle);
        if (bundle == null) {
            this.t0 = ((EditTextPreference) N()).V;
        } else {
            this.t0 = bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
        }
    }

    @Override // defpackage.oe0, defpackage.kq, defpackage.gx
    public final void z(Bundle bundle) {
        super.z(bundle);
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.t0);
    }
}
