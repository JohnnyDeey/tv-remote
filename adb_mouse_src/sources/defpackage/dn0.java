package defpackage;

import android.text.TextUtils;
import androidx.preference.Preference;
import svarzee.android.apps.adb_mouse.R;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final /* synthetic */ class dn0 implements vy {
    public final /* synthetic */ ii0 c;
    public final /* synthetic */ Preference d;
    public final /* synthetic */ ln0 e;

    public /* synthetic */ dn0(ii0 ii0Var, Preference preference, ln0 ln0Var) {
        this.c = ii0Var;
        this.d = preference;
        this.e = ln0Var;
    }

    @Override // defpackage.vy
    public final Object h(Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        this.c.c = booleanValue;
        Preference preference = this.d;
        ln0 ln0Var = this.e;
        if (booleanValue) {
            String l = ln0Var.l(R.string.thank_you_supporter);
            if (!TextUtils.equals(l, preference.j)) {
                preference.j = l;
                preference.h();
            }
            preference.v(ln0Var.l(R.string.manage_subscription));
        } else {
            String l2 = ln0Var.l(R.string.become_a_supporter);
            if (!TextUtils.equals(l2, preference.j)) {
                preference.j = l2;
                preference.h();
            }
            preference.v(ln0Var.l(R.string.supporter_description));
        }
        return nw0.a;
    }
}
