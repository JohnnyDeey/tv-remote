package defpackage;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class z81 extends b91 {
    @Override // defpackage.b91
    public final double e(long j, Object obj) {
        return Double.longBitsToDouble(((Unsafe) this.b).getLong(obj, j));
    }

    @Override // defpackage.b91
    public final float f(long j, Object obj) {
        return Float.intBitsToFloat(((Unsafe) this.b).getInt(obj, j));
    }

    @Override // defpackage.b91
    public final void g(Object obj, long j, boolean z) {
        if (c91.g) {
            c91.c(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            c91.d(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // defpackage.b91
    public final void h(Object obj, long j, byte b) {
        if (c91.g) {
            c91.c(obj, j, b);
        } else {
            c91.d(obj, j, b);
        }
    }

    @Override // defpackage.b91
    public final void i(Object obj, long j, double d) {
        ((Unsafe) this.b).putLong(obj, j, Double.doubleToLongBits(d));
    }

    @Override // defpackage.b91
    public final void j(Object obj, long j, float f) {
        ((Unsafe) this.b).putInt(obj, j, Float.floatToIntBits(f));
    }

    @Override // defpackage.b91
    public final boolean k(long j, Object obj) {
        if (c91.g) {
            return c91.m(j, obj);
        }
        return c91.n(j, obj);
    }
}
