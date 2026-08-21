package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class p51 extends i51 {
    public static final p51 g = new p51(new Object[0], 0);
    public final transient Object[] e;
    public final transient int f;

    public p51(Object[] objArr, int i) {
        this.e = objArr;
        this.f = i;
    }

    @Override // defpackage.i51, defpackage.e51
    public final int b(Object[] objArr) {
        Object[] objArr2 = this.e;
        int i = this.f;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // defpackage.e51
    public final int c() {
        return this.f;
    }

    @Override // defpackage.e51
    public final int d() {
        return 0;
    }

    @Override // defpackage.e51
    public final boolean f() {
        return false;
    }

    @Override // defpackage.e51
    public final Object[] g() {
        return this.e;
    }

    @Override // java.util.List
    public final Object get(int i) {
        wg0.D(i, this.f);
        Object obj = this.e[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f;
    }
}
