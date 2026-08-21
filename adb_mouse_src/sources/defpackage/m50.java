package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class m50 {
    public static final m50 c;
    public static final m50 d;
    public static final m50 e;
    public static final m50 f;
    public static final m50 g;
    public static final /* synthetic */ m50[] h;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, m50] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, m50] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, m50] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, m50] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, m50] */
    static {
        ?? r0 = new Enum("DESTROYED", 0);
        c = r0;
        ?? r1 = new Enum("INITIALIZED", 1);
        d = r1;
        ?? r2 = new Enum("CREATED", 2);
        e = r2;
        ?? r3 = new Enum("STARTED", 3);
        f = r3;
        ?? r4 = new Enum("RESUMED", 4);
        g = r4;
        h = new m50[]{r0, r1, r2, r3, r4};
    }

    public static m50 valueOf(String str) {
        return (m50) Enum.valueOf(m50.class, str);
    }

    public static m50[] values() {
        return (m50[]) h.clone();
    }
}
