package defpackage;

import java.util.Hashtable;
import java.util.Vector;

/* loaded from: classes.dex */
public final class wf {
    public static final yf[] d;
    public static final wf e = new wf(0, null, new yf[0]);
    public static final wf f;
    public final byte[] a;
    public final yf[] b;
    public final short c;

    static {
        yf[] yfVarArr = new yf[0];
        d = yfVarArr;
        f = new wf((short) 0, ht0.e, yfVarArr);
    }

    public wf(short s, byte[] bArr, yf[] yfVarArr) {
        byte[] bArr2 = null;
        if (bArr != null) {
            int length = bArr.length;
            if ((length & 255) != length) {
                c.k("'certificateRequestContext' cannot be longer than 255");
                throw null;
            }
        }
        for (yf yfVar : yfVarArr) {
            if (yfVar == null) {
                c.g("'certificateEntryList' cannot be null or contain any nulls");
                throw null;
            }
        }
        if (bArr != null) {
            if (bArr.length == 0) {
                bArr2 = ht0.e;
            } else {
                bArr2 = (byte[]) bArr.clone();
            }
        }
        this.a = bArr2;
        this.b = yfVarArr;
        this.c = s;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:74:0x018d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01ca  */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v13, types: [pg0, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.wf d(defpackage.vf r24, defpackage.js0 r25, defpackage.a10 r26, java.io.ByteArrayOutputStream r27) {
        /*
            Method dump skipped, instructions count: 580
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wf.d(vf, js0, a10, java.io.ByteArrayOutputStream):wf");
    }

    public final void a(js0 js0Var, nq nqVar) {
        boolean z;
        Vector vector;
        byte[] D;
        boolean A = ht0.A(js0Var.a().H);
        byte[] bArr = this.a;
        if (bArr != null) {
            z = true;
        } else {
            z = false;
        }
        if (z == A) {
            if (A) {
                ht0.Y(bArr, nqVar);
            }
            yf[] yfVarArr = this.b;
            int length = yfVarArr.length;
            Vector vector2 = new Vector(length);
            if (A) {
                vector = new Vector(length);
            } else {
                vector = null;
            }
            long j = 0;
            for (yf yfVar : yfVarArr) {
                vector2.addElement(yfVar.a.z());
                j = j + r10.length + 3;
                if (A) {
                    Hashtable hashtable = yfVar.b;
                    if (hashtable == null) {
                        D = ht0.e;
                    } else {
                        D = ks0.D(hashtable, 0);
                    }
                    vector.addElement(D);
                    j = j + D.length + 2;
                }
            }
            if (A || this.c != 2) {
                if ((16777215 & j) == j) {
                    int i = (int) j;
                    nqVar.write((byte) (i >>> 16));
                    nqVar.write((byte) (i >>> 8));
                    nqVar.write((byte) i);
                } else {
                    throw new us0((short) 80, null, null);
                }
            }
            for (int i2 = 0; i2 < length; i2++) {
                byte[] bArr2 = (byte[]) vector2.elementAt(i2);
                int length2 = bArr2.length;
                if ((16777215 & length2) == length2) {
                    int length3 = bArr2.length;
                    nqVar.write((byte) (length3 >>> 16));
                    nqVar.write((byte) (length3 >>> 8));
                    nqVar.write((byte) length3);
                    nqVar.write(bArr2);
                    if (A) {
                        ht0.X((byte[]) vector.elementAt(i2), nqVar);
                    }
                } else {
                    throw new us0((short) 80, null, null);
                }
            }
            return;
        }
        throw new IllegalStateException();
    }

    public final r6 b(int i) {
        return this.b[i].a;
    }

    public final boolean c() {
        if (this.b.length == 0) {
            return true;
        }
        return false;
    }
}
