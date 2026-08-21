package defpackage;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class o91 extends x71 {
    private static final o91 zzb;
    private int zzd;
    private int zze;
    private int zzg;
    private int zzi;
    private int zzj;
    private String zzf = "";
    private String zzh = "";

    static {
        o91 o91Var = new o91();
        zzb = o91Var;
        x71.f(o91.class, o91Var);
    }

    public static /* synthetic */ void q(o91 o91Var, int i) {
        o91Var.zzd |= 1;
        o91Var.zze = i;
    }

    public static n91 r() {
        return (n91) zzb.k();
    }

    public static /* synthetic */ void s(o91 o91Var, String str) {
        o91Var.zzd |= 8;
        o91Var.zzh = str;
    }

    public static /* synthetic */ void t(o91 o91Var, String str) {
        str.getClass();
        o91Var.zzd |= 2;
        o91Var.zzf = str;
    }

    public static /* synthetic */ void u(o91 o91Var) {
        o91Var.zzd |= 32;
        o91Var.zzj = 0;
    }

    public static /* synthetic */ void v(o91 o91Var, int i) {
        o91Var.zzd |= 16;
        o91Var.zzi = i;
    }

    public static void w(o91 o91Var, int i) {
        o91Var.zzg = qo0.h(i);
        o91Var.zzd |= 4;
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
                return new o91();
            }
            return new t81(zzb, "\u0004\u0006\u0000\u0001\u0001\b\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0004᠌\u0002\u0005ဈ\u0003\u0007င\u0004\bင\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", g71.d, "zzh", "zzi", "zzj"});
        }
        return (byte) 1;
    }
}
