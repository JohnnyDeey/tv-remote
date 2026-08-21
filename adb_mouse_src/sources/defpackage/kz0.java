package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public abstract class kz0 {
    public static final qz0 a;
    public static final bg b;

    /* JADX WARN: Type inference failed for: r0v1, types: [qz0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [qz0, java.lang.Object] */
    static {
        if (Build.VERSION.SDK_INT >= 29) {
            a = new Object();
        } else {
            a = new Object();
        }
        b = new bg(Float.class, "translationAlpha", 11);
        new bg(Rect.class, "clipBounds", 12);
    }

    public static void a(View view, int i, int i2, int i3, int i4) {
        a.k0(view, i, i2, i3, i4);
    }

    public static void b(View view, int i) {
        a.l0(view, i);
    }
}
