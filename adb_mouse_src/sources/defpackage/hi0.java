package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Hashtable;
import java.util.Vector;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public abstract class hi0 {
    public static void a(Hashtable hashtable, Vector vector) {
        byte[] bArr;
        if (vector.isEmpty()) {
            ht0.g(0);
            bArr = new byte[2];
            ht0.a0(bArr, 0, 0);
        } else {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ht0.Z(0, byteArrayOutputStream);
            for (int i = 0; i < vector.size(); i++) {
                m40 m40Var = (m40) vector.elementAt(i);
                ht0.Z(m40Var.a, byteArrayOutputStream);
                ht0.X(m40Var.b, byteArrayOutputStream);
            }
            int size = byteArrayOutputStream.size() - 2;
            ht0.g(size);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            ht0.a0(byteArray, size, 0);
            bArr = byteArray;
        }
        hashtable.put(51, bArr);
    }

    public static void b(Hashtable hashtable) {
        byte[] r = ht0.r(hashtable, 16);
        if (r == null) {
            return;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(r);
        if (ht0.P(byteArrayInputStream) == r.length - 2) {
            Vector vector = new Vector();
            while (byteArrayInputStream.available() > 0) {
                vector.addElement(new wf0(ht0.N(byteArrayInputStream)));
            }
            if (vector.size() == 1) {
                return;
            }
            throw new us0((short) 50, null, null);
        }
        throw new us0((short) 50, null, null);
    }

    public static int c(Context context, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        if (typedValue.resourceId != 0) {
            return i;
        }
        return i2;
    }

    public static c0 d(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i) {
        c0 c0Var;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i2 = typedValue.type;
            if (i2 >= 28 && i2 <= 31) {
                return new c0((Shader) null, (ColorStateList) null, typedValue.data);
            }
            try {
                c0Var = c0.g(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            } catch (Exception e) {
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
                c0Var = null;
            }
            if (c0Var != null) {
                return c0Var;
            }
        }
        return new c0((Shader) null, (ColorStateList) null, 0);
    }

    public static xf0 e(Hashtable hashtable) {
        byte[] r = ht0.r(hashtable, 43);
        if (r == null) {
            return null;
        }
        if (r.length == 2) {
            return xf0.c(r[0] & 255, r[1] & 255);
        }
        throw new us0((short) 50, null, null);
    }

    public static boolean f(XmlPullParser xmlPullParser, String str) {
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null) {
            return true;
        }
        return false;
    }

    public static i21 g(l3 l3Var, sb0 sb0Var, a50 a50Var) {
        int i;
        long j;
        double d;
        int i2;
        int i3;
        int i4;
        int i5 = ((qz) l3Var.g).c;
        byte[][] f = mi0.f((byte[][]) sb0Var.c);
        i21[] i21VarArr = new i21[f.length];
        for (int i6 = 0; i6 < f.length; i6++) {
            i21VarArr[i6] = new i21(0, f[i6]);
        }
        z40 z40Var = new z40(0);
        z40Var.c = a50Var.a;
        z40Var.b = a50Var.b;
        z40Var.e = a50Var.e;
        z40Var.f = 0;
        z40Var.g = a50Var.g;
        z40Var.d = a50Var.d;
        a50 a50Var2 = new a50(z40Var);
        while (i5 > 1) {
            int i7 = 0;
            while (true) {
                i = a50Var2.d;
                j = a50Var2.b;
                d = i5 / 2;
                int floor = (int) Math.floor(d);
                i2 = a50Var2.f;
                i3 = a50Var2.e;
                i4 = a50Var2.a;
                if (i7 >= floor) {
                    break;
                }
                z40 z40Var2 = new z40(0);
                z40Var2.c = i4;
                z40Var2.b = j;
                z40Var2.e = i3;
                z40Var2.f = i2;
                z40Var2.g = i7;
                z40Var2.d = i;
                a50 a50Var3 = new a50(z40Var2);
                int i8 = i7 * 2;
                i21VarArr[i7] = l(l3Var, i21VarArr[i8], i21VarArr[i8 + 1], a50Var3);
                i7++;
                a50Var2 = a50Var3;
            }
            if (i5 % 2 == 1) {
                i21VarArr[(int) Math.floor(d)] = i21VarArr[i5 - 1];
            }
            i5 = (int) Math.ceil(i5 / 2.0d);
            z40 z40Var3 = new z40(0);
            z40Var3.c = i4;
            z40Var3.b = j;
            z40Var3.e = i3;
            z40Var3.f = i2 + 1;
            z40Var3.g = a50Var2.g;
            z40Var3.d = i;
            a50Var2 = new a50(z40Var3);
        }
        return i21VarArr[0];
    }

    public static String h(String str, String str2) {
        int length = str.length() - str2.length();
        if (length >= 0 && length <= 1) {
            StringBuilder sb = new StringBuilder(str2.length() + str.length());
            for (int i = 0; i < str.length(); i++) {
                sb.append(str.charAt(i));
                if (str2.length() > i) {
                    sb.append(str2.charAt(i));
                }
            }
            return sb.toString();
        }
        c.k("Invalid input received");
        return null;
    }

    public static int i(long j) {
        return (int) ((j - (((int) (58728449 * j)) * 8380417)) >>> 32);
    }

    public static TypedArray j(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static PorterDuff.Mode k(int i, PorterDuff.Mode mode) {
        if (i != 3) {
            if (i != 5) {
                if (i != 9) {
                    switch (i) {
                        case 14:
                            return PorterDuff.Mode.MULTIPLY;
                        case 15:
                            return PorterDuff.Mode.SCREEN;
                        case 16:
                            return PorterDuff.Mode.ADD;
                        default:
                            return mode;
                    }
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }

    public static i21 l(l3 l3Var, i21 i21Var, i21 i21Var2, z11 z11Var) {
        z11 z11Var2 = z11Var;
        if (i21Var != null) {
            int i = i21Var.c;
            if (i21Var2 != null) {
                if (i == i21Var2.c) {
                    byte[] bArr = (byte[]) l3Var.e;
                    oq oqVar = (oq) l3Var.d;
                    byte[] e = f20.e(bArr);
                    if (z11Var2 instanceof a50) {
                        a50 a50Var = (a50) z11Var2;
                        z40 z40Var = new z40(0);
                        z40Var.c = a50Var.a;
                        z40Var.b = a50Var.b;
                        z40Var.e = a50Var.e;
                        z40Var.f = a50Var.f;
                        z40Var.g = a50Var.g;
                        z40Var.d = 0;
                        z11Var2 = new a50(z40Var);
                    } else if (z11Var2 instanceof e10) {
                        e10 e10Var = (e10) z11Var2;
                        d10 d10Var = new d10();
                        d10Var.c = e10Var.a;
                        d10Var.b = e10Var.b;
                        d10Var.e = e10Var.e;
                        d10Var.f = e10Var.f;
                        d10Var.d = 0;
                        z11Var2 = new e10(d10Var);
                    }
                    byte[] e2 = oqVar.e(e, z11Var2.a());
                    if (z11Var2 instanceof a50) {
                        a50 a50Var2 = (a50) z11Var2;
                        z40 z40Var2 = new z40(0);
                        z40Var2.c = a50Var2.a;
                        z40Var2.b = a50Var2.b;
                        z40Var2.e = a50Var2.e;
                        z40Var2.f = a50Var2.f;
                        z40Var2.g = a50Var2.g;
                        z40Var2.d = 1;
                        z11Var2 = new a50(z40Var2);
                    } else if (z11Var2 instanceof e10) {
                        e10 e10Var2 = (e10) z11Var2;
                        d10 d10Var2 = new d10();
                        d10Var2.c = e10Var2.a;
                        d10Var2.b = e10Var2.b;
                        d10Var2.e = e10Var2.e;
                        d10Var2.f = e10Var2.f;
                        d10Var2.d = 1;
                        z11Var2 = new e10(d10Var2);
                    }
                    byte[] e3 = oqVar.e(e, z11Var2.a());
                    if (z11Var2 instanceof a50) {
                        a50 a50Var3 = (a50) z11Var2;
                        z40 z40Var3 = new z40(0);
                        z40Var3.c = a50Var3.a;
                        z40Var3.b = a50Var3.b;
                        z40Var3.e = a50Var3.e;
                        z40Var3.f = a50Var3.f;
                        z40Var3.g = a50Var3.g;
                        z40Var3.d = 2;
                        z11Var2 = new a50(z40Var3);
                    } else if (z11Var2 instanceof e10) {
                        e10 e10Var3 = (e10) z11Var2;
                        d10 d10Var3 = new d10();
                        d10Var3.c = e10Var3.a;
                        d10Var3.b = e10Var3.b;
                        d10Var3.e = e10Var3.e;
                        d10Var3.f = e10Var3.f;
                        d10Var3.d = 2;
                        z11Var2 = new e10(d10Var3);
                    }
                    byte[] e4 = oqVar.e(e, z11Var2.a());
                    int i2 = ((qz) l3Var.g).a;
                    int i3 = i2 * 2;
                    byte[] bArr2 = new byte[i3];
                    for (int i4 = 0; i4 < i2; i4++) {
                        bArr2[i4] = (byte) (mi0.e(i21Var.d)[i4] ^ e3[i4]);
                    }
                    for (int i5 = 0; i5 < i2; i5++) {
                        bArr2[i5 + i2] = (byte) (mi0.e(i21Var2.d)[i5] ^ e4[i5]);
                    }
                    int length = e2.length;
                    int i6 = oqVar.b;
                    if (length == i6) {
                        if (i3 == i6 * 2) {
                            return new i21(i, oqVar.f(1, e2, bArr2));
                        }
                        c.k("wrong in length");
                        return null;
                    }
                    c.k("wrong key length");
                    return null;
                }
                c.o("height of both nodes must be equal");
                return null;
            }
            c.g("right == null");
            return null;
        }
        c.g("left == null");
        return null;
    }

    public static void m(byte[] bArr) {
        if (bArr.length == 0) {
        } else {
            throw new us0((short) 47, null, null);
        }
    }

    public static int[] n(byte[] bArr) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        int P = ht0.P(byteArrayInputStream);
        if (P >= 2 && (P & 1) == 0) {
            int i = P / 2;
            int[] iArr = new int[i];
            for (int i2 = 0; i2 < i; i2++) {
                iArr[i2] = ht0.P(byteArrayInputStream);
            }
            ks0.b(byteArrayInputStream);
            return iArr;
        }
        throw new us0((short) 50, null, null);
    }

    public static void o(int i, long j, byte[] bArr) {
        bArr[i] = (byte) (j & 255);
        bArr[i + 1] = (byte) ((j >> 8) & 255);
        bArr[i + 2] = (byte) ((j >> 16) & 255);
        bArr[i + 3] = (byte) ((j >> 24) & 255);
        bArr[i + 4] = (byte) ((j >> 32) & 255);
        bArr[i + 5] = (byte) ((j >> 40) & 255);
        bArr[i + 6] = (byte) ((j >> 48) & 255);
        bArr[i + 7] = (byte) ((j >> 56) & 255);
    }

    public static final void p(Object obj) {
        if (!(obj instanceof sj0)) {
        } else {
            throw ((sj0) obj).c;
        }
    }

    public static boolean v(byte b) {
        if (b > -65) {
            return true;
        }
        return false;
    }

    public abstract long q();

    public abstract void r(ja1 ja1Var, ja1 ja1Var2);

    public abstract void s(ja1 ja1Var, Thread thread);

    public abstract boolean t(na1 na1Var, m81 m81Var, m81 m81Var2);

    public abstract boolean u(na1 na1Var, Object obj, Object obj2);

    public abstract boolean w(na1 na1Var, ja1 ja1Var, ja1 ja1Var2);
}
