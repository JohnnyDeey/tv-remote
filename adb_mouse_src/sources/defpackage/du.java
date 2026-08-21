package defpackage;

import android.text.Editable;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class du extends rr0 {
    public final /* synthetic */ gu c;

    public du(gu guVar) {
        this.c = guVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.c.b().a();
    }

    @Override // defpackage.rr0, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.c.b().b();
    }
}
