package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class gq0 extends w90 implements SubMenu {
    public final z90 A;
    public final w90 z;

    public gq0(Context context, w90 w90Var, z90 z90Var) {
        super(context);
        this.z = w90Var;
        this.A = z90Var;
    }

    @Override // defpackage.w90
    public final boolean d(z90 z90Var) {
        return this.z.d(z90Var);
    }

    @Override // defpackage.w90
    public final boolean e(w90 w90Var, MenuItem menuItem) {
        if (!super.e(w90Var, menuItem) && !this.z.e(w90Var, menuItem)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.w90
    public final boolean f(z90 z90Var) {
        return this.z.f(z90Var);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.A;
    }

    @Override // defpackage.w90
    public final String j() {
        int i;
        z90 z90Var = this.A;
        if (z90Var != null) {
            i = z90Var.a;
        } else {
            i = 0;
        }
        if (i == 0) {
            return null;
        }
        return qo0.m("android:menu:actionviewstates:", i);
    }

    @Override // defpackage.w90
    public final w90 k() {
        return this.z.k();
    }

    @Override // defpackage.w90
    public final boolean m() {
        return this.z.m();
    }

    @Override // defpackage.w90
    public final boolean n() {
        return this.z.n();
    }

    @Override // defpackage.w90
    public final boolean o() {
        return this.z.o();
    }

    @Override // defpackage.w90, android.view.Menu
    public final void setGroupDividerEnabled(boolean z) {
        this.z.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        u(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        u(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        u(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.A.setIcon(drawable);
        return this;
    }

    @Override // defpackage.w90, android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.z.setQwertyMode(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.A.setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        u(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        u(i, null, 0, null, null);
        return this;
    }
}
