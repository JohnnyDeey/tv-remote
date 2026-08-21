package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class d5 implements xl0 {
    public final /* synthetic */ int a;
    public final Object b;

    public d5(l5 l5Var) {
        this.a = 1;
        this.b = new LinkedHashSet();
        l5Var.e("androidx.savedstate.Restarter", this);
    }

    @Override // defpackage.xl0
    public final Bundle a() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Bundle bundle = new Bundle();
                ((f5) obj).l().getClass();
                return bundle;
            default:
                Bundle bundle2 = new Bundle();
                bundle2.putStringArrayList("classes_to_restore", new ArrayList<>((LinkedHashSet) obj));
                return bundle2;
        }
    }

    public d5(f5 f5Var) {
        this.a = 0;
        this.b = f5Var;
    }
}
