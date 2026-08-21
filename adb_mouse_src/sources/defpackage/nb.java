package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class nb implements Serializable {
    public final transient l3 c;
    public final int d;
    public final ArrayList e;
    public final int f;
    public final ArrayList g;
    public final TreeMap h;
    public final Stack i;
    public final TreeMap j;
    public int k;
    public boolean l;
    public transient int m;

    public nb(nb nbVar, s sVar) {
        this.c = new l3(new qz(sVar));
        this.d = nbVar.d;
        this.f = nbVar.f;
        ArrayList arrayList = new ArrayList();
        this.g = arrayList;
        arrayList.addAll(nbVar.g);
        this.h = new TreeMap();
        for (Integer num : nbVar.h.keySet()) {
            this.h.put(num, (LinkedList) ((LinkedList) nbVar.h.get(num)).clone());
        }
        Stack stack = new Stack();
        this.i = stack;
        stack.addAll(nbVar.i);
        this.e = new ArrayList();
        Iterator it = nbVar.e.iterator();
        while (it.hasNext()) {
            this.e.add(((pb) it.next()).clone());
        }
        this.j = new TreeMap((Map) nbVar.j);
        int i = nbVar.k;
        this.k = i;
        this.m = nbVar.m;
        this.l = nbVar.l;
        if (this.g != null) {
            if (this.h != null) {
                if (this.i != null) {
                    if (this.e != null) {
                        if (mi0.D(this.d, i)) {
                            return;
                        }
                        c.o("index in BDS state out of bounds");
                        throw null;
                    }
                    c.o("treeHashInstances == null");
                    throw null;
                }
                c.o("stack == null");
                throw null;
            }
            c.o("retain == null");
            throw null;
        }
        c.o("authenticationPath == null");
        throw null;
    }

    public final void a(byte[] bArr, byte[] bArr2, sc0 sc0Var) {
        sc0 sc0Var2;
        int i;
        sc0 sc0Var3 = sc0Var;
        long j = sc0Var3.b;
        int i2 = sc0Var3.a;
        int i3 = 0;
        z40 z40Var = new z40(0);
        z40Var.c = i2;
        z40Var.b = j;
        a50 a50Var = new a50(z40Var);
        d10 d10Var = new d10();
        d10Var.c = i2;
        d10Var.b = j;
        e10 e10Var = new e10(d10Var);
        int i4 = 0;
        while (true) {
            int i5 = this.d;
            int i6 = 1 << i5;
            Stack stack = this.i;
            if (i4 < i6) {
                z40 z40Var2 = new z40(1);
                z40Var2.c = sc0Var3.a;
                z40Var2.b = sc0Var3.b;
                z40Var2.e = i4;
                z40Var2.f = sc0Var3.f;
                z40Var2.g = sc0Var3.g;
                z40Var2.d = sc0Var3.d;
                sc0 sc0Var4 = new sc0(z40Var2);
                l3 l3Var = this.c;
                l3Var.m(l3Var.l(bArr2, sc0Var4), bArr);
                sb0 k = l3Var.k(sc0Var4);
                z40 z40Var3 = new z40(i3);
                z40Var3.c = a50Var.a;
                z40Var3.b = a50Var.b;
                z40Var3.e = i4;
                z40Var3.f = a50Var.f;
                z40Var3.g = a50Var.g;
                z40Var3.d = a50Var.d;
                a50Var = new a50(z40Var3);
                i21 g = hi0.g(l3Var, k, a50Var);
                d10 d10Var2 = new d10();
                d10Var2.c = e10Var.a;
                d10Var2.b = e10Var.b;
                d10Var2.f = i4;
                d10Var2.d = e10Var.d;
                e10Var = new e10(d10Var2);
                while (!stack.isEmpty()) {
                    int i7 = ((i21) stack.peek()).c;
                    int i8 = g.c;
                    if (i7 == i8) {
                        int i9 = i4 / (1 << i8);
                        if (i9 == 1) {
                            this.g.add(g);
                        }
                        int i10 = this.f;
                        if (i9 == 3) {
                            if (i8 < i5 - i10) {
                                pb pbVar = (pb) this.e.get(i8);
                                pbVar.c = g;
                                pbVar.e = i8;
                                sc0Var2 = sc0Var4;
                                if (i8 == pbVar.d) {
                                    pbVar.h = true;
                                }
                            } else {
                                sc0Var2 = sc0Var4;
                            }
                            i = 3;
                        } else {
                            sc0Var2 = sc0Var4;
                            i = 3;
                        }
                        if (i9 >= i && (i9 & 1) == 1 && i8 >= i5 - i10 && i8 <= i5 - 2) {
                            Integer valueOf = Integer.valueOf(i8);
                            TreeMap treeMap = this.h;
                            if (treeMap.get(valueOf) == null) {
                                LinkedList linkedList = new LinkedList();
                                linkedList.add(g);
                                treeMap.put(Integer.valueOf(i8), linkedList);
                            } else {
                                ((LinkedList) treeMap.get(Integer.valueOf(i8))).add(g);
                            }
                        }
                        d10 d10Var3 = new d10();
                        d10Var3.c = e10Var.a;
                        d10Var3.b = e10Var.b;
                        d10Var3.e = e10Var.e;
                        d10Var3.f = (e10Var.f - 1) / 2;
                        d10Var3.d = e10Var.d;
                        e10 e10Var2 = new e10(d10Var3);
                        i21 l = hi0.l(l3Var, (i21) stack.pop(), g, e10Var2);
                        g = new i21(l.c + 1, mi0.e(l.d));
                        d10 d10Var4 = new d10();
                        d10Var4.c = e10Var2.a;
                        d10Var4.b = e10Var2.b;
                        d10Var4.e = e10Var2.e + 1;
                        d10Var4.f = e10Var2.f;
                        d10Var4.d = e10Var2.d;
                        e10Var = new e10(d10Var4);
                        sc0Var4 = sc0Var2;
                    }
                }
                stack.push(g);
                i4++;
                sc0Var3 = sc0Var4;
                i3 = 0;
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13, types: [boolean] */
    public final void b(byte[] bArr, byte[] bArr2, sc0 sc0Var) {
        int i;
        ?? r9;
        Object removeFirst;
        sc0 sc0Var2;
        int i2;
        int i3;
        int i4;
        long j;
        Stack stack;
        int i5;
        int i6;
        int i7;
        byte[] bArr3 = bArr;
        byte[] bArr4 = bArr2;
        sc0 sc0Var3 = sc0Var;
        long j2 = sc0Var3.b;
        int i8 = sc0Var3.a;
        if (!this.l) {
            int i9 = this.k;
            int i10 = 1;
            if (i9 <= this.m - 1) {
                int i11 = 0;
                int i12 = 0;
                while (true) {
                    i = this.d;
                    if (i12 < i) {
                        if (((i9 >> i12) & 1) == 0) {
                            break;
                        } else {
                            i12++;
                        }
                    } else {
                        i12 = 0;
                        break;
                    }
                }
                int i13 = (this.k >> (i12 + 1)) & 1;
                TreeMap treeMap = this.j;
                ArrayList arrayList = this.g;
                if (i13 == 0 && i12 < i - 1) {
                    treeMap.put(Integer.valueOf(i12), arrayList.get(i12));
                }
                ArrayList arrayList2 = this.e;
                int i14 = this.f;
                l3 l3Var = this.c;
                if (i12 == 0) {
                    z40 z40Var = new z40(1);
                    z40Var.c = i8;
                    z40Var.b = j2;
                    z40Var.e = this.k;
                    z40Var.f = sc0Var3.f;
                    z40Var.g = sc0Var3.g;
                    z40Var.d = sc0Var3.d;
                    sc0Var3 = new sc0(z40Var);
                    l3Var.m(l3Var.l(bArr4, sc0Var3), bArr3);
                    sb0 k = l3Var.k(sc0Var3);
                    z40 z40Var2 = new z40(0);
                    z40Var2.c = i8;
                    z40Var2.b = j2;
                    z40Var2.e = this.k;
                    z40Var2.f = 0;
                    z40Var2.g = 0;
                    z40Var2.d = 0;
                    arrayList.set(0, hi0.g(l3Var, k, new a50(z40Var2)));
                } else {
                    int i15 = 1;
                    d10 d10Var = new d10();
                    d10Var.c = i8;
                    d10Var.b = j2;
                    int i16 = i12 - 1;
                    d10Var.e = i16;
                    d10Var.f = this.k >> i12;
                    d10Var.d = 0;
                    e10 e10Var = new e10(d10Var);
                    l3Var.m(l3Var.l(bArr4, sc0Var3), bArr3);
                    i21 l = hi0.l(l3Var, (i21) arrayList.get(i16), (i21) treeMap.get(Integer.valueOf(i16)), e10Var);
                    arrayList.set(i12, new i21(l.c + 1, mi0.e(l.d)));
                    treeMap.remove(Integer.valueOf(i16));
                    for (int i17 = 0; i17 < i12; i17++) {
                        if (i17 < i - i14) {
                            removeFirst = ((pb) arrayList2.get(i17)).c;
                        } else {
                            removeFirst = ((LinkedList) this.h.get(Integer.valueOf(i17))).removeFirst();
                        }
                        arrayList.set(i17, removeFirst);
                    }
                    int min = Math.min(i12, i - i14);
                    int i18 = 0;
                    while (i18 < min) {
                        int i19 = ((i15 << i18) * 3) + this.k + 1;
                        if (i19 < (i15 << i)) {
                            pb pbVar = (pb) arrayList2.get(i18);
                            pbVar.c = null;
                            pbVar.e = pbVar.d;
                            pbVar.f = i19;
                            r9 = i15;
                            pbVar.g = r9;
                            pbVar.h = false;
                        } else {
                            r9 = i15;
                        }
                        i18++;
                        i15 = r9;
                    }
                    i10 = i15;
                }
                pb pbVar2 = null;
                int i20 = 0;
                while (i20 < ((i - i14) >> i10)) {
                    int size = arrayList2.size();
                    int i21 = i11;
                    pb pbVar3 = pbVar2;
                    while (i21 < size) {
                        Object obj = arrayList2.get(i21);
                        i21++;
                        pb pbVar4 = (pb) obj;
                        if (!pbVar4.h && pbVar4.g && (pbVar3 == null || pbVar4.b() < pbVar3.b() || (pbVar4.b() == pbVar3.b() && pbVar4.f < pbVar3.f))) {
                            pbVar3 = pbVar4;
                        }
                    }
                    if (pbVar3 != null) {
                        int i22 = pbVar3.d;
                        if (!pbVar3.h && pbVar3.g) {
                            z40 z40Var3 = new z40(1);
                            z40Var3.c = sc0Var3.a;
                            z40Var3.b = sc0Var3.b;
                            int i23 = pbVar3.f;
                            z40Var3.e = i23;
                            z40Var3.f = sc0Var3.f;
                            z40Var3.g = sc0Var3.g;
                            z40Var3.d = sc0Var3.d;
                            sc0 sc0Var4 = new sc0(z40Var3);
                            sc0 sc0Var5 = sc0Var3;
                            int i24 = i20;
                            long j3 = sc0Var4.b;
                            sc0Var2 = sc0Var5;
                            z40 z40Var4 = new z40(i11);
                            int i25 = sc0Var4.a;
                            z40Var4.c = i25;
                            z40Var4.b = j3;
                            z40Var4.e = i23;
                            i3 = i;
                            a50 a50Var = new a50(z40Var4);
                            d10 d10Var2 = new d10();
                            d10Var2.c = i25;
                            d10Var2.b = j3;
                            d10Var2.f = i23;
                            e10 e10Var2 = new e10(d10Var2);
                            l3Var.m(l3Var.l(bArr4, sc0Var4), bArr3);
                            i21 g = hi0.g(l3Var, l3Var.k(sc0Var4), a50Var);
                            while (true) {
                                i4 = e10Var2.d;
                                j = e10Var2.b;
                                stack = this.i;
                                boolean isEmpty = stack.isEmpty();
                                i5 = e10Var2.f;
                                i6 = e10Var2.e;
                                i7 = e10Var2.a;
                                if (isEmpty || ((i21) stack.peek()).c != g.c || ((i21) stack.peek()).c == i22) {
                                    break;
                                }
                                d10 d10Var3 = new d10();
                                d10Var3.c = i7;
                                d10Var3.b = j;
                                d10Var3.e = i6;
                                d10Var3.f = (i5 - 1) / 2;
                                d10Var3.d = i4;
                                e10 e10Var3 = new e10(d10Var3);
                                i21 l2 = hi0.l(l3Var, (i21) stack.pop(), g, e10Var3);
                                g = new i21(l2.c + 1, mi0.e(l2.d));
                                d10 d10Var4 = new d10();
                                d10Var4.c = e10Var3.a;
                                d10Var4.b = e10Var3.b;
                                d10Var4.e = e10Var3.e + 1;
                                d10Var4.f = e10Var3.f;
                                d10Var4.d = e10Var3.d;
                                e10Var2 = new e10(d10Var4);
                            }
                            i21 i21Var = pbVar3.c;
                            if (i21Var == null) {
                                pbVar3.c = g;
                                i2 = i24;
                            } else {
                                i2 = i24;
                                if (i21Var.c == g.c) {
                                    d10 d10Var5 = new d10();
                                    d10Var5.c = i7;
                                    d10Var5.b = j;
                                    d10Var5.e = i6;
                                    d10Var5.f = (i5 - 1) / 2;
                                    d10Var5.d = i4;
                                    g = new i21(pbVar3.c.c + 1, mi0.e(hi0.l(l3Var, i21Var, g, new e10(d10Var5)).d));
                                    pbVar3.c = g;
                                } else {
                                    stack.push(g);
                                }
                            }
                            if (pbVar3.c.c == i22) {
                                pbVar3.h = true;
                            } else {
                                pbVar3.e = g.c;
                                pbVar3.f++;
                            }
                        } else {
                            c.o("finished or not initialized");
                            return;
                        }
                    } else {
                        sc0Var2 = sc0Var3;
                        i2 = i20;
                        i3 = i;
                    }
                    i20 = i2 + 1;
                    bArr3 = bArr;
                    bArr4 = bArr2;
                    sc0Var3 = sc0Var2;
                    i = i3;
                    i11 = 0;
                    i10 = 1;
                    pbVar2 = null;
                }
                this.k++;
                return;
            }
            c.o("index out of bounds");
            return;
        }
        c.o("index already used");
    }

    public nb(nb nbVar) {
        this.c = new l3((qz) nbVar.c.g);
        this.d = nbVar.d;
        this.f = nbVar.f;
        ArrayList arrayList = new ArrayList();
        this.g = arrayList;
        arrayList.addAll(nbVar.g);
        this.h = new TreeMap();
        for (Integer num : nbVar.h.keySet()) {
            this.h.put(num, (LinkedList) ((LinkedList) nbVar.h.get(num)).clone());
        }
        Stack stack = new Stack();
        this.i = stack;
        stack.addAll(nbVar.i);
        this.e = new ArrayList();
        Iterator it = nbVar.e.iterator();
        while (it.hasNext()) {
            this.e.add(((pb) it.next()).clone());
        }
        this.j = new TreeMap((Map) nbVar.j);
        this.k = nbVar.k;
        this.m = nbVar.m;
        this.l = nbVar.l;
    }

    public nb(l3 l3Var, int i, int i2, int i3) {
        this.c = l3Var;
        this.d = i;
        this.m = i3;
        this.f = i2;
        if (i2 <= i && i2 >= 2) {
            int i4 = i - i2;
            if (i4 % 2 == 0) {
                this.g = new ArrayList();
                this.h = new TreeMap();
                this.i = new Stack();
                this.e = new ArrayList();
                for (int i5 = 0; i5 < i4; i5++) {
                    this.e.add(new pb(i5));
                }
                this.j = new TreeMap();
                this.k = 0;
                this.l = false;
                return;
            }
        }
        c.k("illegal value for BDS parameter k");
        throw null;
    }

    public nb(nb nbVar, byte[] bArr, byte[] bArr2, sc0 sc0Var) {
        this.c = new l3((qz) nbVar.c.g);
        this.d = nbVar.d;
        this.f = nbVar.f;
        ArrayList arrayList = new ArrayList();
        this.g = arrayList;
        arrayList.addAll(nbVar.g);
        this.h = new TreeMap();
        for (Integer num : nbVar.h.keySet()) {
            this.h.put(num, (LinkedList) ((LinkedList) nbVar.h.get(num)).clone());
        }
        Stack stack = new Stack();
        this.i = stack;
        stack.addAll(nbVar.i);
        this.e = new ArrayList();
        Iterator it = nbVar.e.iterator();
        while (it.hasNext()) {
            this.e.add(((pb) it.next()).clone());
        }
        this.j = new TreeMap((Map) nbVar.j);
        this.k = nbVar.k;
        this.m = nbVar.m;
        this.l = false;
        b(bArr, bArr2, sc0Var);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public nb(defpackage.j21 r5, byte[] r6, byte[] r7, defpackage.sc0 r8) {
        /*
            r4 = this;
            l3 r0 = new l3
            qz r1 = r5.g
            r0.<init>(r1)
            int r1 = r5.b
            int r5 = r5.c
            r2 = 1
            int r3 = r2 << r1
            int r3 = r3 - r2
            r4.<init>(r0, r1, r5, r3)
            r4.a(r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nb.<init>(j21, byte[], byte[], sc0):void");
    }
}
