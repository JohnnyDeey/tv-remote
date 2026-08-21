package defpackage;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class gu0 extends cu0 {
    public final /* synthetic */ int a = 1;
    public bu0 b;

    public gu0(bu0 bu0Var) {
        this.b = bu0Var;
    }

    @Override // defpackage.cu0, defpackage.au0
    public void a(bu0 bu0Var) {
        switch (this.a) {
            case 1:
                m9 m9Var = (m9) this.b;
                if (!m9Var.F) {
                    m9Var.G();
                    m9Var.F = true;
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // defpackage.au0
    public final void d(bu0 bu0Var) {
        switch (this.a) {
            case 0:
                this.b.z();
                bu0Var.x(this);
                return;
            default:
                m9 m9Var = (m9) this.b;
                int i = m9Var.E - 1;
                m9Var.E = i;
                if (i == 0) {
                    m9Var.F = false;
                    m9Var.m();
                }
                bu0Var.x(this);
                return;
        }
    }

    public /* synthetic */ gu0() {
    }
}
