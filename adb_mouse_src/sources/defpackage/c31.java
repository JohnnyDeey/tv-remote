package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class c31 extends BroadcastReceiver {
    public Context a;
    public final jp0 b;

    public c31(jp0 jp0Var) {
        this.b = jp0Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String str;
        Uri data = intent.getData();
        if (data != null) {
            str = data.getSchemeSpecificPart();
        } else {
            str = null;
        }
        if (!"com.google.android.gms".equals(str)) {
            return;
        }
        Object obj = this.b.e;
        throw null;
    }
}
