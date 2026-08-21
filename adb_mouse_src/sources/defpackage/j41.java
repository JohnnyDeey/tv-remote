package defpackage;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class j41 extends l41 {
    public final transient int e;
    public final transient int f;
    public final /* synthetic */ l41 g;

    public j41(l41 l41Var, int i, int i2) {
        this.g = l41Var;
        this.e = i;
        this.f = i2;
    }

    @Override // defpackage.e41
    public final Object[] b() {
        return this.g.b();
    }

    @Override // defpackage.e41
    public final int c() {
        return this.g.c() + this.e;
    }

    @Override // defpackage.e41
    public final int d() {
        return this.g.c() + this.e + this.f;
    }

    @Override // defpackage.l41, java.util.List
    /* renamed from: g */
    public final l41 subList(int i, int i2) {
        mi0.Y(i, i2, this.f);
        int i3 = this.e;
        return this.g.subList(i + i3, i2 + i3);
    }

    @Override // java.util.List
    public final Object get(int i) {
        mi0.X(i, this.f);
        return this.g.get(i + this.e);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f;
    }
}
