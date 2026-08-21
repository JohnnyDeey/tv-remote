package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class n41 extends l41 {
    public static final n41 g = new n41(new Object[0], 0);
    public final transient Object[] e;
    public final transient int f;

    public n41(Object[] objArr, int i) {
        this.e = objArr;
        this.f = i;
    }

    @Override // defpackage.e41
    public final Object[] b() {
        return this.e;
    }

    @Override // defpackage.e41
    public final int c() {
        return 0;
    }

    @Override // defpackage.e41
    public final int d() {
        return this.f;
    }

    @Override // defpackage.l41, defpackage.e41
    public final int e(Object[] objArr) {
        Object[] objArr2 = this.e;
        int i = this.f;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        mi0.X(i, this.f);
        Object obj = this.e[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f;
    }
}
