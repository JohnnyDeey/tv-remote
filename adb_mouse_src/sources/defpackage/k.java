package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class k extends x {
    public static final k[] d;
    public final byte[] c;

    static {
        new d(2, k.class);
        d = new k[12];
    }

    public k(byte[] bArr, boolean z) {
        byte[] bArr2;
        if (!o.u(bArr)) {
            int i = 0;
            if ((bArr[0] & 128) == 0) {
                if (z) {
                    bArr2 = f20.e(bArr);
                } else {
                    bArr2 = bArr;
                }
                this.c = bArr2;
                int length = bArr.length - 1;
                while (i < length) {
                    byte b = bArr[i];
                    i++;
                    if (b != (bArr[i] >> 7)) {
                        return;
                    }
                }
                return;
            }
            c.k("enumerated must be non-negative");
            throw null;
        }
        c.k("malformed enumerated");
        throw null;
    }

    public static k q(byte[] bArr, boolean z) {
        if (bArr.length > 1) {
            return new k(bArr, z);
        }
        if (bArr.length != 0) {
            int i = bArr[0] & 255;
            if (i >= 12) {
                return new k(bArr, z);
            }
            k[] kVarArr = d;
            k kVar = kVarArr[i];
            if (kVar == null) {
                k kVar2 = new k(bArr, z);
                kVarArr[i] = kVar2;
                return kVar2;
            }
            return kVar;
        }
        c.k("ENUMERATED has zero length");
        return null;
    }

    @Override // defpackage.x, defpackage.p
    public final int hashCode() {
        return f20.K(this.c);
    }

    @Override // defpackage.x
    public final boolean i(x xVar) {
        if (!(xVar instanceof k)) {
            return false;
        }
        return Arrays.equals(this.c, ((k) xVar).c);
    }

    @Override // defpackage.x
    public final void j(v vVar, boolean z) {
        vVar.m(10, z, this.c);
    }

    @Override // defpackage.x
    public final boolean k() {
        return false;
    }

    @Override // defpackage.x
    public final int l(boolean z) {
        return v.f(this.c.length, z);
    }
}
