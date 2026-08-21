package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class r70 implements Cloneable {
    public /* synthetic */ boolean c;
    public /* synthetic */ long[] d;
    public /* synthetic */ Object[] e;
    public /* synthetic */ int f;

    public r70() {
        int i;
        int i2 = 4;
        while (true) {
            i = 80;
            if (i2 >= 32) {
                break;
            }
            int i3 = (1 << i2) - 12;
            if (80 <= i3) {
                i = i3;
                break;
            }
            i2++;
        }
        int i4 = i / 8;
        this.d = new long[i4];
        this.e = new Object[i4];
    }

    public final void a() {
        int i = this.f;
        Object[] objArr = this.e;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f = 0;
        this.c = false;
    }

    public final Object b(long j) {
        Object obj;
        int l = wv0.l(this.d, this.f, j);
        if (l >= 0 && (obj = this.e[l]) != wv0.k) {
            return obj;
        }
        return null;
    }

    public final long c(int i) {
        int i2;
        if (i >= 0 && i < (i2 = this.f)) {
            if (this.c) {
                long[] jArr = this.d;
                Object[] objArr = this.e;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    Object obj = objArr[i4];
                    if (obj != wv0.k) {
                        if (i4 != i3) {
                            jArr[i3] = jArr[i4];
                            objArr[i3] = obj;
                            objArr[i4] = null;
                        }
                        i3++;
                    }
                }
                this.c = false;
                this.f = i3;
            }
            return this.d[i];
        }
        f40.b(qo0.m("Expected index to be within 0..size()-1, but was ", i));
        return 0L;
    }

    public final Object clone() {
        Object clone = super.clone();
        clone.getClass();
        r70 r70Var = (r70) clone;
        r70Var.d = (long[]) this.d.clone();
        r70Var.e = (Object[]) this.e.clone();
        return r70Var;
    }

    public final void d(long j, Object obj) {
        Object obj2 = wv0.k;
        int l = wv0.l(this.d, this.f, j);
        if (l >= 0) {
            this.e[l] = obj;
            return;
        }
        int i = ~l;
        int i2 = this.f;
        if (i < i2) {
            Object[] objArr = this.e;
            if (objArr[i] == obj2) {
                this.d[i] = j;
                objArr[i] = obj;
                return;
            }
        }
        if (this.c) {
            long[] jArr = this.d;
            if (i2 >= jArr.length) {
                Object[] objArr2 = this.e;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    Object obj3 = objArr2[i4];
                    if (obj3 != obj2) {
                        if (i4 != i3) {
                            jArr[i3] = jArr[i4];
                            objArr2[i3] = obj3;
                            objArr2[i4] = null;
                        }
                        i3++;
                    }
                }
                this.c = false;
                this.f = i3;
                i = ~wv0.l(this.d, i3, j);
            }
        }
        int i5 = this.f;
        if (i5 >= this.d.length) {
            int i6 = (i5 + 1) * 8;
            int i7 = 4;
            while (true) {
                if (i7 >= 32) {
                    break;
                }
                int i8 = (1 << i7) - 12;
                if (i6 <= i8) {
                    i6 = i8;
                    break;
                }
                i7++;
            }
            int i9 = i6 / 8;
            this.d = Arrays.copyOf(this.d, i9);
            this.e = Arrays.copyOf(this.e, i9);
        }
        int i10 = this.f - i;
        if (i10 != 0) {
            long[] jArr2 = this.d;
            int i11 = i + 1;
            jArr2.getClass();
            System.arraycopy(jArr2, i, jArr2, i11, i10);
            Object[] objArr3 = this.e;
            s8.v0(objArr3, objArr3, i11, i, this.f);
        }
        this.d[i] = j;
        this.e[i] = obj;
        this.f++;
    }

    public final int e() {
        if (this.c) {
            int i = this.f;
            long[] jArr = this.d;
            Object[] objArr = this.e;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != wv0.k) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.c = false;
            this.f = i2;
        }
        return this.f;
    }

    public final Object f(int i) {
        int i2;
        if (i >= 0 && i < (i2 = this.f)) {
            if (this.c) {
                long[] jArr = this.d;
                Object[] objArr = this.e;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    Object obj = objArr[i4];
                    if (obj != wv0.k) {
                        if (i4 != i3) {
                            jArr[i3] = jArr[i4];
                            objArr[i3] = obj;
                            objArr[i4] = null;
                        }
                        i3++;
                    }
                }
                this.c = false;
                this.f = i3;
            }
            return this.e[i];
        }
        f40.b(qo0.m("Expected index to be within 0..size()-1, but was ", i));
        return null;
    }

    public final String toString() {
        if (e() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f * 28);
        sb.append('{');
        int i = this.f;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(c(i2));
            sb.append('=');
            Object f = f(i2);
            if (f != sb) {
                sb.append(f);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
