package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public class ak {
    public int A;
    public float B;
    public final int[] C;
    public float D;
    public boolean E;
    public boolean F;
    public int G;
    public int H;
    public final mj I;
    public final mj J;
    public final mj K;
    public final mj L;
    public final mj M;
    public final mj N;
    public final mj O;
    public final mj P;
    public final mj[] Q;
    public final ArrayList R;
    public final boolean[] S;
    public ak T;
    public int U;
    public int V;
    public float W;
    public int X;
    public int Y;
    public int Z;
    public int a0;
    public ag b;
    public int b0;
    public ag c;
    public int c0;
    public float d0;
    public float e0;
    public View f0;
    public int g0;
    public String h0;
    public int i0;
    public String j;
    public int j0;
    public boolean k;
    public final float[] k0;
    public boolean l;
    public final ak[] l0;
    public boolean m;
    public final ak[] m0;
    public boolean n;
    public int n0;
    public int o;
    public int o0;
    public int p;
    public final int[] p0;
    public int q;
    public int r;
    public int s;
    public final int[] t;
    public int u;
    public int v;
    public float w;
    public int x;
    public int y;
    public float z;
    public boolean a = false;
    public l10 d = null;
    public cy0 e = null;
    public final boolean[] f = {true, true};
    public boolean g = true;
    public int h = -1;
    public int i = -1;

    public ak() {
        new HashMap();
        this.k = false;
        this.l = false;
        this.m = false;
        this.n = false;
        this.o = -1;
        this.p = -1;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = new int[2];
        this.u = 0;
        this.v = 0;
        this.w = 1.0f;
        this.x = 0;
        this.y = 0;
        this.z = 1.0f;
        this.A = -1;
        this.B = 1.0f;
        this.C = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.D = Float.NaN;
        this.E = false;
        this.F = false;
        this.G = 0;
        this.H = 0;
        mj mjVar = new mj(this, 2);
        this.I = mjVar;
        mj mjVar2 = new mj(this, 3);
        this.J = mjVar2;
        mj mjVar3 = new mj(this, 4);
        this.K = mjVar3;
        mj mjVar4 = new mj(this, 5);
        this.L = mjVar4;
        mj mjVar5 = new mj(this, 6);
        this.M = mjVar5;
        mj mjVar6 = new mj(this, 8);
        this.N = mjVar6;
        mj mjVar7 = new mj(this, 9);
        this.O = mjVar7;
        mj mjVar8 = new mj(this, 7);
        this.P = mjVar8;
        this.Q = new mj[]{mjVar, mjVar3, mjVar2, mjVar4, mjVar5, mjVar8};
        ArrayList arrayList = new ArrayList();
        this.R = arrayList;
        this.S = new boolean[2];
        this.p0 = new int[]{1, 1};
        this.T = null;
        this.U = 0;
        this.V = 0;
        this.W = 0.0f;
        this.X = -1;
        this.Y = 0;
        this.Z = 0;
        this.a0 = 0;
        this.d0 = 0.5f;
        this.e0 = 0.5f;
        this.g0 = 0;
        this.h0 = null;
        this.i0 = 0;
        this.j0 = 0;
        this.k0 = new float[]{-1.0f, -1.0f};
        this.l0 = new ak[]{null, null};
        this.m0 = new ak[]{null, null};
        this.n0 = -1;
        this.o0 = -1;
        arrayList.add(mjVar);
        arrayList.add(mjVar2);
        arrayList.add(mjVar3);
        arrayList.add(mjVar4);
        arrayList.add(mjVar6);
        arrayList.add(mjVar7);
        arrayList.add(mjVar8);
        arrayList.add(mjVar5);
    }

    public static void G(int i, int i2, String str, StringBuilder sb) {
        if (i == i2) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(i);
        sb.append(",\n");
    }

    public static void H(StringBuilder sb, String str, float f, float f2) {
        if (f == f2) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(f);
        sb.append(",\n");
    }

    public static void o(StringBuilder sb, String str, int i, int i2, int i3, int i4, int i5, float f, int i6) {
        String str2;
        sb.append(str);
        sb.append(" :  {\n");
        if (i6 == 1) {
            str2 = "FIXED";
        } else if (i6 != 2) {
            if (i6 != 3) {
                if (i6 == 4) {
                    str2 = "MATCH_PARENT";
                } else {
                    throw null;
                }
            } else {
                str2 = "MATCH_CONSTRAINT";
            }
        } else {
            str2 = "WRAP_CONTENT";
        }
        if (!"FIXED".equals(str2)) {
            sb.append("      behavior");
            sb.append(" :   ");
            sb.append(str2);
            sb.append(",\n");
        }
        G(i, 0, "      size", sb);
        G(i2, 0, "      min", sb);
        G(i3, Integer.MAX_VALUE, "      max", sb);
        G(i4, 0, "      matchMin", sb);
        G(i5, 0, "      matchDef", sb);
        H(sb, "      matchPercent", f, 1.0f);
        sb.append("    },\n");
    }

    public static void p(StringBuilder sb, String str, mj mjVar) {
        if (mjVar.f == null) {
            return;
        }
        sb.append("    ");
        sb.append(str);
        sb.append(" : [ '");
        sb.append(mjVar.f);
        sb.append("'");
        if (mjVar.h != Integer.MIN_VALUE || mjVar.g != 0) {
            sb.append(",");
            sb.append(mjVar.g);
            if (mjVar.h != Integer.MIN_VALUE) {
                sb.append(",");
                sb.append(mjVar.h);
                sb.append(",");
            }
        }
        sb.append(" ] ,\n");
    }

    public boolean A() {
        if (!this.k) {
            if (!this.I.c || !this.K.c) {
                return false;
            }
            return true;
        }
        return true;
    }

    public boolean B() {
        if (!this.l) {
            if (!this.J.c || !this.L.c) {
                return false;
            }
            return true;
        }
        return true;
    }

    public void C() {
        this.I.j();
        this.J.j();
        this.K.j();
        this.L.j();
        this.M.j();
        this.N.j();
        this.O.j();
        this.P.j();
        this.T = null;
        this.D = Float.NaN;
        this.U = 0;
        this.V = 0;
        this.W = 0.0f;
        this.X = -1;
        this.Y = 0;
        this.Z = 0;
        this.a0 = 0;
        this.b0 = 0;
        this.c0 = 0;
        this.d0 = 0.5f;
        this.e0 = 0.5f;
        int[] iArr = this.p0;
        iArr[0] = 1;
        iArr[1] = 1;
        this.f0 = null;
        this.g0 = 0;
        this.i0 = 0;
        this.j0 = 0;
        float[] fArr = this.k0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.o = -1;
        this.p = -1;
        int[] iArr2 = this.C;
        iArr2[0] = Integer.MAX_VALUE;
        iArr2[1] = Integer.MAX_VALUE;
        this.r = 0;
        this.s = 0;
        this.w = 1.0f;
        this.z = 1.0f;
        this.v = Integer.MAX_VALUE;
        this.y = Integer.MAX_VALUE;
        this.u = 0;
        this.x = 0;
        this.A = -1;
        this.B = 1.0f;
        boolean[] zArr = this.f;
        zArr[0] = true;
        zArr[1] = true;
        this.F = false;
        boolean[] zArr2 = this.S;
        zArr2[0] = false;
        zArr2[1] = false;
        this.g = true;
        int[] iArr3 = this.t;
        iArr3[0] = 0;
        iArr3[1] = 0;
        this.h = -1;
        this.i = -1;
    }

    public final void D() {
        ak akVar = this.T;
        if (akVar != null && (akVar instanceof bk)) {
            ((bk) akVar).getClass();
        }
        ArrayList arrayList = this.R;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((mj) arrayList.get(i)).j();
        }
    }

    public final void E() {
        this.k = false;
        this.l = false;
        this.m = false;
        this.n = false;
        ArrayList arrayList = this.R;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            mj mjVar = (mj) arrayList.get(i);
            mjVar.c = false;
            mjVar.b = 0;
        }
    }

    public void F(b8 b8Var) {
        this.I.k();
        this.J.k();
        this.K.k();
        this.L.k();
        this.M.k();
        this.P.k();
        this.N.k();
        this.O.k();
    }

    public final void I(int i) {
        boolean z;
        this.a0 = i;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        this.E = z;
    }

    public final void J(int i, int i2) {
        if (this.k) {
            return;
        }
        this.I.l(i);
        this.K.l(i2);
        this.Y = i;
        this.U = i2 - i;
        this.k = true;
    }

    public final void K(int i, int i2) {
        if (this.l) {
            return;
        }
        this.J.l(i);
        this.L.l(i2);
        this.Z = i;
        this.V = i2 - i;
        if (this.E) {
            this.M.l(i + this.a0);
        }
        this.l = true;
    }

    public final void L(int i) {
        this.V = i;
        int i2 = this.c0;
        if (i < i2) {
            this.V = i2;
        }
    }

    public final void M(int i) {
        this.p0[0] = i;
    }

    public final void N(int i) {
        this.p0[1] = i;
    }

    public final void O(int i) {
        this.U = i;
        int i2 = this.b0;
        if (i < i2) {
            this.U = i2;
        }
    }

    public void P(boolean z, boolean z2) {
        int i;
        int i2;
        l10 l10Var = this.d;
        boolean z3 = z & l10Var.g;
        cy0 cy0Var = this.e;
        boolean z4 = z2 & cy0Var.g;
        int i3 = l10Var.h.g;
        int i4 = cy0Var.h.g;
        int i5 = l10Var.i.g;
        int i6 = cy0Var.i.g;
        int i7 = i6 - i4;
        if (i5 - i3 < 0 || i7 < 0 || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
            i5 = 0;
            i6 = 0;
            i3 = 0;
            i4 = 0;
        }
        int i8 = i5 - i3;
        int i9 = i6 - i4;
        if (z3) {
            this.Y = i3;
        }
        if (z4) {
            this.Z = i4;
        }
        if (this.g0 == 8) {
            this.U = 0;
            this.V = 0;
            return;
        }
        int[] iArr = this.p0;
        if (z3) {
            if (iArr[0] == 1 && i8 < (i2 = this.U)) {
                i8 = i2;
            }
            this.U = i8;
            int i10 = this.b0;
            if (i8 < i10) {
                this.U = i10;
            }
        }
        if (z4) {
            if (iArr[1] == 1 && i9 < (i = this.V)) {
                i9 = i;
            }
            this.V = i9;
            int i11 = this.c0;
            if (i9 < i11) {
                this.V = i11;
            }
        }
    }

    public void Q(e60 e60Var, boolean z) {
        int i;
        int i2;
        cy0 cy0Var;
        l10 l10Var;
        e60Var.getClass();
        int n = e60.n(this.I);
        int n2 = e60.n(this.J);
        int n3 = e60.n(this.K);
        int n4 = e60.n(this.L);
        if (z && (l10Var = this.d) != null) {
            zo zoVar = l10Var.h;
            if (zoVar.j) {
                zo zoVar2 = l10Var.i;
                if (zoVar2.j) {
                    n = zoVar.g;
                    n3 = zoVar2.g;
                }
            }
        }
        if (z && (cy0Var = this.e) != null) {
            zo zoVar3 = cy0Var.h;
            if (zoVar3.j) {
                zo zoVar4 = cy0Var.i;
                if (zoVar4.j) {
                    n2 = zoVar3.g;
                    n4 = zoVar4.g;
                }
            }
        }
        int i3 = n4 - n2;
        if (n3 - n < 0 || i3 < 0 || n == Integer.MIN_VALUE || n == Integer.MAX_VALUE || n2 == Integer.MIN_VALUE || n2 == Integer.MAX_VALUE || n3 == Integer.MIN_VALUE || n3 == Integer.MAX_VALUE || n4 == Integer.MIN_VALUE || n4 == Integer.MAX_VALUE) {
            n = 0;
            n2 = 0;
            n3 = 0;
            n4 = 0;
        }
        int i4 = n3 - n;
        int i5 = n4 - n2;
        this.Y = n;
        this.Z = n2;
        if (this.g0 == 8) {
            this.U = 0;
            this.V = 0;
            return;
        }
        int[] iArr = this.p0;
        int i6 = iArr[0];
        if (i6 == 1 && i4 < (i2 = this.U)) {
            i4 = i2;
        }
        if (iArr[1] == 1 && i5 < (i = this.V)) {
            i5 = i;
        }
        this.U = i4;
        this.V = i5;
        int i7 = this.c0;
        if (i5 < i7) {
            this.V = i7;
        }
        int i8 = this.b0;
        if (i4 < i8) {
            this.U = i8;
        }
        int i9 = this.v;
        if (i9 > 0 && i6 == 3) {
            this.U = Math.min(this.U, i9);
        }
        int i10 = this.y;
        if (i10 > 0 && iArr[1] == 3) {
            this.V = Math.min(this.V, i10);
        }
        int i11 = this.U;
        if (i4 != i11) {
            this.h = i11;
        }
        int i12 = this.V;
        if (i5 != i12) {
            this.i = i12;
        }
    }

    public final void a(bk bkVar, e60 e60Var, HashSet hashSet, int i, boolean z) {
        if (z) {
            if (hashSet.contains(this)) {
                r21.e(bkVar, e60Var, this);
                hashSet.remove(this);
                b(e60Var, bkVar.W(64));
            } else {
                return;
            }
        }
        if (i == 0) {
            HashSet hashSet2 = this.I.a;
            if (hashSet2 != null) {
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    ((mj) it.next()).d.a(bkVar, e60Var, hashSet, i, true);
                }
            }
            HashSet hashSet3 = this.K.a;
            if (hashSet3 != null) {
                Iterator it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    ((mj) it2.next()).d.a(bkVar, e60Var, hashSet, i, true);
                }
                return;
            }
            return;
        }
        HashSet hashSet4 = this.J.a;
        if (hashSet4 != null) {
            Iterator it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                ((mj) it3.next()).d.a(bkVar, e60Var, hashSet, i, true);
            }
        }
        HashSet hashSet5 = this.L.a;
        if (hashSet5 != null) {
            Iterator it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                ((mj) it4.next()).d.a(bkVar, e60Var, hashSet, i, true);
            }
        }
        HashSet hashSet6 = this.M.a;
        if (hashSet6 != null) {
            Iterator it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                ((mj) it5.next()).d.a(bkVar, e60Var, hashSet, i, true);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
    
        if (r12 != 3) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x05d3, code lost:
    
        if (r58.g0 == r14) goto L374;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x059c  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x05a0  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0667  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x06c3  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02b5  */
    /* JADX WARN: Type inference failed for: r17v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r17v16 */
    /* JADX WARN: Type inference failed for: r17v17 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v20 */
    /* JADX WARN: Type inference failed for: r18v25 */
    /* JADX WARN: Type inference failed for: r18v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r27v3 */
    /* JADX WARN: Type inference failed for: r27v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r27v6 */
    /* JADX WARN: Type inference failed for: r27v7 */
    /* JADX WARN: Type inference failed for: r27v8 */
    /* JADX WARN: Type inference failed for: r58v0, types: [ak] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(defpackage.e60 r59, boolean r60) {
        /*
            Method dump skipped, instructions count: 1910
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ak.b(e60, boolean):void");
    }

    public boolean c() {
        if (this.g0 != 8) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x03bc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0440 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x04b5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x04d4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.e60 r30, boolean r31, boolean r32, boolean r33, boolean r34, defpackage.ro0 r35, defpackage.ro0 r36, int r37, boolean r38, defpackage.mj r39, defpackage.mj r40, int r41, int r42, int r43, int r44, float r45, boolean r46, boolean r47, boolean r48, boolean r49, boolean r50, int r51, int r52, int r53, int r54, float r55, boolean r56) {
        /*
            Method dump skipped, instructions count: 1323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ak.d(e60, boolean, boolean, boolean, boolean, ro0, ro0, int, boolean, mj, mj, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    public final void e(int i, ak akVar, int i2, int i3) {
        boolean z;
        if (i == 7) {
            if (i2 == 7) {
                mj i4 = i(2);
                mj i5 = i(4);
                mj i6 = i(3);
                mj i7 = i(5);
                boolean z2 = true;
                if ((i4 != null && i4.h()) || (i5 != null && i5.h())) {
                    z = false;
                } else {
                    e(2, akVar, 2, 0);
                    e(4, akVar, 4, 0);
                    z = true;
                }
                if ((i6 != null && i6.h()) || (i7 != null && i7.h())) {
                    z2 = false;
                } else {
                    e(3, akVar, 3, 0);
                    e(5, akVar, 5, 0);
                }
                if (z && z2) {
                    i(7).a(akVar.i(7), 0);
                    return;
                } else if (z) {
                    i(8).a(akVar.i(8), 0);
                    return;
                } else {
                    if (z2) {
                        i(9).a(akVar.i(9), 0);
                        return;
                    }
                    return;
                }
            }
            if (i2 != 2 && i2 != 4) {
                if (i2 == 3 || i2 == 5) {
                    e(3, akVar, i2, 0);
                    e(5, akVar, i2, 0);
                    i(7).a(akVar.i(i2), 0);
                    return;
                }
                return;
            }
            e(2, akVar, i2, 0);
            e(4, akVar, i2, 0);
            i(7).a(akVar.i(i2), 0);
            return;
        }
        if (i == 8 && (i2 == 2 || i2 == 4)) {
            mj i8 = i(2);
            mj i9 = akVar.i(i2);
            mj i10 = i(4);
            i8.a(i9, 0);
            i10.a(i9, 0);
            i(8).a(i9, 0);
            return;
        }
        if (i == 9 && (i2 == 3 || i2 == 5)) {
            mj i11 = akVar.i(i2);
            i(3).a(i11, 0);
            i(5).a(i11, 0);
            i(9).a(i11, 0);
            return;
        }
        if (i == 8 && i2 == 8) {
            i(2).a(akVar.i(2), 0);
            i(4).a(akVar.i(4), 0);
            i(8).a(akVar.i(i2), 0);
            return;
        }
        if (i == 9 && i2 == 9) {
            i(3).a(akVar.i(3), 0);
            i(5).a(akVar.i(5), 0);
            i(9).a(akVar.i(i2), 0);
            return;
        }
        mj i12 = i(i);
        mj i13 = akVar.i(i2);
        if (i12.i(i13)) {
            if (i == 6) {
                mj i14 = i(3);
                mj i15 = i(5);
                if (i14 != null) {
                    i14.j();
                }
                if (i15 != null) {
                    i15.j();
                }
            } else if (i != 3 && i != 5) {
                if (i == 2 || i == 4) {
                    mj i16 = i(7);
                    if (i16.f != i13) {
                        i16.j();
                    }
                    mj f = i(i).f();
                    mj i17 = i(8);
                    if (i17.h()) {
                        f.j();
                        i17.j();
                    }
                }
            } else {
                mj i18 = i(6);
                if (i18 != null) {
                    i18.j();
                }
                mj i19 = i(7);
                if (i19.f != i13) {
                    i19.j();
                }
                mj f2 = i(i).f();
                mj i20 = i(9);
                if (i20.h()) {
                    f2.j();
                    i20.j();
                }
            }
            i12.a(i13, i3);
        }
    }

    public final void f(mj mjVar, mj mjVar2, int i) {
        if (mjVar.d == this) {
            e(mjVar.e, mjVar2.d, mjVar2.e, i);
        }
    }

    public final void g(e60 e60Var) {
        e60Var.k(this.I);
        e60Var.k(this.J);
        e60Var.k(this.K);
        e60Var.k(this.L);
        if (this.a0 > 0) {
            e60Var.k(this.M);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [d01, cy0] */
    /* JADX WARN: Type inference failed for: r0v3, types: [d01, l10] */
    public final void h() {
        if (this.d == null) {
            ?? d01Var = new d01(this);
            d01Var.h.e = 4;
            d01Var.i.e = 5;
            d01Var.f = 0;
            this.d = d01Var;
        }
        if (this.e == null) {
            ?? d01Var2 = new d01(this);
            zo zoVar = new zo(d01Var2);
            d01Var2.k = zoVar;
            d01Var2.l = null;
            d01Var2.h.e = 6;
            d01Var2.i.e = 7;
            zoVar.e = 8;
            d01Var2.f = 1;
            this.e = d01Var2;
        }
    }

    public mj i(int i) {
        switch (qo0.C(i)) {
            case 0:
                return null;
            case 1:
                return this.I;
            case 2:
                return this.J;
            case 3:
                return this.K;
            case 4:
                return this.L;
            case 5:
                return this.M;
            case 6:
                return this.P;
            case 7:
                return this.N;
            case 8:
                return this.O;
            default:
                throw new AssertionError(qo0.B(i));
        }
    }

    public final int j(int i) {
        int[] iArr = this.p0;
        if (i == 0) {
            return iArr[0];
        }
        if (i != 1) {
            return 0;
        }
        return iArr[1];
    }

    public final int k() {
        if (this.g0 == 8) {
            return 0;
        }
        return this.V;
    }

    public final ak l(int i) {
        mj mjVar;
        mj mjVar2;
        if (i == 0) {
            mj mjVar3 = this.K;
            mj mjVar4 = mjVar3.f;
            if (mjVar4 != null && mjVar4.f == mjVar3) {
                return mjVar4.d;
            }
            return null;
        }
        if (i == 1 && (mjVar2 = (mjVar = this.L).f) != null && mjVar2.f == mjVar) {
            return mjVar2.d;
        }
        return null;
    }

    public final ak m(int i) {
        mj mjVar;
        mj mjVar2;
        if (i == 0) {
            mj mjVar3 = this.I;
            mj mjVar4 = mjVar3.f;
            if (mjVar4 != null && mjVar4.f == mjVar3) {
                return mjVar4.d;
            }
            return null;
        }
        if (i == 1 && (mjVar2 = (mjVar = this.J).f) != null && mjVar2.f == mjVar) {
            return mjVar2.d;
        }
        return null;
    }

    public void n(StringBuilder sb) {
        sb.append("  " + this.j + ":{\n");
        StringBuilder sb2 = new StringBuilder("    actualWidth:");
        sb2.append(this.U);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("    actualHeight:" + this.V);
        sb.append("\n");
        sb.append("    actualLeft:" + this.Y);
        sb.append("\n");
        sb.append("    actualTop:" + this.Z);
        sb.append("\n");
        p(sb, "left", this.I);
        p(sb, "top", this.J);
        p(sb, "right", this.K);
        p(sb, "bottom", this.L);
        p(sb, "baseline", this.M);
        p(sb, "centerX", this.N);
        p(sb, "centerY", this.O);
        int i = this.U;
        int i2 = this.b0;
        int[] iArr = this.C;
        int i3 = iArr[0];
        int i4 = this.u;
        int i5 = this.r;
        float f = this.w;
        int[] iArr2 = this.p0;
        int i6 = iArr2[0];
        float[] fArr = this.k0;
        float f2 = fArr[0];
        o(sb, "    width", i, i2, i3, i4, i5, f, i6);
        int i7 = this.V;
        int i8 = this.c0;
        int i9 = iArr[1];
        int i10 = this.x;
        int i11 = this.s;
        float f3 = this.z;
        int i12 = iArr2[1];
        float f4 = fArr[1];
        o(sb, "    height", i7, i8, i9, i10, i11, f3, i12);
        float f5 = this.W;
        int i13 = this.X;
        if (f5 != 0.0f) {
            sb.append("    dimensionRatio");
            sb.append(" :  [");
            sb.append(f5);
            sb.append(",");
            sb.append(i13);
            sb.append("");
            sb.append("],\n");
        }
        H(sb, "    horizontalBias", this.d0, 0.5f);
        H(sb, "    verticalBias", this.e0, 0.5f);
        G(this.i0, 0, "    horizontalChainStyle", sb);
        G(this.j0, 0, "    verticalChainStyle", sb);
        sb.append("  }");
    }

    public final int q() {
        if (this.g0 == 8) {
            return 0;
        }
        return this.U;
    }

    public final int r() {
        ak akVar = this.T;
        if (akVar != null && (akVar instanceof bk)) {
            return ((bk) akVar).x0 + this.Y;
        }
        return this.Y;
    }

    public final int s() {
        ak akVar = this.T;
        if (akVar != null && (akVar instanceof bk)) {
            return ((bk) akVar).y0 + this.Z;
        }
        return this.Z;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean t(int r5) {
        /*
            r4 = this;
            r0 = 2
            r1 = 0
            r2 = 1
            if (r5 != 0) goto L1b
            mj r5 = r4.I
            mj r5 = r5.f
            if (r5 == 0) goto Ld
            r5 = r2
            goto Le
        Ld:
            r5 = r1
        Le:
            mj r4 = r4.K
            mj r4 = r4.f
            if (r4 == 0) goto L16
            r4 = r2
            goto L17
        L16:
            r4 = r1
        L17:
            int r5 = r5 + r4
            if (r5 >= r0) goto L3b
            goto L3a
        L1b:
            mj r5 = r4.J
            mj r5 = r5.f
            if (r5 == 0) goto L23
            r5 = r2
            goto L24
        L23:
            r5 = r1
        L24:
            mj r3 = r4.L
            mj r3 = r3.f
            if (r3 == 0) goto L2c
            r3 = r2
            goto L2d
        L2c:
            r3 = r1
        L2d:
            int r5 = r5 + r3
            mj r4 = r4.M
            mj r4 = r4.f
            if (r4 == 0) goto L36
            r4 = r2
            goto L37
        L36:
            r4 = r1
        L37:
            int r5 = r5 + r4
            if (r5 >= r0) goto L3b
        L3a:
            return r2
        L3b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ak.t(int):boolean");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        String str = "";
        sb.append("");
        if (this.h0 != null) {
            str = qo0.s(new StringBuilder("id: "), this.h0, " ");
        }
        sb.append(str);
        sb.append("(");
        sb.append(this.Y);
        sb.append(", ");
        sb.append(this.Z);
        sb.append(") - (");
        sb.append(this.U);
        sb.append(" x ");
        sb.append(this.V);
        sb.append(")");
        return sb.toString();
    }

    public final boolean u(int i, int i2) {
        mj mjVar;
        mj mjVar2;
        mj mjVar3;
        mj mjVar4;
        if (i == 0) {
            mj mjVar5 = this.I;
            mj mjVar6 = mjVar5.f;
            if (mjVar6 != null && mjVar6.c && (mjVar4 = (mjVar3 = this.K).f) != null && mjVar4.c) {
                if ((mjVar4.d() - mjVar3.e()) - (mjVar5.e() + mjVar5.f.d()) >= i2) {
                    return true;
                }
                return false;
            }
            return false;
        }
        mj mjVar7 = this.J;
        mj mjVar8 = mjVar7.f;
        if (mjVar8 != null && mjVar8.c && (mjVar2 = (mjVar = this.L).f) != null && mjVar2.c) {
            if ((mjVar2.d() - mjVar.e()) - (mjVar7.e() + mjVar7.f.d()) >= i2) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void v(int i, int i2, int i3, int i4, ak akVar) {
        i(i).b(akVar.i(i2), i3, i4, true);
    }

    public final boolean w(int i) {
        mj mjVar;
        mj mjVar2;
        int i2 = i * 2;
        mj[] mjVarArr = this.Q;
        mj mjVar3 = mjVarArr[i2];
        mj mjVar4 = mjVar3.f;
        if (mjVar4 != null && mjVar4.f != mjVar3 && (mjVar2 = (mjVar = mjVarArr[i2 + 1]).f) != null && mjVar2.f == mjVar) {
            return true;
        }
        return false;
    }

    public final boolean x() {
        mj mjVar = this.I;
        mj mjVar2 = mjVar.f;
        if (mjVar2 == null || mjVar2.f != mjVar) {
            mj mjVar3 = this.K;
            mj mjVar4 = mjVar3.f;
            if (mjVar4 != null && mjVar4.f == mjVar3) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final boolean y() {
        mj mjVar = this.J;
        mj mjVar2 = mjVar.f;
        if (mjVar2 == null || mjVar2.f != mjVar) {
            mj mjVar3 = this.L;
            mj mjVar4 = mjVar3.f;
            if (mjVar4 != null && mjVar4.f == mjVar3) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final boolean z() {
        if (this.g && this.g0 != 8) {
            return true;
        }
        return false;
    }
}
