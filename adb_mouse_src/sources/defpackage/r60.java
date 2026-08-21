package defpackage;

import android.widget.AbsListView;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class r60 implements AbsListView.OnScrollListener {
    public final /* synthetic */ t60 a;

    public r60(t60 t60Var) {
        this.a = t60Var;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        t60 t60Var = this.a;
        p60 p60Var = t60Var.t;
        q6 q6Var = t60Var.B;
        if (i == 1 && q6Var.getInputMethodMode() != 2 && q6Var.getContentView() != null) {
            t60Var.x.removeCallbacks(p60Var);
            p60Var.run();
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }
}
