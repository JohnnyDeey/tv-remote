package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class jl {
    public static final jl c;
    public static final jl d;
    public static final jl e;
    public static final jl f;
    public static final jl g;
    public static final /* synthetic */ jl[] h;

    /* JADX WARN: Type inference failed for: r0v0, types: [jl, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [jl, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [jl, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [jl, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v2, types: [jl, java.lang.Enum] */
    static {
        ?? r0 = new Enum("CPU_ACQUIRED", 0);
        c = r0;
        ?? r1 = new Enum("BLOCKING", 1);
        d = r1;
        ?? r2 = new Enum("PARKING", 2);
        e = r2;
        ?? r3 = new Enum("DORMANT", 3);
        f = r3;
        ?? r4 = new Enum("TERMINATED", 4);
        g = r4;
        h = new jl[]{r0, r1, r2, r3, r4};
    }

    public static jl valueOf(String str) {
        return (jl) Enum.valueOf(jl.class, str);
    }

    public static jl[] values() {
        return (jl[]) h.clone();
    }
}
