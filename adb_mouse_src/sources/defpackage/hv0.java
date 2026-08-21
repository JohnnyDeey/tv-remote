package defpackage;

import java.util.UUID;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public class hv0 extends pu0 {
    @Override // defpackage.pu0
    public final void b(g40 g40Var, Object obj) {
        String uuid;
        UUID uuid2 = (UUID) obj;
        if (uuid2 == null) {
            uuid = null;
        } else {
            uuid = uuid2.toString();
        }
        g40Var.q(uuid);
    }
}
