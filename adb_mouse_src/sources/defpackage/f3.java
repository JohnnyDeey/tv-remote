package defpackage;

import androidx.activity.result.a;
import java.util.HashMap;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class f3 extends wv0 {
    public final /* synthetic */ String s;
    public final /* synthetic */ e3 t;
    public final /* synthetic */ a u;

    public f3(a aVar, String str, e3 e3Var) {
        this.u = aVar;
        this.s = str;
        this.t = e3Var;
    }

    public final void h0(Object obj) {
        a aVar = this.u;
        HashMap hashMap = aVar.b;
        String str = this.s;
        Integer num = (Integer) hashMap.get(str);
        e3 e3Var = this.t;
        if (num != null) {
            aVar.d.add(str);
            try {
                aVar.b(num.intValue(), e3Var, obj);
                return;
            } catch (Exception e) {
                aVar.d.remove(str);
                throw e;
            }
        }
        throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + e3Var + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
    }
}
