package defpackage;

import java.io.IOException;

/* loaded from: classes.dex */
public abstract class ts0 extends IOException {
    public final Throwable c;

    public ts0(String str, Throwable th) {
        super(str);
        this.c = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.c;
    }
}
