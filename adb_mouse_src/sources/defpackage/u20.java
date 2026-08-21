package defpackage;

import java.security.Signature;

/* loaded from: classes.dex */
public final class u20 {
    public final Signature a;
    public final ho0 b;

    public u20(Signature signature, int i) {
        this.a = signature;
        switch (i) {
            case 1:
                ho0 ho0Var = new ho0();
                ho0Var.d = signature;
                this.b = ho0Var;
                return;
            default:
                ho0 ho0Var2 = new ho0();
                ho0Var2.d = signature;
                this.b = ho0Var2;
                return;
        }
    }
}
