package defpackage;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class i01 extends v2 implements u90 {
    public final Context e;
    public final w90 f;
    public r6 g;
    public WeakReference h;
    public final /* synthetic */ j01 i;

    public i01(j01 j01Var, Context context, r6 r6Var) {
        this.i = j01Var;
        this.e = context;
        this.g = r6Var;
        w90 w90Var = new w90(context);
        w90Var.l = 1;
        this.f = w90Var;
        w90Var.e = this;
    }

    @Override // defpackage.v2
    public final void a() {
        j01 j01Var = this.i;
        if (j01Var.i != this) {
            return;
        }
        if (j01Var.p) {
            j01Var.j = this;
            j01Var.k = this.g;
        } else {
            this.g.H(this);
        }
        this.g = null;
        j01Var.a(false);
        ActionBarContextView actionBarContextView = j01Var.f;
        if (actionBarContextView.m == null) {
            actionBarContextView.e();
        }
        j01Var.c.setHideOnContentScrollEnabled(j01Var.u);
        j01Var.i = null;
    }

    @Override // defpackage.v2
    public final View b() {
        WeakReference weakReference = this.h;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // defpackage.v2
    public final w90 c() {
        return this.f;
    }

    @Override // defpackage.u90
    public final boolean d(w90 w90Var, MenuItem menuItem) {
        r6 r6Var = this.g;
        if (r6Var != null) {
            return ((l3) r6Var.d).r(this, menuItem);
        }
        return false;
    }

    @Override // defpackage.v2
    public final MenuInflater e() {
        return new oq0(this.e);
    }

    @Override // defpackage.v2
    public final CharSequence f() {
        return this.i.f.getSubtitle();
    }

    @Override // defpackage.v2
    public final CharSequence g() {
        return this.i.f.getTitle();
    }

    @Override // defpackage.v2
    public final void h() {
        if (this.i.i != this) {
            return;
        }
        w90 w90Var = this.f;
        w90Var.w();
        try {
            this.g.I(this, w90Var);
        } finally {
            w90Var.v();
        }
    }

    @Override // defpackage.v2
    public final boolean i() {
        return this.i.f.u;
    }

    @Override // defpackage.v2
    public final void j(View view) {
        this.i.f.setCustomView(view);
        this.h = new WeakReference(view);
    }

    @Override // defpackage.u90
    public final void k(w90 w90Var) {
        if (this.g != null) {
            h();
            r2 r2Var = this.i.f.f;
            if (r2Var != null) {
                r2Var.l();
            }
        }
    }

    @Override // defpackage.v2
    public final void l(int i) {
        m(this.i.a.getResources().getString(i));
    }

    @Override // defpackage.v2
    public final void m(CharSequence charSequence) {
        this.i.f.setSubtitle(charSequence);
    }

    @Override // defpackage.v2
    public final void n(int i) {
        o(this.i.a.getResources().getString(i));
    }

    @Override // defpackage.v2
    public final void o(CharSequence charSequence) {
        this.i.f.setTitle(charSequence);
    }

    @Override // defpackage.v2
    public final void p(boolean z) {
        this.d = z;
        this.i.f.setTitleOptional(z);
    }
}
