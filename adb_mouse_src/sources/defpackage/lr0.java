package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class lr0 implements TextWatcher {
    public int c;
    public final /* synthetic */ EditText d;
    public final /* synthetic */ TextInputLayout e;

    public lr0(TextInputLayout textInputLayout, EditText editText) {
        this.e = textInputLayout;
        this.d = editText;
        this.c = editText.getLineCount();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        TextInputLayout textInputLayout = this.e;
        textInputLayout.w(!textInputLayout.D0, false);
        if (textInputLayout.n) {
            textInputLayout.p(editable);
        }
        if (textInputLayout.v) {
            textInputLayout.x(editable);
        }
        EditText editText = this.d;
        int lineCount = editText.getLineCount();
        int i = this.c;
        if (lineCount != i) {
            if (lineCount < i) {
                int minimumHeight = editText.getMinimumHeight();
                int i2 = textInputLayout.w0;
                if (minimumHeight != i2) {
                    editText.setMinimumHeight(i2);
                }
            }
            this.c = lineCount;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
