package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.Locale;
import svarzee.android.apps.adb_mouse.R;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class q21 extends gh0 {
    public final c90 d;

    public q21(c90 c90Var) {
        this.d = c90Var;
    }

    @Override // defpackage.gh0
    public final int a() {
        return this.d.Y.h;
    }

    @Override // defpackage.gh0
    public final void d(di0 di0Var, int i) {
        String format;
        c90 c90Var = this.d;
        int i2 = c90Var.Y.c.e + i;
        TextView textView = ((p21) di0Var).u;
        textView.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i2)));
        Context context = textView.getContext();
        if (dx0.b().get(1) == i2) {
            format = String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i2));
        } else {
            format = String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i2));
        }
        textView.setContentDescription(format);
        r6 r6Var = c90Var.b0;
        if (dx0.b().get(1) == i2) {
            Object obj = r6Var.e;
        } else {
            Object obj2 = r6Var.d;
        }
        throw null;
    }

    @Override // defpackage.gh0
    public final di0 e(ViewGroup viewGroup, int i) {
        return new p21((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
