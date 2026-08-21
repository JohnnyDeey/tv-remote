package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public abstract class ze implements h40, Serializable {
    public transient h40 c;
    public final Object d;
    public final Class e;
    public final String f;
    public final String g;
    public final boolean h;

    public ze(Object obj, Class cls, String str, String str2, boolean z) {
        this.d = obj;
        this.e = cls;
        this.f = str;
        this.g = str2;
        this.h = z;
    }

    public final jh c() {
        boolean z = this.h;
        Class cls = this.e;
        if (z) {
            li0.a.getClass();
            return new qd0(cls);
        }
        li0.a.getClass();
        return new kh(cls);
    }
}
