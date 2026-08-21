package defpackage;

import android.view.View;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class z50 {
    public ws a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;

    public z50() {
        c();
    }

    public final void a() {
        int k;
        boolean z = this.d;
        ws wsVar = this.a;
        if (z) {
            k = wsVar.g();
        } else {
            k = wsVar.k();
        }
        this.c = k;
    }

    public final void b(View view, int i) {
        int l;
        ws wsVar = this.a;
        int i2 = 0;
        if (Integer.MIN_VALUE == wsVar.a) {
            l = 0;
        } else {
            l = wsVar.l() - wsVar.a;
        }
        if (l >= 0) {
            boolean z = this.d;
            ws wsVar2 = this.a;
            if (z) {
                int b = wsVar2.b(view);
                ws wsVar3 = this.a;
                if (Integer.MIN_VALUE != wsVar3.a) {
                    i2 = wsVar3.l() - wsVar3.a;
                }
                this.c = i2 + b;
            } else {
                this.c = wsVar2.e(view);
            }
            this.b = i;
            return;
        }
        this.b = i;
        boolean z2 = this.d;
        ws wsVar4 = this.a;
        if (z2) {
            int g = (wsVar4.g() - l) - this.a.b(view);
            this.c = this.a.g() - g;
            if (g > 0) {
                int c = this.c - this.a.c(view);
                int k = this.a.k();
                int min = c - (Math.min(this.a.e(view) - k, 0) + k);
                if (min < 0) {
                    this.c = Math.min(g, -min) + this.c;
                    return;
                }
                return;
            }
            return;
        }
        int e = wsVar4.e(view);
        int k2 = e - this.a.k();
        this.c = e;
        if (k2 > 0) {
            int g2 = (this.a.g() - Math.min(0, (this.a.g() - l) - this.a.b(view))) - (this.a.c(view) + e);
            if (g2 < 0) {
                this.c -= Math.min(k2, -g2);
            }
        }
    }

    public final void c() {
        this.b = -1;
        this.c = Integer.MIN_VALUE;
        this.d = false;
        this.e = false;
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.b + ", mCoordinate=" + this.c + ", mLayoutFromEnd=" + this.d + ", mValid=" + this.e + '}';
    }
}
