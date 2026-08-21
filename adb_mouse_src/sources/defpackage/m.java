package defpackage;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.SimpleTimeZone;
import java.util.TimeZone;

/* loaded from: classes.dex */
public class m extends x {
    public final byte[] c;

    public m(byte[] bArr) {
        if (bArr.length >= 4) {
            this.c = bArr;
            if (x(0) && x(1) && x(2) && x(3)) {
                return;
            }
            c.k("illegal characters in GeneralizedTime string");
            throw null;
        }
        c.k("GeneralizedTime string too short");
        throw null;
    }

    public static String r(int i) {
        if (i < 10) {
            return qo0.m("0", i);
        }
        return Integer.toString(i);
    }

    public static String y(String str) {
        StringBuilder sb;
        String str2;
        String sb2;
        char charAt;
        String substring = str.substring(14);
        int i = 1;
        while (i < substring.length() && '0' <= (charAt = substring.charAt(i)) && charAt <= '9') {
            i++;
        }
        int i2 = i - 1;
        if (i2 > 3) {
            sb2 = substring.substring(0, 4).concat(substring.substring(i));
        } else {
            if (i2 == 1) {
                sb = new StringBuilder();
                sb.append(substring.substring(0, i));
                str2 = "00";
            } else if (i2 == 2) {
                sb = new StringBuilder();
                sb.append(substring.substring(0, i));
                str2 = "0";
            } else {
                return str;
            }
            sb.append(str2);
            sb.append(substring.substring(i));
            sb2 = sb.toString();
        }
        return str.substring(0, 14).concat(sb2);
    }

    @Override // defpackage.x, defpackage.p
    public final int hashCode() {
        return f20.K(this.c);
    }

    @Override // defpackage.x
    public final boolean i(x xVar) {
        if (!(xVar instanceof m)) {
            return false;
        }
        return Arrays.equals(this.c, ((m) xVar).c);
    }

    @Override // defpackage.x
    public void j(v vVar, boolean z) {
        vVar.m(24, z, this.c);
    }

    @Override // defpackage.x
    public final boolean k() {
        return false;
    }

    @Override // defpackage.x
    public int l(boolean z) {
        return v.f(this.c.length, z);
    }

    @Override // defpackage.x
    public x o() {
        return new m(this.c);
    }

    public final SimpleDateFormat q() {
        SimpleDateFormat simpleDateFormat;
        if (u()) {
            simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss.SSSz");
        } else if (w()) {
            simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmssz");
        } else if (v()) {
            simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmz");
        } else {
            simpleDateFormat = new SimpleDateFormat("yyyyMMddHHz");
        }
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        return simpleDateFormat;
    }

    public final Date s() {
        SimpleDateFormat q;
        SimpleDateFormat simpleDateFormat;
        String a = yp0.a(this.c);
        if (a.endsWith("Z")) {
            if (u()) {
                q = new SimpleDateFormat("yyyyMMddHHmmss.SSS'Z'", e70.a);
            } else if (w()) {
                q = new SimpleDateFormat("yyyyMMddHHmmss'Z'", e70.a);
            } else if (v()) {
                q = new SimpleDateFormat("yyyyMMddHHmm'Z'", e70.a);
            } else {
                q = new SimpleDateFormat("yyyyMMddHH'Z'", e70.a);
            }
            q.setTimeZone(new SimpleTimeZone(0, "Z"));
        } else if (a.indexOf(45) <= 0 && a.indexOf(43) <= 0) {
            if (u()) {
                simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss.SSS");
            } else if (w()) {
                simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
            } else if (v()) {
                simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmm");
            } else {
                simpleDateFormat = new SimpleDateFormat("yyyyMMddHH");
            }
            q = simpleDateFormat;
            q.setTimeZone(new SimpleTimeZone(0, TimeZone.getDefault().getID()));
        } else {
            a = t();
            q = q();
        }
        if (u()) {
            a = y(a);
        }
        return q.parse(a);
    }

    public final String t() {
        String str;
        String a = yp0.a(this.c);
        int i = 1;
        if (a.charAt(a.length() - 1) == 'Z') {
            return a.substring(0, a.length() - 1).concat("GMT+00:00");
        }
        int length = a.length();
        char charAt = a.charAt(length - 6);
        if ((charAt == '-' || charAt == '+') && a.indexOf("GMT") == length - 9) {
            return a;
        }
        int length2 = a.length();
        int i2 = length2 - 5;
        char charAt2 = a.charAt(i2);
        if (charAt2 != '-' && charAt2 != '+') {
            int length3 = a.length() - 3;
            char charAt3 = a.charAt(length3);
            if (charAt3 != '-' && charAt3 != '+') {
                StringBuilder sb = new StringBuilder();
                sb.append(a);
                TimeZone timeZone = TimeZone.getDefault();
                int rawOffset = timeZone.getRawOffset();
                if (rawOffset >= 0) {
                    str = "+";
                } else {
                    rawOffset = -rawOffset;
                    str = "-";
                }
                int i3 = rawOffset / 3600000;
                int i4 = (rawOffset - (3600000 * i3)) / 60000;
                try {
                    if (timeZone.useDaylightTime()) {
                        if (u()) {
                            a = y(a);
                        }
                        if (timeZone.inDaylightTime(q().parse(a + "GMT" + str + r(i3) + ":" + r(i4)))) {
                            if (!str.equals("+")) {
                                i = -1;
                            }
                            i3 += i;
                        }
                    }
                } catch (ParseException unused) {
                }
                sb.append("GMT" + str + r(i3) + ":" + r(i4));
                return sb.toString();
            }
            return a.substring(0, length3) + "GMT" + a.substring(length3) + ":00";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(a.substring(0, i2));
        sb2.append("GMT");
        int i5 = length2 - 2;
        sb2.append(a.substring(i2, i5));
        sb2.append(":");
        sb2.append(a.substring(i5));
        return sb2.toString();
    }

    public final boolean u() {
        int i = 0;
        while (true) {
            byte[] bArr = this.c;
            if (i == bArr.length) {
                return false;
            }
            if (bArr[i] == 46 && i == 14) {
                return true;
            }
            i++;
        }
    }

    public final boolean v() {
        if (x(10) && x(11)) {
            return true;
        }
        return false;
    }

    public final boolean w() {
        if (x(12) && x(13)) {
            return true;
        }
        return false;
    }

    public final boolean x(int i) {
        byte b;
        byte[] bArr = this.c;
        if (bArr.length > i && (b = bArr[i]) >= 48 && b <= 57) {
            return true;
        }
        return false;
    }

    public m(String str) {
        this.c = yp0.b(str);
        try {
            s();
        } catch (ParseException e) {
            c.j(e.getMessage(), "invalid date string: ");
            throw null;
        }
    }
}
