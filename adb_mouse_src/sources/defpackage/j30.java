package defpackage;

/* loaded from: classes.dex */
public final class j30 implements rs0 {
    public final /* synthetic */ int c;
    public final rd d;

    public /* synthetic */ j30(rd rdVar, int i) {
        this.c = i;
        this.d = rdVar;
    }

    @Override // defpackage.rs0
    public final fs0 j() {
        switch (this.c) {
            case 0:
                return new g30(2, this);
            default:
                return new g30(3, this);
        }
    }
}
