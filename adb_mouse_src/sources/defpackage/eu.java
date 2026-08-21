package defpackage;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class eu {
    public final /* synthetic */ gu a;

    public eu(gu guVar) {
        this.a = guVar;
    }

    public final void a(TextInputLayout textInputLayout) {
        gu guVar = this.a;
        du duVar = guVar.x;
        if (guVar.u == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = guVar.u;
        if (editText != null) {
            editText.removeTextChangedListener(duVar);
            if (guVar.u.getOnFocusChangeListener() == guVar.b().e()) {
                guVar.u.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        guVar.u = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(duVar);
        }
        guVar.b().l(guVar.u);
        guVar.j(guVar.b());
    }
}
