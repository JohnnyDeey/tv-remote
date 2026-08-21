package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class sl {
    public static final /* synthetic */ sl[] c = {new Enum("AGREEMENT", 0), new Enum("ENCRYPTION", 1), new Enum("DECRYPTION", 2), new Enum("KEYGEN", 3), new Enum("SIGNING", 4), new Enum("VERIFYING", 5), new Enum("AUTHENTICATION", 6), new Enum("VERIFICATION", 7), new Enum("PRF", 8), new Enum("ANY", 9)};

    /* JADX INFO: Fake field, exist only in values array */
    sl EF5;

    public static sl valueOf(String str) {
        return (sl) Enum.valueOf(sl.class, str);
    }

    public static sl[] values() {
        return (sl[]) c.clone();
    }
}
