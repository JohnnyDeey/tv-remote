package defpackage;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class qt0 extends gi0 {
    public final /* synthetic */ int i;
    public boolean j;
    public int k;
    public final /* synthetic */ Object l;

    public qt0(ez0 ez0Var) {
        this.i = 1;
        this.l = ez0Var;
        this.j = false;
        this.k = 0;
    }

    @Override // defpackage.fz0
    public final void a() {
        int i = this.i;
        Object obj = this.l;
        switch (i) {
            case 0:
                if (!this.j) {
                    ((rt0) obj).a.setVisibility(this.k);
                    return;
                }
                return;
            default:
                int i2 = this.k + 1;
                this.k = i2;
                ez0 ez0Var = (ez0) obj;
                if (i2 == ez0Var.a.size()) {
                    fz0 fz0Var = ez0Var.d;
                    if (fz0Var != null) {
                        fz0Var.a();
                    }
                    this.k = 0;
                    this.j = false;
                    ez0Var.e = false;
                    return;
                }
                return;
        }
    }

    @Override // defpackage.gi0, defpackage.fz0
    public void b() {
        switch (this.i) {
            case 0:
                this.j = true;
                return;
            default:
                return;
        }
    }

    @Override // defpackage.gi0, defpackage.fz0
    public final void c() {
        int i = this.i;
        Object obj = this.l;
        switch (i) {
            case 0:
                ((rt0) obj).a.setVisibility(0);
                return;
            default:
                if (!this.j) {
                    this.j = true;
                    fz0 fz0Var = ((ez0) obj).d;
                    if (fz0Var != null) {
                        fz0Var.c();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public qt0(rt0 rt0Var, int i) {
        this.i = 0;
        this.l = rt0Var;
        this.k = i;
        this.j = false;
    }
}
