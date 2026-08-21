package defpackage;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class s81 extends i71 implements RandomAccess {
    public static final Object[] f;
    public static final s81 g;
    public Object[] d;
    public int e;

    static {
        Object[] objArr = new Object[0];
        f = objArr;
        g = new s81(objArr, 0, false);
    }

    public s81(Object[] objArr, int i, boolean z) {
        super(z);
        this.d = objArr;
        this.e = i;
    }

    @Override // defpackage.a81
    public final /* bridge */ /* synthetic */ a81 a(int i) {
        Object[] copyOf;
        if (i >= this.e) {
            if (i == 0) {
                copyOf = f;
            } else {
                copyOf = Arrays.copyOf(this.d, i);
            }
            return new s81(copyOf, this.e, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        b();
        if (i >= 0 && i <= (i2 = this.e)) {
            int i3 = i + 1;
            Object[] objArr = this.d;
            int length = objArr.length;
            if (i2 < length) {
                System.arraycopy(objArr, i, objArr, i3, i2 - i);
            } else {
                Object[] objArr2 = new Object[Math.max(((length * 3) / 2) + 1, 10)];
                System.arraycopy(this.d, 0, objArr2, 0, i);
                System.arraycopy(this.d, i, objArr2, i3, this.e - i);
                this.d = objArr2;
            }
            this.d[i] = obj;
            this.e++;
            ((AbstractList) this).modCount++;
            return;
        }
        c.m(qo0.o("Index:", i, ", Size:", this.e));
    }

    public final void c(int i) {
        if (i >= 0 && i < this.e) {
            return;
        }
        c.m(qo0.o("Index:", i, ", Size:", this.e));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        c(i);
        return this.d[i];
    }

    @Override // defpackage.i71, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        b();
        c(i);
        Object[] objArr = this.d;
        Object obj = objArr[i];
        if (i < this.e - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (r2 - i) - 1);
        }
        this.e--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        b();
        c(i);
        Object[] objArr = this.d;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.e;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        b();
        int i = this.e;
        int length = this.d.length;
        if (i == length) {
            this.d = Arrays.copyOf(this.d, Math.max(((length * 3) / 2) + 1, 10));
        }
        Object[] objArr = this.d;
        int i2 = this.e;
        this.e = i2 + 1;
        objArr[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
