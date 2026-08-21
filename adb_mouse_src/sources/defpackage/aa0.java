package defpackage;

import android.view.ActionProvider;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class aa0 implements ActionProvider.VisibilityListener {
    public i81 a;
    public final ActionProvider b;

    public aa0(da0 da0Var, ActionProvider actionProvider) {
        this.b = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z) {
        i81 i81Var = this.a;
        if (i81Var != null) {
            w90 w90Var = ((z90) i81Var.d).n;
            w90Var.h = true;
            w90Var.p(true);
        }
    }
}
