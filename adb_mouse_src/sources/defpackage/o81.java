package defpackage;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class o81 implements u81 {
    public static final int[] j = new int[0];
    public static final Unsafe k = c91.i();
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final h71 e;
    public final int[] f;
    public final int g;
    public final int h;
    public final g00 i;

    public o81(int[] iArr, Object[] objArr, int i, int i2, h71 h71Var, int[] iArr2, int i3, int i4, g00 g00Var, vj0 vj0Var) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.f = iArr2;
        this.g = i3;
        this.h = i4;
        this.i = g00Var;
        this.e = h71Var;
    }

    public static Field E(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields), e);
        }
    }

    public static boolean r(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof x71) {
            return ((x71) obj).h();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0277  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.o81 u(defpackage.t81 r35, defpackage.g00 r36, defpackage.vj0 r37) {
        /*
            Method dump skipped, instructions count: 1050
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o81.u(t81, g00, vj0):o81");
    }

    public static int v(long j2, Object obj) {
        return ((Integer) c91.h(j2, obj)).intValue();
    }

    public static int x(int i) {
        return (i >>> 20) & 255;
    }

    public static long z(long j2, Object obj) {
        return ((Long) c91.h(j2, obj)).longValue();
    }

    public final g71 A(int i) {
        int i2 = i / 3;
        return (g71) this.b[i2 + i2 + 1];
    }

    public final u81 B(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        Object[] objArr = this.b;
        u81 u81Var = (u81) objArr[i3];
        if (u81Var != null) {
            return u81Var;
        }
        u81 a = r81.c.a((Class) objArr[i3 + 1]);
        objArr[i3] = a;
        return a;
    }

    public final Object C(int i, Object obj) {
        u81 B = B(i);
        int y = y(i) & 1048575;
        if (!p(i, obj)) {
            return B.c();
        }
        Object object = k.getObject(obj, y);
        if (r(object)) {
            return object;
        }
        x71 c = B.c();
        if (object != null) {
            B.b(c, object);
        }
        return c;
    }

    public final Object D(int i, int i2, Object obj) {
        u81 B = B(i2);
        if (!s(i, i2, obj)) {
            return B.c();
        }
        Object object = k.getObject(obj, y(i2) & 1048575);
        if (r(object)) {
            return object;
        }
        x71 c = B.c();
        if (object != null) {
            B.b(c, object);
        }
        return c;
    }

    @Override // defpackage.u81
    public final void a(Object obj) {
        if (r(obj)) {
            if (obj instanceof x71) {
                x71 x71Var = (x71) obj;
                x71Var.g();
                x71Var.zza = 0;
                x71Var.e();
            }
            int i = 0;
            while (true) {
                int[] iArr = this.a;
                if (i < iArr.length) {
                    int y = y(i);
                    int i2 = 1048575 & y;
                    int x = x(y);
                    long j2 = i2;
                    if (x != 9) {
                        if (x != 60 && x != 68) {
                            switch (x) {
                                case 18:
                                case 19:
                                case 20:
                                case 21:
                                case 22:
                                case 23:
                                case 24:
                                case 25:
                                case 26:
                                case 27:
                                case 28:
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                case 33:
                                case 34:
                                case 35:
                                case 36:
                                case 37:
                                case 38:
                                case 39:
                                case 40:
                                case 41:
                                case 42:
                                case 43:
                                case 44:
                                case 45:
                                case 46:
                                case 47:
                                case 48:
                                case 49:
                                    i71 i71Var = (i71) ((a81) c91.h(j2, obj));
                                    if (!i71Var.c) {
                                        break;
                                    } else {
                                        i71Var.c = false;
                                        break;
                                    }
                                case 50:
                                    Unsafe unsafe = k;
                                    Object object = unsafe.getObject(obj, j2);
                                    if (object == null) {
                                        break;
                                    } else {
                                        ((j81) object).c = false;
                                        unsafe.putObject(obj, j2, object);
                                        break;
                                    }
                            }
                        } else if (s(iArr[i], i, obj)) {
                            B(i).a(k.getObject(obj, j2));
                        }
                        i += 3;
                    }
                    if (p(i, obj)) {
                        B(i).a(k.getObject(obj, j2));
                    }
                    i += 3;
                } else {
                    this.i.getClass();
                    x81 x81Var = ((x71) obj).zzc;
                    if (x81Var.e) {
                        x81Var.e = false;
                        return;
                    }
                    return;
                }
            }
        }
    }

    @Override // defpackage.u81
    public final void b(Object obj, Object obj2) {
        Object obj3;
        if (r(obj)) {
            obj2.getClass();
            int i = 0;
            while (true) {
                int[] iArr = this.a;
                if (i < iArr.length) {
                    int y = y(i);
                    int i2 = y & 1048575;
                    int x = x(y);
                    int i3 = iArr[i];
                    long j2 = i2;
                    switch (x) {
                        case 0:
                            if (p(i, obj2)) {
                                b91 b91Var = c91.c;
                                obj3 = obj;
                                b91Var.i(obj3, j2, b91Var.e(j2, obj2));
                                l(i, obj3);
                                break;
                            }
                            break;
                        case 1:
                            if (p(i, obj2)) {
                                b91 b91Var2 = c91.c;
                                b91Var2.j(obj, j2, b91Var2.f(j2, obj2));
                                l(i, obj);
                                break;
                            }
                            break;
                        case 2:
                            if (p(i, obj2)) {
                                c91.k(obj, j2, c91.f(j2, obj2));
                                l(i, obj);
                                break;
                            }
                            break;
                        case 3:
                            if (p(i, obj2)) {
                                c91.k(obj, j2, c91.f(j2, obj2));
                                l(i, obj);
                                break;
                            }
                            break;
                        case 4:
                            if (p(i, obj2)) {
                                c91.j(obj, j2, c91.e(j2, obj2));
                                l(i, obj);
                                break;
                            }
                            break;
                        case 5:
                            if (p(i, obj2)) {
                                c91.k(obj, j2, c91.f(j2, obj2));
                                l(i, obj);
                                break;
                            }
                            break;
                        case 6:
                            if (p(i, obj2)) {
                                c91.j(obj, j2, c91.e(j2, obj2));
                                l(i, obj);
                                break;
                            }
                            break;
                        case 7:
                            if (p(i, obj2)) {
                                b91 b91Var3 = c91.c;
                                b91Var3.g(obj, j2, b91Var3.k(j2, obj2));
                                l(i, obj);
                                break;
                            }
                            break;
                        case 8:
                            if (p(i, obj2)) {
                                c91.l(j2, obj, c91.h(j2, obj2));
                                l(i, obj);
                                break;
                            }
                            break;
                        case 9:
                            j(obj, i, obj2);
                            break;
                        case 10:
                            if (p(i, obj2)) {
                                c91.l(j2, obj, c91.h(j2, obj2));
                                l(i, obj);
                                break;
                            }
                            break;
                        case 11:
                            if (p(i, obj2)) {
                                c91.j(obj, j2, c91.e(j2, obj2));
                                l(i, obj);
                                break;
                            }
                            break;
                        case 12:
                            if (p(i, obj2)) {
                                c91.j(obj, j2, c91.e(j2, obj2));
                                l(i, obj);
                                break;
                            }
                            break;
                        case 13:
                            if (p(i, obj2)) {
                                c91.j(obj, j2, c91.e(j2, obj2));
                                l(i, obj);
                                break;
                            }
                            break;
                        case 14:
                            if (p(i, obj2)) {
                                c91.k(obj, j2, c91.f(j2, obj2));
                                l(i, obj);
                                break;
                            }
                            break;
                        case 15:
                            if (p(i, obj2)) {
                                c91.j(obj, j2, c91.e(j2, obj2));
                                l(i, obj);
                                break;
                            }
                            break;
                        case 16:
                            if (p(i, obj2)) {
                                c91.k(obj, j2, c91.f(j2, obj2));
                                l(i, obj);
                                break;
                            }
                            break;
                        case 17:
                            j(obj, i, obj2);
                            break;
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                            a81 a81Var = (a81) c91.h(j2, obj);
                            a81 a81Var2 = (a81) c91.h(j2, obj2);
                            int size = a81Var.size();
                            int size2 = a81Var2.size();
                            if (size > 0 && size2 > 0) {
                                if (!((i71) a81Var).c) {
                                    a81Var = a81Var.a(size2 + size);
                                }
                                a81Var.addAll(a81Var2);
                            }
                            if (size > 0) {
                                a81Var2 = a81Var;
                            }
                            c91.l(j2, obj, a81Var2);
                            break;
                        case 50:
                            g00 g00Var = v81.a;
                            c91.l(j2, obj, vj0.i(c91.h(j2, obj), c91.h(j2, obj2)));
                            break;
                        case 51:
                        case 52:
                        case 53:
                        case 54:
                        case 55:
                        case 56:
                        case 57:
                        case 58:
                        case 59:
                            if (s(i3, i, obj2)) {
                                c91.l(j2, obj, c91.h(j2, obj2));
                                c91.j(obj, iArr[i + 2] & 1048575, i3);
                                break;
                            }
                            break;
                        case 60:
                            k(obj, i, obj2);
                            break;
                        case 61:
                        case 62:
                        case 63:
                        case 64:
                        case 65:
                        case 66:
                        case 67:
                            if (s(i3, i, obj2)) {
                                c91.l(j2, obj, c91.h(j2, obj2));
                                c91.j(obj, iArr[i + 2] & 1048575, i3);
                                break;
                            }
                            break;
                        case 68:
                            k(obj, i, obj2);
                            break;
                    }
                    obj3 = obj;
                    i += 3;
                    obj = obj3;
                } else {
                    v81.p(obj, obj2);
                    return;
                }
            }
        } else {
            c.k("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    @Override // defpackage.u81
    public final x71 c() {
        return ((x71) this.e).n();
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x01ea, code lost:
    
        if (r2 != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d9, code lost:
    
        if (r2 != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00db, code lost:
    
        r6 = 1231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00dc, code lost:
    
        r1 = r6 + r1;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x001e. Please report as an issue. */
    @Override // defpackage.u81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int d(defpackage.x71 r11) {
        /*
            Method dump skipped, instructions count: 726
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o81.d(x71):int");
    }

    @Override // defpackage.u81
    public final void e(Object obj, byte[] bArr, int i, int i2, k71 k71Var) {
        t(obj, bArr, i, i2, 0, k71Var);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0015. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01d5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01c7 A[SYNTHETIC] */
    @Override // defpackage.u81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f(defpackage.x71 r8, defpackage.x71 r9) {
        /*
            Method dump skipped, instructions count: 614
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o81.f(x71, x71):boolean");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:16:0x004e. Please report as an issue. */
    @Override // defpackage.u81
    public final int g(h71 h71Var) {
        int i;
        int n;
        int o;
        int n2;
        int b;
        int n3;
        int c;
        int i2;
        int n4;
        int i3;
        int i4;
        int c2;
        int n5;
        int size;
        int o2;
        int n6;
        int n7;
        int b2;
        int n8;
        int size2;
        int n9;
        int i5;
        int n10;
        int o3;
        int n11;
        int b3;
        int v;
        int n12;
        o81 o81Var = this;
        h71 h71Var2 = h71Var;
        Unsafe unsafe = k;
        int i6 = 1048575;
        int i7 = 1048575;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            int[] iArr = o81Var.a;
            if (i8 < iArr.length) {
                int y = o81Var.y(i8);
                int x = x(y);
                int i11 = iArr[i8];
                int i12 = iArr[i8 + 2];
                int i13 = i12 & i6;
                if (x <= 17) {
                    if (i13 != i7) {
                        if (i13 == i6) {
                            i9 = 0;
                        } else {
                            i9 = unsafe.getInt(h71Var2, i13);
                        }
                        i7 = i13;
                    }
                    i = 1 << (i12 >>> 20);
                } else {
                    i = 0;
                }
                int i14 = y & i6;
                if (x >= v71.d.c) {
                    v71.e.getClass();
                }
                long j2 = i14;
                switch (x) {
                    case 0:
                        if (!o81Var.q(h71Var2, i8, i7, i9, i)) {
                            i8 += 3;
                            o81Var = this;
                            h71Var2 = h71Var;
                            i6 = 1048575;
                        }
                        i10 = qo0.i(i11 << 3, 8, i10);
                        i8 += 3;
                        o81Var = this;
                        h71Var2 = h71Var;
                        i6 = 1048575;
                    case 1:
                        if (!o81Var.q(h71Var2, i8, i7, i9, i)) {
                            i8 += 3;
                            o81Var = this;
                            h71Var2 = h71Var;
                            i6 = 1048575;
                        }
                        i10 = qo0.i(i11 << 3, 4, i10);
                        i8 += 3;
                        o81Var = this;
                        h71Var2 = h71Var;
                        i6 = 1048575;
                    case 2:
                        if (o81Var.q(h71Var2, i8, i7, i9, i)) {
                            long j3 = unsafe.getLong(h71Var2, j2);
                            n = p71.n(i11 << 3);
                            o = p71.o(j3);
                            i3 = o + n;
                            i10 += i3;
                            i8 += 3;
                            o81Var = this;
                            h71Var2 = h71Var;
                            i6 = 1048575;
                        } else {
                            i8 += 3;
                            o81Var = this;
                            h71Var2 = h71Var;
                            i6 = 1048575;
                        }
                    case 3:
                        if (o81Var.q(h71Var2, i8, i7, i9, i)) {
                            long j4 = unsafe.getLong(h71Var2, j2);
                            n = p71.n(i11 << 3);
                            o = p71.o(j4);
                            i3 = o + n;
                            i10 += i3;
                            i8 += 3;
                            o81Var = this;
                            h71Var2 = h71Var;
                            i6 = 1048575;
                        } else {
                            i8 += 3;
                            o81Var = this;
                            h71Var2 = h71Var;
                            i6 = 1048575;
                        }
                    case 4:
                        if (o81Var.q(h71Var2, i8, i7, i9, i)) {
                            long j5 = unsafe.getInt(h71Var2, j2);
                            n = p71.n(i11 << 3);
                            o = p71.o(j5);
                            i3 = o + n;
                            i10 += i3;
                            i8 += 3;
                            o81Var = this;
                            h71Var2 = h71Var;
                            i6 = 1048575;
                        } else {
                            i8 += 3;
                            o81Var = this;
                            h71Var2 = h71Var;
                            i6 = 1048575;
                        }
                    case 5:
                        if (!o81Var.q(h71Var2, i8, i7, i9, i)) {
                            i8 += 3;
                            o81Var = this;
                            h71Var2 = h71Var;
                            i6 = 1048575;
                        }
                        i10 = qo0.i(i11 << 3, 8, i10);
                        i8 += 3;
                        o81Var = this;
                        h71Var2 = h71Var;
                        i6 = 1048575;
                    case 6:
                        if (!o81Var.q(h71Var2, i8, i7, i9, i)) {
                            i8 += 3;
                            o81Var = this;
                            h71Var2 = h71Var;
                            i6 = 1048575;
                        }
                        i10 = qo0.i(i11 << 3, 4, i10);
                        i8 += 3;
                        o81Var = this;
                        h71Var2 = h71Var;
                        i6 = 1048575;
                    case 7:
                        if (o81Var.q(h71Var2, i8, i7, i9, i)) {
                            i10 = qo0.i(i11 << 3, 1, i10);
                        }
                        i8 += 3;
                        o81Var = this;
                        h71Var2 = h71Var;
                        i6 = 1048575;
                    case 8:
                        if (o81Var.q(h71Var2, i8, i7, i9, i)) {
                            int i15 = i11 << 3;
                            Object object = unsafe.getObject(h71Var2, j2);
                            if (object instanceof n71) {
                                n2 = p71.n(i15);
                                b = ((n71) object).e();
                            } else {
                                n2 = p71.n(i15);
                                b = e91.b((String) object);
                            }
                            i10 = qo0.j(b, b, n2, i10);
                            i8 += 3;
                            o81Var = this;
                            h71Var2 = h71Var;
                            i6 = 1048575;
                        } else {
                            i8 += 3;
                            o81Var = this;
                            h71Var2 = h71Var;
                            i6 = 1048575;
                        }
                    case 9:
                        if (o81Var.q(h71Var2, i8, i7, i9, i)) {
                            Object object2 = unsafe.getObject(h71Var2, j2);
                            u81 B = o81Var.B(i8);
                            g00 g00Var = v81.a;
                            n3 = p71.n(i11 << 3);
                            c = ((h71) object2).c(B);
                            i10 = qo0.j(c, c, n3, i10);
                            i8 += 3;
                            o81Var = this;
                            h71Var2 = h71Var;
                            i6 = 1048575;
                        } else {
                            i8 += 3;
                            o81Var = this;
                            h71Var2 = h71Var;
                            i6 = 1048575;
                        }
                    case 10:
                        if (o81Var.q(h71Var2, i8, i7, i9, i)) {
                            n71 n71Var = (n71) unsafe.getObject(h71Var2, j2);
                            n2 = p71.n(i11 << 3);
                            b = n71Var.e();
                            i10 = qo0.j(b, b, n2, i10);
                            i8 += 3;
                            o81Var = this;
                            h71Var2 = h71Var;
                            i6 = 1048575;
                        } else {
                            i8 += 3;
                            o81Var = this;
                            h71Var2 = h71Var;
                            i6 = 1048575;
                        }
                    case 11:
                        if (o81Var.q(h71Var2, i8, i7, i9, i)) {
                            i2 = unsafe.getInt(h71Var2, j2);
                            n4 = p71.n(i11 << 3);
                            i10 = qo0.i(i2, n4, i10);
                            i8 += 3;
                            o81Var = this;
                            h71Var2 = h71Var;
                            i6 = 1048575;
                        } else {
                            i8 += 3;
                            o81Var = this;
                            h71Var2 = h71Var;
                            i6 = 1048575;
                        }
                    case 12:
                        if (o81Var.q(h71Var2, i8, i7, i9, i)) {
                            long j6 = unsafe.getInt(h71Var2, j2);
                            n = p71.n(i11 << 3);
                            o = p71.o(j6);
                            i3 = o + n;
                            i10 += i3;
                            i8 += 3;
                            o81Var = this;
                            h71Var2 = h71Var;
                            i6 = 1048575;
                        } else {
                            i8 += 3;
                            o81Var = this;
                            h71Var2 = h71Var;
                            i6 = 1048575;
                        }
                    case 13:
                        if (!o81Var.q(h71Var2, i8, i7, i9, i)) {
                            i8 += 3;
                            o81Var = this;
                            h71Var2 = h71Var;
                            i6 = 1048575;
                        }
                        i10 = qo0.i(i11 << 3, 4, i10);
                        i8 += 3;
                        o81Var = this;
                        h71Var2 = h71Var;
                        i6 = 1048575;
                    case 14:
                        if (!o81Var.q(h71Var2, i8, i7, i9, i)) {
                            i8 += 3;
                            o81Var = this;
                            h71Var2 = h71Var;
                            i6 = 1048575;
                        }
                        i10 = qo0.i(i11 << 3, 8, i10);
                        i8 += 3;
                        o81Var = this;
                        h71Var2 = h71Var;
                        i6 = 1048575;
                    case 15:
                        if (o81Var.q(h71Var2, i8, i7, i9, i)) {
                            int i16 = unsafe.getInt(h71Var2, j2);
                            n4 = p71.n(i11 << 3);
                            i2 = (i16 >> 31) ^ (i16 + i16);
                            i10 = qo0.i(i2, n4, i10);
                            i8 += 3;
                            o81Var = this;
                            h71Var2 = h71Var;
                            i6 = 1048575;
                        } else {
                            i8 += 3;
                            o81Var = this;
                            h71Var2 = h71Var;
                            i6 = 1048575;
                        }
                    case 16:
                        if (o81Var.q(h71Var2, i8, i7, i9, i)) {
                            long j7 = unsafe.getLong(h71Var2, j2);
                            n = p71.n(i11 << 3);
                            o = p71.o((j7 >> 63) ^ (j7 + j7));
                            i3 = o + n;
                            i10 += i3;
                            i8 += 3;
                            o81Var = this;
                            h71Var2 = h71Var;
                            i6 = 1048575;
                        } else {
                            i8 += 3;
                            o81Var = this;
                            h71Var2 = h71Var;
                            i6 = 1048575;
                        }
                    case 17:
                        if (o81Var.q(h71Var2, i8, i7, i9, i)) {
                            h71 h71Var3 = (h71) unsafe.getObject(h71Var2, j2);
                            u81 B2 = o81Var.B(i8);
                            g00 g00Var2 = v81.a;
                            int n13 = p71.n(i11 << 3);
                            i4 = n13 + n13;
                            c2 = h71Var3.c(B2);
                            i3 = c2 + i4;
                            i10 += i3;
                            i8 += 3;
                            o81Var = this;
                            h71Var2 = h71Var;
                            i6 = 1048575;
                        } else {
                            i8 += 3;
                            o81Var = this;
                            h71Var2 = h71Var;
                            i6 = 1048575;
                        }
                    case 18:
                        i3 = v81.i(i11, (List) unsafe.getObject(h71Var2, j2));
                        i10 += i3;
                        i8 += 3;
                        o81Var = this;
                        h71Var2 = h71Var;
                        i6 = 1048575;
                    case 19:
                        i3 = v81.h(i11, (List) unsafe.getObject(h71Var2, j2));
                        i10 += i3;
                        i8 += 3;
                        o81Var = this;
                        h71Var2 = h71Var;
                        i6 = 1048575;
                    case 20:
                        List list = (List) unsafe.getObject(h71Var2, j2);
                        g00 g00Var3 = v81.a;
                        if (list.size() != 0) {
                            n5 = (p71.n(i11 << 3) * list.size()) + v81.k(list);
                            i10 += n5;
                            i8 += 3;
                            o81Var = this;
                            h71Var2 = h71Var;
                            i6 = 1048575;
                        }
                        n5 = 0;
                        i10 += n5;
                        i8 += 3;
                        o81Var = this;
                        h71Var2 = h71Var;
                        i6 = 1048575;
                    case 21:
                        List list2 = (List) unsafe.getObject(h71Var2, j2);
                        g00 g00Var4 = v81.a;
                        size = list2.size();
                        if (size != 0) {
                            o2 = v81.o(list2);
                            n6 = p71.n(i11 << 3);
                            n7 = (n6 * size) + o2;
                            i10 += n7;
                            i8 += 3;
                            o81Var = this;
                            h71Var2 = h71Var;
                            i6 = 1048575;
                        }
                        n7 = 0;
                        i10 += n7;
                        i8 += 3;
                        o81Var = this;
                        h71Var2 = h71Var;
                        i6 = 1048575;
                    case 22:
                        List list3 = (List) unsafe.getObject(h71Var2, j2);
                        g00 g00Var5 = v81.a;
                        size = list3.size();
                        if (size != 0) {
                            o2 = v81.j(list3);
                            n6 = p71.n(i11 << 3);
                            n7 = (n6 * size) + o2;
                            i10 += n7;
                            i8 += 3;
                            o81Var = this;
                            h71Var2 = h71Var;
                            i6 = 1048575;
                        }
                        n7 = 0;
                        i10 += n7;
                        i8 += 3;
                        o81Var = this;
                        h71Var2 = h71Var;
                        i6 = 1048575;
                    case 23:
                        i3 = v81.i(i11, (List) unsafe.getObject(h71Var2, j2));
                        i10 += i3;
                        i8 += 3;
                        o81Var = this;
                        h71Var2 = h71Var;
                        i6 = 1048575;
                    case 24:
                        i3 = v81.h(i11, (List) unsafe.getObject(h71Var2, j2));
                        i10 += i3;
                        i8 += 3;
                        o81Var = this;
                        h71Var2 = h71Var;
                        i6 = 1048575;
                    case 25:
                        List list4 = (List) unsafe.getObject(h71Var2, j2);
                        g00 g00Var6 = v81.a;
                        int size3 = list4.size();
                        if (size3 != 0) {
                            n5 = (p71.n(i11 << 3) + 1) * size3;
                            i10 += n5;
                            i8 += 3;
                            o81Var = this;
                            h71Var2 = h71Var;
                            i6 = 1048575;
                        }
                        n5 = 0;
                        i10 += n5;
                        i8 += 3;
                        o81Var = this;
                        h71Var2 = h71Var;
                        i6 = 1048575;
                    case 26:
                        List list5 = (List) unsafe.getObject(h71Var2, j2);
                        g00 g00Var7 = v81.a;
                        int size4 = list5.size();
                        if (size4 != 0) {
                            n7 = p71.n(i11 << 3) * size4;
                            for (int i17 = 0; i17 < size4; i17++) {
                                Object obj = list5.get(i17);
                                if (obj instanceof n71) {
                                    b2 = ((n71) obj).e();
                                } else {
                                    b2 = e91.b((String) obj);
                                }
                                n7 = qo0.i(b2, b2, n7);
                            }
                            i10 += n7;
                            i8 += 3;
                            o81Var = this;
                            h71Var2 = h71Var;
                            i6 = 1048575;
                        }
                        n7 = 0;
                        i10 += n7;
                        i8 += 3;
                        o81Var = this;
                        h71Var2 = h71Var;
                        i6 = 1048575;
                    case 27:
                        List list6 = (List) unsafe.getObject(h71Var2, j2);
                        u81 B3 = o81Var.B(i8);
                        g00 g00Var8 = v81.a;
                        int size5 = list6.size();
                        if (size5 == 0) {
                            n8 = 0;
                        } else {
                            n8 = p71.n(i11 << 3) * size5;
                            for (int i18 = 0; i18 < size5; i18++) {
                                int c3 = ((h71) list6.get(i18)).c(B3);
                                n8 = qo0.i(c3, c3, n8);
                            }
                        }
                        i10 += n8;
                        i8 += 3;
                        o81Var = this;
                        h71Var2 = h71Var;
                        i6 = 1048575;
                    case 28:
                        List list7 = (List) unsafe.getObject(h71Var2, j2);
                        g00 g00Var9 = v81.a;
                        int size6 = list7.size();
                        if (size6 != 0) {
                            n7 = p71.n(i11 << 3) * size6;
                            for (int i19 = 0; i19 < list7.size(); i19++) {
                                int e = ((n71) list7.get(i19)).e();
                                n7 = qo0.i(e, e, n7);
                            }
                            i10 += n7;
                            i8 += 3;
                            o81Var = this;
                            h71Var2 = h71Var;
                            i6 = 1048575;
                        }
                        n7 = 0;
                        i10 += n7;
                        i8 += 3;
                        o81Var = this;
                        h71Var2 = h71Var;
                        i6 = 1048575;
                    case 29:
                        List list8 = (List) unsafe.getObject(h71Var2, j2);
                        g00 g00Var10 = v81.a;
                        size = list8.size();
                        if (size != 0) {
                            o2 = v81.n(list8);
                            n6 = p71.n(i11 << 3);
                            n7 = (n6 * size) + o2;
                            i10 += n7;
                            i8 += 3;
                            o81Var = this;
                            h71Var2 = h71Var;
                            i6 = 1048575;
                        }
                        n7 = 0;
                        i10 += n7;
                        i8 += 3;
                        o81Var = this;
                        h71Var2 = h71Var;
                        i6 = 1048575;
                    case 30:
                        List list9 = (List) unsafe.getObject(h71Var2, j2);
                        g00 g00Var11 = v81.a;
                        size = list9.size();
                        if (size != 0) {
                            o2 = v81.g(list9);
                            n6 = p71.n(i11 << 3);
                            n7 = (n6 * size) + o2;
                            i10 += n7;
                            i8 += 3;
                            o81Var = this;
                            h71Var2 = h71Var;
                            i6 = 1048575;
                        }
                        n7 = 0;
                        i10 += n7;
                        i8 += 3;
                        o81Var = this;
                        h71Var2 = h71Var;
                        i6 = 1048575;
                    case 31:
                        i3 = v81.h(i11, (List) unsafe.getObject(h71Var2, j2));
                        i10 += i3;
                        i8 += 3;
                        o81Var = this;
                        h71Var2 = h71Var;
                        i6 = 1048575;
                    case 32:
                        i3 = v81.i(i11, (List) unsafe.getObject(h71Var2, j2));
                        i10 += i3;
                        i8 += 3;
                        o81Var = this;
                        h71Var2 = h71Var;
                        i6 = 1048575;
                    case 33:
                        List list10 = (List) unsafe.getObject(h71Var2, j2);
                        g00 g00Var12 = v81.a;
                        size = list10.size();
                        if (size != 0) {
                            o2 = v81.l(list10);
                            n6 = p71.n(i11 << 3);
                            n7 = (n6 * size) + o2;
                            i10 += n7;
                            i8 += 3;
                            o81Var = this;
                            h71Var2 = h71Var;
                            i6 = 1048575;
                        }
                        n7 = 0;
                        i10 += n7;
                        i8 += 3;
                        o81Var = this;
                        h71Var2 = h71Var;
                        i6 = 1048575;
                    case 34:
                        List list11 = (List) unsafe.getObject(h71Var2, j2);
                        g00 g00Var13 = v81.a;
                        size = list11.size();
                        if (size != 0) {
                            o2 = v81.m(list11);
                            n6 = p71.n(i11 << 3);
                            n7 = (n6 * size) + o2;
                            i10 += n7;
                            i8 += 3;
                            o81Var = this;
                            h71Var2 = h71Var;
                            i6 = 1048575;
                        }
                        n7 = 0;
                        i10 += n7;
                        i8 += 3;
                        o81Var = this;
                        h71Var2 = h71Var;
                        i6 = 1048575;
                    case 35:
                        List list12 = (List) unsafe.getObject(h71Var2, j2);
                        g00 g00Var14 = v81.a;
                        size2 = list12.size() * 8;
                        if (size2 > 0) {
                            n9 = p71.n(i11 << 3);
                            i10 = qo0.j(size2, n9, size2, i10);
                            i8 += 3;
                            o81Var = this;
                            h71Var2 = h71Var;
                            i6 = 1048575;
                        } else {
                            i8 += 3;
                            o81Var = this;
                            h71Var2 = h71Var;
                            i6 = 1048575;
                        }
                    case 36:
                        List list13 = (List) unsafe.getObject(h71Var2, j2);
                        g00 g00Var15 = v81.a;
                        size2 = list13.size() * 4;
                        if (size2 > 0) {
                            n9 = p71.n(i11 << 3);
                            i10 = qo0.j(size2, n9, size2, i10);
                            i8 += 3;
                            o81Var = this;
                            h71Var2 = h71Var;
                            i6 = 1048575;
                        } else {
                            i8 += 3;
                            o81Var = this;
                            h71Var2 = h71Var;
                            i6 = 1048575;
                        }
                    case 37:
                        size2 = v81.k((List) unsafe.getObject(h71Var2, j2));
                        if (size2 > 0) {
                            n9 = p71.n(i11 << 3);
                            i10 = qo0.j(size2, n9, size2, i10);
                            i8 += 3;
                            o81Var = this;
                            h71Var2 = h71Var;
                            i6 = 1048575;
                        } else {
                            i8 += 3;
                            o81Var = this;
                            h71Var2 = h71Var;
                            i6 = 1048575;
                        }
                    case 38:
                        size2 = v81.o((List) unsafe.getObject(h71Var2, j2));
                        if (size2 > 0) {
                            n9 = p71.n(i11 << 3);
                            i10 = qo0.j(size2, n9, size2, i10);
                            i8 += 3;
                            o81Var = this;
                            h71Var2 = h71Var;
                            i6 = 1048575;
                        } else {
                            i8 += 3;
                            o81Var = this;
                            h71Var2 = h71Var;
                            i6 = 1048575;
                        }
                    case 39:
                        size2 = v81.j((List) unsafe.getObject(h71Var2, j2));
                        if (size2 > 0) {
                            n9 = p71.n(i11 << 3);
                            i10 = qo0.j(size2, n9, size2, i10);
                            i8 += 3;
                            o81Var = this;
                            h71Var2 = h71Var;
                            i6 = 1048575;
                        } else {
                            i8 += 3;
                            o81Var = this;
                            h71Var2 = h71Var;
                            i6 = 1048575;
                        }
                    case 40:
                        List list14 = (List) unsafe.getObject(h71Var2, j2);
                        g00 g00Var16 = v81.a;
                        size2 = list14.size() * 8;
                        if (size2 > 0) {
                            n9 = p71.n(i11 << 3);
                            i10 = qo0.j(size2, n9, size2, i10);
                            i8 += 3;
                            o81Var = this;
                            h71Var2 = h71Var;
                            i6 = 1048575;
                        } else {
                            i8 += 3;
                            o81Var = this;
                            h71Var2 = h71Var;
                            i6 = 1048575;
                        }
                    case 41:
                        List list15 = (List) unsafe.getObject(h71Var2, j2);
                        g00 g00Var17 = v81.a;
                        size2 = list15.size() * 4;
                        if (size2 > 0) {
                            n9 = p71.n(i11 << 3);
                            i10 = qo0.j(size2, n9, size2, i10);
                            i8 += 3;
                            o81Var = this;
                            h71Var2 = h71Var;
                            i6 = 1048575;
                        } else {
                            i8 += 3;
                            o81Var = this;
                            h71Var2 = h71Var;
                            i6 = 1048575;
                        }
                    case 42:
                        List list16 = (List) unsafe.getObject(h71Var2, j2);
                        g00 g00Var18 = v81.a;
                        size2 = list16.size();
                        if (size2 > 0) {
                            n9 = p71.n(i11 << 3);
                            i10 = qo0.j(size2, n9, size2, i10);
                            i8 += 3;
                            o81Var = this;
                            h71Var2 = h71Var;
                            i6 = 1048575;
                        } else {
                            i8 += 3;
                            o81Var = this;
                            h71Var2 = h71Var;
                            i6 = 1048575;
                        }
                    case 43:
                        size2 = v81.n((List) unsafe.getObject(h71Var2, j2));
                        if (size2 > 0) {
                            n9 = p71.n(i11 << 3);
                            i10 = qo0.j(size2, n9, size2, i10);
                            i8 += 3;
                            o81Var = this;
                            h71Var2 = h71Var;
                            i6 = 1048575;
                        } else {
                            i8 += 3;
                            o81Var = this;
                            h71Var2 = h71Var;
                            i6 = 1048575;
                        }
                    case 44:
                        size2 = v81.g((List) unsafe.getObject(h71Var2, j2));
                        if (size2 > 0) {
                            n9 = p71.n(i11 << 3);
                            i10 = qo0.j(size2, n9, size2, i10);
                            i8 += 3;
                            o81Var = this;
                            h71Var2 = h71Var;
                            i6 = 1048575;
                        } else {
                            i8 += 3;
                            o81Var = this;
                            h71Var2 = h71Var;
                            i6 = 1048575;
                        }
                    case 45:
                        List list17 = (List) unsafe.getObject(h71Var2, j2);
                        g00 g00Var19 = v81.a;
                        size2 = list17.size() * 4;
                        if (size2 > 0) {
                            n9 = p71.n(i11 << 3);
                            i10 = qo0.j(size2, n9, size2, i10);
                            i8 += 3;
                            o81Var = this;
                            h71Var2 = h71Var;
                            i6 = 1048575;
                        } else {
                            i8 += 3;
                            o81Var = this;
                            h71Var2 = h71Var;
                            i6 = 1048575;
                        }
                    case 46:
                        List list18 = (List) unsafe.getObject(h71Var2, j2);
                        g00 g00Var20 = v81.a;
                        size2 = list18.size() * 8;
                        if (size2 > 0) {
                            n9 = p71.n(i11 << 3);
                            i10 = qo0.j(size2, n9, size2, i10);
                            i8 += 3;
                            o81Var = this;
                            h71Var2 = h71Var;
                            i6 = 1048575;
                        } else {
                            i8 += 3;
                            o81Var = this;
                            h71Var2 = h71Var;
                            i6 = 1048575;
                        }
                    case 47:
                        size2 = v81.l((List) unsafe.getObject(h71Var2, j2));
                        if (size2 > 0) {
                            n9 = p71.n(i11 << 3);
                            i10 = qo0.j(size2, n9, size2, i10);
                            i8 += 3;
                            o81Var = this;
                            h71Var2 = h71Var;
                            i6 = 1048575;
                        } else {
                            i8 += 3;
                            o81Var = this;
                            h71Var2 = h71Var;
                            i6 = 1048575;
                        }
                    case 48:
                        size2 = v81.m((List) unsafe.getObject(h71Var2, j2));
                        if (size2 > 0) {
                            n9 = p71.n(i11 << 3);
                            i10 = qo0.j(size2, n9, size2, i10);
                            i8 += 3;
                            o81Var = this;
                            h71Var2 = h71Var;
                            i6 = 1048575;
                        } else {
                            i8 += 3;
                            o81Var = this;
                            h71Var2 = h71Var;
                            i6 = 1048575;
                        }
                    case 49:
                        List list19 = (List) unsafe.getObject(h71Var2, j2);
                        u81 B4 = o81Var.B(i8);
                        g00 g00Var21 = v81.a;
                        int size7 = list19.size();
                        if (size7 == 0) {
                            i5 = 0;
                        } else {
                            i5 = 0;
                            for (int i20 = 0; i20 < size7; i20++) {
                                h71 h71Var4 = (h71) list19.get(i20);
                                int n14 = p71.n(i11 << 3);
                                i5 += h71Var4.c(B4) + n14 + n14;
                            }
                        }
                        i10 += i5;
                        i8 += 3;
                        o81Var = this;
                        h71Var2 = h71Var;
                        i6 = 1048575;
                    case 50:
                        int i21 = i8 / 3;
                        j81 j81Var = (j81) unsafe.getObject(h71Var2, j2);
                        if (o81Var.b[i21 + i21] == null) {
                            if (j81Var.isEmpty()) {
                                continue;
                            } else {
                                Iterator it = j81Var.entrySet().iterator();
                                if (it.hasNext()) {
                                    Map.Entry entry = (Map.Entry) it.next();
                                    entry.getKey();
                                    entry.getValue();
                                    throw null;
                                }
                            }
                            i8 += 3;
                            o81Var = this;
                            h71Var2 = h71Var;
                            i6 = 1048575;
                        } else {
                            c.a();
                            return 0;
                        }
                    case 51:
                        if (!o81Var.s(i11, i8, h71Var2)) {
                            i8 += 3;
                            o81Var = this;
                            h71Var2 = h71Var;
                            i6 = 1048575;
                        }
                        i10 = qo0.i(i11 << 3, 8, i10);
                        i8 += 3;
                        o81Var = this;
                        h71Var2 = h71Var;
                        i6 = 1048575;
                    case 52:
                        if (!o81Var.s(i11, i8, h71Var2)) {
                            i8 += 3;
                            o81Var = this;
                            h71Var2 = h71Var;
                            i6 = 1048575;
                        }
                        i10 = qo0.i(i11 << 3, 4, i10);
                        i8 += 3;
                        o81Var = this;
                        h71Var2 = h71Var;
                        i6 = 1048575;
                    case 53:
                        if (o81Var.s(i11, i8, h71Var2)) {
                            long z = z(j2, h71Var2);
                            n10 = p71.n(i11 << 3);
                            o3 = p71.o(z);
                            i10 += o3 + n10;
                            i8 += 3;
                            o81Var = this;
                            h71Var2 = h71Var;
                            i6 = 1048575;
                        } else {
                            i8 += 3;
                            o81Var = this;
                            h71Var2 = h71Var;
                            i6 = 1048575;
                        }
                    case 54:
                        if (o81Var.s(i11, i8, h71Var2)) {
                            long z2 = z(j2, h71Var2);
                            n10 = p71.n(i11 << 3);
                            o3 = p71.o(z2);
                            i10 += o3 + n10;
                            i8 += 3;
                            o81Var = this;
                            h71Var2 = h71Var;
                            i6 = 1048575;
                        } else {
                            i8 += 3;
                            o81Var = this;
                            h71Var2 = h71Var;
                            i6 = 1048575;
                        }
                    case 55:
                        if (o81Var.s(i11, i8, h71Var2)) {
                            long v2 = v(j2, h71Var2);
                            n10 = p71.n(i11 << 3);
                            o3 = p71.o(v2);
                            i10 += o3 + n10;
                            i8 += 3;
                            o81Var = this;
                            h71Var2 = h71Var;
                            i6 = 1048575;
                        } else {
                            i8 += 3;
                            o81Var = this;
                            h71Var2 = h71Var;
                            i6 = 1048575;
                        }
                    case 56:
                        if (!o81Var.s(i11, i8, h71Var2)) {
                            i8 += 3;
                            o81Var = this;
                            h71Var2 = h71Var;
                            i6 = 1048575;
                        }
                        i10 = qo0.i(i11 << 3, 8, i10);
                        i8 += 3;
                        o81Var = this;
                        h71Var2 = h71Var;
                        i6 = 1048575;
                    case 57:
                        if (!o81Var.s(i11, i8, h71Var2)) {
                            i8 += 3;
                            o81Var = this;
                            h71Var2 = h71Var;
                            i6 = 1048575;
                        }
                        i10 = qo0.i(i11 << 3, 4, i10);
                        i8 += 3;
                        o81Var = this;
                        h71Var2 = h71Var;
                        i6 = 1048575;
                    case 58:
                        if (o81Var.s(i11, i8, h71Var2)) {
                            i10 = qo0.i(i11 << 3, 1, i10);
                        }
                        i8 += 3;
                        o81Var = this;
                        h71Var2 = h71Var;
                        i6 = 1048575;
                    case 59:
                        if (o81Var.s(i11, i8, h71Var2)) {
                            int i22 = i11 << 3;
                            Object object3 = unsafe.getObject(h71Var2, j2);
                            if (object3 instanceof n71) {
                                n11 = p71.n(i22);
                                b3 = ((n71) object3).e();
                            } else {
                                n11 = p71.n(i22);
                                b3 = e91.b((String) object3);
                            }
                            i10 = qo0.j(b3, b3, n11, i10);
                            i8 += 3;
                            o81Var = this;
                            h71Var2 = h71Var;
                            i6 = 1048575;
                        } else {
                            i8 += 3;
                            o81Var = this;
                            h71Var2 = h71Var;
                            i6 = 1048575;
                        }
                    case 60:
                        if (o81Var.s(i11, i8, h71Var2)) {
                            Object object4 = unsafe.getObject(h71Var2, j2);
                            u81 B5 = o81Var.B(i8);
                            g00 g00Var22 = v81.a;
                            n3 = p71.n(i11 << 3);
                            c = ((h71) object4).c(B5);
                            i10 = qo0.j(c, c, n3, i10);
                            i8 += 3;
                            o81Var = this;
                            h71Var2 = h71Var;
                            i6 = 1048575;
                        } else {
                            i8 += 3;
                            o81Var = this;
                            h71Var2 = h71Var;
                            i6 = 1048575;
                        }
                    case 61:
                        if (o81Var.s(i11, i8, h71Var2)) {
                            n71 n71Var2 = (n71) unsafe.getObject(h71Var2, j2);
                            n11 = p71.n(i11 << 3);
                            b3 = n71Var2.e();
                            i10 = qo0.j(b3, b3, n11, i10);
                            i8 += 3;
                            o81Var = this;
                            h71Var2 = h71Var;
                            i6 = 1048575;
                        } else {
                            i8 += 3;
                            o81Var = this;
                            h71Var2 = h71Var;
                            i6 = 1048575;
                        }
                    case 62:
                        if (o81Var.s(i11, i8, h71Var2)) {
                            v = v(j2, h71Var2);
                            n12 = p71.n(i11 << 3);
                            i10 = qo0.i(v, n12, i10);
                            i8 += 3;
                            o81Var = this;
                            h71Var2 = h71Var;
                            i6 = 1048575;
                        } else {
                            i8 += 3;
                            o81Var = this;
                            h71Var2 = h71Var;
                            i6 = 1048575;
                        }
                    case 63:
                        if (o81Var.s(i11, i8, h71Var2)) {
                            long v3 = v(j2, h71Var2);
                            n10 = p71.n(i11 << 3);
                            o3 = p71.o(v3);
                            i10 += o3 + n10;
                            i8 += 3;
                            o81Var = this;
                            h71Var2 = h71Var;
                            i6 = 1048575;
                        } else {
                            i8 += 3;
                            o81Var = this;
                            h71Var2 = h71Var;
                            i6 = 1048575;
                        }
                    case 64:
                        if (!o81Var.s(i11, i8, h71Var2)) {
                            i8 += 3;
                            o81Var = this;
                            h71Var2 = h71Var;
                            i6 = 1048575;
                        }
                        i10 = qo0.i(i11 << 3, 4, i10);
                        i8 += 3;
                        o81Var = this;
                        h71Var2 = h71Var;
                        i6 = 1048575;
                    case 65:
                        if (!o81Var.s(i11, i8, h71Var2)) {
                            i8 += 3;
                            o81Var = this;
                            h71Var2 = h71Var;
                            i6 = 1048575;
                        }
                        i10 = qo0.i(i11 << 3, 8, i10);
                        i8 += 3;
                        o81Var = this;
                        h71Var2 = h71Var;
                        i6 = 1048575;
                    case 66:
                        if (o81Var.s(i11, i8, h71Var2)) {
                            int v4 = v(j2, h71Var2);
                            n12 = p71.n(i11 << 3);
                            v = (v4 >> 31) ^ (v4 + v4);
                            i10 = qo0.i(v, n12, i10);
                            i8 += 3;
                            o81Var = this;
                            h71Var2 = h71Var;
                            i6 = 1048575;
                        } else {
                            i8 += 3;
                            o81Var = this;
                            h71Var2 = h71Var;
                            i6 = 1048575;
                        }
                    case 67:
                        if (o81Var.s(i11, i8, h71Var2)) {
                            long z3 = z(j2, h71Var2);
                            n10 = p71.n(i11 << 3);
                            o3 = p71.o((z3 >> 63) ^ (z3 + z3));
                            i10 += o3 + n10;
                            i8 += 3;
                            o81Var = this;
                            h71Var2 = h71Var;
                            i6 = 1048575;
                        } else {
                            i8 += 3;
                            o81Var = this;
                            h71Var2 = h71Var;
                            i6 = 1048575;
                        }
                    case 68:
                        if (o81Var.s(i11, i8, h71Var2)) {
                            h71 h71Var5 = (h71) unsafe.getObject(h71Var2, j2);
                            u81 B6 = o81Var.B(i8);
                            g00 g00Var23 = v81.a;
                            int n15 = p71.n(i11 << 3);
                            i4 = n15 + n15;
                            c2 = h71Var5.c(B6);
                            i3 = c2 + i4;
                            i10 += i3;
                            i8 += 3;
                            o81Var = this;
                            h71Var2 = h71Var;
                            i6 = 1048575;
                        } else {
                            i8 += 3;
                            o81Var = this;
                            h71Var2 = h71Var;
                            i6 = 1048575;
                        }
                    default:
                        i8 += 3;
                        o81Var = this;
                        h71Var2 = h71Var;
                        i6 = 1048575;
                }
            } else {
                return ((x71) h71Var).zzc.a() + i10;
            }
        }
    }

    @Override // defpackage.u81
    public final boolean h(Object obj) {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1048575;
        while (i5 < this.g) {
            int i7 = this.f[i5];
            int[] iArr = this.a;
            int i8 = iArr[i7];
            int y = y(i7);
            int i9 = iArr[i7 + 2];
            int i10 = i9 & 1048575;
            int i11 = 1 << (i9 >>> 20);
            if (i10 != i6) {
                if (i10 != 1048575) {
                    i4 = k.getInt(obj, i10);
                }
                i2 = i7;
                i3 = i4;
                i = i10;
            } else {
                int i12 = i4;
                i = i6;
                i2 = i7;
                i3 = i12;
            }
            if ((268435456 & y) == 0 || q(obj, i2, i, i3, i11)) {
                int x = x(y);
                if (x != 9 && x != 17) {
                    if (x != 27) {
                        if (x != 60 && x != 68) {
                            if (x != 49) {
                                if (x == 50 && !((j81) c91.h(y & 1048575, obj)).isEmpty()) {
                                    int i13 = i2 / 3;
                                    this.b[i13 + i13].getClass();
                                    c.a();
                                    return false;
                                }
                            }
                        } else if (s(i8, i2, obj) && !B(i2).h(c91.h(y & 1048575, obj))) {
                        }
                        i5++;
                        i6 = i;
                        i4 = i3;
                    }
                    List list = (List) c91.h(y & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        u81 B = B(i2);
                        for (int i14 = 0; i14 < list.size(); i14++) {
                            if (B.h(list.get(i14))) {
                            }
                        }
                    }
                    i5++;
                    i6 = i;
                    i4 = i3;
                } else {
                    if (q(obj, i2, i, i3, i11) && !B(i2).h(c91.h(y & 1048575, obj))) {
                    }
                    i5++;
                    i6 = i;
                    i4 = i3;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x004d. Please report as an issue. */
    @Override // defpackage.u81
    public final void i(Object obj, sb0 sb0Var) {
        int[] iArr;
        int i;
        int i2;
        o81 o81Var = this;
        p71 p71Var = (p71) sb0Var.c;
        Unsafe unsafe = k;
        int i3 = 1048575;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            int[] iArr2 = o81Var.a;
            if (i5 < iArr2.length) {
                int y = o81Var.y(i5);
                int x = x(y);
                int i7 = iArr2[i5];
                if (x <= 17) {
                    int i8 = iArr2[i5 + 2];
                    int i9 = i8 & i3;
                    if (i9 != i4) {
                        if (i9 == i3) {
                            i6 = 0;
                        } else {
                            i6 = unsafe.getInt(obj, i9);
                        }
                        i4 = i9;
                    }
                    iArr = iArr2;
                    i = 1 << (i8 >>> 20);
                } else {
                    iArr = iArr2;
                    i = 0;
                }
                long j2 = y & i3;
                char c = 3;
                switch (x) {
                    case 0:
                        if (o81Var.q(obj, i5, i4, i6, i)) {
                            p71Var.e(i7, Double.doubleToRawLongBits(c91.c.e(j2, obj)));
                        }
                        i5 += 3;
                        i3 = 1048575;
                        o81Var = this;
                    case 1:
                        if (o81Var.q(obj, i5, i4, i6, i)) {
                            p71Var.c(i7, Float.floatToRawIntBits(c91.c.f(j2, obj)));
                        }
                        i5 += 3;
                        i3 = 1048575;
                        o81Var = this;
                    case 2:
                        if (o81Var.q(obj, i5, i4, i6, i)) {
                            p71Var.l(i7, unsafe.getLong(obj, j2));
                        }
                        i5 += 3;
                        i3 = 1048575;
                        o81Var = this;
                    case 3:
                        if (o81Var.q(obj, i5, i4, i6, i)) {
                            p71Var.l(i7, unsafe.getLong(obj, j2));
                        }
                        i5 += 3;
                        i3 = 1048575;
                        o81Var = this;
                    case 4:
                        if (o81Var.q(obj, i5, i4, i6, i)) {
                            p71Var.g(i7, unsafe.getInt(obj, j2));
                        }
                        i5 += 3;
                        i3 = 1048575;
                        o81Var = this;
                    case 5:
                        if (o81Var.q(obj, i5, i4, i6, i)) {
                            p71Var.e(i7, unsafe.getLong(obj, j2));
                        }
                        i5 += 3;
                        i3 = 1048575;
                        o81Var = this;
                    case 6:
                        if (o81Var.q(obj, i5, i4, i6, i)) {
                            p71Var.c(i7, unsafe.getInt(obj, j2));
                        }
                        i5 += 3;
                        i3 = 1048575;
                        o81Var = this;
                    case 7:
                        if (o81Var.q(obj, i5, i4, i6, i)) {
                            boolean k2 = c91.c.k(j2, obj);
                            p71Var.k(i7 << 3);
                            p71Var.a(k2 ? (byte) 1 : (byte) 0);
                        }
                        i5 += 3;
                        i3 = 1048575;
                        o81Var = this;
                    case 8:
                        if (o81Var.q(obj, i5, i4, i6, i)) {
                            Object object = unsafe.getObject(obj, j2);
                            if (object instanceof String) {
                                String str = (String) object;
                                p71Var.k((i7 << 3) | 2);
                                int i10 = p71Var.c;
                                byte[] bArr = p71Var.b;
                                int i11 = p71Var.d;
                                try {
                                    int n = p71.n(str.length() * 3);
                                    int n2 = p71.n(str.length());
                                    if (n2 == n) {
                                        int i12 = i11 + n2;
                                        p71Var.d = i12;
                                        int a = e91.a(i12, i10 - i12, str, bArr);
                                        p71Var.d = i11;
                                        p71Var.k((a - i11) - n2);
                                        p71Var.d = a;
                                    } else {
                                        p71Var.k(e91.b(str));
                                        int i13 = p71Var.d;
                                        p71Var.d = e91.a(i13, i10 - i13, str, bArr);
                                    }
                                } catch (IndexOutOfBoundsException e) {
                                    throw new IOException("CodedOutputStream was writing to a flat byte array and ran out of space.", e);
                                }
                            } else {
                                n71 n71Var = (n71) object;
                                p71Var.k((i7 << 3) | 2);
                                p71Var.k(n71Var.e());
                                n71Var.g(p71Var);
                            }
                        } else {
                            continue;
                        }
                        i5 += 3;
                        i3 = 1048575;
                        o81Var = this;
                    case 9:
                        if (o81Var.q(obj, i5, i4, i6, i)) {
                            sb0Var.s(i7, unsafe.getObject(obj, j2), o81Var.B(i5));
                        }
                        i5 += 3;
                        i3 = 1048575;
                        o81Var = this;
                    case 10:
                        if (o81Var.q(obj, i5, i4, i6, i)) {
                            n71 n71Var2 = (n71) unsafe.getObject(obj, j2);
                            p71Var.k((i7 << 3) | 2);
                            p71Var.k(n71Var2.e());
                            n71Var2.g(p71Var);
                        }
                        i5 += 3;
                        i3 = 1048575;
                        o81Var = this;
                    case 11:
                        if (o81Var.q(obj, i5, i4, i6, i)) {
                            p71Var.j(i7, unsafe.getInt(obj, j2));
                        }
                        i5 += 3;
                        i3 = 1048575;
                        o81Var = this;
                    case 12:
                        if (o81Var.q(obj, i5, i4, i6, i)) {
                            p71Var.g(i7, unsafe.getInt(obj, j2));
                        }
                        i5 += 3;
                        i3 = 1048575;
                        o81Var = this;
                    case 13:
                        if (o81Var.q(obj, i5, i4, i6, i)) {
                            p71Var.c(i7, unsafe.getInt(obj, j2));
                        }
                        i5 += 3;
                        i3 = 1048575;
                        o81Var = this;
                    case 14:
                        if (o81Var.q(obj, i5, i4, i6, i)) {
                            p71Var.e(i7, unsafe.getLong(obj, j2));
                        }
                        i5 += 3;
                        i3 = 1048575;
                        o81Var = this;
                    case 15:
                        if (o81Var.q(obj, i5, i4, i6, i)) {
                            int i14 = unsafe.getInt(obj, j2);
                            p71Var.j(i7, (i14 >> 31) ^ (i14 + i14));
                        }
                        i5 += 3;
                        i3 = 1048575;
                        o81Var = this;
                    case 16:
                        if (o81Var.q(obj, i5, i4, i6, i)) {
                            long j3 = unsafe.getLong(obj, j2);
                            p71Var.l(i7, (j3 >> 63) ^ (j3 + j3));
                        }
                        i5 += 3;
                        i3 = 1048575;
                        o81Var = this;
                    case 17:
                        if (o81Var.q(obj, i5, i4, i6, i)) {
                            Object object2 = unsafe.getObject(obj, j2);
                            p71Var.i(i7, 3);
                            o81Var.B(i5).i((h71) object2, sb0Var);
                            p71Var.i(i7, 4);
                        }
                        i5 += 3;
                        i3 = 1048575;
                        o81Var = this;
                    case 18:
                        i2 = i5;
                        v81.r(iArr[i2], (List) unsafe.getObject(obj, j2), sb0Var, false);
                        i5 = i2;
                        i5 += 3;
                        i3 = 1048575;
                        o81Var = this;
                    case 19:
                        i2 = i5;
                        v81.v(iArr[i2], (List) unsafe.getObject(obj, j2), sb0Var, false);
                        i5 = i2;
                        i5 += 3;
                        i3 = 1048575;
                        o81Var = this;
                    case 20:
                        i2 = i5;
                        v81.x(iArr[i2], (List) unsafe.getObject(obj, j2), sb0Var, false);
                        i5 = i2;
                        i5 += 3;
                        i3 = 1048575;
                        o81Var = this;
                    case 21:
                        i2 = i5;
                        v81.e(iArr[i2], (List) unsafe.getObject(obj, j2), sb0Var, false);
                        i5 = i2;
                        i5 += 3;
                        i3 = 1048575;
                        o81Var = this;
                    case 22:
                        i2 = i5;
                        v81.w(iArr[i2], (List) unsafe.getObject(obj, j2), sb0Var, false);
                        i5 = i2;
                        i5 += 3;
                        i3 = 1048575;
                        o81Var = this;
                    case 23:
                        i2 = i5;
                        v81.u(iArr[i2], (List) unsafe.getObject(obj, j2), sb0Var, false);
                        i5 = i2;
                        i5 += 3;
                        i3 = 1048575;
                        o81Var = this;
                    case 24:
                        i2 = i5;
                        v81.t(iArr[i2], (List) unsafe.getObject(obj, j2), sb0Var, false);
                        i5 = i2;
                        i5 += 3;
                        i3 = 1048575;
                        o81Var = this;
                    case 25:
                        i2 = i5;
                        v81.q(iArr[i2], (List) unsafe.getObject(obj, j2), sb0Var, false);
                        i5 = i2;
                        i5 += 3;
                        i3 = 1048575;
                        o81Var = this;
                    case 26:
                        int i15 = iArr[i5];
                        List list = (List) unsafe.getObject(obj, j2);
                        g00 g00Var = v81.a;
                        if (list != null && !list.isEmpty()) {
                            int i16 = 0;
                            while (i16 < list.size()) {
                                String str2 = (String) list.get(i16);
                                p71Var.k((i15 << 3) | 2);
                                int i17 = p71Var.c;
                                byte[] bArr2 = p71Var.b;
                                char c2 = c;
                                int i18 = p71Var.d;
                                try {
                                    int n3 = p71.n(str2.length() * 3);
                                    int i19 = i5;
                                    int n4 = p71.n(str2.length());
                                    if (n4 == n3) {
                                        int i20 = i18 + n4;
                                        p71Var.d = i20;
                                        int a2 = e91.a(i20, i17 - i20, str2, bArr2);
                                        p71Var.d = i18;
                                        p71Var.k((a2 - i18) - n4);
                                        p71Var.d = a2;
                                    } else {
                                        p71Var.k(e91.b(str2));
                                        int i21 = p71Var.d;
                                        p71Var.d = e91.a(i21, i17 - i21, str2, bArr2);
                                    }
                                    i16++;
                                    c = c2;
                                    i5 = i19;
                                } catch (IndexOutOfBoundsException e2) {
                                    throw new IOException("CodedOutputStream was writing to a flat byte array and ran out of space.", e2);
                                }
                            }
                        }
                        i5 += 3;
                        i3 = 1048575;
                        o81Var = this;
                        break;
                    case 27:
                        int i22 = iArr[i5];
                        List list2 = (List) unsafe.getObject(obj, j2);
                        u81 B = o81Var.B(i5);
                        g00 g00Var2 = v81.a;
                        if (list2 != null && !list2.isEmpty()) {
                            for (int i23 = 0; i23 < list2.size(); i23++) {
                                sb0Var.s(i22, list2.get(i23), B);
                            }
                        }
                        i5 += 3;
                        i3 = 1048575;
                        o81Var = this;
                        break;
                    case 28:
                        int i24 = iArr[i5];
                        List list3 = (List) unsafe.getObject(obj, j2);
                        g00 g00Var3 = v81.a;
                        if (list3 != null && !list3.isEmpty()) {
                            for (int i25 = 0; i25 < list3.size(); i25++) {
                                n71 n71Var3 = (n71) list3.get(i25);
                                p71Var.k((i24 << 3) | 2);
                                p71Var.k(n71Var3.e());
                                n71Var3.g(p71Var);
                            }
                        }
                        i5 += 3;
                        i3 = 1048575;
                        o81Var = this;
                        break;
                    case 29:
                        v81.d(iArr[i5], (List) unsafe.getObject(obj, j2), sb0Var, false);
                        i5 += 3;
                        i3 = 1048575;
                        o81Var = this;
                    case 30:
                        v81.s(iArr[i5], (List) unsafe.getObject(obj, j2), sb0Var, false);
                        i5 += 3;
                        i3 = 1048575;
                        o81Var = this;
                    case 31:
                        v81.y(iArr[i5], (List) unsafe.getObject(obj, j2), sb0Var, false);
                        i5 += 3;
                        i3 = 1048575;
                        o81Var = this;
                    case 32:
                        v81.a(iArr[i5], (List) unsafe.getObject(obj, j2), sb0Var, false);
                        i5 += 3;
                        i3 = 1048575;
                        o81Var = this;
                    case 33:
                        v81.b(iArr[i5], (List) unsafe.getObject(obj, j2), sb0Var, false);
                        i5 += 3;
                        i3 = 1048575;
                        o81Var = this;
                    case 34:
                        v81.c(iArr[i5], (List) unsafe.getObject(obj, j2), sb0Var, false);
                        i5 += 3;
                        i3 = 1048575;
                        o81Var = this;
                    case 35:
                        v81.r(iArr[i5], (List) unsafe.getObject(obj, j2), sb0Var, true);
                        i5 += 3;
                        i3 = 1048575;
                        o81Var = this;
                    case 36:
                        v81.v(iArr[i5], (List) unsafe.getObject(obj, j2), sb0Var, true);
                        i5 += 3;
                        i3 = 1048575;
                        o81Var = this;
                    case 37:
                        v81.x(iArr[i5], (List) unsafe.getObject(obj, j2), sb0Var, true);
                        i5 += 3;
                        i3 = 1048575;
                        o81Var = this;
                    case 38:
                        v81.e(iArr[i5], (List) unsafe.getObject(obj, j2), sb0Var, true);
                        i5 += 3;
                        i3 = 1048575;
                        o81Var = this;
                    case 39:
                        v81.w(iArr[i5], (List) unsafe.getObject(obj, j2), sb0Var, true);
                        i5 += 3;
                        i3 = 1048575;
                        o81Var = this;
                    case 40:
                        v81.u(iArr[i5], (List) unsafe.getObject(obj, j2), sb0Var, true);
                        i5 += 3;
                        i3 = 1048575;
                        o81Var = this;
                    case 41:
                        v81.t(iArr[i5], (List) unsafe.getObject(obj, j2), sb0Var, true);
                        i5 += 3;
                        i3 = 1048575;
                        o81Var = this;
                    case 42:
                        v81.q(iArr[i5], (List) unsafe.getObject(obj, j2), sb0Var, true);
                        i5 += 3;
                        i3 = 1048575;
                        o81Var = this;
                    case 43:
                        v81.d(iArr[i5], (List) unsafe.getObject(obj, j2), sb0Var, true);
                        i5 += 3;
                        i3 = 1048575;
                        o81Var = this;
                    case 44:
                        v81.s(iArr[i5], (List) unsafe.getObject(obj, j2), sb0Var, true);
                        i5 += 3;
                        i3 = 1048575;
                        o81Var = this;
                    case 45:
                        v81.y(iArr[i5], (List) unsafe.getObject(obj, j2), sb0Var, true);
                        i5 += 3;
                        i3 = 1048575;
                        o81Var = this;
                    case 46:
                        v81.a(iArr[i5], (List) unsafe.getObject(obj, j2), sb0Var, true);
                        i5 += 3;
                        i3 = 1048575;
                        o81Var = this;
                    case 47:
                        v81.b(iArr[i5], (List) unsafe.getObject(obj, j2), sb0Var, true);
                        i5 += 3;
                        i3 = 1048575;
                        o81Var = this;
                    case 48:
                        v81.c(iArr[i5], (List) unsafe.getObject(obj, j2), sb0Var, true);
                        i5 += 3;
                        i3 = 1048575;
                        o81Var = this;
                    case 49:
                        int i26 = iArr[i5];
                        List list4 = (List) unsafe.getObject(obj, j2);
                        u81 B2 = o81Var.B(i5);
                        g00 g00Var4 = v81.a;
                        if (list4 != null && !list4.isEmpty()) {
                            for (int i27 = 0; i27 < list4.size(); i27++) {
                                h71 h71Var = (h71) list4.get(i27);
                                p71Var.i(i26, 3);
                                B2.i(h71Var, sb0Var);
                                p71Var.i(i26, 4);
                            }
                        }
                        i5 += 3;
                        i3 = 1048575;
                        o81Var = this;
                        break;
                    case 50:
                        if (unsafe.getObject(obj, j2) != null) {
                            int i28 = i5 / 3;
                            o81Var.b[i28 + i28].getClass();
                            c.a();
                            return;
                        }
                        i5 += 3;
                        i3 = 1048575;
                        o81Var = this;
                    case 51:
                        if (o81Var.s(i7, i5, obj)) {
                            p71Var.e(i7, Double.doubleToRawLongBits(((Double) c91.h(j2, obj)).doubleValue()));
                        }
                        i5 += 3;
                        i3 = 1048575;
                        o81Var = this;
                    case 52:
                        if (o81Var.s(i7, i5, obj)) {
                            p71Var.c(i7, Float.floatToRawIntBits(((Float) c91.h(j2, obj)).floatValue()));
                        }
                        i5 += 3;
                        i3 = 1048575;
                        o81Var = this;
                    case 53:
                        if (o81Var.s(i7, i5, obj)) {
                            p71Var.l(i7, z(j2, obj));
                        }
                        i5 += 3;
                        i3 = 1048575;
                        o81Var = this;
                    case 54:
                        if (o81Var.s(i7, i5, obj)) {
                            p71Var.l(i7, z(j2, obj));
                        }
                        i5 += 3;
                        i3 = 1048575;
                        o81Var = this;
                    case 55:
                        if (o81Var.s(i7, i5, obj)) {
                            p71Var.g(i7, v(j2, obj));
                        }
                        i5 += 3;
                        i3 = 1048575;
                        o81Var = this;
                    case 56:
                        if (o81Var.s(i7, i5, obj)) {
                            p71Var.e(i7, z(j2, obj));
                        }
                        i5 += 3;
                        i3 = 1048575;
                        o81Var = this;
                    case 57:
                        if (o81Var.s(i7, i5, obj)) {
                            p71Var.c(i7, v(j2, obj));
                        }
                        i5 += 3;
                        i3 = 1048575;
                        o81Var = this;
                    case 58:
                        if (o81Var.s(i7, i5, obj)) {
                            boolean booleanValue = ((Boolean) c91.h(j2, obj)).booleanValue();
                            p71Var.k(i7 << 3);
                            p71Var.a(booleanValue ? (byte) 1 : (byte) 0);
                        }
                        i5 += 3;
                        i3 = 1048575;
                        o81Var = this;
                    case 59:
                        if (o81Var.s(i7, i5, obj)) {
                            Object object3 = unsafe.getObject(obj, j2);
                            if (object3 instanceof String) {
                                String str3 = (String) object3;
                                p71Var.k((i7 << 3) | 2);
                                int i29 = p71Var.c;
                                byte[] bArr3 = p71Var.b;
                                int i30 = p71Var.d;
                                try {
                                    int n5 = p71.n(str3.length() * 3);
                                    int n6 = p71.n(str3.length());
                                    if (n6 == n5) {
                                        int i31 = i30 + n6;
                                        p71Var.d = i31;
                                        int a3 = e91.a(i31, i29 - i31, str3, bArr3);
                                        p71Var.d = i30;
                                        p71Var.k((a3 - i30) - n6);
                                        p71Var.d = a3;
                                    } else {
                                        p71Var.k(e91.b(str3));
                                        int i32 = p71Var.d;
                                        p71Var.d = e91.a(i32, i29 - i32, str3, bArr3);
                                    }
                                } catch (IndexOutOfBoundsException e3) {
                                    throw new IOException("CodedOutputStream was writing to a flat byte array and ran out of space.", e3);
                                }
                            } else {
                                n71 n71Var4 = (n71) object3;
                                p71Var.k((i7 << 3) | 2);
                                p71Var.k(n71Var4.e());
                                n71Var4.g(p71Var);
                            }
                        }
                        i5 += 3;
                        i3 = 1048575;
                        o81Var = this;
                    case 60:
                        if (o81Var.s(i7, i5, obj)) {
                            sb0Var.s(i7, unsafe.getObject(obj, j2), o81Var.B(i5));
                        }
                        i5 += 3;
                        i3 = 1048575;
                        o81Var = this;
                    case 61:
                        if (o81Var.s(i7, i5, obj)) {
                            n71 n71Var5 = (n71) unsafe.getObject(obj, j2);
                            p71Var.k((i7 << 3) | 2);
                            p71Var.k(n71Var5.e());
                            n71Var5.g(p71Var);
                        }
                        i5 += 3;
                        i3 = 1048575;
                        o81Var = this;
                    case 62:
                        if (o81Var.s(i7, i5, obj)) {
                            p71Var.j(i7, v(j2, obj));
                        }
                        i5 += 3;
                        i3 = 1048575;
                        o81Var = this;
                    case 63:
                        if (o81Var.s(i7, i5, obj)) {
                            p71Var.g(i7, v(j2, obj));
                        }
                        i5 += 3;
                        i3 = 1048575;
                        o81Var = this;
                    case 64:
                        if (o81Var.s(i7, i5, obj)) {
                            p71Var.c(i7, v(j2, obj));
                        }
                        i5 += 3;
                        i3 = 1048575;
                        o81Var = this;
                    case 65:
                        if (o81Var.s(i7, i5, obj)) {
                            p71Var.e(i7, z(j2, obj));
                        }
                        i5 += 3;
                        i3 = 1048575;
                        o81Var = this;
                    case 66:
                        if (o81Var.s(i7, i5, obj)) {
                            int v = v(j2, obj);
                            p71Var.j(i7, (v >> 31) ^ (v + v));
                        }
                        i5 += 3;
                        i3 = 1048575;
                        o81Var = this;
                    case 67:
                        if (o81Var.s(i7, i5, obj)) {
                            long z = z(j2, obj);
                            p71Var.l(i7, (z >> 63) ^ (z + z));
                        }
                        i5 += 3;
                        i3 = 1048575;
                        o81Var = this;
                    case 68:
                        if (o81Var.s(i7, i5, obj)) {
                            Object object4 = unsafe.getObject(obj, j2);
                            p71Var.i(i7, 3);
                            o81Var.B(i5).i((h71) object4, sb0Var);
                            p71Var.i(i7, 4);
                        }
                        i5 += 3;
                        i3 = 1048575;
                        o81Var = this;
                    default:
                        i5 += 3;
                        i3 = 1048575;
                        o81Var = this;
                }
            } else {
                ((x71) obj).zzc.d(sb0Var);
                return;
            }
        }
    }

    public final void j(Object obj, int i, Object obj2) {
        if (!p(i, obj2)) {
            return;
        }
        int y = y(i) & 1048575;
        Unsafe unsafe = k;
        long j2 = y;
        Object object = unsafe.getObject(obj2, j2);
        if (object != null) {
            u81 B = B(i);
            if (!p(i, obj)) {
                if (!r(object)) {
                    unsafe.putObject(obj, j2, object);
                } else {
                    x71 c = B.c();
                    B.b(c, object);
                    unsafe.putObject(obj, j2, c);
                }
                l(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j2);
            if (!r(object2)) {
                x71 c2 = B.c();
                B.b(c2, object2);
                unsafe.putObject(obj, j2, c2);
                object2 = c2;
            }
            B.b(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + this.a[i] + " is present but null: " + obj2.toString());
    }

    public final void k(Object obj, int i, Object obj2) {
        int[] iArr = this.a;
        int i2 = iArr[i];
        if (!s(i2, i, obj2)) {
            return;
        }
        int y = y(i) & 1048575;
        Unsafe unsafe = k;
        long j2 = y;
        Object object = unsafe.getObject(obj2, j2);
        if (object != null) {
            u81 B = B(i);
            if (!s(i2, i, obj)) {
                if (!r(object)) {
                    unsafe.putObject(obj, j2, object);
                } else {
                    x71 c = B.c();
                    B.b(c, object);
                    unsafe.putObject(obj, j2, c);
                }
                c91.j(obj, iArr[i + 2] & 1048575, i2);
                return;
            }
            Object object2 = unsafe.getObject(obj, j2);
            if (!r(object2)) {
                x71 c2 = B.c();
                B.b(c2, object2);
                unsafe.putObject(obj, j2, c2);
                object2 = c2;
            }
            B.b(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + iArr[i] + " is present but null: " + obj2.toString());
    }

    public final void l(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j2 = 1048575 & i2;
        if (j2 == 1048575) {
            return;
        }
        c91.j(obj, j2, (1 << (i2 >>> 20)) | c91.e(j2, obj));
    }

    public final void m(Object obj, int i, Object obj2) {
        k.putObject(obj, y(i) & 1048575, obj2);
        l(i, obj);
    }

    public final void n(Object obj, int i, int i2, Object obj2) {
        k.putObject(obj, y(i2) & 1048575, obj2);
        c91.j(obj, this.a[i2 + 2] & 1048575, i);
    }

    public final boolean o(x71 x71Var, x71 x71Var2, int i) {
        if (p(i, x71Var) == p(i, x71Var2)) {
            return true;
        }
        return false;
    }

    public final boolean p(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j2 = i2 & 1048575;
        if (j2 == 1048575) {
            int y = y(i);
            long j3 = y & 1048575;
            switch (x(y)) {
                case 0:
                    if (Double.doubleToRawLongBits(c91.c.e(j3, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(c91.c.f(j3, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (c91.f(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (c91.f(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (c91.e(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (c91.f(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (c91.e(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return c91.c.k(j3, obj);
                case 8:
                    Object h = c91.h(j3, obj);
                    if (h instanceof String) {
                        if (((String) h).isEmpty()) {
                            return false;
                        }
                    } else if (h instanceof n71) {
                        if (n71.d.equals(h)) {
                            return false;
                        }
                    } else {
                        throw new IllegalArgumentException();
                    }
                    break;
                case 9:
                    if (c91.h(j3, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    if (n71.d.equals(c91.h(j3, obj))) {
                        return false;
                    }
                    break;
                case 11:
                    if (c91.e(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (c91.e(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (c91.e(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (c91.f(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (c91.e(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (c91.f(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (c91.h(j3, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i2 >>> 20)) & c91.e(j2, obj)) == 0) {
            return false;
        }
        return true;
    }

    public final boolean q(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return p(i, obj);
        }
        if ((i3 & i4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean s(int i, int i2, Object obj) {
        if (c91.e(this.a[i2 + 2] & 1048575, obj) == i) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:189:0x0571, code lost:
    
        r9 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0ce6, code lost:
    
        r1 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0d24, code lost:
    
        if (r1 == 1048575) goto L559;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0d26, code lost:
    
        r12.putInt(r9, r1, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0d2a, code lost:
    
        r2 = r37.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0d30, code lost:
    
        if (r2 >= r37.h) goto L682;
     */
    /* JADX WARN: Code restructure failed: missing block: B:499:0x00e4, code lost:
    
        r5 = r41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0d32, code lost:
    
        r3 = r37.f[r2];
        r6 = r21[r3];
        r6 = defpackage.c91.h(y(r3) & 1048575, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:500:0x00e6, code lost:
    
        r3 = r9;
        r8 = r10;
        r7 = r11;
        r9 = r12;
        r6 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0d46, code lost:
    
        if (r6 == null) goto L566;
     */
    /* JADX WARN: Code restructure failed: missing block: B:514:0x0155, code lost:
    
        r3 = r2;
        r2 = r1;
        r1 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0d4c, code lost:
    
        if (A(r3) != null) goto L683;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0d52, code lost:
    
        r6 = (defpackage.j81) r6;
        r3 = r3 / 3;
        r17[r3 + r3].getClass();
        defpackage.c.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0d61, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:561:0x0460, code lost:
    
        r8 = r10;
        r7 = r11;
        r9 = r12;
        r3 = r13;
        r6 = r15;
        r15 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:580:0x04de, code lost:
    
        r1 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0d62, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0d69, code lost:
    
        if (r0 != 0) goto L576;
     */
    /* JADX WARN: Code restructure failed: missing block: B:628:0x02fc, code lost:
    
        defpackage.f40.m("Protocol message had invalid UTF-8.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:629:0x0301, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0d6b, code lost:
    
        if (r4 != r5) goto L574;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0d6e, code lost:
    
        defpackage.f40.m("Failed to parse the message.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0d71, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:659:0x0366, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0d76, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0d72, code lost:
    
        if (r4 > r5) goto L579;
     */
    /* JADX WARN: Code restructure failed: missing block: B:675:0x02a5, code lost:
    
        defpackage.f40.m("Protocol message had invalid UTF-8.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:676:0x02aa, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0d74, code lost:
    
        if (r15 != r0) goto L579;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0d77, code lost:
    
        defpackage.f40.m("Failed to parse the message.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0d7a, code lost:
    
        return 0;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:172:0x05a6. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:28:0x0a73. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:491:0x00b9. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:186:0x09fc  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x09ec A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0cc3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0cd8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0ce1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:611:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:717:0x005d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0cf3  */
    /* JADX WARN: Type inference failed for: r5v85, types: [java.util.LinkedHashMap, j81] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int t(java.lang.Object r38, byte[] r39, int r40, int r41, int r42, defpackage.k71 r43) {
        /*
            Method dump skipped, instructions count: 3612
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o81.t(java.lang.Object, byte[], int, int, int, k71):int");
    }

    public final int w(int i, int i2) {
        int[] iArr = this.a;
        int length = (iArr.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = iArr[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    public final int y(int i) {
        return this.a[i + 1];
    }
}
