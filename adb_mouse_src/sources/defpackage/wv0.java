package defpackage;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Path;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.view.animation.PathInterpolator;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.math.RoundingMode;
import java.security.AlgorithmParameters;
import java.security.Key;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.interfaces.ECKey;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import java.util.Hashtable;
import java.util.Vector;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import javax.crypto.spec.DHParameterSpec;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public abstract class wv0 implements au {
    public static final float[][] c = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    public static final float[][] d = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
    public static final float[] e = {95.047f, 100.0f, 108.883f};
    public static final float[][] f = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};
    public static final int[] g = new int[0];
    public static final Object[] h = new Object[0];
    public static final ce i = new ce("REMOVED_TASK", 2);
    public static final ce j = new ce("CLOSED_EMPTY", 2);
    public static final Object k = new Object();
    public static final int[] l = {0, 25847, -2608894, -518909, 237124, -777960, -876248, 466468, 1826347, 2353451, -359251, -2091905, 3119733, -2884855, 3111497, 2680103, 2725464, 1024112, -1079900, 3585928, -549488, -1119584, 2619752, -2108549, -2118186, -3859737, -1399561, -3277672, 1757237, -19422, 4010497, 280005, 2706023, 95776, 3077325, 3530437, -1661693, -3592148, -2537516, 3915439, -3861115, -3043716, 3574422, -2867647, 3539968, -300467, 2348700, -539299, -1699267, -1643818, 3505694, -3821735, 3507263, -2140649, -1600420, 3699596, 811944, 531354, 954230, 3881043, 3900724, -2556880, 2071892, -2797779, -3930395, -1528703, -3677745, -3041255, -1452451, 3475950, 2176455, -1585221, -1257611, 1939314, -4083598, -1000202, -3190144, -3157330, -3632928, 126922, 3412210, -983419, 2147896, 2715295, -2967645, -3693493, -411027, -2477047, -671102, -1228525, -22981, -1308169, -381987, 1349076, 1852771, -1430430, -3343383, 264944, 508951, 3097992, 44288, -1100098, 904516, 3958618, -3724342, -8578, 1653064, -3249728, 2389356, -210977, 759969, -1316856, 189548, -3553272, 3159746, -1851402, -2409325, -177440, 1315589, 1341330, 1285669, -1584928, -812732, -1439742, -3019102, -3881060, -3628969, 3839961, 2091667, 3407706, 2316500, 3817976, -3342478, 2244091, -2446433, -3562462, 266997, 2434439, -1235728, 3513181, -3520352, -3759364, -1197226, -3193378, 900702, 1859098, 909542, 819034, 495491, -1613174, -43260, -522500, -655327, -3122442, 2031748, 3207046, -3556995, -525098, -768622, -3595838, 342297, 286988, -2437823, 4108315, 3437287, -3342277, 1735879, 203044, 2842341, 2691481, -2590150, 1265009, 4055324, 1247620, 2486353, 1595974, -3767016, 1250494, 2635921, -3548272, -2994039, 1869119, 1903435, -1050970, -1333058, 1237275, -3318210, -1430225, -451100, 1312455, 3306115, -1962642, -1279661, 1917081, -2546312, -1374803, 1500165, 777191, 2235880, 3406031, -542412, -2831860, -1671176, -1846953, -2584293, -3724270, 594136, -3776993, -2013608, 2432395, 2454455, -164721, 1957272, 3369112, 185531, -1207385, -3183426, 162844, 1616392, 3014001, 810149, 1652634, -3694233, -1799107, -3038916, 3523897, 3866901, 269760, 2213111, -975884, 1717735, 472078, -426683, 1723600, -1803090, 1910376, -1667432, -1104333, -260646, -3833893, -2939036, -2235985, -420899, -2286327, 183443, -976891, 1612842, -3545687, -554416, 3919660, -48306, -1362209, 3937738, 1400424, -846154, 1976782};
    public static final v30 m = new v30(2);
    public static final ce n = new ce("NO_THREAD_ELEMENTS", 2);
    public static final pi o = new pi(12);
    public static final pi p = new pi(13);
    public static final pi q = new pi(14);
    public static Boolean r;

    public static mq A(r40 r40Var) {
        return u(r40Var.b, r40Var.f);
    }

    public static ECParameterSpec B(rd rdVar, ECGenParameterSpec eCGenParameterSpec) {
        sb0 sb0Var = (sb0) rdVar.c;
        try {
            KeyPairGenerator k2 = sb0Var.k("EC");
            k2.initialize(eCGenParameterSpec, (SecureRandom) rdVar.d);
            try {
                AlgorithmParameters d2 = sb0Var.d("EC");
                d2.init(eCGenParameterSpec);
                ECParameterSpec eCParameterSpec = (ECParameterSpec) d2.getParameterSpec(ECParameterSpec.class);
                if (eCParameterSpec != null) {
                    return eCParameterSpec;
                }
            } catch (AssertionError | Exception unused) {
            }
            return ((ECKey) k2.generateKeyPair().getPrivate()).getParams();
        } catch (AssertionError | Exception unused2) {
            return null;
        }
    }

    public static float C(String[] strArr, int i2) {
        float parseFloat = Float.parseFloat(strArr[i2]);
        if (parseFloat >= 0.0f && parseFloat <= 1.0f) {
            return parseFloat;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + parseFloat);
    }

    public static String D(String str) {
        if (Build.VERSION.SDK_INT < 26) {
            String concat = "TRuntime.".concat(str);
            if (concat.length() > 23) {
                return concat.substring(0, 23);
            }
            return concat;
        }
        return "TRuntime.".concat(str);
    }

    public static String E(int i2, int i3) {
        String str;
        if (i2 != 64) {
            if (i2 != 128) {
                if (i2 != 192) {
                    str = "[UNIVERSAL ";
                } else {
                    str = "[PRIVATE ";
                }
            } else {
                str = "[CONTEXT ";
            }
        } else {
            str = "[APPLICATION ";
        }
        return qo0.n(str, i3, "]");
    }

    public static int F(float f2) {
        float f3;
        boolean z;
        float f4;
        if (f2 < 1.0f) {
            return -16777216;
        }
        if (f2 > 99.0f) {
            return -1;
        }
        float f5 = (f2 + 16.0f) / 116.0f;
        if (f2 > 8.0f) {
            f3 = f5 * f5 * f5;
        } else {
            f3 = f2 / 903.2963f;
        }
        float f6 = f5 * f5 * f5;
        if (f6 > 0.008856452f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f4 = f6;
        } else {
            f4 = ((f5 * 116.0f) - 16.0f) / 903.2963f;
        }
        if (!z) {
            f6 = ((f5 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = e;
        return oi.a(f4 * fArr[0], f3 * fArr[1], f6 * fArr[2]);
    }

    public static qk G(qk qkVar) {
        rk rkVar;
        qk qkVar2;
        qkVar.getClass();
        if (qkVar instanceof rk) {
            rkVar = (rk) qkVar;
        } else {
            rkVar = null;
        }
        if (rkVar != null && (qkVar = rkVar.e) == null) {
            gl glVar = (gl) rkVar.d().h(g00.e);
            if (glVar != null) {
                qkVar2 = new vq(glVar, rkVar);
            } else {
                qkVar2 = rkVar;
            }
            rkVar.e = qkVar2;
            return qkVar2;
        }
        return qkVar;
    }

    public static boolean H(String str, String str2) {
        if (str.startsWith(str2.concat("(")) && str.endsWith(")")) {
            return true;
        }
        return false;
    }

    public static float I(int i2) {
        float pow;
        float f2 = i2 / 255.0f;
        if (f2 <= 0.04045f) {
            pow = f2 / 12.92f;
        } else {
            pow = (float) Math.pow((f2 + 0.055f) / 1.055f, 2.4000000953674316d);
        }
        return pow * 100.0f;
    }

    public static short[][] J(short[][] sArr, short[][] sArr2) {
        if (sArr[0].length == sArr2.length) {
            short[][] sArr3 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, sArr.length, sArr2[0].length);
            for (int i2 = 0; i2 < sArr.length; i2++) {
                for (int i3 = 0; i3 < sArr2.length; i3++) {
                    for (int i4 = 0; i4 < sArr2[0].length; i4++) {
                        short s = (short) (oz.a[sArr[i2][i3]][sArr2[i3][i4]] & 255);
                        short[] sArr4 = sArr3[i2];
                        sArr4[i4] = (short) (s ^ sArr4[i4]);
                    }
                }
            }
            return sArr3;
        }
        f40.f("Multiplication is not possible!");
        return null;
    }

    public static String K(w11 w11Var, boolean z) {
        boolean z2;
        String a = w11Var.a();
        if (a != null) {
            if (w11Var.c < w11Var.a.length()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2 == z) {
                return a;
            }
        }
        c.k("badly formatted directory string");
        return null;
    }

    public static short[][][] L(short[][] sArr, short[][][] sArr2, short[][][] sArr3) {
        short[][] sArr4 = sArr2[0];
        int length = sArr4.length;
        short[][] sArr5 = sArr3[0];
        if (length == sArr5.length) {
            int length2 = sArr4[0].length;
            short[] sArr6 = sArr5[0];
            if (length2 == sArr6.length && sArr2.length == sArr[0].length && sArr3.length == sArr.length) {
                short[][][] sArr7 = (short[][][]) Array.newInstance((Class<?>) Short.TYPE, sArr3.length, sArr5.length, sArr6.length);
                for (int i2 = 0; i2 < sArr2[0].length; i2++) {
                    for (int i3 = 0; i3 < sArr2[0][0].length; i3++) {
                        for (int i4 = 0; i4 < sArr.length; i4++) {
                            for (int i5 = 0; i5 < sArr[0].length; i5++) {
                                short s = (short) (oz.a[sArr[i4][i5]][sArr2[i5][i2][i3]] & 255);
                                short[] sArr8 = sArr7[i4][i2];
                                sArr8[i3] = (short) (s ^ sArr8[i3]);
                            }
                            short[] sArr9 = sArr7[i4][i2];
                            short s2 = sArr3[i4][i2][i3];
                            short s3 = sArr9[i3];
                            byte[][] bArr = oz.a;
                            sArr9[i3] = (short) (s2 ^ s3);
                        }
                    }
                }
                return sArr7;
            }
        }
        f40.f("Multiplication not possible!");
        return null;
    }

    public static void M(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        if (inputConnection != null && editorInfo.hintText == null) {
            for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
            }
        }
    }

    public static byte[] P(de0 de0Var, rj rjVar) {
        byte[] bArr = new byte[rjVar.f - 32];
        for (int i2 = 0; i2 < rjVar.b; i2++) {
            b8 b8Var = de0Var.b[i2];
            byte[] bArr2 = new byte[320];
            for (int i3 = 0; i3 < 64; i3++) {
                int i4 = i3 * 5;
                int[] iArr = (int[]) b8Var.d;
                int i5 = i3 * 4;
                int i6 = iArr[i5];
                bArr2[i4] = (byte) i6;
                int i7 = iArr[i5 + 1];
                bArr2[i4 + 1] = (byte) ((i6 >> 8) | (i7 << 2));
                int i8 = i7 >> 6;
                int i9 = iArr[i5 + 2];
                bArr2[i4 + 2] = (byte) (i8 | (i9 << 4));
                int i10 = iArr[i5 + 3];
                bArr2[i4 + 3] = (byte) ((i10 << 6) | (i9 >> 4));
                bArr2[i4 + 4] = (byte) (i10 >> 2);
            }
            b8Var.getClass();
            System.arraycopy(bArr2, 0, bArr, i2 * 320, 320);
        }
        return bArr;
    }

    public static dl Q(bl blVar, dl dlVar) {
        dlVar.getClass();
        return k20.b0(blVar, dlVar);
    }

    public static byte[] R(int i2, InputStream inputStream) {
        byte[] bArr = new byte[i2];
        int i3 = 0;
        while (i3 < i2) {
            int read = inputStream.read(bArr, i3, i2 - i3);
            if (read >= 0) {
                i3 += read;
            } else {
                c.o(qo0.m("Not enough bytes to read: ", i2));
                return null;
            }
        }
        return bArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        if (r0.finished() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0062, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
    
        throw new java.lang.IllegalStateException("Inflater did not finish");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] S(java.io.FileInputStream r8, int r9, int r10) {
        /*
            java.util.zip.Inflater r0 = new java.util.zip.Inflater
            r0.<init>()
            byte[] r1 = new byte[r10]     // Catch: java.lang.Throwable -> L2e
            r2 = 2048(0x800, float:2.87E-42)
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L2e
            r3 = 0
            r4 = r3
            r5 = r4
        Le:
            boolean r6 = r0.finished()     // Catch: java.lang.Throwable -> L2e
            if (r6 != 0) goto L57
            boolean r6 = r0.needsDictionary()     // Catch: java.lang.Throwable -> L2e
            if (r6 != 0) goto L57
            if (r4 >= r9) goto L57
            int r6 = r8.read(r2)     // Catch: java.lang.Throwable -> L2e
            if (r6 < 0) goto L3b
            r0.setInput(r2, r3, r6)     // Catch: java.lang.Throwable -> L2e
            int r7 = r10 - r5
            int r7 = r0.inflate(r1, r5, r7)     // Catch: java.lang.Throwable -> L2e java.util.zip.DataFormatException -> L30
            int r5 = r5 + r7
            int r4 = r4 + r6
            goto Le
        L2e:
            r8 = move-exception
            goto L8a
        L30:
            r8 = move-exception
            java.lang.String r8 = r8.getMessage()     // Catch: java.lang.Throwable -> L2e
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L3b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r8.<init>()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r10 = "Invalid zip data. Stream ended after $totalBytesRead bytes. Expected "
            r8.append(r10)     // Catch: java.lang.Throwable -> L2e
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r9 = " bytes"
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L2e
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L57:
            if (r4 != r9) goto L6b
            boolean r8 = r0.finished()     // Catch: java.lang.Throwable -> L2e
            if (r8 == 0) goto L63
            r0.end()
            return r1
        L63:
            java.lang.String r8 = "Inflater did not finish"
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L6b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r8.<init>()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r10 = "Didn't read enough bytes during decompression. expected="
            r8.append(r10)     // Catch: java.lang.Throwable -> L2e
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r9 = " actual="
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            r8.append(r4)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L2e
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L8a:
            r0.end()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wv0.S(java.io.FileInputStream, int, int):byte[]");
    }

    public static long T(int i2, InputStream inputStream) {
        byte[] R = R(i2, inputStream);
        long j2 = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            j2 += (R[i3] & 255) << (i3 * 8);
        }
        return j2;
    }

    public static int U(Context context, int i2, int i3) {
        TypedValue L = mn.L(context, i2);
        if (L != null && L.type == 16) {
            return L.data;
        }
        return i3;
    }

    public static TimeInterpolator V(Context context, int i2, TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i2, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type == 3) {
            String valueOf = String.valueOf(typedValue.string);
            if (!H(valueOf, "cubic-bezier") && !H(valueOf, "path")) {
                return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
            }
            if (H(valueOf, "cubic-bezier")) {
                String[] split = valueOf.substring(13, valueOf.length() - 1).split(",");
                if (split.length == 4) {
                    return new PathInterpolator(C(split, 0), C(split, 1), C(split, 2), C(split, 3));
                }
                f40.h("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: ", split.length);
                return null;
            }
            if (H(valueOf, "path")) {
                String substring = valueOf.substring(5, valueOf.length() - 1);
                Path path = new Path();
                try {
                    vd0.b(r21.k(substring), path);
                    return new PathInterpolator(path);
                } catch (RuntimeException e2) {
                    f40.k("Error in parsing ".concat(substring), e2);
                    return null;
                }
            }
            c.k("Invalid motion easing type: ".concat(valueOf));
            return null;
        }
        c.k("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        return null;
    }

    public static final void W(dl dlVar, Object obj) {
        if (obj != n) {
            if (obj instanceof vr0) {
                zk[] zkVarArr = ((vr0) obj).b;
                int length = zkVarArr.length - 1;
                if (length < 0) {
                    return;
                }
                zk zkVar = zkVarArr[length];
                throw null;
            }
            dlVar.f(null, p).getClass();
            c.a();
        }
    }

    public static void X(View view, m90 m90Var) {
        us usVar = m90Var.d.c;
        if (usVar != null && usVar.a) {
            float f2 = 0.0f;
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                f2 += ((View) parent).getElevation();
            }
            k90 k90Var = m90Var.d;
            if (k90Var.m != f2) {
                k90Var.m = f2;
                m90Var.s();
            }
        }
    }

    public static final Object Y(dl dlVar) {
        Object f2 = dlVar.f(0, o);
        f2.getClass();
        return f2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Z(defpackage.fw r4, java.util.ArrayList r5, defpackage.rk r6) {
        /*
            boolean r0 = r6 instanceof defpackage.bw
            if (r0 == 0) goto L13
            r0 = r6
            bw r0 = (defpackage.bw) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L18
        L13:
            bw r0 = new bw
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.g
            int r1 = r0.h
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            java.util.ArrayList r4 = r0.f
            defpackage.hi0.p(r6)
            return r4
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.o(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.hi0.p(r6)
            cw r6 = new cw
            r1 = 0
            r6.<init>(r1, r5)
            r0.f = r5
            r0.h = r2
            java.lang.Object r4 = r4.a(r6, r0)
            ml r6 = defpackage.ml.c
            if (r4 != r6) goto L44
            return r6
        L44:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wv0.Z(fw, java.util.ArrayList, rk):java.lang.Object");
    }

    public static short[][] a0(short[][] sArr) {
        short[][] sArr2 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, sArr[0].length, sArr.length);
        for (int i2 = 0; i2 < sArr.length; i2++) {
            for (int i3 = 0; i3 < sArr[0].length; i3++) {
                sArr2[i3][i2] = sArr[i2][i3];
            }
        }
        return sArr2;
    }

    public static String b0(String str) {
        int i2;
        if (str.length() == 0) {
            return str;
        }
        if (str.indexOf(92) < 0 && str.indexOf(34) < 0) {
            return str.trim();
        }
        StringBuilder sb = new StringBuilder(str.length());
        if (str.charAt(0) == '\\' && str.charAt(1) == '#') {
            sb.append("\\#");
            i2 = 2;
        } else {
            i2 = 0;
        }
        boolean z = false;
        int i3 = 0;
        boolean z2 = false;
        boolean z3 = false;
        char c2 = 0;
        while (i2 != str.length()) {
            char charAt = str.charAt(i2);
            if (charAt != ' ') {
                z3 = true;
            }
            if (charAt == '\"') {
                if (!z) {
                    z2 = !z2;
                } else {
                    sb.append(charAt);
                    z = false;
                }
            } else if (charAt == '\\' && !z && !z2) {
                i3 = sb.length();
                z = true;
            } else if (charAt != ' ' || z || z3) {
                if (z && (('0' <= charAt && charAt <= '9') || (('a' <= charAt && charAt <= 'f') || ('A' <= charAt && charAt <= 'F')))) {
                    if (c2 != 0) {
                        sb.append((char) (s(charAt) + (s(c2) * 16)));
                        z = false;
                        c2 = 0;
                    } else {
                        c2 = charAt;
                    }
                } else {
                    sb.append(charAt);
                    z = false;
                }
            }
            i2++;
        }
        if (sb.length() > 0) {
            while (sb.charAt(sb.length() - 1) == ' ' && i3 != sb.length() - 1) {
                sb.setLength(sb.length() - 1);
            }
        }
        return sb.toString();
    }

    public static short[][] c(short[][] sArr, short[][] sArr2) {
        if (sArr.length == sArr2.length) {
            short[] sArr3 = sArr[0];
            if (sArr3.length == sArr2[0].length) {
                short[][] sArr4 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, sArr.length, sArr3.length);
                for (int i2 = 0; i2 < sArr.length; i2++) {
                    for (int i3 = 0; i3 < sArr[0].length; i3++) {
                        short[] sArr5 = sArr4[i2];
                        short s = sArr[i2][i3];
                        short s2 = sArr2[i2][i3];
                        byte[][] bArr = oz.a;
                        sArr5[i3] = (short) (s ^ s2);
                    }
                }
                return sArr4;
            }
        }
        f40.f("Addition is not possible!");
        return null;
    }

    public static final Object c0(dl dlVar, Object obj) {
        if (obj == null) {
            obj = Y(dlVar);
        }
        if (obj == 0) {
            return n;
        }
        if (obj instanceof Integer) {
            return dlVar.f(new vr0(((Number) obj).intValue(), dlVar), q);
        }
        c.a();
        return null;
    }

    public static String d0(i iVar) {
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        if ((iVar instanceof d0) && !(iVar instanceof sm)) {
            String d2 = ((d0) iVar).d();
            if (d2.length() > 0 && d2.charAt(0) == '#') {
                sb.append('\\');
            }
            sb.append(d2);
        } else {
            try {
                sb.append('#');
                byte[] h2 = iVar.c().h();
                i10 i10Var = h10.a;
                sb.append(yp0.a(h10.b(h2.length, h2)));
            } catch (IOException unused) {
                c.k("Other value has no encoded form");
                return null;
            }
        }
        int length = sb.length();
        int i3 = 2;
        if (sb.length() < 2 || sb.charAt(0) != '\\' || sb.charAt(1) != '#') {
            i3 = 0;
        }
        while (i3 != length) {
            char charAt = sb.charAt(i3);
            if (charAt != '\"' && charAt != '\\' && charAt != '+' && charAt != ',') {
                switch (charAt) {
                    case ';':
                    case '<':
                    case '=':
                    case '>':
                        break;
                    default:
                        i3++;
                        continue;
                }
            }
            sb.insert(i3, "\\");
            i3 += 2;
            length++;
        }
        if (sb.length() > 0) {
            while (sb.length() > i2 && sb.charAt(i2) == ' ') {
                sb.insert(i2, "\\");
                i2 += 2;
            }
        }
        for (int length2 = sb.length() - 1; length2 >= i2 && sb.charAt(length2) == ' '; length2--) {
            sb.insert(length2, '\\');
        }
        return sb.toString();
    }

    public static void e0(ByteArrayOutputStream byteArrayOutputStream, long j2, int i2) {
        byte[] bArr = new byte[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            bArr[i3] = (byte) ((j2 >> (i3 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static short[][] f(short[][] sArr) {
        if (sArr.length == sArr[0].length) {
            return c(sArr, a0(sArr));
        }
        f40.f("Addition is not possible!");
        return null;
    }

    public static void f0(ByteArrayOutputStream byteArrayOutputStream, int i2) {
        e0(byteArrayOutputStream, i2, 2);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [og0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [b0, om] */
    public static void g(ib ibVar, jp0 jp0Var, String str) {
        w11 w11Var = new w11(str, '=');
        String K = K(w11Var, true);
        String K2 = K(w11Var, false);
        s X = ibVar.X(K.trim());
        String b0 = b0(K2);
        ((ib) jp0Var.d).getClass();
        x R = mn.R(X, b0);
        Vector vector = (Vector) jp0Var.e;
        w8 w8Var = new w8(X, R);
        ?? obj = new Object();
        ?? b0Var = new b0(w8Var);
        b0Var.f = -1;
        obj.c = b0Var;
        vector.addElement(obj);
    }

    public static float g0() {
        return ((float) Math.pow(0.5689655172413793d, 3.0d)) * 100.0f;
    }

    public static void h(StringBuilder sb, w8 w8Var, Hashtable hashtable) {
        String str = (String) hashtable.get(w8Var.c);
        if (str == null) {
            str = w8Var.c.t();
        }
        sb.append(str);
        sb.append('=');
        sb.append(d0(w8Var.d));
    }

    /* JADX WARN: Code restructure failed: missing block: B:164:0x028a, code lost:
    
        if (r7.d == r6) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0112, code lost:
    
        if (r4.d == r12) goto L76;
     */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0698  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x06a3  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x06ac  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x06b3  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x06c3  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x06af  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x06a6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void i(defpackage.bk r40, defpackage.e60 r41, java.util.ArrayList r42, int r43) {
        /*
            Method dump skipped, instructions count: 1776
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wv0.i(bk, e60, java.util.ArrayList, int):void");
    }

    public static void j(int i2, Object obj) {
        int i3;
        if (obj instanceof hz) {
            if (obj instanceof iz) {
                i3 = ((iz) obj).b();
            } else if (obj instanceof ky) {
                i3 = 0;
            } else if (obj instanceof vy) {
                i3 = 1;
            } else if (obj instanceof zy) {
                i3 = 2;
            } else if (obj instanceof az) {
                i3 = 3;
            } else {
                i3 = -1;
            }
            if (i3 == i2) {
                return;
            }
        }
        String m2 = qo0.m("kotlin.jvm.functions.Function", i2);
        ClassCastException classCastException = new ClassCastException(obj.getClass().getName() + " cannot be cast to " + m2);
        k20.e0(classCastException, wv0.class.getName());
        throw classCastException;
    }

    public static final int k(int i2, int i3, int[] iArr) {
        iArr.getClass();
        int i4 = i2 - 1;
        int i5 = 0;
        while (i5 <= i4) {
            int i6 = (i5 + i4) >>> 1;
            int i7 = iArr[i6];
            if (i7 < i3) {
                i5 = i6 + 1;
            } else if (i7 > i3) {
                i4 = i6 - 1;
            } else {
                return i6;
            }
        }
        return ~i5;
    }

    public static final int l(long[] jArr, int i2, long j2) {
        jArr.getClass();
        int i3 = i2 - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            long j3 = jArr[i5];
            if (j3 < j2) {
                i4 = i5 + 1;
            } else if (j3 > j2) {
                i3 = i5 - 1;
            } else {
                return i5;
            }
        }
        return ~i4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x008c, code lost:
    
        if (r7 >= r0) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m(defpackage.i r9) {
        /*
            java.lang.String r9 = d0(r9)
            int r0 = r9.length()
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L4f
            char r0 = r9.charAt(r1)
            r3 = 35
            if (r0 != r3) goto L4f
            int r0 = r9.length()     // Catch: java.io.IOException -> L47
            int r0 = r0 - r2
            i10 r3 = defpackage.h10.a     // Catch: java.lang.Exception -> L2e
            byte[] r0 = r3.a(r9, r2, r0)     // Catch: java.lang.Exception -> L2e
            x r0 = defpackage.x.n(r0)     // Catch: java.io.IOException -> L47
            boolean r3 = r0 instanceof defpackage.d0
            if (r3 == 0) goto L4f
            d0 r0 = (defpackage.d0) r0
            java.lang.String r9 = r0.d()
            goto L4f
        L2e:
            r9 = move-exception
            w r0 = new w     // Catch: java.io.IOException -> L47
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L47
            java.lang.String r3 = "exception decoding Hex string: "
            r1.<init>(r3)     // Catch: java.io.IOException -> L47
            java.lang.String r3 = r9.getMessage()     // Catch: java.io.IOException -> L47
            r1.append(r3)     // Catch: java.io.IOException -> L47
            java.lang.String r1 = r1.toString()     // Catch: java.io.IOException -> L47
            r0.<init>(r2, r9, r1)     // Catch: java.io.IOException -> L47
            throw r0     // Catch: java.io.IOException -> L47
        L47:
            r9 = move-exception
            java.lang.String r0 = "unknown encoding in name: "
            defpackage.c.p(r9, r0)
            r9 = 0
            return r9
        L4f:
            java.lang.String r9 = defpackage.yp0.c(r9)
            int r0 = r9.length()
            r3 = 2
            if (r0 >= r3) goto L5b
            return r9
        L5b:
            int r0 = r0 - r2
            r3 = r1
        L5d:
            r4 = 92
            r5 = 32
            if (r3 >= r0) goto L74
            char r6 = r9.charAt(r3)
            if (r6 != r4) goto L74
            int r6 = r3 + 1
            char r6 = r9.charAt(r6)
            if (r6 != r5) goto L74
            int r3 = r3 + 2
            goto L5d
        L74:
            int r6 = r3 + 1
            r7 = r0
        L77:
            if (r7 <= r6) goto L8a
            int r8 = r7 + (-1)
            char r8 = r9.charAt(r8)
            if (r8 != r4) goto L8a
            char r8 = r9.charAt(r7)
            if (r8 != r5) goto L8a
            int r7 = r7 + (-2)
            goto L77
        L8a:
            if (r3 > 0) goto L8e
            if (r7 >= r0) goto L93
        L8e:
            int r7 = r7 + r2
            java.lang.String r9 = r9.substring(r3, r7)
        L93:
            java.lang.String r0 = "  "
            int r0 = r9.indexOf(r0)
            if (r0 >= 0) goto L9c
            return r9
        L9c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            char r1 = r9.charAt(r1)
            r0.append(r1)
        La8:
            int r3 = r9.length()
            if (r2 >= r3) goto Lbd
            char r3 = r9.charAt(r2)
            if (r1 != r5) goto Lb6
            if (r3 == r5) goto Lba
        Lb6:
            r0.append(r3)
            r1 = r3
        Lba:
            int r2 = r2 + 1
            goto La8
        Lbd:
            java.lang.String r9 = r0.toString()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wv0.m(i):java.lang.String");
    }

    public static void n(yb ybVar) {
        String str;
        int i2 = ybVar.d;
        if (i2 == 128) {
            return;
        }
        if (i2 != 64) {
            if (i2 == 128) {
                str = "CONTEXT";
            } else if (i2 != 192) {
                str = "UNIVERSAL";
            } else {
                str = "PRIVATE";
            }
        } else {
            str = "APPLICATION";
        }
        throw new IllegalStateException("Expected CONTEXT tag but found " + str);
    }

    public static void o(Handler handler) {
        String str;
        Looper myLooper = Looper.myLooper();
        if (myLooper != handler.getLooper()) {
            if (myLooper != null) {
                str = myLooper.getThread().getName();
            } else {
                str = "null current looper";
            }
            String name = handler.getLooper().getThread().getName();
            int length = String.valueOf(name).length();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + length + 35 + 1);
            sb.append("Must be called on ");
            sb.append(name);
            sb.append(" thread, but got ");
            sb.append(str);
            sb.append(".");
            throw new IllegalStateException(sb.toString());
        }
    }

    public static void p(Object obj) {
        if (obj != null) {
            return;
        }
        c.g("null reference");
    }

    public static void q(Object obj, String str) {
        if (obj != null) {
            return;
        }
        c.g(str);
    }

    public static byte[] r(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    public static int s(char c2) {
        if ('0' <= c2 && c2 <= '9') {
            return c2 - '0';
        }
        if ('a' <= c2 && c2 <= 'f') {
            return c2 - 'W';
        }
        return c2 - '7';
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [f20, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [f20, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [f20, java.lang.Object] */
    public static f20 t(int i2) {
        if (i2 != 0) {
            if (i2 != 1) {
                return new Object();
            }
            return new Object();
        }
        return new Object();
    }

    public static mq u(int i2, s sVar) {
        mq ik0Var;
        if (sVar.m(kb0.a)) {
            ik0Var = new fk0();
        } else if (sVar.m(kb0.i)) {
            ik0Var = new ik0(256);
        } else {
            c.r(sVar, "unrecognized digest OID: ");
            return null;
        }
        if (!kb0.i.m(sVar) && ik0Var.b() == i2) {
            return ik0Var;
        }
        return new oq(i2, ik0Var);
    }

    public static void v(String str, String str2, Object obj) {
        String D = D(str);
        if (Log.isLoggable(D, 3)) {
            Log.d(D, String.format(str2, obj));
        }
    }

    public static boolean w(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return false;
            }
            boolean z = true;
            for (File file2 : listFiles) {
                if (w(file2) && z) {
                    z = true;
                } else {
                    z = false;
                }
            }
            return z;
        }
        file.delete();
        return true;
    }

    public static void x(String str, String str2, Exception exc) {
        String D = D(str);
        if (Log.isLoggable(D, 6)) {
            Log.e(D, str2, exc);
        }
    }

    public static String y(Key key) {
        tc tcVar = vc.c;
        byte[] encoded = key.getEncoded();
        tcVar.getClass();
        int length = encoded.length;
        r21.f(0, length, encoded.length);
        rc rcVar = tcVar.a;
        int i2 = rcVar.e;
        int i3 = rcVar.f;
        RoundingMode roundingMode = RoundingMode.CEILING;
        StringBuilder sb = new StringBuilder(f20.s(length, i3) * i2);
        try {
            tcVar.d(sb, encoded, length);
            return sb.toString();
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    public static DHParameterSpec z(rd rdVar, xm xmVar) {
        DHParameterSpec dHParameterSpec = new DHParameterSpec(xmVar.b, xmVar.a, xmVar.c);
        try {
            AlgorithmParameters d2 = ((sb0) rdVar.c).d("DiffieHellman");
            d2.init(dHParameterSpec);
            DHParameterSpec dHParameterSpec2 = (DHParameterSpec) d2.getParameterSpec(DHParameterSpec.class);
            if (dHParameterSpec2 != null) {
                return dHParameterSpec2;
            }
            return null;
        } catch (AssertionError | Exception unused) {
            return null;
        }
    }

    public abstract View N(int i2);

    public abstract boolean O();
}
