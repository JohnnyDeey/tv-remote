package defpackage;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class vf0 implements lx0 {
    public boolean a = false;
    public boolean b = false;
    public qv c;
    public final uf0 d;

    public vf0(uf0 uf0Var) {
        this.d = uf0Var;
    }

    @Override // defpackage.lx0
    public final lx0 b(String str) {
        if (!this.a) {
            this.a = true;
            this.d.e(this.c, str, this.b);
            return this;
        }
        throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
    }

    @Override // defpackage.lx0
    public final lx0 c(boolean z) {
        if (!this.a) {
            this.a = true;
            this.d.b(this.c, z ? 1 : 0, this.b);
            return this;
        }
        throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
    }
}
