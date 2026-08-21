package defpackage;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class ax {
    public static final ax d = new ax("", "", false);
    public final String a;
    public final String b;
    public final boolean c;

    static {
        new ax("\n", "  ", true);
    }

    public ax(String str, String str2, boolean z) {
        if (str.matches("[\r\n]*")) {
            if (str2.matches("[ \t]*")) {
                this.a = str;
                this.b = str2;
                this.c = z;
                return;
            }
            c.k("Only combinations of spaces and tabs are allowed in indent.");
            throw null;
        }
        c.k("Only combinations of \\n and \\r are allowed in newline.");
        throw null;
    }
}
