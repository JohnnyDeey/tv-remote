package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class c01 {
    public static int f;
    public ArrayList a;
    public int b;
    public int c;
    public ArrayList d;
    public int e;

    public final void a(ArrayList arrayList) {
        int size = this.a.size();
        if (this.e != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                c01 c01Var = (c01) arrayList.get(i);
                if (this.e == c01Var.b) {
                    c(this.c, c01Var);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int b(e60 e60Var, int i) {
        int n;
        int n2;
        ArrayList arrayList = this.a;
        if (arrayList.size() == 0) {
            return 0;
        }
        bk bkVar = (bk) ((ak) arrayList.get(0)).T;
        e60Var.t();
        bkVar.b(e60Var, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((ak) arrayList.get(i2)).b(e60Var, false);
        }
        if (i == 0 && bkVar.z0 > 0) {
            wv0.i(bkVar, e60Var, arrayList, 0);
        }
        if (i == 1 && bkVar.A0 > 0) {
            wv0.i(bkVar, e60Var, arrayList, 1);
        }
        try {
            e60Var.p();
        } catch (Exception e) {
            System.err.println(e.toString() + "\n" + Arrays.toString(e.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", ""));
        }
        this.d = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            ak akVar = (ak) arrayList.get(i3);
            g00 g00Var = new g00(19);
            new WeakReference(akVar);
            e60.n(akVar.I);
            e60.n(akVar.J);
            e60.n(akVar.K);
            e60.n(akVar.L);
            e60.n(akVar.M);
            this.d.add(g00Var);
        }
        if (i == 0) {
            n = e60.n(bkVar.I);
            n2 = e60.n(bkVar.K);
            e60Var.t();
        } else {
            n = e60.n(bkVar.J);
            n2 = e60.n(bkVar.L);
            e60Var.t();
        }
        return n2 - n;
    }

    public final void c(int i, c01 c01Var) {
        int i2 = c01Var.b;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ak akVar = (ak) obj;
            ArrayList arrayList2 = c01Var.a;
            if (!arrayList2.contains(akVar)) {
                arrayList2.add(akVar);
            }
            if (i == 0) {
                akVar.n0 = i2;
            } else {
                akVar.o0 = i2;
            }
        }
        this.e = i2;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        int i = this.c;
        if (i == 0) {
            str = "Horizontal";
        } else if (i == 1) {
            str = "Vertical";
        } else if (i == 2) {
            str = "Both";
        } else {
            str = "Unknown";
        }
        sb.append(str);
        sb.append(" [");
        sb.append(this.b);
        sb.append("] <");
        String sb2 = sb.toString();
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            sb2 = sb2 + " " + ((ak) obj).h0;
        }
        return sb2.concat(" >");
    }
}
