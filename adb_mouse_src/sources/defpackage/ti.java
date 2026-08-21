package defpackage;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class ti implements qk {
    public static final ti d = new ti(0);
    public static final ti e = new ti(1);
    public final /* synthetic */ int c;

    public /* synthetic */ ti(int i) {
        this.c = i;
    }

    @Override // defpackage.qk
    public final dl d() {
        switch (this.c) {
            case 0:
                throw new IllegalStateException("This continuation is already complete");
            default:
                return st.c;
        }
    }

    @Override // defpackage.qk
    public final void e(Object obj) {
        switch (this.c) {
            case 0:
                throw new IllegalStateException("This continuation is already complete");
            default:
                return;
        }
    }

    public String toString() {
        switch (this.c) {
            case 0:
                return "This continuation is already complete";
            default:
                return super.toString();
        }
    }

    private final void a(Object obj) {
    }
}
