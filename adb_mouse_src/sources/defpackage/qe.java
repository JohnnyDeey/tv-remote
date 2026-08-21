package defpackage;

/* loaded from: classes.dex */
public final class qe {
    public static final qe d = new qe("mceliece348864", 12, 3488, 64, false);
    public static final qe e = new qe("mceliece348864f", 12, 3488, 64, true);
    public static final qe f = new qe("mceliece460896", 13, 4608, 96, false);
    public static final qe g = new qe("mceliece460896f", 13, 4608, 96, true);
    public static final qe h = new qe("mceliece6688128", 13, 6688, 128, false);
    public static final qe i = new qe("mceliece6688128f", 13, 6688, 128, true);
    public static final qe j = new qe("mceliece6960119", 13, 6960, 119, false);
    public static final qe k = new qe("mceliece6960119f", 13, 6960, 119, true);
    public static final qe l = new qe("mceliece8192128", 13, 8192, 128, false);
    public static final qe m = new qe("mceliece8192128f", 13, 8192, 128, true);
    public final String a;
    public final int b;
    public final pe c;

    /* JADX WARN: Type inference failed for: r2v1, types: [pe, java.lang.Object] */
    public qe(String str, int i2, int i3, int i4, boolean z) {
        nz nzVar;
        this.a = str;
        this.b = i4;
        ?? obj = new Object();
        obj.j = z;
        obj.a = i3;
        obj.b = i4;
        obj.c = i2;
        obj.d = i4 * 2;
        int i5 = i4 * i2;
        obj.e = i5;
        obj.f = i3 - i5;
        char c = 1;
        obj.g = (1 << i2) - 1;
        int i6 = 0;
        if (i2 == 12) {
            nzVar = new nz(i6);
        } else {
            nzVar = new nz(c == true ? 1 : 0);
        }
        obj.h = nzVar;
        obj.i = i4 % 8 != 0;
        this.c = obj;
    }
}
