package defpackage;

import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.util.Vector;

/* loaded from: classes.dex */
public abstract class wg0 {
    public static long a = 0;
    public static Method b = null;
    public static boolean c = true;

    public static void A(ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            vy0.b(viewGroup, z);
        } else if (c) {
            try {
                vy0.b(viewGroup, z);
            } catch (NoSuchMethodError unused) {
                c = false;
            }
        }
    }

    public static String B(n71 n71Var) {
        StringBuilder sb = new StringBuilder(n71Var.e());
        for (int i = 0; i < n71Var.e(); i++) {
            byte b2 = n71Var.b(i);
            if (b2 != 34) {
                if (b2 != 39) {
                    if (b2 != 92) {
                        switch (b2) {
                            case 7:
                                sb.append("\\a");
                                break;
                            case 8:
                                sb.append("\\b");
                                break;
                            case 9:
                                sb.append("\\t");
                                break;
                            case 10:
                                sb.append("\\n");
                                break;
                            case 11:
                                sb.append("\\v");
                                break;
                            case 12:
                                sb.append("\\f");
                                break;
                            case 13:
                                sb.append("\\r");
                                break;
                            default:
                                if (b2 >= 32 && b2 <= 126) {
                                    sb.append((char) b2);
                                    break;
                                } else {
                                    sb.append('\\');
                                    sb.append((char) (((b2 >>> 6) & 3) + 48));
                                    sb.append((char) (((b2 >>> 3) & 7) + 48));
                                    sb.append((char) ((b2 & 7) + 48));
                                    break;
                                }
                                break;
                        }
                    } else {
                        sb.append("\\\\");
                    }
                } else {
                    sb.append("\\'");
                }
            } else {
                sb.append("\\\"");
            }
        }
        return sb.toString();
    }

    public static void D(int i, int i2) {
        String r;
        if (i >= 0 && i < i2) {
            return;
        }
        if (i >= 0) {
            if (i2 < 0) {
                c.k(qo0.m("negative size: ", i2));
                return;
            }
            r = gi0.r("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            r = gi0.r("%s (%s) must not be negative", "index", Integer.valueOf(i));
        }
        throw new IndexOutOfBoundsException(r);
    }

    public static void F(int i, int i2) {
        if (i >= 0 && i <= i2) {
            return;
        }
        c.m(K("index", i, i2));
    }

    public static void H(int i, int i2, int i3) {
        String K;
        if (i >= 0 && i2 >= i && i2 <= i3) {
            return;
        }
        if (i >= 0 && i <= i3) {
            if (i2 >= 0 && i2 <= i3) {
                K = gi0.r("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            } else {
                K = K("end index", i2, i3);
            }
        } else {
            K = K("start index", i, i3);
        }
        throw new IndexOutOfBoundsException(K);
    }

    public static String K(String str, int i, int i2) {
        if (i < 0) {
            return gi0.r("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return gi0.r("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        c.k(qo0.m("negative size: ", i2));
        return null;
    }

    public static void a(String str) {
        if (str.length() > 127) {
            str = str.substring(0, 127);
        }
        Trace.beginSection(str);
    }

    public static short[][] c(short[][] sArr) {
        short[][] sArr2 = new short[sArr.length];
        for (int i = 0; i < sArr.length; i++) {
            sArr2[i] = f20.f(sArr[i]);
        }
        return sArr2;
    }

    public static short[][][] d(short[][][] sArr) {
        short[][][] sArr2 = (short[][][]) Array.newInstance((Class<?>) short[].class, sArr.length, sArr[0].length);
        for (int i = 0; i < sArr.length; i++) {
            for (int i2 = 0; i2 < sArr[0].length; i2++) {
                sArr2[i][i2] = f20.f(sArr[i][i2]);
            }
        }
        return sArr2;
    }

    public static int e(ai0 ai0Var, ws wsVar, View view, View view2, oh0 oh0Var, boolean z) {
        if (oh0Var.v() != 0 && ai0Var.b() != 0 && view != null && view2 != null) {
            if (!z) {
                return Math.abs(oh0.H(view) - oh0.H(view2)) + 1;
            }
            return Math.min(wsVar.l(), wsVar.b(view2) - wsVar.e(view));
        }
        return 0;
    }

    public static int f(ai0 ai0Var, ws wsVar, View view, View view2, oh0 oh0Var, boolean z, boolean z2) {
        int max;
        if (oh0Var.v() == 0 || ai0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int min = Math.min(oh0.H(view), oh0.H(view2));
        int max2 = Math.max(oh0.H(view), oh0.H(view2));
        if (z2) {
            max = Math.max(0, (ai0Var.b() - max2) - 1);
        } else {
            max = Math.max(0, min);
        }
        if (!z) {
            return max;
        }
        return Math.round((max * (Math.abs(wsVar.b(view2) - wsVar.e(view)) / (Math.abs(oh0.H(view) - oh0.H(view2)) + 1))) + (wsVar.k() - wsVar.e(view)));
    }

    public static int g(ai0 ai0Var, ws wsVar, View view, View view2, oh0 oh0Var, boolean z) {
        if (oh0Var.v() != 0 && ai0Var.b() != 0 && view != null && view2 != null) {
            if (!z) {
                return ai0Var.b();
            }
            return (int) (((wsVar.b(view2) - wsVar.e(view)) / (Math.abs(oh0.H(view) - oh0.H(view2)) + 1)) * ai0Var.b());
        }
        return 0;
    }

    public static hq0 h(u8 u8Var) {
        byte[] o;
        if (u8Var instanceof zk0) {
            zk0 zk0Var = (zk0) u8Var;
            return new hq0(new k4(pd0.a, new rk0(gx0.d(zk0Var.d))), f20.e(zk0Var.e));
        }
        if (u8Var instanceof jb0) {
            return new hq0(new k4(pd0.b), f20.e(((jb0) u8Var).d));
        }
        int i = 0;
        if (u8Var instanceof w40) {
            w40 w40Var = (w40) u8Var;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(0);
            byteArrayOutputStream.write(0);
            byteArrayOutputStream.write(0);
            byteArrayOutputStream.write(1);
            try {
                byteArrayOutputStream.write(w40Var.b());
                return new hq0(new k4(od0.m), byteArrayOutputStream.toByteArray());
            } catch (Exception e) {
                f40.k(e.getMessage(), e);
                return null;
            }
        }
        if (u8Var instanceof w00) {
            w00 w00Var = (w00) u8Var;
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            int i2 = w00Var.d;
            byteArrayOutputStream2.write((byte) (i2 >>> 24));
            byteArrayOutputStream2.write((byte) (i2 >>> 16));
            byteArrayOutputStream2.write((byte) (i2 >>> 8));
            byteArrayOutputStream2.write((byte) i2);
            try {
                byteArrayOutputStream2.write(w00Var.e.b());
                return new hq0(new k4(od0.m), byteArrayOutputStream2.toByteArray());
            } catch (Exception e2) {
                f40.k(e2.getMessage(), e2);
                return null;
            }
        }
        if (u8Var instanceof mk0) {
            mk0 mk0Var = (mk0) u8Var;
            i10 i10Var = mk0Var.e;
            return new hq0(new k4((s) gx0.K.get((kk0) mk0Var.d)), f20.h(i10Var.a, i10Var.b));
        }
        if (u8Var instanceof xk0) {
            xk0 xk0Var = (xk0) u8Var;
            i10 i10Var2 = xk0Var.e;
            return new hq0(new k4((s) gx0.o.get((vk0) xk0Var.d)), f20.h(i10Var2.a, i10Var2.b));
        }
        if (u8Var instanceof ue) {
            ue ueVar = (ue) u8Var;
            return new hq0(new k4((s) gx0.m.get((qe) ueVar.d)), f20.e(ueVar.e));
        }
        if (u8Var instanceof n21) {
            n21 n21Var = (n21) u8Var;
            byte[] e3 = mi0.e(n21Var.h);
            byte[] e4 = mi0.e(n21Var.g);
            byte[] encoded = n21Var.getEncoded();
            if (encoded.length > e3.length + e4.length) {
                return new hq0(new k4(o20.a), new t(encoded));
            }
            return new hq0(new k4(pd0.c, new a21(n21Var.e.b, gx0.f(n21Var.d))), new m21(e3, e4));
        }
        if (u8Var instanceof h21) {
            h21 h21Var = (h21) u8Var;
            byte[] bArr = h21Var.g;
            byte[] bArr2 = h21Var.h;
            byte[] e5 = mi0.e(bArr2);
            byte[] e6 = mi0.e(bArr);
            byte[] a2 = h21Var.a();
            if (a2.length > e5.length + e6.length) {
                return new hq0(new k4(o20.b), new t(a2));
            }
            s sVar = pd0.d;
            c21 c21Var = h21Var.e;
            return new hq0(new k4(sVar, new b21(c21Var.c, c21Var.d, gx0.f(h21Var.d))), new g21(mi0.e(bArr2), mi0.e(bArr)));
        }
        if (u8Var instanceof iy) {
            iy iyVar = (iy) u8Var;
            byte[] e7 = f20.e(iyVar.e);
            return new hq0(new k4((s) gx0.i.get((gy) iyVar.d)), new t(e7));
        }
        if (u8Var instanceof ek0) {
            ek0 ek0Var = (ek0) u8Var;
            byte[] e8 = f20.e(ek0Var.e);
            k4 k4Var = new k4((s) gx0.k.get((ck0) ek0Var.d));
            nm nmVar = new nm(new t(e8), i);
            nmVar.f = -1;
            return new hq0(k4Var, nmVar);
        }
        if (u8Var instanceof zd0) {
            zd0 zd0Var = (zd0) u8Var;
            byte[] e9 = f20.e(zd0Var.e);
            return new hq0(new k4((s) gx0.g.get((xd0) zd0Var.d)), new t(e9));
        }
        if (u8Var instanceof qb0) {
            qb0 qb0Var = (qb0) u8Var;
            return new hq0(new k4((s) gx0.q.get((ob0) qb0Var.d)), f20.e(qb0Var.e));
        }
        if (u8Var instanceof hv) {
            hv hvVar = (hv) u8Var;
            dv dvVar = (dv) hvVar.d;
            byte[] e10 = f20.e(hvVar.e);
            k4 k4Var2 = new k4((s) gx0.s.get(dvVar));
            byte[] bArr3 = new byte[e10.length + 1];
            bArr3[0] = (byte) dvVar.b;
            System.arraycopy(e10, 0, bArr3, 1, e10.length);
            return new hq0(k4Var2, bArr3);
        }
        if (u8Var instanceof b80) {
            b80 b80Var = (b80) u8Var;
            return new hq0(new k4((s) gx0.G.get((y70) b80Var.d)), b80Var.getEncoded());
        }
        if (u8Var instanceof nb0) {
            nb0 nb0Var = (nb0) u8Var;
            lb0 lb0Var = (lb0) nb0Var.d;
            byte[] bArr4 = new byte[lb0Var.a];
            byte[] bArr5 = nb0Var.e;
            System.arraycopy(bArr5, 0, bArr4, 0, bArr5.length);
            byte[] bArr6 = nb0Var.f;
            System.arraycopy(bArr6, 0, bArr4, bArr5.length, bArr6.length);
            return new hq0(new k4((s) gx0.u.get(lb0Var)), new t(bArr4));
        }
        if (u8Var instanceof pk0) {
            pk0 pk0Var = (pk0) u8Var;
            byte[] e11 = f20.e(pk0Var.e);
            return new hq0(new k4((s) gx0.w.get((nk0) pk0Var.d)), new t(e11));
        }
        if (u8Var instanceof tq) {
            tq tqVar = (tq) u8Var;
            return new hq0(new k4((s) gx0.y.get((rq) tqVar.d)), f20.h(tqVar.e, tqVar.f));
        }
        if (u8Var instanceof v70) {
            v70 v70Var = (v70) u8Var;
            return new hq0(new k4((s) gx0.I.get((t70) v70Var.d)), f20.h(v70Var.e, v70Var.f));
        }
        if (u8Var instanceof ec) {
            ec ecVar = (ec) u8Var;
            return new hq0(new k4((s) gx0.A.get((cc) ecVar.d)), f20.e(ecVar.e));
        }
        if (u8Var instanceof u00) {
            u00 u00Var = (u00) u8Var;
            return new hq0(new k4((s) gx0.C.get((s00) u00Var.d)), f20.e(u00Var.e));
        }
        if (u8Var instanceof vg0) {
            vg0 vg0Var = (vg0) u8Var;
            tg0 tg0Var = (tg0) vg0Var.d;
            if (tg0Var.g != 1) {
                o = f20.h(f20.h(f20.h(f20.h(f20.h(vg0Var.f, o(vg0Var.g, false)), o(vg0Var.h, true)), o(vg0Var.i, false)), o(vg0Var.j, true)), o(vg0Var.k, true));
            } else {
                o = o(vg0Var.e, true);
            }
            return new hq0(new k4((s) gx0.E.get(tg0Var)), new t(o));
        }
        if (u8Var instanceof s90) {
            s90 s90Var = (s90) u8Var;
            byte[] e12 = f20.e(s90Var.e);
            return new hq0(new k4((s) gx0.M.get((q90) s90Var.d)), new t(e12));
        }
        if (u8Var instanceof oo0) {
            oo0 oo0Var = (oo0) u8Var;
            byte[] e13 = f20.e(oo0Var.d);
            return new hq0(new k4((s) gx0.O.get(oo0Var.e)), new t(e13));
        }
        throw new IOException("key parameters not recognized");
    }

    public static int i(go0 go0Var) {
        if (go0Var != null) {
            return j(go0Var.a, go0Var.b);
        }
        throw null;
    }

    public static int j(short s, short s2) {
        return ((s & 255) << 8) | (s2 & 255);
    }

    public static short[][][] k(sg0 sg0Var, int i, int i2, int i3, boolean z) {
        int i4;
        if (z) {
            i4 = (((i2 + 1) * i2) / 2) * i;
        } else {
            i4 = i * i2 * i3;
        }
        byte[] bArr = new byte[i4];
        sg0Var.nextBytes(bArr);
        short[][][] sArr = (short[][][]) Array.newInstance((Class<?>) Short.TYPE, i, i2, i3);
        int i5 = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            for (int i7 = 0; i7 < i3; i7++) {
                for (int i8 = 0; i8 < i; i8++) {
                    if (!z || i6 <= i7) {
                        sArr[i8][i6][i7] = (short) (bArr[i5] & 255);
                        i5++;
                    }
                }
            }
        }
        return sArr;
    }

    public static short[][] l(sg0 sg0Var, int i, int i2) {
        byte[] bArr = new byte[i * i2];
        sg0Var.nextBytes(bArr);
        short[][] sArr = (short[][]) Array.newInstance((Class<?>) Short.TYPE, i, i2);
        for (int i3 = 0; i3 < i2; i3++) {
            for (int i4 = 0; i4 < i; i4++) {
                sArr[i4][i3] = (short) (bArr[(i3 * i) + i4] & 255);
            }
        }
        return sArr;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0007. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int m(int r4) {
        /*
            r0 = 1800(0x708, float:2.522E-42)
            if (r4 == r0) goto L3f
            r0 = 4
            r1 = 5
            r2 = 6
            switch(r4) {
                case 2052: goto L3e;
                case 2053: goto L3d;
                case 2054: goto L3c;
                case 2055: goto L3a;
                case 2056: goto L3a;
                case 2057: goto L3e;
                case 2058: goto L3d;
                case 2059: goto L3c;
                default: goto La;
            }
        La:
            switch(r4) {
                case 2074: goto L3e;
                case 2075: goto L3d;
                case 2076: goto L3c;
                default: goto Ld;
            }
        Ld:
            switch(r4) {
                case 2308: goto L3a;
                case 2309: goto L3a;
                case 2310: goto L3a;
                default: goto L10;
            }
        L10:
            switch(r4) {
                case 2321: goto L3a;
                case 2322: goto L3a;
                case 2323: goto L3a;
                case 2324: goto L3a;
                case 2325: goto L3a;
                case 2326: goto L3a;
                case 2327: goto L3a;
                case 2328: goto L3a;
                case 2329: goto L3a;
                case 2330: goto L3a;
                case 2331: goto L3a;
                case 2332: goto L3a;
                default: goto L13;
            }
        L13:
            r3 = 8
            int r4 = r4 >>> r3
            r4 = r4 & 255(0xff, float:3.57E-43)
            short r4 = (short) r4
            if (r3 == r4) goto L3a
            switch(r4) {
                case 1: goto L1f;
                case 2: goto L1f;
                case 3: goto L1f;
                case 4: goto L1f;
                case 5: goto L1f;
                case 6: goto L1f;
                case 7: goto L1e;
                case 8: goto L1f;
                default: goto L1e;
            }
        L1e:
            goto L3a
        L1f:
            switch(r4) {
                case 1: goto L38;
                case 2: goto L36;
                case 3: goto L34;
                case 4: goto L33;
                case 5: goto L32;
                case 6: goto L31;
                default: goto L22;
            }
        L22:
            java.lang.String r4 = defpackage.f20.I(r4)
            java.lang.String r0 = "specified HashAlgorithm invalid: "
            java.lang.String r4 = r0.concat(r4)
            defpackage.c.k(r4)
            r4 = 0
            return r4
        L31:
            return r2
        L32:
            return r1
        L33:
            return r0
        L34:
            r4 = 3
            return r4
        L36:
            r4 = 2
            return r4
        L38:
            r4 = 1
            return r4
        L3a:
            r4 = -1
            return r4
        L3c:
            return r2
        L3d:
            return r1
        L3e:
            return r0
        L3f:
            r4 = 7
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wg0.m(int):int");
    }

    public static byte[] n(short[][] sArr) {
        int length = sArr.length;
        int length2 = sArr[0].length;
        byte[] bArr = new byte[length * length2];
        for (int i = 0; i < length2; i++) {
            for (int i2 = 0; i2 < length; i2++) {
                bArr[(i * length) + i2] = (byte) sArr[i2][i];
            }
        }
        return bArr;
    }

    public static byte[] o(short[][][] sArr, boolean z) {
        int i;
        int length = sArr.length;
        short[][] sArr2 = sArr[0];
        int length2 = sArr2.length;
        int length3 = sArr2[0].length;
        if (z) {
            i = (((length2 + 1) * length2) / 2) * length;
        } else {
            i = length * length2 * length3;
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        for (int i3 = 0; i3 < length2; i3++) {
            for (int i4 = 0; i4 < length3; i4++) {
                for (short[][] sArr3 : sArr) {
                    if (!z || i3 <= i4) {
                        bArr[i2] = (byte) sArr3[i3][i4];
                        i2++;
                    }
                }
            }
        }
        return bArr;
    }

    public static xm p(int i) {
        switch (i) {
            case 256:
                return zm.j;
            case 257:
                return zm.k;
            case 258:
                return zm.l;
            case 259:
                return zm.m;
            case 260:
                return zm.n;
            default:
                return null;
        }
    }

    public static go0 q(int i) {
        if (i != 2055) {
            if (i != 2056) {
                switch (i) {
                    case 2308:
                        return go0.j;
                    case 2309:
                        return go0.k;
                    case 2310:
                        return go0.l;
                    default:
                        switch (i) {
                            case 2321:
                                return go0.s;
                            case 2322:
                                return go0.t;
                            case 2323:
                                return go0.u;
                            case 2324:
                                return go0.v;
                            case 2325:
                                return go0.w;
                            case 2326:
                                return go0.x;
                            case 2327:
                                return go0.y;
                            case 2328:
                                return go0.z;
                            case 2329:
                                return go0.A;
                            case 2330:
                                return go0.B;
                            case 2331:
                                return go0.C;
                            case 2332:
                                return go0.D;
                            default:
                                return go0.c((short) ((i >>> 8) & 255), (short) (i & 255));
                        }
                }
            }
            return go0.g;
        }
        return go0.f;
    }

    public static boolean r() {
        if (Build.VERSION.SDK_INT >= 29) {
            return wt0.a();
        }
        try {
            if (b == null) {
                a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) b.invoke(null, Long.valueOf(a))).booleanValue();
        } catch (Exception e) {
            if (e instanceof InvocationTargetException) {
                Throwable cause = e.getCause();
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                throw new RuntimeException(cause);
            }
            Log.v("Trace", "Unable to call isTagEnabled via reflection", e);
            return false;
        }
    }

    public static int s(short[][] sArr, byte[] bArr, int i) {
        int length = sArr.length;
        int length2 = sArr[0].length;
        for (int i2 = 0; i2 < length2; i2++) {
            for (int i3 = 0; i3 < length; i3++) {
                sArr[i3][i2] = (short) (bArr[(i2 * length) + i + i3] & 255);
            }
        }
        return length * length2;
    }

    public static int t(short[][][] sArr, byte[] bArr, int i, boolean z) {
        short[][] sArr2 = sArr[0];
        int length = sArr2.length;
        int length2 = sArr2[0].length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            for (int i4 = 0; i4 < length2; i4++) {
                for (short[][] sArr3 : sArr) {
                    if (!z || i3 <= i4) {
                        sArr3[i3][i4] = (short) (bArr[i2 + i] & 255);
                        i2++;
                    }
                }
            }
        }
        return i2;
    }

    public static Typeface u(Configuration configuration, Typeface typeface) {
        int i;
        int i2;
        int weight;
        int i3;
        Typeface create;
        if (Build.VERSION.SDK_INT >= 31) {
            i = configuration.fontWeightAdjustment;
            if (i != Integer.MAX_VALUE) {
                i2 = configuration.fontWeightAdjustment;
                if (i2 != 0 && typeface != null) {
                    weight = typeface.getWeight();
                    i3 = configuration.fontWeightAdjustment;
                    create = Typeface.create(typeface, mn.m(i3 + weight, 1, 1000), typeface.isItalic());
                    return create;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, j] */
    public static j x(js0 js0Var, qo qoVar, InputStream inputStream) {
        int i;
        xm xmVar;
        BigInteger bigInteger;
        BigInteger bigInteger2;
        BigInteger bigInteger3;
        BigInteger bigInteger4 = new BigInteger(1, ht0.L(inputStream));
        BigInteger bigInteger5 = new BigInteger(1, ht0.L(inputStream));
        int[] iArr = {256, 257, 258, 259, 260};
        int i2 = 0;
        while (true) {
            if (i2 < 5) {
                i = iArr[i2];
                xm p = p(i);
                if (p != null && p.b.equals(bigInteger4) && p.a.equals(bigInteger5)) {
                    break;
                }
                i2++;
            } else {
                i = -1;
                break;
            }
        }
        if (i < 0) {
            xm[] xmVarArr = {zm.j, zm.k, zm.l, zm.m, zm.n, zm.b, zm.c, zm.d, zm.e, zm.f, zm.g, zm.h, zm.i};
            int i3 = 0;
            while (true) {
                if (i3 < 13) {
                    xmVar = xmVarArr[i3];
                    if (xmVar != null && xmVar.b.equals(bigInteger4) && xmVar.a.equals(bigInteger5)) {
                        break;
                    }
                    i3++;
                } else {
                    xmVar = null;
                    break;
                }
            }
            if (xmVar == null) {
                xmVar = new xm(bigInteger4, null, bigInteger5, 0);
            }
            BigInteger bigInteger6 = xmVar.b;
            qoVar.getClass();
            if (bigInteger6.bitLength() >= qoVar.b) {
                Vector vector = qoVar.a;
                for (int i4 = 0; i4 < vector.size(); i4++) {
                    xm xmVar2 = (xm) vector.elementAt(i4);
                    if (xmVar == xmVar2 || ((bigInteger6 == (bigInteger = xmVar2.b) || bigInteger6.equals(bigInteger)) && ((bigInteger2 = xmVar.a) == (bigInteger3 = xmVar2.a) || bigInteger2.equals(bigInteger3)))) {
                        ?? obj = new Object();
                        obj.c = xmVar;
                        obj.b = -1;
                        obj.a = false;
                        return obj;
                    }
                }
            }
            throw new us0((short) 71, null, null);
        }
        int[] iArr2 = js0Var.c().C;
        if (iArr2 != null && !f20.m(iArr2, i)) {
            throw new us0((short) 47, null, null);
        }
        return new j(i, false);
    }

    public abstract z51 C(x61 x61Var);

    public abstract d61 E(x61 x61Var);

    public abstract void G(d61 d61Var, d61 d61Var2);

    public abstract void I(d61 d61Var, Thread thread);

    public abstract boolean J(x61 x61Var, z51 z51Var, z51 z51Var2);

    public abstract boolean L(e61 e61Var, Object obj, Object obj2);

    public abstract boolean M(e61 e61Var, d61 d61Var, d61 d61Var2);

    public void b(int i) {
        new Handler(Looper.getMainLooper()).post(new oj0(i, 0, this));
    }

    public abstract void v(int i);

    public abstract void w(Typeface typeface);

    public abstract void z(boolean z);

    public void y(boolean z) {
    }
}
