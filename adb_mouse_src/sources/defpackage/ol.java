package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class ol {
    public static final ol c;
    public static final /* synthetic */ ol[] d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, ol] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, ol] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, ol] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, ol] */
    static {
        ?? r0 = new Enum("DEFAULT", 0);
        c = r0;
        d = new ol[]{r0, new Enum("LAZY", 1), new Enum("ATOMIC", 2), new Enum("UNDISPATCHED", 3)};
    }

    public static ol valueOf(String str) {
        return (ol) Enum.valueOf(ol.class, str);
    }

    public static ol[] values() {
        return (ol[]) d.clone();
    }
}
