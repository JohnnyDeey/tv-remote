package defpackage;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class xg {
    public long a = 0;
    public xg b;

    public final void a(int i) {
        if (i >= 64) {
            xg xgVar = this.b;
            if (xgVar != null) {
                xgVar.a(i - 64);
                return;
            }
            return;
        }
        this.a &= ~(1 << i);
    }

    public final int b(int i) {
        xg xgVar = this.b;
        if (xgVar == null) {
            long j = this.a;
            if (i >= 64) {
                return Long.bitCount(j);
            }
            return Long.bitCount(((1 << i) - 1) & j);
        }
        if (i < 64) {
            return Long.bitCount(((1 << i) - 1) & this.a);
        }
        return Long.bitCount(this.a) + xgVar.b(i - 64);
    }

    public final void c() {
        if (this.b == null) {
            this.b = new xg();
        }
    }

    public final boolean d(int i) {
        if (i >= 64) {
            c();
            return this.b.d(i - 64);
        }
        if (((1 << i) & this.a) != 0) {
            return true;
        }
        return false;
    }

    public final void e(int i, boolean z) {
        boolean z2;
        if (i >= 64) {
            c();
            this.b.e(i - 64, z);
            return;
        }
        long j = this.a;
        if ((Long.MIN_VALUE & j) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        long j2 = (1 << i) - 1;
        this.a = ((j & (~j2)) << 1) | (j & j2);
        if (z) {
            h(i);
        } else {
            a(i);
        }
        if (!z2 && this.b == null) {
            return;
        }
        c();
        this.b.e(0, z2);
    }

    public final boolean f(int i) {
        boolean z;
        if (i >= 64) {
            c();
            return this.b.f(i - 64);
        }
        long j = 1 << i;
        long j2 = this.a;
        if ((j2 & j) != 0) {
            z = true;
        } else {
            z = false;
        }
        long j3 = j2 & (~j);
        this.a = j3;
        long j4 = j - 1;
        this.a = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
        xg xgVar = this.b;
        if (xgVar != null) {
            if (xgVar.d(0)) {
                h(63);
            }
            this.b.f(0);
        }
        return z;
    }

    public final void g() {
        this.a = 0L;
        xg xgVar = this.b;
        if (xgVar != null) {
            xgVar.g();
        }
    }

    public final void h(int i) {
        if (i >= 64) {
            c();
            this.b.h(i - 64);
        } else {
            this.a |= 1 << i;
        }
    }

    public final String toString() {
        if (this.b == null) {
            return Long.toBinaryString(this.a);
        }
        return this.b.toString() + "xx" + Long.toBinaryString(this.a);
    }
}
