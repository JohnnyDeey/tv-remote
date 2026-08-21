package defpackage;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class h51 extends i51 {
    public final transient int e;
    public final transient int f;
    public final /* synthetic */ i51 g;

    public h51(i51 i51Var, int i, int i2) {
        this.g = i51Var;
        this.e = i;
        this.f = i2;
    }

    @Override // defpackage.e51
    public final int c() {
        return this.g.d() + this.e + this.f;
    }

    @Override // defpackage.e51
    public final int d() {
        return this.g.d() + this.e;
    }

    @Override // defpackage.e51
    public final boolean f() {
        return true;
    }

    @Override // defpackage.e51
    public final Object[] g() {
        return this.g.g();
    }

    @Override // java.util.List
    public final Object get(int i) {
        wg0.D(i, this.f);
        return this.g.get(i + this.e);
    }

    @Override // defpackage.i51, java.util.List
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final i51 subList(int i, int i2) {
        wg0.H(i, i2, this.f);
        int i3 = this.e;
        return this.g.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f;
    }
}
