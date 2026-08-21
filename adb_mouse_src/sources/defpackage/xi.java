package defpackage;

import android.os.Bundle;
import androidx.activity.a;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final /* synthetic */ class xi implements xl0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xi(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.xl0
    public final Bundle a() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Bundle bundle = new Bundle();
                zi ziVar = ((a) obj).m;
                ziVar.getClass();
                HashMap hashMap = ziVar.b;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(hashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(hashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(ziVar.d));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) ziVar.g.clone());
                return bundle;
            case 1:
                f5 f5Var = (f5) obj;
                do {
                } while (f5.m(((ix) f5Var.u.d).v));
                f5Var.v.d(l50.ON_STOP);
                return new Bundle();
            default:
                return ((vx) obj).S();
        }
    }
}
