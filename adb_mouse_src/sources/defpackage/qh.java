package defpackage;

import android.view.View;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final /* synthetic */ class qh implements View.OnFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ hu b;

    public /* synthetic */ qh(hu huVar, int i) {
        this.a = i;
        this.b = huVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        int i = this.a;
        hu huVar = this.b;
        switch (i) {
            case 0:
                th thVar = (th) huVar;
                thVar.s(thVar.t());
                return;
            default:
                bs bsVar = (bs) huVar;
                bsVar.l = z;
                bsVar.p();
                if (!z) {
                    bsVar.s(false);
                    bsVar.m = false;
                    return;
                }
                return;
        }
    }
}
