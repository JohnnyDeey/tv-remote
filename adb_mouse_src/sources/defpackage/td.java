package defpackage;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class td {
    public int a;
    public int b;
    public String c;

    public static sd a() {
        sd sdVar = new sd();
        sdVar.c = 0;
        sdVar.d = "";
        return sdVar;
    }

    public final String toString() {
        x41 x41Var;
        int i = this.a;
        int i2 = m51.a;
        u51 u51Var = x41.e;
        Integer valueOf = Integer.valueOf(i);
        if (!u51Var.containsKey(valueOf)) {
            x41Var = x41.RESPONSE_CODE_UNSPECIFIED;
        } else {
            x41Var = (x41) u51Var.get(valueOf);
        }
        return "Response Code: " + x41Var.toString() + ", Debug Message: " + this.c;
    }
}
