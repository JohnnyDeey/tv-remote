package defpackage;

import android.os.Build;
import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class fm0 {
    public final em0 a;

    /* JADX WARN: Type inference failed for: r3v1, types: [em0, java.lang.Object] */
    public fm0(NestedScrollView nestedScrollView) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.a = new dm0(nestedScrollView);
        } else {
            this.a = new Object();
        }
    }
}
