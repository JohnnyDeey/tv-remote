package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class ml {
    public static final ml c;
    public static final /* synthetic */ ml[] d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, ml] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, ml] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, ml] */
    static {
        ?? r0 = new Enum("COROUTINE_SUSPENDED", 0);
        c = r0;
        d = new ml[]{r0, new Enum("UNDECIDED", 1), new Enum("RESUMED", 2)};
    }

    public static ml valueOf(String str) {
        return (ml) Enum.valueOf(ml.class, str);
    }

    public static ml[] values() {
        return (ml[]) d.clone();
    }
}
