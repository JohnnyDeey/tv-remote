package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class bf0 extends o8 {
    public ro0[] f;
    public ro0[] g;
    public int h;
    public r6 i;

    @Override // defpackage.o8
    public final ro0 d(boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.h; i2++) {
            ro0[] ro0VarArr = this.f;
            ro0 ro0Var = ro0VarArr[i2];
            if (!zArr[ro0Var.d]) {
                r6 r6Var = this.i;
                r6Var.d = ro0Var;
                int i3 = 8;
                if (i == -1) {
                    while (i3 >= 0) {
                        float f = ((ro0) r6Var.d).j[i3];
                        if (f <= 0.0f) {
                            if (f < 0.0f) {
                                i = i2;
                                break;
                            }
                            i3--;
                        }
                    }
                } else {
                    ro0 ro0Var2 = ro0VarArr[i];
                    while (true) {
                        if (i3 >= 0) {
                            float f2 = ro0Var2.j[i3];
                            float f3 = ((ro0) r6Var.d).j[i3];
                            if (f3 == f2) {
                                i3--;
                            } else if (f3 >= f2) {
                            }
                        }
                    }
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.f[i];
    }

    @Override // defpackage.o8
    public final boolean e() {
        if (this.h == 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.o8
    public final void i(e60 e60Var, o8 o8Var, boolean z) {
        ro0 ro0Var = o8Var.a;
        if (ro0Var == null) {
            return;
        }
        float[] fArr = ro0Var.j;
        i8 i8Var = o8Var.d;
        int d = i8Var.d();
        for (int i = 0; i < d; i++) {
            ro0 e = i8Var.e(i);
            float f = i8Var.f(i);
            r6 r6Var = this.i;
            r6Var.d = e;
            if (e.c) {
                boolean z2 = true;
                for (int i2 = 0; i2 < 9; i2++) {
                    float[] fArr2 = ((ro0) r6Var.d).j;
                    float f2 = (fArr[i2] * f) + fArr2[i2];
                    fArr2[i2] = f2;
                    if (Math.abs(f2) < 1.0E-4f) {
                        ((ro0) r6Var.d).j[i2] = 0.0f;
                    } else {
                        z2 = false;
                    }
                }
                if (z2) {
                    ((bf0) r6Var.e).k((ro0) r6Var.d);
                }
            } else {
                for (int i3 = 0; i3 < 9; i3++) {
                    float f3 = fArr[i3];
                    if (f3 != 0.0f) {
                        float f4 = f3 * f;
                        if (Math.abs(f4) < 1.0E-4f) {
                            f4 = 0.0f;
                        }
                        ((ro0) r6Var.d).j[i3] = f4;
                    } else {
                        ((ro0) r6Var.d).j[i3] = 0.0f;
                    }
                }
                j(e);
            }
            this.b = (o8Var.b * f) + this.b;
        }
        k(ro0Var);
    }

    public final void j(ro0 ro0Var) {
        int i;
        ro0[] ro0VarArr;
        int i2 = this.h + 1;
        ro0[] ro0VarArr2 = this.f;
        if (i2 > ro0VarArr2.length) {
            ro0[] ro0VarArr3 = (ro0[]) Arrays.copyOf(ro0VarArr2, ro0VarArr2.length * 2);
            this.f = ro0VarArr3;
            this.g = (ro0[]) Arrays.copyOf(ro0VarArr3, ro0VarArr3.length * 2);
        }
        ro0[] ro0VarArr4 = this.f;
        int i3 = this.h;
        ro0VarArr4[i3] = ro0Var;
        int i4 = i3 + 1;
        this.h = i4;
        if (i4 > 1 && ro0VarArr4[i3].d > ro0Var.d) {
            int i5 = 0;
            while (true) {
                i = this.h;
                ro0VarArr = this.g;
                if (i5 >= i) {
                    break;
                }
                ro0VarArr[i5] = this.f[i5];
                i5++;
            }
            Arrays.sort(ro0VarArr, 0, i, new yk(3));
            for (int i6 = 0; i6 < this.h; i6++) {
                this.f[i6] = this.g[i6];
            }
        }
        ro0Var.c = true;
        ro0Var.a(this);
    }

    public final void k(ro0 ro0Var) {
        int i = 0;
        while (i < this.h) {
            if (this.f[i] == ro0Var) {
                while (true) {
                    int i2 = this.h;
                    if (i < i2 - 1) {
                        ro0[] ro0VarArr = this.f;
                        int i3 = i + 1;
                        ro0VarArr[i] = ro0VarArr[i3];
                        i = i3;
                    } else {
                        this.h = i2 - 1;
                        ro0Var.c = false;
                        return;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // defpackage.o8
    public final String toString() {
        r6 r6Var = this.i;
        String str = " goal -> (" + this.b + ") : ";
        for (int i = 0; i < this.h; i++) {
            r6Var.d = this.f[i];
            str = str + r6Var + " ";
        }
        return str;
    }
}
