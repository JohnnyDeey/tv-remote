package defpackage;

import java.security.PrivateKey;

/* loaded from: classes.dex */
public final class x20 extends z20 {
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x20(rd rdVar, PrivateKey privateKey, short s, String str, int i) {
        super(rdVar, privateKey, s, str, 0);
        this.h = i;
    }

    @Override // defpackage.z20, defpackage.et0
    public u20 h(go0 go0Var) {
        switch (this.h) {
            case 0:
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
                        PrivateKey privateKey = (PrivateKey) this.e;
                        return this.d.u(r21.v(go0Var), null, privateKey, true);
                    case 2:
                        return null;
                }
            default:
                return super.h(go0Var);
        }
    }
}
