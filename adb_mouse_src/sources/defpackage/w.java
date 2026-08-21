package defpackage;

/* loaded from: classes.dex */
public final class w extends IllegalStateException {
    public final /* synthetic */ int c;
    public Exception d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(int i, Exception exc, String str) {
        super(str);
        this.c = i;
        this.d = exc;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        switch (this.c) {
            case 0:
                return this.d;
            case 1:
                return this.d;
            default:
                return this.d;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(String str, int i) {
        super(str);
        this.c = i;
    }
}
