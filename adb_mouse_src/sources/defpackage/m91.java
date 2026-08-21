package defpackage;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class m91 extends x71 {
    private static final m91 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;
    private int zzh;

    static {
        m91 m91Var = new m91();
        zzb = m91Var;
        x71.f(m91.class, m91Var);
    }

    public static /* synthetic */ void q(m91 m91Var, int i) {
        m91Var.zzg = i - 1;
        m91Var.zzd |= 1;
    }

    public static h91 r() {
        return (h91) zzb.k();
    }

    public static void t(m91 m91Var, q91 q91Var) {
        m91Var.zzh = q91Var.c;
        m91Var.zzd |= 2;
    }

    public static /* synthetic */ void u(m91 m91Var, z91 z91Var) {
        m91Var.zzf = z91Var;
        m91Var.zze = 4;
    }

    public static /* synthetic */ void v(m91 m91Var, ha1 ha1Var) {
        m91Var.zzf = ha1Var;
        m91Var.zze = 3;
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
                return new m91();
            }
            return new t81(zzb, "\u0004\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005᠌\u0001", new Object[]{"zzf", "zze", "zzd", "zzg", g71.c, v91.class, ha1.class, z91.class, "zzh", g71.e});
        }
        return (byte) 1;
    }

    public final z91 s() {
        if (this.zze == 4) {
            return (z91) this.zzf;
        }
        return z91.q();
    }
}
