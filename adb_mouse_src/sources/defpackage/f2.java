package defpackage;

import android.os.Message;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.preference.Preference;
import svarzee.android.apps.adb_mouse.R;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class f2 implements View.OnClickListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ f2(int i, Object obj) {
        this.c = i;
        this.d = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Message message;
        Message message2;
        Message message3;
        int i = this.c;
        Message message4 = null;
        z90 z90Var = null;
        message4 = null;
        Object obj = this.d;
        switch (i) {
            case 0:
                ((v2) obj).a();
                return;
            case 1:
                i4 i4Var = (i4) obj;
                if (view == i4Var.i && (message3 = i4Var.k) != null) {
                    message4 = Message.obtain(message3);
                } else if (view == i4Var.l && (message2 = i4Var.n) != null) {
                    message4 = Message.obtain(message2);
                } else if (view == i4Var.o && (message = i4Var.q) != null) {
                    message4 = Message.obtain(message);
                }
                if (message4 != null) {
                    message4.sendToTarget();
                }
                i4Var.F.obtainMessage(1, i4Var.b).sendToTarget();
                return;
            case 2:
                c90 c90Var = (c90) obj;
                int i2 = c90Var.a0;
                if (i2 == 2) {
                    c90Var.N(1);
                    c90Var.d0.announceForAccessibility(c90Var.l(R.string.mtrl_picker_toggled_to_day_selection));
                    return;
                } else {
                    if (i2 == 1) {
                        c90Var.N(2);
                        c90Var.c0.announceForAccessibility(c90Var.l(R.string.mtrl_picker_toggled_to_year_selection));
                        return;
                    }
                    return;
                }
            case 3:
                ((Preference) obj).s(view);
                return;
            default:
                mt0 mt0Var = ((Toolbar) obj).N;
                if (mt0Var != null) {
                    z90Var = mt0Var.d;
                }
                if (z90Var != null) {
                    z90Var.collapseActionView();
                    return;
                }
                return;
        }
    }
}
