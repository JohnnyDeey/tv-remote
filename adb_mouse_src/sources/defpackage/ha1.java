package defpackage;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class ha1 extends x71 {
    private static final ha1 zzb;
    private int zzd;
    private int zze;
    private boolean zzf;
    private long zzg;
    private boolean zzh;
    private int zzi;
    private int zzj;

    /* JADX WARN: Type inference failed for: r0v0, types: [x71, ha1] */
    static {
        ?? x71Var = new x71();
        zzb = x71Var;
        x71.f(ha1.class, x71Var);
    }

    public static ga1 q() {
        return (ga1) zzb.k();
    }

    public static /* synthetic */ void r(ha1 ha1Var, boolean z) {
        ha1Var.zzd |= 8;
        ha1Var.zzh = z;
    }

    public static /* synthetic */ void s(ha1 ha1Var) {
        ha1Var.zzd |= 16;
        ha1Var.zzi = 0;
    }

    public static /* synthetic */ void t(ha1 ha1Var, long j) {
        ha1Var.zzd |= 4;
        ha1Var.zzg = j;
    }

    public static /* synthetic */ void u(ha1 ha1Var) {
        ha1Var.zzd |= 32;
        ha1Var.zzj = 0;
    }

    public static /* synthetic */ void v(ha1 ha1Var) {
        ha1Var.zzd |= 2;
        ha1Var.zzf = true;
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
            return new t81(zzb, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001\u0003ဂ\u0002\u0004ဇ\u0003\u0005င\u0004\u0006င\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        return (byte) 1;
    }
}
