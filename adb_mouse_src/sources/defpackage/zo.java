package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public class zo implements xo {
    public final d01 d;
    public int f;
    public int g;
    public d01 a = null;
    public boolean b = false;
    public boolean c = false;
    public int e = 1;
    public int h = 1;
    public uq i = null;
    public boolean j = false;
    public final ArrayList k = new ArrayList();
    public final ArrayList l = new ArrayList();

    public zo(d01 d01Var) {
        this.d = d01Var;
    }

    @Override // defpackage.xo
    public final void a(xo xoVar) {
        ArrayList arrayList = this.l;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            if (!((zo) obj).j) {
                return;
            }
        }
        this.c = true;
        d01 d01Var = this.a;
        if (d01Var != null) {
            d01Var.a(this);
        }
        if (this.b) {
            this.d.a(this);
            return;
        }
        int size2 = arrayList.size();
        zo zoVar = null;
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList.get(i3);
            i3++;
            zo zoVar2 = (zo) obj2;
            if (!(zoVar2 instanceof uq)) {
                i++;
                zoVar = zoVar2;
            }
        }
        if (zoVar != null && i == 1 && zoVar.j) {
            uq uqVar = this.i;
            if (uqVar != null) {
                if (uqVar.j) {
                    this.f = this.h * uqVar.g;
                } else {
                    return;
                }
            }
            d(zoVar.g + this.f);
        }
        d01 d01Var2 = this.a;
        if (d01Var2 != null) {
            d01Var2.a(this);
        }
    }

    public final void b(d01 d01Var) {
        this.k.add(d01Var);
        if (this.j) {
            d01Var.a(d01Var);
        }
    }

    public final void c() {
        this.l.clear();
        this.k.clear();
        this.j = false;
        this.g = 0;
        this.c = false;
        this.b = false;
    }

    public void d(int i) {
        if (!this.j) {
            this.j = true;
            this.g = i;
            ArrayList arrayList = this.k;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                xo xoVar = (xo) obj;
                xoVar.a(xoVar);
            }
        }
    }

    public final String toString() {
        String str;
        Object obj;
        StringBuilder sb = new StringBuilder();
        sb.append(this.d.b.h0);
        sb.append(":");
        switch (this.e) {
            case 1:
                str = "UNKNOWN";
                break;
            case 2:
                str = "HORIZONTAL_DIMENSION";
                break;
            case 3:
                str = "VERTICAL_DIMENSION";
                break;
            case 4:
                str = "LEFT";
                break;
            case 5:
                str = "RIGHT";
                break;
            case 6:
                str = "TOP";
                break;
            case 7:
                str = "BOTTOM";
                break;
            case 8:
                str = "BASELINE";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        sb.append("(");
        if (this.j) {
            obj = Integer.valueOf(this.g);
        } else {
            obj = "unresolved";
        }
        sb.append(obj);
        sb.append(") <t=");
        sb.append(this.l.size());
        sb.append(":d=");
        sb.append(this.k.size());
        sb.append(">");
        return sb.toString();
    }
}
