package defpackage;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public class io0 {
    public int[] c;
    public Object[] d;
    public int e;

    public io0(int i) {
        int[] iArr;
        Object[] objArr;
        if (i == 0) {
            iArr = wv0.g;
        } else {
            iArr = new int[i];
        }
        this.c = iArr;
        if (i == 0) {
            objArr = wv0.h;
        } else {
            objArr = new Object[i << 1];
        }
        this.d = objArr;
    }

    public final int a(Object obj) {
        int i = this.e * 2;
        Object[] objArr = this.d;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public final void b(int i) {
        int i2 = this.e;
        int[] iArr = this.c;
        if (iArr.length < i) {
            this.c = Arrays.copyOf(iArr, i);
            this.d = Arrays.copyOf(this.d, i * 2);
        }
        if (this.e == i2) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    public final int c(int i, Object obj) {
        int i2 = this.e;
        if (i2 == 0) {
            return -1;
        }
        int k = wv0.k(i2, i, this.c);
        if (k < 0 || k20.c(obj, this.d[k << 1])) {
            return k;
        }
        int i3 = k + 1;
        while (i3 < i2 && this.c[i3] == i) {
            if (k20.c(obj, this.d[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = k - 1; i4 >= 0 && this.c[i4] == i; i4--) {
            if (k20.c(obj, this.d[i4 << 1])) {
                return i4;
            }
        }
        return ~i3;
    }

    public final void clear() {
        if (this.e > 0) {
            this.c = wv0.g;
            this.d = wv0.h;
            this.e = 0;
        }
        if (this.e <= 0) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        if (d(obj) >= 0) {
            return true;
        }
        return false;
    }

    public boolean containsValue(Object obj) {
        if (a(obj) >= 0) {
            return true;
        }
        return false;
    }

    public final int d(Object obj) {
        if (obj == null) {
            return e();
        }
        return c(obj.hashCode(), obj);
    }

    public final int e() {
        int i = this.e;
        if (i == 0) {
            return -1;
        }
        int k = wv0.k(i, 0, this.c);
        if (k < 0 || this.d[k << 1] == null) {
            return k;
        }
        int i2 = k + 1;
        while (i2 < i && this.c[i2] == 0) {
            if (this.d[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = k - 1; i3 >= 0 && this.c[i3] == 0; i3--) {
            if (this.d[i3 << 1] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof io0) {
                int i = this.e;
                if (i != ((io0) obj).e) {
                    return false;
                }
                io0 io0Var = (io0) obj;
                for (int i2 = 0; i2 < i; i2++) {
                    Object f = f(i2);
                    Object i3 = i(i2);
                    Object obj2 = io0Var.get(f);
                    if (i3 == null) {
                        if (obj2 != null || !io0Var.containsKey(f)) {
                            return false;
                        }
                    } else if (!i3.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.e != ((Map) obj).size()) {
                return false;
            }
            int i4 = this.e;
            for (int i5 = 0; i5 < i4; i5++) {
                Object f2 = f(i5);
                Object i6 = i(i5);
                Object obj3 = ((Map) obj).get(f2);
                if (i6 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(f2)) {
                        return false;
                    }
                } else if (!i6.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final Object f(int i) {
        if (i >= 0 && i < this.e) {
            return this.d[i << 1];
        }
        f40.b(qo0.m("Expected index to be within 0..size()-1, but was ", i));
        return null;
    }

    public final Object g(int i) {
        int i2;
        if (i >= 0 && i < (i2 = this.e)) {
            Object[] objArr = this.d;
            int i3 = i << 1;
            Object obj = objArr[i3 + 1];
            if (i2 <= 1) {
                clear();
                return obj;
            }
            int i4 = i2 - 1;
            int[] iArr = this.c;
            int i5 = 8;
            if (iArr.length > 8 && i2 < iArr.length / 3) {
                if (i2 > 8) {
                    i5 = i2 + (i2 >> 1);
                }
                this.c = Arrays.copyOf(iArr, i5);
                this.d = Arrays.copyOf(this.d, i5 << 1);
                if (i2 == this.e) {
                    if (i > 0) {
                        s8.u0(0, 0, i, iArr, this.c);
                        s8.v0(objArr, this.d, 0, 0, i3);
                    }
                    if (i < i4) {
                        int i6 = i + 1;
                        s8.u0(i, i6, i2, iArr, this.c);
                        s8.v0(objArr, this.d, i3, i6 << 1, i2 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            } else {
                if (i < i4) {
                    int i7 = i + 1;
                    s8.u0(i, i7, i2, iArr, iArr);
                    Object[] objArr2 = this.d;
                    s8.v0(objArr2, objArr2, i3, i7 << 1, i2 << 1);
                }
                Object[] objArr3 = this.d;
                int i8 = i4 << 1;
                objArr3[i8] = null;
                objArr3[i8 + 1] = null;
            }
            if (i2 == this.e) {
                this.e = i4;
                return obj;
            }
            throw new ConcurrentModificationException();
        }
        f40.b(qo0.m("Expected index to be within 0..size()-1, but was ", i));
        return null;
    }

    public Object get(Object obj) {
        int d = d(obj);
        if (d >= 0) {
            return this.d[(d << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int d = d(obj);
        if (d >= 0) {
            return this.d[(d << 1) + 1];
        }
        return obj2;
    }

    public final Object h(int i, Object obj) {
        if (i >= 0 && i < this.e) {
            int i2 = (i << 1) + 1;
            Object[] objArr = this.d;
            Object obj2 = objArr[i2];
            objArr[i2] = obj;
            return obj2;
        }
        f40.b(qo0.m("Expected index to be within 0..size()-1, but was ", i));
        return null;
    }

    public final int hashCode() {
        int i;
        int[] iArr = this.c;
        Object[] objArr = this.d;
        int i2 = this.e;
        int i3 = 1;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            Object obj = objArr[i3];
            int i6 = iArr[i4];
            if (obj != null) {
                i = obj.hashCode();
            } else {
                i = 0;
            }
            i5 += i ^ i6;
            i4++;
            i3 += 2;
        }
        return i5;
    }

    public final Object i(int i) {
        if (i >= 0 && i < this.e) {
            return this.d[(i << 1) + 1];
        }
        f40.b(qo0.m("Expected index to be within 0..size()-1, but was ", i));
        return null;
    }

    public final boolean isEmpty() {
        if (this.e <= 0) {
            return true;
        }
        return false;
    }

    public final Object put(Object obj, Object obj2) {
        int i;
        int e;
        int i2 = this.e;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        if (obj != null) {
            e = c(i, obj);
        } else {
            e = e();
        }
        if (e >= 0) {
            int i3 = (e << 1) + 1;
            Object[] objArr = this.d;
            Object obj3 = objArr[i3];
            objArr[i3] = obj2;
            return obj3;
        }
        int i4 = ~e;
        int[] iArr = this.c;
        if (i2 >= iArr.length) {
            int i5 = 8;
            if (i2 >= 8) {
                i5 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i5 = 4;
            }
            this.c = Arrays.copyOf(iArr, i5);
            this.d = Arrays.copyOf(this.d, i5 << 1);
            if (i2 != this.e) {
                throw new ConcurrentModificationException();
            }
        }
        if (i4 < i2) {
            int[] iArr2 = this.c;
            int i6 = i4 + 1;
            s8.u0(i6, i4, i2, iArr2, iArr2);
            Object[] objArr2 = this.d;
            s8.v0(objArr2, objArr2, i6 << 1, i4 << 1, this.e << 1);
        }
        int i7 = this.e;
        if (i2 == i7) {
            int[] iArr3 = this.c;
            if (i4 < iArr3.length) {
                iArr3[i4] = i;
                Object[] objArr3 = this.d;
                int i8 = i4 << 1;
                objArr3[i8] = obj;
                objArr3[i8 + 1] = obj2;
                this.e = i7 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        if (obj3 == null) {
            return put(obj, obj2);
        }
        return obj3;
    }

    public final boolean remove(Object obj, Object obj2) {
        int d = d(obj);
        if (d >= 0 && k20.c(obj2, i(d))) {
            g(d);
            return true;
        }
        return false;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int d = d(obj);
        if (d >= 0 && k20.c(obj2, i(d))) {
            h(d, obj3);
            return true;
        }
        return false;
    }

    public final int size() {
        return this.e;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.e * 28);
        sb.append('{');
        int i = this.e;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object f = f(i2);
            if (f != sb) {
                sb.append(f);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object i3 = i(i2);
            if (i3 != sb) {
                sb.append(i3);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public Object remove(Object obj) {
        int d = d(obj);
        if (d >= 0) {
            return g(d);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int d = d(obj);
        if (d >= 0) {
            return h(d, obj2);
        }
        return null;
    }
}
