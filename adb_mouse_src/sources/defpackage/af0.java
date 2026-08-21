package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class af0 {
    public static final af0 c;
    public static final af0 d;
    public static final af0 e;
    public static final /* synthetic */ af0[] f;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, af0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, af0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, af0] */
    static {
        ?? r0 = new Enum("DEFAULT", 0);
        c = r0;
        ?? r1 = new Enum("VERY_LOW", 1);
        d = r1;
        ?? r2 = new Enum("HIGHEST", 2);
        e = r2;
        f = new af0[]{r0, r1, r2};
    }

    public static af0 valueOf(String str) {
        return (af0) Enum.valueOf(af0.class, str);
    }

    public static af0[] values() {
        return (af0[]) f.clone();
    }
}
