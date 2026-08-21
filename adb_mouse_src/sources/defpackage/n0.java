package defpackage;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public abstract class n0 implements bl {
    public final cl c;

    public n0(cl clVar) {
        this.c = clVar;
    }

    @Override // defpackage.dl
    public final Object f(Object obj, zy zyVar) {
        return zyVar.g(obj, this);
    }

    @Override // defpackage.dl
    public final dl g(dl dlVar) {
        return wv0.Q(this, dlVar);
    }

    @Override // defpackage.bl
    public final cl getKey() {
        return this.c;
    }

    @Override // defpackage.dl
    public bl h(cl clVar) {
        clVar.getClass();
        if (k20.c(getKey(), clVar)) {
            return this;
        }
        return null;
    }

    @Override // defpackage.dl
    public dl k(cl clVar) {
        clVar.getClass();
        if (k20.c(getKey(), clVar)) {
            return st.c;
        }
        return this;
    }
}
