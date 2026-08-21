package defpackage;

import android.view.ContentInfo;
import android.view.View;
import java.util.Objects;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public abstract class py0 {
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static mk b(View view, mk mkVar) {
        ContentInfo i = mkVar.a.i();
        Objects.requireNonNull(i);
        ContentInfo performReceiveContent = view.performReceiveContent(i);
        if (performReceiveContent == null) {
            return null;
        }
        if (performReceiveContent == i) {
            return mkVar;
        }
        return new mk(new i81(performReceiveContent));
    }
}
