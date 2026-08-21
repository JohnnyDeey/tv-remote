package defpackage;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public abstract class tr0 {
    public static final ThreadLocal a = new ThreadLocal();

    public static pu a() {
        ThreadLocal threadLocal = a;
        pu puVar = (pu) threadLocal.get();
        if (puVar == null) {
            ud udVar = new ud(Thread.currentThread());
            threadLocal.set(udVar);
            return udVar;
        }
        return puVar;
    }
}
