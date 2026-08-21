package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class x81 {
    public static final x81 f = new x81(0, new int[0], new Object[0], false);
    public int a;
    public int[] b;
    public Object[] c;
    public int d = -1;
    public boolean e;

    public x81(int i, int[] iArr, Object[] objArr, boolean z) {
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }

    public static x81 b() {
        return new x81(0, new int[8], new Object[8], true);
    }

    public final int a() {
        int n;
        int o;
        int n2;
        int i = this.d;
        if (i == -1) {
            int i2 = 0;
            for (int i3 = 0; i3 < this.a; i3++) {
                int i4 = this.b[i3];
                int i5 = i4 >>> 3;
                int i6 = i4 & 7;
                if (i6 != 0) {
                    if (i6 != 1) {
                        if (i6 != 2) {
                            if (i6 != 3) {
                                if (i6 == 5) {
                                    ((Integer) this.c[i3]).getClass();
                                    n2 = p71.n(i5 << 3) + 4;
                                } else {
                                    throw new IllegalStateException(new e81());
                                }
                            } else {
                                int n3 = p71.n(i5 << 3);
                                n = n3 + n3;
                                o = ((x81) this.c[i3]).a();
                            }
                        } else {
                            int i7 = i5 << 3;
                            n71 n71Var = (n71) this.c[i3];
                            int n4 = p71.n(i7);
                            int e = n71Var.e();
                            i2 = qo0.j(e, e, n4, i2);
                        }
                    } else {
                        ((Long) this.c[i3]).getClass();
                        n2 = p71.n(i5 << 3) + 8;
                    }
                    i2 = n2 + i2;
                } else {
                    int i8 = i5 << 3;
                    long longValue = ((Long) this.c[i3]).longValue();
                    n = p71.n(i8);
                    o = p71.o(longValue);
                }
                i2 = o + n + i2;
            }
            this.d = i2;
            return i2;
        }
        return i;
    }

    public final void c(int i, Object obj) {
        if (this.e) {
            e(this.a + 1);
            int[] iArr = this.b;
            int i2 = this.a;
            iArr[i2] = i;
            this.c[i2] = obj;
            this.a = i2 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final void d(sb0 sb0Var) {
        p71 p71Var = (p71) sb0Var.c;
        if (this.a != 0) {
            for (int i = 0; i < this.a; i++) {
                int i2 = this.b[i];
                Object obj = this.c[i];
                int i3 = i2 & 7;
                int i4 = i2 >>> 3;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                if (i3 == 5) {
                                    p71Var.c(i4, ((Integer) obj).intValue());
                                } else {
                                    throw new RuntimeException(new e81());
                                }
                            } else {
                                p71Var.i(i4, 3);
                                ((x81) obj).d(sb0Var);
                                p71Var.i(i4, 4);
                            }
                        } else {
                            n71 n71Var = (n71) obj;
                            p71Var.k((i4 << 3) | 2);
                            p71Var.k(n71Var.e());
                            n71Var.g(p71Var);
                        }
                    } else {
                        p71Var.e(i4, ((Long) obj).longValue());
                    }
                } else {
                    p71Var.l(i4, ((Long) obj).longValue());
                }
            }
        }
    }

    public final void e(int i) {
        int[] iArr = this.b;
        if (i > iArr.length) {
            int i2 = this.a;
            int i3 = (i2 / 2) + i2;
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.b = Arrays.copyOf(iArr, i);
            this.c = Arrays.copyOf(this.c, i);
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof x81)) {
                x81 x81Var = (x81) obj;
                int i = this.a;
                if (i == x81Var.a) {
                    int[] iArr = this.b;
                    int[] iArr2 = x81Var.b;
                    int i2 = 0;
                    while (true) {
                        if (i2 < i) {
                            if (iArr[i2] != iArr2[i2]) {
                                break;
                            }
                            i2++;
                        } else {
                            Object[] objArr = this.c;
                            Object[] objArr2 = x81Var.c;
                            int i3 = this.a;
                            for (int i4 = 0; i4 < i3; i4++) {
                                if (objArr[i4].equals(objArr2[i4])) {
                                }
                            }
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.a;
        int i2 = i + 527;
        int[] iArr = this.b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = ((i2 * 31) + i4) * 31;
        Object[] objArr = this.c;
        int i7 = this.a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }
}
