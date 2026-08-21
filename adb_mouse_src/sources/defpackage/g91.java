package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class g91 extends x71 {
    private static final g91 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;
    private o91 zzh;
    private int zzi;

    static {
        g91 g91Var = new g91();
        zzb = g91Var;
        x71.f(g91.class, g91Var);
    }

    public static /* synthetic */ void q(g91 g91Var, z91 z91Var) {
        g91Var.zzf = z91Var;
        g91Var.zze = 7;
    }

    public static /* synthetic */ void r(g91 g91Var, ha1 ha1Var) {
        g91Var.zzf = ha1Var;
        g91Var.zze = 6;
    }

    public static /* synthetic */ void s(g91 g91Var, int i) {
        g91Var.zzg = i - 1;
        g91Var.zzd |= 1;
    }

    public static f91 t() {
        return (f91) zzb.k();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [k71, java.lang.Object] */
    public static g91 u(byte[] bArr) {
        g91 g91Var = zzb;
        int length = bArr.length;
        t71 t71Var = t71.a;
        int i = j71.a;
        t71 t71Var2 = t71.a;
        if (length != 0) {
            x71 n = g91Var.n();
            try {
                u81 a = r81.c.a(n.getClass());
                ?? obj = new Object();
                t71Var2.getClass();
                a.e(n, bArr, 0, length, obj);
                a.a(n);
                g91Var = n;
            } catch (f81 e) {
                throw e;
            } catch (IOException e2) {
                if (e2.getCause() instanceof f81) {
                    throw ((f81) e2.getCause());
                }
                throw new IOException(e2.getMessage(), e2);
            } catch (IndexOutOfBoundsException unused) {
                f40.m("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return null;
            } catch (w81 e3) {
                f40.m(e3.getMessage());
                return null;
            }
        }
        if (g91Var != null && !x71.i(g91Var, true)) {
            f40.m(new w81().getMessage());
            return null;
        }
        return g91Var;
    }

    public static void w(g91 g91Var, q91 q91Var) {
        g91Var.zzi = q91Var.c;
        g91Var.zzd |= 4;
    }

    public static /* synthetic */ void x(g91 g91Var, o91 o91Var) {
        g91Var.zzh = o91Var;
        g91Var.zzd |= 2;
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
                return new g91();
            }
            return new t81(zzb, "\u0004\u0006\u0001\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0004<\u0000\u0005᠌\u0002\u0006<\u0000\u0007<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", g71.c, "zzh", v91.class, "zzi", g71.e, ha1.class, z91.class});
        }
        return (byte) 1;
    }

    public final z91 v() {
        if (this.zze == 7) {
            return (z91) this.zzf;
        }
        return z91.q();
    }
}
