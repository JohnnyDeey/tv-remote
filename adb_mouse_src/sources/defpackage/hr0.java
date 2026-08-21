package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class hr0 extends mi0 {
    public final /* synthetic */ Context d;
    public final /* synthetic */ TextPaint e;
    public final /* synthetic */ mi0 f;
    public final /* synthetic */ ir0 g;

    public hr0(ir0 ir0Var, Context context, TextPaint textPaint, mi0 mi0Var) {
        this.g = ir0Var;
        this.d = context;
        this.e = textPaint;
        this.f = mi0Var;
    }

    @Override // defpackage.mi0
    public final void I(int i) {
        this.f.I(i);
    }

    @Override // defpackage.mi0
    public final void J(Typeface typeface, boolean z) {
        this.g.f(this.d, this.e, typeface);
        this.f.J(typeface, z);
    }
}
