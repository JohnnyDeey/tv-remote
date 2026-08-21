package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class gr {
    public static final gr c;
    public static final gr d;
    public static final gr e;
    public static final gr f;
    public static final gr g;
    public static final gr h;
    public static final /* synthetic */ gr[] i;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, gr] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, gr] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, gr] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, gr] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, gr] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, gr] */
    static {
        ?? r0 = new Enum("NONE", 0);
        c = r0;
        ?? r1 = new Enum("CENTER", 1);
        d = r1;
        ?? r2 = new Enum("UP", 2);
        e = r2;
        ?? r3 = new Enum("RIGHT", 3);
        f = r3;
        ?? r4 = new Enum("DOWN", 4);
        g = r4;
        ?? r5 = new Enum("LEFT", 5);
        h = r5;
        i = new gr[]{r0, r1, r2, r3, r4, r5};
    }

    public static gr valueOf(String str) {
        return (gr) Enum.valueOf(gr.class, str);
    }

    public static gr[] values() {
        return (gr[]) i.clone();
    }
}
