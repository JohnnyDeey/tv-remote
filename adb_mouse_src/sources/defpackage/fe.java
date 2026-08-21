package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class fe {
    public static final fe c;
    public static final fe d;
    public static final fe e;
    public static final /* synthetic */ fe[] f;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, fe] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, fe] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, fe] */
    static {
        ?? r0 = new Enum("SUSPEND", 0);
        c = r0;
        ?? r1 = new Enum("DROP_OLDEST", 1);
        d = r1;
        ?? r2 = new Enum("DROP_LATEST", 2);
        e = r2;
        f = new fe[]{r0, r1, r2};
    }

    public static fe valueOf(String str) {
        return (fe) Enum.valueOf(fe.class, str);
    }

    public static fe[] values() {
        return (fe[]) f.clone();
    }
}
