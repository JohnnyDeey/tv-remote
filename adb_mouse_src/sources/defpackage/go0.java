package defpackage;

import java.io.ByteArrayOutputStream;

/* loaded from: classes.dex */
public final class go0 {
    public final short a;
    public final short b;
    public static final go0 c = a(2074);
    public static final go0 d = a(2075);
    public static final go0 e = a(2076);
    public static final go0 f = a(2055);
    public static final go0 g = a(2056);
    public static final go0 h = new go0(8, 64);
    public static final go0 i = new go0(8, 65);
    public static final go0 j = a(2308);
    public static final go0 k = a(2309);
    public static final go0 l = a(2310);
    public static final go0 m = a(2052);
    public static final go0 n = a(2053);
    public static final go0 o = a(2054);
    public static final go0 p = a(2057);
    public static final go0 q = a(2058);
    public static final go0 r = a(2059);
    public static final go0 s = a(2321);
    public static final go0 t = a(2322);
    public static final go0 u = a(2323);
    public static final go0 v = a(2324);
    public static final go0 w = a(2325);
    public static final go0 x = a(2326);
    public static final go0 y = a(2327);
    public static final go0 z = a(2328);
    public static final go0 A = a(2329);
    public static final go0 B = a(2330);
    public static final go0 C = a(2331);
    public static final go0 D = a(2332);

    public go0(short s2, short s3) {
        if ((s2 & 255) == s2) {
            if ((s3 & 255) == s3) {
                this.a = s2;
                this.b = s3;
                return;
            } else {
                c.k("'signature' should be a uint8");
                throw null;
            }
        }
        c.k("'hash' should be a uint8");
        throw null;
    }

    public static go0 a(int i2) {
        return new go0((short) ((i2 >>> 8) & 255), (short) (i2 & 255));
    }

    public static go0 c(short s2, short s3) {
        if (s2 != 8) {
            return new go0(s2, s3);
        }
        if (s3 != 64) {
            if (s3 != 65) {
                switch (s3) {
                    case 4:
                        return m;
                    case 5:
                        return n;
                    case 6:
                        return o;
                    case 7:
                        return f;
                    case 8:
                        return g;
                    case 9:
                        return p;
                    case 10:
                        return q;
                    case 11:
                        return r;
                    default:
                        switch (s3) {
                            case 26:
                                return c;
                            case 27:
                                return d;
                            case 28:
                                return e;
                            default:
                                return new go0((short) 8, s3);
                        }
                }
            }
            return i;
        }
        return h;
    }

    public final void b(ByteArrayOutputStream byteArrayOutputStream) {
        byte[] bArr = ht0.a;
        byteArrayOutputStream.write(this.a);
        byteArrayOutputStream.write(this.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof go0)) {
            return false;
        }
        go0 go0Var = (go0) obj;
        if (go0Var.a != this.a || go0Var.b != this.b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b | (this.a << 16);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        sb.append(f20.I(this.a));
        sb.append(",");
        StringBuilder sb2 = new StringBuilder();
        short s2 = this.b;
        sb2.append(oi0.g(s2));
        sb2.append("(");
        sb2.append((int) s2);
        sb2.append(")");
        return qo0.s(sb, sb2.toString(), "}");
    }
}
