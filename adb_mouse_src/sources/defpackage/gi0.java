package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class gi0 implements fz0 {
    public static Field a;
    public static boolean b;
    public static Class c;
    public static boolean d;
    public static Field e;
    public static boolean f;
    public static Field g;
    public static boolean h;

    public static void d(int i, byte[] bArr) {
        byte[] bArr2 = ht0.a;
        if (bArr != null && bArr.length >= 1) {
            if (i != 29 && i != 30 && bArr[0] != 4) {
                throw new us0((short) 47, null, null);
            }
            return;
        }
        throw new us0((short) 47, null, null);
    }

    public static PublicKey e(rd rdVar, String str, s sVar, byte[] bArr) {
        try {
            KeyFactory i = ((sb0) rdVar.c).i(str);
            if (i.getProvider() instanceof de) {
                try {
                    return i.generatePublic(new EncodedKeySpec(bArr));
                } catch (Exception unused) {
                }
            }
            k4 k4Var = new k4(sVar);
            cm cmVar = new cm(0, bArr);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            new nm(k4Var, cmVar).j(new v(byteArrayOutputStream), true);
            return i.generatePublic(new X509EncodedKeySpec(byteArrayOutputStream.toByteArray()));
        } catch (Exception e2) {
            f40.a(47, e2, null);
            return null;
        }
    }

    public static byte[] f(PublicKey publicKey) {
        if ("X.509".equals(publicKey.getFormat())) {
            try {
                return hq0.i(publicKey.getEncoded()).d.t();
            } catch (Exception e2) {
                f40.a(80, e2, null);
                return null;
            }
        }
        f40.a(80, null, "Public key format unrecognized");
        return null;
    }

    public static final mm0 g(Object obj) {
        if (obj != k20.g) {
            obj.getClass();
            return (mm0) obj;
        }
        c.o("Does not contain segment");
        return null;
    }

    public static final boolean h(Object obj) {
        if (obj == k20.g) {
            return true;
        }
        return false;
    }

    public static short i(int i) {
        return (short) ((i - (((short) (62209 * i)) * 3329)) >> 16);
    }

    public static byte[] j(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[4096];
        while (true) {
            int read = inputStream.read(bArr, 0, 4096);
            if (read >= 0) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    public static int k(InputStream inputStream, byte[] bArr, int i) {
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, i2, i - i2);
            if (read < 0) {
                break;
            }
            i2 += read;
        }
        return i2;
    }

    public static jk0 l(js0 js0Var, InputStream inputStream) {
        int[] iArr;
        if (ht0.S(inputStream) == 3) {
            int P = ht0.P(inputStream);
            if (f20.a0(P) && ((iArr = js0Var.c().C) == null || f20.m(iArr, P))) {
                return new jk0(P, 5);
            }
            throw new us0((short) 47, null, null);
        }
        throw new us0((short) 40, null, null);
    }

    public static final Object m(cm0 cm0Var, cm0 cm0Var2, zy zyVar) {
        Object uiVar;
        Object G;
        r10 r10Var;
        q10 q10Var;
        try {
            wv0.j(2, zyVar);
            uiVar = zyVar.g(cm0Var2, cm0Var);
        } catch (Throwable th) {
            uiVar = new ui(th, false);
        }
        ml mlVar = ml.c;
        if (uiVar != mlVar && (G = cm0Var.G(uiVar)) != k20.j) {
            if (!(G instanceof ui)) {
                if (G instanceof r10) {
                    r10Var = (r10) G;
                } else {
                    r10Var = null;
                }
                if (r10Var != null && (q10Var = r10Var.a) != null) {
                    return q10Var;
                }
                return G;
            }
            throw ((ui) G).a;
        }
        return mlVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long n(java.lang.String r21, long r22, long r24, long r26) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gi0.n(java.lang.String, long, long, long):long");
    }

    public static int o(String str, int i, int i2) {
        int i3;
        if ((i2 & 8) != 0) {
            i3 = Integer.MAX_VALUE;
        } else {
            i3 = 2097150;
        }
        return (int) n(str, i, 1L, i3);
    }

    public static /* synthetic */ boolean p(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, e61 e61Var, Object obj, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(e61Var, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(e61Var) != obj && atomicReferenceFieldUpdater.get(e61Var) != obj) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean q(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, na1 na1Var, Object obj, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(na1Var, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(na1Var) != obj && atomicReferenceFieldUpdater.get(na1Var) != obj) {
                return false;
            }
        }
        return true;
    }

    public static String r(String str, Object... objArr) {
        int length;
        int indexOf;
        StringBuilder sb = new StringBuilder(str.length() + (objArr.length * 16));
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i >= length || (indexOf = str.indexOf("%s", i2)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i2, indexOf);
            sb.append(s(objArr[i]));
            i2 = indexOf + 2;
            i++;
        }
        sb.append((CharSequence) str, i2, str.length());
        if (i < length) {
            String str2 = " [";
            while (i < objArr.length) {
                sb.append(str2);
                sb.append(s(objArr[i]));
                i++;
                str2 = ", ";
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static String s(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e2) {
            String str = obj.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(obj));
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(str), (Throwable) e2);
            return "<" + str + " threw " + e2.getClass().getName() + ">";
        }
    }

    @Override // defpackage.fz0
    public void b() {
    }

    @Override // defpackage.fz0
    public void c() {
    }
}
