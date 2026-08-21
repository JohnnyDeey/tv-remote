package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import defpackage.gx;
import defpackage.hi0;
import svarzee.android.apps.adb_mouse.R;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class PreferenceScreen extends PreferenceGroup {
    public final boolean V;

    public PreferenceScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, hi0.c(context, R.attr.preferenceScreenStyle, android.R.attr.preferenceScreenStyle), 0);
        this.V = true;
    }

    @Override // androidx.preference.Preference
    public final void m() {
        gx gxVar;
        if (this.o == null && this.p == null && this.Q.size() != 0 && (gxVar = this.d.j) != null) {
            for (gxVar = this.d.j; gxVar != null; gxVar = gxVar.w) {
            }
        }
    }
}
