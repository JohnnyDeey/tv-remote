package defpackage;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public abstract /* synthetic */ class o61 {
    public static final /* synthetic */ int a = 0;

    static {
        int i = p61.b;
    }

    public static String a(Exception exc) {
        if (exc == null) {
            return null;
        }
        try {
            String simpleName = exc.getClass().getSimpleName();
            String message = exc.getMessage();
            if (message == null) {
                message = "";
            }
            String str = simpleName + ":" + message;
            int i = m51.a;
            if (str.length() > 40) {
                return str.substring(0, 40);
            }
            return str;
        } catch (Throwable th) {
            m51.i("BillingLogger", "Unable to get truncated exception info", th);
            return null;
        }
    }

    public static g91 b(int i, int i2, td tdVar, String str, q91 q91Var) {
        try {
            n91 r = o91.r();
            int i3 = tdVar.a;
            r.b();
            o91.q((o91) r.d, i3);
            String str2 = tdVar.c;
            r.b();
            o91.t((o91) r.d, str2);
            int i4 = tdVar.b;
            if (i4 != 0) {
                r.b();
                o91.v((o91) r.d, i4);
            }
            if (i != 0) {
                r.b();
                o91.w((o91) r.d, i);
            }
            if (str != null) {
                r.b();
                o91.s((o91) r.d, str);
            }
            f91 t = g91.t();
            t.c(r);
            t.b();
            g91.s((g91) t.d, i2);
            if (!q91Var.equals(q91.BROADCAST_ACTION_UNSPECIFIED)) {
                t.b();
                g91.w((g91) t.d, q91Var);
            }
            return (g91) t.a();
        } catch (Throwable th) {
            m51.i("BillingLogger", "Unable to create logging payload", th);
            return null;
        }
    }

    public static m91 c(int i, q91 q91Var) {
        try {
            h91 r = m91.r();
            r.b();
            m91.q((m91) r.d, i);
            if (!q91Var.equals(q91.BROADCAST_ACTION_UNSPECIFIED)) {
                r.b();
                m91.t((m91) r.d, q91Var);
            }
            return (m91) r.a();
        } catch (Exception e) {
            m51.i("BillingLogger", "Unable to create logging payload", e);
            return null;
        }
    }
}
