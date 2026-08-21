package defpackage;

import java.security.Permission;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class tl extends Permission {
    public final HashSet c;

    public tl(String str) {
        super(str);
        HashSet hashSet = new HashSet();
        this.c = hashSet;
        hashSet.add(str);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof tl) && this.c.equals(((tl) obj).c)) {
            return true;
        }
        return false;
    }

    @Override // java.security.Permission
    public final String getActions() {
        return this.c.toString();
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // java.security.Permission
    public final boolean implies(Permission permission) {
        if (permission instanceof tl) {
            tl tlVar = (tl) permission;
            if (getName().equals(tlVar.getName()) || this.c.containsAll(tlVar.c)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
