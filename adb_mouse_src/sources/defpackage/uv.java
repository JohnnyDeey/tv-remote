package defpackage;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class uv {
    public int a;
    public mj d;
    public mj e;
    public mj f;
    public mj g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int q;
    public final /* synthetic */ wv r;
    public ak b = null;
    public int c = 0;
    public int l = 0;
    public int m = 0;
    public int n = 0;
    public int o = 0;
    public int p = 0;

    public uv(wv wvVar, int i, mj mjVar, mj mjVar2, mj mjVar3, mj mjVar4, int i2) {
        this.r = wvVar;
        this.a = i;
        this.d = mjVar;
        this.e = mjVar2;
        this.f = mjVar3;
        this.g = mjVar4;
        this.h = wvVar.w0;
        this.i = wvVar.s0;
        this.j = wvVar.x0;
        this.k = wvVar.t0;
        this.q = i2;
    }

    public final void a(ak akVar) {
        int i = this.a;
        int i2 = this.q;
        int i3 = 0;
        wv wvVar = this.r;
        if (i == 0) {
            int U = wvVar.U(akVar, i2);
            if (akVar.p0[0] == 3) {
                this.p++;
                U = 0;
            }
            int i4 = wvVar.P0;
            if (akVar.g0 != 8) {
                i3 = i4;
            }
            this.l = U + i3 + this.l;
            int T = wvVar.T(akVar, this.q);
            if (this.b == null || this.c < T) {
                this.b = akVar;
                this.c = T;
                this.m = T;
            }
        } else {
            int U2 = wvVar.U(akVar, i2);
            int T2 = wvVar.T(akVar, this.q);
            if (akVar.p0[1] == 3) {
                this.p++;
                T2 = 0;
            }
            int i5 = wvVar.Q0;
            if (akVar.g0 != 8) {
                i3 = i5;
            }
            this.m = T2 + i3 + this.m;
            if (this.b == null || this.c < U2) {
                this.b = akVar;
                this.c = U2;
                this.l = U2;
            }
        }
        this.o++;
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x0103, code lost:
    
        if (r24 != false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0105, code lost:
    
        r9 = 1.0f - r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0115, code lost:
    
        if (r24 != false) goto L89;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(int r23, boolean r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 724
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uv.b(int, boolean, boolean):void");
    }

    public final int c() {
        int i = this.a;
        int i2 = this.m;
        if (i == 1) {
            return i2 - this.r.Q0;
        }
        return i2;
    }

    public final int d() {
        int i = this.a;
        int i2 = this.l;
        if (i == 0) {
            return i2 - this.r.P0;
        }
        return i2;
    }

    public final void e(int i) {
        wv wvVar;
        int i2;
        int i3 = this.p;
        if (i3 != 0) {
            int i4 = this.o;
            int i5 = i / i3;
            int i6 = 0;
            while (true) {
                wvVar = this.r;
                if (i6 >= i4 || (i2 = this.n + i6) >= wvVar.b1) {
                    break;
                }
                ak akVar = wvVar.a1[i2];
                if (this.a == 0) {
                    if (akVar != null) {
                        int[] iArr = akVar.p0;
                        if (iArr[0] == 3 && akVar.r == 0) {
                            wvVar.V(1, i5, iArr[1], akVar.k(), akVar);
                        }
                    }
                } else if (akVar != null) {
                    int[] iArr2 = akVar.p0;
                    if (iArr2[1] == 3 && akVar.s == 0) {
                        int i7 = i5;
                        wvVar.V(iArr2[0], akVar.q(), 1, i7, akVar);
                        i5 = i7;
                    }
                }
                i6++;
            }
            this.l = 0;
            this.m = 0;
            this.b = null;
            this.c = 0;
            int i8 = this.o;
            for (int i9 = 0; i9 < i8; i9++) {
                int i10 = this.n + i9;
                if (i10 < wvVar.b1) {
                    ak akVar2 = wvVar.a1[i10];
                    if (this.a == 0) {
                        int q = akVar2.q();
                        int i11 = wvVar.P0;
                        if (akVar2.g0 == 8) {
                            i11 = 0;
                        }
                        this.l = q + i11 + this.l;
                        int T = wvVar.T(akVar2, this.q);
                        if (this.b == null || this.c < T) {
                            this.b = akVar2;
                            this.c = T;
                            this.m = T;
                        }
                    } else {
                        int U = wvVar.U(akVar2, this.q);
                        int T2 = wvVar.T(akVar2, this.q);
                        int i12 = wvVar.Q0;
                        if (akVar2.g0 == 8) {
                            i12 = 0;
                        }
                        this.m = T2 + i12 + this.m;
                        if (this.b == null || this.c < U) {
                            this.b = akVar2;
                            this.c = U;
                            this.l = U;
                        }
                    }
                } else {
                    return;
                }
            }
        }
    }

    public final void f(int i, mj mjVar, mj mjVar2, mj mjVar3, mj mjVar4, int i2, int i3, int i4, int i5, int i6) {
        this.a = i;
        this.d = mjVar;
        this.e = mjVar2;
        this.f = mjVar3;
        this.g = mjVar4;
        this.h = i2;
        this.i = i3;
        this.j = i4;
        this.k = i5;
        this.q = i6;
    }
}
