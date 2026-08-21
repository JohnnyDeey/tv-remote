package defpackage;

import android.content.Context;
import android.view.View;
import svarzee.android.apps.adb_mouse.R;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class o2 extends ga0 {
    public final /* synthetic */ int l = 0;
    public final /* synthetic */ r2 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(r2 r2Var, Context context, gq0 gq0Var, View view) {
        super(context, gq0Var, view, false, R.attr.actionOverflowMenuStyle, 0);
        this.m = r2Var;
        if ((gq0Var.A.x & 32) != 32) {
            View view2 = r2Var.k;
            this.e = view2 == null ? (View) r2Var.j : view2;
        }
        i81 i81Var = r2Var.y;
        this.h = i81Var;
        ea0 ea0Var = this.i;
        if (ea0Var != null) {
            ea0Var.e(i81Var);
        }
    }

    @Override // defpackage.ga0
    public final void c() {
        int i = this.l;
        r2 r2Var = this.m;
        switch (i) {
            case 0:
                r2Var.v = null;
                super.c();
                return;
            default:
                w90 w90Var = r2Var.e;
                if (w90Var != null) {
                    w90Var.c(true);
                }
                r2Var.u = null;
                super.c();
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(r2 r2Var, Context context, w90 w90Var, View view) {
        super(context, w90Var, view, true, R.attr.actionOverflowMenuStyle, 0);
        this.m = r2Var;
        this.f = 8388613;
        i81 i81Var = r2Var.y;
        this.h = i81Var;
        ea0 ea0Var = this.i;
        if (ea0Var != null) {
            ea0Var.e(i81Var);
        }
    }
}
