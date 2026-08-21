package defpackage;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public abstract class qq0 extends rk implements iz {
    public final int f;

    public qq0(qk qkVar) {
        super(qkVar);
        this.f = 2;
    }

    @Override // defpackage.iz
    public final int b() {
        return this.f;
    }

    @Override // defpackage.rk
    public final String toString() {
        if (this.c == null) {
            li0.a.getClass();
            String obj = getClass().getGenericInterfaces()[0].toString();
            if (obj.startsWith("kotlin.jvm.functions.")) {
                return obj.substring(21);
            }
            return obj;
        }
        return super.toString();
    }
}
