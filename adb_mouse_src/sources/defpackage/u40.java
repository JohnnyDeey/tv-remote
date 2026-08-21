package defpackage;

/* loaded from: classes.dex */
public final class u40 {
    public final int a;

    public u40(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u40) || ((u40) obj).a != this.a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.a;
    }
}
