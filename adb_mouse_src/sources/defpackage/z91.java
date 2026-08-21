package defpackage;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class z91 extends x71 {
    private static final z91 zzb;
    private int zzd;
    private a81 zze = s81.g;
    private String zzf = "";
    private boolean zzg;

    static {
        z91 z91Var = new z91();
        zzb = z91Var;
        x71.f(z91.class, z91Var);
    }

    public static z91 q() {
        return zzb;
    }

    public static /* synthetic */ void r(z91 z91Var, boolean z) {
        z91Var.zzd |= 2;
        z91Var.zzg = z;
    }

    @Override // defpackage.x71
    public final Object j(int i) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 == 5) {
                            return zzb;
                        }
                        throw null;
                    }
                    return new w71(zzb);
                }
                return new z91();
            }
            return new t81(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဇ\u0001", new Object[]{"zzd", "zze", y91.class, "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
