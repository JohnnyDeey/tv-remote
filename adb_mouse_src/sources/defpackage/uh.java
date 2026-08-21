package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class uh {
    public static final uh c;
    public static final /* synthetic */ uh[] d;

    /* JADX INFO: Fake field, exist only in values array */
    uh EF0;

    /* JADX WARN: Type inference failed for: r0v0, types: [uh, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [uh, java.lang.Enum] */
    static {
        ?? r0 = new Enum("UNKNOWN", 0);
        ?? r1 = new Enum("ANDROID_FIREBASE", 1);
        c = r1;
        d = new uh[]{r0, r1};
    }

    public static uh valueOf(String str) {
        return (uh) Enum.valueOf(uh.class, str);
    }

    public static uh[] values() {
        return (uh[]) d.clone();
    }
}
