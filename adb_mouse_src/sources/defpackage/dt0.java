package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.math.BigInteger;
import java.util.Vector;

/* loaded from: classes.dex */
public final class dt0 extends c1 {
    public ro c;
    public r6 d;
    public i81 e;
    public BigInteger f;

    @Override // defpackage.c1
    public final void a(nq nqVar) {
        throw null;
    }

    @Override // defpackage.c1
    public final i30 b() {
        i81 i81Var = this.e;
        BigInteger bigInteger = this.f;
        i81Var.getClass();
        try {
            BigInteger d = ((rd) i81Var.d).d(bigInteger);
            rd rdVar = this.b.a;
            byte[] byteArray = d.toByteArray();
            if (byteArray[0] == 0 && byteArray.length != 1) {
                int length = byteArray.length - 1;
                byte[] bArr = new byte[length];
                System.arraycopy(byteArray, 1, bArr, 0, length);
                byteArray = bArr;
            }
            return new i30(rdVar, f20.e(byteArray));
        } catch (IllegalArgumentException e) {
            f40.a(47, e, null);
            return null;
        }
    }

    @Override // defpackage.c1
    public final void d(s20 s20Var) {
        throw new us0((short) 80, null, null);
    }

    @Override // defpackage.c1
    public final void e(wf wfVar) {
        if (this.a != 21) {
            this.d = wfVar.b(0);
            return;
        }
        throw new us0((short) 80, null, null);
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [nq, java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r2v1, types: [rd, java.lang.Object] */
    @Override // defpackage.c1
    public final void f(a10 a10Var) {
        InputStream inputStream;
        nq nqVar;
        BigInteger bigInteger;
        BigInteger bigInteger2;
        if (this.a != 21) {
            ?? byteArrayOutputStream = new ByteArrayOutputStream();
            inputStream = new dr0(a10Var, byteArrayOutputStream);
            nqVar = byteArrayOutputStream;
        } else {
            inputStream = a10Var;
            nqVar = null;
        }
        BigInteger bigInteger3 = new BigInteger(1, ht0.L(inputStream));
        BigInteger bigInteger4 = new BigInteger(1, ht0.L(inputStream));
        byte[] N = ht0.N(inputStream);
        BigInteger bigInteger5 = new BigInteger(1, ht0.L(inputStream));
        f20.e(N);
        if (nqVar != null) {
            ht0.V(this.b, a10Var, this.d, nqVar);
        }
        BigInteger[] bigIntegerArr = (BigInteger[]) new BigInteger[]{bigInteger3, bigInteger4}.clone();
        Vector vector = this.c.a;
        for (int i = 0; i < vector.size(); i++) {
            gl0 gl0Var = (gl0) vector.elementAt(i);
            BigInteger[] bigIntegerArr2 = (BigInteger[]) bigIntegerArr.clone();
            BigInteger bigInteger6 = bigIntegerArr2[0];
            BigInteger bigInteger7 = gl0Var.a;
            if ((bigInteger6 == bigInteger7 || bigInteger6.equals(bigInteger7)) && ((bigInteger = bigIntegerArr2[1]) == (bigInteger2 = gl0Var.b) || bigInteger.equals(bigInteger2))) {
                BigInteger mod = bigInteger5.mod(bigInteger3);
                if (!mod.equals(BigInteger.ZERO)) {
                    this.f = mod;
                    rd rdVar = this.b.a;
                    ?? obj = new Object();
                    BigInteger[] bigIntegerArr3 = (BigInteger[]) bigIntegerArr.clone();
                    BigInteger bigInteger8 = bigIntegerArr3[0];
                    BigInteger bigInteger9 = bigIntegerArr3[1];
                    c30 q = rdVar.q(2);
                    obj.c = bigInteger8;
                    obj.d = bigInteger9;
                    obj.g = q;
                    this.e = new i81(23, (Object) obj);
                    return;
                }
                throw new us0((short) 47, null, null);
            }
        }
        throw new us0((short) 71, null, null);
    }

    @Override // defpackage.c1
    public final boolean g() {
        return true;
    }

    @Override // defpackage.c1
    public final void i() {
        if (this.a == 21) {
        } else {
            throw new us0((short) 80, null, null);
        }
    }
}
