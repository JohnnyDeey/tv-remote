package defpackage;

import android.view.View;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class g90 implements ad0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ View d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;

    public g90(View view, int i, int i2, int i3, int i4) {
        this.c = i;
        this.d = view;
        this.e = i2;
        this.f = i3;
        this.g = i4;
    }

    @Override // defpackage.ad0
    public final m11 g(View view, m11 m11Var) {
        d20 h = m11Var.a.h(519);
        View view2 = this.d;
        int i = this.c;
        if (i >= 0) {
            view2.getLayoutParams().height = i + h.b;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(this.e + h.a, this.f + h.b, this.g + h.c, view2.getPaddingBottom());
        return m11Var;
    }
}
