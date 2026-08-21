package defpackage;

import androidx.activity.b;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class gd0 implements ef {
    public final ox c;
    public final /* synthetic */ b d;

    public gd0(b bVar, ox oxVar) {
        oxVar.getClass();
        this.d = bVar;
        this.c = oxVar;
    }

    @Override // defpackage.ef
    public final void cancel() {
        b bVar = this.d;
        h8 h8Var = bVar.b;
        ox oxVar = this.c;
        h8Var.remove(oxVar);
        if (k20.c(bVar.c, oxVar)) {
            oxVar.getClass();
            bVar.c = null;
        }
        oxVar.getClass();
        oxVar.b.remove(this);
        ky kyVar = oxVar.c;
        if (kyVar != null) {
            kyVar.a();
        }
        oxVar.c = null;
    }
}
