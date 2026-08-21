package defpackage;

/* loaded from: classes.dex */
public final class nz extends r21 {
    public final /* synthetic */ int k;

    public /* synthetic */ nz(int i) {
        this.k = i;
    }

    public final short S(int i) {
        int i2;
        switch (this.k) {
            case 0:
                int i3 = (2093056 & i) >>> 9;
                int i4 = (14680064 & i) >>> 18;
                i2 = ((((i & 4095) ^ (i >>> 12)) ^ i3) ^ i4) ^ (i >>> 21);
                break;
            default:
                int i5 = i & 8191;
                int i6 = i >>> 13;
                int i7 = ((i6 << 4) ^ (i6 << 3)) ^ (i6 << 1);
                int i8 = i7 >>> 13;
                i2 = (((i5 ^ i6) ^ i8) ^ (i7 & 8191)) ^ (((i8 << 4) ^ (i8 << 3)) ^ (i8 << 1));
                break;
        }
        return (short) i2;
    }

    public short T(short s) {
        return S(k20.t(s));
    }

    public short U(short s, short s2) {
        long j = s;
        long j2 = s2;
        long j3 = (j2 << 18) * (64 & j);
        long j4 = j ^ (j << 21);
        long j5 = ((j2 << 15) * (j4 & 8589934624L)) ^ (((((j3 ^ ((268435457 & j4) * j2)) ^ ((j2 << 3) * (536870914 & j4))) ^ ((j2 << 6) * (1073741828 & j4))) ^ ((j2 << 9) * (2147483656L & j4))) ^ ((j2 << 12) * (4294967312L & j4)));
        long j6 = 2305834213120671744L & j5;
        long j7 = j5 ^ ((j6 >>> 26) ^ (((j6 >>> 18) ^ (j6 >>> 20)) ^ (j6 >>> 24)));
        long j8 = 8796025913344L & j7;
        return S(((int) (j7 ^ ((j8 >>> 26) ^ (((j8 >>> 18) ^ (j8 >>> 20)) ^ (j8 >>> 24))))) & 67108863);
    }

    public short V(short s, short s2) {
        long j = s;
        long j2 = s2;
        long j3 = (j2 << 6) * (64 & j);
        long j4 = j ^ (j << 7);
        long j5 = ((j2 << 5) * (j4 & 524320)) ^ (((((j3 ^ ((16385 & j4) * j2)) ^ ((j2 << 1) * (32770 & j4))) ^ ((j2 << 2) * (65540 & j4))) ^ ((j2 << 3) * (131080 & j4))) ^ ((j2 << 4) * (262160 & j4)));
        long j6 = 137371844608L & j5;
        return S(((int) (j5 ^ ((j6 >>> 26) ^ (((j6 >>> 18) ^ (j6 >>> 20)) ^ (j6 >>> 24))))) & 67108863);
    }

    @Override // defpackage.r21
    public final short y(short s) {
        switch (this.k) {
            case 0:
                short z = z(T(s), s);
                short z2 = z(T(T(z)), z);
                return T(z(T(z(T(T(z(T(T(T(T(z2)))), z2))), z)), s));
            default:
                short V = V(s, s);
                short U = U(V, V);
                return V(U(S(k20.t(S(k20.t(U(S(k20.t(S(k20.t(U)))), U))))), U), (short) 1);
        }
    }

    @Override // defpackage.r21
    public final short z(short s, short s2) {
        switch (this.k) {
            case 0:
                int i = (s2 & 1) * s;
                for (int i2 = 1; i2 < 12; i2++) {
                    i ^= ((1 << i2) & s2) * s;
                }
                return S(i);
            default:
                int i3 = (s2 & 1) * s;
                for (int i4 = 1; i4 < 13; i4++) {
                    i3 ^= ((1 << i4) & s2) * s;
                }
                return S(i3);
        }
    }
}
