package defpackage;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public abstract class n71 implements Iterable, Serializable {
    public static final o71 d = new o71(d81.b);
    public int c = 0;

    static {
        int i = j71.a;
    }

    public static int i(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) < 0) {
            if (i >= 0) {
                if (i2 < i) {
                    c.m(qo0.o("Beginning index larger than ending index: ", i, ", ", i2));
                    return 0;
                }
                c.m(qo0.o("End index: ", i2, " >= ", i3));
                return 0;
            }
            c.m(qo0.n("Beginning index: ", i, " < 0"));
            return 0;
        }
        return i4;
    }

    public static o71 j(byte[] bArr, int i, int i2) {
        try {
            i(i, i + i2, bArr.length);
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            return new o71(bArr2);
        } catch (f81 e) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
        }
    }

    public static /* bridge */ /* synthetic */ boolean k(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        int i4 = i + i3;
        i(i, i4, bArr.length);
        i(i2, i3 + i2, bArr2.length);
        while (i < i4) {
            if (bArr[i] != bArr2[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    public abstract byte b(int i);

    public abstract byte c(int i);

    public abstract int d(int i, int i2);

    public abstract int e();

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof n71) {
                n71 n71Var = (n71) obj;
                int e = e();
                if (e == n71Var.e()) {
                    if (e != 0) {
                        int i = this.c;
                        int i2 = n71Var.c;
                        if (i != 0 && i2 != 0 && i != i2) {
                            return false;
                        }
                        return h(n71Var);
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public abstract n71 f(int i, int i2);

    public abstract void g(p71 p71Var);

    public abstract boolean h(n71 n71Var);

    public final int hashCode() {
        int i = this.c;
        if (i == 0) {
            int e = e();
            i = d(e, e);
            if (i == 0) {
                i = 1;
            }
            this.c = i;
        }
        return i;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new l71(this);
    }

    public final String toString() {
        String concat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int e = e();
        if (e() <= 50) {
            concat = wg0.B(this);
        } else {
            concat = wg0.B(f(0, 47)).concat("...");
        }
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(e);
        sb.append(" contents=\"");
        return qo0.s(sb, concat, "\">");
    }
}
