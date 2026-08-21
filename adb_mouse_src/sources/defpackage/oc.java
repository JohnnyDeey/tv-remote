package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class oc {
    public static final /* synthetic */ oc[] c = {new Enum("PRESENT", 0), new Enum("ABSENT", 1), new Enum("PRESENT_OPTIONAL", 2), new Enum("ABSENT_OPTIONAL", 3)};

    /* JADX INFO: Fake field, exist only in values array */
    oc EF5;

    public static oc valueOf(String str) {
        return (oc) Enum.valueOf(oc.class, str);
    }

    public static oc[] values() {
        return (oc[]) c.clone();
    }
}
