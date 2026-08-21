package defpackage;

import androidx.appcompat.widget.Toolbar;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final /* synthetic */ class jt0 implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ Toolbar d;

    public /* synthetic */ jt0(Toolbar toolbar, int i) {
        this.c = i;
        this.d = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        z90 z90Var;
        int i = this.c;
        Toolbar toolbar = this.d;
        switch (i) {
            case 0:
                mt0 mt0Var = toolbar.N;
                if (mt0Var == null) {
                    z90Var = null;
                } else {
                    z90Var = mt0Var.d;
                }
                if (z90Var != null) {
                    z90Var.collapseActionView();
                    return;
                }
                return;
            default:
                toolbar.m();
                return;
        }
    }
}
