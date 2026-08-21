package defpackage;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public abstract class m0 extends q30 implements qk, ll {
    public final dl e;

    public m0(dl dlVar, boolean z) {
        super(z);
        B((q30) dlVar.h(os.e));
        this.e = dlVar.g(this);
    }

    @Override // defpackage.q30
    public final void A(vi viVar) {
        f20.J(this.e, viVar);
    }

    @Override // defpackage.q30
    public final void J(Object obj) {
        boolean z;
        if (obj instanceof ui) {
            ui uiVar = (ui) obj;
            Throwable th = uiVar.a;
            if (ui.b.get(uiVar) != 0) {
                z = true;
            } else {
                z = false;
            }
            R(th, z);
            return;
        }
        S(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void T(ol olVar, m0 m0Var, zy zyVar) {
        int ordinal = olVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        try {
                            dl dlVar = this.e;
                            Object c0 = wv0.c0(dlVar, null);
                            try {
                                wv0.j(2, zyVar);
                                Object g = zyVar.g(m0Var, this);
                                if (g != ml.c) {
                                    e(g);
                                    return;
                                }
                                return;
                            } finally {
                                wv0.W(dlVar, c0);
                            }
                        } catch (Throwable th) {
                            e(new sj0(th));
                            return;
                        }
                    }
                    throw new RuntimeException();
                }
                wv0.G(((rk) zyVar).j(this, m0Var)).e(nw0.a);
                return;
            }
            return;
        }
        f20.e0(zyVar, m0Var, this);
    }

    @Override // defpackage.ll
    public final dl b() {
        return this.e;
    }

    @Override // defpackage.qk
    public final dl d() {
        return this.e;
    }

    @Override // defpackage.qk
    public final void e(Object obj) {
        Throwable a = tj0.a(obj);
        if (a != null) {
            obj = new ui(a, false);
        }
        Object G = G(obj);
        if (G == k20.j) {
            return;
        }
        m(G);
    }

    @Override // defpackage.q30
    public final String q() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    public void S(Object obj) {
    }

    public void R(Throwable th, boolean z) {
    }
}
