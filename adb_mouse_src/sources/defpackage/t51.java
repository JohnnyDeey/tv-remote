package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class t51 extends i51 {
    public final transient Object[] e;
    public final transient int f;
    public final transient int g;

    public t51(Object[] objArr, int i, int i2) {
        this.e = objArr;
        this.f = i;
        this.g = i2;
    }

    @Override // defpackage.e51
    public final boolean f() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        wg0.D(i, this.g);
        Object obj = this.e[i + i + this.f];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.g;
    }
}
