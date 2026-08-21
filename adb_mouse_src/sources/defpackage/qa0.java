package defpackage;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class qa0 {
    public final r6 a;
    public final b8 b;
    public final HashMap c;

    public qa0(Context context, b8 b8Var) {
        r6 r6Var = new r6((Object) context, 23, false);
        this.c = new HashMap();
        this.a = r6Var;
        this.b = b8Var;
    }

    public final synchronized ku0 a(String str) {
        if (this.c.containsKey(str)) {
            return (ku0) this.c.get(str);
        }
        CctBackendFactory y = this.a.y(str);
        if (y == null) {
            return null;
        }
        b8 b8Var = this.b;
        ku0 create = y.create(new r9((Context) b8Var.f, (xh) b8Var.d, (xh) b8Var.e, str));
        this.c.put(str, create);
        return create;
    }
}
