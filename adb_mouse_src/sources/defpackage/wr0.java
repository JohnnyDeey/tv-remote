package defpackage;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;

/* loaded from: classes.dex */
public final class wr0 extends p implements h {
    public final x c;

    public wr0(Date date) {
        x mVar;
        SimpleTimeZone simpleTimeZone = new SimpleTimeZone(0, "Z");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss", e70.a);
        simpleDateFormat.setTimeZone(simpleTimeZone);
        String str = simpleDateFormat.format(date) + "Z";
        int parseInt = Integer.parseInt(str.substring(0, 4));
        if (parseInt >= 1950 && parseInt <= 2049) {
            mVar = new e0(str.substring(2));
        } else {
            mVar = new m(str);
        }
        this.c = mVar;
    }

    public static wr0 i(i iVar) {
        if (iVar != null && !(iVar instanceof wr0)) {
            if (iVar instanceof e0) {
                return new wr0((e0) iVar);
            }
            if (iVar instanceof m) {
                return new wr0((m) iVar);
            }
            c.k("unknown object in factory: ".concat(iVar.getClass().getName()));
            return null;
        }
        return (wr0) iVar;
    }

    @Override // defpackage.p, defpackage.i
    public final x c() {
        return this.c;
    }

    public final String toString() {
        x xVar = this.c;
        if (xVar instanceof e0) {
            String q = ((e0) xVar).q();
            if (q.charAt(0) < '5') {
                return "20".concat(q);
            }
            return "19".concat(q);
        }
        return ((m) xVar).t();
    }

    public wr0(x xVar) {
        if ((xVar instanceof e0) || (xVar instanceof m)) {
            this.c = xVar;
        } else {
            c.k("unknown object passed to Time");
            throw null;
        }
    }
}
