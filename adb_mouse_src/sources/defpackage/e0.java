package defpackage;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

/* loaded from: classes.dex */
public class e0 extends x {
    public final byte[] c;

    public e0(byte[] bArr) {
        byte b;
        byte b2;
        if (bArr.length >= 2) {
            this.c = bArr;
            if (bArr.length > 0 && (b = bArr[0]) >= 48 && b <= 57 && bArr.length > 1 && (b2 = bArr[1]) >= 48 && b2 <= 57) {
                return;
            }
            c.k("illegal characters in UTCTime string");
            throw null;
        }
        c.k("UTCTime string too short");
        throw null;
    }

    @Override // defpackage.x, defpackage.p
    public final int hashCode() {
        return f20.K(this.c);
    }

    @Override // defpackage.x
    public final boolean i(x xVar) {
        if (!(xVar instanceof e0)) {
            return false;
        }
        return Arrays.equals(this.c, ((e0) xVar).c);
    }

    @Override // defpackage.x
    public final void j(v vVar, boolean z) {
        vVar.m(23, z, this.c);
    }

    @Override // defpackage.x
    public final boolean k() {
        return false;
    }

    @Override // defpackage.x
    public final int l(boolean z) {
        return v.f(this.c.length, z);
    }

    public final String q() {
        String a = yp0.a(this.c);
        if (a.indexOf(45) < 0 && a.indexOf(43) < 0) {
            if (a.length() == 11) {
                return a.substring(0, 10).concat("00GMT+00:00");
            }
            return a.substring(0, 12).concat("GMT+00:00");
        }
        int indexOf = a.indexOf(45);
        if (indexOf < 0) {
            indexOf = a.indexOf(43);
        }
        if (indexOf == a.length() - 3) {
            a = a.concat("00");
        }
        if (indexOf == 10) {
            return a.substring(0, 10) + "00GMT" + a.substring(10, 13) + ":" + a.substring(13, 15);
        }
        return a.substring(0, 12) + "GMT" + a.substring(12, 15) + ":" + a.substring(15, 17);
    }

    public final String toString() {
        return yp0.a(this.c);
    }

    public e0(String str) {
        this.c = yp0.b(str);
        try {
            new SimpleDateFormat("yyMMddHHmmssz", e70.a).parse(q());
        } catch (ParseException e) {
            c.j(e.getMessage(), "invalid date string: ");
            throw null;
        }
    }
}
