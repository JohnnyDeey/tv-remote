package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class sf0 {
    public static final sf0 c;
    public static final /* synthetic */ sf0[] d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, sf0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, sf0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, sf0] */
    static {
        ?? r0 = new Enum("DEFAULT", 0);
        c = r0;
        d = new sf0[]{r0, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static sf0 valueOf(String str) {
        return (sf0) Enum.valueOf(sf0.class, str);
    }

    public static sf0[] values() {
        return (sf0[]) d.clone();
    }
}
