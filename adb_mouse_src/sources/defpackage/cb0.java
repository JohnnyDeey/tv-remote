package defpackage;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class cb0 {
    public final k00 a;
    public final int b;

    public cb0(int i) {
        switch (i) {
            case 1:
                this.a = new k00();
                this.b = 2;
                return;
            default:
                this.a = new k00();
                this.b = 1;
                return;
        }
    }

    public String a(int i, int i2, boolean z, boolean z2) {
        int i3;
        if (Math.abs(i) < 128) {
            if (Math.abs(i2) < 128) {
                if (Math.abs(0) < 128) {
                    if (z2) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i4 = (z ? 1 : 0) | i3;
                    if (i < 0) {
                        i += 256;
                    }
                    if (i2 < 0) {
                        i2 += 256;
                    }
                    return this.a.c(q80.T(new td0("id", Integer.valueOf(this.b)), new td0("command", "report"), new td0("report", new int[]{i4, i, i2, 0})));
                }
                c.k("Failed requirement.");
                return null;
            }
            c.k("Failed requirement.");
            return null;
        }
        c.k("Failed requirement.");
        return null;
    }

    public String b(int[] iArr) {
        return this.a.c(q80.T(new td0("id", Integer.valueOf(this.b)), new td0("command", "report"), new td0("report", iArr)));
    }
}
