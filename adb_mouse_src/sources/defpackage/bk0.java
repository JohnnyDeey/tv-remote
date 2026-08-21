package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class bk0 {
    public d01 a;
    public ArrayList b;

    public static long a(zo zoVar, long j) {
        d01 d01Var = zoVar.d;
        ArrayList arrayList = zoVar.k;
        if (d01Var instanceof f10) {
            return j;
        }
        int size = arrayList.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            xo xoVar = (xo) arrayList.get(i);
            if (xoVar instanceof zo) {
                zo zoVar2 = (zo) xoVar;
                if (zoVar2.d != d01Var) {
                    j2 = Math.min(j2, a(zoVar2, zoVar2.f + j));
                }
            }
        }
        zo zoVar3 = d01Var.i;
        zo zoVar4 = d01Var.h;
        if (zoVar == zoVar3) {
            long j3 = j - d01Var.j();
            return Math.min(Math.min(j2, a(zoVar4, j3)), j3 - zoVar4.f);
        }
        return j2;
    }

    public static long b(zo zoVar, long j) {
        d01 d01Var = zoVar.d;
        ArrayList arrayList = zoVar.k;
        if (d01Var instanceof f10) {
            return j;
        }
        int size = arrayList.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            xo xoVar = (xo) arrayList.get(i);
            if (xoVar instanceof zo) {
                zo zoVar2 = (zo) xoVar;
                if (zoVar2.d != d01Var) {
                    j2 = Math.max(j2, b(zoVar2, zoVar2.f + j));
                }
            }
        }
        zo zoVar3 = d01Var.h;
        zo zoVar4 = d01Var.i;
        if (zoVar == zoVar3) {
            long j3 = d01Var.j() + j;
            return Math.max(Math.max(j2, b(zoVar4, j3)), j3 - zoVar4.f);
        }
        return j2;
    }
}
