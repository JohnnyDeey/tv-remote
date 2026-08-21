package defpackage;

/* loaded from: classes.dex */
public final class xf0 {
    public static final xf0 c;
    public static final xf0 d;
    public static final xf0 e;
    public static final xf0 f;
    public static final xf0 g;
    public static final xf0 h;
    public static final xf0 i;
    public static final xf0 j;
    public static final xf0 k;
    public static final xf0 l;
    public final int a;
    public final String b;

    static {
        xf0 xf0Var = new xf0("SSL 3.0", 768);
        c = xf0Var;
        d = new xf0("TLS 1.0", 769);
        e = new xf0("TLS 1.1", 770);
        f = new xf0("TLS 1.2", 771);
        xf0 xf0Var2 = new xf0("TLS 1.3", 772);
        g = xf0Var2;
        h = new xf0("DTLS 1.0", 65279);
        i = new xf0("DTLS 1.2", 65277);
        j = new xf0("DTLS 1.3", 65276);
        k = xf0Var;
        l = xf0Var2;
    }

    public xf0(String str, int i2) {
        this.a = i2 & 65535;
        this.b = str;
    }

    public static boolean a(xf0[] xf0VarArr, xf0 xf0Var) {
        if (xf0VarArr != null && xf0Var != null) {
            for (xf0 xf0Var2 : xf0VarArr) {
                if (xf0Var.b(xf0Var2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static xf0 c(int i2, int i3) {
        if (i2 != 3) {
            if (i2 != 254) {
                return g("UNKNOWN", i2, i3);
            }
            switch (i3) {
                case 252:
                    return j;
                case 253:
                    return i;
                case 254:
                    c.k("{0xFE, 0xFE} is a reserved protocol version");
                    return null;
                case 255:
                    return h;
                default:
                    return g("DTLS", i2, i3);
            }
        }
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 != 4) {
                            return g("TLS", i2, i3);
                        }
                        return g;
                    }
                    return f;
                }
                return e;
            }
            return d;
        }
        return c;
    }

    public static xf0 g(String str, int i2, int i3) {
        byte[] bArr = ht0.a;
        if ((i2 & 255) == i2) {
            if ((i3 & 255) == i3) {
                int i4 = (i2 << 8) | i3;
                return new xf0(str + " 0x" + yp0.f(Integer.toHexString(65536 | i4).substring(1)), i4);
            }
            c.k("'versionOctet' is not a valid octet");
            return null;
        }
        c.k("'versionOctet' is not a valid octet");
        return null;
    }

    public final boolean b(xf0 xf0Var) {
        if (xf0Var != null && this.a == xf0Var.a) {
            return true;
        }
        return false;
    }

    public final xf0 d() {
        int e2 = e();
        if (e2 != 3) {
            if (e2 == 254) {
                int f2 = f();
                if (f2 != 252) {
                    if (f2 != 253) {
                        if (f2 != 255) {
                            return null;
                        }
                        return e;
                    }
                    return f;
                }
                return g;
            }
            return null;
        }
        return this;
    }

    public final int e() {
        return this.a >> 8;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof xf0) || !b((xf0) obj)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int f() {
        return this.a & 255;
    }

    public final boolean h() {
        if (e() == 254) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final boolean i(xf0 xf0Var) {
        if (xf0Var != null && e() == xf0Var.e()) {
            int f2 = f() - xf0Var.f();
            if (h()) {
                if (f2 < 0) {
                    return false;
                }
                return true;
            }
            if (f2 <= 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean j(xf0 xf0Var) {
        if (xf0Var != null && e() == xf0Var.e()) {
            int f2 = f() - xf0Var.f();
            if (h()) {
                if (f2 >= 0) {
                    return false;
                }
                return true;
            }
            if (f2 > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean k() {
        if (this == c) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return this.b;
    }
}
