package defpackage;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class ea1 extends x71 {
    private static final ea1 zzb;
    private int zzd;
    private o91 zze;
    private long zzf;

    /* JADX WARN: Type inference failed for: r0v0, types: [x71, ea1] */
    static {
        ?? x71Var = new x71();
        zzb = x71Var;
        x71.f(ea1.class, x71Var);
    }

    public static da1 q() {
        return (da1) zzb.k();
    }

    public static /* synthetic */ void r(ea1 ea1Var, o91 o91Var) {
        ea1Var.zze = o91Var;
        ea1Var.zzd |= 1;
    }

    public static /* synthetic */ void s(ea1 ea1Var, long j) {
        ea1Var.zzd |= 2;
        ea1Var.zzf = j;
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
                return new x71();
            }
            return new t81(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
