package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class j61 implements Executor {
    public static final j61 c;
    public static final /* synthetic */ j61[] d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, j61] */
    static {
        ?? r0 = new Enum("INSTANCE", 0);
        c = r0;
        d = new j61[]{r0};
    }

    public static j61[] values() {
        return (j61[]) d.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
