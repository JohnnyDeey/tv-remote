package defpackage;

import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import svarzee.android.apps.adb_mouse.DpadView;
import svarzee.android.apps.adb_mouse.MainActivity;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final /* synthetic */ class ph implements View.OnClickListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ph(int i, Object obj) {
        this.c = i;
        this.d = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.c;
        int i2 = 0;
        Object obj = this.d;
        switch (i) {
            case 0:
                th thVar = (th) obj;
                EditText editText = thVar.i;
                if (editText != null) {
                    Editable text = editText.getText();
                    if (text != null) {
                        text.clear();
                    }
                    thVar.p();
                    return;
                }
                return;
            case 1:
                ((bs) obj).t();
                return;
            case 2:
                DpadView dpadView = (DpadView) obj;
                int i3 = MainActivity.E;
                view.performHapticFeedback(1);
                if (dpadView.getVisibility() == 0) {
                    i2 = 4;
                }
                dpadView.setVisibility(i2);
                return;
            case 3:
                ((h90) obj).N();
                throw null;
            default:
                ud0 ud0Var = (ud0) obj;
                EditText editText2 = ud0Var.f;
                if (editText2 != null) {
                    int selectionEnd = editText2.getSelectionEnd();
                    EditText editText3 = ud0Var.f;
                    if (editText3 != null && (editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                        i2 = 1;
                    }
                    EditText editText4 = ud0Var.f;
                    if (i2 != 0) {
                        editText4.setTransformationMethod(null);
                    } else {
                        editText4.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    }
                    if (selectionEnd >= 0) {
                        ud0Var.f.setSelection(selectionEnd);
                    }
                    ud0Var.p();
                    return;
                }
                return;
        }
    }
}
