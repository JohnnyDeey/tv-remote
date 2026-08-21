package defpackage;

import android.util.Log;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class cq {
    public final he a = r21.a(512, 6);
    public final n40 b = new n40();
    public final bb0 c = new bb0();
    public final o3 d = new o3(2);
    public final o3 e = new o3(0);
    public final ok f;
    public volatile y3 g;
    public volatile mp0 h;
    public volatile zy i;
    public volatile zy j;
    public volatile zy k;
    public volatile zy l;
    public volatile zy m;
    public volatile jp n;
    public volatile String o;
    public volatile int p;

    /* JADX WARN: Type inference failed for: r0v10, types: [qq0, zy] */
    public cq() {
        int i = 6;
        ho hoVar = yq.a;
        un unVar = un.e;
        l30 l30Var = new l30();
        unVar.getClass();
        dl b0 = k20.b0(unVar, l30Var);
        ok okVar = new ok(b0.h(os.e) == null ? b0.g(new l30()) : b0);
        this.f = okVar;
        this.h = r21.D(okVar, null, new qq0(null), 3);
        this.i = new pi(5);
        this.j = new pi(i);
        this.k = new pi(7);
        this.l = new pi(8);
        this.m = new pi(9);
        this.n = new jp("", 0, hp.l);
        this.o = "";
    }

    public static final void a(cq cqVar) {
        cqVar.getClass();
        Log.d("DSP", "Closing");
        cqVar.d.close();
        cqVar.c.close();
        cqVar.b.close();
        cqVar.e.close();
    }

    public final void b() {
        ok okVar = this.f;
        dl dlVar = okVar.c;
        os osVar = os.e;
        q30 q30Var = (q30) dlVar.h(osVar);
        if (q30Var != null) {
            st stVar = null;
            q30Var.j(null);
            this.a.f(null, false);
            ho hoVar = yq.a;
            dl dlVar2 = un.e;
            if (dlVar2.h(osVar) == null) {
                dlVar2 = dlVar2.g(new l30());
            }
            vp vpVar = new vp(this, null);
            if ((3 & 1) != 0) {
                stVar = st.c;
            }
            dl n = r21.n(dlVar2, stVar, true);
            ho hoVar2 = yq.a;
            if (n != hoVar2 && n.h(g00.e) == null) {
                n = n.g(hoVar2);
            }
            m0 m0Var = new m0(n, true);
            m0Var.T(ol.c, m0Var, vpVar);
            return;
        }
        c.t(okVar, "Scope cannot be cancelled because it does not have a job: ");
    }

    public final void c(up upVar) {
        this.a.i(upVar);
    }
}
