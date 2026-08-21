package defpackage;

import java.security.PublicKey;

/* loaded from: classes.dex */
public final class y20 extends z20 {
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y20(rd rdVar, PublicKey publicKey, short s, String str, int i) {
        super(rdVar, publicKey, s, str);
        this.h = i;
    }

    @Override // defpackage.z20, defpackage.it0
    public ft0 l(r6 r6Var) {
        switch (this.h) {
            case 0:
                go0 go0Var = (go0) r6Var.d;
                if (go0Var == null || this.f != go0Var.b) {
                    return null;
                }
                switch (go0Var.a) {
                    case 1:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    default:
                        PublicKey publicKey = (PublicKey) this.e;
                        rd rdVar = this.d;
                        rdVar.getClass();
                        return rdVar.v(r21.v(go0Var), null, (byte[]) r6Var.e, publicKey);
                    case 2:
                        return null;
                }
            default:
                return super.l(r6Var);
        }
    }
}
