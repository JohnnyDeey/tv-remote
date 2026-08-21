package defpackage;

import android.text.Editable;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class ct extends Editable.Factory {
    public static final Object a = new Object();
    public static volatile ct b;
    public static Class c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = c;
        if (cls != null) {
            return new uo0(cls, charSequence);
        }
        return super.newEditable(charSequence);
    }
}
