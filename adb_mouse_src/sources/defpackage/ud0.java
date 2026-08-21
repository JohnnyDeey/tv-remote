package defpackage;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import svarzee.android.apps.adb_mouse.R;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class ud0 extends hu {
    public final int e;
    public EditText f;
    public final ph g;

    public ud0(gu guVar, int i) {
        super(guVar);
        this.e = R.drawable.design_password_eye;
        this.g = new ph(4, this);
        if (i != 0) {
            this.e = i;
        }
    }

    @Override // defpackage.hu
    public final void b() {
        p();
    }

    @Override // defpackage.hu
    public final int c() {
        return R.string.password_toggle_content_description;
    }

    @Override // defpackage.hu
    public final int d() {
        return this.e;
    }

    @Override // defpackage.hu
    public final View.OnClickListener f() {
        return this.g;
    }

    @Override // defpackage.hu
    public final boolean j() {
        return true;
    }

    @Override // defpackage.hu
    public final boolean k() {
        boolean z;
        EditText editText = this.f;
        if (editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod)) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }

    @Override // defpackage.hu
    public final void l(EditText editText) {
        this.f = editText;
        p();
    }

    @Override // defpackage.hu
    public final void q() {
        EditText editText = this.f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // defpackage.hu
    public final void r() {
        EditText editText = this.f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
