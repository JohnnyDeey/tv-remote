package defpackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

/* loaded from: classes.dex */
public final class ks0 {
    public final ch0 d;
    public uo g;
    public final me a = new me(0);
    public final me b = new me(2);
    public final me c = new me(0);
    public final Object e = new Object();
    public int f = -1;
    public zs0 h = null;
    public ho0 i = null;
    public volatile boolean j = false;
    public volatile boolean k = false;
    public volatile boolean l = false;
    public volatile boolean m = true;
    public volatile boolean n = false;
    public volatile boolean o = false;
    public l40 p = null;
    public cn0 q = null;
    public i30 r = null;
    public byte[] s = null;
    public int t = -1;
    public Hashtable u = null;
    public Hashtable v = null;
    public short w = 0;
    public boolean x = false;
    public boolean y = false;
    public final boolean z = true;
    public po A = null;
    public js0 B = null;
    public Hashtable C = null;
    public k3 D = null;
    public c1 E = null;
    public l3 F = null;
    public l3 G = null;

    public ks0(InputStream inputStream, OutputStream outputStream) {
        this.d = new ch0(this, inputStream, outputStream);
    }

    public static byte[] D(Hashtable hashtable, int i) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        G(byteArrayOutputStream, hashtable, true);
        G(byteArrayOutputStream, hashtable, false);
        byte[] bArr = (byte[]) hashtable.get(41);
        if (bArr != null) {
            ht0.g(41);
            ht0.Z(41, byteArrayOutputStream);
            int length = bArr.length + i;
            ht0.g(length);
            ht0.Z(length, byteArrayOutputStream);
            byteArrayOutputStream.write(bArr);
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static void G(ByteArrayOutputStream byteArrayOutputStream, Hashtable hashtable, boolean z) {
        boolean z2;
        Enumeration keys = hashtable.keys();
        while (keys.hasMoreElements()) {
            Integer num = (Integer) keys.nextElement();
            int intValue = num.intValue();
            if (41 != intValue) {
                byte[] bArr = (byte[]) hashtable.get(num);
                if (bArr.length == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z == z2) {
                    ht0.g(intValue);
                    ht0.Z(intValue, byteArrayOutputStream);
                    ht0.X(bArr, byteArrayOutputStream);
                }
            }
        }
    }

    public static void b(ByteArrayInputStream byteArrayInputStream) {
        if (byteArrayInputStream.available() <= 0) {
        } else {
            throw new us0((short) 50, null, null);
        }
    }

    public static void g(js0 js0Var, c1 c1Var) {
        String str;
        byte[] bArr;
        i30 b = c1Var.b();
        if (b != null) {
            try {
                im0 c = js0Var.c();
                byte[] bArr2 = ht0.a;
                im0 c2 = js0Var.c();
                if (c2.y) {
                    str = "extended master secret";
                    bArr = c2.t;
                } else {
                    str = "master secret";
                    byte[] bArr3 = c2.r;
                    byte[] bArr4 = c2.s;
                    byte[] bArr5 = new byte[bArr3.length + bArr4.length];
                    System.arraycopy(bArr3, 0, bArr5, 0, bArr3.length);
                    System.arraycopy(bArr4, 0, bArr5, bArr3.length, bArr4.length);
                    bArr = bArr5;
                }
                c.o = b.c(c2.f, 48, str, bArr);
                return;
            } finally {
                b.d();
            }
        }
        throw new us0((short) 80, null, null);
    }

    public static Hashtable v(ByteArrayInputStream byteArrayInputStream) {
        if (byteArrayInputStream.available() < 1) {
            return null;
        }
        byte[] K = ht0.K(ht0.P(byteArrayInputStream), byteArrayInputStream);
        b(byteArrayInputStream);
        Hashtable hashtable = new Hashtable();
        if (K.length > 0) {
            ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(K);
            do {
                int P = ht0.P(byteArrayInputStream2);
                if (hashtable.put(Integer.valueOf(P), ht0.K(ht0.P(byteArrayInputStream2), byteArrayInputStream2)) != null) {
                    f40.a(47, null, "Repeated extension: ".concat(f20.G(P)));
                    return null;
                }
            } while (byteArrayInputStream2.available() > 0);
        }
        return hashtable;
    }

    public static Hashtable w(int i, byte[] bArr) {
        String G;
        String str;
        Hashtable hashtable = new Hashtable();
        if (bArr.length > 0) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            do {
                int P = ht0.P(byteArrayInputStream);
                if (ht0.y(i, P)) {
                    if (hashtable.put(Integer.valueOf(P), ht0.K(ht0.P(byteArrayInputStream), byteArrayInputStream)) != null) {
                        G = f20.G(P);
                        str = "Repeated extension: ";
                    }
                } else {
                    G = f20.G(P);
                    str = "Invalid extension: ";
                }
                f40.a(47, null, str.concat(G));
                return null;
            } while (byteArrayInputStream.available() > 0);
        }
        return hashtable;
    }

    public static f30 x(a10 a10Var) {
        byte[] bArr = ht0.a;
        int read = a10Var.read();
        int read2 = a10Var.read();
        if (read2 >= 0) {
            xf0 c = xf0.c(read, read2);
            byte[] K = ht0.K(32, a10Var);
            short S = ht0.S(a10Var);
            if (S >= 0 && 32 >= S) {
                byte[] K2 = ht0.K(S, a10Var);
                int P = ht0.P(a10Var);
                if (ht0.S(a10Var) == 0) {
                    return new f30(c, K, K2, P, v(a10Var));
                }
                throw new us0((short) 47, null, null);
            }
            throw new us0((short) 50, null, null);
        }
        throw new EOFException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A(boolean z) {
        if (this.l && this.n) {
            byte[] bArr = ht0.a;
            if (((z ? 1 : 0) & 255) == z) {
                byte[] bArr2 = {z ? (byte) 1 : (byte) 0};
                nq nqVar = new nq((short) 24, 1);
                nqVar.write(bArr2);
                nqVar.c(this);
                js0 js0Var = this.B;
                js0Var.getClass();
                ht0.U(js0Var, false);
                ch0 ch0Var = this.d;
                ch0Var.j.j();
                ch0Var.c.b();
                this.o = (z ? 1 : 0) & (this.o ? 1 : 0);
                return;
            }
            throw new us0((short) 80, null, null);
        }
        throw new us0((short) 80, null, null);
    }

    public final void B() {
        nq nqVar = new nq((short) 1);
        k3 k3Var = this.D;
        int i = k3Var.a;
        if (i >= 0) {
            xf0 xf0Var = (xf0) k3Var.b;
            byte[] bArr = ht0.a;
            nqVar.write(xf0Var.e());
            nqVar.write(xf0Var.f());
            nqVar.write((byte[]) k3Var.c);
            ht0.Y((byte[]) k3Var.d, nqVar);
            int[] iArr = (int[]) k3Var.e;
            int length = iArr.length * 2;
            ht0.g(length);
            ht0.Z(length, nqVar);
            for (int i2 : iArr) {
                ht0.Z(i2, nqVar);
            }
            ht0.h(1);
            nqVar.write(1);
            nqVar.write(new short[]{0}[0]);
            Hashtable hashtable = (Hashtable) k3Var.f;
            if (hashtable != null && !hashtable.isEmpty()) {
                byte[] D = D(hashtable, i);
                int length2 = D.length + i;
                ht0.g(length2);
                ht0.Z(length2, nqVar);
                nqVar.write(D);
            }
            nqVar.b(this.g, this.D.a);
            nqVar.d(this, this.g, this.D.a);
            return;
        }
        throw new us0((short) 80, null, null);
    }

    public final void C() {
        js0 js0Var = this.B;
        im0 c = js0Var.c();
        byte[] e = ht0.e(js0Var, this.g, false);
        c.K = e;
        if (c.a) {
            boolean z = c.y;
        }
        nq nqVar = new nq((short) 20, e.length);
        nqVar.write(e);
        nqVar.c(this);
    }

    public final void E(int i, byte[] bArr) {
        xf0 xf0Var;
        if (i >= 4) {
            byte[] bArr2 = ht0.a;
            int i2 = 0;
            short s = (short) (bArr[0] & 255);
            if (s != 0 && s != 1 && (s == 4 ? !((xf0Var = this.B.a().H) == null || ht0.A(xf0Var)) : s != 24)) {
                this.g.update(bArr, 0, i);
            }
            do {
                int min = Math.min(i - i2, this.d.l);
                z(i2, min, (short) 22, bArr);
                i2 += min;
            } while (i2 < i);
            return;
        }
        throw new us0((short) 80, null, null);
    }

    public final void F(int i, int i2, short s, byte[] bArr) {
        ch0 ch0Var = this.d;
        OutputStream outputStream = ch0Var.f;
        if (ch0Var.k == null) {
            return;
        }
        if (i2 <= ch0Var.l) {
            if (i2 < 1 && s != 23) {
                throw new us0((short) 80, null, null);
            }
            long a = ch0Var.c.a((short) 80);
            xf0 xf0Var = ch0Var.k;
            ss0 i3 = ch0Var.j.i(a, s, xf0Var, bArr, i, i2);
            int i4 = i3.b;
            byte[] bArr2 = i3.a;
            int i5 = i4 - 5;
            ht0.g(i5);
            bArr2[0] = (byte) i3.c;
            ht0.d0(xf0Var, bArr2, 1);
            ht0.a0(bArr2, i5, 3);
            try {
                outputStream.write(bArr2, 0, i4);
                outputStream.flush();
                return;
            } catch (InterruptedIOException e) {
                f40.a(80, e, null);
                return;
            }
        }
        throw new us0((short) 80, null, null);
    }

    public final void a(short s) {
        if (s >= 0) {
            if (s >= 1 && s <= 4) {
                int i = 1 << (s + 8);
                ch0 ch0Var = this.d;
                ch0Var.l = i;
                ch0Var.m = ch0Var.h.b(i);
                return;
            }
            throw new us0((short) 80, null, null);
        }
    }

    public final void c() {
        im0 a;
        js0 js0Var = this.B;
        if (js0Var != null && (a = js0Var.a()) != null) {
            a.t = null;
            a.u = null;
            a.A = null;
            a.B = null;
            a.C = null;
            a.D = null;
            a.I = 0;
            im0.a(a.j);
            a.j = null;
            im0.a(a.k);
            a.k = null;
            im0.a(a.l);
            a.l = null;
            im0.a(a.m);
            a.m = null;
            im0.a(a.n);
            a.n = null;
            im0.a(a.o);
            a.o = null;
        }
        this.p = null;
        this.q = null;
        this.r = null;
        this.s = null;
        this.t = -1;
        this.u = null;
        this.v = null;
        this.x = false;
        this.y = false;
        this.C = null;
        this.D = null;
        this.E = null;
        this.F = null;
        this.G = null;
    }

    public final void d() {
        ch0 ch0Var = this.d;
        ah0 ah0Var = ch0Var.a;
        ah0Var.b = ah0Var.a;
        ah0Var.c = 0;
        try {
            ch0Var.e.close();
            e = null;
        } catch (IOException e) {
            e = e;
        }
        try {
            ch0Var.f.close();
        } catch (IOException e2) {
            if (e == null) {
                e = e2;
            }
        }
        if (e == null) {
        } else {
            throw e;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d1 A[Catch: all -> 0x006f, TryCatch #3 {all -> 0x006f, blocks: (B:3:0x0002, B:4:0x0008, B:10:0x0012, B:13:0x0018, B:15:0x001c, B:17:0x0020, B:19:0x0028, B:21:0x002c, B:23:0x0060, B:24:0x0072, B:26:0x0076, B:28:0x0084, B:31:0x008b, B:32:0x008c, B:34:0x00a1, B:37:0x00a8, B:40:0x00c2, B:44:0x00d1, B:45:0x012f, B:46:0x0131, B:52:0x013b, B:60:0x014b, B:61:0x0100, B:62:0x0107, B:64:0x00b4, B:69:0x010a, B:70:0x010b, B:71:0x011e, B:72:0x011f, B:73:0x014c, B:74:0x0153, B:75:0x0154, B:76:0x0159, B:81:0x015c, B:48:0x0132, B:50:0x0136, B:51:0x013a, B:56:0x0144, B:57:0x0149, B:30:0x0085, B:6:0x0009), top: B:2:0x0002, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0100 A[Catch: all -> 0x006f, TryCatch #3 {all -> 0x006f, blocks: (B:3:0x0002, B:4:0x0008, B:10:0x0012, B:13:0x0018, B:15:0x001c, B:17:0x0020, B:19:0x0028, B:21:0x002c, B:23:0x0060, B:24:0x0072, B:26:0x0076, B:28:0x0084, B:31:0x008b, B:32:0x008c, B:34:0x00a1, B:37:0x00a8, B:40:0x00c2, B:44:0x00d1, B:45:0x012f, B:46:0x0131, B:52:0x013b, B:60:0x014b, B:61:0x0100, B:62:0x0107, B:64:0x00b4, B:69:0x010a, B:70:0x010b, B:71:0x011e, B:72:0x011f, B:73:0x014c, B:74:0x0153, B:75:0x0154, B:76:0x0159, B:81:0x015c, B:48:0x0132, B:50:0x0136, B:51:0x013a, B:56:0x0144, B:57:0x0149, B:30:0x0085, B:6:0x0009), top: B:2:0x0002, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00cd  */
    /* JADX WARN: Type inference failed for: r5v1, types: [cn0, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            Method dump skipped, instructions count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ks0.e():void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
        	at jadx.core.dex.visitors.regions.RegionMaker.calcSwitchOut(RegionMaker.java:923)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:797)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:157)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processFallThroughCases(RegionMaker.java:841)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:800)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:157)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:740)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:740)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processFallThroughCases(RegionMaker.java:841)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:800)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:157)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processFallThroughCases(RegionMaker.java:841)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:800)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:157)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:740)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:640)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processFallThroughCases(RegionMaker.java:841)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:800)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:157)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:263)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:135)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:740)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARN: Failed to find 'out' block for switch in B:105:0x022f. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:116:0x0248. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:119:0x0251. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:142:0x0299. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:166:0x02b0. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:99:0x021b. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:113:0x023a A[FALL_THROUGH] */
    /* JADX WARN: Type inference failed for: r2v1, types: [js0, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(defpackage.po r32) {
        /*
            Method dump skipped, instructions count: 2302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ks0.f(po):void");
    }

    public final void h(boolean z) {
        if (!this.j) {
            this.j = true;
            if (!this.l) {
                c();
                if (z) {
                    u((short) 90);
                }
            }
            u((short) 0);
            d();
            this.A.getClass();
        }
    }

    public final void i(short s, Exception exc) {
        if ((!this.l || !(exc instanceof InterruptedIOException)) && !this.j) {
            this.A.getClass();
            try {
                F(0, 2, (short) 21, new byte[]{2, (byte) s});
            } catch (Exception unused) {
            }
            j();
        }
    }

    public final void j() {
        this.j = true;
        this.k = true;
        n();
        if (!this.l) {
            c();
        }
        d();
        this.A.getClass();
    }

    /* JADX WARN: Code restructure failed: missing block: B:211:0x043d, code lost:
    
        if (r6 == r7) goto L215;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:310:0x05de. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0592  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0638  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0648  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x069f  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x06b0  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x06c5  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x0787 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:406:0x063c  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x062a  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x07b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(short r18, defpackage.a10 r19) {
        /*
            Method dump skipped, instructions count: 3240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ks0.k(short, a10):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d7, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l() {
        /*
            r11 = this;
            js0 r0 = r11.B
            c1 r1 = r11.E
            l3 r2 = r11.F
            java.util.Hashtable r3 = r11.u
            java.util.Hashtable r11 = r11.v
            byte[] r4 = defpackage.ht0.a
            im0 r0 = r0.c()
            xf0 r4 = r0.H
            boolean r4 = defpackage.ht0.A(r4)
            r5 = 0
            if (r2 != 0) goto L33
            if (r4 != 0) goto L2b
            boolean r11 = r0.b
            if (r11 != 0) goto L23
            r1.i()
            return
        L23:
            us0 r11 = new us0
            r0 = 40
            r11.<init>(r0, r5, r5)
            throw r11
        L2b:
            us0 r11 = new us0
            r0 = 80
            r11.<init>(r0, r5, r5)
            throw r11
        L33:
            wf r0 = r0.G
            r6 = 0
            r6 r7 = r0.b(r6)
            s r8 = defpackage.bt0.a
            java.lang.Object r7 = r7.e
            java.security.cert.X509Certificate r7 = (java.security.cert.X509Certificate) r7
            java.lang.String r8 = r8.t()
            byte[] r7 = r7.getExtensionValue(r8)
            if (r7 != 0) goto L4c
            r7 = r5
            goto L54
        L4c:
            x r7 = defpackage.x.n(r7)
            t r7 = (defpackage.t) r7
            byte[] r7 = r7.c
        L54:
            if (r7 == 0) goto Lc6
            x r8 = defpackage.ht0.J(r7)
            a0 r8 = (defpackage.a0) r8
            r9 = r6
        L5d:
            int r10 = r8.size()
            if (r9 >= r10) goto L76
            i r10 = r8.t(r9)
            boolean r10 = r10 instanceof defpackage.o
            if (r10 == 0) goto L6e
            int r9 = r9 + 1
            goto L5d
        L6e:
            r11 = 42
            java.lang.String r0 = "Server certificate has invalid TLS Features extension"
            defpackage.f40.a(r11, r5, r0)
            return
        L76:
            defpackage.ht0.T(r8, r7)
        L79:
            int r7 = r8.size()
            if (r6 >= r7) goto Lc6
            i r7 = r8.t(r6)
            o r7 = (defpackage.o) r7
            r7.getClass()
            java.math.BigInteger r9 = new java.math.BigInteger
            byte[] r7 = r7.c
            r10 = 1
            r9.<init>(r10, r7)
            int r7 = r9.bitLength()
            r10 = 16
            if (r7 > r10) goto Lc3
            int r7 = r9.intValue()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            boolean r9 = r3.containsKey(r7)
            if (r9 == 0) goto Lc3
            boolean r9 = r11.containsKey(r7)
            if (r9 == 0) goto Lad
            goto Lc3
        Lad:
            us0 r11 = new us0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Server extensions missing TLS Feature "
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            r1 = 46
            r11.<init>(r1, r0, r5)
            throw r11
        Lc3:
            int r6 = r6 + 1
            goto L79
        Lc6:
            if (r4 != 0) goto Lcb
            r1.e(r0)
        Lcb:
            g00 r11 = new g00
            r0 = 17
            r11.<init>(r0)
            int r11 = r2.c
            switch(r11) {
                case 0: goto Ld7;
                default: goto Ld7;
            }
        Ld7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ks0.l():void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x0033. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r3v11, types: [dt0, c1] */
    /* JADX WARN: Type inference failed for: r3v3, types: [ms0, c1] */
    /* JADX WARN: Type inference failed for: r3v6, types: [c1, ct0] */
    /* JADX WARN: Type inference failed for: r3v8, types: [c1, ct0] */
    public final void m(Vector vector) {
        c1 qs0Var;
        c1 c1Var;
        ct0 ct0Var;
        this.A.getClass();
        if (vector == null) {
            this.w = (short) 6;
            js0 js0Var = this.B;
            po poVar = this.A;
            byte[] bArr = ht0.a;
            int i = js0Var.c().E;
            poVar.getClass();
            int i2 = 1;
            if (i != 1) {
                if (i != 3 && i != 5) {
                    int i3 = 0;
                    if (i != 7 && i != 9) {
                        if (i != 11) {
                            switch (i) {
                                case 13:
                                case 15:
                                case 24:
                                    if (i != 24) {
                                        switch (i) {
                                            case 13:
                                            case 14:
                                            case 15:
                                                break;
                                            default:
                                                c.k("unsupported key exchange algorithm");
                                                return;
                                        }
                                        ct0Var.e = null;
                                        ct0Var.f = null;
                                        c1Var = ct0Var;
                                        break;
                                    }
                                    ?? c1Var2 = new c1(i);
                                    c1Var2.d = null;
                                    c1Var2.c = null;
                                    ct0Var = c1Var2;
                                    ct0Var.e = null;
                                    ct0Var.f = null;
                                    c1Var = ct0Var;
                                case 14:
                                    qo c = poVar.c();
                                    if (i != 24) {
                                        switch (i) {
                                            case 13:
                                            case 14:
                                            case 15:
                                                break;
                                            default:
                                                c.k("unsupported key exchange algorithm");
                                                return;
                                        }
                                        ct0Var.e = null;
                                        ct0Var.f = null;
                                        c1Var = ct0Var;
                                        break;
                                    }
                                    ?? c1Var3 = new c1(i);
                                    c1Var3.d = null;
                                    c1Var3.c = c;
                                    ct0Var = c1Var3;
                                    ct0Var.e = null;
                                    ct0Var.f = null;
                                    c1Var = ct0Var;
                                case 16:
                                case 18:
                                    if (i != 16 && i != 18) {
                                        c.k("unsupported key exchange algorithm");
                                        return;
                                    } else {
                                        qs0Var = new ns0(i, i2);
                                        break;
                                    }
                                case 17:
                                case 19:
                                    if (i != 17 && i != 19) {
                                        c.k("unsupported key exchange algorithm");
                                        return;
                                    }
                                    os0 os0Var = new os0(i, i2);
                                    os0Var.e = null;
                                    os0Var.d = null;
                                    c1Var = os0Var;
                                    break;
                                case 20:
                                    if (i == 20) {
                                        qs0 qs0Var2 = new qs0(i, i3);
                                        qs0Var2.d = null;
                                        c1Var = qs0Var2;
                                        break;
                                    } else {
                                        c.k("unsupported key exchange algorithm");
                                        return;
                                    }
                                case 21:
                                case 22:
                                case 23:
                                    ro roVar = new ro();
                                    switch (i) {
                                        case 21:
                                        case 22:
                                        case 23:
                                            ?? c1Var4 = new c1(i);
                                            c1Var4.d = null;
                                            c1Var4.e = null;
                                            c1Var4.f = null;
                                            c1Var4.c = roVar;
                                            c1Var = c1Var4;
                                            break;
                                        default:
                                            c.k("unsupported key exchange algorithm");
                                            return;
                                    }
                                default:
                                    throw new us0((short) 80, null, null);
                            }
                        } else {
                            qo c2 = poVar.c();
                            if (i == 11) {
                                os0 os0Var2 = new os0(i, i3);
                                os0Var2.d = c2;
                                os0Var2.e = null;
                                c1Var = os0Var2;
                            } else {
                                c.k("unsupported key exchange algorithm");
                                return;
                            }
                        }
                    } else {
                        if (i != 7 && i != 9) {
                            c.k("unsupported key exchange algorithm");
                            return;
                        }
                        c1Var = new ns0(i, i3);
                    }
                } else {
                    qo c3 = poVar.c();
                    if (i != 3 && i != 5) {
                        c.k("unsupported key exchange algorithm");
                        return;
                    }
                    ?? c1Var5 = new c1(i);
                    c1Var5.e = null;
                    c1Var5.c = c3;
                    c1Var5.d = null;
                    c1Var = c1Var5;
                }
                c1Var.b = js0Var;
                this.E = c1Var;
                return;
            }
            if (i == 1) {
                qs0Var = new qs0(i, i2);
            } else {
                c.k("unsupported key exchange algorithm");
                return;
            }
            c1Var = qs0Var;
            c1Var.b = js0Var;
            this.E = c1Var;
            return;
        }
        throw new us0((short) 10, null, null);
    }

    public final void n() {
        l40 l40Var = this.p;
        if (l40Var != null) {
            synchronized (l40Var) {
            }
        }
        i30 i30Var = this.r;
        if (i30Var != null) {
            i30Var.d();
            this.r = null;
        }
        cn0 cn0Var = this.q;
        if (cn0Var != null) {
            i30 i30Var2 = cn0Var.c;
            if (i30Var2 != null) {
                i30Var2.d();
            }
            this.q = null;
        }
        this.p = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x016b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o(defpackage.f30 r15) {
        /*
            Method dump skipped, instructions count: 498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ks0.o(f30):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void p(f30 f30Var, boolean z) {
        int O;
        m40 m40Var;
        im0 c = this.B.c();
        xf0 xf0Var = (xf0) f30Var.b;
        byte[] bArr = (byte[]) f30Var.d;
        int i = f30Var.a;
        if (xf0.f.b(xf0Var) && Arrays.equals((byte[]) this.D.d, bArr)) {
            Hashtable hashtable = (Hashtable) f30Var.e;
            if (hashtable != null) {
                ht0.f(hashtable, 2);
                if (z) {
                    xf0 e = hi0.e(hashtable);
                    if (e != null) {
                        if (!c.H.b(e) || c.d != i) {
                            throw new us0((short) 47, null, null);
                        }
                    } else {
                        throw new us0((short) 109, null, null);
                    }
                } else if (ht0.B((int[]) this.D.e, i) && ht0.D(i, c.H)) {
                    c.a = false;
                    c.u = ht0.e;
                    this.A.getClass();
                    ht0.E(c, i);
                    this.A.getClass();
                } else {
                    throw new us0((short) 47, null, null);
                }
                this.D = null;
                c.s = (byte[]) f30Var.c;
                c.c = false;
                c.y = true;
                c.I = this.u.containsKey(5) ? 1 : 0;
                byte[] r = ht0.r(hashtable, 41);
                if (r == null) {
                    O = -1;
                } else if (r.length == 2) {
                    O = ht0.O(0, r);
                } else {
                    throw new us0((short) 50, null, null);
                }
                if (O < 0) {
                    this.A.getClass();
                    byte[] r2 = ht0.r(hashtable, 51);
                    if (r2 == null) {
                        m40Var = null;
                    } else {
                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(r2);
                        m40Var = new m40(ht0.P(byteArrayInputStream), ht0.L(byteArrayInputStream));
                        b(byteArrayInputStream);
                    }
                    if (m40Var != null) {
                        fs0 fs0Var = (fs0) this.C.get(Integer.valueOf(m40Var.a));
                        if (fs0Var != null) {
                            fs0Var.c(m40Var.b);
                            i30 b = fs0Var.b();
                            this.C = null;
                            js0 js0Var = this.B;
                            rd rdVar = js0Var.a;
                            im0 c2 = js0Var.c();
                            int i2 = c2.g;
                            i30 i30Var = new i30(rdVar, new byte[r21.u(i2)]);
                            byte[] digest = rdVar.q(i2).a.digest();
                            i30 f = new i30(rdVar, new byte[r21.u(i2)]).f(i2, i30Var);
                            if (b == null) {
                                b = i30Var;
                            }
                            i30 f2 = ht0.n(c2.g, c2.h, f, "derived", digest).f(i2, b);
                            if (b != i30Var) {
                                b.d();
                            }
                            i30 f3 = ht0.n(c2.g, c2.h, f2, "derived", digest).f(i2, i30Var);
                            c2.l = f;
                            c2.n = f2;
                            c2.o = f3;
                            n();
                            this.p = new l40(c.u, null);
                            return;
                        }
                        throw new us0((short) 47, null, null);
                    }
                    throw new us0((short) 47, null, null);
                }
                throw new us0((short) 47, null, null);
            }
            throw new us0((short) 47, null, null);
        }
        throw new us0((short) 47, null, null);
    }

    public final void q(boolean z) {
        byte[] p = ht0.p(this.g);
        js0 js0Var = this.B;
        im0 c = js0Var.c();
        i30 i30Var = c.n;
        im0 c2 = js0Var.c();
        c2.p = ht0.n(c2.g, c2.h, i30Var, "c hs traffic", p);
        c2.q = ht0.n(c2.g, c2.h, i30Var, "s hs traffic", p);
        is0 v = ht0.v(js0Var);
        ch0 ch0Var = this.d;
        ch0Var.g = v;
        c.j = c.p;
        c.k = c.q;
        if (!z) {
            ch0Var.n = true;
            z(0, 1, (short) 20, new byte[]{1});
        }
        ch0Var.b();
        ch0Var.a();
    }

    public final void r(a10 a10Var) {
        js0 js0Var = this.B;
        im0 c = js0Var.c();
        byte[] K = ht0.K(c.i, a10Var);
        b(a10Var);
        byte[] e = ht0.e(js0Var, this.g, true);
        if (f20.l(e, K)) {
            c.L = e;
            return;
        }
        throw new us0((short) 51, null, null);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0035. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0038. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0048 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0050 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v37, types: [a10, java.io.ByteArrayInputStream, java.io.InputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s(defpackage.me r11) {
        /*
            Method dump skipped, instructions count: 484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ks0.s(me):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:131:0x02a4, code lost:
    
        if (r2 == r1) goto L165;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:116:0x026e. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t(defpackage.f30 r17) {
        /*
            Method dump skipped, instructions count: 896
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ks0.t(f30):void");
    }

    public final void u(short s) {
        this.A.getClass();
        z(0, 2, (short) 21, new byte[]{1, (byte) s});
    }

    public final void y() {
        try {
            if (this.d.c()) {
                return;
            }
            if (this.l) {
                this.A.getClass();
                j();
                throw new EOFException("No close_notify alert received before connection closed");
            }
            throw new us0((short) 40, null, null);
        } catch (us0 e) {
            i(e.d, e);
            throw e;
        } catch (vs0 e2) {
            throw e2;
        } catch (IOException e3) {
            i((short) 80, e3);
            throw e3;
        } catch (RuntimeException e4) {
            i((short) 80, e4);
            f40.a(80, e4, null);
        }
    }

    public final void z(int i, int i2, short s, byte[] bArr) {
        try {
            F(i, i2, s, bArr);
        } catch (IOException e) {
            i((short) 80, e);
            throw e;
        } catch (RuntimeException e2) {
            i((short) 80, e2);
            f40.a(80, e2, null);
        } catch (us0 e3) {
            i(e3.d, e3);
            throw e3;
        }
    }
}
