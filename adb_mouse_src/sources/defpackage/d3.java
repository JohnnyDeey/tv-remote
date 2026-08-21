package defpackage;

import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class d3 implements zu {
    public static d3 d;
    public final Object c;

    public d3() {
        this.c = new Object();
        new Handler(Looper.getMainLooper(), new jo0(0, this));
    }

    @Override // defpackage.yf0
    public Object get() {
        return this.c;
    }
}
