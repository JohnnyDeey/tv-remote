package defpackage;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class h8 extends AbstractList implements List {
    public static final Object[] f = new Object[0];
    public int c;
    public Object[] d = f;
    public int e;

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int i3 = this.e;
        if (i >= 0 && i <= i3) {
            if (i == i3) {
                addLast(obj);
                return;
            }
            if (i == 0) {
                addFirst(obj);
                return;
            }
            h();
            c(this.e + 1);
            int g = g(this.c + i);
            int i4 = this.e;
            if (i < ((i4 + 1) >> 1)) {
                if (g == 0) {
                    Object[] objArr = this.d;
                    objArr.getClass();
                    i2 = objArr.length - 1;
                } else {
                    i2 = g - 1;
                }
                int i5 = this.c;
                if (i5 == 0) {
                    Object[] objArr2 = this.d;
                    objArr2.getClass();
                    i5 = objArr2.length;
                }
                int i6 = i5 - 1;
                int i7 = this.c;
                Object[] objArr3 = this.d;
                if (i2 >= i7) {
                    objArr3[i6] = objArr3[i7];
                    s8.v0(objArr3, objArr3, i7, i7 + 1, i2 + 1);
                } else {
                    s8.v0(objArr3, objArr3, i7 - 1, i7, objArr3.length);
                    Object[] objArr4 = this.d;
                    objArr4[objArr4.length - 1] = objArr4[0];
                    s8.v0(objArr4, objArr4, 0, 1, i2 + 1);
                }
                this.d[i2] = obj;
                this.c = i6;
            } else {
                int g2 = g(this.c + i4);
                Object[] objArr5 = this.d;
                if (g < g2) {
                    s8.v0(objArr5, objArr5, g + 1, g, g2);
                } else {
                    s8.v0(objArr5, objArr5, 1, 0, g2);
                    Object[] objArr6 = this.d;
                    objArr6[0] = objArr6[objArr6.length - 1];
                    s8.v0(objArr6, objArr6, g + 1, g, objArr6.length - 1);
                }
                this.d[g] = obj;
            }
            this.e++;
            return;
        }
        c.m(qo0.o("index: ", i, ", size: ", i3));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        int i2 = this.e;
        if (i >= 0 && i <= i2) {
            if (collection.isEmpty()) {
                return false;
            }
            if (i == this.e) {
                return addAll(collection);
            }
            h();
            c(collection.size() + this.e);
            int g = g(this.c + this.e);
            int g2 = g(this.c + i);
            int size = collection.size();
            if (i < ((this.e + 1) >> 1)) {
                int i3 = this.c;
                int i4 = i3 - size;
                Object[] objArr = this.d;
                if (g2 >= i3) {
                    if (i4 >= 0) {
                        s8.v0(objArr, objArr, i4, i3, g2);
                    } else {
                        i4 += objArr.length;
                        int i5 = g2 - i3;
                        int length = objArr.length - i4;
                        if (length >= i5) {
                            s8.v0(objArr, objArr, i4, i3, g2);
                        } else {
                            s8.v0(objArr, objArr, i4, i3, i3 + length);
                            Object[] objArr2 = this.d;
                            s8.v0(objArr2, objArr2, 0, this.c + length, g2);
                        }
                    }
                } else {
                    s8.v0(objArr, objArr, i4, i3, objArr.length);
                    Object[] objArr3 = this.d;
                    if (size >= g2) {
                        s8.v0(objArr3, objArr3, objArr3.length - size, 0, g2);
                    } else {
                        s8.v0(objArr3, objArr3, objArr3.length - size, 0, size);
                        Object[] objArr4 = this.d;
                        s8.v0(objArr4, objArr4, 0, size, g2);
                    }
                }
                this.c = i4;
                b(e(g2 - size), collection);
                return true;
            }
            int i6 = g2 + size;
            Object[] objArr5 = this.d;
            if (g2 < g) {
                int i7 = size + g;
                if (i7 <= objArr5.length) {
                    s8.v0(objArr5, objArr5, i6, g2, g);
                } else if (i6 >= objArr5.length) {
                    s8.v0(objArr5, objArr5, i6 - objArr5.length, g2, g);
                } else {
                    int length2 = g - (i7 - objArr5.length);
                    s8.v0(objArr5, objArr5, 0, length2, g);
                    Object[] objArr6 = this.d;
                    s8.v0(objArr6, objArr6, i6, g2, length2);
                }
            } else {
                s8.v0(objArr5, objArr5, size, 0, g);
                Object[] objArr7 = this.d;
                if (i6 >= objArr7.length) {
                    s8.v0(objArr7, objArr7, i6 - objArr7.length, g2, objArr7.length);
                } else {
                    s8.v0(objArr7, objArr7, 0, objArr7.length - size, objArr7.length);
                    Object[] objArr8 = this.d;
                    s8.v0(objArr8, objArr8, i6, g2, objArr8.length - size);
                }
            }
            b(g2, collection);
            return true;
        }
        c.m(qo0.o("index: ", i, ", size: ", i2));
        return false;
    }

    public final void addFirst(Object obj) {
        h();
        c(this.e + 1);
        int i = this.c;
        if (i == 0) {
            Object[] objArr = this.d;
            objArr.getClass();
            i = objArr.length;
        }
        int i2 = i - 1;
        this.c = i2;
        this.d[i2] = obj;
        this.e++;
    }

    public final void addLast(Object obj) {
        h();
        c(this.e + 1);
        this.d[g(this.c + this.e)] = obj;
        this.e++;
    }

    public final void b(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.d.length;
        while (i < length && it.hasNext()) {
            this.d[i] = it.next();
            i++;
        }
        int i2 = this.c;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.d[i3] = it.next();
        }
        this.e = collection.size() + this.e;
    }

    public final void c(int i) {
        if (i >= 0) {
            Object[] objArr = this.d;
            if (i <= objArr.length) {
                return;
            }
            if (objArr == f) {
                if (i < 10) {
                    i = 10;
                }
                this.d = new Object[i];
                return;
            }
            int length = objArr.length;
            int i2 = length + (length >> 1);
            if (i2 - i < 0) {
                i2 = i;
            }
            if (i2 - 2147483639 > 0) {
                if (i > 2147483639) {
                    i2 = Integer.MAX_VALUE;
                } else {
                    i2 = 2147483639;
                }
            }
            Object[] objArr2 = new Object[i2];
            s8.v0(objArr, objArr2, 0, this.c, objArr.length);
            Object[] objArr3 = this.d;
            int length2 = objArr3.length;
            int i3 = this.c;
            s8.v0(objArr3, objArr2, length2 - i3, 0, i3);
            this.c = 0;
            this.d = objArr2;
            return;
        }
        c.o("Deque is too big.");
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            h();
            f(this.c, g(this.c + this.e));
        }
        this.c = 0;
        this.e = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    public final int d(int i) {
        this.d.getClass();
        if (i == r0.length - 1) {
            return 0;
        }
        return i + 1;
    }

    public final int e(int i) {
        if (i < 0) {
            return i + this.d.length;
        }
        return i;
    }

    public final void f(int i, int i2) {
        Object[] objArr = this.d;
        if (i < i2) {
            objArr.getClass();
            Arrays.fill(objArr, i, i2, (Object) null);
        } else {
            Arrays.fill(objArr, i, objArr.length, (Object) null);
            Object[] objArr2 = this.d;
            objArr2.getClass();
            Arrays.fill(objArr2, 0, i2, (Object) null);
        }
    }

    public final int g(int i) {
        Object[] objArr = this.d;
        if (i >= objArr.length) {
            return i - objArr.length;
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int i2 = this.e;
        if (i >= 0 && i < i2) {
            return this.d[g(this.c + i)];
        }
        c.m(qo0.o("index: ", i, ", size: ", i2));
        return null;
    }

    public final void h() {
        ((AbstractList) this).modCount++;
    }

    public final Object i(int i) {
        int i2 = this.e;
        if (i >= 0 && i < i2) {
            if (i == i2 - 1) {
                return removeLast();
            }
            if (i == 0) {
                return removeFirst();
            }
            h();
            int g = g(this.c + i);
            Object[] objArr = this.d;
            Object obj = objArr[g];
            int i3 = this.e;
            int i4 = i3 >> 1;
            int i5 = this.c;
            if (i < i4) {
                if (g >= i5) {
                    s8.v0(objArr, objArr, i5 + 1, i5, g);
                } else {
                    s8.v0(objArr, objArr, 1, 0, g);
                    Object[] objArr2 = this.d;
                    objArr2[0] = objArr2[objArr2.length - 1];
                    int i6 = this.c;
                    s8.v0(objArr2, objArr2, i6 + 1, i6, objArr2.length - 1);
                }
                Object[] objArr3 = this.d;
                int i7 = this.c;
                objArr3[i7] = null;
                this.c = d(i7);
            } else {
                int g2 = g((i3 - 1) + i5);
                Object[] objArr4 = this.d;
                if (g <= g2) {
                    s8.v0(objArr4, objArr4, g, g + 1, g2 + 1);
                } else {
                    s8.v0(objArr4, objArr4, g, g + 1, objArr4.length);
                    Object[] objArr5 = this.d;
                    objArr5[objArr5.length - 1] = objArr5[0];
                    s8.v0(objArr5, objArr5, 0, 1, g2 + 1);
                }
                this.d[g2] = null;
            }
            this.e--;
            return obj;
        }
        c.m(qo0.o("index: ", i, ", size: ", i2));
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int g = g(this.c + this.e);
        int i2 = this.c;
        if (i2 < g) {
            while (i2 < g) {
                if (k20.c(obj, this.d[i2])) {
                    i = this.c;
                } else {
                    i2++;
                }
            }
            return -1;
        }
        if (i2 >= g) {
            int length = this.d.length;
            while (true) {
                if (i2 < length) {
                    if (k20.c(obj, this.d[i2])) {
                        i = this.c;
                        break;
                    }
                    i2++;
                } else {
                    for (int i3 = 0; i3 < g; i3++) {
                        if (k20.c(obj, this.d[i3])) {
                            i2 = i3 + this.d.length;
                            i = this.c;
                        }
                    }
                    return -1;
                }
            }
        } else {
            return -1;
        }
        return i2 - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        if (this.e == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i;
        int g = g(this.c + this.e);
        int i2 = this.c;
        if (i2 < g) {
            length = g - 1;
            if (i2 <= length) {
                while (!k20.c(obj, this.d[length])) {
                    if (length != i2) {
                        length--;
                    }
                }
                i = this.c;
                return length - i;
            }
            return -1;
        }
        if (i2 > g) {
            while (true) {
                g--;
                Object[] objArr = this.d;
                if (-1 < g) {
                    if (k20.c(obj, objArr[g])) {
                        length = g + this.d.length;
                        i = this.c;
                        break;
                    }
                } else {
                    objArr.getClass();
                    length = objArr.length - 1;
                    int i3 = this.c;
                    if (i3 <= length) {
                        while (!k20.c(obj, this.d[length])) {
                            if (length != i3) {
                                length--;
                            }
                        }
                        i = this.c;
                    }
                }
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        i(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int g;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.d.length != 0) {
            int g2 = g(this.c + this.e);
            int i = this.c;
            if (i < g2) {
                g = i;
                while (true) {
                    objArr = this.d;
                    if (i >= g2) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (!collection.contains(obj)) {
                        this.d[g] = obj;
                        g++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                objArr.getClass();
                Arrays.fill(objArr, g, g2, (Object) null);
            } else {
                int length = this.d.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr2 = this.d;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (!collection.contains(obj2)) {
                        this.d[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                g = g(i2);
                for (int i3 = 0; i3 < g2; i3++) {
                    Object[] objArr3 = this.d;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (!collection.contains(obj3)) {
                        this.d[g] = obj3;
                        g = d(g);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                h();
                this.e = e(g - this.c);
            }
        }
        return z;
    }

    public final Object removeFirst() {
        if (!isEmpty()) {
            h();
            Object[] objArr = this.d;
            int i = this.c;
            Object obj = objArr[i];
            objArr[i] = null;
            this.c = d(i);
            this.e--;
            return obj;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final Object removeLast() {
        if (!isEmpty()) {
            h();
            int g = g((size() - 1) + this.c);
            Object[] objArr = this.d;
            Object obj = objArr[g];
            objArr[g] = null;
            this.e--;
            return obj;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        r21.g(i, i2, this.e);
        int i3 = i2 - i;
        if (i3 == 0) {
            return;
        }
        if (i3 == this.e) {
            clear();
            return;
        }
        if (i3 == 1) {
            i(i);
            return;
        }
        h();
        int i4 = this.e - i2;
        int i5 = this.c;
        if (i < i4) {
            int g = g((i - 1) + i5);
            int g2 = g(this.c + (i2 - 1));
            while (i > 0) {
                int i6 = g + 1;
                int min = Math.min(i, Math.min(i6, g2 + 1));
                Object[] objArr = this.d;
                int i7 = g2 - min;
                int i8 = g - min;
                s8.v0(objArr, objArr, i7 + 1, i8 + 1, i6);
                g = e(i8);
                g2 = e(i7);
                i -= min;
            }
            int g3 = g(this.c + i3);
            f(this.c, g3);
            this.c = g3;
        } else {
            int g4 = g(i5 + i2);
            int g5 = g(this.c + i);
            int i9 = this.e;
            while (true) {
                i9 -= i2;
                if (i9 <= 0) {
                    break;
                }
                Object[] objArr2 = this.d;
                i2 = Math.min(i9, Math.min(objArr2.length - g4, objArr2.length - g5));
                Object[] objArr3 = this.d;
                int i10 = g4 + i2;
                s8.v0(objArr3, objArr3, g5, g4, i10);
                g4 = g(i10);
                g5 = g(g5 + i2);
            }
            int g6 = g(this.c + this.e);
            f(e(g6 - i3), g6);
        }
        this.e -= i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int g;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.d.length != 0) {
            int g2 = g(this.c + this.e);
            int i = this.c;
            if (i < g2) {
                g = i;
                while (true) {
                    objArr = this.d;
                    if (i >= g2) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (collection.contains(obj)) {
                        this.d[g] = obj;
                        g++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                objArr.getClass();
                Arrays.fill(objArr, g, g2, (Object) null);
            } else {
                int length = this.d.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr2 = this.d;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        this.d[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                g = g(i2);
                for (int i3 = 0; i3 < g2; i3++) {
                    Object[] objArr3 = this.d;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        this.d[g] = obj3;
                        g = d(g);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                h();
                this.e = e(g - this.c);
            }
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int i2 = this.e;
        if (i >= 0 && i < i2) {
            int g = g(this.c + i);
            Object[] objArr = this.d;
            Object obj2 = objArr[g];
            objArr[g] = obj;
            return obj2;
        }
        c.m(qo0.o("index: ", i, ", size: ", i2));
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        int i = this.e;
        if (length < i) {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), i);
            newInstance.getClass();
            objArr = (Object[]) newInstance;
        }
        int g = g(this.c + this.e);
        int i2 = this.c;
        if (i2 < g) {
            s8.w0(this.d, objArr, i2, g, 2);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.d;
            s8.v0(objArr2, objArr, 0, this.c, objArr2.length);
            Object[] objArr3 = this.d;
            s8.v0(objArr3, objArr, objArr3.length - this.c, 0, g);
        }
        int i3 = this.e;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i) {
        return i(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[this.e]);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        if (collection.isEmpty()) {
            return false;
        }
        h();
        c(collection.size() + this.e);
        b(g(this.c + this.e), collection);
        return true;
    }
}
