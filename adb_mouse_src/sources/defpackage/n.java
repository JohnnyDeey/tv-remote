package defpackage;

import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class n extends FilterInputStream {
    public final int c;
    public final boolean d;
    public final byte[][] e;

    public n(int i, byte[] bArr) {
        this(new ByteArrayInputStream(bArr), bArr.length, true);
    }

    public static x b(int i, vo voVar, byte[][] bArr) {
        try {
            switch (i) {
                case 1:
                    return g.q(d(voVar, bArr));
                case 2:
                    return new o(voVar.b());
                case 3:
                    return e.q(voVar.b());
                case 4:
                    return new t(voVar.b());
                case 5:
                    if (voVar.f == 0) {
                        return im.c;
                    }
                    throw new IllegalStateException("malformed NULL encoding encountered");
                case 6:
                    s.r(voVar.f);
                    return s.s(d(voVar, bArr), true);
                case 7:
                    return new q(new gm(voVar.b()));
                case 8:
                case 9:
                case 11:
                case 15:
                case 16:
                case 17:
                case 29:
                default:
                    throw new IOException("unknown tag " + i + " encountered");
                case 10:
                    return k.q(d(voVar, bArr), true);
                case 12:
                    return new rm(voVar.b());
                case 13:
                    int i2 = voVar.f;
                    ConcurrentHashMap concurrentHashMap = y.e;
                    if (i2 <= 4096) {
                        return y.q(d(voVar, bArr), true);
                    }
                    throw new IllegalArgumentException("exceeded relative OID contents length limit");
                case 14:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                    throw new IOException("unsupported tag " + i + " encountered");
                case 18:
                    return new jm(voVar.b());
                case 19:
                    return new mm(voVar.b());
                case 20:
                    return new pm(voVar.b());
                case 21:
                    return new tm(voVar.b());
                case 22:
                    return new hm(voVar.b());
                case 23:
                    return new e0(voVar.b());
                case 24:
                    return new m(voVar.b());
                case 25:
                    return new gm(voVar.b());
                case 26:
                    return new um(voVar.b());
                case 27:
                    return new em(voVar.b());
                case 28:
                    return new sm(voVar.b());
                case 30:
                    return new bm(c(voVar));
            }
        } catch (IllegalArgumentException e) {
            throw new l(e, e.getMessage());
        } catch (IllegalStateException e2) {
            throw new l(e2, e2.getMessage());
        }
    }

    public static char[] c(vo voVar) {
        int i = voVar.f;
        if ((i & 1) == 0) {
            int i2 = i / 2;
            char[] cArr = new char[i2];
            byte[] bArr = new byte[8];
            int i3 = 0;
            int i4 = 0;
            while (i >= 8) {
                if (gi0.k(voVar, bArr, 8) == 8) {
                    cArr[i4] = (char) ((bArr[0] << 8) | (bArr[1] & 255));
                    cArr[i4 + 1] = (char) ((bArr[2] << 8) | (bArr[3] & 255));
                    cArr[i4 + 2] = (char) ((bArr[4] << 8) | (bArr[5] & 255));
                    cArr[i4 + 3] = (char) ((bArr[6] << 8) | (bArr[7] & 255));
                    i4 += 4;
                    i -= 8;
                } else {
                    throw new EOFException("EOF encountered in middle of BMPString");
                }
            }
            if (i > 0) {
                if (gi0.k(voVar, bArr, i) != i) {
                    throw new EOFException("EOF encountered in middle of BMPString");
                }
                do {
                    int i5 = i3 + 1;
                    int i6 = bArr[i3] << 8;
                    i3 += 2;
                    cArr[i4] = (char) ((bArr[i5] & 255) | i6);
                    i4++;
                } while (i3 < i);
            }
            if (voVar.f == 0 && i2 == i4) {
                return cArr;
            }
            throw new IllegalStateException();
        }
        throw new IOException("malformed BMPString encoding encountered");
    }

    public static byte[] d(vo voVar, byte[][] bArr) {
        int i = voVar.f;
        if (i >= bArr.length) {
            return voVar.b();
        }
        byte[] bArr2 = bArr[i];
        if (bArr2 == null) {
            bArr2 = new byte[i];
            bArr[i] = bArr2;
        }
        if (i == bArr2.length) {
            if (i == 0) {
                return bArr2;
            }
            int i2 = voVar.d;
            if (i < i2) {
                int k = i - gi0.k(voVar.c, bArr2, bArr2.length);
                voVar.f = k;
                if (k == 0) {
                    voVar.a();
                    return bArr2;
                }
                c.c(voVar.e, voVar.f);
                return null;
            }
            throw new IOException("corrupted stream - out of bounds length found: " + voVar.f + " >= " + i2);
        }
        c.k("buffer length not right for data");
        return null;
    }

    public static int e(InputStream inputStream, int i, boolean z) {
        int read = inputStream.read();
        if ((read >>> 7) == 0) {
            return read;
        }
        if (128 == read) {
            return -1;
        }
        if (read >= 0) {
            if (255 != read) {
                int i2 = read & 127;
                int i3 = 0;
                int i4 = 0;
                do {
                    int read2 = inputStream.read();
                    if (read2 >= 0) {
                        if ((i3 >>> 23) == 0) {
                            i3 = (i3 << 8) + read2;
                            i4++;
                        } else {
                            throw new IOException("long form definite-length more than 31 bits");
                        }
                    } else {
                        throw new EOFException("EOF found reading length");
                    }
                } while (i4 < i2);
                if (i3 >= i && !z) {
                    throw new IOException(qo0.o("corrupted stream - out of bounds length found: ", i3, " >= ", i));
                }
                return i3;
            }
            throw new IOException("invalid long form definite-length 0xFF");
        }
        throw new EOFException("EOF found when length expected");
    }

    public static int g(int i, InputStream inputStream) {
        int i2 = i & 31;
        if (i2 == 31) {
            int read = inputStream.read();
            if (read < 31) {
                if (read < 0) {
                    throw new EOFException("EOF found inside tag value.");
                }
                throw new IOException("corrupted stream - high tag number < 31 found");
            }
            int i3 = read & 127;
            if (i3 != 0) {
                while ((read & 128) != 0) {
                    if ((i3 >>> 24) == 0) {
                        int i4 = i3 << 7;
                        int read2 = inputStream.read();
                        if (read2 >= 0) {
                            i3 = i4 | (read2 & 127);
                            read = read2;
                        } else {
                            throw new EOFException("EOF found inside tag value.");
                        }
                    } else {
                        throw new IOException("Tag number more than 31 bits");
                    }
                }
                return i3;
            }
            throw new IOException("corrupted stream - invalid high tag number found");
        }
        return i2;
    }

    /* JADX WARN: Type inference failed for: r6v11, types: [f50, x, a0] */
    /* JADX WARN: Type inference failed for: r7v14, types: [x, dn, b0] */
    public final x a(int i, int i2, int i3) {
        vo voVar = new vo(this, i3, this.c);
        if ((i & 224) == 0) {
            return b(i2, voVar, this.e);
        }
        int i4 = i & 192;
        int i5 = 3;
        int i6 = 4;
        int i7 = 0;
        if (i4 != 0) {
            if ((i & 32) != 0) {
                j h = h(voVar);
                if (h.b == 1) {
                    return new yb(i5, i4, i2, h.f(0), 2);
                }
                return new yb(i6, i4, i2, bn.a(h), 2);
            }
            return new yb(i6, i4, i2, new t(voVar.b()), 2);
        }
        if (i2 != 3) {
            if (i2 != 4) {
                if (i2 != 8) {
                    if (i2 != 16) {
                        if (i2 == 17) {
                            j h2 = h(voVar);
                            nm nmVar = bn.a;
                            if (h2.b < 1) {
                                return bn.b;
                            }
                            ?? b0Var = new b0(h2);
                            b0Var.f = -1;
                            return b0Var;
                        }
                        throw new IOException(qo0.n("unknown tag ", i2, " encountered"));
                    }
                    if (voVar.f < 1) {
                        return bn.a;
                    }
                    if (this.d) {
                        byte[] b = voVar.b();
                        ?? a0Var = new a0();
                        a0Var.e = b;
                        return a0Var;
                    }
                    return bn.a(h(voVar));
                }
                nm a = bn.a(h(voVar));
                a.getClass();
                return new dm(a);
            }
            j h3 = h(voVar);
            int i8 = h3.b;
            t[] tVarArr = new t[i8];
            while (i7 != i8) {
                i f = h3.f(i7);
                if (f instanceof t) {
                    tVarArr[i7] = (t) f;
                    i7++;
                } else {
                    c.f(f.getClass(), "unknown object encountered in constructed OCTET STRING: ");
                    return null;
                }
            }
            return new tb(tb.r(tVarArr), tVarArr);
        }
        j h4 = h(voVar);
        int i9 = h4.b;
        e[] eVarArr = new e[i9];
        while (i7 != i9) {
            i f2 = h4.f(i7);
            if (f2 instanceof e) {
                eVarArr[i7] = (e) f2;
                i7++;
            } else {
                c.f(f2.getClass(), "unknown object encountered in constructed BIT STRING: ");
                return null;
            }
        }
        return new qb(eVarArr);
    }

    public final x f() {
        int read = read();
        if (read <= 0) {
            if (read != 0) {
                return null;
            }
            throw new IOException("unexpected end-of-contents marker");
        }
        int g = g(read, this);
        int i = this.c;
        int e = e(this, i, false);
        if (e >= 0) {
            try {
                return a(read, g, e);
            } catch (IllegalArgumentException e2) {
                throw new l(e2, "corrupted stream detected");
            }
        }
        if ((read & 32) != 0) {
            c0 c0Var = new c0(new s10(i, this), i, this.e);
            int i2 = read & 192;
            if (i2 != 0) {
                return c0Var.n(i2, g);
            }
            if (g != 3) {
                if (g != 4) {
                    if (g != 8) {
                        if (g != 16) {
                            if (g == 17) {
                                return new b0(c0Var.o());
                            }
                            throw new IOException("unknown BER object encountered");
                        }
                        return new a0(c0Var.o());
                    }
                    return wb.a(c0Var);
                }
                return ub.a(c0Var);
            }
            return rb.a(c0Var);
        }
        throw new IOException("indefinite-length primitive encoding encountered");
    }

    public final j h(vo voVar) {
        int i = voVar.f;
        if (i < 1) {
            return new j(0);
        }
        n nVar = new n(voVar, i, this.d, this.e);
        x f = nVar.f();
        if (f == null) {
            return new j(0);
        }
        j jVar = new j();
        do {
            jVar.d(f);
            f = nVar.f();
        } while (f != null);
        return jVar;
    }

    public n(ByteArrayInputStream byteArrayInputStream, int i, boolean z) {
        this(byteArrayInputStream, i, z, new byte[11]);
    }

    public n(InputStream inputStream, int i, boolean z, byte[][] bArr) {
        super(inputStream);
        this.c = i;
        this.d = z;
        this.e = bArr;
    }

    public n(byte[] bArr) {
        this(new ByteArrayInputStream(bArr), bArr.length, false);
    }
}
