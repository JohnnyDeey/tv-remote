package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class rd0 extends d60 {
    public final /* synthetic */ sd0 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rd0(sd0 sd0Var, Context context) {
        super(context);
        this.q = sd0Var;
    }

    @Override // defpackage.d60
    public final float d(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // defpackage.d60
    public final int e(int i) {
        return Math.min(100, super.e(i));
    }

    @Override // defpackage.d60
    public final void h(View view, yh0 yh0Var) {
        sd0 sd0Var = this.q;
        int[] a = sd0Var.a(sd0Var.a.getLayoutManager(), view);
        int i = a[0];
        int i2 = a[1];
        int ceil = (int) Math.ceil(e(Math.max(Math.abs(i), Math.abs(i2))) / 0.3356d);
        if (ceil > 0) {
            yh0Var.a = i;
            yh0Var.b = i2;
            yh0Var.c = ceil;
            yh0Var.e = this.j;
            yh0Var.f = true;
        }
    }
}
