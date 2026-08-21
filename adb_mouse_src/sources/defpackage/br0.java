package defpackage;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class br0 extends yq0 {
    public final Runnable e;

    public br0(Runnable runnable, long j, boolean z) {
        super(j, z);
        this.e = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.run();
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.e;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(mn.r(runnable));
        sb.append(", ");
        sb.append(this.c);
        sb.append(", ");
        if (this.d) {
            str = "Blocking";
        } else {
            str = "Non-blocking";
        }
        sb.append(str);
        sb.append(']');
        return sb.toString();
    }
}
