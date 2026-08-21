package defpackage;

import androidx.preference.Preference;
import java.util.regex.Pattern;
import svarzee.android.apps.adb_mouse.R;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final /* synthetic */ class fn0 implements je0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ i81 b;
    public final /* synthetic */ ln0 c;

    public /* synthetic */ fn0(ln0 ln0Var, i81 i81Var) {
        this.a = 2;
        this.c = ln0Var;
        this.b = i81Var;
    }

    @Override // defpackage.je0
    public final boolean a(Preference preference, Object obj) {
        int intValue;
        int i = this.a;
        ln0 ln0Var = this.c;
        i81 i81Var = this.b;
        switch (i) {
            case 0:
                if (obj instanceof Integer) {
                    String u = i81Var.u();
                    i81Var.D(u, nf0.a(i81Var.v(u), ((Number) obj).intValue(), false, null, null, 14));
                    return true;
                }
                String l = ln0Var.l(R.string.invalid_ip_address);
                l.getClass();
                ln0Var.N(l);
                return false;
            case 1:
                if (obj instanceof Boolean) {
                    String u2 = i81Var.u();
                    i81Var.D(u2, nf0.a(i81Var.v(u2), 0, ((Boolean) obj).booleanValue(), null, null, 13));
                    return true;
                }
                String l2 = ln0Var.l(R.string.invalid_ip_address);
                l2.getClass();
                ln0Var.N(l2);
                return false;
            case 2:
                if (obj instanceof String) {
                    ki0 ki0Var = ln0Var.e0;
                    ki0Var.getClass();
                    if (((Pattern) ki0Var.d).matcher((CharSequence) obj).matches()) {
                        String u3 = i81Var.u();
                        i81Var.D(u3, nf0.a(i81Var.v(u3), 0, false, (String) obj, null, 11));
                        return true;
                    }
                }
                String l3 = ln0Var.l(R.string.invalid_ip_address);
                l3.getClass();
                ln0Var.N(l3);
                return false;
            default:
                if (obj instanceof String) {
                    i20 i20Var = new i20(1, 65535, 1);
                    String str = (String) obj;
                    Integer Q = fq0.Q(str);
                    if (Q != null && 1 <= (intValue = Q.intValue()) && intValue <= i20Var.d) {
                        String u4 = i81Var.u();
                        i81Var.D(u4, nf0.a(i81Var.v(u4), 0, false, null, str, 7));
                        return true;
                    }
                }
                String l4 = ln0Var.l(R.string.invalid_port_number);
                l4.getClass();
                ln0Var.N(l4);
                return false;
        }
    }

    public /* synthetic */ fn0(i81 i81Var, ln0 ln0Var, int i) {
        this.a = i;
        this.b = i81Var;
        this.c = ln0Var;
    }
}
