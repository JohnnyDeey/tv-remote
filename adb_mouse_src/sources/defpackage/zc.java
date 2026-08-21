package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class zc {
    public p4 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ View c;

    public /* synthetic */ zc(View view, int i) {
        this.b = i;
        this.c = view;
    }

    public final void a(Drawable drawable) {
        int i = this.b;
        View view = this.c;
        switch (i) {
            case 0:
                ad adVar = (ad) view;
                adVar.setIndeterminate(false);
                adVar.a(adVar.d);
                return;
            case 1:
                ad adVar2 = (ad) view;
                if (!adVar2.h) {
                    adVar2.setVisibility(adVar2.i);
                    return;
                }
                return;
            default:
                ColorStateList colorStateList = ((e90) view).q;
                if (colorStateList != null) {
                    drawable.setTintList(colorStateList);
                    return;
                }
                return;
        }
    }

    public void b(Drawable drawable) {
        switch (this.b) {
            case 2:
                e90 e90Var = (e90) this.c;
                ColorStateList colorStateList = e90Var.q;
                if (colorStateList != null) {
                    drawable.setTint(colorStateList.getColorForState(e90Var.u, colorStateList.getDefaultColor()));
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final void c(Drawable drawable) {
    }
}
