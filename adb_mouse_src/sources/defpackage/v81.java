package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public abstract class v81 {
    public static final g00 a;

    static {
        int i = j71.a;
        a = new g00(22);
    }

    public static void a(int i, List list, sb0 sb0Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            p71 p71Var = (p71) sb0Var.c;
            int i2 = 0;
            if (z) {
                p71Var.i(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Long) list.get(i4)).getClass();
                    i3 += 8;
                }
                p71Var.k(i3);
                while (i2 < list.size()) {
                    p71Var.f(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                p71Var.e(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    public static void b(int i, List list, sb0 sb0Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            p71 p71Var = (p71) sb0Var.c;
            int i2 = 0;
            if (list instanceof y71) {
                y71 y71Var = (y71) list;
                if (z) {
                    p71Var.i(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < y71Var.e; i4++) {
                        int c = y71Var.c(i4);
                        i3 += p71.n((c >> 31) ^ (c + c));
                    }
                    p71Var.k(i3);
                    while (i2 < y71Var.e) {
                        int c2 = y71Var.c(i2);
                        p71Var.k((c2 >> 31) ^ (c2 + c2));
                        i2++;
                    }
                    return;
                }
                while (i2 < y71Var.e) {
                    int c3 = y71Var.c(i2);
                    p71Var.j(i, (c3 >> 31) ^ (c3 + c3));
                    i2++;
                }
                return;
            }
            if (z) {
                p71Var.i(i, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    int intValue = ((Integer) list.get(i6)).intValue();
                    i5 += p71.n((intValue >> 31) ^ (intValue + intValue));
                }
                p71Var.k(i5);
                while (i2 < list.size()) {
                    int intValue2 = ((Integer) list.get(i2)).intValue();
                    p71Var.k((intValue2 >> 31) ^ (intValue2 + intValue2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                int intValue3 = ((Integer) list.get(i2)).intValue();
                p71Var.j(i, (intValue3 >> 31) ^ (intValue3 + intValue3));
                i2++;
            }
        }
    }

    public static void c(int i, List list, sb0 sb0Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            p71 p71Var = (p71) sb0Var.c;
            int i2 = 0;
            if (z) {
                p71Var.i(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    long longValue = ((Long) list.get(i4)).longValue();
                    i3 += p71.o((longValue >> 63) ^ (longValue + longValue));
                }
                p71Var.k(i3);
                while (i2 < list.size()) {
                    long longValue2 = ((Long) list.get(i2)).longValue();
                    p71Var.m((longValue2 >> 63) ^ (longValue2 + longValue2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                long longValue3 = ((Long) list.get(i2)).longValue();
                p71Var.l(i, (longValue3 >> 63) ^ (longValue3 + longValue3));
                i2++;
            }
        }
    }

    public static void d(int i, List list, sb0 sb0Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            p71 p71Var = (p71) sb0Var.c;
            int i2 = 0;
            if (list instanceof y71) {
                y71 y71Var = (y71) list;
                if (z) {
                    p71Var.i(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < y71Var.e; i4++) {
                        i3 += p71.n(y71Var.c(i4));
                    }
                    p71Var.k(i3);
                    while (i2 < y71Var.e) {
                        p71Var.k(y71Var.c(i2));
                        i2++;
                    }
                    return;
                }
                while (i2 < y71Var.e) {
                    p71Var.j(i, y71Var.c(i2));
                    i2++;
                }
                return;
            }
            if (z) {
                p71Var.i(i, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    i5 += p71.n(((Integer) list.get(i6)).intValue());
                }
                p71Var.k(i5);
                while (i2 < list.size()) {
                    p71Var.k(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                p71Var.j(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void e(int i, List list, sb0 sb0Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            p71 p71Var = (p71) sb0Var.c;
            int i2 = 0;
            if (z) {
                p71Var.i(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += p71.o(((Long) list.get(i4)).longValue());
                }
                p71Var.k(i3);
                while (i2 < list.size()) {
                    p71Var.m(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                p71Var.l(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    public static boolean f(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj.equals(obj2)) {
            return true;
        }
        return false;
    }

    public static int g(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof y71) {
            y71 y71Var = (y71) list;
            int i2 = 0;
            while (i < size) {
                i2 += p71.o(y71Var.c(i));
                i++;
            }
            return i2;
        }
        int i3 = 0;
        while (i < size) {
            i3 += p71.o(((Integer) list.get(i)).intValue());
            i++;
        }
        return i3;
    }

    public static int h(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (p71.n(i << 3) + 4) * size;
    }

    public static int i(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (p71.n(i << 3) + 8) * size;
    }

    public static int j(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof y71) {
            y71 y71Var = (y71) list;
            int i2 = 0;
            while (i < size) {
                i2 += p71.o(y71Var.c(i));
                i++;
            }
            return i2;
        }
        int i3 = 0;
        while (i < size) {
            i3 += p71.o(((Integer) list.get(i)).intValue());
            i++;
        }
        return i3;
    }

    public static int k(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += p71.o(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    public static int l(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof y71) {
            y71 y71Var = (y71) list;
            int i2 = 0;
            while (i < size) {
                int c = y71Var.c(i);
                i2 += p71.n((c >> 31) ^ (c + c));
                i++;
            }
            return i2;
        }
        int i3 = 0;
        while (i < size) {
            int intValue = ((Integer) list.get(i)).intValue();
            i3 += p71.n((intValue >> 31) ^ (intValue + intValue));
            i++;
        }
        return i3;
    }

    public static int m(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            long longValue = ((Long) list.get(i2)).longValue();
            i += p71.o((longValue >> 63) ^ (longValue + longValue));
        }
        return i;
    }

    public static int n(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof y71) {
            y71 y71Var = (y71) list;
            int i2 = 0;
            while (i < size) {
                i2 += p71.n(y71Var.c(i));
                i++;
            }
            return i2;
        }
        int i3 = 0;
        while (i < size) {
            i3 += p71.n(((Integer) list.get(i)).intValue());
            i++;
        }
        return i3;
    }

    public static int o(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += p71.o(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    public static void p(Object obj, Object obj2) {
        x71 x71Var = (x71) obj;
        x81 x81Var = x71Var.zzc;
        x81 x81Var2 = ((x71) obj2).zzc;
        x81 x81Var3 = x81.f;
        if (!x81Var3.equals(x81Var2)) {
            if (x81Var3.equals(x81Var)) {
                int i = x81Var.a + x81Var2.a;
                int[] copyOf = Arrays.copyOf(x81Var.b, i);
                System.arraycopy(x81Var2.b, 0, copyOf, x81Var.a, x81Var2.a);
                Object[] copyOf2 = Arrays.copyOf(x81Var.c, i);
                System.arraycopy(x81Var2.c, 0, copyOf2, x81Var.a, x81Var2.a);
                x81Var = new x81(i, copyOf, copyOf2, true);
            } else {
                x81Var.getClass();
                if (!x81Var2.equals(x81Var3)) {
                    if (x81Var.e) {
                        int i2 = x81Var.a + x81Var2.a;
                        x81Var.e(i2);
                        System.arraycopy(x81Var2.b, 0, x81Var.b, x81Var.a, x81Var2.a);
                        System.arraycopy(x81Var2.c, 0, x81Var.c, x81Var.a, x81Var2.a);
                        x81Var.a = i2;
                    } else {
                        throw new UnsupportedOperationException();
                    }
                }
            }
        }
        x71Var.zzc = x81Var;
    }

    public static void q(int i, List list, sb0 sb0Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            p71 p71Var = (p71) sb0Var.c;
            int i2 = 0;
            if (z) {
                p71Var.i(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Boolean) list.get(i4)).getClass();
                    i3++;
                }
                p71Var.k(i3);
                while (i2 < list.size()) {
                    p71Var.a(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                boolean booleanValue = ((Boolean) list.get(i2)).booleanValue();
                p71Var.k(i << 3);
                p71Var.a(booleanValue ? (byte) 1 : (byte) 0);
                i2++;
            }
        }
    }

    public static void r(int i, List list, sb0 sb0Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            p71 p71Var = (p71) sb0Var.c;
            int i2 = 0;
            if (z) {
                p71Var.i(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Double) list.get(i4)).getClass();
                    i3 += 8;
                }
                p71Var.k(i3);
                while (i2 < list.size()) {
                    p71Var.f(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                p71Var.e(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
        }
    }

    public static void s(int i, List list, sb0 sb0Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            p71 p71Var = (p71) sb0Var.c;
            int i2 = 0;
            if (list instanceof y71) {
                y71 y71Var = (y71) list;
                if (z) {
                    p71Var.i(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < y71Var.e; i4++) {
                        i3 += p71.o(y71Var.c(i4));
                    }
                    p71Var.k(i3);
                    while (i2 < y71Var.e) {
                        p71Var.h(y71Var.c(i2));
                        i2++;
                    }
                    return;
                }
                while (i2 < y71Var.e) {
                    p71Var.g(i, y71Var.c(i2));
                    i2++;
                }
                return;
            }
            if (z) {
                p71Var.i(i, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    i5 += p71.o(((Integer) list.get(i6)).intValue());
                }
                p71Var.k(i5);
                while (i2 < list.size()) {
                    p71Var.h(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                p71Var.g(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void t(int i, List list, sb0 sb0Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            p71 p71Var = (p71) sb0Var.c;
            int i2 = 0;
            if (list instanceof y71) {
                y71 y71Var = (y71) list;
                if (z) {
                    p71Var.i(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < y71Var.e; i4++) {
                        y71Var.c(i4);
                        i3 += 4;
                    }
                    p71Var.k(i3);
                    while (i2 < y71Var.e) {
                        p71Var.d(y71Var.c(i2));
                        i2++;
                    }
                    return;
                }
                while (i2 < y71Var.e) {
                    p71Var.c(i, y71Var.c(i2));
                    i2++;
                }
                return;
            }
            if (z) {
                p71Var.i(i, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    ((Integer) list.get(i6)).getClass();
                    i5 += 4;
                }
                p71Var.k(i5);
                while (i2 < list.size()) {
                    p71Var.d(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                p71Var.c(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void u(int i, List list, sb0 sb0Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            p71 p71Var = (p71) sb0Var.c;
            int i2 = 0;
            if (z) {
                p71Var.i(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Long) list.get(i4)).getClass();
                    i3 += 8;
                }
                p71Var.k(i3);
                while (i2 < list.size()) {
                    p71Var.f(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                p71Var.e(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    public static void v(int i, List list, sb0 sb0Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            p71 p71Var = (p71) sb0Var.c;
            int i2 = 0;
            if (z) {
                p71Var.i(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Float) list.get(i4)).getClass();
                    i3 += 4;
                }
                p71Var.k(i3);
                while (i2 < list.size()) {
                    p71Var.d(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                p71Var.c(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
        }
    }

    public static void w(int i, List list, sb0 sb0Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            p71 p71Var = (p71) sb0Var.c;
            int i2 = 0;
            if (list instanceof y71) {
                y71 y71Var = (y71) list;
                if (z) {
                    p71Var.i(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < y71Var.e; i4++) {
                        i3 += p71.o(y71Var.c(i4));
                    }
                    p71Var.k(i3);
                    while (i2 < y71Var.e) {
                        p71Var.h(y71Var.c(i2));
                        i2++;
                    }
                    return;
                }
                while (i2 < y71Var.e) {
                    p71Var.g(i, y71Var.c(i2));
                    i2++;
                }
                return;
            }
            if (z) {
                p71Var.i(i, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    i5 += p71.o(((Integer) list.get(i6)).intValue());
                }
                p71Var.k(i5);
                while (i2 < list.size()) {
                    p71Var.h(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                p71Var.g(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void x(int i, List list, sb0 sb0Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            p71 p71Var = (p71) sb0Var.c;
            int i2 = 0;
            if (z) {
                p71Var.i(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += p71.o(((Long) list.get(i4)).longValue());
                }
                p71Var.k(i3);
                while (i2 < list.size()) {
                    p71Var.m(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                p71Var.l(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    public static void y(int i, List list, sb0 sb0Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            p71 p71Var = (p71) sb0Var.c;
            int i2 = 0;
            if (list instanceof y71) {
                y71 y71Var = (y71) list;
                if (z) {
                    p71Var.i(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < y71Var.e; i4++) {
                        y71Var.c(i4);
                        i3 += 4;
                    }
                    p71Var.k(i3);
                    while (i2 < y71Var.e) {
                        p71Var.d(y71Var.c(i2));
                        i2++;
                    }
                    return;
                }
                while (i2 < y71Var.e) {
                    p71Var.c(i, y71Var.c(i2));
                    i2++;
                }
                return;
            }
            if (z) {
                p71Var.i(i, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    ((Integer) list.get(i6)).getClass();
                    i5 += 4;
                }
                p71Var.k(i5);
                while (i2 < list.size()) {
                    p71Var.d(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                p71Var.c(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }
}
