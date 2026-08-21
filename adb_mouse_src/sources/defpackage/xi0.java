package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class xi0 implements qu0 {
    public final g00 c;
    public final int d;
    public final tu e;
    public final t30 f;

    public xi0(g00 g00Var, int i, tu tuVar, t30 t30Var) {
        List list = Collections.EMPTY_LIST;
        this.c = g00Var;
        this.d = i;
        this.e = tuVar;
        this.f = t30Var;
    }

    public static void b(Class cls, String str, Field field, Field field2) {
        throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + str + "'; conflict is caused by fields " + ri0.c(field) + " and " + ri0.c(field2) + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("duplicate-fields"));
    }

    @Override // defpackage.qu0
    public final pu0 a(k00 k00Var, xv0 xv0Var) {
        Class cls = xv0Var.a;
        if (!Object.class.isAssignableFrom(cls)) {
            return null;
        }
        oi0 oi0Var = ri0.a;
        if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
            return new lc0(3);
        }
        List list = Collections.EMPTY_LIST;
        mi0.u();
        if (ri0.a.n(cls)) {
            return new wi0(cls, c(k00Var, xv0Var, cls, true));
        }
        this.c.e(xv0Var, true);
        return new ti0(c(k00Var, xv0Var, cls, false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x010f  */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.vi0 c(defpackage.k00 r24, defpackage.xv0 r25, java.lang.Class r26, boolean r27) {
        /*
            Method dump skipped, instructions count: 566
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xi0.c(k00, xv0, java.lang.Class, boolean):vi0");
    }

    public final boolean d(Field field, boolean z) {
        List list;
        boolean z2;
        tu tuVar = this.e;
        tuVar.getClass();
        if ((136 & field.getModifiers()) != 0 || field.isSynthetic() || tuVar.b(field.getType(), z)) {
            z2 = true;
        } else {
            if (z) {
                list = tuVar.c;
            } else {
                list = tuVar.d;
            }
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    throw qo0.l(it);
                }
            }
            z2 = false;
        }
        return !z2;
    }
}
