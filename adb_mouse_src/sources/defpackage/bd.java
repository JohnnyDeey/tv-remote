package defpackage;

import android.os.Handler;
import android.os.Message;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class bd implements Handler.Callback {
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i != 0) {
            if (i != 1) {
                return false;
            }
            message.obj.getClass();
            c.a();
            return false;
        }
        message.obj.getClass();
        c.a();
        return false;
    }
}
