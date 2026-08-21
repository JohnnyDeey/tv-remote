package defpackage;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public class cm0 extends m0 implements nl {
    public final rk f;

    public cm0(dl dlVar, rk rkVar) {
        super(dlVar, true);
        this.f = rkVar;
    }

    @Override // defpackage.q30
    public final boolean E() {
        return true;
    }

    @Override // defpackage.nl
    public final nl c() {
        rk rkVar = this.f;
        if (rkVar != null) {
            return rkVar;
        }
        return null;
    }

    @Override // defpackage.q30
    public void l(Object obj) {
        mn.O(wv0.G(this.f), k20.d0(obj));
    }

    @Override // defpackage.q30
    public void m(Object obj) {
        this.f.e(k20.d0(obj));
    }
}
