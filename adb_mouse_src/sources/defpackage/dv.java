package defpackage;

/* loaded from: classes.dex */
public final class dv {
    public static final dv c = new dv("falcon-512", 9);
    public static final dv d = new dv("falcon-1024", 10);
    public final String a;
    public final int b;

    public dv(String str, int i) {
        if (i >= 1 && i <= 10) {
            this.a = str;
            this.b = i;
        } else {
            c.k("Log N degree should be between 1 and 10");
            throw null;
        }
    }
}
