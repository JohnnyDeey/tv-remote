package defpackage;

import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class tl0 implements xl0 {
    public final l5 a;
    public boolean b;
    public Bundle c;
    public final uq0 d;

    public tl0(l5 l5Var, bz0 bz0Var) {
        l5Var.getClass();
        this.a = l5Var;
        this.d = new uq0(new cd0(3, bz0Var));
    }

    @Override // defpackage.xl0
    public final Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        Iterator it = ((ul0) this.d.a()).c.entrySet().iterator();
        if (!it.hasNext()) {
            this.b = false;
            return bundle;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getValue().getClass();
        c.a();
        return null;
    }
}
