package defpackage;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class nf0 {
    public final int a;
    public final boolean b;
    public final String c;
    public final String d;

    public nf0(int i, String str, String str2, boolean z) {
        this.a = i;
        this.b = z;
        this.c = str;
        this.d = str2;
    }

    public static nf0 a(nf0 nf0Var, int i, boolean z, String str, String str2, int i2) {
        if ((i2 & 1) != 0) {
            i = nf0Var.a;
        }
        if ((i2 & 2) != 0) {
            z = nf0Var.b;
        }
        if ((i2 & 4) != 0) {
            str = nf0Var.c;
        }
        if ((i2 & 8) != 0) {
            str2 = nf0Var.d;
        }
        str.getClass();
        str2.getClass();
        return new nf0(i, str, str2, z);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof nf0) {
                nf0 nf0Var = (nf0) obj;
                if (this.a != nf0Var.a || this.b != nf0Var.b || !this.c.equals(nf0Var.c) || !this.d.equals(nf0Var.d)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((Boolean.hashCode(this.b) + (Integer.hashCode(this.a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ProfileSettings(mouseSensitivity=" + this.a + ", horizontalOrientation=" + this.b + ", ip=" + this.c + ", port=" + this.d + ')';
    }
}
