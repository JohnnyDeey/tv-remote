package defpackage;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class m2 extends cx {
    public final /* synthetic */ int l = 0;
    public final /* synthetic */ View m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.m = actionMenuItemView;
    }

    @Override // defpackage.cx
    public final bo0 b() {
        o2 o2Var;
        int i = this.l;
        View view = this.m;
        switch (i) {
            case 0:
                n2 n2Var = ((ActionMenuItemView) view).o;
                if (n2Var == null || (o2Var = ((p2) n2Var).a.v) == null) {
                    return null;
                }
                return o2Var.a();
            default:
                o2 o2Var2 = ((q2) view).f.u;
                if (o2Var2 == null) {
                    return null;
                }
                return o2Var2.a();
        }
    }

    @Override // defpackage.cx
    public final boolean c() {
        bo0 b;
        int i = this.l;
        View view = this.m;
        switch (i) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) view;
                v90 v90Var = actionMenuItemView.m;
                if (v90Var != null && v90Var.a(actionMenuItemView.j) && (b = b()) != null && b.b()) {
                    return true;
                }
                return false;
            default:
                ((q2) view).f.l();
                return true;
        }
    }

    @Override // defpackage.cx
    public boolean d() {
        switch (this.l) {
            case 1:
                r2 r2Var = ((q2) this.m).f;
                if (r2Var.w != null) {
                    return false;
                }
                r2Var.d();
                return true;
            default:
                return super.d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(q2 q2Var, q2 q2Var2) {
        super(q2Var2);
        this.m = q2Var;
    }
}
