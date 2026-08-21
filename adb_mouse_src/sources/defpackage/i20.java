package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class i20 implements Iterable {
    public final int c;
    public final int d;
    public final int e;

    static {
        new i20(1, 0, 1);
    }

    public i20(int i, int i2, int i3) {
        if (i3 != 0) {
            if (i3 != Integer.MIN_VALUE) {
                this.c = i;
                if (i3 > 0) {
                    if (i < i2) {
                        int i4 = i2 % i3;
                        int i5 = i % i3;
                        int i6 = ((i4 < 0 ? i4 + i3 : i4) - (i5 < 0 ? i5 + i3 : i5)) % i3;
                        i2 -= i6 < 0 ? i6 + i3 : i6;
                    }
                } else if (i3 < 0) {
                    if (i > i2) {
                        int i7 = -i3;
                        int i8 = i % i7;
                        int i9 = i2 % i7;
                        int i10 = ((i8 < 0 ? i8 + i7 : i8) - (i9 < 0 ? i9 + i7 : i9)) % i7;
                        i2 += i10 < 0 ? i10 + i7 : i10;
                    }
                } else {
                    c.k("Step is zero.");
                    throw null;
                }
                this.d = i2;
                this.e = i3;
                return;
            }
            c.k("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
            throw null;
        }
        c.k("Step must be non-zero.");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i20) {
            if (!isEmpty() || !((i20) obj).isEmpty()) {
                i20 i20Var = (i20) obj;
                if (this.c == i20Var.c && this.d == i20Var.d) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.c * 31) + this.d;
    }

    public final boolean isEmpty() {
        if (this.c > this.d) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new h20(this.c, this.d, this.e);
    }

    public final String toString() {
        return this.c + ".." + this.d;
    }
}
