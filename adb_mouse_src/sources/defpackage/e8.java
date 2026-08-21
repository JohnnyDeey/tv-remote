package defpackage;

import android.app.Notification;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Insets;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public abstract class e8 {
    public static String a(Context context) {
        return context.getOpPackageName();
    }

    public static Insets b(int i, int i2, int i3, int i4) {
        return Insets.of(i, i2, i3, i4);
    }

    public static void c(Resources.Theme theme) {
        theme.rebase();
    }

    public static void d(Notification.Builder builder, boolean z) {
        builder.setAllowSystemGeneratedContextualActions(z);
    }

    public static void e(Notification.Builder builder) {
        builder.setBubbleMetadata(null);
    }

    public static void f(Notification.Action.Builder builder) {
        builder.setContextual(false);
    }
}
