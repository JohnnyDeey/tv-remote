package defpackage;

import android.view.View;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class ex extends wv0 {
    public final /* synthetic */ gx s;

    public ex(gx gxVar) {
        this.s = gxVar;
    }

    @Override // defpackage.wv0
    public final View N(int i) {
        gx gxVar = this.s;
        View view = gxVar.G;
        if (view != null) {
            return view.findViewById(i);
        }
        c.o(qo0.p("Fragment ", gxVar, " does not have a view"));
        return null;
    }

    @Override // defpackage.wv0
    public final boolean O() {
        if (this.s.G != null) {
            return true;
        }
        return false;
    }
}
