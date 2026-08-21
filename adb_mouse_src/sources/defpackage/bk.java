package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class bk extends ak {
    public int A0;
    public zf[] B0;
    public zf[] C0;
    public int D0;
    public boolean E0;
    public boolean F0;
    public WeakReference G0;
    public WeakReference H0;
    public WeakReference I0;
    public WeakReference J0;
    public final HashSet K0;
    public final gd L0;
    public ArrayList q0 = new ArrayList();
    public final b8 r0 = new b8(this);
    public final yo s0;
    public int t0;
    public rj u0;
    public boolean v0;
    public final e60 w0;
    public int x0;
    public int y0;
    public int z0;

    /* JADX WARN: Type inference failed for: r0v2, types: [yo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, gd] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, gd] */
    public bk() {
        ?? obj = new Object();
        obj.b = true;
        obj.c = true;
        obj.e = new ArrayList();
        new ArrayList();
        obj.f = null;
        obj.g = new Object();
        obj.h = new ArrayList();
        obj.a = this;
        obj.d = this;
        this.s0 = obj;
        this.u0 = null;
        this.v0 = false;
        this.w0 = new e60();
        this.z0 = 0;
        this.A0 = 0;
        this.B0 = new zf[4];
        this.C0 = new zf[4];
        this.D0 = 257;
        this.E0 = false;
        this.F0 = false;
        this.G0 = null;
        this.H0 = null;
        this.I0 = null;
        this.J0 = null;
        this.K0 = new HashSet();
        this.L0 = new Object();
    }

    public static void V(ak akVar, rj rjVar, gd gdVar) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i;
        int i2;
        if (rjVar == null) {
            return;
        }
        int i3 = akVar.g0;
        int[] iArr = akVar.t;
        if (i3 != 8 && !(akVar instanceof p00) && !(akVar instanceof mc)) {
            int[] iArr2 = akVar.p0;
            gdVar.a = iArr2[0];
            gdVar.b = iArr2[1];
            gdVar.c = akVar.q();
            gdVar.d = akVar.k();
            gdVar.i = false;
            gdVar.j = 0;
            if (gdVar.a == 3) {
                z = true;
            } else {
                z = false;
            }
            if (gdVar.b == 3) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z && akVar.W > 0.0f) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z2 && akVar.W > 0.0f) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z && akVar.t(0) && akVar.r == 0 && !z3) {
                gdVar.a = 2;
                if (z2 && akVar.s == 0) {
                    gdVar.a = 1;
                }
                z = false;
            }
            if (z2 && akVar.t(1) && akVar.s == 0 && !z4) {
                gdVar.b = 2;
                if (z && akVar.r == 0) {
                    gdVar.b = 1;
                }
                z2 = false;
            }
            if (akVar.A()) {
                gdVar.a = 1;
                z = false;
            }
            if (akVar.B()) {
                gdVar.b = 1;
                z2 = false;
            }
            if (z3) {
                if (iArr[0] == 4) {
                    gdVar.a = 1;
                } else if (!z2) {
                    if (gdVar.b == 1) {
                        i2 = gdVar.d;
                    } else {
                        gdVar.a = 2;
                        rjVar.c(akVar, gdVar);
                        i2 = gdVar.f;
                    }
                    gdVar.a = 1;
                    gdVar.c = (int) (akVar.W * i2);
                }
            }
            if (z4) {
                if (iArr[1] == 4) {
                    gdVar.b = 1;
                } else if (!z) {
                    if (gdVar.a == 1) {
                        i = gdVar.c;
                    } else {
                        gdVar.b = 2;
                        rjVar.c(akVar, gdVar);
                        i = gdVar.e;
                    }
                    gdVar.b = 1;
                    int i4 = akVar.X;
                    float f = akVar.W;
                    if (i4 == -1) {
                        gdVar.d = (int) (i / f);
                    } else {
                        gdVar.d = (int) (f * i);
                    }
                }
            }
            rjVar.c(akVar, gdVar);
            akVar.O(gdVar.e);
            akVar.L(gdVar.f);
            akVar.E = gdVar.h;
            akVar.I(gdVar.g);
            gdVar.j = 0;
            return;
        }
        gdVar.e = 0;
        gdVar.f = 0;
    }

    @Override // defpackage.ak
    public final void C() {
        this.w0.t();
        this.x0 = 0;
        this.y0 = 0;
        this.q0.clear();
        super.C();
    }

    @Override // defpackage.ak
    public final void F(b8 b8Var) {
        super.F(b8Var);
        int size = this.q0.size();
        for (int i = 0; i < size; i++) {
            ((ak) this.q0.get(i)).F(b8Var);
        }
    }

    @Override // defpackage.ak
    public final void P(boolean z, boolean z2) {
        super.P(z, z2);
        int size = this.q0.size();
        for (int i = 0; i < size; i++) {
            ((ak) this.q0.get(i)).P(z, z2);
        }
    }

    public final void R(ak akVar, int i) {
        if (i == 0) {
            int i2 = this.z0 + 1;
            zf[] zfVarArr = this.C0;
            if (i2 >= zfVarArr.length) {
                this.C0 = (zf[]) Arrays.copyOf(zfVarArr, zfVarArr.length * 2);
            }
            zf[] zfVarArr2 = this.C0;
            int i3 = this.z0;
            zfVarArr2[i3] = new zf(akVar, 0, this.v0);
            this.z0 = i3 + 1;
            return;
        }
        if (i == 1) {
            int i4 = this.A0 + 1;
            zf[] zfVarArr3 = this.B0;
            if (i4 >= zfVarArr3.length) {
                this.B0 = (zf[]) Arrays.copyOf(zfVarArr3, zfVarArr3.length * 2);
            }
            zf[] zfVarArr4 = this.B0;
            int i5 = this.A0;
            zfVarArr4[i5] = new zf(akVar, 1, this.v0);
            this.A0 = i5 + 1;
        }
    }

    public final void S(e60 e60Var) {
        bk bkVar;
        e60 e60Var2;
        int i;
        boolean W = W(64);
        b(e60Var, W);
        int size = this.q0.size();
        boolean z = false;
        for (int i2 = 0; i2 < size; i2++) {
            ak akVar = (ak) this.q0.get(i2);
            boolean[] zArr = akVar.S;
            zArr[0] = false;
            zArr[1] = false;
            if (akVar instanceof mc) {
                z = true;
            }
        }
        if (z) {
            for (int i3 = 0; i3 < size; i3++) {
                ak akVar2 = (ak) this.q0.get(i3);
                if (akVar2 instanceof mc) {
                    mc mcVar = (mc) akVar2;
                    for (int i4 = 0; i4 < mcVar.r0; i4++) {
                        ak akVar3 = mcVar.q0[i4];
                        if (mcVar.t0 || akVar3.c()) {
                            int i5 = mcVar.s0;
                            if (i5 != 0 && i5 != 1) {
                                if (i5 == 2 || i5 == 3) {
                                    akVar3.S[1] = true;
                                }
                            } else {
                                akVar3.S[0] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = this.K0;
        hashSet.clear();
        for (int i6 = 0; i6 < size; i6++) {
            ak akVar4 = (ak) this.q0.get(i6);
            akVar4.getClass();
            boolean z2 = akVar4 instanceof wv;
            if (z2 || (akVar4 instanceof p00)) {
                if (z2) {
                    hashSet.add(akVar4);
                } else {
                    akVar4.b(e60Var, W);
                }
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                wv wvVar = (wv) ((ak) it.next());
                for (int i7 = 0; i7 < wvVar.r0; i7++) {
                    if (hashSet.contains(wvVar.q0[i7])) {
                        wvVar.b(e60Var, W);
                        hashSet.remove(wvVar);
                        break;
                    }
                }
            }
            if (size2 == hashSet.size()) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((ak) it2.next()).b(e60Var, W);
                }
                hashSet.clear();
            }
        }
        if (e60.q) {
            HashSet hashSet2 = new HashSet();
            for (int i8 = 0; i8 < size; i8++) {
                ak akVar5 = (ak) this.q0.get(i8);
                akVar5.getClass();
                if (!(akVar5 instanceof wv) && !(akVar5 instanceof p00)) {
                    hashSet2.add(akVar5);
                }
            }
            if (this.p0[0] == 2) {
                i = 0;
            } else {
                i = 1;
            }
            bkVar = this;
            e60Var2 = e60Var;
            bkVar.a(this, e60Var2, hashSet2, i, false);
            Iterator it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                ak akVar6 = (ak) it3.next();
                r21.e(bkVar, e60Var2, akVar6);
                akVar6.b(e60Var2, W);
            }
        } else {
            bkVar = this;
            e60Var2 = e60Var;
            for (int i9 = 0; i9 < size; i9++) {
                ak akVar7 = (ak) bkVar.q0.get(i9);
                if (akVar7 instanceof bk) {
                    int[] iArr = akVar7.p0;
                    int i10 = iArr[0];
                    int i11 = iArr[1];
                    if (i10 == 2) {
                        akVar7.M(1);
                    }
                    if (i11 == 2) {
                        akVar7.N(1);
                    }
                    akVar7.b(e60Var2, W);
                    if (i10 == 2) {
                        akVar7.M(i10);
                    }
                    if (i11 == 2) {
                        akVar7.N(i11);
                    }
                } else {
                    r21.e(bkVar, e60Var2, akVar7);
                    if (!(akVar7 instanceof wv) && !(akVar7 instanceof p00)) {
                        akVar7.b(e60Var2, W);
                    }
                }
            }
        }
        if (bkVar.z0 > 0) {
            wv0.i(bkVar, e60Var2, null, 0);
        }
        if (bkVar.A0 > 0) {
            wv0.i(bkVar, e60Var2, null, 1);
        }
    }

    public final boolean T(int i, boolean z) {
        boolean z2;
        yo yoVar = this.s0;
        ArrayList arrayList = yoVar.e;
        bk bkVar = yoVar.a;
        boolean z3 = false;
        int j = bkVar.j(0);
        int j2 = bkVar.j(1);
        int r = bkVar.r();
        int s = bkVar.s();
        if (z && (j == 2 || j2 == 2)) {
            int size = arrayList.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                Object obj = arrayList.get(i2);
                i2++;
                d01 d01Var = (d01) obj;
                if (d01Var.f == i && !d01Var.k()) {
                    z = false;
                    break;
                }
            }
            if (i == 0) {
                if (z && j == 2) {
                    bkVar.M(1);
                    bkVar.O(yoVar.d(bkVar, 0));
                    bkVar.d.e.d(bkVar.q());
                }
            } else if (z && j2 == 2) {
                bkVar.N(1);
                bkVar.L(yoVar.d(bkVar, 1));
                bkVar.e.e.d(bkVar.k());
            }
        }
        int[] iArr = bkVar.p0;
        if (i == 0) {
            int i3 = iArr[0];
            if (i3 == 1 || i3 == 4) {
                int q = bkVar.q() + r;
                bkVar.d.i.d(q);
                bkVar.d.e.d(q - r);
                z2 = true;
            }
            z2 = false;
        } else {
            int i4 = iArr[1];
            if (i4 == 1 || i4 == 4) {
                int k = bkVar.k() + s;
                bkVar.e.i.d(k);
                bkVar.e.e.d(k - s);
                z2 = true;
            }
            z2 = false;
        }
        yoVar.g();
        int size2 = arrayList.size();
        int i5 = 0;
        while (i5 < size2) {
            Object obj2 = arrayList.get(i5);
            i5++;
            d01 d01Var2 = (d01) obj2;
            if (d01Var2.f == i && (d01Var2.b != bkVar || d01Var2.g)) {
                d01Var2.e();
            }
        }
        int size3 = arrayList.size();
        int i6 = 0;
        while (true) {
            if (i6 < size3) {
                Object obj3 = arrayList.get(i6);
                i6++;
                d01 d01Var3 = (d01) obj3;
                if (d01Var3.f == i && (z2 || d01Var3.b != bkVar)) {
                    if (!d01Var3.h.j) {
                        break;
                    }
                    if (!d01Var3.i.j) {
                        break;
                    }
                    if (!(d01Var3 instanceof ag) && !d01Var3.e.j) {
                        break;
                    }
                }
            } else {
                z3 = true;
                break;
            }
        }
        bkVar.M(j);
        bkVar.N(j2);
        return z3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0661  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0677 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0685  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0696  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x06b3  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x07c3  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x081a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0827 A[LOOP:14: B:278:0x0825->B:279:0x0827, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:292:0x088e  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x08ad  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x08b9  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x08f1  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x08f2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:315:0x08ed  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x08b5  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x089a  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0800  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0902  */
    /* JADX WARN: Removed duplicated region for block: B:592:0x05e0  */
    /* JADX WARN: Removed duplicated region for block: B:610:0x060d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:613:0x061e  */
    /* JADX WARN: Removed duplicated region for block: B:620:0x063d  */
    /* JADX WARN: Removed duplicated region for block: B:626:0x0653  */
    /* JADX WARN: Removed duplicated region for block: B:628:0x0637  */
    /* JADX WARN: Type inference failed for: r6v87, types: [java.lang.Object, gd] */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v14 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void U() {
        /*
            Method dump skipped, instructions count: 2320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bk.U():void");
    }

    public final boolean W(int i) {
        if ((this.D0 & i) == i) {
            return true;
        }
        return false;
    }

    @Override // defpackage.ak
    public final void n(StringBuilder sb) {
        sb.append(this.j + ":{\n");
        StringBuilder sb2 = new StringBuilder("  actualWidth:");
        sb2.append(this.U);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("  actualHeight:" + this.V);
        sb.append("\n");
        ArrayList arrayList = this.q0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((ak) obj).n(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }
}
