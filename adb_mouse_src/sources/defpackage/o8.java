package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public class o8 {
    public final i8 d;
    public ro0 a = null;
    public float b = 0.0f;
    public final ArrayList c = new ArrayList();
    public boolean e = false;

    public o8(b8 b8Var) {
        this.d = new i8(this, b8Var);
    }

    public final void a(e60 e60Var, int i) {
        ro0 j = e60Var.j(i);
        i8 i8Var = this.d;
        i8Var.g(j, 1.0f);
        i8Var.g(e60Var.j(i), -1.0f);
    }

    public final void b(ro0 ro0Var, ro0 ro0Var2, ro0 ro0Var3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        i8 i8Var = this.d;
        if (!z) {
            i8Var.g(ro0Var, -1.0f);
            i8Var.g(ro0Var2, 1.0f);
            i8Var.g(ro0Var3, 1.0f);
        } else {
            i8Var.g(ro0Var, 1.0f);
            i8Var.g(ro0Var2, -1.0f);
            i8Var.g(ro0Var3, -1.0f);
        }
    }

    public final void c(ro0 ro0Var, ro0 ro0Var2, ro0 ro0Var3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        i8 i8Var = this.d;
        if (!z) {
            i8Var.g(ro0Var, -1.0f);
            i8Var.g(ro0Var2, 1.0f);
            i8Var.g(ro0Var3, -1.0f);
        } else {
            i8Var.g(ro0Var, 1.0f);
            i8Var.g(ro0Var2, -1.0f);
            i8Var.g(ro0Var3, 1.0f);
        }
    }

    public ro0 d(boolean[] zArr) {
        return f(zArr, null);
    }

    public boolean e() {
        if (this.a == null && this.b == 0.0f && this.d.d() == 0) {
            return true;
        }
        return false;
    }

    public final ro0 f(boolean[] zArr, ro0 ro0Var) {
        int i;
        i8 i8Var = this.d;
        int d = i8Var.d();
        ro0 ro0Var2 = null;
        float f = 0.0f;
        for (int i2 = 0; i2 < d; i2++) {
            float f2 = i8Var.f(i2);
            if (f2 < 0.0f) {
                ro0 e = i8Var.e(i2);
                if ((zArr == null || !zArr[e.d]) && e != ro0Var && (((i = e.n) == 3 || i == 4) && f2 < f)) {
                    f = f2;
                    ro0Var2 = e;
                }
            }
        }
        return ro0Var2;
    }

    public final void g(ro0 ro0Var) {
        ro0 ro0Var2 = this.a;
        i8 i8Var = this.d;
        if (ro0Var2 != null) {
            i8Var.g(ro0Var2, -1.0f);
            this.a.e = -1;
            this.a = null;
        }
        float h = i8Var.h(ro0Var, true) * (-1.0f);
        this.a = ro0Var;
        if (h == 1.0f) {
            return;
        }
        this.b /= h;
        int i = i8Var.h;
        for (int i2 = 0; i != -1 && i2 < i8Var.a; i2++) {
            float[] fArr = i8Var.g;
            fArr[i] = fArr[i] / h;
            i = i8Var.f[i];
        }
    }

    public final void h(e60 e60Var, ro0 ro0Var, boolean z) {
        if (ro0Var.h) {
            i8 i8Var = this.d;
            float c = i8Var.c(ro0Var);
            this.b = (ro0Var.g * c) + this.b;
            i8Var.h(ro0Var, z);
            if (z) {
                ro0Var.b(this);
            }
            if (i8Var.d() == 0) {
                this.e = true;
                e60Var.b = true;
            }
        }
    }

    public void i(e60 e60Var, o8 o8Var, boolean z) {
        i8 i8Var = this.d;
        i8Var.getClass();
        float c = i8Var.c(o8Var.a);
        i8Var.h(o8Var.a, z);
        i8 i8Var2 = o8Var.d;
        int d = i8Var2.d();
        for (int i = 0; i < d; i++) {
            ro0 e = i8Var2.e(i);
            i8Var.a(e, i8Var2.c(e) * c, z);
        }
        this.b = (o8Var.b * c) + this.b;
        if (z) {
            o8Var.a.b(this);
        }
        if (this.a != null && i8Var.d() == 0) {
            this.e = true;
            e60Var.b = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            r10 = this;
            ro0 r0 = r10.a
            if (r0 != 0) goto L7
            java.lang.String r0 = "0"
            goto L17
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = ""
            r0.<init>(r1)
            ro0 r1 = r10.a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L17:
            java.lang.String r1 = " = "
            java.lang.String r0 = r0.concat(r1)
            float r1 = r10.b
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L39
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            float r0 = r10.b
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = r4
            goto L3a
        L39:
            r1 = r3
        L3a:
            i8 r10 = r10.d
            int r5 = r10.d()
        L40:
            if (r3 >= r5) goto L9c
            ro0 r6 = r10.e(r3)
            if (r6 != 0) goto L49
            goto L99
        L49:
            float r7 = r10.f(r3)
            int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r8 != 0) goto L52
            goto L99
        L52:
            java.lang.String r6 = r6.toString()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L66
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 >= 0) goto L76
            java.lang.String r1 = "- "
            java.lang.String r0 = r0.concat(r1)
        L64:
            float r7 = r7 * r9
            goto L76
        L66:
            if (r8 <= 0) goto L6f
            java.lang.String r1 = " + "
            java.lang.String r0 = r0.concat(r1)
            goto L76
        L6f:
            java.lang.String r1 = " - "
            java.lang.String r0 = r0.concat(r1)
            goto L64
        L76:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L81
            java.lang.String r0 = r0.concat(r6)
            goto L98
        L81:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
        L98:
            r1 = r4
        L99:
            int r3 = r3 + 1
            goto L40
        L9c:
            if (r1 != 0) goto La5
            java.lang.String r10 = "0.0"
            java.lang.String r10 = r0.concat(r10)
            return r10
        La5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o8.toString():java.lang.String");
    }
}
