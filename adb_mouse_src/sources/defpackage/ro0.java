package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class ro0 implements Comparable {
    public boolean c;
    public float g;
    public int n;
    public int d = -1;
    public int e = -1;
    public int f = 0;
    public boolean h = false;
    public final float[] i = new float[9];
    public final float[] j = new float[9];
    public o8[] k = new o8[16];
    public int l = 0;
    public int m = 0;

    public ro0(int i) {
        this.n = i;
    }

    public final void a(o8 o8Var) {
        int i = 0;
        while (true) {
            int i2 = this.l;
            o8[] o8VarArr = this.k;
            if (i < i2) {
                if (o8VarArr[i] == o8Var) {
                    return;
                } else {
                    i++;
                }
            } else {
                if (i2 >= o8VarArr.length) {
                    this.k = (o8[]) Arrays.copyOf(o8VarArr, o8VarArr.length * 2);
                }
                o8[] o8VarArr2 = this.k;
                int i3 = this.l;
                o8VarArr2[i3] = o8Var;
                this.l = i3 + 1;
                return;
            }
        }
    }

    public final void b(o8 o8Var) {
        int i = this.l;
        int i2 = 0;
        while (i2 < i) {
            if (this.k[i2] == o8Var) {
                while (i2 < i - 1) {
                    o8[] o8VarArr = this.k;
                    int i3 = i2 + 1;
                    o8VarArr[i2] = o8VarArr[i3];
                    i2 = i3;
                }
                this.l--;
                return;
            }
            i2++;
        }
    }

    public final void c() {
        this.n = 5;
        this.f = 0;
        this.d = -1;
        this.e = -1;
        this.g = 0.0f;
        this.h = false;
        int i = this.l;
        for (int i2 = 0; i2 < i; i2++) {
            this.k[i2] = null;
        }
        this.l = 0;
        this.m = 0;
        this.c = false;
        Arrays.fill(this.j, 0.0f);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.d - ((ro0) obj).d;
    }

    public final void d(e60 e60Var, float f) {
        this.g = f;
        this.h = true;
        int i = this.l;
        this.e = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.k[i2].h(e60Var, this, false);
        }
        this.l = 0;
    }

    public final void e(e60 e60Var, o8 o8Var) {
        int i = this.l;
        for (int i2 = 0; i2 < i; i2++) {
            this.k[i2].i(e60Var, o8Var, false);
        }
        this.l = 0;
    }

    public final String toString() {
        return "" + this.d;
    }
}
