package defpackage;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class yd {
    public boolean a;
    public Object b;

    public /* synthetic */ yd(Object obj, boolean z) {
        this.b = obj;
        this.a = z;
    }

    public boolean a() {
        return this.a;
    }

    public boolean b(CharSequence charSequence, int i) {
        if (charSequence != null && i >= 0 && charSequence.length() - i >= 0) {
            if (((vj0) this.b) == null) {
                return a();
            }
            char c = 2;
            for (int i2 = 0; i2 < i && c == 2; i2++) {
                byte directionality = Character.getDirectionality(charSequence.charAt(i2));
                yd ydVar = jr0.a;
                if (directionality != 0) {
                    if (directionality != 1 && directionality != 2) {
                        switch (directionality) {
                            case 14:
                            case 15:
                                break;
                            case 16:
                            case 17:
                                break;
                            default:
                                c = 2;
                                break;
                        }
                    }
                    c = 0;
                }
                c = 1;
            }
            if (c == 0) {
                return true;
            }
            if (c == 1) {
                return false;
            }
            return a();
        }
        throw new IllegalArgumentException();
    }

    public void c(ba1 ba1Var) {
        if (this.a) {
            m51.h("BillingLogger", "Skipping logging since initialization failed.");
            return;
        }
        try {
            ((b8) this.b).R(new s9(ba1Var));
        } catch (Throwable unused) {
            m51.h("BillingLogger", "logging failed.");
        }
    }

    public yd(vj0 vj0Var, boolean z) {
        this.b = vj0Var;
        this.a = z;
    }
}
