package defpackage;

/* loaded from: classes.dex */
public final class uz implements rv {
    public final rv a;
    public final pz b;

    public uz(rv rvVar, pz pzVar) {
        this.a = rvVar;
        this.b = pzVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof uz) {
                uz uzVar = (uz) obj;
                if (this.a.equals(uzVar.a) && this.b.equals(uzVar.b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.rotateLeft(this.b.hashCode(), 16) ^ this.a.hashCode();
    }
}
