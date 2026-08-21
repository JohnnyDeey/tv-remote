package defpackage;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class d1 extends ClickableSpan {
    public final int c;
    public final s1 d;
    public final int e;

    public d1(int i, s1 s1Var, int i2) {
        this.c = i;
        this.d = s1Var;
        this.e = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.c);
        this.d.a.performAction(this.e, bundle);
    }
}
