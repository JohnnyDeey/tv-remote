package defpackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import javax.crypto.Mac;

/* loaded from: classes.dex */
public abstract class ht0 {
    public static final byte[] a = h10.a("444F574E47524400");
    public static final byte[] b = h10.a("444F574E47524401");
    public static final Hashtable c;
    public static final Vector d;
    public static final byte[] e;
    public static final short[] f;

    static {
        Hashtable hashtable = new Hashtable();
        b(hashtable, kb0.j, (short) 3, (short) 2);
        b(hashtable, kb0.k, (short) 4, (short) 2);
        b(hashtable, kb0.l, (short) 5, (short) 2);
        b(hashtable, kb0.m, (short) 6, (short) 2);
        b(hashtable, pc0.a, (short) 2, (short) 2);
        b(hashtable, pc0.b, (short) 2, (short) 1);
        b(hashtable, od0.b, (short) 2, (short) 1);
        b(hashtable, od0.h, (short) 3, (short) 1);
        b(hashtable, od0.e, (short) 4, (short) 1);
        b(hashtable, od0.f, (short) 5, (short) 1);
        b(hashtable, od0.g, (short) 6, (short) 1);
        b(hashtable, y11.a, (short) 2, (short) 3);
        b(hashtable, y11.b, (short) 3, (short) 3);
        b(hashtable, y11.c, (short) 4, (short) 3);
        b(hashtable, y11.d, (short) 5, (short) 3);
        b(hashtable, y11.e, (short) 6, (short) 3);
        b(hashtable, y11.f, (short) 2, (short) 2);
        b(hashtable, es.c, (short) 2, (short) 3);
        b(hashtable, es.d, (short) 3, (short) 3);
        b(hashtable, es.e, (short) 4, (short) 3);
        b(hashtable, es.f, (short) 5, (short) 3);
        b(hashtable, es.g, (short) 6, (short) 3);
        b(hashtable, es.a, (short) 2, (short) 1);
        b(hashtable, es.b, (short) 4, (short) 1);
        b(hashtable, fc.a, (short) 2, (short) 3);
        b(hashtable, fc.b, (short) 3, (short) 3);
        b(hashtable, fc.c, (short) 4, (short) 3);
        b(hashtable, fc.d, (short) 5, (short) 3);
        b(hashtable, fc.e, (short) 6, (short) 3);
        s sVar = ms.c;
        go0 go0Var = go0.f;
        a(hashtable, sVar, go0Var);
        s sVar2 = ms.d;
        go0 go0Var2 = go0.g;
        a(hashtable, sVar2, go0Var2);
        s sVar3 = kb0.n;
        go0 go0Var3 = go0.j;
        a(hashtable, sVar3, go0Var3);
        s sVar4 = kb0.o;
        go0 go0Var4 = go0.k;
        a(hashtable, sVar4, go0Var4);
        s sVar5 = kb0.p;
        go0 go0Var5 = go0.l;
        a(hashtable, sVar5, go0Var5);
        a(hashtable, kb0.t, go0.s);
        a(hashtable, kb0.u, go0.t);
        a(hashtable, kb0.v, go0.u);
        a(hashtable, kb0.w, go0.v);
        a(hashtable, kb0.x, go0.w);
        a(hashtable, kb0.y, go0.x);
        a(hashtable, kb0.z, go0.y);
        a(hashtable, kb0.A, go0.z);
        a(hashtable, kb0.B, go0.A);
        a(hashtable, kb0.C, go0.B);
        a(hashtable, kb0.D, go0.C);
        a(hashtable, kb0.E, go0.D);
        a(hashtable, xj0.a, go0.h);
        a(hashtable, xj0.b, go0.i);
        c = hashtable;
        Vector vector = new Vector();
        vector.addElement(go0Var);
        vector.addElement(go0Var2);
        vector.addElement(go0.c((short) 4, (short) 3));
        vector.addElement(go0.c((short) 5, (short) 3));
        vector.addElement(go0.c((short) 6, (short) 3));
        vector.addElement(go0.p);
        vector.addElement(go0.q);
        vector.addElement(go0.r);
        vector.addElement(go0.m);
        vector.addElement(go0.n);
        vector.addElement(go0.o);
        vector.addElement(go0Var3);
        vector.addElement(go0Var4);
        vector.addElement(go0Var5);
        vector.addElement(go0.c((short) 4, (short) 1));
        vector.addElement(go0.c((short) 5, (short) 1));
        vector.addElement(go0.c((short) 6, (short) 1));
        vector.addElement(go0.c((short) 4, (short) 2));
        vector.addElement(go0.c((short) 5, (short) 2));
        vector.addElement(go0.c((short) 6, (short) 2));
        vector.addElement(go0.c((short) 3, (short) 3));
        vector.addElement(go0.c((short) 3, (short) 1));
        vector.addElement(go0.c((short) 3, (short) 2));
        vector.addElement(go0.c((short) 2, (short) 3));
        vector.addElement(go0.c((short) 2, (short) 1));
        vector.addElement(go0.c((short) 2, (short) 2));
        d = vector;
        e = new byte[0];
        f = new short[0];
    }

    public static boolean A(xf0 xf0Var) {
        return xf0.g.i(xf0Var.d());
    }

    public static boolean B(int[] iArr, int i) {
        if (iArr != null && f20.m(iArr, i) && i != 0 && i != 255 && i != 22016) {
            return true;
        }
        return false;
    }

    public static boolean C(int i) {
        if ((65535 & i) == i) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0030 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0033 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean D(int r4, defpackage.xf0 r5) {
        /*
            xf0 r5 = r5.d()
            switch(r4) {
                case 59: goto L33;
                case 60: goto L33;
                case 61: goto L33;
                case 62: goto L33;
                case 63: goto L33;
                case 64: goto L33;
                default: goto L7;
            }
        L7:
            switch(r4) {
                case 103: goto L33;
                case 104: goto L33;
                case 105: goto L33;
                case 106: goto L33;
                case 107: goto L33;
                case 108: goto L33;
                case 109: goto L33;
                default: goto La;
            }
        La:
            switch(r4) {
                case 156: goto L33;
                case 157: goto L33;
                case 158: goto L33;
                case 159: goto L33;
                case 160: goto L33;
                case 161: goto L33;
                case 162: goto L33;
                case 163: goto L33;
                case 164: goto L33;
                case 165: goto L33;
                case 166: goto L33;
                case 167: goto L33;
                case 168: goto L33;
                case 169: goto L33;
                case 170: goto L33;
                case 171: goto L33;
                case 172: goto L33;
                case 173: goto L33;
                default: goto Ld;
            }
        Ld:
            switch(r4) {
                case 186: goto L33;
                case 187: goto L33;
                case 188: goto L33;
                case 189: goto L33;
                case 190: goto L33;
                case 191: goto L33;
                case 192: goto L33;
                case 193: goto L33;
                case 194: goto L33;
                case 195: goto L33;
                case 196: goto L33;
                case 197: goto L33;
                case 198: goto L30;
                case 199: goto L30;
                default: goto L10;
            }
        L10:
            switch(r4) {
                case 4865: goto L30;
                case 4866: goto L30;
                case 4867: goto L30;
                case 4868: goto L30;
                case 4869: goto L30;
                default: goto L13;
            }
        L13:
            switch(r4) {
                case 49187: goto L33;
                case 49188: goto L33;
                case 49189: goto L33;
                case 49190: goto L33;
                case 49191: goto L33;
                case 49192: goto L33;
                case 49193: goto L33;
                case 49194: goto L33;
                case 49195: goto L33;
                case 49196: goto L33;
                case 49197: goto L33;
                case 49198: goto L33;
                case 49199: goto L33;
                case 49200: goto L33;
                case 49201: goto L33;
                case 49202: goto L33;
                default: goto L16;
            }
        L16:
            r0 = 53253(0xd005, float:7.4623E-41)
            if (r4 == r0) goto L33
            switch(r4) {
                case 49212: goto L33;
                case 49213: goto L33;
                case 49214: goto L33;
                case 49215: goto L33;
                case 49216: goto L33;
                case 49217: goto L33;
                case 49218: goto L33;
                case 49219: goto L33;
                case 49220: goto L33;
                case 49221: goto L33;
                case 49222: goto L33;
                case 49223: goto L33;
                case 49224: goto L33;
                case 49225: goto L33;
                case 49226: goto L33;
                case 49227: goto L33;
                case 49228: goto L33;
                case 49229: goto L33;
                case 49230: goto L33;
                case 49231: goto L33;
                case 49232: goto L33;
                case 49233: goto L33;
                case 49234: goto L33;
                case 49235: goto L33;
                case 49236: goto L33;
                case 49237: goto L33;
                case 49238: goto L33;
                case 49239: goto L33;
                case 49240: goto L33;
                case 49241: goto L33;
                case 49242: goto L33;
                case 49243: goto L33;
                case 49244: goto L33;
                case 49245: goto L33;
                case 49246: goto L33;
                case 49247: goto L33;
                case 49248: goto L33;
                case 49249: goto L33;
                case 49250: goto L33;
                case 49251: goto L33;
                case 49252: goto L33;
                case 49253: goto L33;
                case 49254: goto L33;
                case 49255: goto L33;
                case 49256: goto L33;
                case 49257: goto L33;
                case 49258: goto L33;
                case 49259: goto L33;
                case 49260: goto L33;
                case 49261: goto L33;
                case 49262: goto L33;
                case 49263: goto L33;
                case 49264: goto L33;
                case 49265: goto L33;
                case 49266: goto L33;
                case 49267: goto L33;
                case 49268: goto L33;
                case 49269: goto L33;
                case 49270: goto L33;
                case 49271: goto L33;
                case 49272: goto L33;
                case 49273: goto L33;
                case 49274: goto L33;
                case 49275: goto L33;
                case 49276: goto L33;
                case 49277: goto L33;
                case 49278: goto L33;
                case 49279: goto L33;
                case 49280: goto L33;
                case 49281: goto L33;
                case 49282: goto L33;
                case 49283: goto L33;
                case 49284: goto L33;
                case 49285: goto L33;
                case 49286: goto L33;
                case 49287: goto L33;
                case 49288: goto L33;
                case 49289: goto L33;
                case 49290: goto L33;
                case 49291: goto L33;
                case 49292: goto L33;
                case 49293: goto L33;
                case 49294: goto L33;
                case 49295: goto L33;
                case 49296: goto L33;
                case 49297: goto L33;
                case 49298: goto L33;
                case 49299: goto L33;
                default: goto L1e;
            }
        L1e:
            switch(r4) {
                case 52392: goto L33;
                case 52393: goto L33;
                case 52394: goto L33;
                case 52395: goto L33;
                case 52396: goto L33;
                case 52397: goto L33;
                case 52398: goto L33;
                default: goto L21;
            }
        L21:
            switch(r4) {
                case 53249: goto L33;
                case 53250: goto L33;
                case 53251: goto L33;
                default: goto L24;
            }
        L24:
            switch(r4) {
                case 49308: goto L33;
                case 49309: goto L33;
                case 49310: goto L33;
                case 49311: goto L33;
                case 49312: goto L33;
                case 49313: goto L33;
                case 49314: goto L33;
                case 49315: goto L33;
                case 49316: goto L33;
                case 49317: goto L33;
                case 49318: goto L33;
                case 49319: goto L33;
                case 49320: goto L33;
                case 49321: goto L33;
                case 49322: goto L33;
                case 49323: goto L33;
                case 49324: goto L33;
                case 49325: goto L33;
                case 49326: goto L33;
                case 49327: goto L33;
                default: goto L27;
            }
        L27:
            switch(r4) {
                case 49332: goto L30;
                case 49333: goto L30;
                default: goto L2a;
            }
        L2a:
            switch(r4) {
                case 49408: goto L33;
                case 49409: goto L33;
                case 49410: goto L33;
                default: goto L2d;
            }
        L2d:
            xf0 r4 = defpackage.xf0.c
            goto L35
        L30:
            xf0 r4 = defpackage.xf0.g
            goto L35
        L33:
            xf0 r4 = defpackage.xf0.f
        L35:
            r0 = 1
            if (r4 != r5) goto L39
            return r0
        L39:
            r1 = 0
            if (r5 == 0) goto L6c
            int r2 = r4.e()
            int r3 = r5.e()
            if (r2 == r3) goto L47
            goto L6c
        L47:
            int r2 = r4.f()
            int r3 = r5.f()
            int r2 = r2 - r3
            boolean r3 = r4.h()
            if (r3 == 0) goto L59
            if (r2 <= 0) goto L6c
            goto L5b
        L59:
            if (r2 >= 0) goto L6c
        L5b:
            xf0 r2 = defpackage.xf0.g
            boolean r4 = r2.i(r4)
            if (r4 != 0) goto L6b
            boolean r4 = r2.j(r5)
            if (r4 == 0) goto L6a
            goto L6b
        L6a:
            return r1
        L6b:
            return r0
        L6c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ht0.D(int, xf0):boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0057, code lost:
    
        if (r0 != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x005a, code lost:
    
        r2 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0091, code lost:
    
        if (r0 != false) goto L60;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0030. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x0033. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x0036. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x0039. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x003c. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:15:0x003f. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:16:0x0042. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:17:0x0045. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:18:0x0048. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:19:0x004b. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:20:0x004e. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0029. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x002c. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00aa A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00a3 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void E(defpackage.im0 r9, int r10) {
        /*
            Method dump skipped, instructions count: 708
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ht0.E(im0, int):void");
    }

    public static void F(js0 js0Var, po poVar) {
        im0 c2 = js0Var.c();
        xf0 xf0Var = c2.H;
        if (xf0Var != null) {
            int i = xf0Var.a;
            if (i >= xf0.k.a && i <= xf0.l.a) {
                if (!z(xf0Var)) {
                    c2.A = null;
                    c2.B = null;
                } else {
                    if (c2.A == null) {
                        Vector vector = new Vector(3);
                        vector.add(go0.c((short) 2, (short) 2));
                        vector.add(go0.c((short) 2, (short) 3));
                        vector.add(go0.c((short) 2, (short) 1));
                        c2.A = vector;
                    }
                    if (c2.B == null) {
                        c2.B = c2.A;
                    }
                }
                poVar.getClass();
                return;
            }
        } else {
            xf0 xf0Var2 = xf0.c;
        }
        throw new us0((short) 80, null, null);
    }

    public static Vector G(ByteArrayInputStream byteArrayInputStream) {
        int P = P(byteArrayInputStream);
        if (P >= 2 && (P & 1) == 0) {
            int i = P / 2;
            Vector vector = new Vector(i);
            for (int i2 = 0; i2 < i; i2++) {
                go0 c2 = go0.c(S(byteArrayInputStream), S(byteArrayInputStream));
                if (c2.b != 0) {
                    vector.addElement(c2);
                }
            }
            return vector;
        }
        throw new us0((short) 50, null, null);
    }

    public static short H(Hashtable hashtable, Hashtable hashtable2) {
        short l;
        String str;
        short[] m;
        byte[] r = r(hashtable2, 19);
        if (r == null) {
            l = -1;
        } else {
            l = l(r);
        }
        if (l < 0) {
            return (short) 0;
        }
        if (l >= 0 && l <= 2) {
            byte[] r2 = r(hashtable, 19);
            if (r2 == null) {
                m = null;
            } else {
                m = m(r2);
                if (m.length < 1) {
                    throw new us0((short) 50, null, null);
                }
            }
            if (m != null) {
                for (short s : m) {
                    if (l == s) {
                        return l;
                    }
                }
            }
            str = "Invalid selection for client_certificate_type";
        } else {
            str = "Unknown value for client_certificate_type";
        }
        f40.a(47, null, str);
        return (short) 0;
    }

    public static short I(Hashtable hashtable, Hashtable hashtable2) {
        short l;
        String str;
        short[] m;
        byte[] r = r(hashtable2, 20);
        if (r == null) {
            l = -1;
        } else {
            l = l(r);
        }
        if (l < 0) {
            return (short) 0;
        }
        if (l >= 0 && l <= 2) {
            byte[] r2 = r(hashtable, 20);
            if (r2 == null) {
                m = null;
            } else {
                m = m(r2);
                if (m.length < 1) {
                    throw new us0((short) 50, null, null);
                }
            }
            if (m != null) {
                for (short s : m) {
                    if (l == s) {
                        return l;
                    }
                }
            }
            str = "Invalid selection for server_certificate_type";
        } else {
            str = "Unknown value for server_certificate_type";
        }
        f40.a(47, null, str);
        return (short) 0;
    }

    public static x J(byte[] bArr) {
        n nVar = new n(bArr);
        x f2 = nVar.f();
        if (f2 != null) {
            if (nVar.f() == null) {
                return f2;
            }
            throw new us0((short) 50, null, null);
        }
        throw new us0((short) 50, null, null);
    }

    public static byte[] K(int i, InputStream inputStream) {
        if (i < 1) {
            return e;
        }
        byte[] bArr = new byte[i];
        if (i == gi0.k(inputStream, bArr, i)) {
            return bArr;
        }
        throw new EOFException();
    }

    public static byte[] L(InputStream inputStream) {
        int P = P(inputStream);
        if (P >= 1) {
            return K(P, inputStream);
        }
        throw new us0((short) 50, null, null);
    }

    public static byte[] M(ByteArrayInputStream byteArrayInputStream) {
        int Q = Q(byteArrayInputStream);
        if (Q >= 1) {
            return K(Q, byteArrayInputStream);
        }
        throw new us0((short) 50, null, null);
    }

    public static byte[] N(InputStream inputStream) {
        short S = S(inputStream);
        if (S >= 1) {
            return K(S, inputStream);
        }
        throw new us0((short) 50, null, null);
    }

    public static int O(int i, byte[] bArr) {
        return (bArr[i + 1] & 255) | ((bArr[i] & 255) << 8);
    }

    public static int P(InputStream inputStream) {
        int read = inputStream.read();
        int read2 = inputStream.read();
        if (read2 >= 0) {
            return read2 | (read << 8);
        }
        throw new EOFException();
    }

    public static int Q(ByteArrayInputStream byteArrayInputStream) {
        int read = byteArrayInputStream.read();
        int read2 = byteArrayInputStream.read();
        int read3 = byteArrayInputStream.read();
        if (read3 >= 0) {
            return read3 | (read << 16) | (read2 << 8);
        }
        throw new EOFException();
    }

    public static void R(a10 a10Var) {
        a10Var.read();
        a10Var.read();
        a10Var.read();
        if (a10Var.read() >= 0) {
        } else {
            throw new EOFException();
        }
    }

    public static short S(InputStream inputStream) {
        int read = inputStream.read();
        if (read >= 0) {
            return (short) read;
        }
        throw new EOFException();
    }

    public static void T(p pVar, byte[] bArr) {
        if (Arrays.equals(pVar.h(), bArr)) {
        } else {
            throw new us0((short) 50, null, null);
        }
    }

    public static void U(js0 js0Var, boolean z) {
        i30 i30Var;
        im0 b2 = js0Var.b();
        byte[] bArr = e;
        if (z) {
            i30Var = b2.q;
            b2.q = r21.A(b2.g, b2.h, i30Var, "traffic upd", bArr);
        } else {
            i30Var = b2.p;
            b2.p = r21.A(b2.g, b2.h, i30Var, "traffic upd", bArr);
        }
        if (i30Var != null) {
            i30Var.d();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x007b, code lost:
    
        if (r7 == 23) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0089, code lost:
    
        if (r3 != 8) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x009b, code lost:
    
        if (2 == r3) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x009f, code lost:
    
        if (r3 != 0) goto L50;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:22:0x00c1. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:74:0x00a5. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01ca A[FALL_THROUGH] */
    /* JADX WARN: Type inference failed for: r2v12, types: [ri, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void V(defpackage.js0 r22, defpackage.a10 r23, defpackage.r6 r24, defpackage.nq r25) {
        /*
            Method dump skipped, instructions count: 548
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ht0.V(js0, a10, r6, nq):void");
    }

    public static void W(Vector vector, go0 go0Var, short s) {
        String str;
        if (vector != null && vector.size() >= 1 && vector.size() < 32768) {
            if (go0Var != null) {
                if (go0Var.b != 0) {
                    for (int i = 0; i < vector.size(); i++) {
                        if (((go0) vector.elementAt(i)).equals(go0Var)) {
                            return;
                        }
                    }
                }
                throw new us0(s, null, null);
            }
            str = "'signatureAlgorithm' cannot be null";
        } else {
            str = "'supportedSignatureAlgorithms' must have length from 1 to (2^15 - 1)";
        }
        c.k(str);
    }

    public static void X(byte[] bArr, OutputStream outputStream) {
        g(bArr.length);
        Z(bArr.length, outputStream);
        outputStream.write(bArr);
    }

    public static void Y(byte[] bArr, ByteArrayOutputStream byteArrayOutputStream) {
        h(bArr.length);
        byteArrayOutputStream.write(bArr.length);
        byteArrayOutputStream.write(bArr);
    }

    public static void Z(int i, OutputStream outputStream) {
        outputStream.write(i >>> 8);
        outputStream.write(i);
    }

    public static void a(Hashtable hashtable, s sVar, go0 go0Var) {
        hashtable.put(sVar.t(), go0Var);
    }

    public static void a0(byte[] bArr, int i, int i2) {
        bArr[i2] = (byte) (i >>> 8);
        bArr[i2 + 1] = (byte) i;
    }

    public static void b(Hashtable hashtable, s sVar, short s, short s2) {
        a(hashtable, sVar, go0.c(s, s2));
    }

    public static void b0(int i, byte[] bArr) {
        bArr[1] = (byte) (i >>> 16);
        bArr[2] = (byte) (i >>> 8);
        bArr[3] = (byte) i;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:17:0x0024. Please report as an issue. */
    public static void c(Vector vector, rd rdVar, int[] iArr) {
        int i;
        boolean z;
        for (int i2 : iArr) {
            switch (i2) {
                case 4587:
                case 4588:
                case 4589:
                    int i3 = 513;
                    switch (i2) {
                        case 4587:
                            i = 23;
                            break;
                        case 4588:
                            i = 513;
                            break;
                        case 4589:
                            i = 24;
                            break;
                        default:
                            i = -1;
                            break;
                    }
                    if (rdVar.z(i)) {
                        switch (i2) {
                            case 4587:
                                break;
                            case 4588:
                                i3 = 29;
                                break;
                            case 4589:
                                i3 = 514;
                                break;
                            default:
                                i3 = -1;
                                break;
                        }
                        if (rdVar.z(i3)) {
                            z = true;
                            break;
                        }
                    }
                    z = false;
                    break;
                default:
                    z = rdVar.z(i2);
                    break;
            }
            if (z) {
                vector.addElement(Integer.valueOf(i2));
            }
        }
    }

    public static void c0(int i, long j, byte[] bArr) {
        bArr[i] = (byte) (j >>> 56);
        bArr[i + 1] = (byte) (j >>> 48);
        bArr[i + 2] = (byte) (j >>> 40);
        bArr[i + 3] = (byte) (j >>> 32);
        bArr[i + 4] = (byte) (j >>> 24);
        bArr[i + 5] = (byte) (j >>> 16);
        bArr[i + 6] = (byte) (j >>> 8);
        bArr[i + 7] = (byte) j;
    }

    public static void d(Vector vector, int i) {
        if (!vector.contains(Integer.valueOf(i))) {
            vector.add(Integer.valueOf(i));
        }
    }

    public static void d0(xf0 xf0Var, byte[] bArr, int i) {
        bArr[i] = (byte) xf0Var.e();
        bArr[i + 1] = (byte) xf0Var.f();
    }

    public static byte[] e(js0 js0Var, uo uoVar, boolean z) {
        String str;
        byte[] bArr;
        i30 i30Var;
        byte[] doFinal;
        im0 c2 = js0Var.c();
        xf0 xf0Var = c2.H;
        if (A(xf0Var)) {
            if (z) {
                i30Var = c2.k;
            } else {
                i30Var = c2.j;
            }
            byte[] p = p(uoVar);
            int i = c2.g;
            i30 A = r21.A(i, c2.h, i30Var, "finished", e);
            try {
                int length = p.length;
                synchronized (A) {
                    A.a();
                    c0 p2 = A.b.p(i);
                    byte[] bArr2 = A.a;
                    p2.a(bArr2, 0, bArr2.length);
                    p2.update(p, 0, length);
                    doFinal = ((Mac) p2.e).doFinal();
                }
                return doFinal;
            } finally {
                A.d();
            }
        }
        if (xf0Var.k()) {
            byte[] bArr3 = jl0.a;
            xs0 f2 = uoVar.f();
            if (z) {
                bArr = jl0.b;
            } else {
                bArr = jl0.a;
            }
            f2.update(bArr, 0, bArr.length);
            return f2.a();
        }
        if (z) {
            str = "server finished";
        } else {
            str = "client finished";
        }
        byte[] p3 = p(uoVar);
        return c2.o.c(c2.f, c2.i, str, p3).e();
    }

    public static void f(Hashtable hashtable, int i) {
        Enumeration keys = hashtable.keys();
        while (keys.hasMoreElements()) {
            Integer num = (Integer) keys.nextElement();
            if (num == null || !y(i, num.intValue())) {
                f40.a(47, null, "Invalid extension: ".concat(f20.G(num.intValue())));
                return;
            }
        }
    }

    public static void g(int i) {
        if (C(i)) {
        } else {
            throw new us0((short) 80, null, null);
        }
    }

    public static void h(int i) {
        if ((i & 255) == i) {
        } else {
            throw new us0((short) 80, null, null);
        }
    }

    public static void i(rd rdVar, int[] iArr, Vector vector, Hashtable hashtable, Vector vector2) {
        int i;
        int i2;
        fs0 ys0Var;
        if (iArr != null && iArr.length >= 1 && vector != null && !vector.isEmpty()) {
            for (int i3 : iArr) {
                Integer valueOf = Integer.valueOf(i3);
                if (vector.contains(valueOf) && !hashtable.containsKey(valueOf)) {
                    switch (i3) {
                        case 4587:
                        case 4588:
                        case 4589:
                            int i4 = -1;
                            switch (i3) {
                                case 4587:
                                    i = 23;
                                    break;
                                case 4588:
                                    i = 513;
                                    break;
                                case 4589:
                                    i = 24;
                                    break;
                                default:
                                    i = -1;
                                    break;
                            }
                            fs0 k = k(rdVar, i);
                            if (k != null) {
                                switch (i3) {
                                    case 4587:
                                        i2 = 513;
                                        break;
                                    case 4588:
                                        i2 = 29;
                                        break;
                                    case 4589:
                                        i2 = 514;
                                        break;
                                    default:
                                        i2 = -1;
                                        break;
                                }
                                fs0 k2 = k(rdVar, i2);
                                if (k2 != null) {
                                    if (i != 23) {
                                        if (i != 24) {
                                            if (i == 513) {
                                                i4 = 1088;
                                            }
                                        } else {
                                            i4 = 97;
                                        }
                                    } else {
                                        i4 = 65;
                                    }
                                    ys0Var = new ys0(rdVar, k, k2, i4);
                                    break;
                                }
                            }
                            ys0Var = null;
                            break;
                        default:
                            ys0Var = k(rdVar, i3);
                            break;
                    }
                    if (ys0Var != null) {
                        vector2.addElement(new m40(i3, ys0Var.a()));
                        hashtable.put(valueOf, ys0Var);
                    }
                }
            }
        }
    }

    public static boolean j(int i, int i2, byte[] bArr, byte[] bArr2) {
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            i3 |= bArr[i4] ^ bArr2[i2 + i4];
        }
        if (i3 != 0) {
            return false;
        }
        return true;
    }

    public static fs0 k(rd rdVar, int i) {
        if (rdVar.z(i)) {
            if (f20.a0(i)) {
                return rdVar.n(new jk0(i, 5)).j();
            }
            if (f20.b0(i)) {
                return new g30(0, new jy(rdVar, new j(i, true)));
            }
            switch (i) {
                case 512:
                case 513:
                case 514:
                    break;
                default:
                    switch (i) {
                        case 583:
                        case 584:
                        case 585:
                            break;
                        default:
                            return null;
                    }
            }
            return new h30(new r6(rdVar, new jk0(i, 6)));
        }
        return null;
    }

    public static short l(byte[] bArr) {
        if (bArr.length == 1) {
            return (short) (bArr[0] & 255);
        }
        throw new us0((short) 50, null, null);
    }

    public static short[] m(byte[] bArr) {
        if (bArr.length >= 1) {
            int i = 0;
            int i2 = (short) (bArr[0] & 255);
            if (bArr.length == i2 + 1) {
                short[] sArr = new short[i2];
                while (i < i2) {
                    int i3 = i + 1;
                    sArr[i] = (short) (bArr[i3] & 255);
                    i = i3;
                }
                return sArr;
            }
            throw new us0((short) 50, null, null);
        }
        throw new us0((short) 50, null, null);
    }

    public static i30 n(int i, int i2, i30 i30Var, String str, byte[] bArr) {
        if (bArr.length == i2) {
            return r21.A(i, i2, i30Var, str, bArr);
        }
        throw new us0((short) 80, null, null);
    }

    public static byte[] o(String str) {
        int length = str.length();
        int i = length + 64;
        byte[] bArr = new byte[length + 65];
        for (int i2 = 0; i2 < 64; i2++) {
            bArr[i2] = 32;
        }
        for (int i3 = 0; i3 < length; i3++) {
            bArr[i3 + 64] = (byte) str.charAt(i3);
        }
        bArr[i] = 0;
        return bArr;
    }

    public static byte[] p(uo uoVar) {
        return uoVar.f().a();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0001. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:60:0x005d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x006f A[FALL_THROUGH, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x006f A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int q(int r1) {
        /*
            r0 = 0
            switch(r1) {
                case 2: goto L6f;
                case 10: goto L6d;
                case 13: goto L6d;
                case 16: goto L6d;
                case 19: goto L6d;
                case 22: goto L6d;
                case 27: goto L6d;
                case 147: goto L6d;
                case 148: goto L6a;
                case 149: goto L67;
                case 150: goto L64;
                case 151: goto L64;
                case 152: goto L64;
                case 153: goto L64;
                case 154: goto L64;
                case 155: goto L64;
                case 156: goto L61;
                case 157: goto L5e;
                case 158: goto L61;
                case 159: goto L5e;
                case 160: goto L61;
                case 161: goto L5e;
                case 162: goto L61;
                case 163: goto L5e;
                case 164: goto L61;
                case 165: goto L5e;
                case 166: goto L61;
                case 167: goto L5e;
                case 168: goto L61;
                case 169: goto L5e;
                case 170: goto L61;
                case 171: goto L5e;
                case 172: goto L61;
                case 173: goto L5e;
                case 174: goto L6a;
                case 175: goto L67;
                case 176: goto L5d;
                case 177: goto L5d;
                case 178: goto L6a;
                case 179: goto L67;
                case 180: goto L5d;
                case 181: goto L5d;
                case 182: goto L6a;
                case 183: goto L67;
                case 184: goto L5d;
                case 185: goto L5d;
                case 186: goto L5a;
                case 187: goto L5a;
                case 188: goto L5a;
                case 189: goto L5a;
                case 190: goto L5a;
                case 191: goto L5a;
                case 192: goto L57;
                case 193: goto L57;
                case 194: goto L57;
                case 195: goto L57;
                case 196: goto L57;
                case 197: goto L57;
                case 198: goto L54;
                case 199: goto L51;
                case 49153: goto L6f;
                case 49170: goto L6d;
                case 49171: goto L6a;
                case 49172: goto L67;
                case 49173: goto L6f;
                case 49175: goto L6d;
                case 49176: goto L6a;
                case 49177: goto L67;
                case 49178: goto L6d;
                case 49179: goto L6d;
                case 49180: goto L6d;
                case 49181: goto L6a;
                case 49182: goto L6a;
                case 49183: goto L6a;
                case 49184: goto L67;
                case 49185: goto L67;
                case 49186: goto L67;
                case 49187: goto L6a;
                case 49188: goto L67;
                case 49189: goto L6a;
                case 49190: goto L67;
                case 49191: goto L6a;
                case 49192: goto L67;
                case 49193: goto L6a;
                case 49194: goto L67;
                case 49195: goto L61;
                case 49196: goto L5e;
                case 49197: goto L61;
                case 49198: goto L5e;
                case 49199: goto L61;
                case 49200: goto L5e;
                case 49201: goto L61;
                case 49202: goto L5e;
                case 49204: goto L6d;
                case 49205: goto L6a;
                case 49206: goto L67;
                case 49207: goto L6a;
                case 49208: goto L67;
                case 49209: goto L6f;
                case 49210: goto L5d;
                case 49211: goto L5d;
                case 49212: goto L4e;
                case 49213: goto L4b;
                case 49214: goto L4e;
                case 49215: goto L4b;
                case 49216: goto L4e;
                case 49217: goto L4b;
                case 49218: goto L4e;
                case 49219: goto L4b;
                case 49220: goto L4e;
                case 49221: goto L4b;
                case 49222: goto L4e;
                case 49223: goto L4b;
                case 49224: goto L4e;
                case 49225: goto L4b;
                case 49226: goto L4e;
                case 49227: goto L4b;
                case 49228: goto L4e;
                case 49229: goto L4b;
                case 49230: goto L4e;
                case 49231: goto L4b;
                case 49232: goto L48;
                case 49233: goto L45;
                case 49234: goto L48;
                case 49235: goto L45;
                case 49236: goto L48;
                case 49237: goto L45;
                case 49238: goto L48;
                case 49239: goto L45;
                case 49240: goto L48;
                case 49241: goto L45;
                case 49242: goto L48;
                case 49243: goto L45;
                case 49244: goto L48;
                case 49245: goto L45;
                case 49246: goto L48;
                case 49247: goto L45;
                case 49248: goto L48;
                case 49249: goto L45;
                case 49250: goto L48;
                case 49251: goto L45;
                case 49252: goto L4e;
                case 49253: goto L4b;
                case 49254: goto L4e;
                case 49255: goto L4b;
                case 49256: goto L4e;
                case 49257: goto L4b;
                case 49258: goto L48;
                case 49259: goto L45;
                case 49260: goto L48;
                case 49261: goto L45;
                case 49262: goto L48;
                case 49263: goto L45;
                case 49264: goto L4e;
                case 49265: goto L4b;
                case 49266: goto L5a;
                case 49267: goto L57;
                case 49268: goto L5a;
                case 49269: goto L57;
                case 49270: goto L5a;
                case 49271: goto L57;
                case 49272: goto L5a;
                case 49273: goto L57;
                case 49274: goto L42;
                case 49275: goto L3f;
                case 49276: goto L42;
                case 49277: goto L3f;
                case 49278: goto L42;
                case 49279: goto L3f;
                case 49280: goto L42;
                case 49281: goto L3f;
                case 49282: goto L42;
                case 49283: goto L3f;
                case 49284: goto L42;
                case 49285: goto L3f;
                case 49286: goto L42;
                case 49287: goto L3f;
                case 49288: goto L42;
                case 49289: goto L3f;
                case 49290: goto L42;
                case 49291: goto L3f;
                case 49292: goto L42;
                case 49293: goto L3f;
                case 49294: goto L42;
                case 49295: goto L3f;
                case 49296: goto L42;
                case 49297: goto L3f;
                case 49298: goto L42;
                case 49299: goto L3f;
                case 49300: goto L5a;
                case 49301: goto L57;
                case 49302: goto L5a;
                case 49303: goto L57;
                case 49304: goto L5a;
                case 49305: goto L57;
                case 49306: goto L5a;
                case 49307: goto L57;
                case 49308: goto L3c;
                case 49309: goto L39;
                case 49310: goto L3c;
                case 49311: goto L39;
                case 49312: goto L36;
                case 49313: goto L33;
                case 49314: goto L36;
                case 49315: goto L33;
                case 49316: goto L3c;
                case 49317: goto L39;
                case 49318: goto L3c;
                case 49319: goto L39;
                case 49320: goto L36;
                case 49321: goto L33;
                case 49322: goto L36;
                case 49323: goto L33;
                case 49324: goto L3c;
                case 49325: goto L39;
                case 49326: goto L36;
                case 49327: goto L33;
                case 49332: goto L30;
                case 49333: goto L2d;
                case 49408: goto L2a;
                case 49409: goto L27;
                case 49410: goto L24;
                case 52392: goto L21;
                case 52393: goto L21;
                case 52394: goto L21;
                case 52395: goto L21;
                case 52396: goto L21;
                case 52397: goto L21;
                case 52398: goto L21;
                case 53249: goto L61;
                case 53250: goto L5e;
                case 53251: goto L36;
                case 53253: goto L3c;
                default: goto L4;
            }
        L4:
            switch(r1) {
                case 44: goto L6f;
                case 45: goto L6f;
                case 46: goto L6f;
                case 47: goto L6a;
                case 48: goto L6a;
                case 49: goto L6a;
                case 50: goto L6a;
                case 51: goto L6a;
                case 52: goto L6a;
                case 53: goto L67;
                case 54: goto L67;
                case 55: goto L67;
                case 56: goto L67;
                case 57: goto L67;
                case 58: goto L67;
                case 59: goto L5d;
                case 60: goto L6a;
                case 61: goto L67;
                case 62: goto L6a;
                case 63: goto L6a;
                case 64: goto L6a;
                case 65: goto L5a;
                case 66: goto L5a;
                case 67: goto L5a;
                case 68: goto L5a;
                case 69: goto L5a;
                case 70: goto L5a;
                default: goto L7;
            }
        L7:
            switch(r1) {
                case 103: goto L6a;
                case 104: goto L67;
                case 105: goto L67;
                case 106: goto L67;
                case 107: goto L67;
                case 108: goto L6a;
                case 109: goto L67;
                default: goto La;
            }
        La:
            switch(r1) {
                case 132: goto L57;
                case 133: goto L57;
                case 134: goto L57;
                case 135: goto L57;
                case 136: goto L57;
                case 137: goto L57;
                default: goto Ld;
            }
        Ld:
            switch(r1) {
                case 139: goto L6d;
                case 140: goto L6a;
                case 141: goto L67;
                default: goto L10;
            }
        L10:
            switch(r1) {
                case 143: goto L6d;
                case 144: goto L6a;
                case 145: goto L67;
                default: goto L13;
            }
        L13:
            switch(r1) {
                case 4865: goto L61;
                case 4866: goto L5e;
                case 4867: goto L21;
                case 4868: goto L3c;
                case 4869: goto L36;
                default: goto L16;
            }
        L16:
            switch(r1) {
                case 49155: goto L6d;
                case 49156: goto L6a;
                case 49157: goto L67;
                case 49158: goto L6f;
                default: goto L19;
            }
        L19:
            switch(r1) {
                case 49160: goto L6d;
                case 49161: goto L6a;
                case 49162: goto L67;
                case 49163: goto L6f;
                default: goto L1c;
            }
        L1c:
            switch(r1) {
                case 49165: goto L6d;
                case 49166: goto L6a;
                case 49167: goto L67;
                case 49168: goto L6f;
                default: goto L1f;
            }
        L1f:
            r1 = -1
            return r1
        L21:
            r1 = 21
            return r1
        L24:
            r1 = 31
            return r1
        L27:
            r1 = 30
            return r1
        L2a:
            r1 = 29
            return r1
        L2d:
            r1 = 33
            return r1
        L30:
            r1 = 32
            return r1
        L33:
            r1 = 18
            return r1
        L36:
            r1 = 16
            return r1
        L39:
            r1 = 17
            return r1
        L3c:
            r1 = 15
            return r1
        L3f:
            r1 = 20
            return r1
        L42:
            r1 = 19
            return r1
        L45:
            r1 = 25
            return r1
        L48:
            r1 = 24
            return r1
        L4b:
            r1 = 23
            return r1
        L4e:
            r1 = 22
            return r1
        L51:
            r1 = 26
            return r1
        L54:
            r1 = 27
            return r1
        L57:
            r1 = 13
            return r1
        L5a:
            r1 = 12
            return r1
        L5d:
            return r0
        L5e:
            r1 = 11
            return r1
        L61:
            r1 = 10
            return r1
        L64:
            r1 = 14
            return r1
        L67:
            r1 = 9
            return r1
        L6a:
            r1 = 8
            return r1
        L6d:
            r1 = 7
            return r1
        L6f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ht0.q(int):int");
    }

    public static byte[] r(Hashtable hashtable, Integer num) {
        if (hashtable == null) {
            return null;
        }
        return (byte[]) hashtable.get(num);
    }

    public static int s(int i) {
        switch (i) {
            case 2:
            case 10:
            case 150:
            case 156:
            case 157:
            case 186:
            case 192:
            case 49212:
            case 49213:
            case 49232:
            case 49233:
            case 49274:
            case 49275:
            case 49308:
            case 49309:
            case 49312:
            case 49313:
                return 1;
            case 13:
            case 151:
            case 164:
            case 165:
            case 187:
            case 193:
            case 49214:
            case 49215:
            case 49240:
            case 49241:
            case 49282:
            case 49283:
                return 7;
            case 16:
            case 152:
            case 160:
            case 161:
            case 188:
            case 194:
            case 49216:
            case 49217:
            case 49236:
            case 49237:
            case 49278:
            case 49279:
                return 9;
            case 19:
            case 153:
            case 162:
            case 163:
            case 189:
            case 195:
            case 49218:
            case 49219:
            case 49238:
            case 49239:
            case 49280:
            case 49281:
                return 3;
            case 22:
            case 154:
            case 158:
            case 159:
            case 190:
            case 196:
            case 49220:
            case 49221:
            case 49234:
            case 49235:
            case 49276:
            case 49277:
            case 49310:
            case 49311:
            case 49314:
            case 49315:
            case 52394:
                return 5;
            case 27:
            case 155:
            case 166:
            case 167:
            case 191:
            case 197:
            case 49222:
            case 49223:
            case 49242:
            case 49243:
            case 49284:
            case 49285:
                return 11;
            case 147:
            case 148:
            case 149:
            case 172:
            case 173:
            case 182:
            case 183:
            case 184:
            case 185:
            case 49256:
            case 49257:
            case 49262:
            case 49263:
            case 49298:
            case 49299:
            case 49304:
            case 49305:
            case 52398:
                return 15;
            case 168:
            case 169:
            case 174:
            case 175:
            case 176:
            case 177:
            case 49252:
            case 49253:
            case 49258:
            case 49259:
            case 49294:
            case 49295:
            case 49300:
            case 49301:
            case 49316:
            case 49317:
            case 49320:
            case 49321:
            case 52395:
                return 13;
            case 170:
            case 171:
            case 178:
            case 179:
            case 180:
            case 181:
            case 49254:
            case 49255:
            case 49260:
            case 49261:
            case 49296:
            case 49297:
            case 49302:
            case 49303:
            case 49318:
            case 49319:
            case 49322:
            case 49323:
            case 52397:
                return 14;
            case 198:
            case 199:
            case 49332:
            case 49333:
                return 0;
            case 49153:
            case 49189:
            case 49190:
            case 49197:
            case 49198:
            case 49226:
            case 49227:
            case 49246:
            case 49247:
            case 49268:
            case 49269:
            case 49288:
            case 49289:
                return 16;
            case 49170:
            case 49171:
            case 49172:
            case 49191:
            case 49192:
            case 49199:
            case 49200:
            case 49228:
            case 49229:
            case 49248:
            case 49249:
            case 49270:
            case 49271:
            case 49290:
            case 49291:
            case 52392:
                return 19;
            case 49173:
            case 49175:
            case 49176:
            case 49177:
                return 20;
            case 49178:
            case 49181:
            case 49184:
                return 21;
            case 49179:
            case 49182:
            case 49185:
                return 23;
            case 49180:
            case 49183:
            case 49186:
                return 22;
            case 49187:
            case 49188:
            case 49195:
            case 49196:
            case 49224:
            case 49225:
            case 49244:
            case 49245:
            case 49266:
            case 49267:
            case 49286:
            case 49287:
            case 49324:
            case 49325:
            case 49326:
            case 49327:
            case 52393:
                return 17;
            case 49193:
            case 49194:
            case 49201:
            case 49202:
            case 49230:
            case 49231:
            case 49250:
            case 49251:
            case 49272:
            case 49273:
            case 49292:
            case 49293:
                return 18;
            case 49204:
            case 49205:
            case 49206:
            case 49207:
            case 49208:
            case 49209:
            case 49210:
            case 49211:
            case 49264:
            case 49265:
            case 49306:
            case 49307:
            case 52396:
            case 53249:
            case 53250:
            case 53251:
            case 53253:
                return 24;
            case 49408:
            case 49409:
            case 49410:
                return 26;
            default:
                switch (i) {
                    case 44:
                        return 13;
                    case 45:
                        return 14;
                    case 46:
                        return 15;
                    case 47:
                    case 53:
                    case 59:
                    case 60:
                    case 61:
                    case 65:
                        return 1;
                    case 48:
                    case 54:
                    case 62:
                    case 66:
                        return 7;
                    case 49:
                    case 55:
                    case 63:
                    case 67:
                        return 9;
                    case 50:
                    case 56:
                    case 64:
                    case 68:
                        return 3;
                    case 51:
                    case 57:
                    case 69:
                        return 5;
                    case 52:
                    case 58:
                    case 70:
                        return 11;
                    default:
                        switch (i) {
                            case 103:
                            case 107:
                                return 5;
                            case 104:
                                return 7;
                            case 105:
                                return 9;
                            case 106:
                                return 3;
                            case 108:
                            case 109:
                                return 11;
                            default:
                                switch (i) {
                                    case 132:
                                        return 1;
                                    case 133:
                                        return 7;
                                    case 134:
                                        return 9;
                                    case 135:
                                        return 3;
                                    case 136:
                                        return 5;
                                    case 137:
                                        return 11;
                                    default:
                                        switch (i) {
                                            case 139:
                                            case 140:
                                            case 141:
                                                return 13;
                                            default:
                                                switch (i) {
                                                    case 143:
                                                    case 144:
                                                    case 145:
                                                        return 14;
                                                    default:
                                                        switch (i) {
                                                            case 4865:
                                                            case 4866:
                                                            case 4867:
                                                            case 4868:
                                                            case 4869:
                                                                return 0;
                                                            default:
                                                                switch (i) {
                                                                    case 49155:
                                                                    case 49156:
                                                                    case 49157:
                                                                        return 16;
                                                                    case 49158:
                                                                        return 17;
                                                                    default:
                                                                        switch (i) {
                                                                            case 49160:
                                                                            case 49161:
                                                                            case 49162:
                                                                                return 17;
                                                                            case 49163:
                                                                                return 18;
                                                                            default:
                                                                                switch (i) {
                                                                                    case 49165:
                                                                                    case 49166:
                                                                                    case 49167:
                                                                                        return 18;
                                                                                    case 49168:
                                                                                        return 19;
                                                                                    default:
                                                                                        return -1;
                                                                                }
                                                                        }
                                                                }
                                                        }
                                                }
                                        }
                                }
                        }
                }
        }
    }

    public static s t(short s) {
        switch (s) {
            case 1:
                return od0.i;
            case 2:
                return x11.d;
            case 3:
                return kb0.d;
            case 4:
                return kb0.a;
            case 5:
                return kb0.b;
            case 6:
                return kb0.c;
            default:
                c.k("invalid HashAlgorithm: ".concat(f20.I(s)));
                return null;
        }
    }

    public static boolean u(Hashtable hashtable, Integer num) {
        byte[] r = r(hashtable, num);
        if (r == null) {
            return false;
        }
        if (r.length == 0) {
            return true;
        }
        throw new us0((short) 47, null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0068 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006a A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.is0 v(defpackage.js0 r18) {
        /*
            Method dump skipped, instructions count: 1186
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ht0.v(js0):is0");
    }

    public static boolean w(xf0 xf0Var) {
        xf0 d2 = xf0Var.d();
        if (!xf0.f.b(d2) && !xf0.e.b(d2) && !xf0.d.b(d2)) {
            return false;
        }
        return true;
    }

    public static boolean x(short[] sArr) {
        if (sArr == null || sArr.length < 1) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0015. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x0018. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x001d. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x0020. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0040 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0076 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0075 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean y(int r7, int r8) {
        /*
            r0 = 8
            r1 = 0
            r2 = 1
            if (r8 == 0) goto L71
            if (r8 == r2) goto L71
            r3 = 5
            r4 = 13
            if (r8 == r3) goto L68
            r3 = 10
            if (r8 == r3) goto L71
            r3 = 27
            if (r8 == r3) goto L63
            switch(r8) {
                case 13: goto L63;
                case 14: goto L71;
                case 15: goto L71;
                case 16: goto L71;
                default: goto L18;
            }
        L18:
            switch(r8) {
                case 18: goto L68;
                case 19: goto L71;
                case 20: goto L71;
                case 21: goto L60;
                default: goto L1b;
            }
        L1b:
            r5 = 2
            r6 = 6
            switch(r8) {
                case 41: goto L5b;
                case 42: goto L53;
                case 43: goto L4c;
                case 44: goto L47;
                case 45: goto L60;
                default: goto L20;
            }
        L20:
            switch(r8) {
                case 47: goto L63;
                case 48: goto L44;
                case 49: goto L60;
                case 50: goto L63;
                case 51: goto L4c;
                default: goto L23;
            }
        L23:
            if (r8 == r3) goto L40
            r7 = 28
            if (r8 == r7) goto L40
            r7 = 35
            if (r8 == r7) goto L40
            r7 = 54
            if (r8 == r7) goto L40
            r7 = 65281(0xff01, float:9.1478E-41)
            if (r8 == r7) goto L40
            switch(r8) {
                case 0: goto L40;
                case 1: goto L40;
                case 2: goto L40;
                case 3: goto L40;
                case 4: goto L40;
                case 5: goto L40;
                case 6: goto L40;
                case 7: goto L40;
                case 8: goto L40;
                case 9: goto L40;
                case 10: goto L40;
                case 11: goto L40;
                case 12: goto L40;
                case 13: goto L40;
                case 14: goto L40;
                case 15: goto L40;
                case 16: goto L40;
                case 17: goto L40;
                case 18: goto L40;
                case 19: goto L40;
                case 20: goto L40;
                case 21: goto L40;
                case 22: goto L40;
                case 23: goto L40;
                case 24: goto L40;
                case 25: goto L40;
                default: goto L39;
            }
        L39:
            switch(r8) {
                case 41: goto L40;
                case 42: goto L40;
                case 43: goto L40;
                case 44: goto L40;
                case 45: goto L40;
                default: goto L3c;
            }
        L3c:
            switch(r8) {
                case 47: goto L40;
                case 48: goto L40;
                case 49: goto L40;
                case 50: goto L40;
                case 51: goto L40;
                default: goto L3f;
            }
        L3f:
            goto L41
        L40:
            r1 = r2
        L41:
            r7 = r1 ^ 1
            return r7
        L44:
            if (r7 == r4) goto L76
            goto L75
        L47:
            if (r7 == r2) goto L76
            if (r7 == r6) goto L76
            goto L75
        L4c:
            if (r7 == r2) goto L76
            if (r7 == r5) goto L76
            if (r7 == r6) goto L76
            goto L75
        L53:
            if (r7 == r2) goto L76
            r8 = 4
            if (r7 == r8) goto L76
            if (r7 == r0) goto L76
            goto L75
        L5b:
            if (r7 == r2) goto L76
            if (r7 == r5) goto L76
            goto L75
        L60:
            if (r7 == r2) goto L76
            goto L75
        L63:
            if (r7 == r2) goto L76
            if (r7 == r4) goto L76
            goto L75
        L68:
            if (r7 == r2) goto L76
            r8 = 11
            if (r7 == r8) goto L76
            if (r7 == r4) goto L76
            goto L75
        L71:
            if (r7 == r2) goto L76
            if (r7 == r0) goto L76
        L75:
            return r1
        L76:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ht0.y(int, int):boolean");
    }

    public static boolean z(xf0 xf0Var) {
        if (xf0Var != null && xf0.f.i(xf0Var.d())) {
            return true;
        }
        return false;
    }
}
