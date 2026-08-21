package defpackage;

import java.io.IOException;

/* loaded from: classes.dex */
public final class l extends IOException {
    public final RuntimeException c;

    public l(RuntimeException runtimeException, String str) {
        super(str);
        this.c = runtimeException;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.c;
    }
}
