package defpackage;

import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public class y31 extends Handler {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y31(Looper looper, int i) {
        super(looper);
        switch (i) {
            case 2:
                super(looper);
                Looper.getMainLooper();
                return;
            default:
                Looper.getMainLooper();
                return;
        }
    }
}
