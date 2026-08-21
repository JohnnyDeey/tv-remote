package defpackage;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class p8 implements Collection, Set {
    public int[] c;
    public Object[] d;
    public int e;

    public p8(int i) {
        this.c = wv0.g;
        this.d = wv0.h;
        if (i > 0) {
            this.c = new int[i];
            this.d = new Object[i];
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i;
        int z;
        int i2 = this.e;
        if (obj == null) {
            z = mn.z(this, null, 0);
            i = 0;
        } else {
            int hashCode = obj.hashCode();
            i = hashCode;
            z = mn.z(this, obj, hashCode);
        }
        if (z >= 0) {
            return false;
        }
        int i3 = ~z;
        int[] iArr = this.c;
        if (i2 >= iArr.length) {
            int i4 = 8;
            if (i2 >= 8) {
                i4 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i4 = 4;
            }
            Object[] objArr = this.d;
            int[] iArr2 = new int[i4];
            this.c = iArr2;
            this.d = new Object[i4];
            if (i2 == this.e) {
                if (iArr2.length != 0) {
                    s8.u0(0, 0, iArr.length, iArr, iArr2);
                    s8.w0(objArr, this.d, 0, objArr.length, 6);
                }
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i3 < i2) {
            int[] iArr3 = this.c;
            int i5 = i3 + 1;
            s8.u0(i5, i3, i2, iArr3, iArr3);
            Object[] objArr2 = this.d;
            s8.v0(objArr2, objArr2, i5, i3, i2);
        }
        int i6 = this.e;
        if (i2 == i6) {
            int[] iArr4 = this.c;
            if (i3 < iArr4.length) {
                iArr4[i3] = i;
                this.d[i3] = obj;
                this.e = i6 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        collection.getClass();
        int size = collection.size() + this.e;
        int i = this.e;
        int[] iArr = this.c;
        boolean z = false;
        if (iArr.length < size) {
            Object[] objArr = this.d;
            int[] iArr2 = new int[size];
            this.c = iArr2;
            this.d = new Object[size];
            if (i > 0) {
                s8.u0(0, 0, i, iArr, iArr2);
                s8.w0(objArr, this.d, 0, this.e, 6);
            }
        }
        if (this.e == i) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                z |= add(it.next());
            }
            return z;
        }
        throw new ConcurrentModificationException();
    }

    public final void b(int i) {
        int i2 = this.e;
        Object[] objArr = this.d;
        Object obj = objArr[i];
        if (i2 <= 1) {
            clear();
            return;
        }
        int i3 = i2 - 1;
        int[] iArr = this.c;
        int i4 = 8;
        if (iArr.length > 8 && i2 < iArr.length / 3) {
            if (i2 > 8) {
                i4 = i2 + (i2 >> 1);
            }
            int[] iArr2 = new int[i4];
            this.c = iArr2;
            this.d = new Object[i4];
            if (i > 0) {
                s8.u0(0, 0, i, iArr, iArr2);
                s8.w0(objArr, this.d, 0, i, 6);
            }
            if (i < i3) {
                int i5 = i + 1;
                s8.u0(i, i5, i2, iArr, this.c);
                s8.v0(objArr, this.d, i, i5, i2);
            }
        } else {
            if (i < i3) {
                int i6 = i + 1;
                s8.u0(i, i6, i2, iArr, iArr);
                Object[] objArr2 = this.d;
                s8.v0(objArr2, objArr2, i, i6, i2);
            }
            this.d[i3] = null;
        }
        if (i2 == this.e) {
            this.e = i3;
            return;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.e != 0) {
            this.c = wv0.g;
            this.d = wv0.h;
            this.e = 0;
        }
        if (this.e == 0) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int z;
        if (obj == null) {
            z = mn.z(this, null, 0);
        } else {
            z = mn.z(this, obj, obj.hashCode());
        }
        if (z < 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || this.e != ((Set) obj).size()) {
            return false;
        }
        try {
            int i = this.e;
            for (int i2 = 0; i2 < i; i2++) {
                if (!((Set) obj).contains(this.d[i2])) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.c;
        int i = this.e;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        if (this.e <= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new j8(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int z;
        if (obj == null) {
            z = mn.z(this, null, 0);
        } else {
            z = mn.z(this, obj, obj.hashCode());
        }
        if (z < 0) {
            return false;
        }
        b(z);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= remove(it.next());
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        boolean z = false;
        for (int i = this.e - 1; -1 < i; i--) {
            if (!collection.contains(this.d[i])) {
                b(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.e;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        Object[] objArr = this.d;
        int i = this.e;
        objArr.getClass();
        int length = objArr.length;
        if (i <= length) {
            Object[] copyOfRange = Arrays.copyOfRange(objArr, 0, i);
            copyOfRange.getClass();
            return copyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i + ") is greater than size (" + length + ").");
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.e * 14);
        sb.append('{');
        int i = this.e;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object obj = this.d[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int i = this.e;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        } else if (objArr.length > i) {
            objArr[i] = null;
        }
        s8.v0(this.d, objArr, 0, 0, this.e);
        return objArr;
    }
}
