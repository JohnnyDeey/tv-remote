package defpackage;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public class g40 implements Closeable, Flushable {
    public static final Pattern n = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");
    public static final String[] o = new String[128];
    public static final String[] p;
    public final Writer c;
    public int[] d;
    public int e;
    public ax f;
    public String g;
    public String h;
    public boolean i;
    public int j;
    public boolean k;
    public String l;
    public boolean m;

    static {
        for (int i = 0; i <= 31; i++) {
            o[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = o;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        p = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public g40(Writer writer) {
        int[] iArr = new int[32];
        this.d = iArr;
        this.e = 0;
        if (iArr.length == 0) {
            this.d = Arrays.copyOf(iArr, 0);
        }
        int[] iArr2 = this.d;
        int i = this.e;
        this.e = i + 1;
        iArr2[i] = 6;
        this.j = 2;
        this.m = true;
        Objects.requireNonNull(writer, "out == null");
        this.c = writer;
        k(ax.d);
    }

    public final void a() {
        int j = j();
        if (j != 1) {
            Writer writer = this.c;
            if (j != 2) {
                if (j != 4) {
                    if (j != 6) {
                        if (j == 7) {
                            if (this.j != 1) {
                                c.o("JSON must have only one top-level value.");
                                return;
                            }
                        } else {
                            c.o("Nesting problem.");
                            return;
                        }
                    }
                    this.d[this.e - 1] = 7;
                    return;
                }
                writer.append((CharSequence) this.g);
                this.d[this.e - 1] = 5;
                return;
            }
            writer.append((CharSequence) this.h);
            h();
            return;
        }
        this.d[this.e - 1] = 2;
        h();
    }

    public void b() {
        r();
        a();
        int i = this.e;
        int[] iArr = this.d;
        if (i == iArr.length) {
            this.d = Arrays.copyOf(iArr, i * 2);
        }
        int[] iArr2 = this.d;
        int i2 = this.e;
        this.e = i2 + 1;
        iArr2[i2] = 1;
        this.c.write(91);
    }

    public void c() {
        r();
        a();
        int i = this.e;
        int[] iArr = this.d;
        if (i == iArr.length) {
            this.d = Arrays.copyOf(iArr, i * 2);
        }
        int[] iArr2 = this.d;
        int i2 = this.e;
        this.e = i2 + 1;
        iArr2[i2] = 3;
        this.c.write(123);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.c.close();
        int i = this.e;
        if (i <= 1 && (i != 1 || this.d[i - 1] == 7)) {
            this.e = 0;
            return;
        }
        throw new IOException("Incomplete document");
    }

    public final void d(int i, int i2, char c) {
        int j = j();
        if (j != i2 && j != i) {
            c.o("Nesting problem.");
            return;
        }
        if (this.l == null) {
            this.e--;
            if (j == i2) {
                h();
            }
            this.c.write(c);
            return;
        }
        f40.e(this.l, "Dangling name: ");
    }

    public void e() {
        d(1, 2, ']');
    }

    public void f() {
        d(3, 5, '}');
    }

    @Override // java.io.Flushable
    public void flush() {
        if (this.e != 0) {
            this.c.flush();
        } else {
            c.o("JsonWriter is closed.");
        }
    }

    public void g(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.l == null) {
            int j = j();
            if (j != 3 && j != 5) {
                c.o("Please begin an object before writing a name.");
                return;
            } else {
                this.l = str;
                return;
            }
        }
        c.o("Already wrote a name, expecting a value.");
    }

    public final void h() {
        if (!this.i) {
            String str = this.f.a;
            Writer writer = this.c;
            writer.write(str);
            int i = this.e;
            for (int i2 = 1; i2 < i; i2++) {
                writer.write(this.f.b);
            }
        }
    }

    public g40 i() {
        if (this.l != null) {
            if (this.m) {
                r();
            } else {
                this.l = null;
                return this;
            }
        }
        a();
        this.c.write("null");
        return this;
    }

    public final int j() {
        int i = this.e;
        if (i != 0) {
            return this.d[i - 1];
        }
        c.o("JsonWriter is closed.");
        return 0;
    }

    public final void k(ax axVar) {
        boolean z;
        Objects.requireNonNull(axVar);
        this.f = axVar;
        this.h = ",";
        if (axVar.c) {
            this.g = ": ";
            if (axVar.a.isEmpty()) {
                this.h = ", ";
            }
        } else {
            this.g = ":";
        }
        if (this.f.a.isEmpty() && this.f.b.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        this.i = z;
    }

    public final void l(int i) {
        if (i != 0) {
            this.j = i;
            return;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(java.lang.String r8) {
        /*
            r7 = this;
            boolean r0 = r7.k
            if (r0 == 0) goto L7
            java.lang.String[] r0 = defpackage.g40.p
            goto L9
        L7:
            java.lang.String[] r0 = defpackage.g40.o
        L9:
            java.io.Writer r7 = r7.c
            r1 = 34
            r7.write(r1)
            int r2 = r8.length()
            r3 = 0
            r4 = r3
        L16:
            if (r3 >= r2) goto L41
            char r5 = r8.charAt(r3)
            r6 = 128(0x80, float:1.8E-43)
            if (r5 >= r6) goto L25
            r5 = r0[r5]
            if (r5 != 0) goto L32
            goto L3e
        L25:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L2c
            java.lang.String r5 = "\\u2028"
            goto L32
        L2c:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L3e
            java.lang.String r5 = "\\u2029"
        L32:
            if (r4 >= r3) goto L39
            int r6 = r3 - r4
            r7.write(r8, r4, r6)
        L39:
            r7.write(r5)
            int r4 = r3 + 1
        L3e:
            int r3 = r3 + 1
            goto L16
        L41:
            if (r4 >= r2) goto L47
            int r2 = r2 - r4
            r7.write(r8, r4, r2)
        L47:
            r7.write(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g40.m(java.lang.String):void");
    }

    public void n(double d) {
        r();
        if (this.j != 1 && (Double.isNaN(d) || Double.isInfinite(d))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d);
        }
        a();
        this.c.append((CharSequence) Double.toString(d));
    }

    public void o(long j) {
        r();
        a();
        this.c.write(Long.toString(j));
    }

    public void p(Number number) {
        if (number == null) {
            i();
            return;
        }
        r();
        String obj = number.toString();
        Class<?> cls = number.getClass();
        if (cls != Integer.class && cls != Long.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class) {
            if (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN")) {
                if (cls != Float.class && cls != Double.class && !n.matcher(obj).matches()) {
                    f40.i("String created by ", cls, " is not a valid JSON number: ", obj);
                    return;
                }
            } else if (this.j != 1) {
                c.k("Numeric values must be finite, but was ".concat(obj));
                return;
            }
        }
        a();
        this.c.append((CharSequence) obj);
    }

    public void q(String str) {
        if (str == null) {
            i();
            return;
        }
        r();
        a();
        m(str);
    }

    public final void r() {
        if (this.l != null) {
            int j = j();
            if (j == 5) {
                this.c.write(this.h);
            } else if (j != 3) {
                c.o("Nesting problem.");
                return;
            }
            h();
            this.d[this.e - 1] = 4;
            m(this.l);
            this.l = null;
        }
    }
}
