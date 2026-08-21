package defpackage;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class cf implements fc0 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ cf(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "CancelHandler.UserSupplied[" + x00.class.getSimpleName() + '@' + mn.r(this) + ']';
            default:
                return "DisposeOnCancel[" + ((dr) this.b) + ']';
        }
    }
}
