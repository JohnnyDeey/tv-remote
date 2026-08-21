package defpackage;

import android.os.Process;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class dj0 extends Thread {
    public final int c;

    public dj0(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.c = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.c);
        super.run();
    }
}
