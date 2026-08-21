package defpackage;

import android.graphics.Insets;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class d20 {
    public static final d20 e = new d20(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public d20(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static d20 a(d20 d20Var, d20 d20Var2) {
        return b(Math.max(d20Var.a, d20Var2.a), Math.max(d20Var.b, d20Var2.b), Math.max(d20Var.c, d20Var2.c), Math.max(d20Var.d, d20Var2.d));
    }

    public static d20 b(int i, int i2, int i3, int i4) {
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return e;
        }
        return new d20(i, i2, i3, i4);
    }

    public static d20 c(Insets insets) {
        int i;
        int i2;
        int i3;
        int i4;
        i = insets.left;
        i2 = insets.top;
        i3 = insets.right;
        i4 = insets.bottom;
        return b(i, i2, i3, i4);
    }

    public final Insets d() {
        return e8.b(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d20.class != obj.getClass()) {
            return false;
        }
        d20 d20Var = (d20) obj;
        if (this.d == d20Var.d && this.a == d20Var.a && this.c == d20Var.c && this.b == d20Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        return "Insets{left=" + this.a + ", top=" + this.b + ", right=" + this.c + ", bottom=" + this.d + '}';
    }
}
