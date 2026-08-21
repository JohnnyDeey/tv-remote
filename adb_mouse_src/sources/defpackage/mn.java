package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.SavedStateHandleAttacher;
import com.google.android.material.appbar.MaterialToolbar;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public abstract class mn {
    public static final ce b;
    public static final ce c;
    public static final b8 e;
    public static b8 f;
    public static final og a = new Object();
    public static final char[] d = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final os g = new Object();
    public static final vj0 h = new Object();
    public static final os i = new Object();
    public static final g00 j = new g00(14);
    public static final yk k = new yk(4);

    /* JADX WARN: Type inference failed for: r0v0, types: [og, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [os, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, vj0] */
    /* JADX WARN: Type inference failed for: r0v6, types: [os, java.lang.Object] */
    static {
        int i2 = 2;
        b = new ce("UNDEFINED", i2);
        c = new ce("REUSABLE_CLAIMED", i2);
        Object obj = null;
        e = new b8(obj, obj, obj, 16);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [jz, java.lang.Object, m30] */
    public static final dr A(q30 q30Var, boolean z, n30 n30Var) {
        n30 ugVar;
        if (q30Var instanceof q30) {
            return q30Var.C(z, n30Var);
        }
        boolean k2 = n30Var.k();
        ?? jzVar = new jz(1, n30Var, n30.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, 0);
        if (k2) {
            ugVar = new l20(jzVar);
        } else {
            ugVar = new ug(2, jzVar);
        }
        return q30Var.C(z, ugVar);
    }

    public static boolean B(int i2, Rect rect, Rect rect2) {
        if (i2 != 17) {
            if (i2 != 33) {
                if (i2 != 66) {
                    if (i2 == 130) {
                        int i3 = rect.top;
                        int i4 = rect2.top;
                        if ((i3 < i4 || rect.bottom <= i4) && rect.bottom < rect2.bottom) {
                            return true;
                        }
                    } else {
                        c.k("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        return false;
                    }
                } else {
                    int i5 = rect.left;
                    int i6 = rect2.left;
                    if ((i5 < i6 || rect.right <= i6) && rect.right < rect2.right) {
                        return true;
                    }
                }
            } else {
                int i7 = rect.bottom;
                int i8 = rect2.bottom;
                if ((i7 > i8 || rect.top >= i8) && rect.top > rect2.top) {
                    return true;
                }
            }
        } else {
            int i9 = rect.right;
            int i10 = rect2.right;
            if ((i9 > i10 || rect.left >= i10) && rect.left > rect2.left) {
                return true;
            }
        }
        return false;
    }

    public static int C(int i2, Rect rect, Rect rect2) {
        int i3;
        int i4;
        if (i2 != 17) {
            if (i2 != 33) {
                if (i2 != 66) {
                    if (i2 == 130) {
                        i3 = rect2.top;
                        i4 = rect.bottom;
                    } else {
                        c.k("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        return 0;
                    }
                } else {
                    i3 = rect2.left;
                    i4 = rect.right;
                }
            } else {
                i3 = rect.top;
                i4 = rect2.bottom;
            }
        } else {
            i3 = rect.left;
            i4 = rect2.right;
        }
        return Math.max(0, i3 - i4);
    }

    public static int D(int i2, Rect rect, Rect rect2) {
        if (i2 != 17) {
            if (i2 != 33) {
                if (i2 != 66) {
                    if (i2 != 130) {
                        c.k("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        return 0;
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }

    public static void E(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    public static final Object H(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static boolean K(og0 og0Var, og0 og0Var2) {
        if (og0Var.c.c.length == og0Var2.c.c.length) {
            w8[] j2 = og0Var.j();
            w8[] j3 = og0Var2.j();
            if (j2.length == j3.length) {
                for (int i2 = 0; i2 != j2.length; i2++) {
                    w8 w8Var = j2[i2];
                    w8 w8Var2 = j3[i2];
                    if (w8Var == w8Var2 || (w8Var != null && w8Var2 != null && w8Var.c.m(w8Var2.c) && wv0.m(w8Var.d).equals(wv0.m(w8Var2.d)))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static TypedValue L(Context context, int i2) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i2, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean M(Context context, int i2, boolean z) {
        TypedValue L = L(context, i2);
        if (L != null && L.type == 18) {
            if (L.data != 0) {
                return true;
            }
            return false;
        }
        return z;
    }

    public static TypedValue N(int i2, Context context, String str) {
        TypedValue L = L(context, i2);
        if (L != null) {
            return L;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i2)));
    }

    public static final void O(qk qkVar, Object obj) {
        Object uiVar;
        kw0 kw0Var;
        if (qkVar instanceof vq) {
            vq vqVar = (vq) qkVar;
            gl glVar = vqVar.f;
            rk rkVar = vqVar.g;
            Throwable a2 = tj0.a(obj);
            if (a2 == null) {
                uiVar = obj;
            } else {
                uiVar = new ui(a2, false);
            }
            if (glVar.c(rkVar.d())) {
                vqVar.h = uiVar;
                vqVar.e = 1;
                glVar.b(rkVar.d(), vqVar);
                return;
            }
            pu a3 = tr0.a();
            if (a3.e >= 4294967296L) {
                vqVar.h = uiVar;
                vqVar.e = 1;
                h8 h8Var = a3.g;
                if (h8Var == null) {
                    h8Var = new h8();
                    a3.g = h8Var;
                }
                h8Var.addLast(vqVar);
                return;
            }
            a3.n(true);
            try {
                q30 q30Var = (q30) rkVar.d().h(os.e);
                if (q30Var != null && !q30Var.D()) {
                    vqVar.e(new sj0(q30Var.v()));
                } else {
                    Object obj2 = vqVar.i;
                    dl d2 = rkVar.d();
                    Object c0 = wv0.c0(d2, obj2);
                    if (c0 != wv0.n) {
                        kw0Var = r21.O(rkVar, d2, c0);
                    } else {
                        kw0Var = null;
                    }
                    try {
                        rkVar.e(obj);
                    } finally {
                        if (kw0Var == null || kw0Var.U()) {
                            wv0.W(d2, c0);
                        }
                    }
                }
                do {
                } while (a3.q());
            } finally {
                try {
                    return;
                } finally {
                }
            }
            return;
        }
        qkVar.e(obj);
    }

    public static String P(String str) {
        int hashCode = str.hashCode();
        switch (hashCode) {
            case -2061550653:
                if (!str.equals("kotlin.jvm.internal.DoubleCompanionObject")) {
                    return null;
                }
                return "Companion";
            case -2056817302:
                if (str.equals("java.lang.Integer")) {
                    return "Int";
                }
                return null;
            case -2034166429:
                if (str.equals("java.lang.Cloneable")) {
                    return "Cloneable";
                }
                return null;
            case -1979556166:
                if (str.equals("java.lang.annotation.Annotation")) {
                    return "Annotation";
                }
                return null;
            case -1571515090:
                if (str.equals("java.lang.Comparable")) {
                    return "Comparable";
                }
                return null;
            case -1383349348:
                if (str.equals("java.util.Map")) {
                    return "Map";
                }
                return null;
            case -1383343454:
                if (str.equals("java.util.Set")) {
                    return "Set";
                }
                return null;
            case -1325958191:
                if (str.equals("double")) {
                    return "Double";
                }
                return null;
            case -1182275604:
                if (!str.equals("kotlin.jvm.internal.ByteCompanionObject")) {
                    return null;
                }
                return "Companion";
            case -1062240117:
                if (str.equals("java.lang.CharSequence")) {
                    return "CharSequence";
                }
                return null;
            case -688322466:
                if (str.equals("java.util.Collection")) {
                    return "Collection";
                }
                return null;
            case -527879800:
                if (str.equals("java.lang.Float")) {
                    return "Float";
                }
                return null;
            case -515992664:
                if (str.equals("java.lang.Short")) {
                    return "Short";
                }
                return null;
            case -246476834:
                if (!str.equals("kotlin.jvm.internal.CharCompanionObject")) {
                    return null;
                }
                return "Companion";
            case -207262728:
                if (!str.equals("kotlin.jvm.internal.LongCompanionObject")) {
                    return null;
                }
                return "Companion";
            case -165139126:
                if (str.equals("java.util.Map$Entry")) {
                    return "Entry";
                }
                return null;
            case 104431:
                if (str.equals("int")) {
                    return "Int";
                }
                return null;
            case 3039496:
                if (str.equals("byte")) {
                    return "Byte";
                }
                return null;
            case 3052374:
                if (str.equals("char")) {
                    return "Char";
                }
                return null;
            case 3327612:
                if (str.equals("long")) {
                    return "Long";
                }
                return null;
            case 64711720:
                if (str.equals("boolean")) {
                    return "Boolean";
                }
                return null;
            case 65821278:
                if (str.equals("java.util.List")) {
                    return "List";
                }
                return null;
            case 77230534:
                if (!str.equals("kotlin.jvm.internal.ShortCompanionObject")) {
                    return null;
                }
                return "Companion";
            case 97526364:
                if (str.equals("float")) {
                    return "Float";
                }
                return null;
            case 109413500:
                if (str.equals("short")) {
                    return "Short";
                }
                return null;
            case 155276373:
                if (str.equals("java.lang.Character")) {
                    return "Char";
                }
                return null;
            case 226173651:
                if (!str.equals("kotlin.jvm.internal.EnumCompanionObject")) {
                    return null;
                }
                return "Companion";
            case 344809556:
                if (str.equals("java.lang.Boolean")) {
                    return "Boolean";
                }
                return null;
            case 398507100:
                if (str.equals("java.lang.Byte")) {
                    return "Byte";
                }
                return null;
            case 398585941:
                if (str.equals("java.lang.Enum")) {
                    return "Enum";
                }
                return null;
            case 398795216:
                if (str.equals("java.lang.Long")) {
                    return "Long";
                }
                return null;
            case 482629606:
                if (!str.equals("kotlin.jvm.internal.FloatCompanionObject")) {
                    return null;
                }
                return "Companion";
            case 499831342:
                if (str.equals("java.util.Iterator")) {
                    return "Iterator";
                }
                return null;
            case 577341676:
                if (str.equals("java.util.ListIterator")) {
                    return "ListIterator";
                }
                return null;
            case 599019395:
                if (!str.equals("kotlin.jvm.internal.StringCompanionObject")) {
                    return null;
                }
                return "Companion";
            case 761287205:
                if (str.equals("java.lang.Double")) {
                    return "Double";
                }
                return null;
            case 1052881309:
                if (str.equals("java.lang.Number")) {
                    return "Number";
                }
                return null;
            case 1063877011:
                if (str.equals("java.lang.Object")) {
                    return "Any";
                }
                return null;
            case 1195259493:
                if (str.equals("java.lang.String")) {
                    return "String";
                }
                return null;
            case 1275614662:
                if (str.equals("java.lang.Iterable")) {
                    return "Iterable";
                }
                return null;
            case 1383693018:
                if (!str.equals("kotlin.jvm.internal.BooleanCompanionObject")) {
                    return null;
                }
                return "Companion";
            case 1630335596:
                if (str.equals("java.lang.Throwable")) {
                    return "Throwable";
                }
                return null;
            case 1877171123:
                if (!str.equals("kotlin.jvm.internal.IntCompanionObject")) {
                    return null;
                }
                return "Companion";
            default:
                switch (hashCode) {
                    case -1811142716:
                        if (str.equals("kotlin.jvm.functions.Function10")) {
                            return "Function10";
                        }
                        return null;
                    case -1811142715:
                        if (str.equals("kotlin.jvm.functions.Function11")) {
                            return "Function11";
                        }
                        return null;
                    case -1811142714:
                        if (str.equals("kotlin.jvm.functions.Function12")) {
                            return "Function12";
                        }
                        return null;
                    case -1811142713:
                        if (str.equals("kotlin.jvm.functions.Function13")) {
                            return "Function13";
                        }
                        return null;
                    case -1811142712:
                        if (str.equals("kotlin.jvm.functions.Function14")) {
                            return "Function14";
                        }
                        return null;
                    case -1811142711:
                        if (str.equals("kotlin.jvm.functions.Function15")) {
                            return "Function15";
                        }
                        return null;
                    case -1811142710:
                        if (str.equals("kotlin.jvm.functions.Function16")) {
                            return "Function16";
                        }
                        return null;
                    case -1811142709:
                        if (str.equals("kotlin.jvm.functions.Function17")) {
                            return "Function17";
                        }
                        return null;
                    case -1811142708:
                        if (str.equals("kotlin.jvm.functions.Function18")) {
                            return "Function18";
                        }
                        return null;
                    case -1811142707:
                        if (str.equals("kotlin.jvm.functions.Function19")) {
                            return "Function19";
                        }
                        return null;
                    default:
                        switch (hashCode) {
                            case -1811142685:
                                if (str.equals("kotlin.jvm.functions.Function20")) {
                                    return "Function20";
                                }
                                return null;
                            case -1811142684:
                                if (str.equals("kotlin.jvm.functions.Function21")) {
                                    return "Function21";
                                }
                                return null;
                            case -1811142683:
                                if (str.equals("kotlin.jvm.functions.Function22")) {
                                    return "Function22";
                                }
                                return null;
                            default:
                                switch (hashCode) {
                                    case 80123371:
                                        if (str.equals("kotlin.jvm.functions.Function0")) {
                                            return "Function0";
                                        }
                                        return null;
                                    case 80123372:
                                        if (str.equals("kotlin.jvm.functions.Function1")) {
                                            return "Function1";
                                        }
                                        return null;
                                    case 80123373:
                                        if (str.equals("kotlin.jvm.functions.Function2")) {
                                            return "Function2";
                                        }
                                        return null;
                                    case 80123374:
                                        if (str.equals("kotlin.jvm.functions.Function3")) {
                                            return "Function3";
                                        }
                                        return null;
                                    case 80123375:
                                        if (str.equals("kotlin.jvm.functions.Function4")) {
                                            return "Function4";
                                        }
                                        return null;
                                    case 80123376:
                                        if (str.equals("kotlin.jvm.functions.Function5")) {
                                            return "Function5";
                                        }
                                        return null;
                                    case 80123377:
                                        if (str.equals("kotlin.jvm.functions.Function6")) {
                                            return "Function6";
                                        }
                                        return null;
                                    case 80123378:
                                        if (str.equals("kotlin.jvm.functions.Function7")) {
                                            return "Function7";
                                        }
                                        return null;
                                    case 80123379:
                                        if (str.equals("kotlin.jvm.functions.Function8")) {
                                            return "Function8";
                                        }
                                        return null;
                                    case 80123380:
                                        if (str.equals("kotlin.jvm.functions.Function9")) {
                                            return "Function9";
                                        }
                                        return null;
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    public static String Q(Exception exc) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        exc.printStackTrace(printWriter);
        printWriter.flush();
        String stringWriter2 = stringWriter.toString();
        stringWriter2.getClass();
        return stringWriter2;
    }

    public static x R(s sVar, String str) {
        if (str.length() != 0 && str.charAt(0) == '#') {
            try {
                int length = (str.length() - 1) / 2;
                byte[] bArr = new byte[length];
                for (int i2 = 0; i2 != length; i2++) {
                    int i3 = i2 * 2;
                    char charAt = str.charAt(i3 + 1);
                    bArr[i2] = (byte) (wv0.s(str.charAt(i3 + 2)) | (wv0.s(charAt) << 4));
                }
                return x.n(bArr);
            } catch (IOException unused) {
                throw new w("can't recode value for oid " + sVar.t(), 0);
            }
        }
        if (str.length() != 0 && str.charAt(0) == '\\') {
            str = str.substring(1);
        }
        if (!sVar.m(ib.s) && !sVar.m(ib.t)) {
            if (sVar.m(ib.q)) {
                return new m(str);
            }
            if (!sVar.m(ib.n) && !sVar.m(ib.o) && !sVar.m(ib.p) && !sVar.m(ib.r) && !sVar.m(ib.u)) {
                return new rm(yp0.e(str));
            }
            return new mm(str);
        }
        return new hm(str);
    }

    public static final String S(qk qkVar) {
        Object sj0Var;
        if (qkVar instanceof vq) {
            return ((vq) qkVar).toString();
        }
        try {
            sj0Var = qkVar + '@' + r(qkVar);
        } catch (Throwable th) {
            sj0Var = new sj0(th);
        }
        if (tj0.a(sj0Var) != null) {
            sj0Var = qkVar.getClass().getName() + '@' + r(qkVar);
        }
        return (String) sj0Var;
    }

    public static byte[] T(BigInteger bigInteger) {
        int i2;
        byte[] bArr = new byte[256];
        byte[] byteArray = bigInteger.toByteArray();
        byteArray.getClass();
        if (byteArray.length != 0 && byteArray[0] == 0) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        int length = byteArray.length - i2;
        for (int i3 = 0; i3 < length && i3 < 256; i3++) {
            bArr[i3] = byteArray[(byteArray.length - 1) - i3];
        }
        return bArr;
    }

    public static boolean U(int i2, int i3, int i4, int i5) {
        boolean z;
        boolean z2;
        if (i4 != 1 && i4 != 2 && (i4 != 4 || i2 == 2)) {
            z = false;
        } else {
            z = true;
        }
        if (i5 != 1 && i5 != 2 && (i5 != 4 || i3 == 2)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z || z2) {
            return true;
        }
        return false;
    }

    public static void V(ByteArrayOutputStream byteArrayOutputStream, int i2) {
        byteArrayOutputStream.write(i2 & 255);
        byteArrayOutputStream.write((i2 >> 8) & 255);
        byteArrayOutputStream.write((i2 >> 16) & 255);
        byteArrayOutputStream.write((i2 >> 24) & 255);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01be A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01c5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0105 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02d3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0168 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v26, types: [java.io.OutputStream, java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r7v27, types: [int] */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v33, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v51 */
    /* JADX WARN: Type inference failed for: r7v52 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void W(android.content.Context r18, java.util.concurrent.Executor r19, defpackage.mf0 r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 741
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mn.W(android.content.Context, java.util.concurrent.Executor, mf0, boolean):void");
    }

    public static void a(Throwable th, Throwable th2) {
        th.getClass();
        th2.getClass();
        if (th != th2) {
            Integer num = p20.a;
            if (num != null && num.intValue() < 19) {
                Method method = be0.a;
                if (method != null) {
                    method.invoke(th, th2);
                    return;
                }
                return;
            }
            th.addSuppressed(th2);
        }
    }

    public static boolean b(v11 v11Var, v11 v11Var2) {
        og0[] og0VarArr = v11Var.f;
        if (og0VarArr.length == v11Var2.f.length) {
            og0[] og0VarArr2 = (og0[]) og0VarArr.clone();
            og0[] og0VarArr3 = (og0[]) v11Var2.f.clone();
            w8 i2 = og0VarArr2[0].i();
            w8 i3 = og0VarArr3[0].i();
            boolean z = (i2 != null && i3 != null) ? !i2.c.m(i3.c) : false;
            for (int i4 = 0; i4 != og0VarArr2.length; i4++) {
                og0 og0Var = og0VarArr2[i4];
                if (z) {
                    for (int length = og0VarArr3.length - 1; length >= 0; length--) {
                        og0 og0Var2 = og0VarArr3[length];
                        if (og0Var2 != null && K(og0Var, og0Var2)) {
                            og0VarArr3[length] = null;
                        }
                    }
                } else {
                    for (int i5 = 0; i5 != og0VarArr3.length; i5++) {
                        og0 og0Var3 = og0VarArr3[i5];
                        if (og0Var3 != null && K(og0Var, og0Var3)) {
                            og0VarArr3[i5] = null;
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        if (r10.bottom <= r12.top) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0071, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
    
        if (r9 == 17) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
    
        if (r9 != 66) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:
    
        r11 = C(r9, r10, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004a, code lost:
    
        if (r9 == 17) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004c, code lost:
    
        if (r9 == 33) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004e, code lost:
    
        if (r9 == 66) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
    
        if (r9 != 130) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
    
        r9 = r12.bottom;
        r10 = r10.bottom;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006f, code lost:
    
        if (r11 >= java.lang.Math.max(1, r9 - r10)) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0058, code lost:
    
        defpackage.c.k("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
    
        r9 = r12.right;
        r10 = r10.right;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0061, code lost:
    
        r9 = r10.top;
        r10 = r12.top;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0066, code lost:
    
        r9 = r10.left;
        r10 = r12.left;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0031, code lost:
    
        if (r10.right <= r12.left) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0038, code lost:
    
        if (r10.top >= r12.bottom) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x003f, code lost:
    
        if (r10.left >= r12.right) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean c(int r9, android.graphics.Rect r10, android.graphics.Rect r11, android.graphics.Rect r12) {
        /*
            boolean r0 = d(r9, r10, r11)
            boolean r1 = d(r9, r10, r12)
            r2 = 0
            if (r1 != 0) goto L72
            if (r0 != 0) goto Lf
            goto L72
        Lf:
            java.lang.String r0 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1 = 130(0x82, float:1.82E-43)
            r3 = 33
            r4 = 66
            r5 = 17
            r6 = 1
            if (r9 == r5) goto L3b
            if (r9 == r3) goto L34
            if (r9 == r4) goto L2d
            if (r9 != r1) goto L29
            int r7 = r10.bottom
            int r8 = r12.top
            if (r7 > r8) goto L71
            goto L41
        L29:
            defpackage.c.k(r0)
            return r2
        L2d:
            int r7 = r10.right
            int r8 = r12.left
            if (r7 > r8) goto L71
            goto L41
        L34:
            int r7 = r10.top
            int r8 = r12.bottom
            if (r7 < r8) goto L71
            goto L41
        L3b:
            int r7 = r10.left
            int r8 = r12.right
            if (r7 < r8) goto L71
        L41:
            if (r9 == r5) goto L71
            if (r9 != r4) goto L46
            goto L71
        L46:
            int r11 = C(r9, r10, r11)
            if (r9 == r5) goto L66
            if (r9 == r3) goto L61
            if (r9 == r4) goto L5c
            if (r9 != r1) goto L58
            int r9 = r12.bottom
            int r10 = r10.bottom
        L56:
            int r9 = r9 - r10
            goto L6b
        L58:
            defpackage.c.k(r0)
            return r2
        L5c:
            int r9 = r12.right
            int r10 = r10.right
            goto L56
        L61:
            int r9 = r10.top
            int r10 = r12.top
            goto L56
        L66:
            int r9 = r10.left
            int r10 = r12.left
            goto L56
        L6b:
            int r9 = java.lang.Math.max(r6, r9)
            if (r11 >= r9) goto L72
        L71:
            return r6
        L72:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mn.c(int, android.graphics.Rect, android.graphics.Rect, android.graphics.Rect):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0033 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean d(int r2, android.graphics.Rect r3, android.graphics.Rect r4) {
        /*
            r0 = 17
            r1 = 0
            if (r2 == r0) goto L25
            r0 = 33
            if (r2 == r0) goto L18
            r0 = 66
            if (r2 == r0) goto L25
            r0 = 130(0x82, float:1.82E-43)
            if (r2 != r0) goto L12
            goto L18
        L12:
            java.lang.String r2 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            defpackage.c.k(r2)
            return r1
        L18:
            int r2 = r4.right
            int r0 = r3.left
            if (r2 < r0) goto L33
            int r2 = r4.left
            int r3 = r3.right
            if (r2 > r3) goto L33
            goto L31
        L25:
            int r2 = r4.bottom
            int r0 = r3.top
            if (r2 < r0) goto L33
            int r2 = r4.top
            int r3 = r3.bottom
            if (r2 > r3) goto L33
        L31:
            r2 = 1
            return r2
        L33:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mn.d(int, android.graphics.Rect, android.graphics.Rect):boolean");
    }

    public static final void e(dl dlVar, CancellationException cancellationException) {
        q30 q30Var = (q30) dlVar.h(os.e);
        if (q30Var != null) {
            q30Var.j(cancellationException);
        }
    }

    public static void i(String str, boolean z) {
        if (z) {
            return;
        }
        c.k(str);
    }

    public static void j(int i2) {
        if (i2 >= 0) {
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static void k(Object obj, String str) {
        if (obj != null) {
            return;
        }
        c.g(str);
    }

    public static float l(float f2, float f3, float f4) {
        if (f2 < f3) {
            return f3;
        }
        if (f2 > f4) {
            return f4;
        }
        return f2;
    }

    public static int m(int i2, int i3, int i4) {
        if (i2 < i3) {
            return i3;
        }
        if (i2 > i4) {
            return i4;
        }
        return i2;
    }

    public static final void n(yl0 yl0Var) {
        xl0 xl0Var;
        m50 m50Var = yl0Var.e().d;
        if (m50Var != m50.d && m50Var != m50.e) {
            c.k("Failed requirement.");
            return;
        }
        l5 a2 = yl0Var.a();
        a2.getClass();
        Iterator it = ((sl0) a2.f).iterator();
        while (true) {
            ol0 ol0Var = (ol0) it;
            if (ol0Var.hasNext()) {
                Map.Entry entry = (Map.Entry) ol0Var.next();
                entry.getClass();
                String str = (String) entry.getKey();
                xl0Var = (xl0) entry.getValue();
                if (k20.c(str, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                    break;
                }
            } else {
                xl0Var = null;
                break;
            }
        }
        if (xl0Var == null) {
            tl0 tl0Var = new tl0(yl0Var.a(), (bz0) yl0Var);
            yl0Var.a().e("androidx.lifecycle.internal.SavedStateHandlesProvider", tl0Var);
            yl0Var.e().a(new SavedStateHandleAttacher(tl0Var));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [c01, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v5, types: [c01, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    public static c01 o(ak akVar, int i2, ArrayList arrayList, c01 c01Var) {
        int i3;
        int i4;
        if (i2 == 0) {
            i3 = akVar.n0;
        } else {
            i3 = akVar.o0;
        }
        int i5 = 0;
        if (i3 != -1 && (c01Var == 0 || i3 != c01Var.b)) {
            int i6 = 0;
            while (true) {
                if (i6 >= arrayList.size()) {
                    break;
                }
                c01 c01Var2 = (c01) arrayList.get(i6);
                if (c01Var2.b == i3) {
                    if (c01Var != 0) {
                        c01Var.c(i2, c01Var2);
                        arrayList.remove((Object) c01Var);
                    }
                    c01Var = c01Var2;
                } else {
                    i6++;
                }
            }
        } else if (i3 != -1) {
            return c01Var;
        }
        c01 c01Var3 = c01Var;
        if (c01Var == 0) {
            if (akVar instanceof g10) {
                g10 g10Var = (g10) akVar;
                int i7 = 0;
                while (true) {
                    if (i7 < g10Var.r0) {
                        ak akVar2 = g10Var.q0[i7];
                        if ((i2 == 0 && (i4 = akVar2.n0) != -1) || (i2 == 1 && (i4 = akVar2.o0) != -1)) {
                            break;
                        }
                        i7++;
                    } else {
                        i4 = -1;
                        break;
                    }
                }
                if (i4 != -1) {
                    int i8 = 0;
                    while (true) {
                        if (i8 >= arrayList.size()) {
                            break;
                        }
                        c01 c01Var4 = (c01) arrayList.get(i8);
                        if (c01Var4.b == i4) {
                            c01Var = c01Var4;
                            break;
                        }
                        i8++;
                    }
                }
            }
            if (c01Var == 0) {
                c01Var = new Object();
                c01Var.a = new ArrayList();
                c01Var.d = null;
                c01Var.e = -1;
                int i9 = c01.f;
                c01.f = i9 + 1;
                c01Var.b = i9;
                c01Var.c = i2;
            }
            arrayList.add(c01Var);
            c01Var3 = c01Var;
        }
        ArrayList arrayList2 = c01Var3.a;
        if (arrayList2.contains(akVar)) {
            return c01Var3;
        }
        arrayList2.add(akVar);
        if (akVar instanceof p00) {
            p00 p00Var = (p00) akVar;
            mj mjVar = p00Var.t0;
            if (p00Var.u0 == 0) {
                i5 = 1;
            }
            mjVar.c(i5, c01Var3, arrayList);
        }
        int i10 = c01Var3.b;
        if (i2 == 0) {
            akVar.n0 = i10;
            akVar.I.c(i2, c01Var3, arrayList);
            akVar.K.c(i2, c01Var3, arrayList);
        } else {
            akVar.o0 = i10;
            akVar.J.c(i2, c01Var3, arrayList);
            akVar.M.c(i2, c01Var3, arrayList);
            akVar.L.c(i2, c01Var3, arrayList);
        }
        akVar.P.c(i2, c01Var3, arrayList);
        return c01Var3;
    }

    public static v40 p(y40 y40Var, r40 r40Var, int i2, byte[] bArr, byte[] bArr2) {
        if (bArr2 != null && bArr2.length >= y40Var.b) {
            return new v40(y40Var, r40Var, i2, bArr, 1 << y40Var.c, bArr2);
        }
        f40.h("root seed is less than ", y40Var.b);
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0047, code lost:
    
        if (r5.c == r8.hashCode()) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.res.ColorStateList q(android.content.Context r8, int r9) {
        /*
            android.content.res.Resources r0 = r8.getResources()
            android.content.res.Resources$Theme r8 = r8.getTheme()
            nj0 r1 = new nj0
            r1.<init>(r0, r8)
            java.lang.Object r2 = defpackage.pj0.c
            monitor-enter(r2)
            java.util.WeakHashMap r3 = defpackage.pj0.b     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r3 = r3.get(r1)     // Catch: java.lang.Throwable -> L3c
            android.util.SparseArray r3 = (android.util.SparseArray) r3     // Catch: java.lang.Throwable -> L3c
            r4 = 0
            if (r3 == 0) goto L50
            int r5 = r3.size()     // Catch: java.lang.Throwable -> L3c
            if (r5 <= 0) goto L50
            java.lang.Object r5 = r3.get(r9)     // Catch: java.lang.Throwable -> L3c
            mj0 r5 = (defpackage.mj0) r5     // Catch: java.lang.Throwable -> L3c
            if (r5 == 0) goto L50
            android.content.res.Configuration r6 = r5.b     // Catch: java.lang.Throwable -> L3c
            android.content.res.Configuration r7 = r0.getConfiguration()     // Catch: java.lang.Throwable -> L3c
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Throwable -> L3c
            if (r6 == 0) goto L4d
            if (r8 != 0) goto L3f
            int r6 = r5.c     // Catch: java.lang.Throwable -> L3c
            if (r6 == 0) goto L49
            goto L3f
        L3c:
            r8 = move-exception
            goto Lb8
        L3f:
            if (r8 == 0) goto L4d
            int r6 = r5.c     // Catch: java.lang.Throwable -> L3c
            int r7 = r8.hashCode()     // Catch: java.lang.Throwable -> L3c
            if (r6 != r7) goto L4d
        L49:
            android.content.res.ColorStateList r3 = r5.a     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            goto L52
        L4d:
            r3.remove(r9)     // Catch: java.lang.Throwable -> L3c
        L50:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            r3 = r4
        L52:
            if (r3 == 0) goto L55
            return r3
        L55:
            java.lang.ThreadLocal r2 = defpackage.pj0.a
            java.lang.Object r3 = r2.get()
            android.util.TypedValue r3 = (android.util.TypedValue) r3
            if (r3 != 0) goto L67
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            r2.set(r3)
        L67:
            r2 = 1
            r0.getValue(r9, r3, r2)
            int r2 = r3.type
            r3 = 28
            if (r2 < r3) goto L76
            r3 = 31
            if (r2 > r3) goto L76
            goto L87
        L76:
            android.content.res.XmlResourceParser r2 = r0.getXml(r9)
            android.content.res.ColorStateList r4 = defpackage.ni.a(r0, r2, r8)     // Catch: java.lang.Exception -> L7f
            goto L87
        L7f:
            r2 = move-exception
            java.lang.String r3 = "ResourcesCompat"
            java.lang.String r5 = "Failed to inflate ColorStateList, leaving it to the framework"
            android.util.Log.w(r3, r5, r2)
        L87:
            if (r4 == 0) goto Lb3
            java.lang.Object r2 = defpackage.pj0.c
            monitor-enter(r2)
            java.util.WeakHashMap r0 = defpackage.pj0.b     // Catch: java.lang.Throwable -> L9f
            java.lang.Object r3 = r0.get(r1)     // Catch: java.lang.Throwable -> L9f
            android.util.SparseArray r3 = (android.util.SparseArray) r3     // Catch: java.lang.Throwable -> L9f
            if (r3 != 0) goto La1
            android.util.SparseArray r3 = new android.util.SparseArray     // Catch: java.lang.Throwable -> L9f
            r3.<init>()     // Catch: java.lang.Throwable -> L9f
            r0.put(r1, r3)     // Catch: java.lang.Throwable -> L9f
            goto La1
        L9f:
            r8 = move-exception
            goto Lb1
        La1:
            mj0 r0 = new mj0     // Catch: java.lang.Throwable -> L9f
            android.content.res.Resources r1 = r1.a     // Catch: java.lang.Throwable -> L9f
            android.content.res.Configuration r1 = r1.getConfiguration()     // Catch: java.lang.Throwable -> L9f
            r0.<init>(r4, r1, r8)     // Catch: java.lang.Throwable -> L9f
            r3.append(r9, r0)     // Catch: java.lang.Throwable -> L9f
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L9f
            goto Lb7
        Lb1:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L9f
            throw r8
        Lb3:
            android.content.res.ColorStateList r4 = r0.getColorStateList(r9, r8)
        Lb7:
            return r4
        Lb8:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mn.q(android.content.Context, int):android.content.res.ColorStateList");
    }

    public static final String r(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final ff s(qk qkVar) {
        ff ffVar;
        ff ffVar2;
        if (!(qkVar instanceof vq)) {
            return new ff(qkVar, 1);
        }
        vq vqVar = (vq) qkVar;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = vq.j;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(vqVar);
            ffVar = null;
            ce ceVar = c;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(vqVar, ceVar);
                ffVar2 = null;
                break;
            }
            if (obj instanceof ff) {
                while (!atomicReferenceFieldUpdater.compareAndSet(vqVar, obj, ceVar)) {
                    if (atomicReferenceFieldUpdater.get(vqVar) != obj) {
                        break;
                    }
                }
                ffVar2 = (ff) obj;
                break loop0;
            }
            if (obj != ceVar && !(obj instanceof Throwable)) {
                c.t(obj, "Inconsistent state ");
                return null;
            }
        }
        if (ffVar2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = ff.i;
            Object obj2 = atomicReferenceFieldUpdater2.get(ffVar2);
            if ((obj2 instanceof si) && ((si) obj2).d != null) {
                ffVar2.p();
            } else {
                ff.h.set(ffVar2, 536870911);
                atomicReferenceFieldUpdater2.set(ffVar2, w2.a);
                ffVar = ffVar2;
            }
            if (ffVar != null) {
                return ffVar;
            }
        }
        return new ff(qkVar, 2);
    }

    public static Intent t(f5 f5Var) {
        Intent parentActivityIntent = f5Var.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        try {
            String v = v(f5Var, f5Var.getComponentName());
            if (v == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(f5Var, v);
            try {
                if (v(f5Var, componentName) == null) {
                    return Intent.makeMainActivity(componentName);
                }
                return new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + v + "' in manifest");
                return null;
            }
        } catch (PackageManager.NameNotFoundException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public static Intent u(f5 f5Var, ComponentName componentName) {
        String v = v(f5Var, componentName);
        if (v == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), v);
        if (v(f5Var, componentName2) == null) {
            return Intent.makeMainActivity(componentName2);
        }
        return new Intent().setComponent(componentName2);
    }

    public static String v(Context context, ComponentName componentName) {
        int i2;
        String string;
        PackageManager packageManager = context.getPackageManager();
        if (Build.VERSION.SDK_INT >= 29) {
            i2 = 269222528;
        } else {
            i2 = 787072;
        }
        ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, i2);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) == '.') {
            return context.getPackageName() + string;
        }
        return string;
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0007, code lost:
    
        r3 = r3.getRoundedCorner(r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.yj0 w(android.view.Display r3, int r4) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            r2 = 0
            if (r0 < r1) goto L36
            android.view.RoundedCorner r3 = defpackage.wd.n(r3, r4)
            if (r3 == 0) goto L36
            yj0 r4 = new yj0
            int r0 = defpackage.wd.t(r3)
            if (r0 == 0) goto L29
            r1 = 1
            if (r0 == r1) goto L2a
            r1 = 2
            if (r0 == r1) goto L2a
            r1 = 3
            if (r0 != r1) goto L1f
            goto L2a
        L1f:
            java.lang.String r3 = "Invalid position: "
            java.lang.String r3 = defpackage.qo0.m(r3, r0)
            defpackage.c.k(r3)
            return r2
        L29:
            r1 = 0
        L2a:
            int r0 = defpackage.wd.v(r3)
            android.graphics.Point r3 = defpackage.wd.f(r3)
            r4.<init>(r1, r0, r3)
            return r4
        L36:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mn.w(android.view.Display, int):yj0");
    }

    public static ArrayList x(MaterialToolbar materialToolbar, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < materialToolbar.getChildCount(); i2++) {
            View childAt = materialToolbar.getChildAt(i2);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }

    public static final void y(dl dlVar, Throwable th) {
        Throwable runtimeException;
        Iterator it = hl.a.iterator();
        while (it.hasNext()) {
            try {
                ((o4) it.next()).b(th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    a(runtimeException, th);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
            }
        }
        try {
            a(th, new gq(dlVar));
        } catch (Throwable unused) {
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }

    public static final int z(p8 p8Var, Object obj, int i2) {
        int i3 = p8Var.e;
        if (i3 == 0) {
            return -1;
        }
        try {
            int k2 = wv0.k(i3, i2, p8Var.c);
            if (k2 < 0 || k20.c(obj, p8Var.d[k2])) {
                return k2;
            }
            int i4 = k2 + 1;
            while (i4 < i3 && p8Var.c[i4] == i2) {
                if (k20.c(obj, p8Var.d[i4])) {
                    return i4;
                }
                i4++;
            }
            for (int i5 = k2 - 1; i5 >= 0 && p8Var.c[i5] == i2; i5--) {
                if (k20.c(obj, p8Var.d[i5])) {
                    return i5;
                }
            }
            return ~i4;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public abstract void F(Throwable th);

    public abstract void G(l3 l3Var);

    public abstract void I(z0 z0Var, z0 z0Var2);

    public abstract void J(z0 z0Var, Thread thread);

    public abstract boolean f(a1 a1Var, w0 w0Var);

    public abstract boolean g(a1 a1Var, Object obj, Object obj2);

    public abstract boolean h(a1 a1Var, z0 z0Var, z0 z0Var2);
}
