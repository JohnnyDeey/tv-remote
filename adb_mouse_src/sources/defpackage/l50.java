package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class l50 {
    private static final /* synthetic */ l50[] $VALUES;
    public static final j50 Companion;
    public static final l50 ON_ANY;
    public static final l50 ON_CREATE;
    public static final l50 ON_DESTROY;
    public static final l50 ON_PAUSE;
    public static final l50 ON_RESUME;
    public static final l50 ON_START;
    public static final l50 ON_STOP;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, l50] */
    /* JADX WARN: Type inference failed for: r0v2, types: [j50, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, l50] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, l50] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, l50] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, l50] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, l50] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Enum, l50] */
    static {
        ?? r0 = new Enum("ON_CREATE", 0);
        ON_CREATE = r0;
        ?? r1 = new Enum("ON_START", 1);
        ON_START = r1;
        ?? r2 = new Enum("ON_RESUME", 2);
        ON_RESUME = r2;
        ?? r3 = new Enum("ON_PAUSE", 3);
        ON_PAUSE = r3;
        ?? r4 = new Enum("ON_STOP", 4);
        ON_STOP = r4;
        ?? r5 = new Enum("ON_DESTROY", 5);
        ON_DESTROY = r5;
        ?? r6 = new Enum("ON_ANY", 6);
        ON_ANY = r6;
        $VALUES = new l50[]{r0, r1, r2, r3, r4, r5, r6};
        Companion = new Object();
    }

    public static l50 valueOf(String str) {
        return (l50) Enum.valueOf(l50.class, str);
    }

    public static l50[] values() {
        return (l50[]) $VALUES.clone();
    }

    public final m50 a() {
        switch (k50.a[ordinal()]) {
            case 1:
            case 2:
                return m50.e;
            case 3:
            case 4:
                return m50.f;
            case 5:
                return m50.g;
            case 6:
                return m50.c;
            default:
                throw new IllegalArgumentException(this + " has no target state");
        }
    }
}
