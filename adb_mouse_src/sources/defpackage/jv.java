package defpackage;

import java.util.Random;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class jv extends t0 {
    public final iv d = new ThreadLocal();

    @Override // defpackage.t0
    public final Random a() {
        Object obj = this.d.get();
        obj.getClass();
        return (Random) obj;
    }
}
