package defpackage;

import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class ch0 {
    public final ks0 d;
    public final InputStream e;
    public final OutputStream f;
    public is0 h;
    public is0 i;
    public is0 j;
    public xf0 k;
    public int l;
    public int m;
    public boolean n;
    public final ah0 a = new ah0();
    public final bh0 b = new bh0();
    public final bh0 c = new bh0();
    public is0 g = null;

    public ch0(ks0 ks0Var, InputStream inputStream, OutputStream outputStream) {
        os osVar = os.f;
        this.h = osVar;
        this.i = null;
        this.j = osVar;
        this.k = null;
        this.l = 16384;
        this.m = 16384;
        this.n = false;
        this.d = ks0Var;
        this.e = inputStream;
        this.f = outputStream;
    }

    public final void a() {
        is0 is0Var = this.g;
        if (is0Var != null) {
            if (this.i == null) {
                this.h = is0Var;
                this.m = is0Var.b(this.l);
                this.b.b();
                return;
            }
            throw new us0((short) 80, null, null);
        }
        throw new us0((short) 80, null, null);
    }

    public final void b() {
        is0 is0Var = this.g;
        if (is0Var != null) {
            this.j = is0Var;
            this.c.b();
            return;
        }
        throw new us0((short) 80, null, null);
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v40, types: [ts0, java.lang.Throwable, vs0] */
    /* JADX WARN: Type inference failed for: r1v22, types: [me, java.lang.Object] */
    public final boolean c() {
        ah0 ah0Var = this.a;
        ah0Var.a(5, this.e);
        if (ah0Var.c == 0) {
            return false;
        }
        if (ah0Var.c >= 5) {
            byte[] bArr = this.a.b;
            byte[] bArr2 = ht0.a;
            short s = (short) (bArr[0] & 255);
            is0 is0Var = this.i;
            if (is0Var != null && s == 23) {
                this.h = is0Var;
                this.i = null;
                this.m = is0Var.b(this.l);
                this.b.b();
            } else if (this.h.e()) {
                if (23 != s && (!this.n || 20 != s)) {
                    f40.a(10, null, "Opaque ".concat(r21.x(s)));
                    return false;
                }
            } else {
                switch (s) {
                    case 20:
                    case 21:
                    case 22:
                        break;
                    case 23:
                        if (!this.d.l) {
                            f40.a(10, null, "Not ready for ".concat(r21.x((short) 23)));
                            return false;
                        }
                        break;
                    default:
                        f40.a(10, null, "Unsupported ".concat(r21.x(s)));
                        return false;
                }
            }
            byte[] bArr3 = this.a.b;
            xf0 c = xf0.c(bArr3[1] & 255, bArr3[2] & 255);
            int O = ht0.O(3, this.a.b);
            if (O <= this.m) {
                ah0 ah0Var2 = this.a;
                InputStream inputStream = this.e;
                int i = O + 5;
                if (ah0Var2.b.length < i) {
                    byte[] bArr4 = new byte[i];
                    System.arraycopy(ah0Var2.b, 0, bArr4, 0, ah0Var2.c);
                    ah0Var2.b = bArr4;
                }
                ah0Var2.a(i, inputStream);
                if (ah0Var2.c >= i) {
                    try {
                        if (this.n && 20 == s) {
                            byte[] bArr5 = this.a.b;
                            if (1 == O && 1 == bArr5[5]) {
                                ah0 ah0Var3 = this.a;
                                ah0Var3.b = ah0Var3.a;
                                ah0Var3.c = 0;
                                return true;
                            }
                            throw new us0((short) 10, "Malformed ".concat(r21.x((short) 20)), null);
                        }
                        ps0 c2 = this.h.c(this.b.a((short) 10), s, c, this.a.b, O);
                        int i2 = c2.c;
                        if (i2 <= this.l) {
                            if (i2 < 1 && c2.d != 23) {
                                throw new us0((short) 47, null, null);
                            }
                            ah0 ah0Var4 = this.a;
                            ah0Var4.b = ah0Var4.a;
                            ah0Var4.c = 0;
                            ks0 ks0Var = this.d;
                            short s2 = c2.d;
                            byte[] bArr6 = c2.a;
                            int i3 = c2.b;
                            int i4 = c2.c;
                            switch (s2) {
                                case 20:
                                    xf0 xf0Var = ks0Var.B.a().H;
                                    if (xf0Var != null && !ht0.A(xf0Var)) {
                                        for (int i5 = 0; i5 < i4; i5++) {
                                            if (((short) (bArr6[i3 + i5] & 255)) == 1) {
                                                if (!ks0Var.x && ks0Var.b.c <= 0 && ks0Var.c.c <= 0) {
                                                    ch0 ch0Var = ks0Var.d;
                                                    if (ch0Var.g != null) {
                                                        ch0Var.a();
                                                        ks0Var.x = true;
                                                    } else {
                                                        f40.a(10, null, "No pending cipher");
                                                        return false;
                                                    }
                                                } else {
                                                    throw new us0((short) 10, null, null);
                                                }
                                            } else {
                                                throw new us0((short) 50, null, null);
                                            }
                                        }
                                        return true;
                                    }
                                    throw new us0((short) 10, null, null);
                                case 21:
                                    ks0Var.b.a(bArr6, i3, i4);
                                    while (true) {
                                        me meVar = ks0Var.b;
                                        if (meVar.c >= 2) {
                                            byte[] bArr7 = new byte[2];
                                            meVar.c(bArr7, 0, 2);
                                            short s3 = bArr7[0];
                                            short s4 = bArr7[1];
                                            ks0Var.A.getClass();
                                            if (s3 == 1) {
                                                if (s4 != 0) {
                                                    if (s4 != 41) {
                                                        if (s4 == 100) {
                                                            throw new us0((short) 40, null, null);
                                                        }
                                                    } else {
                                                        throw new us0((short) 10, null, null);
                                                    }
                                                } else if (ks0Var.l) {
                                                    ks0Var.h(false);
                                                } else {
                                                    throw new us0((short) 40, null, null);
                                                }
                                            } else {
                                                ks0Var.j();
                                                ?? ts0Var = new ts0(f20.H(s4), null);
                                                ts0Var.d = s4;
                                                throw ts0Var;
                                            }
                                        }
                                    }
                                    return true;
                                case 22:
                                    me meVar2 = ks0Var.c;
                                    if (meVar2.c > 0) {
                                        meVar2.a(bArr6, i3, i4);
                                        ks0Var.s(ks0Var.c);
                                        return true;
                                    }
                                    ?? obj = new Object();
                                    obj.a = bArr6;
                                    obj.b = i3;
                                    obj.c = i4;
                                    obj.d = true;
                                    ks0Var.s(obj);
                                    int i6 = obj.c;
                                    if (i6 > 0) {
                                        ks0Var.c.a(bArr6, (i3 + i4) - i6, i6);
                                        return true;
                                    }
                                    return true;
                                case 23:
                                    if (ks0Var.l) {
                                        ks0Var.a.a(bArr6, i3, i4);
                                        return true;
                                    }
                                    throw new us0((short) 10, null, null);
                                default:
                                    throw new us0((short) 10, null, null);
                            }
                        }
                        throw new us0((short) 22, null, null);
                    } catch (Throwable th) {
                        ah0 ah0Var5 = this.a;
                        ah0Var5.b = ah0Var5.a;
                        ah0Var5.c = 0;
                        throw th;
                    }
                }
                throw new EOFException();
            }
            throw new us0((short) 22, null, null);
        }
        throw new EOFException();
    }
}
