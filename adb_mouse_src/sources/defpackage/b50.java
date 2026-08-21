package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public abstract class b50 implements iz, Serializable {
    public final int c;

    public b50(int i) {
        this.c = i;
    }

    @Override // defpackage.iz
    public final int b() {
        return this.c;
    }

    public final String toString() {
        li0.a.getClass();
        String obj = getClass().getGenericInterfaces()[0].toString();
        if (obj.startsWith("kotlin.jvm.functions.")) {
            return obj.substring(21);
        }
        return obj;
    }
}
