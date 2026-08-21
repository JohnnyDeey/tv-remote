package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class ux0 extends Drawable.ConstantState {
    public final Drawable.ConstantState a;

    public ux0(Drawable.ConstantState constantState) {
        this.a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        vx0 vx0Var = new vx0();
        vx0Var.c = (VectorDrawable) this.a.newDrawable();
        return vx0Var;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        vx0 vx0Var = new vx0();
        vx0Var.c = (VectorDrawable) this.a.newDrawable(resources);
        return vx0Var;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        vx0 vx0Var = new vx0();
        vx0Var.c = (VectorDrawable) this.a.newDrawable(resources, theme);
        return vx0Var;
    }
}
