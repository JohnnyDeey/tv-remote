package defpackage;

import com.google.android.material.internal.CheckableImageButton;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class xl extends hu {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xl(gu guVar, int i) {
        super(guVar);
        this.e = i;
    }

    @Override // defpackage.hu
    public void q() {
        switch (this.e) {
            case 0:
                gu guVar = this.b;
                guVar.q = null;
                CheckableImageButton checkableImageButton = guVar.i;
                checkableImageButton.setOnLongClickListener(null);
                r21.I(checkableImageButton, null);
                return;
            default:
                return;
        }
    }
}
