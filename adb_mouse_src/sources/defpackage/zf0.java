package defpackage;

import java.security.BasicPermission;
import java.security.Permission;
import java.util.StringTokenizer;

/* loaded from: classes.dex */
public final class zf0 extends BasicPermission {
    public final String c;
    public final int d;

    public zf0(String str) {
        super("BC", str);
        this.c = str;
        StringTokenizer stringTokenizer = new StringTokenizer(yp0.c(str), " ,");
        int i = 0;
        while (stringTokenizer.hasMoreTokens()) {
            String nextToken = stringTokenizer.nextToken();
            if (nextToken.equals("threadlocalecimplicitlyca")) {
                i |= 1;
            } else if (nextToken.equals("ecimplicitlyca")) {
                i |= 2;
            } else if (nextToken.equals("threadlocaldhdefaultparams")) {
                i |= 4;
            } else if (nextToken.equals("dhdefaultparams")) {
                i |= 8;
            } else if (nextToken.equals("acceptableeccurves")) {
                i |= 16;
            } else if (nextToken.equals("additionalecparameters")) {
                i |= 32;
            } else if (nextToken.equals("all")) {
                i = 63;
            }
        }
        if (i != 0) {
            this.d = i;
        } else {
            c.k("unknown permissions passed to mask");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zf0) {
            zf0 zf0Var = (zf0) obj;
            if (this.d == zf0Var.d && getName().equals(zf0Var.getName())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.security.BasicPermission, java.security.Permission
    public final String getActions() {
        return this.c;
    }

    public final int hashCode() {
        return getName().hashCode() + this.d;
    }

    @Override // java.security.BasicPermission, java.security.Permission
    public final boolean implies(Permission permission) {
        if (!(permission instanceof zf0) || !getName().equals(permission.getName())) {
            return false;
        }
        int i = ((zf0) permission).d;
        if ((this.d & i) != i) {
            return false;
        }
        return true;
    }
}
