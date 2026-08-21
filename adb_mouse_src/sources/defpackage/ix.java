package defpackage;

import android.os.Handler;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.a;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class ix extends wv0 implements bz0, s50, yl0, yx {
    public final f5 s;
    public final f5 t;
    public final Handler u;
    public final vx v;
    public final /* synthetic */ f5 w;

    public ix(f5 f5Var) {
        this.w = f5Var;
        Handler handler = new Handler();
        this.v = new vx();
        this.s = f5Var;
        this.t = f5Var;
        this.u = handler;
    }

    @Override // defpackage.wv0
    public final View N(int i) {
        return this.w.findViewById(i);
    }

    @Override // defpackage.wv0
    public final boolean O() {
        Window window = this.w.getWindow();
        if (window != null && window.peekDecorView() != null) {
            return true;
        }
        return false;
    }

    @Override // defpackage.yl0
    public final l5 a() {
        return (l5) this.w.g.c;
    }

    @Override // defpackage.bz0
    public final az0 d() {
        return this.w.d();
    }

    @Override // defpackage.s50
    public final a e() {
        return this.w.v;
    }

    @Override // defpackage.yx
    public final void b() {
    }
}
