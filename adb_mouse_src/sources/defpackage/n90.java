package defpackage;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class n90<S> extends wd0 {
    public int X;
    public xe Y;

    @Override // defpackage.gx
    public final void u(Bundle bundle) {
        super.u(bundle);
        if (bundle == null) {
            bundle = this.h;
        }
        this.X = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") == null) {
            this.Y = (xe) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        } else {
            c.a();
        }
    }

    @Override // defpackage.gx
    public final View v(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        layoutInflater.cloneInContext(new ContextThemeWrapper(h(), this.X));
        throw null;
    }

    @Override // defpackage.gx
    public final void z(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.X);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.Y);
    }
}
