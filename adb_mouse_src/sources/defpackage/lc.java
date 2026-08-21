package defpackage;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class lc extends oj {
    public int j;
    public int k;
    public mc l;

    public boolean getAllowsGoneWidget() {
        return this.l.t0;
    }

    public int getMargin() {
        return this.l.u0;
    }

    public int getType() {
        return this.j;
    }

    @Override // defpackage.oj
    public final void h(ak akVar, boolean z) {
        int i = this.j;
        this.k = i;
        if (z) {
            if (i == 5) {
                this.k = 1;
            } else if (i == 6) {
                this.k = 0;
            }
        } else if (i == 5) {
            this.k = 0;
        } else if (i == 6) {
            this.k = 1;
        }
        if (akVar instanceof mc) {
            ((mc) akVar).s0 = this.k;
        }
    }

    public void setAllowsGoneWidget(boolean z) {
        this.l.t0 = z;
    }

    public void setDpMargin(int i) {
        this.l.u0 = (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.l.u0 = i;
    }

    public void setType(int i) {
        this.j = i;
    }
}
