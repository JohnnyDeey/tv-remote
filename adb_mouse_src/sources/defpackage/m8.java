package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class m8 implements Collection {
    public final /* synthetic */ n8 c;

    public m8(n8 n8Var) {
        this.c = n8Var;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.c.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (this.c.a(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.c.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new j8(this.c, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        n8 n8Var = this.c;
        int a = n8Var.a(obj);
        if (a >= 0) {
            n8Var.g(a);
            return true;
        }
        return false;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        n8 n8Var = this.c;
        int i = n8Var.e;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (collection.contains(n8Var.i(i2))) {
                n8Var.g(i2);
                i2--;
                i--;
                z = true;
            }
            i2++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        n8 n8Var = this.c;
        int i = n8Var.e;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (!collection.contains(n8Var.i(i2))) {
                n8Var.g(i2);
                i2--;
                i--;
                z = true;
            }
            i2++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.c.e;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        n8 n8Var = this.c;
        int i = n8Var.e;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = n8Var.i(i2);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        n8 n8Var = this.c;
        int i = n8Var.e;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = n8Var.i(i2);
        }
        return objArr;
    }
}
