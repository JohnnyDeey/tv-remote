package defpackage;

import java.security.KeyPair;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class m3 extends po {
    public final /* synthetic */ rd g;
    public final /* synthetic */ KeyPair h;
    public final /* synthetic */ byte[] i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(rd rdVar, KeyPair keyPair, byte[] bArr) {
        super(rdVar);
        this.g = rdVar;
        this.h = keyPair;
        this.i = bArr;
    }

    @Override // defpackage.po
    public final l3 b() {
        return new l3(this, this.g, this.h, this.i, 0);
    }

    @Override // defpackage.po
    public final int[] d() {
        return new int[]{4865, 4866, 4867};
    }

    @Override // defpackage.po
    public final xf0[] e() {
        return new xf0[]{xf0.g};
    }
}
