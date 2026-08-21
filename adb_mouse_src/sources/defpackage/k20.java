package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.inputmethod.EditorInfo;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import svarzee.android.apps.adb_mouse.R;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public abstract class k20 implements fs {
    public static boolean A = false;
    public static int B = 0;
    public static boolean C = false;
    public static Method D = null;
    public static boolean E = false;
    public static Field F;
    public static final ce g;
    public static final ce i;
    public static final ce j;
    public static final ce k;
    public static final ce l;
    public static final ce m;
    public final /* synthetic */ int e;
    public static final Object f = new Object();
    public static final String[] h = new String[0];
    public static final qt n = new qt(false);
    public static final qt o = new qt(true);
    public static final short[] p = {2285, 2571, 2970, 1812, 1493, 1422, 287, 202, 3158, 622, 1577, 182, 962, 2127, 1855, 1468, 573, 2004, 264, 383, 2500, 1458, 1727, 3199, 2648, 1017, 732, 608, 1787, 411, 3124, 1758, 1223, 652, 2777, 1015, 2036, 1491, 3047, 1785, 516, 3321, 3009, 2663, 1711, 2167, 126, 1469, 2476, 3239, 3058, 830, 107, 1908, 3082, 2378, 2931, 961, 1821, 2604, 448, 2264, 677, 2054, 2226, 430, 555, 843, 2078, 871, 1550, 105, 422, 587, 177, 3094, 3038, 2869, 1574, 1653, 3083, 778, 1159, 3182, 2552, 1483, 2727, 1119, 1739, 644, 2457, 349, 418, 329, 3173, 3254, 817, 1097, 603, 610, 1322, 2044, 1864, 384, 2114, 3193, 1218, 1994, 2455, 220, 2142, 1670, 2144, 1799, 2051, 794, 1819, 2475, 2459, 478, 3221, 3021, 996, 991, 958, 1869, 1522, 1628};
    public static final byte[] q = {48, 49, 53, 0};
    public static final byte[] r = {48, 49, 48, 0};
    public static final byte[] s = {48, 48, 57, 0};
    public static final byte[] t = {48, 48, 53, 0};
    public static final byte[] u = {48, 48, 49, 0};
    public static final byte[] v = {48, 48, 49, 0};
    public static final byte[] w = {48, 48, 50, 0};
    public static final int[] x = {R.attr.colorPrimary};
    public static final int[] y = {R.attr.colorPrimaryVariant};
    public static final Object z = new Object();

    static {
        int i2 = 2;
        g = new ce("CLOSED", i2);
        i = new ce("COMPLETING_ALREADY", i2);
        j = new ce("COMPLETING_WAITING_CHILDREN", i2);
        k = new ce("COMPLETING_RETRY", i2);
        l = new ce("TOO_LATE_TO_CANCEL", i2);
        m = new ce("SEALED", i2);
    }

    public /* synthetic */ k20(int i2) {
        this.e = i2;
    }

    public static void H(byte[] bArr, int i2, int i3) {
        bArr[i3] = (byte) (i2 >>> 24);
        bArr[i3 + 1] = (byte) (i2 >>> 16);
        bArr[i3 + 2] = (byte) (i2 >>> 8);
        bArr[i3 + 3] = (byte) i2;
    }

    public static void I(byte[] bArr, int i2, int i3) {
        bArr[i3] = (byte) i2;
        bArr[i3 + 1] = (byte) (i2 >>> 8);
        bArr[i3 + 2] = (byte) (i2 >>> 16);
        bArr[i3 + 3] = (byte) (i2 >>> 24);
    }

    public static boolean K() {
        if (Build.VERSION.SDK_INT >= 26) {
            return true;
        }
        return false;
    }

    public static boolean M(Context context) {
        if (context.getResources().getConfiguration().fontScale >= 1.3f) {
            return true;
        }
        return false;
    }

    public static int P(int i2, byte[] bArr) {
        return (bArr[i2 + 3] << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
    }

    public static long Q(int i2, byte[] bArr) {
        return ((P(i2 + 4, bArr) & 4294967295L) << 32) | (P(i2, bArr) & 4294967295L);
    }

    public static void R(int i2, long j2, byte[] bArr) {
        H(bArr, (int) (j2 >>> 32), i2);
        H(bArr, (int) (j2 & 4294967295L), i2 + 4);
    }

    public static void S(int i2, long j2, byte[] bArr) {
        I(bArr, (int) (4294967295L & j2), i2);
        I(bArr, (int) (j2 >>> 32), i2 + 4);
    }

    public static TypedArray X(Context context, AttributeSet attributeSet, int[] iArr, int i2, int i3, int... iArr2) {
        i(context, attributeSet, i2, i3);
        j(context, attributeSet, iArr, i2, i3, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i2, i3);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [p, java.lang.Object, mc0] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, nc0] */
    /* JADX WARN: Type inference failed for: r5v2, types: [rj0, java.lang.Object] */
    public static mc0 Y(byte[] bArr) {
        nc0 nc0Var;
        k kVar;
        a0 s2 = a0.s(ht0.J(bArr));
        ?? obj = new Object();
        Object t2 = s2.t(0);
        rj0 rj0Var = null;
        if (t2 instanceof nc0) {
            nc0Var = (nc0) t2;
        } else if (t2 != null) {
            if (t2 instanceof k) {
                kVar = (k) t2;
            } else if (t2 instanceof byte[]) {
                try {
                    x n2 = x.n((byte[]) t2);
                    if (k.class.isInstance(n2)) {
                        kVar = (k) n2;
                    } else {
                        throw new IllegalStateException("unexpected object: ".concat(n2.getClass().getName()));
                    }
                } catch (Exception e) {
                    throw new IllegalArgumentException("encoding error in getInstance: " + e.toString());
                }
            } else {
                c.k("illegal object in getInstance: ".concat(t2.getClass().getName()));
                return null;
            }
            ?? obj2 = new Object();
            obj2.c = kVar;
            nc0Var = obj2;
        } else {
            nc0Var = null;
        }
        obj.c = nc0Var;
        if (s2.size() == 2) {
            a0 a0Var = (a0) a0.d.d((yb) s2.t(1), true);
            if (a0Var != null) {
                a0 s3 = a0.s(a0Var);
                ?? obj3 = new Object();
                obj3.c = (s) s3.t(0);
                obj3.d = (t) s3.t(1);
                rj0Var = obj3;
            }
            obj.d = rj0Var;
        }
        ht0.T(obj, bArr);
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
    
        if (r5 != null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003e, code lost:
    
        r5.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x004c, code lost:
    
        if (r5 == null) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a0(android.content.Context r5, java.lang.String r6) {
        /*
            java.lang.Object r0 = defpackage.k20.f
            monitor-enter(r0)
            java.lang.String r1 = ""
            boolean r1 = r6.equals(r1)     // Catch: java.lang.Throwable -> L12
            if (r1 == 0) goto L14
            java.lang.String r6 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            r5.deleteFile(r6)     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            return
        L12:
            r5 = move-exception
            goto L60
        L14:
            java.lang.String r1 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            r2 = 0
            java.io.FileOutputStream r5 = r5.openFileOutput(r1, r2)     // Catch: java.lang.Throwable -> L12 java.io.FileNotFoundException -> L57
            org.xmlpull.v1.XmlSerializer r1 = android.util.Xml.newSerializer()     // Catch: java.lang.Throwable -> L12
            r2 = 0
            r1.setOutput(r5, r2)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            java.lang.String r3 = "UTF-8"
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            r1.startDocument(r3, r4)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            java.lang.String r3 = "locales"
            r1.startTag(r2, r3)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            java.lang.String r3 = "application_locales"
            r1.attribute(r2, r3, r6)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            java.lang.String r6 = "locales"
            r1.endTag(r2, r6)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            r1.endDocument()     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            if (r5 == 0) goto L4f
        L3e:
            r5.close()     // Catch: java.lang.Throwable -> L12 java.io.IOException -> L4f
            goto L4f
        L42:
            r6 = move-exception
            goto L51
        L44:
            r6 = move-exception
            java.lang.String r1 = "AppLocalesStorageHelper"
            java.lang.String r2 = "Storing App Locales : Failed to persist app-locales in storage "
            android.util.Log.w(r1, r2, r6)     // Catch: java.lang.Throwable -> L42
            if (r5 == 0) goto L4f
            goto L3e
        L4f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            goto L5f
        L51:
            if (r5 == 0) goto L56
            r5.close()     // Catch: java.lang.Throwable -> L12 java.io.IOException -> L56
        L56:
            throw r6     // Catch: java.lang.Throwable -> L12
        L57:
            java.lang.String r5 = "AppLocalesStorageHelper"
            java.lang.String r6 = "Storing App Locales : FileNotFoundException: Cannot open file androidx.appcompat.app.AppCompatDelegate.application_locales_record_file for writing "
            android.util.Log.w(r5, r6)     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
        L5f:
            return
        L60:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k20.a0(android.content.Context, java.lang.String):void");
    }

    public static dl b0(dl dlVar, dl dlVar2) {
        dlVar2.getClass();
        if (dlVar2 == st.c) {
            return dlVar;
        }
        return (dl) dlVar2.f(dlVar, new pi(1));
    }

    public static boolean c(Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 == null) {
                return true;
            }
            return false;
        }
        return obj.equals(obj2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
    
        if (r2 != null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005a, code lost:
    
        if (r1.isEmpty() == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005d, code lost:
    
        r8.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0046, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x002e, code lost:
    
        if (r5 != 4) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x003b, code lost:
    
        if (r3.getName().equals("locales") == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x003d, code lost:
    
        r1 = r3.getAttributeValue(null, "application_locales");
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0053, code lost:
    
        if (r2 == null) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String c0(android.content.Context r8) {
        /*
            java.lang.Object r0 = defpackage.k20.f
            monitor-enter(r0)
            java.lang.String r1 = ""
            java.lang.String r2 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            java.io.FileInputStream r2 = r8.openFileInput(r2)     // Catch: java.lang.Throwable -> L4a java.io.FileNotFoundException -> L6a
            org.xmlpull.v1.XmlPullParser r3 = android.util.Xml.newPullParser()     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L4c
            java.lang.String r4 = "UTF-8"
            r3.setInput(r2, r4)     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L4c
            int r4 = r3.getDepth()     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L4c
        L18:
            int r5 = r3.next()     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L4c
            r6 = 1
            if (r5 == r6) goto L44
            r6 = 3
            if (r5 != r6) goto L2b
            int r7 = r3.getDepth()     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L4c
            if (r7 <= r4) goto L44
            goto L2b
        L29:
            r8 = move-exception
            goto L64
        L2b:
            if (r5 == r6) goto L18
            r6 = 4
            if (r5 != r6) goto L31
            goto L18
        L31:
            java.lang.String r5 = r3.getName()     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L4c
            java.lang.String r6 = "locales"
            boolean r5 = r5.equals(r6)     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L4c
            if (r5 == 0) goto L18
            java.lang.String r4 = "application_locales"
            r5 = 0
            java.lang.String r1 = r3.getAttributeValue(r5, r4)     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L4c
        L44:
            if (r2 == 0) goto L56
        L46:
            r2.close()     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L56
            goto L56
        L4a:
            r8 = move-exception
            goto L6c
        L4c:
            java.lang.String r3 = "AppLocalesStorageHelper"
            java.lang.String r4 = "Reading app Locales : Unable to parse through file :androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            android.util.Log.w(r3, r4)     // Catch: java.lang.Throwable -> L29
            if (r2 == 0) goto L56
            goto L46
        L56:
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> L4a
            if (r2 != 0) goto L5d
            goto L62
        L5d:
            java.lang.String r2 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            r8.deleteFile(r2)     // Catch: java.lang.Throwable -> L4a
        L62:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4a
            return r1
        L64:
            if (r2 == 0) goto L69
            r2.close()     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L69
        L69:
            throw r8     // Catch: java.lang.Throwable -> L4a
        L6a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4a
            return r1
        L6c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4a
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k20.c0(android.content.Context):java.lang.String");
    }

    public static void d(c0 c0Var, int i2, short s2, short s3, short s4, short s5, short s6) {
        ((short[]) c0Var.e)[i2] = (short) (gi0.i(s2 * s4) + gi0.i(gi0.i(s3 * s5) * s6));
        short i3 = (short) (gi0.i(s3 * s4) + gi0.i(s2 * s5));
        ((short[]) c0Var.e)[i2 + 1] = i3;
    }

    public static final Object d0(Object obj) {
        if (obj instanceof ui) {
            Throwable th = ((ui) obj).a;
            th.getClass();
            return new sj0(th);
        }
        return obj;
    }

    public static int e(int i2, byte[] bArr) {
        return (bArr[i2 + 3] & 255) | (bArr[i2] << 24) | ((bArr[i2 + 1] & 255) << 16) | ((bArr[i2 + 2] & 255) << 8);
    }

    public static void e0(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i2 = -1;
        for (int i3 = 0; i3 < length; i3++) {
            if (str.equals(stackTrace[i3].getClassName())) {
                i2 = i3;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i2 + 1, length));
    }

    public static void h0(EditorInfo editorInfo, CharSequence charSequence, int i2, int i3) {
        SpannableStringBuilder spannableStringBuilder;
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        if (charSequence != null) {
            spannableStringBuilder = new SpannableStringBuilder(charSequence);
        } else {
            spannableStringBuilder = null;
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", spannableStringBuilder);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i2);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i3);
    }

    public static void i(Context context, AttributeSet attributeSet, int i2, int i3) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, mg0.G, i2, i3);
        boolean z2 = obtainStyledAttributes.getBoolean(1, false);
        obtainStyledAttributes.recycle();
        if (z2) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                k(context, y, "Theme.MaterialComponents");
            }
        }
        k(context, x, "Theme.AppCompat");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        if (r0.getResourceId(0, -1) != (-1)) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void j(android.content.Context r5, android.util.AttributeSet r6, int[] r7, int r8, int r9, int... r10) {
        /*
            int[] r0 = defpackage.mg0.G
            android.content.res.TypedArray r0 = r5.obtainStyledAttributes(r6, r0, r8, r9)
            r1 = 2
            r2 = 0
            boolean r1 = r0.getBoolean(r1, r2)
            if (r1 != 0) goto L12
            r0.recycle()
            return
        L12:
            int r1 = r10.length
            r3 = 1
            r4 = -1
            if (r1 != 0) goto L1f
            int r5 = r0.getResourceId(r2, r4)
            if (r5 == r4) goto L3a
        L1d:
            r2 = r3
            goto L3a
        L1f:
            android.content.res.TypedArray r5 = r5.obtainStyledAttributes(r6, r7, r8, r9)
            int r6 = r10.length
            r7 = r2
        L25:
            if (r7 >= r6) goto L36
            r8 = r10[r7]
            int r8 = r5.getResourceId(r8, r4)
            if (r8 != r4) goto L33
            r5.recycle()
            goto L3a
        L33:
            int r7 = r7 + 1
            goto L25
        L36:
            r5.recycle()
            goto L1d
        L3a:
            r0.recycle()
            if (r2 == 0) goto L40
            return
        L40:
            java.lang.String r5 = "This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant)."
            defpackage.c.k(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k20.j(android.content.Context, android.util.AttributeSet, int[], int, int, int[]):void");
    }

    public static void k(Context context, int[] iArr, String str) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (!obtainStyledAttributes.hasValue(i2)) {
                obtainStyledAttributes.recycle();
                c.k(qo0.r("The style on this component requires your app theme to be ", str, " (or a descendant)."));
                return;
            }
        }
        obtainStyledAttributes.recycle();
    }

    public static final Object l(zy zyVar, rk rkVar) {
        cm0 cm0Var = new cm0(rkVar.d(), rkVar);
        return gi0.m(cm0Var, cm0Var, zyVar);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public static defpackage.df0 n(defpackage.u8 r46, defpackage.b0 r47) {
        /*
            Method dump skipped, instructions count: 3341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k20.n(u8, b0):df0");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [qy0, java.lang.Object] */
    public static boolean o(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int indexOfKey;
        WeakHashMap weakHashMap = ry0.a;
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList arrayList2 = qy0.d;
            qy0 qy0Var = (qy0) view.getTag(R.id.tag_unhandled_key_event_manager);
            WeakReference weakReference = null;
            qy0 qy0Var2 = qy0Var;
            if (qy0Var == null) {
                ?? obj = new Object();
                obj.a = null;
                obj.b = null;
                obj.c = null;
                view.setTag(R.id.tag_unhandled_key_event_manager, obj);
                qy0Var2 = obj;
            }
            WeakReference weakReference2 = qy0Var2.c;
            if (weakReference2 == null || weakReference2.get() != keyEvent) {
                qy0Var2.c = new WeakReference(keyEvent);
                if (qy0Var2.b == null) {
                    qy0Var2.b = new SparseArray();
                }
                SparseArray sparseArray = qy0Var2.b;
                if (keyEvent.getAction() == 1 && (indexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                    weakReference = (WeakReference) sparseArray.valueAt(indexOfKey);
                    sparseArray.removeAt(indexOfKey);
                }
                if (weakReference == null) {
                    weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
                }
                if (weakReference != null) {
                    View view2 = (View) weakReference.get();
                    if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
                        return true;
                    }
                    arrayList.get(size).getClass();
                    c.a();
                    return false;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean p(defpackage.k40 r6, android.view.View r7, android.view.Window.Callback r8, android.view.KeyEvent r9) {
        /*
            r0 = 0
            if (r6 != 0) goto L5
            goto Le4
        L5:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 < r2) goto L10
            boolean r6 = r6.b(r9)
            return r6
        L10:
            boolean r1 = r8 instanceof android.app.Activity
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L82
            android.app.Activity r8 = (android.app.Activity) r8
            r8.onUserInteraction()
            android.view.Window r6 = r8.getWindow()
            r7 = 8
            boolean r7 = r6.hasFeature(r7)
            if (r7 == 0) goto L65
            android.app.ActionBar r7 = r8.getActionBar()
            int r1 = r9.getKeyCode()
            r4 = 82
            if (r1 != r4) goto L65
            if (r7 == 0) goto L65
            boolean r1 = defpackage.k20.C
            if (r1 != 0) goto L4d
            java.lang.Class r1 = r7.getClass()     // Catch: java.lang.NoSuchMethodException -> L4b
            java.lang.String r4 = "onMenuKeyEvent"
            java.lang.Class<android.view.KeyEvent> r5 = android.view.KeyEvent.class
            java.lang.Class[] r5 = new java.lang.Class[]{r5}     // Catch: java.lang.NoSuchMethodException -> L4b
            java.lang.reflect.Method r1 = r1.getMethod(r4, r5)     // Catch: java.lang.NoSuchMethodException -> L4b
            defpackage.k20.D = r1     // Catch: java.lang.NoSuchMethodException -> L4b
        L4b:
            defpackage.k20.C = r3
        L4d:
            java.lang.reflect.Method r1 = defpackage.k20.D
            if (r1 == 0) goto L62
            java.lang.Object[] r4 = new java.lang.Object[]{r9}     // Catch: java.lang.Throwable -> L62
            java.lang.Object r7 = r1.invoke(r7, r4)     // Catch: java.lang.Throwable -> L62
            if (r7 != 0) goto L5c
            goto L62
        L5c:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L62
            boolean r0 = r7.booleanValue()     // Catch: java.lang.Throwable -> L62
        L62:
            if (r0 == 0) goto L65
            goto L81
        L65:
            boolean r7 = r6.superDispatchKeyEvent(r9)
            if (r7 == 0) goto L6c
            goto L81
        L6c:
            android.view.View r6 = r6.getDecorView()
            boolean r7 = defpackage.ry0.c(r6, r9)
            if (r7 == 0) goto L77
            goto L81
        L77:
            if (r6 == 0) goto L7d
            android.view.KeyEvent$DispatcherState r2 = r6.getKeyDispatcherState()
        L7d:
            boolean r3 = r9.dispatch(r8, r2, r8)
        L81:
            return r3
        L82:
            boolean r1 = r8 instanceof android.app.Dialog
            if (r1 == 0) goto Ld5
            android.app.Dialog r8 = (android.app.Dialog) r8
            boolean r6 = defpackage.k20.E
            if (r6 != 0) goto L9b
            java.lang.Class<android.app.Dialog> r6 = android.app.Dialog.class
            java.lang.String r7 = "mOnKeyListener"
            java.lang.reflect.Field r6 = r6.getDeclaredField(r7)     // Catch: java.lang.NoSuchFieldException -> L99
            defpackage.k20.F = r6     // Catch: java.lang.NoSuchFieldException -> L99
            r6.setAccessible(r3)     // Catch: java.lang.NoSuchFieldException -> L99
        L99:
            defpackage.k20.E = r3
        L9b:
            java.lang.reflect.Field r6 = defpackage.k20.F
            if (r6 == 0) goto La6
            java.lang.Object r6 = r6.get(r8)     // Catch: java.lang.IllegalAccessException -> La6
            android.content.DialogInterface$OnKeyListener r6 = (android.content.DialogInterface.OnKeyListener) r6     // Catch: java.lang.IllegalAccessException -> La6
            goto La7
        La6:
            r6 = r2
        La7:
            if (r6 == 0) goto Lb4
            int r7 = r9.getKeyCode()
            boolean r6 = r6.onKey(r8, r7, r9)
            if (r6 == 0) goto Lb4
            goto Ld4
        Lb4:
            android.view.Window r6 = r8.getWindow()
            boolean r7 = r6.superDispatchKeyEvent(r9)
            if (r7 == 0) goto Lbf
            goto Ld4
        Lbf:
            android.view.View r6 = r6.getDecorView()
            boolean r7 = defpackage.ry0.c(r6, r9)
            if (r7 == 0) goto Lca
            goto Ld4
        Lca:
            if (r6 == 0) goto Ld0
            android.view.KeyEvent$DispatcherState r2 = r6.getKeyDispatcherState()
        Ld0:
            boolean r3 = r9.dispatch(r8, r2, r8)
        Ld4:
            return r3
        Ld5:
            if (r7 == 0) goto Ldd
            boolean r7 = defpackage.ry0.c(r7, r9)
            if (r7 != 0) goto Le3
        Ldd:
            boolean r6 = r6.b(r9)
            if (r6 == 0) goto Le4
        Le3:
            return r3
        Le4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k20.p(k40, android.view.View, android.view.Window$Callback, android.view.KeyEvent):boolean");
    }

    public static void p0(String str) {
        RuntimeException runtimeException = new RuntimeException(qo0.r("lateinit property ", str, " has not been initialized"));
        e0(runtimeException, k20.class.getName());
        throw runtimeException;
    }

    public static int q0(Context context, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(android.R.style.Animation.Activity, new int[]{i2});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public static void r(int i2, int[] iArr, int[] iArr2) {
        int i3 = 0;
        long j2 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i2 > 0) {
            if (i3 < Math.min(30, i2)) {
                j2 |= (iArr[i4] & 4294967295L) << i3;
                i3 += 32;
                i4++;
            }
            iArr2[i5] = ((int) j2) & 1073741823;
            j2 >>>= 30;
            i3 -= 30;
            i2 -= 30;
            i5++;
        }
    }

    public static int s(int i2, int i3, int[] iArr) {
        int i4 = i3 ^ iArr[0];
        for (int i5 = 1; i5 < i2; i5++) {
            i4 |= iArr[i5];
        }
        return (((i4 >>> 1) | (i4 & 1)) - 1) >> 31;
    }

    public static void s0(int i2, mq mqVar) {
        mqVar.d((byte) (i2 >>> 24));
        mqVar.d((byte) (i2 >>> 16));
        mqVar.d((byte) (i2 >>> 8));
        mqVar.d((byte) i2);
    }

    public static int t(int i2) {
        int i3 = i2 & 65535;
        int i4 = (i3 | (i3 << 8)) & 16711935;
        int i5 = (i4 | (i4 << 4)) & 252645135;
        int i6 = (i5 | (i5 << 2)) & 858993459;
        return (i6 | (i6 << 1)) & 1431655765;
    }

    public static final Object u(mm0 mm0Var, long j2, zy zyVar) {
        while (true) {
            if (mm0Var.c >= j2 && !mm0Var.c()) {
                return mm0Var;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = hj.a;
            Object obj = atomicReferenceFieldUpdater.get(mm0Var);
            ce ceVar = g;
            if (obj == ceVar) {
                return ceVar;
            }
            mm0 mm0Var2 = (mm0) ((hj) obj);
            if (mm0Var2 == null) {
                mm0Var2 = (mm0) zyVar.g(Long.valueOf(mm0Var.c + 1), mm0Var);
                while (!atomicReferenceFieldUpdater.compareAndSet(mm0Var, null, mm0Var2)) {
                    if (atomicReferenceFieldUpdater.get(mm0Var) != null) {
                        break;
                    }
                }
                if (mm0Var.c()) {
                    mm0Var.d();
                }
            }
            mm0Var = mm0Var2;
        }
    }

    public static ColorStateList v(Context context, b8 b8Var, int i2) {
        int resourceId;
        ColorStateList q2;
        TypedArray typedArray = (TypedArray) b8Var.d;
        if (typedArray.hasValue(i2) && (resourceId = typedArray.getResourceId(i2, 0)) != 0 && (q2 = mn.q(context, resourceId)) != null) {
            return q2;
        }
        return b8Var.y(i2);
    }

    public static ColorStateList w(Context context, TypedArray typedArray, int i2) {
        int resourceId;
        ColorStateList q2;
        if (typedArray.hasValue(i2) && (resourceId = typedArray.getResourceId(i2, 0)) != 0 && (q2 = mn.q(context, resourceId)) != null) {
            return q2;
        }
        return typedArray.getColorStateList(i2);
    }

    public static s x(String str) {
        if (str.equals("SHA-256")) {
            return kb0.a;
        }
        if (str.equals("SHA-512")) {
            return kb0.c;
        }
        if (str.equals("SHAKE128")) {
            return kb0.g;
        }
        if (str.equals("SHAKE256")) {
            return kb0.h;
        }
        c.k("unrecognized digest: ".concat(str));
        return null;
    }

    public static int y(Context context, TypedArray typedArray, int i2, int i3) {
        TypedValue typedValue = new TypedValue();
        if (typedArray.getValue(i2, typedValue) && typedValue.type == 2) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, i3);
            obtainStyledAttributes.recycle();
            return dimensionPixelSize;
        }
        return typedArray.getDimensionPixelSize(i2, i3);
    }

    public static Drawable z(Context context, TypedArray typedArray, int i2) {
        int resourceId;
        Drawable r2;
        if (typedArray.hasValue(i2) && (resourceId = typedArray.getResourceId(i2, 0)) != 0 && (r2 = r21.r(context, resourceId)) != null) {
            return r2;
        }
        return typedArray.getDrawable(i2);
    }

    public abstract int A();

    public abstract InputFilter[] B(InputFilter[] inputFilterArr);

    public abstract int C(View view, ViewGroup.MarginLayoutParams marginLayoutParams);

    public d3 D(Context context, Object obj) {
        return null;
    }

    public abstract float E(Object obj);

    public abstract int F();

    public abstract ViewPropertyAnimator G(View view, int i2);

    public abstract k20 J();

    public abstract boolean L();

    public boolean N() {
        if (f() == 1) {
            return true;
        }
        return false;
    }

    public boolean O() {
        if (r0().signum() == 0) {
            return true;
        }
        return false;
    }

    public abstract k20 T(k20 k20Var);

    public abstract k20 U(k20 k20Var, k20 k20Var2, k20 k20Var3);

    public abstract k20 V(k20 k20Var, k20 k20Var2, k20 k20Var3);

    public abstract k20 W();

    public abstract Object Z(int i2, Intent intent);

    public abstract k20 a(k20 k20Var);

    public abstract k20 b();

    public int f() {
        return r0().bitLength();
    }

    public abstract void f0(boolean z2);

    public z4 g(Context context, Looper looper, i6 i6Var, Object obj, c00 c00Var, d00 d00Var) {
        return h(context, looper, i6Var, obj, (y21) c00Var, (y21) d00Var);
    }

    public abstract void g0(boolean z2);

    public z4 h(Context context, Looper looper, i6 i6Var, Object obj, y21 y21Var, y21 y21Var2) {
        throw new UnsupportedOperationException("buildClient must be implemented");
    }

    public abstract void i0(Object obj, float f2);

    public abstract k20 j0();

    public abstract k20 k0();

    public abstract k20 l0(k20 k20Var, k20 k20Var2);

    public abstract Intent m(Context context, Object obj);

    public k20 m0(int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            this = this.k0();
        }
        return this;
    }

    public abstract k20 n0(k20 k20Var);

    public boolean o0() {
        return r0().testBit(0);
    }

    public abstract k20 q(k20 k20Var);

    public abstract BigInteger r0();

    public abstract TransformationMethod t0(TransformationMethod transformationMethod);

    public String toString() {
        switch (this.e) {
            case 17:
                return r0().toString(16);
            default:
                return super.toString();
        }
    }
}
