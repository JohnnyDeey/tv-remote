package defpackage;

import android.os.Build;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class t91 extends x71 {
    private static final t91 zzb;
    private int zzd;
    private int zzh;
    private long zzi;
    private long zzj;
    private boolean zzk;
    private int zzl;
    private int zzm;
    private long zzn;
    private int zzs;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzo = "";
    private String zzp = "";
    private String zzq = "";
    private String zzr = "";

    static {
        t91 t91Var = new t91();
        zzb = t91Var;
        x71.f(t91.class, t91Var);
    }

    public static s91 A() {
        return (s91) zzb.k();
    }

    public static /* synthetic */ void B(t91 t91Var, int i) {
        t91Var.zzd |= 128;
        t91Var.zzl = i;
    }

    public static /* synthetic */ void C(t91 t91Var, int i) {
        t91Var.zzd |= 256;
        t91Var.zzm = i;
    }

    public static /* synthetic */ void D(t91 t91Var, int i) {
        t91Var.zzd |= 8;
        t91Var.zzh = i;
    }

    public static /* synthetic */ void E(t91 t91Var, long j) {
        t91Var.zzd |= 16;
        t91Var.zzi = j;
    }

    public static /* synthetic */ void F(t91 t91Var, long j) {
        t91Var.zzd |= 32;
        t91Var.zzj = j;
    }

    public static /* synthetic */ void q(t91 t91Var) {
        t91Var.zzd |= 512;
        t91Var.zzn = 846465066L;
    }

    public static /* synthetic */ void r(t91 t91Var, String str) {
        str.getClass();
        t91Var.zzd |= 4;
        t91Var.zzg = str;
    }

    public static /* synthetic */ void s(t91 t91Var) {
        String str = Build.BRAND;
        str.getClass();
        t91Var.zzd |= 1024;
        t91Var.zzo = str;
    }

    public static /* synthetic */ void t(t91 t91Var) {
        String str = Build.FINGERPRINT;
        str.getClass();
        t91Var.zzd |= 8192;
        t91Var.zzr = str;
    }

    public static /* synthetic */ void u(t91 t91Var) {
        String str = Build.MANUFACTURER;
        str.getClass();
        t91Var.zzd |= 4096;
        t91Var.zzq = str;
    }

    public static /* synthetic */ void v(t91 t91Var) {
        String str = Build.MODEL;
        str.getClass();
        t91Var.zzd |= 2048;
        t91Var.zzp = str;
    }

    public static /* synthetic */ void w(t91 t91Var, int i) {
        t91Var.zzd |= 16384;
        t91Var.zzs = i;
    }

    public static /* synthetic */ void x(t91 t91Var) {
        t91Var.zzd |= 64;
        t91Var.zzk = false;
    }

    public static /* synthetic */ void y(t91 t91Var) {
        t91Var.zzd |= 1;
        t91Var.zze = "8.3.0";
    }

    public static /* synthetic */ void z(t91 t91Var, String str) {
        t91Var.zzd |= 2;
        t91Var.zzf = str;
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
                return new t91();
            }
            return new t81(zzb, "\u0004\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0002\u0003င\u0003\u0004ဂ\u0004\u0005ဈ\u0001\u0006ဂ\u0005\u0007ဇ\u0006\bင\u0007\tင\b\nဂ\t\u000bဈ\n\fဈ\u000b\rဈ\f\u000eဈ\r\u000fင\u000e", new Object[]{"zzd", "zze", "zzg", "zzh", "zzi", "zzf", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs"});
        }
        return (byte) 1;
    }
}
