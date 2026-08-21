package defpackage;

import android.R;
import android.content.res.ColorStateList;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class i90 extends s6 {
    public static final int[][] i = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public ColorStateList g;
    public boolean h;

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.g == null) {
            int x = f20.x(this, svarzee.android.apps.adb_mouse.R.attr.colorControlActivated);
            int x2 = f20.x(this, svarzee.android.apps.adb_mouse.R.attr.colorOnSurface);
            int x3 = f20.x(this, svarzee.android.apps.adb_mouse.R.attr.colorSurface);
            this.g = new ColorStateList(i, new int[]{f20.O(x3, x, 1.0f), f20.O(x3, x2, 0.54f), f20.O(x3, x2, 0.38f), f20.O(x3, x2, 0.38f)});
        }
        return this.g;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.h && getButtonTintList() == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.h = z;
        if (z) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }
}
