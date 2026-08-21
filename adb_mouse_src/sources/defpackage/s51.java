package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class s51 extends o51 {
    public final transient u51 e;
    public final transient t51 f;

    public s51(u51 u51Var, t51 t51Var) {
        this.e = u51Var;
        this.f = t51Var;
    }

    @Override // defpackage.e51
    public final int b(Object[] objArr) {
        return this.f.b(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (this.e.get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // defpackage.o51, defpackage.e51
    public final i51 e() {
        return this.f;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.e.h;
    }
}
