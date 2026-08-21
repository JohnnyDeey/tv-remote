package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class m60 implements ma0, AdapterView.OnItemClickListener {
    public Context c;
    public LayoutInflater d;
    public w90 e;
    public ExpandedMenuView f;
    public la0 g;
    public l60 h;

    public m60(ContextWrapper contextWrapper) {
        this.c = contextWrapper;
        this.d = LayoutInflater.from(contextWrapper);
    }

    @Override // defpackage.ma0
    public final void a(w90 w90Var, boolean z) {
        la0 la0Var = this.g;
        if (la0Var != null) {
            la0Var.a(w90Var, z);
        }
    }

    @Override // defpackage.ma0
    public final boolean c(z90 z90Var) {
        return false;
    }

    @Override // defpackage.ma0
    public final void e(la0 la0Var) {
        throw null;
    }

    @Override // defpackage.ma0
    public final boolean f(z90 z90Var) {
        return false;
    }

    @Override // defpackage.ma0
    public final void g() {
        l60 l60Var = this.h;
        if (l60Var != null) {
            l60Var.notifyDataSetChanged();
        }
    }

    @Override // defpackage.ma0
    public final void i(Context context, w90 w90Var) {
        if (this.c != null) {
            this.c = context;
            if (this.d == null) {
                this.d = LayoutInflater.from(context);
            }
        }
        this.e = w90Var;
        l60 l60Var = this.h;
        if (l60Var != null) {
            l60Var.notifyDataSetChanged();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.DialogInterface$OnClickListener, java.lang.Object, la0, android.content.DialogInterface$OnDismissListener, x90] */
    @Override // defpackage.ma0
    public final boolean j(gq0 gq0Var) {
        boolean hasVisibleItems = gq0Var.hasVisibleItems();
        Context context = gq0Var.a;
        if (!hasVisibleItems) {
            return false;
        }
        ?? obj = new Object();
        obj.c = gq0Var;
        f61 f61Var = new f61(context);
        f4 f4Var = (f4) f61Var.d;
        m60 m60Var = new m60(f4Var.a);
        obj.e = m60Var;
        m60Var.g = obj;
        gq0Var.b(m60Var, context);
        m60 m60Var2 = obj.e;
        if (m60Var2.h == null) {
            m60Var2.h = new l60(m60Var2);
        }
        f4Var.n = m60Var2.h;
        f4Var.o = obj;
        View view = gq0Var.o;
        if (view != null) {
            f4Var.e = view;
        } else {
            f4Var.c = gq0Var.n;
            f4Var.d = gq0Var.m;
        }
        f4Var.l = obj;
        j4 b = f61Var.b();
        obj.d = b;
        b.setOnDismissListener(obj);
        WindowManager.LayoutParams attributes = obj.d.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        obj.d.show();
        la0 la0Var = this.g;
        if (la0Var != null) {
            la0Var.p(gq0Var);
            return true;
        }
        return true;
    }

    @Override // defpackage.ma0
    public final boolean k() {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.e.q(this.h.getItem(i), this, 0);
    }
}
