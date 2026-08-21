package defpackage;

import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class yo {
    public bk a;
    public boolean b;
    public boolean c;
    public bk d;
    public ArrayList e;
    public rj f;
    public gd g;
    public ArrayList h;

    /* JADX WARN: Type inference failed for: r13v2, types: [bk0, java.lang.Object] */
    public final void a(zo zoVar, int i, ArrayList arrayList, bk0 bk0Var) {
        d01 d01Var = zoVar.d;
        bk0 bk0Var2 = d01Var.c;
        zo zoVar2 = d01Var.i;
        zo zoVar3 = d01Var.h;
        if (bk0Var2 == null) {
            bk bkVar = this.a;
            if (d01Var != bkVar.d) {
                bk0 bk0Var3 = bk0Var;
                if (d01Var != bkVar.e) {
                    if (bk0Var == null) {
                        ?? obj = new Object();
                        obj.a = null;
                        obj.b = new ArrayList();
                        obj.a = d01Var;
                        arrayList.add(obj);
                        bk0Var3 = obj;
                    }
                    d01Var.c = bk0Var3;
                    bk0Var3.b.add(d01Var);
                    ArrayList arrayList2 = zoVar3.k;
                    int size = arrayList2.size();
                    int i2 = 0;
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj2 = arrayList2.get(i3);
                        i3++;
                        xo xoVar = (xo) obj2;
                        if (xoVar instanceof zo) {
                            a((zo) xoVar, i, arrayList, bk0Var3);
                        }
                    }
                    ArrayList arrayList3 = zoVar2.k;
                    int size2 = arrayList3.size();
                    int i4 = 0;
                    while (i4 < size2) {
                        Object obj3 = arrayList3.get(i4);
                        i4++;
                        xo xoVar2 = (xo) obj3;
                        if (xoVar2 instanceof zo) {
                            a((zo) xoVar2, i, arrayList, bk0Var3);
                        }
                    }
                    if (i == 1 && (d01Var instanceof cy0)) {
                        ArrayList arrayList4 = ((cy0) d01Var).k.k;
                        int size3 = arrayList4.size();
                        int i5 = 0;
                        while (i5 < size3) {
                            Object obj4 = arrayList4.get(i5);
                            i5++;
                            xo xoVar3 = (xo) obj4;
                            if (xoVar3 instanceof zo) {
                                a((zo) xoVar3, i, arrayList, bk0Var3);
                            }
                        }
                    }
                    ArrayList arrayList5 = zoVar3.l;
                    int size4 = arrayList5.size();
                    int i6 = 0;
                    while (i6 < size4) {
                        Object obj5 = arrayList5.get(i6);
                        i6++;
                        a((zo) obj5, i, arrayList, bk0Var3);
                    }
                    ArrayList arrayList6 = zoVar2.l;
                    int size5 = arrayList6.size();
                    int i7 = 0;
                    while (i7 < size5) {
                        Object obj6 = arrayList6.get(i7);
                        i7++;
                        a((zo) obj6, i, arrayList, bk0Var3);
                    }
                    if (i == 1 && (d01Var instanceof cy0)) {
                        ArrayList arrayList7 = ((cy0) d01Var).k.l;
                        int size6 = arrayList7.size();
                        while (i2 < size6) {
                            Object obj7 = arrayList7.get(i2);
                            i2++;
                            a((zo) obj7, i, arrayList, bk0Var3);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0274, code lost:
    
        r6 = 1;
        r9 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0277, code lost:
    
        f(r11, 0, r10, 0, r12);
        r12.d.e.d(r12.q());
        r12.e.e.d(r12.k());
        r12.a = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x029a, code lost:
    
        r7 = r10;
        r0 = r13;
        r10 = r8;
        r8 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x00e8, code lost:
    
        if (r15 != 3) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x00ea, code lost:
    
        if (r6 != r0) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x00ec, code lost:
    
        f(r0, 0, r0, 0, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x00f5, code lost:
    
        r11 = r12.k();
        f(1, (int) ((r11 * r12.W) + 0.5f), 1, r11, r12);
        r12.d.e.d(r12.q());
        r12.e.e.d(r12.k());
        r12.a = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x012c, code lost:
    
        r8 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x012f, code lost:
    
        if (r15 != 1) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0131, code lost:
    
        f(r8, 0, r6, 0, r12);
        r12.d.e.m = r12.q();
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0145, code lost:
    
        if (r15 != 2) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0147, code lost:
    
        r0 = r2[r16];
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0149, code lost:
    
        if (r0 == 1) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x014c, code lost:
    
        if (r0 != 4) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x014f, code lost:
    
        r10 = r6;
        r6 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0152, code lost:
    
        r0 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0154, code lost:
    
        f(1, (int) ((r4 * r25.q()) + 0.5f), r6, r12.k(), r12);
        r12.d.e.d(r12.q());
        r12.e.e.d(r12.k());
        r12.a = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0182, code lost:
    
        r10 = r6;
        r6 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x018a, code lost:
    
        if (r7[r16].f == null) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0190, code lost:
    
        if (r7[1].f != null) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0192, code lost:
    
        f(r8, 0, r10, 0, r12);
        r12.d.e.d(r12.q());
        r12.e.e.d(r12.k());
        r12.a = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x01b4, code lost:
    
        r8 = r0;
        r10 = r6;
        r6 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x00c9, code lost:
    
        if (r6 == 2) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c0, code lost:
    
        if (r13 == 2) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d4, code lost:
    
        if (r13 != 3) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00d6, code lost:
    
        if (r6 == r0) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d9, code lost:
    
        if (r6 != 1) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00dc, code lost:
    
        r8 = r0;
        r0 = 3;
        r10 = r6;
        r6 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01b8, code lost:
    
        if (r10 != r0) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01ba, code lost:
    
        if (r13 == r8) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01bc, code lost:
    
        if (r13 != r6) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01bf, code lost:
    
        r9 = r0;
        r7 = r10;
        r0 = r13;
        r10 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01c3, code lost:
    
        r8 = r6;
        r6 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x029f, code lost:
    
        if (r0 != r9) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x02a1, code lost:
    
        if (r7 != r9) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x02a3, code lost:
    
        if (r15 == r6) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x02a5, code lost:
    
        if (r1 != r6) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x02a9, code lost:
    
        if (r1 != 2) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x02ab, code lost:
    
        if (r15 != 2) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x02af, code lost:
    
        if (r2[r16] != r8) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x02b3, code lost:
    
        if (r2[r6] != r8) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x02b5, code lost:
    
        f(r8, (int) ((r4 * r25.q()) + 0.5f), r8, (int) ((r14 * r25.k()) + 0.5f), r12);
        r12.d.e.d(r12.q());
        r12.e.e.d(r12.k());
        r12.a = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x02e8, code lost:
    
        f(r10, 0, r10, 0, r12);
        r12.d.e.m = r12.q();
        r12.e.e.m = r12.k();
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01c7, code lost:
    
        if (r1 != r0) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01c9, code lost:
    
        if (r13 != r8) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01cb, code lost:
    
        f(r8, 0, r8, 0, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01d3, code lost:
    
        r9 = r12.q();
        r0 = r12.W;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01dc, code lost:
    
        if (r12.X != (-1)) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01de, code lost:
    
        r0 = 1.0f / r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01e0, code lost:
    
        f(r6, r9, r6, (int) ((r9 * r0) + 0.5f), r12);
        r12.d.e.d(r12.q());
        r12.e.e.d(r12.k());
        r12.a = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0208, code lost:
    
        if (r1 != 1) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x020a, code lost:
    
        f(r13, 0, r8, 0, r12);
        r12.e.e.m = r12.k();
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x021f, code lost:
    
        r11 = r8;
        r8 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0222, code lost:
    
        if (r1 != 2) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0224, code lost:
    
        r7 = r2[1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0226, code lost:
    
        if (r7 == r6) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0229, code lost:
    
        if (r7 != 4) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x022c, code lost:
    
        r0 = r8;
        r7 = r10;
        r10 = r11;
        r9 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0231, code lost:
    
        f(r8, r12.q(), r6, (int) ((r14 * r25.k()) + 0.5f), r12);
        r12.d.e.d(r12.q());
        r12.e.e.d(r12.k());
        r12.a = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x025f, code lost:
    
        r0 = r8;
        r8 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0267, code lost:
    
        if (r7[2].f == null) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x026f, code lost:
    
        if (r7[3].f != null) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0272, code lost:
    
        r7 = r10;
        r10 = r11;
     */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0337  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(defpackage.bk r25) {
        /*
            Method dump skipped, instructions count: 860
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yo.b(bk):void");
    }

    public final void c() {
        bk bkVar = this.a;
        ArrayList arrayList = this.h;
        ArrayList arrayList2 = this.e;
        arrayList2.clear();
        bk bkVar2 = this.d;
        bkVar2.d.f();
        bkVar2.e.f();
        arrayList2.add(bkVar2.d);
        arrayList2.add(bkVar2.e);
        ArrayList arrayList3 = bkVar2.q0;
        int size = arrayList3.size();
        HashSet hashSet = null;
        int i = 0;
        while (i < size) {
            Object obj = arrayList3.get(i);
            i++;
            ak akVar = (ak) obj;
            if (akVar instanceof p00) {
                d01 d01Var = new d01(akVar);
                akVar.d.f();
                akVar.e.f();
                d01Var.f = ((p00) akVar).u0;
                arrayList2.add(d01Var);
            } else {
                if (akVar.x()) {
                    if (akVar.b == null) {
                        akVar.b = new ag(akVar, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(akVar.b);
                } else {
                    arrayList2.add(akVar.d);
                }
                if (akVar.y()) {
                    if (akVar.c == null) {
                        akVar.c = new ag(akVar, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(akVar.c);
                } else {
                    arrayList2.add(akVar.e);
                }
                if (akVar instanceof g10) {
                    arrayList2.add(new d01(akVar));
                }
            }
        }
        if (hashSet != null) {
            arrayList2.addAll(hashSet);
        }
        int size2 = arrayList2.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj2 = arrayList2.get(i2);
            i2++;
            ((d01) obj2).f();
        }
        int size3 = arrayList2.size();
        int i3 = 0;
        while (i3 < size3) {
            Object obj3 = arrayList2.get(i3);
            i3++;
            d01 d01Var2 = (d01) obj3;
            if (d01Var2.b != bkVar2) {
                d01Var2.d();
            }
        }
        arrayList.clear();
        e(bkVar.d, 0, arrayList);
        e(bkVar.e, 1, arrayList);
        this.b = false;
    }

    public final int d(bk bkVar, int i) {
        d01 d01Var;
        d01 d01Var2;
        ArrayList arrayList;
        int i2;
        long j;
        float f;
        long j2;
        bk bkVar2 = bkVar;
        ArrayList arrayList2 = this.h;
        int size = arrayList2.size();
        long j3 = 0;
        int i3 = 0;
        long j4 = 0;
        while (i3 < size) {
            d01 d01Var3 = ((bk0) arrayList2.get(i3)).a;
            if (!(d01Var3 instanceof ag) ? !(i != 0 ? (d01Var3 instanceof cy0) : (d01Var3 instanceof l10)) : ((ag) d01Var3).f != i) {
                arrayList = arrayList2;
                j = j3;
                i2 = i3;
            } else {
                if (i == 0) {
                    d01Var = bkVar2.d;
                } else {
                    d01Var = bkVar2.e;
                }
                zo zoVar = d01Var.h;
                if (i == 0) {
                    d01Var2 = bkVar2.d;
                } else {
                    d01Var2 = bkVar2.e;
                }
                zo zoVar2 = d01Var2.i;
                zo zoVar3 = d01Var3.h;
                zo zoVar4 = d01Var3.i;
                boolean contains = zoVar3.l.contains(zoVar);
                boolean contains2 = zoVar4.l.contains(zoVar2);
                long j5 = d01Var3.j();
                if (contains && contains2) {
                    long b = bk0.b(zoVar3, j3);
                    arrayList = arrayList2;
                    long a = bk0.a(zoVar4, j3);
                    long j6 = b - j5;
                    int i4 = zoVar4.f;
                    i2 = i3;
                    if (j6 >= (-i4)) {
                        j6 += i4;
                    }
                    long j7 = zoVar3.f;
                    long j8 = ((-a) - j5) - j7;
                    if (j8 >= j7) {
                        j8 -= j7;
                    }
                    ak akVar = d01Var3.b;
                    if (i == 0) {
                        f = akVar.d0;
                    } else if (i == 1) {
                        f = akVar.e0;
                    } else {
                        akVar.getClass();
                        f = -1.0f;
                    }
                    if (f > 0.0f) {
                        j2 = (((float) j6) / (1.0f - f)) + (((float) j8) / f);
                    } else {
                        j2 = 0;
                    }
                    float f2 = (float) j2;
                    j = (zoVar3.f + ((((f2 * f) + 0.5f) + j5) + (((1.0f - f) * f2) + 0.5f))) - zoVar4.f;
                } else {
                    arrayList = arrayList2;
                    i2 = i3;
                    if (contains) {
                        j = Math.max(bk0.b(zoVar3, zoVar3.f), zoVar3.f + j5);
                    } else if (contains2) {
                        j = Math.max(-bk0.a(zoVar4, zoVar4.f), (-zoVar4.f) + j5);
                    } else {
                        j = (d01Var3.j() + zoVar3.f) - zoVar4.f;
                    }
                }
            }
            j4 = Math.max(j4, j);
            i3 = i2 + 1;
            arrayList2 = arrayList;
            bkVar2 = bkVar;
            j3 = 0;
        }
        return (int) j4;
    }

    public final void e(d01 d01Var, int i, ArrayList arrayList) {
        zo zoVar = d01Var.h;
        zo zoVar2 = d01Var.i;
        ArrayList arrayList2 = zoVar.k;
        int size = arrayList2.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList2.get(i3);
            i3++;
            xo xoVar = (xo) obj;
            if (xoVar instanceof zo) {
                a((zo) xoVar, i, arrayList, null);
            } else if (xoVar instanceof d01) {
                a(((d01) xoVar).h, i, arrayList, null);
            }
        }
        ArrayList arrayList3 = zoVar2.k;
        int size2 = arrayList3.size();
        int i4 = 0;
        while (i4 < size2) {
            Object obj2 = arrayList3.get(i4);
            i4++;
            xo xoVar2 = (xo) obj2;
            if (xoVar2 instanceof zo) {
                a((zo) xoVar2, i, arrayList, null);
            } else if (xoVar2 instanceof d01) {
                a(((d01) xoVar2).i, i, arrayList, null);
            }
        }
        if (i == 1) {
            ArrayList arrayList4 = ((cy0) d01Var).k.k;
            int size3 = arrayList4.size();
            while (i2 < size3) {
                Object obj3 = arrayList4.get(i2);
                i2++;
                xo xoVar3 = (xo) obj3;
                if (xoVar3 instanceof zo) {
                    a((zo) xoVar3, i, arrayList, null);
                }
            }
        }
    }

    public final void f(int i, int i2, int i3, int i4, ak akVar) {
        gd gdVar = this.g;
        gdVar.a = i;
        gdVar.b = i3;
        gdVar.c = i2;
        gdVar.d = i4;
        this.f.c(akVar, gdVar);
        akVar.O(gdVar.e);
        akVar.L(gdVar.f);
        akVar.E = gdVar.h;
        akVar.I(gdVar.g);
    }

    public final void g() {
        boolean z;
        boolean z2;
        fd fdVar;
        yo yoVar = this;
        ArrayList arrayList = yoVar.a.q0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            ak akVar = (ak) arrayList.get(i);
            if (!akVar.a) {
                int[] iArr = akVar.p0;
                int i3 = iArr[0];
                int i4 = iArr[1];
                int i5 = akVar.r;
                int i6 = akVar.s;
                if (i3 != 2 && (i3 != 3 || i5 != 1)) {
                    z = false;
                } else {
                    z = true;
                }
                if (i4 != 2 && (i4 != 3 || i6 != 1)) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                uq uqVar = akVar.d.e;
                boolean z3 = uqVar.j;
                uq uqVar2 = akVar.e.e;
                boolean z4 = uqVar2.j;
                boolean z5 = z;
                if (z3 && z4) {
                    yoVar.f(1, uqVar.g, 1, uqVar2.g, akVar);
                    akVar.a = true;
                } else if (z3 && z2) {
                    f(1, uqVar.g, 2, uqVar2.g, akVar);
                    cy0 cy0Var = akVar.e;
                    if (i4 == 3) {
                        cy0Var.e.m = akVar.k();
                    } else {
                        cy0Var.e.d(akVar.k());
                        akVar.a = true;
                    }
                } else if (z4 && z5) {
                    f(2, uqVar.g, 1, uqVar2.g, akVar);
                    l10 l10Var = akVar.d;
                    if (i3 == 3) {
                        l10Var.e.m = akVar.q();
                    } else {
                        l10Var.e.d(akVar.q());
                        akVar.a = true;
                    }
                }
                if (akVar.a && (fdVar = akVar.e.l) != null) {
                    fdVar.d(akVar.a0);
                }
                yoVar = this;
            }
            i = i2;
        }
    }
}
