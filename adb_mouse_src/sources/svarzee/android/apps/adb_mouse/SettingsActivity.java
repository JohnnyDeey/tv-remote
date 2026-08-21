package svarzee.android.apps.adb_mouse;

import android.os.Bundle;
import defpackage.f5;
import defpackage.hc;
import defpackage.ix;
import defpackage.ln0;
import defpackage.vx;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class SettingsActivity extends f5 {
    @Override // defpackage.f5, androidx.activity.a, defpackage.dj, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_settings);
        if (bundle == null) {
            vx vxVar = ((ix) this.u.d).v;
            vxVar.getClass();
            hc hcVar = new hc(vxVar);
            hcVar.e(R.id.settings_container, new ln0(), null, 2);
            hcVar.d(false);
        }
    }
}
