package defpackage;

import android.content.Context;
import svarzee.android.apps.adb_mouse.R;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class us {
    public static final int f = (int) Math.round(5.1000000000000005d);
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;

    public us(Context context) {
        boolean M = mn.M(context, R.attr.elevationOverlayEnabled, false);
        int w = f20.w(context, R.attr.elevationOverlayColor, 0);
        int w2 = f20.w(context, R.attr.elevationOverlayAccentColor, 0);
        int w3 = f20.w(context, R.attr.colorSurface, 0);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.a = M;
        this.b = w;
        this.c = w2;
        this.d = w3;
        this.e = f2;
    }
}
