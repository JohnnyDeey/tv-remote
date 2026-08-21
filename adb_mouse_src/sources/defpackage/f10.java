package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class f10 extends d01 {
    @Override // defpackage.xo
    public final void a(xo xoVar) {
        mc mcVar = (mc) this.b;
        int i = mcVar.s0;
        zo zoVar = this.h;
        ArrayList arrayList = zoVar.l;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = -1;
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            int i5 = ((zo) obj).g;
            if (i3 == -1 || i5 < i3) {
                i3 = i5;
            }
            if (i2 < i5) {
                i2 = i5;
            }
        }
        if (i != 0 && i != 2) {
            zoVar.d(i2 + mcVar.u0);
        } else {
            zoVar.d(i3 + mcVar.u0);
        }
    }

    @Override // defpackage.d01
    public final void d() {
        ak akVar = this.b;
        if (akVar instanceof mc) {
            zo zoVar = this.h;
            zoVar.b = true;
            ArrayList arrayList = zoVar.l;
            mc mcVar = (mc) akVar;
            int i = mcVar.s0;
            boolean z = mcVar.t0;
            int i2 = 0;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            zoVar.e = 7;
                            while (i2 < mcVar.r0) {
                                ak akVar2 = mcVar.q0[i2];
                                if (z || akVar2.g0 != 8) {
                                    zo zoVar2 = akVar2.e.i;
                                    zoVar2.k.add(zoVar);
                                    arrayList.add(zoVar2);
                                }
                                i2++;
                            }
                            m(this.b.e.h);
                            m(this.b.e.i);
                            return;
                        }
                        return;
                    }
                    zoVar.e = 6;
                    while (i2 < mcVar.r0) {
                        ak akVar3 = mcVar.q0[i2];
                        if (z || akVar3.g0 != 8) {
                            zo zoVar3 = akVar3.e.h;
                            zoVar3.k.add(zoVar);
                            arrayList.add(zoVar3);
                        }
                        i2++;
                    }
                    m(this.b.e.h);
                    m(this.b.e.i);
                    return;
                }
                zoVar.e = 5;
                while (i2 < mcVar.r0) {
                    ak akVar4 = mcVar.q0[i2];
                    if (z || akVar4.g0 != 8) {
                        zo zoVar4 = akVar4.d.i;
                        zoVar4.k.add(zoVar);
                        arrayList.add(zoVar4);
                    }
                    i2++;
                }
                m(this.b.d.h);
                m(this.b.d.i);
                return;
            }
            zoVar.e = 4;
            while (i2 < mcVar.r0) {
                ak akVar5 = mcVar.q0[i2];
                if (z || akVar5.g0 != 8) {
                    zo zoVar5 = akVar5.d.h;
                    zoVar5.k.add(zoVar);
                    arrayList.add(zoVar5);
                }
                i2++;
            }
            m(this.b.d.h);
            m(this.b.d.i);
        }
    }

    @Override // defpackage.d01
    public final void e() {
        ak akVar = this.b;
        if (akVar instanceof mc) {
            int i = ((mc) akVar).s0;
            zo zoVar = this.h;
            if (i != 0 && i != 1) {
                akVar.Z = zoVar.g;
            } else {
                akVar.Y = zoVar.g;
            }
        }
    }

    @Override // defpackage.d01
    public final void f() {
        this.c = null;
        this.h.c();
    }

    @Override // defpackage.d01
    public final boolean k() {
        return false;
    }

    public final void m(zo zoVar) {
        zo zoVar2 = this.h;
        zoVar2.k.add(zoVar);
        zoVar.l.add(zoVar2);
    }
}
