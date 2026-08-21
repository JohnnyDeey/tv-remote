package defpackage;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public abstract /* synthetic */ class qo0 {
    public static void A(HashMap hashMap, s sVar) {
        hashMap.put(sVar, new ag0(20));
    }

    public static /* synthetic */ String B(int i) {
        switch (i) {
            case 1:
                return "NONE";
            case 2:
                return "LEFT";
            case 3:
                return "TOP";
            case 4:
                return "RIGHT";
            case 5:
                return "BOTTOM";
            case 6:
                return "BASELINE";
            case 7:
                return "CENTER";
            case 8:
                return "CENTER_X";
            case 9:
                return "CENTER_Y";
            default:
                throw null;
        }
    }

    public static /* synthetic */ int C(int i) {
        if (i != 0) {
            return i - 1;
        }
        throw null;
    }

    public static /* synthetic */ String D(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return "null";
                }
                return "REMOVING";
            }
            return "ADDING";
        }
        return "NONE";
    }

    public static /* synthetic */ String E(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return "null";
                    }
                    return "INVISIBLE";
                }
                return "GONE";
            }
            return "VISIBLE";
        }
        return "REMOVED";
    }

    public static final void a(View view, int i) {
        int C = C(i);
        if (C != 0) {
            if (C != 1) {
                if (C != 2) {
                    if (C == 3) {
                        if (vx.F(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                        }
                        view.setVisibility(4);
                        return;
                    }
                    return;
                }
                if (vx.F(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                }
                view.setVisibility(8);
                return;
            }
            if (vx.F(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
            }
            view.setVisibility(0);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            if (vx.F(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
            }
            viewGroup.removeView(view);
        }
    }

    public static int b(int i) {
        if (i != 0) {
            if (i == 4) {
                return 4;
            }
            if (i == 8) {
                return 3;
            }
            c.k(m("Unknown visibility ", i));
            return 0;
        }
        return 2;
    }

    public static int c(View view) {
        if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
            return 4;
        }
        return b(view.getVisibility());
    }

    public static String d(String str, char c) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt) && sb.length() != 0) {
                sb.append(c);
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    public static String e(String str) {
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            char charAt = str.charAt(i);
            if (Character.isLetter(charAt)) {
                if (!Character.isUpperCase(charAt)) {
                    char upperCase = Character.toUpperCase(charAt);
                    if (i == 0) {
                        return upperCase + str.substring(1);
                    }
                    return str.substring(0, i) + upperCase + str.substring(i + 1);
                }
            } else {
                i++;
            }
        }
        return str;
    }

    public static int f(int i) {
        if (i != 90) {
            if (i != 91) {
                if (i != 93) {
                    if (i != 94) {
                        switch (i) {
                            case 0:
                                return 1;
                            case 1:
                                return 2;
                            case 2:
                                return 3;
                            case 3:
                                return 4;
                            case 4:
                                return 5;
                            case 5:
                                return 6;
                            case 6:
                                return 7;
                            case 7:
                                return 8;
                            case 8:
                                return 9;
                            case 9:
                                return 10;
                            case 10:
                                return 11;
                            case 11:
                                return 12;
                            case 12:
                                return 13;
                            case 13:
                                return 14;
                            case 14:
                                return 15;
                            case 15:
                                return 16;
                            case 16:
                                return 17;
                            case 17:
                                return 18;
                            case 18:
                                return 19;
                            case 19:
                                return 20;
                            case 20:
                                return 21;
                            case 21:
                                return 22;
                            case 22:
                                return 23;
                            case 23:
                                return 24;
                            case 24:
                                return 25;
                            case 25:
                                return 26;
                            case 26:
                                return 27;
                            case 27:
                                return 28;
                            case 28:
                                return 29;
                            case 29:
                                return 30;
                            case 30:
                                return 31;
                            case 31:
                                return 32;
                            case 32:
                                return 33;
                            case 33:
                                return 34;
                            case 34:
                                return 35;
                            case 35:
                                return 36;
                            case 36:
                                return 37;
                            case 37:
                                return 38;
                            case 38:
                                return 39;
                            case 39:
                                return 40;
                            case 40:
                                return 41;
                            case 41:
                                return 42;
                            case 42:
                                return 43;
                            case 43:
                                return 44;
                            case 44:
                                return 45;
                            case 45:
                                return 46;
                            case 46:
                                return 47;
                            case 47:
                                return 48;
                            case 48:
                                return 49;
                            case 49:
                                return 50;
                            case 50:
                                return 51;
                            case 51:
                                return 52;
                            case 52:
                                return 53;
                            case 53:
                                return 54;
                            case 54:
                                return 55;
                            case 55:
                                return 56;
                            case 56:
                                return 57;
                            case 57:
                                return 58;
                            case 58:
                                return 59;
                            case 59:
                                return 60;
                            case 60:
                                return 61;
                            case 61:
                                return 62;
                            case 62:
                                return 63;
                            case 63:
                                return 64;
                            case 64:
                                return 65;
                            case 65:
                                return 66;
                            case 66:
                                return 67;
                            case 67:
                                return 68;
                            case 68:
                                return 69;
                            case 69:
                                return 70;
                            case 70:
                                return 71;
                            case 71:
                                return 72;
                            case 72:
                                return 73;
                            case 73:
                                return 74;
                            case 74:
                                return 75;
                            case 75:
                                return 76;
                            case 76:
                                return 77;
                            case 77:
                                return 78;
                            case 78:
                                return 79;
                            case 79:
                                return 80;
                            default:
                                switch (i) {
                                    case 96:
                                        return 87;
                                    case 97:
                                        return 88;
                                    case 98:
                                        return 89;
                                    case 99:
                                        return 90;
                                    case 100:
                                        return 91;
                                    case 101:
                                        return 92;
                                    case 102:
                                        return 83;
                                    case 103:
                                        return 86;
                                    case 104:
                                        return 93;
                                    case 105:
                                        return 94;
                                    case 106:
                                        return 95;
                                    case 107:
                                        return 96;
                                    case 108:
                                        return 97;
                                    case 109:
                                        return 98;
                                    case 110:
                                        return 99;
                                    case 111:
                                        return 100;
                                    case 112:
                                        return 101;
                                    case 113:
                                        return 102;
                                    case 114:
                                        return 103;
                                    case 115:
                                        return 104;
                                    case 116:
                                        return 105;
                                    case 117:
                                        return 106;
                                    case 118:
                                        return 107;
                                    case 119:
                                        return 108;
                                    case 120:
                                        return 109;
                                    case 121:
                                        return 110;
                                    case 122:
                                        return 111;
                                    case 123:
                                        return 112;
                                    case 124:
                                        return 113;
                                    case 125:
                                        return 114;
                                    case 126:
                                        return 117;
                                    case 127:
                                        return 119;
                                    case 128:
                                        return 120;
                                    case 129:
                                        return 121;
                                    case 130:
                                        return 122;
                                    case 131:
                                        return 123;
                                    case 132:
                                        return 124;
                                    case 133:
                                        return 125;
                                    case 134:
                                        return 126;
                                    case 135:
                                        return 127;
                                    case 136:
                                        return 128;
                                    case 137:
                                        return 129;
                                    case 138:
                                        return 130;
                                    case 139:
                                        return 131;
                                    case 140:
                                        return 132;
                                    case 141:
                                        return 133;
                                    case 142:
                                        return 134;
                                    case 143:
                                        return 135;
                                    case 144:
                                        return 136;
                                    case 145:
                                        return 115;
                                    case 146:
                                        return 116;
                                    case 147:
                                        return 118;
                                    case 148:
                                        return 137;
                                    case 149:
                                        return 138;
                                    case 150:
                                        return 139;
                                    case 151:
                                        return 140;
                                    case 152:
                                        return 141;
                                    default:
                                        return 0;
                                }
                        }
                    }
                    return 85;
                }
                return 84;
            }
            return 82;
        }
        return 81;
    }

    public static /* synthetic */ boolean g(int i, int i2) {
        if (i != 0) {
            if (i == i2) {
                return true;
            }
            return false;
        }
        throw null;
    }

    public static /* synthetic */ int h(int i) {
        switch (i) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 6;
            case 8:
                return 7;
            case 9:
                return 8;
            case 10:
                return 9;
            case 11:
                return 10;
            case 12:
                return 11;
            case 13:
                return 12;
            case 14:
                return 13;
            case 15:
                return 14;
            case 16:
                return 15;
            case 17:
                return 16;
            case 18:
                return 17;
            case 19:
                return 18;
            case 20:
                return 19;
            case 21:
                return 20;
            case 22:
                return 21;
            case 23:
                return 22;
            case 24:
                return 23;
            case 25:
                return 24;
            case 26:
                return 25;
            case 27:
                return 26;
            case 28:
                return 27;
            case 29:
                return 28;
            case 30:
                return 29;
            case 31:
                return 30;
            case 32:
                return 31;
            case 33:
                return 32;
            case 34:
                return 33;
            case 35:
                return 34;
            case 36:
                return 35;
            case 37:
                return 36;
            case 38:
                return 37;
            case 39:
                return 38;
            case 40:
                return 39;
            case 41:
                return 40;
            case 42:
                return 41;
            case 43:
                return 42;
            case 44:
                return 43;
            case 45:
                return 44;
            case 46:
                return 45;
            case 47:
                return 46;
            case 48:
                return 47;
            case 49:
                return 48;
            case 50:
                return 49;
            case 51:
                return 50;
            case 52:
                return 51;
            case 53:
                return 52;
            case 54:
                return 53;
            case 55:
                return 54;
            case 56:
                return 55;
            case 57:
                return 56;
            case 58:
                return 57;
            case 59:
                return 58;
            case 60:
                return 59;
            case 61:
                return 60;
            case 62:
                return 61;
            case 63:
                return 62;
            case 64:
                return 63;
            case 65:
                return 64;
            case 66:
                return 65;
            case 67:
                return 66;
            case 68:
                return 67;
            case 69:
                return 68;
            case 70:
                return 69;
            case 71:
                return 70;
            case 72:
                return 71;
            case 73:
                return 72;
            case 74:
                return 73;
            case 75:
                return 74;
            case 76:
                return 75;
            case 77:
                return 76;
            case 78:
                return 77;
            case 79:
                return 78;
            case 80:
                return 79;
            case 81:
                return 90;
            case 82:
                return 91;
            case 83:
                return 102;
            case 84:
                return 93;
            case 85:
                return 94;
            case 86:
                return 103;
            case 87:
                return 96;
            case 88:
                return 97;
            case 89:
                return 98;
            case 90:
                return 99;
            case 91:
                return 100;
            case 92:
                return 101;
            case 93:
                return 104;
            case 94:
                return 105;
            case 95:
                return 106;
            case 96:
                return 107;
            case 97:
                return 108;
            case 98:
                return 109;
            case 99:
                return 110;
            case 100:
                return 111;
            case 101:
                return 112;
            case 102:
                return 113;
            case 103:
                return 114;
            case 104:
                return 115;
            case 105:
                return 116;
            case 106:
                return 117;
            case 107:
                return 118;
            case 108:
                return 119;
            case 109:
                return 120;
            case 110:
                return 121;
            case 111:
                return 122;
            case 112:
                return 123;
            case 113:
                return 124;
            case 114:
                return 125;
            case 115:
                return 145;
            case 116:
                return 146;
            case 117:
                return 126;
            case 118:
                return 147;
            case 119:
                return 127;
            case 120:
                return 128;
            case 121:
                return 129;
            case 122:
                return 130;
            case 123:
                return 131;
            case 124:
                return 132;
            case 125:
                return 133;
            case 126:
                return 134;
            case 127:
                return 135;
            case 128:
                return 136;
            case 129:
                return 137;
            case 130:
                return 138;
            case 131:
                return 139;
            case 132:
                return 140;
            case 133:
                return 141;
            case 134:
                return 142;
            case 135:
                return 143;
            case 136:
                return 144;
            case 137:
                return 148;
            case 138:
                return 149;
            case 139:
                return 150;
            case 140:
                return 151;
            case 141:
                return 152;
            default:
                throw null;
        }
    }

    public static int i(int i, int i2, int i3) {
        return p71.n(i) + i2 + i3;
    }

    public static int j(int i, int i2, int i3, int i4) {
        return p71.n(i) + i2 + i3 + i4;
    }

    public static s k(String str) {
        return new s(str).v();
    }

    public static ClassCastException l(Iterator it) {
        it.next().getClass();
        return new ClassCastException();
    }

    public static String m(String str, int i) {
        return str + i;
    }

    public static String n(String str, int i, String str2) {
        return str + i + str2;
    }

    public static String o(String str, int i, String str2, int i2) {
        return str + i + str2 + i2;
    }

    public static String p(String str, gx gxVar, String str2) {
        return str + gxVar + str2;
    }

    public static String q(String str, Class cls, String str2) {
        return str + cls + str2;
    }

    public static String r(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String s(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static void t(int i, int i2, s sVar, HashMap hashMap, Integer num) {
        hashMap.put(num, new c21(i, i2, sVar));
    }

    public static void u(int i, String str, HashMap hashMap, String str2) {
        hashMap.put(str2, new so(str, i));
    }

    public static void v(s sVar) {
        de.c(sVar, new lo0());
    }

    public static void w(s sVar, String str, String str2, String str3, String str4) {
        sVar.q(str);
        sVar.q(str2);
        sVar.q(str3);
        sVar.q(str4);
    }

    public static void x(HashMap hashMap, s sVar) {
        hashMap.put(sVar, new ag0(16));
    }

    public static void y(s sVar) {
        de.c(sVar, new ac(6));
    }

    public static void z(HashMap hashMap, s sVar) {
        hashMap.put(sVar, new ag0(19));
    }
}
