package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class a31 implements wc {
    public boolean c;
    public final Object d;
    public final Object e;
    public Object f;
    public Object g;
    public final Object h;

    public a31(Context context, rd rdVar, jp0 jp0Var) {
        this.d = context;
        this.e = rdVar;
        this.f = jp0Var;
        this.g = new d41(this, true);
        this.h = new d41(this, false);
    }

    public void a(jj jjVar) {
        y21 y21Var = (y21) ((e00) this.h).j.get((c5) this.e);
        if (y21Var != null) {
            y21Var.p(jjVar);
        }
    }

    @Override // defpackage.wc
    public void e(jj jjVar) {
        ((e00) this.h).m.post(new m61(this, jjVar, 11, false));
    }

    public a31(e00 e00Var, z4 z4Var, c5 c5Var) {
        this.h = e00Var;
        this.f = null;
        this.g = null;
        this.c = false;
        this.d = z4Var;
        this.e = c5Var;
    }
}
