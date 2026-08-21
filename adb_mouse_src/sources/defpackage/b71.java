package defpackage;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class b71 extends x71 {
    private static final b71 zzb;
    private a81 zzd = s81.g;

    static {
        b71 b71Var = new b71();
        zzb = b71Var;
        x71.f(b71.class, b71Var);
    }

    public static a71 q() {
        return (a71) zzb.k();
    }

    public static void r(b71 b71Var, ArrayList arrayList) {
        a81 a81Var = b71Var.zzd;
        if (!((i71) a81Var).c) {
            int size = a81Var.size();
            b71Var.zzd = a81Var.a(size + size);
        }
        List list = b71Var.zzd;
        Charset charset = d81.a;
        int size2 = arrayList.size();
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(list.size() + size2);
        } else if (list instanceof s81) {
            s81 s81Var = (s81) list;
            int i = s81Var.e + size2;
            int length = s81Var.d.length;
            if (i > length) {
                if (length != 0) {
                    while (length < i) {
                        length = Math.max(((length * 3) / 2) + 1, 10);
                    }
                    s81Var.d = Arrays.copyOf(s81Var.d, length);
                } else {
                    s81Var.d = new Object[Math.max(i, 10)];
                }
            }
        }
        int size3 = list.size();
        int size4 = arrayList.size();
        for (int i2 = 0; i2 < size4; i2++) {
            Object obj = arrayList.get(i2);
            if (obj == null) {
                String n = qo0.n("Element at index ", list.size() - size3, " is null.");
                int size5 = list.size();
                while (true) {
                    size5--;
                    if (size5 >= size3) {
                        list.remove(size5);
                    } else {
                        c.g(n);
                        return;
                    }
                }
            } else {
                list.add(obj);
            }
        }
    }

    @Override // defpackage.x71
    public final Object j(int i) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 == 5) {
                            return zzb;
                        }
                        throw null;
                    }
                    return new w71(zzb);
                }
                return new b71();
            }
            return new t81(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", z61.class});
        }
        return (byte) 1;
    }
}
