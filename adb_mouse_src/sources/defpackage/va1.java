package defpackage;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class va1 {
    public final Object a = new Object();
    public final jy b = new jy();
    public boolean c;
    public Boolean d;
    public Exception e;

    public final void a() {
        boolean z;
        Exception exc;
        String str;
        boolean z2;
        Boolean bool;
        if (this.c) {
            synchronized (this.a) {
                z = this.c;
            }
            if (z) {
                synchronized (this.a) {
                    exc = this.e;
                }
                if (exc == null) {
                    synchronized (this.a) {
                        try {
                            z2 = false;
                            if (this.c && this.e == null) {
                                z2 = true;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (z2) {
                        synchronized (this.a) {
                            if (this.c) {
                                Exception exc2 = this.e;
                                if (exc2 == null) {
                                    bool = this.d;
                                } else {
                                    throw new RuntimeException(exc2);
                                }
                            } else {
                                throw new IllegalStateException("Task is not yet complete");
                            }
                        }
                        str = "result ".concat(String.valueOf(bool));
                    } else {
                        str = "unknown issue";
                    }
                } else {
                    str = "failure";
                }
                throw new IllegalStateException("Complete with: ".concat(str), exc);
            }
            throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
    }
}
