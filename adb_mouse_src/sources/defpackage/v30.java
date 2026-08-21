package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final /* synthetic */ class v30 implements vc0 {
    public final /* synthetic */ int a;

    @Override // defpackage.zt
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                throw new RuntimeException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                wc0 wc0Var = (wc0) obj2;
                wc0Var.a(uf0.g, entry.getKey());
                wc0Var.a(uf0.h, entry.getValue());
                return;
            default:
                throw new RuntimeException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
