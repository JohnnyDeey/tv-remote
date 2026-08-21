package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class s4 extends Drawable.ConstantState {
    public final Drawable.ConstantState a;

    public s4(Drawable.ConstantState constantState) {
        this.a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        t4 t4Var = new t4(null);
        Drawable newDrawable = this.a.newDrawable();
        t4Var.c = newDrawable;
        newDrawable.setCallback(t4Var.h);
        return t4Var;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        t4 t4Var = new t4(null);
        Drawable newDrawable = this.a.newDrawable(resources);
        t4Var.c = newDrawable;
        newDrawable.setCallback(t4Var.h);
        return t4Var;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        t4 t4Var = new t4(null);
        Drawable newDrawable = this.a.newDrawable(resources, theme);
        t4Var.c = newDrawable;
        newDrawable.setCallback(t4Var.h);
        return t4Var;
    }
}
