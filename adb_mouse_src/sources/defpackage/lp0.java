package defpackage;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class lp0 extends v2 implements u90 {
    public Context e;
    public ActionBarContextView f;
    public r6 g;
    public WeakReference h;
    public boolean i;
    public w90 j;

    @Override // defpackage.v2
    public final void a() {
        if (this.i) {
            return;
        }
        this.i = true;
        this.g.H(this);
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
        return this.j;
    }

    @Override // defpackage.u90
    public final boolean d(w90 w90Var, MenuItem menuItem) {
        return ((l3) this.g.d).r(this, menuItem);
    }

    @Override // defpackage.v2
    public final MenuInflater e() {
        return new oq0(this.f.getContext());
    }

    @Override // defpackage.v2
    public final CharSequence f() {
        return this.f.getSubtitle();
    }

    @Override // defpackage.v2
    public final CharSequence g() {
        return this.f.getTitle();
    }

    @Override // defpackage.v2
    public final void h() {
        this.g.I(this, this.j);
    }

    @Override // defpackage.v2
    public final boolean i() {
        return this.f.u;
    }

    @Override // defpackage.v2
    public final void j(View view) {
        WeakReference weakReference;
        this.f.setCustomView(view);
        if (view != null) {
            weakReference = new WeakReference(view);
        } else {
            weakReference = null;
        }
        this.h = weakReference;
    }

    @Override // defpackage.u90
    public final void k(w90 w90Var) {
        h();
        r2 r2Var = this.f.f;
        if (r2Var != null) {
            r2Var.l();
        }
    }

    @Override // defpackage.v2
    public final void l(int i) {
        m(this.e.getString(i));
    }

    @Override // defpackage.v2
    public final void m(CharSequence charSequence) {
        this.f.setSubtitle(charSequence);
    }

    @Override // defpackage.v2
    public final void n(int i) {
        o(this.e.getString(i));
    }

    @Override // defpackage.v2
    public final void o(CharSequence charSequence) {
        this.f.setTitle(charSequence);
    }

    @Override // defpackage.v2
    public final void p(boolean z) {
        this.d = z;
        this.f.setTitleOptional(z);
    }
}
