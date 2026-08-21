package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class zl0 {
    public static final zl0 c;
    public static final zl0 d;
    public static final zl0 e;
    public static final /* synthetic */ zl0[] f;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, zl0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, zl0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, zl0] */
    static {
        ?? r0 = new Enum("NETWORK_UNMETERED", 0);
        c = r0;
        ?? r1 = new Enum("DEVICE_IDLE", 1);
        d = r1;
        ?? r2 = new Enum("DEVICE_CHARGING", 2);
        e = r2;
        f = new zl0[]{r0, r1, r2};
    }

    public static zl0 valueOf(String str) {
        return (zl0) Enum.valueOf(zl0.class, str);
    }

    public static zl0[] values() {
        return (zl0[]) f.clone();
    }
}
