package defpackage;

/* loaded from: classes.dex */
public final class gk0 implements mq {
    public static final long[] p = {4794697086780616226L, 8158064640168781261L, -5349999486874862801L, -1606136188198331460L, 4131703408338449720L, 6480981068601479193L, -7908458776815382629L, -6116909921290321640L, -2880145864133508542L, 1334009975649890238L, 2608012711638119052L, 6128411473006802146L, 8268148722764581231L, -9160688886553864527L, -7215885187991268811L, -4495734319001033068L, -1973867731355612462L, -1171420211273849373L, 1135362057144423861L, 2597628984639134821L, 3308224258029322869L, 5365058923640841347L, 6679025012923562964L, 8573033837759648693L, -7476448914759557205L, -6327057829258317296L, -5763719355590565569L, -4658551843659510044L, -4116276920077217854L, -3051310485924567259L, 489312712824947311L, 1452737877330783856L, 2861767655752347644L, 3322285676063803686L, 5560940570517711597L, 5996557281743188959L, 7280758554555802590L, 8532644243296465576L, -9096487096722542874L, -7894198246740708037L, -6719396339535248540L, -6333637450476146687L, -4446306890439682159L, -4076793802049405392L, -3345356375505022440L, -2983346525034927856L, -860691631967231958L, 1182934255886127544L, 1847814050463011016L, 2177327727835720531L, 2830643537854262169L, 3796741975233480872L, 4115178125766777443L, 5681478168544905931L, 6601373596472566643L, 7507060721942968483L, 8399075790359081724L, 8693463985226723168L, -8878714635349349518L, -8302665154208450068L, -8016688836872298968L, -6606660893046293015L, -4685533653050689259L, -4147400797238176981L, -3880063495543823972L, -3348786107499101689L, -1523767162380948706L, -757361751448694408L, 500013540394364858L, 748580250866718886L, 1242879168328830382L, 1977374033974150939L, 2944078676154940804L, 3659926193048069267L, 4368137639120453308L, 4836135668995329356L, 5532061633213252278L, 6448918945643986474L, 6902733635092675308L, 7801388544844847127L};
    public final byte[] a;
    public int b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public long k;
    public long l;
    public final long[] m;
    public int n;
    public final /* synthetic */ int o;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public gk0(int i) {
        this((byte) 0);
        this.o = i;
        switch (i) {
            case 1:
                this((byte) 0);
                mi0.s(this);
                wl.a();
                l();
                return;
            default:
                return;
        }
    }

    public static long e(long j, long j2, long j3) {
        return ((~j) & j3) ^ (j2 & j);
    }

    public static long f(long j, long j2, long j3) {
        return ((j & j3) ^ (j & j2)) ^ (j2 & j3);
    }

    public static long g(long j) {
        return ((j >>> 39) | (j << 25)) ^ (((j << 36) | (j >>> 28)) ^ ((j << 30) | (j >>> 34)));
    }

    public static long h(long j) {
        return ((j >>> 41) | (j << 23)) ^ (((j << 50) | (j >>> 14)) ^ ((j << 46) | (j >>> 18)));
    }

    @Override // defpackage.mq
    public final String a() {
        switch (this.o) {
            case 0:
                return "SHA-384";
            default:
                return "SHA-512";
        }
    }

    @Override // defpackage.mq
    public final int b() {
        switch (this.o) {
            case 0:
                return 48;
            default:
                return 64;
        }
    }

    @Override // defpackage.mq
    public final int c(int i, byte[] bArr) {
        switch (this.o) {
            case 0:
                i();
                k20.R(i, this.e, bArr);
                k20.R(i + 8, this.f, bArr);
                k20.R(i + 16, this.g, bArr);
                k20.R(i + 24, this.h, bArr);
                k20.R(i + 32, this.i, bArr);
                k20.R(i + 40, this.j, bArr);
                l();
                return 48;
            default:
                i();
                k20.R(i, this.e, bArr);
                k20.R(i + 8, this.f, bArr);
                k20.R(i + 16, this.g, bArr);
                k20.R(i + 24, this.h, bArr);
                k20.R(i + 32, this.i, bArr);
                k20.R(i + 40, this.j, bArr);
                k20.R(i + 48, this.k, bArr);
                k20.R(i + 56, this.l, bArr);
                l();
                return 64;
        }
    }

    @Override // defpackage.mq
    public final void d(byte b) {
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        byte[] bArr = this.a;
        bArr[i] = b;
        if (i2 == bArr.length) {
            k(0, bArr);
            this.b = 0;
        }
        this.c++;
    }

    public final void i() {
        long j = this.c;
        if (j > 2305843009213693951L) {
            this.d += j >>> 61;
            this.c = j & 2305843009213693951L;
        }
        long j2 = this.c << 3;
        long j3 = this.d;
        byte b = Byte.MIN_VALUE;
        while (true) {
            d(b);
            if (this.b == 0) {
                break;
            } else {
                b = 0;
            }
        }
        if (this.n > 14) {
            j();
        }
        long[] jArr = this.m;
        jArr[14] = j3;
        jArr[15] = j2;
        j();
    }

    public final void j() {
        long[] jArr;
        long j = this.c;
        if (j > 2305843009213693951L) {
            this.d += j >>> 61;
            this.c = j & 2305843009213693951L;
        }
        int i = 16;
        while (true) {
            jArr = this.m;
            if (i > 79) {
                break;
            }
            long j2 = jArr[i - 2];
            long j3 = ((j2 >>> 6) ^ (((j2 << 45) | (j2 >>> 19)) ^ ((j2 << 3) | (j2 >>> 61)))) + jArr[i - 7];
            long j4 = jArr[i - 15];
            jArr[i] = j3 + ((((j4 >>> 8) | (j4 << 56)) ^ ((j4 << 63) | (j4 >>> 1))) ^ (j4 >>> 7)) + jArr[i - 16];
            i++;
        }
        long j5 = this.e;
        long j6 = this.f;
        long j7 = this.g;
        long j8 = this.h;
        long j9 = this.i;
        long j10 = this.j;
        long j11 = this.k;
        long j12 = j5;
        long j13 = j8;
        long j14 = j6;
        long j15 = j9;
        long j16 = j7;
        long j17 = j10;
        long j18 = this.l;
        int i2 = 0;
        int i3 = 0;
        while (i2 < 10) {
            long h = h(j15);
            long e = e(j15, j17, j11);
            long j19 = j15;
            long j20 = j11;
            long j21 = j17;
            long[] jArr2 = p;
            int i4 = i3 + 1;
            long j22 = h + e + jArr2[i3] + jArr[i3] + j18;
            long j23 = j13 + j22;
            long j24 = j14;
            long j25 = j16;
            long g = g(j12) + f(j12, j24, j25) + j22;
            long h2 = h(j23) + e(j23, j19, j21) + jArr2[i4];
            int i5 = i3 + 2;
            long j26 = h2 + jArr[i4] + j20;
            long j27 = j25 + j26;
            long j28 = j12;
            long g2 = g(g) + f(g, j28, j24) + j26;
            int i6 = i3 + 3;
            long h3 = h(j27) + e(j27, j23, j19) + jArr2[i5] + jArr[i5] + j21;
            long j29 = j24 + h3;
            long g3 = g(g2) + f(g2, g, j28) + h3;
            int i7 = i3 + 4;
            long h4 = h(j29) + e(j29, j27, j23) + jArr2[i6] + jArr[i6] + j19;
            long j30 = j28 + h4;
            long g4 = g(g3) + f(g3, g2, g) + h4;
            int i8 = i3 + 5;
            long h5 = h(j30) + e(j30, j29, j27) + jArr2[i7] + jArr[i7] + j23;
            long j31 = g + h5;
            long g5 = g(g4) + f(g4, g3, g2) + h5;
            int i9 = i3 + 6;
            long h6 = h(j31) + e(j31, j30, j29) + jArr2[i8] + jArr[i8] + j27;
            long j32 = g2 + h6;
            long g6 = g(g5) + f(g5, g4, g3) + h6;
            int i10 = i3 + 7;
            long h7 = h(j32) + e(j32, j31, j30) + jArr2[i9] + jArr[i9] + j29;
            long j33 = g3 + h7;
            long g7 = g(g6) + f(g6, g5, g4) + h7;
            i3 += 8;
            long h8 = h(j33) + e(j33, j32, j31) + jArr2[i10] + jArr[i10] + j30;
            long j34 = g4 + h8;
            long g8 = h8 + g(g7) + f(g7, g6, g5);
            i2++;
            j17 = j33;
            j16 = g6;
            j15 = j34;
            j18 = j31;
            j14 = g7;
            j13 = g5;
            j11 = j32;
            j12 = g8;
        }
        this.e += j12;
        this.f += j14;
        this.g += j16;
        this.h += j13;
        this.i += j15;
        this.j += j17;
        this.k += j11;
        this.l += j18;
        this.n = 0;
        for (int i11 = 0; i11 < 16; i11++) {
            jArr[i11] = 0;
        }
    }

    public final void k(int i, byte[] bArr) {
        this.m[this.n] = (k20.e(i + 4, bArr) & 4294967295L) | ((k20.e(i, bArr) & 4294967295L) << 32);
        int i2 = this.n + 1;
        this.n = i2;
        if (i2 == 16) {
            j();
        }
    }

    public final void l() {
        switch (this.o) {
            case 0:
                m();
                this.e = -3766243637369397544L;
                this.f = 7105036623409894663L;
                this.g = -7973340178411365097L;
                this.h = 1526699215303891257L;
                this.i = 7436329637833083697L;
                this.j = -8163818279084223215L;
                this.k = -2662702644619276377L;
                this.l = 5167115440072839076L;
                return;
            default:
                m();
                this.e = 7640891576956012808L;
                this.f = -4942790177534073029L;
                this.g = 4354685564936845355L;
                this.h = -6534734903238641935L;
                this.i = 5840696475078001361L;
                this.j = -7276294671716946913L;
                this.k = 2270897969802886507L;
                this.l = 6620516959819538809L;
                return;
        }
    }

    public final void m() {
        this.c = 0L;
        this.d = 0L;
        int i = 0;
        this.b = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.a;
            if (i2 >= bArr.length) {
                break;
            }
            bArr[i2] = 0;
            i2++;
        }
        this.n = 0;
        while (true) {
            long[] jArr = this.m;
            if (i != jArr.length) {
                jArr[i] = 0;
                i++;
            } else {
                return;
            }
        }
    }

    @Override // defpackage.mq
    public final void update(byte[] bArr, int i, int i2) {
        while (this.b != 0 && i2 > 0) {
            d(bArr[i]);
            i++;
            i2--;
        }
        while (true) {
            byte[] bArr2 = this.a;
            if (i2 < bArr2.length) {
                break;
            }
            k(i, bArr);
            i += bArr2.length;
            i2 -= bArr2.length;
            this.c += bArr2.length;
        }
        while (i2 > 0) {
            d(bArr[i]);
            i++;
            i2--;
        }
    }

    public gk0(byte b) {
        this.a = new byte[8];
        this.m = new long[80];
        this.b = 0;
        l();
    }
}
