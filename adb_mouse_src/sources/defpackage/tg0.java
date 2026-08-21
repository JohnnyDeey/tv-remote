package defpackage;

/* loaded from: classes.dex */
public final class tg0 {
    public static final tg0 h = new tg0(3, 1);
    public static final tg0 i = new tg0(3, 2);
    public static final tg0 j = new tg0(3, 3);
    public static final tg0 k = new tg0(5, 1);
    public static final tg0 l = new tg0(5, 2);
    public static final tg0 m = new tg0(5, 3);
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final gk0 f;
    public final int g;

    public tg0(int i2, int i3) {
        if (i2 != 3) {
            if (i2 == 5) {
                this.a = 96;
                this.b = 36;
                this.c = 64;
                this.f = new gk0(1);
            } else {
                c.k("No valid version. Please choose one of the following: 3, 5");
                throw null;
            }
        } else {
            this.a = 68;
            this.b = 32;
            this.c = 48;
            gk0 gk0Var = new gk0(0);
            mi0.s(gk0Var);
            wl.a();
            gk0Var.l();
            this.f = gk0Var;
        }
        int i4 = this.a;
        int i5 = this.b;
        int i6 = this.c;
        this.d = i4 + i5 + i6;
        this.e = i5 + i6;
        this.g = i3;
    }
}
