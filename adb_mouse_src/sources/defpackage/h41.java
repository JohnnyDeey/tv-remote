package defpackage;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class h41 extends l41 {
    public final transient l41 e;

    public h41(l41 l41Var) {
        this.e = l41Var;
    }

    @Override // defpackage.l41, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.e.contains(obj);
    }

    @Override // defpackage.l41
    public final l41 f() {
        return this.e;
    }

    @Override // defpackage.l41, java.util.List
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final l41 subList(int i, int i2) {
        l41 l41Var = this.e;
        mi0.Y(i, i2, l41Var.size());
        return l41Var.subList(l41Var.size() - i2, l41Var.size() - i).f();
    }

    @Override // java.util.List
    public final Object get(int i) {
        l41 l41Var = this.e;
        mi0.X(i, l41Var.size());
        return l41Var.get((l41Var.size() - 1) - i);
    }

    @Override // defpackage.l41, java.util.List
    public final int indexOf(Object obj) {
        int lastIndexOf = this.e.lastIndexOf(obj);
        if (lastIndexOf < 0) {
            return -1;
        }
        return (r1.size() - 1) - lastIndexOf;
    }

    @Override // defpackage.l41, java.util.List
    public final int lastIndexOf(Object obj) {
        int indexOf = this.e.indexOf(obj);
        if (indexOf < 0) {
            return -1;
        }
        return (r1.size() - 1) - indexOf;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.e.size();
    }
}
