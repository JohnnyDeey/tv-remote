package defpackage;

import android.os.Trace;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class bt implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        try {
            int i = xt0.a;
            Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
            if (zs.k != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                zs.a().c();
            }
            Trace.endSection();
        } catch (Throwable th) {
            int i2 = xt0.a;
            Trace.endSection();
            throw th;
        }
    }
}
