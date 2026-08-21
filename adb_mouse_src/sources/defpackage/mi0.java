package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public abstract class mi0 {
    public static boolean a = true;
    public static Field b;
    public static boolean c;

    public mi0() {
        new ConcurrentHashMap();
    }

    public static boolean D(int i, long j) {
        if (j >= 0) {
            if (j < (1 << i)) {
                return true;
            }
            return false;
        }
        c.o("index must not be negative");
        return false;
    }

    public static String G(String str, Object... objArr) {
        int indexOf;
        StringBuilder sb = new StringBuilder((objArr.length * 16) + str.length());
        int i = 0;
        int i2 = 0;
        while (i < objArr.length && (indexOf = str.indexOf("%s", i2)) != -1) {
            sb.append((CharSequence) str, i2, indexOf);
            sb.append(H(objArr[i]));
            i2 = indexOf + 2;
            i++;
        }
        sb.append((CharSequence) str, i2, str.length());
        if (i < objArr.length) {
            String str2 = " [";
            while (i < objArr.length) {
                sb.append(str2);
                sb.append(H(objArr[i]));
                i++;
                str2 = ", ";
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static String H(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e) {
            String str = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
            Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for ".concat(str), (Throwable) e);
            return "<" + str + " threw " + e.getClass().getName() + ">";
        }
    }

    public static boolean K(Parcel parcel, int i) {
        V(parcel, i, 4);
        if (parcel.readInt() != 0) {
            return true;
        }
        return false;
    }

    public static int L(Parcel parcel, int i) {
        V(parcel, i, 4);
        return parcel.readInt();
    }

    public static int M(Parcel parcel, int i) {
        if ((i & (-65536)) != -65536) {
            return (char) (i >> 16);
        }
        return parcel.readInt();
    }

    public static void P(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + M(parcel, i));
    }

    public static byte[] Q(int i, long j) {
        byte[] bArr = new byte[i];
        for (int i2 = i - 1; i2 >= 0; i2--) {
            bArr[i2] = (byte) j;
            j >>>= 8;
        }
        return bArr;
    }

    public static int S(Parcel parcel) {
        int readInt = parcel.readInt();
        int M = M(parcel, readInt);
        char c2 = (char) readInt;
        int dataPosition = parcel.dataPosition();
        if (c2 == 20293) {
            int i = M + dataPosition;
            if (i >= dataPosition && i <= parcel.dataSize()) {
                return i;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(dataPosition).length() + 32 + String.valueOf(i).length());
            sb.append("Size read is invalid start=");
            sb.append(dataPosition);
            sb.append(" end=");
            sb.append(i);
            throw new vi(sb.toString(), parcel);
        }
        throw new vi("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(readInt))), parcel);
    }

    public static int T(int i) {
        return (int) (Integer.rotateLeft((int) (i * (-862048943)), 15) * 461845907);
    }

    public static int U(byte[] bArr, int i, k71 k71Var) {
        int d0 = d0(bArr, i, k71Var);
        int i2 = k71Var.a;
        if (i2 >= 0) {
            if (i2 <= bArr.length - d0) {
                if (i2 == 0) {
                    k71Var.c = n71.d;
                    return d0;
                }
                k71Var.c = n71.j(bArr, d0, i2);
                return d0 + i2;
            }
            f40.m("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        f40.m("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        return 0;
    }

    public static void V(Parcel parcel, int i, int i2) {
        int M = M(parcel, i);
        if (M == i2) {
            return;
        }
        String hexString = Integer.toHexString(M);
        int length = String.valueOf(i2).length();
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + length + 19 + String.valueOf(M).length() + 4 + 1);
        sb.append("Expected size ");
        sb.append(i2);
        sb.append(" got ");
        sb.append(M);
        sb.append(" (0x");
        sb.append(hexString);
        sb.append(")");
        throw new vi(sb.toString(), parcel);
    }

    public static int W(int i, byte[] bArr) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    public static void X(int i, int i2) {
        String E;
        if (i >= 0 && i < i2) {
            return;
        }
        if (i >= 0) {
            if (i2 < 0) {
                StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 15);
                sb.append("negative size: ");
                sb.append(i2);
                throw new IllegalArgumentException(sb.toString());
            }
            E = oi0.E("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            E = oi0.E("%s (%s) must not be negative", "index", Integer.valueOf(i));
        }
        throw new IndexOutOfBoundsException(E);
    }

    public static void Y(int i, int i2, int i3) {
        String a0;
        if (i >= 0 && i2 >= i && i2 <= i3) {
            return;
        }
        if (i >= 0 && i <= i3) {
            if (i2 >= 0 && i2 <= i3) {
                a0 = oi0.E("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            } else {
                a0 = a0("end index", i2, i3);
            }
        } else {
            a0 = a0("start index", i, i3);
        }
        throw new IndexOutOfBoundsException(a0);
    }

    public static int Z(u81 u81Var, int i, byte[] bArr, int i2, int i3, a81 a81Var, k71 k71Var) {
        x71 c2 = u81Var.c();
        u81 u81Var2 = u81Var;
        byte[] bArr2 = bArr;
        int i4 = i3;
        k71 k71Var2 = k71Var;
        int i0 = i0(c2, u81Var2, bArr2, i2, i4, k71Var2);
        u81Var2.a(c2);
        k71Var2.c = c2;
        a81Var.add(c2);
        while (i0 < i4) {
            k71 k71Var3 = k71Var2;
            int i5 = i4;
            int d0 = d0(bArr2, i0, k71Var3);
            if (i != k71Var3.a) {
                break;
            }
            byte[] bArr3 = bArr2;
            u81 u81Var3 = u81Var2;
            x71 c3 = u81Var3.c();
            i0 = i0(c3, u81Var3, bArr3, d0, i5, k71Var3);
            u81Var2 = u81Var3;
            bArr2 = bArr3;
            i4 = i5;
            k71Var2 = k71Var3;
            u81Var2.a(c3);
            k71Var2.c = c3;
            a81Var.add(c3);
        }
        return i0;
    }

    public static long a(int i, byte[] bArr) {
        long j = 0;
        if (bArr != null) {
            for (int i2 = 0; i2 < i; i2++) {
                j = (j << 8) | (bArr[i2] & 255);
            }
            return j;
        }
        c.g("in == null");
        return 0L;
    }

    public static String a0(String str, int i, int i2) {
        if (i < 0) {
            return oi0.E("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return oi0.E("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 15);
        sb.append("negative size: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    public static int b0(byte[] bArr, int i, a81 a81Var, k71 k71Var) {
        y71 y71Var = (y71) a81Var;
        int d0 = d0(bArr, i, k71Var);
        int i2 = k71Var.a + d0;
        while (d0 < i2) {
            d0 = d0(bArr, d0, k71Var);
            y71Var.d(k71Var.a);
        }
        if (d0 == i2) {
            return d0;
        }
        f40.m("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return 0;
    }

    public static byte[] c(sb0 sb0Var, int i) {
        im0 p = sb0Var.p();
        return p.o.c(p.f, i, "key expansion", f20.h(p.s, p.r)).e();
    }

    public static int c0(int i, byte[] bArr, int i2, int i3, x81 x81Var, k71 k71Var) {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 == 5) {
                                x81Var.c(i, Integer.valueOf(W(i2, bArr)));
                                return i2 + 4;
                            }
                            f40.m("Protocol message contained an invalid tag (zero).");
                            return 0;
                        }
                        int i5 = (i & (-8)) | 4;
                        x81 b2 = x81.b();
                        int i6 = k71Var.d + 1;
                        k71Var.d = i6;
                        if (i6 < 100) {
                            int i7 = 0;
                            while (true) {
                                if (i2 >= i3) {
                                    break;
                                }
                                int d0 = d0(bArr, i2, k71Var);
                                int i8 = k71Var.a;
                                if (i8 == i5) {
                                    i7 = i8;
                                    i2 = d0;
                                    break;
                                }
                                i2 = c0(i8, bArr, d0, i3, b2, k71Var);
                                i7 = i8;
                            }
                            k71Var.d--;
                            if (i2 <= i3 && i7 == i5) {
                                x81Var.c(i, b2);
                                return i2;
                            }
                            f40.m("Failed to parse the message.");
                            return 0;
                        }
                        f40.m("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
                        return 0;
                    }
                    int d02 = d0(bArr, i2, k71Var);
                    int i9 = k71Var.a;
                    if (i9 >= 0) {
                        if (i9 <= bArr.length - d02) {
                            if (i9 == 0) {
                                x81Var.c(i, n71.d);
                            } else {
                                x81Var.c(i, n71.j(bArr, d02, i9));
                            }
                            return d02 + i9;
                        }
                        f40.m("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                        return 0;
                    }
                    f40.m("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                    return 0;
                }
                x81Var.c(i, Long.valueOf(j0(i2, bArr)));
                return i2 + 8;
            }
            int g0 = g0(bArr, i2, k71Var);
            x81Var.c(i, Long.valueOf(k71Var.b));
            return g0;
        }
        f40.m("Protocol message contained an invalid tag (zero).");
        return 0;
    }

    public static int d0(byte[] bArr, int i, k71 k71Var) {
        int i2 = i + 1;
        byte b2 = bArr[i];
        if (b2 >= 0) {
            k71Var.a = b2;
            return i2;
        }
        return e0(b2, bArr, i2, k71Var);
    }

    public static byte[] e(byte[] bArr) {
        if (bArr != null) {
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }
        c.g("in == null");
        return null;
    }

    public static int e0(int i, byte[] bArr, int i2, k71 k71Var) {
        byte b2 = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & 127;
        if (b2 >= 0) {
            k71Var.a = i4 | (b2 << 7);
            return i3;
        }
        int i5 = i4 | ((b2 & Byte.MAX_VALUE) << 7);
        int i6 = i2 + 2;
        byte b3 = bArr[i3];
        if (b3 >= 0) {
            k71Var.a = i5 | (b3 << 14);
            return i6;
        }
        int i7 = i5 | ((b3 & Byte.MAX_VALUE) << 14);
        int i8 = i2 + 3;
        byte b4 = bArr[i6];
        if (b4 >= 0) {
            k71Var.a = i7 | (b4 << 21);
            return i8;
        }
        int i9 = i7 | ((b4 & Byte.MAX_VALUE) << 21);
        int i10 = i2 + 4;
        byte b5 = bArr[i8];
        if (b5 >= 0) {
            k71Var.a = i9 | (b5 << 28);
            return i10;
        }
        int i11 = i9 | ((b5 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] < 0) {
                i10 = i12;
            } else {
                k71Var.a = i11;
                return i12;
            }
        }
    }

    public static byte[][] f(byte[][] bArr) {
        if (bArr != null) {
            for (byte[] bArr2 : bArr) {
                if (bArr2 != null) {
                }
            }
            byte[][] bArr3 = new byte[bArr.length];
            for (int i = 0; i < bArr.length; i++) {
                byte[] bArr4 = new byte[bArr[i].length];
                bArr3[i] = bArr4;
                byte[] bArr5 = bArr[i];
                System.arraycopy(bArr5, 0, bArr4, 0, bArr5.length);
            }
            return bArr3;
        }
        c.g("in has null pointers");
        return null;
    }

    public static int f0(int i, byte[] bArr, int i2, int i3, a81 a81Var, k71 k71Var) {
        y71 y71Var = (y71) a81Var;
        int d0 = d0(bArr, i2, k71Var);
        y71Var.d(k71Var.a);
        while (d0 < i3) {
            int d02 = d0(bArr, d0, k71Var);
            if (i != k71Var.a) {
                break;
            }
            d0 = d0(bArr, d02, k71Var);
            y71Var.d(k71Var.a);
        }
        return d0;
    }

    public static void g(int i, byte[] bArr, byte[] bArr2) {
        if (bArr2 != null) {
            if (i >= 0) {
                if (bArr2.length + i <= bArr.length) {
                    for (int i2 = 0; i2 < bArr2.length; i2++) {
                        bArr[i + i2] = bArr2[i2];
                    }
                    return;
                }
                c.k("src length + offset must not be greater than size of destination");
                return;
            }
            c.k("offset hast to be >= 0");
            return;
        }
        c.g("src == null");
    }

    public static int g0(byte[] bArr, int i, k71 k71Var) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            k71Var.b = j;
            return i2;
        }
        int i3 = i + 2;
        byte b2 = bArr[i2];
        long j2 = (j & 127) | ((b2 & Byte.MAX_VALUE) << 7);
        int i4 = 7;
        while (b2 < 0) {
            int i5 = i3 + 1;
            i4 += 7;
            j2 |= (r10 & Byte.MAX_VALUE) << i4;
            b2 = bArr[i3];
            i3 = i5;
        }
        k71Var.b = j2;
        return i3;
    }

    public static int h0(Object obj, u81 u81Var, byte[] bArr, int i, int i2, int i3, k71 k71Var) {
        o81 o81Var = (o81) u81Var;
        int i4 = k71Var.d + 1;
        k71Var.d = i4;
        if (i4 < 100) {
            int t = o81Var.t(obj, bArr, i, i2, i3, k71Var);
            k71Var.d--;
            k71Var.c = obj;
            return t;
        }
        f40.m("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        return 0;
    }

    public static int i0(Object obj, u81 u81Var, byte[] bArr, int i, int i2, k71 k71Var) {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = e0(i4, bArr, i3, k71Var);
            i4 = k71Var.a;
        }
        int i5 = i3;
        if (i4 >= 0 && i4 <= i2 - i5) {
            int i6 = k71Var.d + 1;
            k71Var.d = i6;
            if (i6 < 100) {
                int i7 = i5 + i4;
                u81Var.e(obj, bArr, i5, i7, k71Var);
                k71Var.d--;
                k71Var.c = obj;
                return i7;
            }
            f40.m("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return 0;
        }
        f40.m("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return 0;
    }

    public static long j0(int i, byte[] bArr) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }

    public static Parcelable l(Parcel parcel, int i, Parcelable.Creator creator) {
        int M = M(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (M == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + M);
        return parcelable;
    }

    public static String m(Parcel parcel, int i) {
        int M = M(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (M == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + M);
        return readString;
    }

    public static Object[] n(Parcel parcel, int i, Parcelable.Creator creator) {
        int M = M(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (M == 0) {
            return null;
        }
        Object[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + M);
        return createTypedArray;
    }

    public static Object o(byte[] bArr, Class cls) {
        o21 o21Var = new o21(cls, new ByteArrayInputStream(bArr));
        Object readObject = o21Var.readObject();
        if (o21Var.available() == 0) {
            if (cls.isInstance(readObject)) {
                return readObject;
            }
            throw new IOException("unexpected class found in ObjectInputStream");
        }
        throw new IOException("unexpected data found at end of ObjectInputStream");
    }

    public static void p(Parcel parcel, int i) {
        if (parcel.dataPosition() == i) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 26);
        sb.append("Overread allowed size end=");
        sb.append(i);
        throw new vi(sb.toString(), parcel);
    }

    public static byte[] q(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            if (i >= 0) {
                if (i2 >= 0) {
                    if (i + i2 <= bArr.length) {
                        byte[] bArr2 = new byte[i2];
                        for (int i3 = 0; i3 < i2; i3++) {
                            bArr2[i3] = bArr[i + i3];
                        }
                        return bArr2;
                    }
                    c.k("offset + length must not be greater then size of source array");
                    return null;
                }
                c.k("length hast to be >= 0");
                return null;
            }
            c.k("offset hast to be >= 0");
            return null;
        }
        c.g("src == null");
        return null;
    }

    public static yw r(yw[] ywVarArr, int i) {
        int i2;
        boolean z;
        int i3;
        if ((i & 1) == 0) {
            i2 = 400;
        } else {
            i2 = 700;
        }
        if ((i & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        yw ywVar = null;
        int i4 = Integer.MAX_VALUE;
        for (yw ywVar2 : ywVarArr) {
            int abs = Math.abs(ywVar2.c - i2) * 2;
            if (ywVar2.d == z) {
                i3 = 0;
            } else {
                i3 = 1;
            }
            int i5 = abs + i3;
            if (ywVar == null || i4 > i5) {
                ywVar = ywVar2;
                i4 = i5;
            }
        }
        return ywVar;
    }

    public static ce s(mq mqVar) {
        mqVar.b();
        return new ce(mqVar.a(), 4);
    }

    public static void u() {
        Iterator it = Collections.EMPTY_LIST.iterator();
        if (!it.hasNext()) {
        } else {
            throw qo0.l(it);
        }
    }

    public abstract int A();

    public float B(View view) {
        if (a) {
            try {
                return mz0.a(view);
            } catch (NoSuchMethodError unused) {
                a = false;
            }
        }
        return view.getAlpha();
    }

    public abstract boolean C(float f);

    public abstract boolean E(View view);

    public abstract boolean F(float f, float f2);

    public abstract void I(int i);

    public abstract void J(Typeface typeface, boolean z);

    public void N(View view, float f) {
        if (a) {
            try {
                mz0.b(view, f);
                return;
            } catch (NoSuchMethodError unused) {
                a = false;
            }
        }
        view.setAlpha(f);
    }

    public abstract boolean O(View view, float f);

    public abstract void R(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2);

    public abstract int b(ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract float d(int i);

    public abstract Typeface h(Context context, vw vwVar, Resources resources, int i);

    public abstract Typeface i(Context context, yw[] ywVarArr, int i);

    public Typeface j(Context context, List list, int i) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface k(Context context, Resources resources, int i, String str, int i2) {
        File i3 = oi0.i(context);
        if (i3 == null) {
            return null;
        }
        try {
            if (!oi0.c(i3, resources, i)) {
                return null;
            }
            return Typeface.createFromFile(i3.getPath());
        } catch (RuntimeException unused) {
            return null;
        } finally {
            i3.delete();
        }
    }

    public abstract int t();

    public abstract int v();

    public abstract int w();

    public abstract int x();

    public abstract int y(View view);

    public abstract int z(CoordinatorLayout coordinatorLayout);
}
