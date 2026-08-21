package defpackage;

import android.view.ViewGroup;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class t5 implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ g6 d;

    public /* synthetic */ t5(g6 g6Var, int i) {
        this.c = i;
        this.d = g6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        int i = this.c;
        g6 g6Var = this.d;
        switch (i) {
            case 0:
                if ((g6Var.a0 & 1) != 0) {
                    g6Var.u(0);
                }
                if ((g6Var.a0 & 4096) != 0) {
                    g6Var.u(108);
                }
                g6Var.Z = false;
                g6Var.a0 = 0;
                return;
            default:
                g6Var.x.showAtLocation(g6Var.w, 55, 0, 0);
                dz0 dz0Var = g6Var.z;
                if (dz0Var != null) {
                    dz0Var.b();
                }
                if (g6Var.A && (viewGroup = g6Var.B) != null && viewGroup.isLaidOut()) {
                    g6Var.w.setAlpha(0.0f);
                    dz0 a = ry0.a(g6Var.w);
                    a.a(1.0f);
                    g6Var.z = a;
                    a.d(new v5(0, this));
                    return;
                }
                g6Var.w.setAlpha(1.0f);
                g6Var.w.setVisibility(0);
                return;
        }
    }
}
