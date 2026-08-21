package defpackage;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public abstract class gl extends n0 implements bl {
    public static final fl d = new fl(g00.e, new Object());

    public gl() {
        super(g00.e);
    }

    public abstract void b(dl dlVar, Runnable runnable);

    public boolean c(dl dlVar) {
        return !(this instanceof jw0);
    }

    public gl d(int i) {
        f20.c(i);
        return new v50(this, i);
    }

    @Override // defpackage.n0, defpackage.dl
    public final bl h(cl clVar) {
        bl blVar;
        clVar.getClass();
        if (clVar instanceof fl) {
            fl flVar = (fl) clVar;
            cl clVar2 = this.c;
            if ((clVar2 == flVar || flVar.d == clVar2) && (blVar = (bl) flVar.c.h(this)) != null) {
                return blVar;
            }
        } else if (g00.e == clVar) {
            return this;
        }
        return null;
    }

    @Override // defpackage.n0, defpackage.dl
    public final dl k(cl clVar) {
        clVar.getClass();
        if (clVar instanceof fl) {
            fl flVar = (fl) clVar;
            cl clVar2 = this.c;
            if (clVar2 != flVar && flVar.d != clVar2) {
                return this;
            }
            if (((bl) flVar.c.h(this)) == null) {
                return this;
            }
        } else if (g00.e != clVar) {
            return this;
        }
        return st.c;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + mn.r(this);
    }
}
