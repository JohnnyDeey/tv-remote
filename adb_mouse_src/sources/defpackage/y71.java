package defpackage;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class y71 extends i71 implements RandomAccess, z71 {
    public static final int[] f;
    public static final y71 g;
    public int[] d;
    public int e;

    static {
        int[] iArr = new int[0];
        f = iArr;
        g = new y71(iArr, 0, false);
    }

    public y71(int[] iArr, int i, boolean z) {
        super(z);
        this.d = iArr;
        this.e = i;
    }

    @Override // defpackage.a81
    public final /* bridge */ /* synthetic */ a81 a(int i) {
        int[] copyOf;
        if (i >= this.e) {
            if (i == 0) {
                copyOf = f;
            } else {
                copyOf = Arrays.copyOf(this.d, i);
            }
            return new y71(copyOf, this.e, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        b();
        if (i >= 0 && i <= (i2 = this.e)) {
            int i3 = i + 1;
            int[] iArr = this.d;
            int length = iArr.length;
            if (i2 < length) {
                System.arraycopy(iArr, i, iArr, i3, i2 - i);
            } else {
                int[] iArr2 = new int[Math.max(((length * 3) / 2) + 1, 10)];
                System.arraycopy(this.d, 0, iArr2, 0, i);
                System.arraycopy(this.d, i, iArr2, i3, this.e - i);
                this.d = iArr2;
            }
            this.d[i] = intValue;
            this.e++;
            ((AbstractList) this).modCount++;
            return;
        }
        c.m(qo0.o("Index:", i, ", Size:", this.e));
    }

    @Override // defpackage.i71, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        b();
        Charset charset = d81.a;
        collection.getClass();
        if (!(collection instanceof y71)) {
            return super.addAll(collection);
        }
        y71 y71Var = (y71) collection;
        int i = y71Var.e;
        if (i == 0) {
            return false;
        }
        int i2 = this.e;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.d;
            if (i3 > iArr.length) {
                this.d = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(y71Var.d, 0, this.d, this.e, y71Var.e);
            this.e = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final int c(int i) {
        e(i);
        return this.d[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    public final void d(int i) {
        b();
        int i2 = this.e;
        int length = this.d.length;
        if (i2 == length) {
            int[] iArr = new int[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.d, 0, iArr, 0, this.e);
            this.d = iArr;
        }
        int[] iArr2 = this.d;
        int i3 = this.e;
        this.e = i3 + 1;
        iArr2[i3] = i;
    }

    public final void e(int i) {
        if (i >= 0 && i < this.e) {
            return;
        }
        c.m(qo0.o("Index:", i, ", Size:", this.e));
    }

    @Override // defpackage.i71, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y71)) {
            return super.equals(obj);
        }
        y71 y71Var = (y71) obj;
        if (this.e != y71Var.e) {
            return false;
        }
        int[] iArr = y71Var.d;
        for (int i = 0; i < this.e; i++) {
            if (this.d[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        e(i);
        return Integer.valueOf(this.d[i]);
    }

    @Override // defpackage.i71, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.e; i2++) {
            i = (i * 31) + this.d[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i = this.e;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.d[i2] == intValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.i71, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        b();
        e(i);
        int[] iArr = this.d;
        int i2 = iArr[i];
        if (i < this.e - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (r2 - i) - 1);
        }
        this.e--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        b();
        if (i2 >= i) {
            int[] iArr = this.d;
            System.arraycopy(iArr, i2, iArr, i, this.e - i2);
            this.e -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        c.m("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        b();
        e(i);
        int[] iArr = this.d;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.e;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        d(((Integer) obj).intValue());
        return true;
    }
}
