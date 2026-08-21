package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class zj {
    public static final int[] d = {0, 4, 8};
    public static final SparseIntArray e;
    public static final SparseIntArray f;
    public final HashMap a = new HashMap();
    public final boolean b = true;
    public final HashMap c = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        e = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f = sparseIntArray2;
        sparseIntArray.append(82, 25);
        sparseIntArray.append(83, 26);
        sparseIntArray.append(85, 29);
        sparseIntArray.append(86, 30);
        sparseIntArray.append(92, 36);
        sparseIntArray.append(91, 35);
        sparseIntArray.append(63, 4);
        sparseIntArray.append(62, 3);
        sparseIntArray.append(58, 1);
        sparseIntArray.append(60, 91);
        sparseIntArray.append(59, 92);
        sparseIntArray.append(101, 6);
        sparseIntArray.append(102, 7);
        sparseIntArray.append(70, 17);
        sparseIntArray.append(71, 18);
        sparseIntArray.append(72, 19);
        sparseIntArray.append(54, 99);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(87, 32);
        sparseIntArray.append(88, 33);
        sparseIntArray.append(69, 10);
        sparseIntArray.append(68, 9);
        sparseIntArray.append(106, 13);
        sparseIntArray.append(109, 16);
        sparseIntArray.append(107, 14);
        sparseIntArray.append(104, 11);
        sparseIntArray.append(108, 15);
        sparseIntArray.append(105, 12);
        sparseIntArray.append(95, 40);
        sparseIntArray.append(80, 39);
        sparseIntArray.append(79, 41);
        sparseIntArray.append(94, 42);
        sparseIntArray.append(78, 20);
        sparseIntArray.append(93, 37);
        sparseIntArray.append(67, 5);
        sparseIntArray.append(81, 87);
        sparseIntArray.append(90, 87);
        sparseIntArray.append(84, 87);
        sparseIntArray.append(61, 87);
        sparseIntArray.append(57, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(96, 95);
        sparseIntArray.append(73, 96);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(97, 54);
        sparseIntArray.append(74, 55);
        sparseIntArray.append(98, 56);
        sparseIntArray.append(75, 57);
        sparseIntArray.append(99, 58);
        sparseIntArray.append(76, 59);
        sparseIntArray.append(64, 61);
        sparseIntArray.append(66, 62);
        sparseIntArray.append(65, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(121, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(122, 67);
        sparseIntArray.append(113, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(112, 68);
        sparseIntArray.append(100, 69);
        sparseIntArray.append(77, 70);
        sparseIntArray.append(111, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(114, 76);
        sparseIntArray.append(89, 77);
        sparseIntArray.append(123, 78);
        sparseIntArray.append(56, 80);
        sparseIntArray.append(55, 81);
        sparseIntArray.append(116, 82);
        sparseIntArray.append(120, 83);
        sparseIntArray.append(119, 84);
        sparseIntArray.append(118, 85);
        sparseIntArray.append(117, 86);
        sparseIntArray2.append(85, 6);
        sparseIntArray2.append(85, 7);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(89, 13);
        sparseIntArray2.append(92, 16);
        sparseIntArray2.append(90, 14);
        sparseIntArray2.append(87, 11);
        sparseIntArray2.append(91, 15);
        sparseIntArray2.append(88, 12);
        sparseIntArray2.append(78, 40);
        sparseIntArray2.append(71, 39);
        sparseIntArray2.append(70, 41);
        sparseIntArray2.append(77, 42);
        sparseIntArray2.append(69, 20);
        sparseIntArray2.append(76, 37);
        sparseIntArray2.append(60, 5);
        sparseIntArray2.append(72, 87);
        sparseIntArray2.append(75, 87);
        sparseIntArray2.append(73, 87);
        sparseIntArray2.append(57, 87);
        sparseIntArray2.append(56, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(79, 95);
        sparseIntArray2.append(64, 96);
        sparseIntArray2.append(2, 22);
        sparseIntArray2.append(13, 43);
        sparseIntArray2.append(26, 44);
        sparseIntArray2.append(21, 45);
        sparseIntArray2.append(22, 46);
        sparseIntArray2.append(20, 60);
        sparseIntArray2.append(18, 47);
        sparseIntArray2.append(19, 48);
        sparseIntArray2.append(14, 49);
        sparseIntArray2.append(15, 50);
        sparseIntArray2.append(16, 51);
        sparseIntArray2.append(17, 52);
        sparseIntArray2.append(25, 53);
        sparseIntArray2.append(80, 54);
        sparseIntArray2.append(65, 55);
        sparseIntArray2.append(81, 56);
        sparseIntArray2.append(66, 57);
        sparseIntArray2.append(82, 58);
        sparseIntArray2.append(67, 59);
        sparseIntArray2.append(59, 62);
        sparseIntArray2.append(58, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(105, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(106, 67);
        sparseIntArray2.append(96, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(97, 98);
        sparseIntArray2.append(95, 68);
        sparseIntArray2.append(83, 69);
        sparseIntArray2.append(68, 70);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(98, 76);
        sparseIntArray2.append(74, 77);
        sparseIntArray2.append(107, 78);
        sparseIntArray2.append(55, 80);
        sparseIntArray2.append(54, 81);
        sparseIntArray2.append(100, 82);
        sparseIntArray2.append(104, 83);
        sparseIntArray2.append(103, 84);
        sparseIntArray2.append(102, 85);
        sparseIntArray2.append(101, 86);
        sparseIntArray2.append(94, 97);
    }

    public static int[] c(lc lcVar, String str) {
        int i;
        String[] split = str.split(",");
        Context context = lcVar.getContext();
        int[] iArr = new int[split.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < split.length) {
            String trim = split[i2].trim();
            Object obj = null;
            try {
                i = fg0.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i == 0 && lcVar.isInEditMode() && (lcVar.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) lcVar.getParent();
                if (trim != null) {
                    HashMap hashMap = constraintLayout.o;
                    if (hashMap != null && hashMap.containsKey(trim)) {
                        obj = constraintLayout.o.get(trim);
                    }
                } else {
                    constraintLayout.getClass();
                }
                if (obj != null && (obj instanceof Integer)) {
                    i = ((Integer) obj).intValue();
                }
            }
            iArr[i3] = i;
            i2++;
            i3++;
        }
        if (i3 != split.length) {
            return Arrays.copyOf(iArr, i3);
        }
        return iArr;
    }

    /* JADX WARN: Type inference failed for: r2v192, types: [tj, java.lang.Object] */
    public static uj d(Context context, AttributeSet attributeSet, boolean z) {
        int[] iArr;
        int i;
        int i2;
        uj ujVar = new uj();
        if (z) {
            iArr = gg0.c;
        } else {
            iArr = gg0.a;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        String[] strArr = f20.j;
        xj xjVar = ujVar.b;
        yj yjVar = ujVar.e;
        wj wjVar = ujVar.c;
        vj vjVar = ujVar.d;
        int[] iArr2 = d;
        SparseIntArray sparseIntArray = e;
        if (z) {
            ?? obj = new Object();
            obj.a = new int[10];
            obj.b = new int[10];
            obj.c = 0;
            obj.d = new int[10];
            obj.e = new float[10];
            obj.f = 0;
            obj.g = new int[5];
            obj.h = new String[5];
            obj.i = 0;
            obj.j = new int[4];
            obj.k = new boolean[4];
            obj.l = 0;
            wjVar.getClass();
            vjVar.getClass();
            yjVar.getClass();
            int i3 = 0;
            for (int indexCount = obtainStyledAttributes.getIndexCount(); i3 < indexCount; indexCount = i2) {
                int index = obtainStyledAttributes.getIndex(i3);
                int i4 = i3;
                switch (f.get(index)) {
                    case 2:
                        i2 = indexCount;
                        obj.b(2, obtainStyledAttributes.getDimensionPixelSize(index, vjVar.I));
                        continue;
                    case 3:
                    case 4:
                    case 9:
                    case 10:
                    case 25:
                    case 26:
                    case 29:
                    case 30:
                    case 32:
                    case 33:
                    case 35:
                    case 36:
                    case 61:
                    case 88:
                    case 89:
                    case 90:
                    case 91:
                    case 92:
                    default:
                        StringBuilder sb = new StringBuilder("Unknown attribute 0x");
                        i2 = indexCount;
                        sb.append(Integer.toHexString(index));
                        sb.append("   ");
                        sb.append(sparseIntArray.get(index));
                        Log.w("ConstraintSet", sb.toString());
                        break;
                    case 5:
                        i2 = indexCount;
                        obj.d(obtainStyledAttributes.getString(index), 5);
                        continue;
                    case 6:
                        i2 = indexCount;
                        obj.b(6, obtainStyledAttributes.getDimensionPixelOffset(index, vjVar.C));
                        break;
                    case 7:
                        i2 = indexCount;
                        obj.b(7, obtainStyledAttributes.getDimensionPixelOffset(index, vjVar.D));
                        break;
                    case 8:
                        i2 = indexCount;
                        obj.b(8, obtainStyledAttributes.getDimensionPixelSize(index, vjVar.J));
                        break;
                    case 11:
                        i2 = indexCount;
                        obj.b(11, obtainStyledAttributes.getDimensionPixelSize(index, vjVar.P));
                        break;
                    case 12:
                        i2 = indexCount;
                        obj.b(12, obtainStyledAttributes.getDimensionPixelSize(index, vjVar.Q));
                        break;
                    case 13:
                        i2 = indexCount;
                        obj.b(13, obtainStyledAttributes.getDimensionPixelSize(index, vjVar.M));
                        break;
                    case 14:
                        i2 = indexCount;
                        obj.b(14, obtainStyledAttributes.getDimensionPixelSize(index, vjVar.O));
                        break;
                    case 15:
                        i2 = indexCount;
                        obj.b(15, obtainStyledAttributes.getDimensionPixelSize(index, vjVar.R));
                        break;
                    case 16:
                        i2 = indexCount;
                        obj.b(16, obtainStyledAttributes.getDimensionPixelSize(index, vjVar.N));
                        break;
                    case 17:
                        i2 = indexCount;
                        obj.b(17, obtainStyledAttributes.getDimensionPixelOffset(index, vjVar.d));
                        break;
                    case 18:
                        i2 = indexCount;
                        obj.b(18, obtainStyledAttributes.getDimensionPixelOffset(index, vjVar.e));
                        break;
                    case 19:
                        i2 = indexCount;
                        obj.a(19, obtainStyledAttributes.getFloat(index, vjVar.f));
                        break;
                    case 20:
                        i2 = indexCount;
                        obj.a(20, obtainStyledAttributes.getFloat(index, vjVar.w));
                        break;
                    case 21:
                        i2 = indexCount;
                        obj.b(21, obtainStyledAttributes.getLayoutDimension(index, vjVar.c));
                        break;
                    case 22:
                        i2 = indexCount;
                        obj.b(22, iArr2[obtainStyledAttributes.getInt(index, xjVar.a)]);
                        break;
                    case 23:
                        i2 = indexCount;
                        obj.b(23, obtainStyledAttributes.getLayoutDimension(index, vjVar.b));
                        break;
                    case 24:
                        i2 = indexCount;
                        obj.b(24, obtainStyledAttributes.getDimensionPixelSize(index, vjVar.F));
                        break;
                    case 27:
                        i2 = indexCount;
                        obj.b(27, obtainStyledAttributes.getInt(index, vjVar.E));
                        break;
                    case 28:
                        i2 = indexCount;
                        obj.b(28, obtainStyledAttributes.getDimensionPixelSize(index, vjVar.G));
                        break;
                    case 31:
                        i2 = indexCount;
                        obj.b(31, obtainStyledAttributes.getDimensionPixelSize(index, vjVar.K));
                        break;
                    case 34:
                        i2 = indexCount;
                        obj.b(34, obtainStyledAttributes.getDimensionPixelSize(index, vjVar.H));
                        break;
                    case 37:
                        i2 = indexCount;
                        obj.a(37, obtainStyledAttributes.getFloat(index, vjVar.x));
                        break;
                    case 38:
                        i2 = indexCount;
                        int resourceId = obtainStyledAttributes.getResourceId(index, ujVar.a);
                        ujVar.a = resourceId;
                        obj.b(38, resourceId);
                        break;
                    case 39:
                        i2 = indexCount;
                        obj.a(39, obtainStyledAttributes.getFloat(index, vjVar.U));
                        break;
                    case 40:
                        i2 = indexCount;
                        obj.a(40, obtainStyledAttributes.getFloat(index, vjVar.T));
                        break;
                    case 41:
                        i2 = indexCount;
                        obj.b(41, obtainStyledAttributes.getInt(index, vjVar.V));
                        break;
                    case 42:
                        i2 = indexCount;
                        obj.b(42, obtainStyledAttributes.getInt(index, vjVar.W));
                        break;
                    case 43:
                        i2 = indexCount;
                        obj.a(43, obtainStyledAttributes.getFloat(index, xjVar.c));
                        break;
                    case 44:
                        i2 = indexCount;
                        obj.c(44, true);
                        obj.a(44, obtainStyledAttributes.getDimension(index, yjVar.m));
                        break;
                    case 45:
                        i2 = indexCount;
                        obj.a(45, obtainStyledAttributes.getFloat(index, yjVar.b));
                        break;
                    case 46:
                        i2 = indexCount;
                        obj.a(46, obtainStyledAttributes.getFloat(index, yjVar.c));
                        break;
                    case 47:
                        i2 = indexCount;
                        obj.a(47, obtainStyledAttributes.getFloat(index, yjVar.d));
                        break;
                    case 48:
                        i2 = indexCount;
                        obj.a(48, obtainStyledAttributes.getFloat(index, yjVar.e));
                        break;
                    case 49:
                        i2 = indexCount;
                        obj.a(49, obtainStyledAttributes.getDimension(index, yjVar.f));
                        break;
                    case 50:
                        i2 = indexCount;
                        obj.a(50, obtainStyledAttributes.getDimension(index, yjVar.g));
                        break;
                    case 51:
                        i2 = indexCount;
                        obj.a(51, obtainStyledAttributes.getDimension(index, yjVar.i));
                        break;
                    case 52:
                        i2 = indexCount;
                        obj.a(52, obtainStyledAttributes.getDimension(index, yjVar.j));
                        break;
                    case 53:
                        i2 = indexCount;
                        obj.a(53, obtainStyledAttributes.getDimension(index, yjVar.k));
                        break;
                    case 54:
                        i2 = indexCount;
                        obj.b(54, obtainStyledAttributes.getInt(index, vjVar.X));
                        break;
                    case 55:
                        i2 = indexCount;
                        obj.b(55, obtainStyledAttributes.getInt(index, vjVar.Y));
                        break;
                    case 56:
                        i2 = indexCount;
                        obj.b(56, obtainStyledAttributes.getDimensionPixelSize(index, vjVar.Z));
                        break;
                    case 57:
                        i2 = indexCount;
                        obj.b(57, obtainStyledAttributes.getDimensionPixelSize(index, vjVar.a0));
                        break;
                    case 58:
                        i2 = indexCount;
                        obj.b(58, obtainStyledAttributes.getDimensionPixelSize(index, vjVar.b0));
                        break;
                    case 59:
                        i2 = indexCount;
                        obj.b(59, obtainStyledAttributes.getDimensionPixelSize(index, vjVar.c0));
                        break;
                    case 60:
                        i2 = indexCount;
                        obj.a(60, obtainStyledAttributes.getFloat(index, yjVar.a));
                        break;
                    case 62:
                        i2 = indexCount;
                        obj.b(62, obtainStyledAttributes.getDimensionPixelSize(index, vjVar.A));
                        break;
                    case 63:
                        i2 = indexCount;
                        obj.a(63, obtainStyledAttributes.getFloat(index, vjVar.B));
                        break;
                    case 64:
                        i2 = indexCount;
                        obj.b(64, f(obtainStyledAttributes, index, wjVar.a));
                        break;
                    case 65:
                        i2 = indexCount;
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            obj.d(obtainStyledAttributes.getString(index), 65);
                            break;
                        } else {
                            obj.d(strArr[obtainStyledAttributes.getInteger(index, 0)], 65);
                            break;
                        }
                    case 66:
                        i2 = indexCount;
                        obj.b(66, obtainStyledAttributes.getInt(index, 0));
                        break;
                    case 67:
                        i2 = indexCount;
                        obj.a(67, obtainStyledAttributes.getFloat(index, wjVar.e));
                        break;
                    case 68:
                        i2 = indexCount;
                        obj.a(68, obtainStyledAttributes.getFloat(index, xjVar.d));
                        break;
                    case 69:
                        i2 = indexCount;
                        obj.a(69, obtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case 70:
                        i2 = indexCount;
                        obj.a(70, obtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case 71:
                        i2 = indexCount;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        i2 = indexCount;
                        obj.b(72, obtainStyledAttributes.getInt(index, vjVar.f0));
                        break;
                    case 73:
                        i2 = indexCount;
                        obj.b(73, obtainStyledAttributes.getDimensionPixelSize(index, vjVar.g0));
                        break;
                    case 74:
                        i2 = indexCount;
                        obj.d(obtainStyledAttributes.getString(index), 74);
                        break;
                    case 75:
                        i2 = indexCount;
                        obj.c(75, obtainStyledAttributes.getBoolean(index, vjVar.n0));
                        break;
                    case 76:
                        i2 = indexCount;
                        obj.b(76, obtainStyledAttributes.getInt(index, wjVar.c));
                        break;
                    case 77:
                        i2 = indexCount;
                        obj.d(obtainStyledAttributes.getString(index), 77);
                        break;
                    case 78:
                        i2 = indexCount;
                        obj.b(78, obtainStyledAttributes.getInt(index, xjVar.b));
                        break;
                    case 79:
                        i2 = indexCount;
                        obj.a(79, obtainStyledAttributes.getFloat(index, wjVar.d));
                        break;
                    case 80:
                        i2 = indexCount;
                        obj.c(80, obtainStyledAttributes.getBoolean(index, vjVar.l0));
                        break;
                    case 81:
                        i2 = indexCount;
                        obj.c(81, obtainStyledAttributes.getBoolean(index, vjVar.m0));
                        break;
                    case 82:
                        i2 = indexCount;
                        obj.b(82, obtainStyledAttributes.getInteger(index, wjVar.b));
                        break;
                    case 83:
                        i2 = indexCount;
                        obj.b(83, f(obtainStyledAttributes, index, yjVar.h));
                        break;
                    case 84:
                        i2 = indexCount;
                        obj.b(84, obtainStyledAttributes.getInteger(index, wjVar.g));
                        break;
                    case 85:
                        i2 = indexCount;
                        obj.a(85, obtainStyledAttributes.getFloat(index, wjVar.f));
                        break;
                    case 86:
                        i2 = indexCount;
                        int i5 = obtainStyledAttributes.peekValue(index).type;
                        if (i5 == 1) {
                            int resourceId2 = obtainStyledAttributes.getResourceId(index, -1);
                            wjVar.i = resourceId2;
                            obj.b(89, resourceId2);
                            if (wjVar.i != -1) {
                                obj.b(88, -2);
                                break;
                            }
                        } else if (i5 == 3) {
                            String string = obtainStyledAttributes.getString(index);
                            wjVar.h = string;
                            obj.d(string, 90);
                            if (wjVar.h.indexOf("/") > 0) {
                                int resourceId3 = obtainStyledAttributes.getResourceId(index, -1);
                                wjVar.i = resourceId3;
                                obj.b(89, resourceId3);
                                obj.b(88, -2);
                                break;
                            } else {
                                obj.b(88, -1);
                                break;
                            }
                        } else {
                            obj.b(88, obtainStyledAttributes.getInteger(index, wjVar.i));
                            break;
                        }
                        break;
                    case 87:
                        i2 = indexCount;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                        break;
                    case 93:
                        i2 = indexCount;
                        obj.b(93, obtainStyledAttributes.getDimensionPixelSize(index, vjVar.L));
                        break;
                    case 94:
                        i2 = indexCount;
                        obj.b(94, obtainStyledAttributes.getDimensionPixelSize(index, vjVar.S));
                        break;
                    case 95:
                        i2 = indexCount;
                        g(obj, obtainStyledAttributes, index, 0);
                        break;
                    case 96:
                        i2 = indexCount;
                        g(obj, obtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        i2 = indexCount;
                        obj.b(97, obtainStyledAttributes.getInt(index, vjVar.o0));
                        break;
                    case 98:
                        i2 = indexCount;
                        int i6 = ya0.s;
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            obtainStyledAttributes.getString(index);
                            break;
                        } else {
                            ujVar.a = obtainStyledAttributes.getResourceId(index, ujVar.a);
                            break;
                        }
                    case 99:
                        i2 = indexCount;
                        obj.c(99, obtainStyledAttributes.getBoolean(index, vjVar.g));
                        break;
                }
                i3 = i4 + 1;
            }
        } else {
            int i7 = 0;
            for (int indexCount2 = obtainStyledAttributes.getIndexCount(); i7 < indexCount2; indexCount2 = i) {
                int index2 = obtainStyledAttributes.getIndex(i7);
                if (index2 != 1 && 23 != index2) {
                    if (24 != index2) {
                        wjVar.getClass();
                        vjVar.getClass();
                        yjVar.getClass();
                    }
                }
                switch (sparseIntArray.get(index2)) {
                    case 1:
                        i = indexCount2;
                        vjVar.p = f(obtainStyledAttributes, index2, vjVar.p);
                        continue;
                    case 2:
                        i = indexCount2;
                        vjVar.I = obtainStyledAttributes.getDimensionPixelSize(index2, vjVar.I);
                        continue;
                    case 3:
                        i = indexCount2;
                        vjVar.o = f(obtainStyledAttributes, index2, vjVar.o);
                        continue;
                    case 4:
                        i = indexCount2;
                        vjVar.n = f(obtainStyledAttributes, index2, vjVar.n);
                        continue;
                    case 5:
                        i = indexCount2;
                        vjVar.y = obtainStyledAttributes.getString(index2);
                        continue;
                    case 6:
                        i = indexCount2;
                        vjVar.C = obtainStyledAttributes.getDimensionPixelOffset(index2, vjVar.C);
                        continue;
                    case 7:
                        i = indexCount2;
                        vjVar.D = obtainStyledAttributes.getDimensionPixelOffset(index2, vjVar.D);
                        continue;
                    case 8:
                        i = indexCount2;
                        vjVar.J = obtainStyledAttributes.getDimensionPixelSize(index2, vjVar.J);
                        continue;
                    case 9:
                        i = indexCount2;
                        vjVar.v = f(obtainStyledAttributes, index2, vjVar.v);
                        continue;
                    case 10:
                        i = indexCount2;
                        vjVar.u = f(obtainStyledAttributes, index2, vjVar.u);
                        continue;
                    case 11:
                        i = indexCount2;
                        vjVar.P = obtainStyledAttributes.getDimensionPixelSize(index2, vjVar.P);
                        continue;
                    case 12:
                        i = indexCount2;
                        vjVar.Q = obtainStyledAttributes.getDimensionPixelSize(index2, vjVar.Q);
                        continue;
                    case 13:
                        i = indexCount2;
                        vjVar.M = obtainStyledAttributes.getDimensionPixelSize(index2, vjVar.M);
                        continue;
                    case 14:
                        i = indexCount2;
                        vjVar.O = obtainStyledAttributes.getDimensionPixelSize(index2, vjVar.O);
                        continue;
                    case 15:
                        i = indexCount2;
                        vjVar.R = obtainStyledAttributes.getDimensionPixelSize(index2, vjVar.R);
                        continue;
                    case 16:
                        i = indexCount2;
                        vjVar.N = obtainStyledAttributes.getDimensionPixelSize(index2, vjVar.N);
                        continue;
                    case 17:
                        i = indexCount2;
                        vjVar.d = obtainStyledAttributes.getDimensionPixelOffset(index2, vjVar.d);
                        continue;
                    case 18:
                        i = indexCount2;
                        vjVar.e = obtainStyledAttributes.getDimensionPixelOffset(index2, vjVar.e);
                        continue;
                    case 19:
                        i = indexCount2;
                        vjVar.f = obtainStyledAttributes.getFloat(index2, vjVar.f);
                        continue;
                    case 20:
                        i = indexCount2;
                        vjVar.w = obtainStyledAttributes.getFloat(index2, vjVar.w);
                        continue;
                    case 21:
                        i = indexCount2;
                        vjVar.c = obtainStyledAttributes.getLayoutDimension(index2, vjVar.c);
                        continue;
                    case 22:
                        i = indexCount2;
                        int i8 = obtainStyledAttributes.getInt(index2, xjVar.a);
                        xjVar.a = i8;
                        xjVar.a = iArr2[i8];
                        continue;
                    case 23:
                        i = indexCount2;
                        vjVar.b = obtainStyledAttributes.getLayoutDimension(index2, vjVar.b);
                        continue;
                    case 24:
                        i = indexCount2;
                        vjVar.F = obtainStyledAttributes.getDimensionPixelSize(index2, vjVar.F);
                        continue;
                    case 25:
                        i = indexCount2;
                        vjVar.h = f(obtainStyledAttributes, index2, vjVar.h);
                        continue;
                    case 26:
                        i = indexCount2;
                        vjVar.i = f(obtainStyledAttributes, index2, vjVar.i);
                        continue;
                    case 27:
                        i = indexCount2;
                        vjVar.E = obtainStyledAttributes.getInt(index2, vjVar.E);
                        continue;
                    case 28:
                        i = indexCount2;
                        vjVar.G = obtainStyledAttributes.getDimensionPixelSize(index2, vjVar.G);
                        continue;
                    case 29:
                        i = indexCount2;
                        vjVar.j = f(obtainStyledAttributes, index2, vjVar.j);
                        continue;
                    case 30:
                        i = indexCount2;
                        vjVar.k = f(obtainStyledAttributes, index2, vjVar.k);
                        continue;
                    case 31:
                        i = indexCount2;
                        vjVar.K = obtainStyledAttributes.getDimensionPixelSize(index2, vjVar.K);
                        continue;
                    case 32:
                        i = indexCount2;
                        vjVar.s = f(obtainStyledAttributes, index2, vjVar.s);
                        continue;
                    case 33:
                        i = indexCount2;
                        vjVar.t = f(obtainStyledAttributes, index2, vjVar.t);
                        continue;
                    case 34:
                        i = indexCount2;
                        vjVar.H = obtainStyledAttributes.getDimensionPixelSize(index2, vjVar.H);
                        continue;
                    case 35:
                        i = indexCount2;
                        vjVar.m = f(obtainStyledAttributes, index2, vjVar.m);
                        continue;
                    case 36:
                        i = indexCount2;
                        vjVar.l = f(obtainStyledAttributes, index2, vjVar.l);
                        continue;
                    case 37:
                        i = indexCount2;
                        vjVar.x = obtainStyledAttributes.getFloat(index2, vjVar.x);
                        continue;
                    case 38:
                        i = indexCount2;
                        ujVar.a = obtainStyledAttributes.getResourceId(index2, ujVar.a);
                        continue;
                    case 39:
                        i = indexCount2;
                        vjVar.U = obtainStyledAttributes.getFloat(index2, vjVar.U);
                        continue;
                    case 40:
                        i = indexCount2;
                        vjVar.T = obtainStyledAttributes.getFloat(index2, vjVar.T);
                        continue;
                    case 41:
                        i = indexCount2;
                        vjVar.V = obtainStyledAttributes.getInt(index2, vjVar.V);
                        continue;
                    case 42:
                        i = indexCount2;
                        vjVar.W = obtainStyledAttributes.getInt(index2, vjVar.W);
                        continue;
                    case 43:
                        i = indexCount2;
                        xjVar.c = obtainStyledAttributes.getFloat(index2, xjVar.c);
                        continue;
                    case 44:
                        i = indexCount2;
                        yjVar.l = true;
                        yjVar.m = obtainStyledAttributes.getDimension(index2, yjVar.m);
                        continue;
                    case 45:
                        i = indexCount2;
                        yjVar.b = obtainStyledAttributes.getFloat(index2, yjVar.b);
                        continue;
                    case 46:
                        i = indexCount2;
                        yjVar.c = obtainStyledAttributes.getFloat(index2, yjVar.c);
                        continue;
                    case 47:
                        i = indexCount2;
                        yjVar.d = obtainStyledAttributes.getFloat(index2, yjVar.d);
                        continue;
                    case 48:
                        i = indexCount2;
                        yjVar.e = obtainStyledAttributes.getFloat(index2, yjVar.e);
                        continue;
                    case 49:
                        i = indexCount2;
                        yjVar.f = obtainStyledAttributes.getDimension(index2, yjVar.f);
                        continue;
                    case 50:
                        i = indexCount2;
                        yjVar.g = obtainStyledAttributes.getDimension(index2, yjVar.g);
                        continue;
                    case 51:
                        i = indexCount2;
                        yjVar.i = obtainStyledAttributes.getDimension(index2, yjVar.i);
                        continue;
                    case 52:
                        i = indexCount2;
                        yjVar.j = obtainStyledAttributes.getDimension(index2, yjVar.j);
                        continue;
                    case 53:
                        i = indexCount2;
                        yjVar.k = obtainStyledAttributes.getDimension(index2, yjVar.k);
                        continue;
                    case 54:
                        i = indexCount2;
                        vjVar.X = obtainStyledAttributes.getInt(index2, vjVar.X);
                        continue;
                    case 55:
                        i = indexCount2;
                        vjVar.Y = obtainStyledAttributes.getInt(index2, vjVar.Y);
                        continue;
                    case 56:
                        i = indexCount2;
                        vjVar.Z = obtainStyledAttributes.getDimensionPixelSize(index2, vjVar.Z);
                        continue;
                    case 57:
                        i = indexCount2;
                        vjVar.a0 = obtainStyledAttributes.getDimensionPixelSize(index2, vjVar.a0);
                        continue;
                    case 58:
                        i = indexCount2;
                        vjVar.b0 = obtainStyledAttributes.getDimensionPixelSize(index2, vjVar.b0);
                        continue;
                    case 59:
                        i = indexCount2;
                        vjVar.c0 = obtainStyledAttributes.getDimensionPixelSize(index2, vjVar.c0);
                        continue;
                    case 60:
                        i = indexCount2;
                        yjVar.a = obtainStyledAttributes.getFloat(index2, yjVar.a);
                        continue;
                    case 61:
                        i = indexCount2;
                        vjVar.z = f(obtainStyledAttributes, index2, vjVar.z);
                        continue;
                    case 62:
                        i = indexCount2;
                        vjVar.A = obtainStyledAttributes.getDimensionPixelSize(index2, vjVar.A);
                        continue;
                    case 63:
                        i = indexCount2;
                        vjVar.B = obtainStyledAttributes.getFloat(index2, vjVar.B);
                        continue;
                    case 64:
                        i = indexCount2;
                        wjVar.a = f(obtainStyledAttributes, index2, wjVar.a);
                        continue;
                    case 65:
                        i = indexCount2;
                        if (obtainStyledAttributes.peekValue(index2).type == 3) {
                            obtainStyledAttributes.getString(index2);
                            wjVar.getClass();
                            break;
                        } else {
                            String str = strArr[obtainStyledAttributes.getInteger(index2, 0)];
                            wjVar.getClass();
                            break;
                        }
                    case 66:
                        i = indexCount2;
                        obtainStyledAttributes.getInt(index2, 0);
                        wjVar.getClass();
                        continue;
                    case 67:
                        i = indexCount2;
                        wjVar.e = obtainStyledAttributes.getFloat(index2, wjVar.e);
                        break;
                    case 68:
                        i = indexCount2;
                        xjVar.d = obtainStyledAttributes.getFloat(index2, xjVar.d);
                        break;
                    case 69:
                        i = indexCount2;
                        vjVar.d0 = obtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 70:
                        i = indexCount2;
                        vjVar.e0 = obtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 71:
                        i = indexCount2;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        i = indexCount2;
                        vjVar.f0 = obtainStyledAttributes.getInt(index2, vjVar.f0);
                        break;
                    case 73:
                        i = indexCount2;
                        vjVar.g0 = obtainStyledAttributes.getDimensionPixelSize(index2, vjVar.g0);
                        break;
                    case 74:
                        i = indexCount2;
                        vjVar.j0 = obtainStyledAttributes.getString(index2);
                        break;
                    case 75:
                        i = indexCount2;
                        vjVar.n0 = obtainStyledAttributes.getBoolean(index2, vjVar.n0);
                        break;
                    case 76:
                        i = indexCount2;
                        wjVar.c = obtainStyledAttributes.getInt(index2, wjVar.c);
                        break;
                    case 77:
                        i = indexCount2;
                        vjVar.k0 = obtainStyledAttributes.getString(index2);
                        break;
                    case 78:
                        i = indexCount2;
                        xjVar.b = obtainStyledAttributes.getInt(index2, xjVar.b);
                        break;
                    case 79:
                        i = indexCount2;
                        wjVar.d = obtainStyledAttributes.getFloat(index2, wjVar.d);
                        break;
                    case 80:
                        i = indexCount2;
                        vjVar.l0 = obtainStyledAttributes.getBoolean(index2, vjVar.l0);
                        break;
                    case 81:
                        i = indexCount2;
                        vjVar.m0 = obtainStyledAttributes.getBoolean(index2, vjVar.m0);
                        break;
                    case 82:
                        i = indexCount2;
                        wjVar.b = obtainStyledAttributes.getInteger(index2, wjVar.b);
                        break;
                    case 83:
                        i = indexCount2;
                        yjVar.h = f(obtainStyledAttributes, index2, yjVar.h);
                        break;
                    case 84:
                        i = indexCount2;
                        wjVar.g = obtainStyledAttributes.getInteger(index2, wjVar.g);
                        break;
                    case 85:
                        i = indexCount2;
                        wjVar.f = obtainStyledAttributes.getFloat(index2, wjVar.f);
                        break;
                    case 86:
                        i = indexCount2;
                        int i9 = obtainStyledAttributes.peekValue(index2).type;
                        if (i9 == 1) {
                            wjVar.i = obtainStyledAttributes.getResourceId(index2, -1);
                            break;
                        } else if (i9 == 3) {
                            String string2 = obtainStyledAttributes.getString(index2);
                            wjVar.h = string2;
                            if (string2.indexOf("/") > 0) {
                                wjVar.i = obtainStyledAttributes.getResourceId(index2, -1);
                                break;
                            }
                        } else {
                            obtainStyledAttributes.getInteger(index2, wjVar.i);
                            break;
                        }
                        break;
                    case 87:
                        i = indexCount2;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index2) + "   " + sparseIntArray.get(index2));
                        break;
                    case 88:
                    case 89:
                    case 90:
                    default:
                        StringBuilder sb2 = new StringBuilder("Unknown attribute 0x");
                        i = indexCount2;
                        sb2.append(Integer.toHexString(index2));
                        sb2.append("   ");
                        sb2.append(sparseIntArray.get(index2));
                        Log.w("ConstraintSet", sb2.toString());
                        break;
                    case 91:
                        i = indexCount2;
                        vjVar.q = f(obtainStyledAttributes, index2, vjVar.q);
                        break;
                    case 92:
                        i = indexCount2;
                        vjVar.r = f(obtainStyledAttributes, index2, vjVar.r);
                        break;
                    case 93:
                        i = indexCount2;
                        vjVar.L = obtainStyledAttributes.getDimensionPixelSize(index2, vjVar.L);
                        break;
                    case 94:
                        i = indexCount2;
                        vjVar.S = obtainStyledAttributes.getDimensionPixelSize(index2, vjVar.S);
                        break;
                    case 95:
                        i = indexCount2;
                        g(vjVar, obtainStyledAttributes, index2, 0);
                        continue;
                    case 96:
                        i = indexCount2;
                        g(vjVar, obtainStyledAttributes, index2, 1);
                        break;
                    case 97:
                        i = indexCount2;
                        vjVar.o0 = obtainStyledAttributes.getInt(index2, vjVar.o0);
                        break;
                }
                i7++;
            }
            if (vjVar.j0 != null) {
                vjVar.i0 = null;
            }
        }
        obtainStyledAttributes.recycle();
        return ujVar;
    }

    public static int f(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        if (resourceId == -1) {
            return typedArray.getInt(i, -1);
        }
        return resourceId;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void g(java.lang.Object r7, android.content.res.TypedArray r8, int r9, int r10) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zj.g(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    public static void h(qj qjVar, String str) {
        if (str != null) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i = 0;
            int i2 = -1;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                if (!substring.equalsIgnoreCase("W")) {
                    if (substring.equalsIgnoreCase("H")) {
                        i = 1;
                    } else {
                        i = -1;
                    }
                }
                i2 = i;
                i = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            try {
                if (indexOf2 >= 0 && indexOf2 < length - 1) {
                    String substring2 = str.substring(i, indexOf2);
                    String substring3 = str.substring(indexOf2 + 1);
                    if (substring2.length() > 0 && substring3.length() > 0) {
                        float parseFloat = Float.parseFloat(substring2);
                        float parseFloat2 = Float.parseFloat(substring3);
                        if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                            if (i2 == 1) {
                                Math.abs(parseFloat2 / parseFloat);
                            } else {
                                Math.abs(parseFloat / parseFloat2);
                            }
                        }
                    }
                } else {
                    String substring4 = str.substring(i);
                    if (substring4.length() > 0) {
                        Float.parseFloat(substring4);
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        qjVar.G = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:44:0x0112. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [lc, android.view.View, oj] */
    /* JADX WARN: Type inference failed for: r9v1, types: [mc, g10] */
    public final void a(ConstraintLayout constraintLayout) {
        HashSet hashSet;
        int i;
        int i2;
        String str;
        HashMap hashMap;
        String str2;
        zj zjVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap2 = zjVar.c;
        HashSet hashSet2 = new HashSet(hashMap2.keySet());
        int i3 = 0;
        while (i3 < childCount) {
            View childAt = constraintLayout.getChildAt(i3);
            int id = childAt.getId();
            if (!hashMap2.containsKey(Integer.valueOf(id))) {
                StringBuilder sb = new StringBuilder("id unknown ");
                try {
                    str2 = childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                    str2 = "UNKNOWN";
                }
                sb.append(str2);
                Log.w("ConstraintSet", sb.toString());
            } else {
                if (zjVar.b && id == -1) {
                    f40.f("All children of ConstraintLayout must have ids to use ConstraintSet");
                    return;
                }
                if (id != -1) {
                    if (hashMap2.containsKey(Integer.valueOf(id))) {
                        hashSet2.remove(Integer.valueOf(id));
                        uj ujVar = (uj) hashMap2.get(Integer.valueOf(id));
                        if (ujVar != null) {
                            xj xjVar = ujVar.b;
                            vj vjVar = ujVar.d;
                            yj yjVar = ujVar.e;
                            if (childAt instanceof lc) {
                                vjVar.h0 = 1;
                                lc lcVar = (lc) childAt;
                                lcVar.setId(id);
                                lcVar.setType(vjVar.f0);
                                lcVar.setMargin(vjVar.g0);
                                lcVar.setAllowsGoneWidget(vjVar.n0);
                                int[] iArr = vjVar.i0;
                                if (iArr != null) {
                                    lcVar.setReferencedIds(iArr);
                                } else {
                                    String str3 = vjVar.j0;
                                    if (str3 != null) {
                                        int[] c = c(lcVar, str3);
                                        vjVar.i0 = c;
                                        lcVar.setReferencedIds(c);
                                    }
                                }
                            }
                            qj qjVar = (qj) childAt.getLayoutParams();
                            qjVar.a();
                            ujVar.a(qjVar);
                            HashMap hashMap3 = ujVar.f;
                            Class<?> cls = childAt.getClass();
                            for (String str4 : hashMap3.keySet()) {
                                nj njVar = (nj) hashMap3.get(str4);
                                HashSet hashSet3 = hashSet2;
                                if (!njVar.a) {
                                    i2 = i3;
                                    str = "set" + str4;
                                } else {
                                    i2 = i3;
                                    str = str4;
                                }
                                try {
                                    int C = qo0.C(njVar.b);
                                    Class cls2 = Float.TYPE;
                                    Class cls3 = Integer.TYPE;
                                    switch (C) {
                                        case 0:
                                            hashMap = hashMap3;
                                            cls.getMethod(str, cls3).invoke(childAt, Integer.valueOf(njVar.c));
                                            break;
                                        case 1:
                                            hashMap = hashMap3;
                                            cls.getMethod(str, cls2).invoke(childAt, Float.valueOf(njVar.d));
                                            break;
                                        case 2:
                                            hashMap = hashMap3;
                                            cls.getMethod(str, cls3).invoke(childAt, Integer.valueOf(njVar.g));
                                            break;
                                        case 3:
                                            Method method = cls.getMethod(str, Drawable.class);
                                            hashMap = hashMap3;
                                            try {
                                                ColorDrawable colorDrawable = new ColorDrawable();
                                                colorDrawable.setColor(njVar.g);
                                                method.invoke(childAt, colorDrawable);
                                            } catch (IllegalAccessException e2) {
                                                e = e2;
                                                Log.e("TransitionLayout", " Custom Attribute \"" + str4 + "\" not found on " + cls.getName(), e);
                                                hashSet2 = hashSet3;
                                                i3 = i2;
                                                hashMap3 = hashMap;
                                            } catch (NoSuchMethodException e3) {
                                                e = e3;
                                                Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e);
                                                hashSet2 = hashSet3;
                                                i3 = i2;
                                                hashMap3 = hashMap;
                                            } catch (InvocationTargetException e4) {
                                                e = e4;
                                                Log.e("TransitionLayout", " Custom Attribute \"" + str4 + "\" not found on " + cls.getName(), e);
                                                hashSet2 = hashSet3;
                                                i3 = i2;
                                                hashMap3 = hashMap;
                                            }
                                        case 4:
                                            cls.getMethod(str, CharSequence.class).invoke(childAt, njVar.e);
                                            hashMap = hashMap3;
                                            break;
                                        case 5:
                                            cls.getMethod(str, Boolean.TYPE).invoke(childAt, Boolean.valueOf(njVar.f));
                                            hashMap = hashMap3;
                                            break;
                                        case 6:
                                            cls.getMethod(str, cls2).invoke(childAt, Float.valueOf(njVar.d));
                                            hashMap = hashMap3;
                                            break;
                                        case 7:
                                            cls.getMethod(str, cls3).invoke(childAt, Integer.valueOf(njVar.c));
                                            hashMap = hashMap3;
                                            break;
                                        default:
                                            hashMap = hashMap3;
                                            break;
                                    }
                                } catch (IllegalAccessException e5) {
                                    e = e5;
                                    hashMap = hashMap3;
                                } catch (NoSuchMethodException e6) {
                                    e = e6;
                                    hashMap = hashMap3;
                                } catch (InvocationTargetException e7) {
                                    e = e7;
                                    hashMap = hashMap3;
                                }
                                hashSet2 = hashSet3;
                                i3 = i2;
                                hashMap3 = hashMap;
                            }
                            hashSet = hashSet2;
                            i = i3;
                            childAt.setLayoutParams(qjVar);
                            if (xjVar.b == 0) {
                                childAt.setVisibility(xjVar.a);
                            }
                            childAt.setAlpha(xjVar.c);
                            childAt.setRotation(yjVar.a);
                            childAt.setRotationX(yjVar.b);
                            childAt.setRotationY(yjVar.c);
                            childAt.setScaleX(yjVar.d);
                            childAt.setScaleY(yjVar.e);
                            if (yjVar.h != -1) {
                                if (((View) childAt.getParent()).findViewById(yjVar.h) != null) {
                                    float bottom = (r0.getBottom() + r0.getTop()) / 2.0f;
                                    float right = (r0.getRight() + r0.getLeft()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        childAt.setPivotX(right - childAt.getLeft());
                                        childAt.setPivotY(bottom - childAt.getTop());
                                    }
                                }
                            } else {
                                if (!Float.isNaN(yjVar.f)) {
                                    childAt.setPivotX(yjVar.f);
                                }
                                if (!Float.isNaN(yjVar.g)) {
                                    childAt.setPivotY(yjVar.g);
                                }
                            }
                            childAt.setTranslationX(yjVar.i);
                            childAt.setTranslationY(yjVar.j);
                            childAt.setTranslationZ(yjVar.k);
                            if (yjVar.l) {
                                childAt.setElevation(yjVar.m);
                            }
                        }
                    } else {
                        hashSet = hashSet2;
                        i = i3;
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                    i3 = i + 1;
                    zjVar = this;
                    hashSet2 = hashSet;
                }
            }
            hashSet = hashSet2;
            i = i3;
            i3 = i + 1;
            zjVar = this;
            hashSet2 = hashSet;
        }
        Iterator it = hashSet2.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            uj ujVar2 = (uj) hashMap2.get(num);
            if (ujVar2 != null) {
                vj vjVar2 = ujVar2.d;
                if (vjVar2.h0 == 1) {
                    Context context = constraintLayout.getContext();
                    ?? view = new View(context);
                    view.c = new int[32];
                    view.i = new HashMap();
                    view.e = context;
                    ?? g10Var = new g10();
                    g10Var.s0 = 0;
                    g10Var.t0 = true;
                    g10Var.u0 = 0;
                    g10Var.v0 = false;
                    view.l = g10Var;
                    view.f = g10Var;
                    view.i();
                    view.setVisibility(8);
                    view.setId(num.intValue());
                    int[] iArr2 = vjVar2.i0;
                    if (iArr2 != null) {
                        view.setReferencedIds(iArr2);
                    } else {
                        String str5 = vjVar2.j0;
                        if (str5 != null) {
                            int[] c2 = c(view, str5);
                            vjVar2.i0 = c2;
                            view.setReferencedIds(c2);
                        }
                    }
                    view.setType(vjVar2.f0);
                    view.setMargin(vjVar2.g0);
                    qj g = ConstraintLayout.g();
                    view.i();
                    ujVar2.a(g);
                    constraintLayout.addView((View) view, g);
                }
                if (vjVar2.a) {
                    o00 o00Var = new o00(constraintLayout.getContext());
                    o00Var.setId(num.intValue());
                    qj g2 = ConstraintLayout.g();
                    ujVar2.a(g2);
                    constraintLayout.addView(o00Var, g2);
                }
            }
        }
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt2 = constraintLayout.getChildAt(i4);
            if (childAt2 instanceof oj) {
                ((oj) childAt2).e(constraintLayout);
            }
        }
    }

    public final void b(ConstraintLayout constraintLayout) {
        int i;
        HashMap hashMap;
        int i2;
        zj zjVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap2 = zjVar.c;
        hashMap2.clear();
        int i3 = 0;
        while (i3 < childCount) {
            View childAt = constraintLayout.getChildAt(i3);
            qj qjVar = (qj) childAt.getLayoutParams();
            int id = childAt.getId();
            if (zjVar.b && id == -1) {
                f40.f("All children of ConstraintLayout must have ids to use ConstraintSet");
                return;
            }
            if (!hashMap2.containsKey(Integer.valueOf(id))) {
                hashMap2.put(Integer.valueOf(id), new uj());
            }
            uj ujVar = (uj) hashMap2.get(Integer.valueOf(id));
            if (ujVar == null) {
                i = childCount;
                hashMap = hashMap2;
                i2 = i3;
            } else {
                xj xjVar = ujVar.b;
                vj vjVar = ujVar.d;
                yj yjVar = ujVar.e;
                i = childCount;
                HashMap hashMap3 = new HashMap();
                hashMap = hashMap2;
                Class<?> cls = childAt.getClass();
                i2 = i3;
                HashMap hashMap4 = zjVar.a;
                for (String str : hashMap4.keySet()) {
                    nj njVar = (nj) hashMap4.get(str);
                    HashMap hashMap5 = hashMap4;
                    try {
                        if (str.equals("BackgroundColor")) {
                            hashMap3.put(str, new nj(njVar, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                        } else {
                            hashMap3.put(str, new nj(njVar, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                        }
                    } catch (IllegalAccessException e2) {
                        Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName(), e2);
                    } catch (NoSuchMethodException e3) {
                        Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e3);
                    } catch (InvocationTargetException e4) {
                        Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName(), e4);
                    }
                    hashMap4 = hashMap5;
                }
                ujVar.f = hashMap3;
                ujVar.a = id;
                vjVar.h = qjVar.e;
                vjVar.i = qjVar.f;
                vjVar.j = qjVar.g;
                vjVar.k = qjVar.h;
                vjVar.l = qjVar.i;
                vjVar.m = qjVar.j;
                vjVar.n = qjVar.k;
                vjVar.o = qjVar.l;
                vjVar.p = qjVar.m;
                vjVar.q = qjVar.n;
                vjVar.r = qjVar.o;
                vjVar.s = qjVar.s;
                vjVar.t = qjVar.t;
                vjVar.u = qjVar.u;
                vjVar.v = qjVar.v;
                vjVar.w = qjVar.E;
                vjVar.x = qjVar.F;
                vjVar.y = qjVar.G;
                vjVar.z = qjVar.p;
                vjVar.A = qjVar.q;
                vjVar.B = qjVar.r;
                vjVar.C = qjVar.T;
                vjVar.D = qjVar.U;
                vjVar.E = qjVar.V;
                vjVar.f = qjVar.c;
                vjVar.d = qjVar.a;
                vjVar.e = qjVar.b;
                vjVar.b = ((ViewGroup.MarginLayoutParams) qjVar).width;
                vjVar.c = ((ViewGroup.MarginLayoutParams) qjVar).height;
                vjVar.F = ((ViewGroup.MarginLayoutParams) qjVar).leftMargin;
                vjVar.G = ((ViewGroup.MarginLayoutParams) qjVar).rightMargin;
                vjVar.H = ((ViewGroup.MarginLayoutParams) qjVar).topMargin;
                vjVar.I = ((ViewGroup.MarginLayoutParams) qjVar).bottomMargin;
                vjVar.L = qjVar.D;
                vjVar.T = qjVar.I;
                vjVar.U = qjVar.H;
                vjVar.W = qjVar.K;
                vjVar.V = qjVar.J;
                vjVar.l0 = qjVar.W;
                vjVar.m0 = qjVar.X;
                vjVar.X = qjVar.L;
                vjVar.Y = qjVar.M;
                vjVar.Z = qjVar.P;
                vjVar.a0 = qjVar.Q;
                vjVar.b0 = qjVar.N;
                vjVar.c0 = qjVar.O;
                vjVar.d0 = qjVar.R;
                vjVar.e0 = qjVar.S;
                vjVar.k0 = qjVar.Y;
                vjVar.N = qjVar.x;
                vjVar.P = qjVar.z;
                vjVar.M = qjVar.w;
                vjVar.O = qjVar.y;
                vjVar.R = qjVar.A;
                vjVar.Q = qjVar.B;
                vjVar.S = qjVar.C;
                vjVar.o0 = qjVar.Z;
                vjVar.J = qjVar.getMarginEnd();
                vjVar.K = qjVar.getMarginStart();
                xjVar.a = childAt.getVisibility();
                xjVar.c = childAt.getAlpha();
                yjVar.a = childAt.getRotation();
                yjVar.b = childAt.getRotationX();
                yjVar.c = childAt.getRotationY();
                yjVar.d = childAt.getScaleX();
                yjVar.e = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    yjVar.f = pivotX;
                    yjVar.g = pivotY;
                }
                yjVar.i = childAt.getTranslationX();
                yjVar.j = childAt.getTranslationY();
                yjVar.k = childAt.getTranslationZ();
                if (yjVar.l) {
                    yjVar.m = childAt.getElevation();
                }
                if (childAt instanceof lc) {
                    lc lcVar = (lc) childAt;
                    vjVar.n0 = lcVar.getAllowsGoneWidget();
                    vjVar.i0 = lcVar.getReferencedIds();
                    vjVar.f0 = lcVar.getType();
                    vjVar.g0 = lcVar.getMargin();
                }
            }
            i3 = i2 + 1;
            zjVar = this;
            childCount = i;
            hashMap2 = hashMap;
        }
    }

    public final void e(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    uj d2 = d(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        d2.d.a = true;
                    }
                    this.c.put(Integer.valueOf(d2.a), d2);
                }
            }
        } catch (IOException e2) {
            Log.e("ConstraintSet", "Error parsing resource: " + i, e2);
        } catch (XmlPullParserException e3) {
            Log.e("ConstraintSet", "Error parsing resource: " + i, e3);
        }
    }
}
