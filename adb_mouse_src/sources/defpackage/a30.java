package defpackage;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.SecureRandom;
import java.security.Signature;

/* loaded from: classes.dex */
public final class a30 implements et0 {
    public final /* synthetic */ int c;
    public final rd d;
    public final PrivateKey e;
    public final int f;

    public a30(rd rdVar, PrivateKey privateKey, int i, int i2) {
        this.c = i2;
        switch (i2) {
            case 1:
                if (privateKey != null) {
                    switch (i) {
                        case 2308:
                        case 2309:
                        case 2310:
                            this.d = rdVar;
                            this.e = privateKey;
                            this.f = i;
                            return;
                        default:
                            c.k("signatureScheme");
                            throw null;
                    }
                }
                c.g("privateKey");
                throw null;
            case 2:
                if (privateKey != null) {
                    switch (i) {
                        case 2052:
                        case 2053:
                        case 2054:
                        case 2057:
                        case 2058:
                        case 2059:
                            this.d = rdVar;
                            this.e = privateKey;
                            this.f = i;
                            return;
                        case 2055:
                        case 2056:
                        default:
                            c.k("signatureScheme");
                            throw null;
                    }
                }
                c.g("privateKey");
                throw null;
            case 3:
                if (privateKey != null) {
                    switch (i) {
                        case 2321:
                        case 2322:
                        case 2323:
                        case 2324:
                        case 2325:
                        case 2326:
                        case 2327:
                        case 2328:
                        case 2329:
                        case 2330:
                        case 2331:
                        case 2332:
                            this.d = rdVar;
                            this.e = privateKey;
                            this.f = i;
                            return;
                        default:
                            c.k("signatureScheme");
                            throw null;
                    }
                }
                c.g("privateKey");
                throw null;
            default:
                if (privateKey != null) {
                    switch (i) {
                        case 2074:
                        case 2075:
                        case 2076:
                            break;
                        default:
                            if (3 != ((short) (i & 255))) {
                                c.k("signatureScheme");
                                throw null;
                            }
                            break;
                    }
                    this.d = rdVar;
                    this.e = privateKey;
                    this.f = i;
                    return;
                }
                c.g("privateKey");
                throw null;
        }
    }

    @Override // defpackage.et0
    public final byte[] d(go0 go0Var, byte[] bArr) {
        switch (this.c) {
            case 0:
                PrivateKey privateKey = this.e;
                if (go0Var != null && wg0.i(go0Var) == this.f) {
                    rd rdVar = this.d;
                    SecureRandom secureRandom = (SecureRandom) rdVar.d;
                    try {
                        try {
                            Signature n = ((sb0) rdVar.c).n("NoneWithECDSA");
                            n.initSign(privateKey, secureRandom);
                            n.update(bArr, 0, bArr.length);
                            return n.sign();
                        } catch (InvalidKeyException e) {
                            throw e;
                        }
                    } catch (GeneralSecurityException e2) {
                        f40.a(80, e2, null);
                        return null;
                    }
                }
                c.p(go0Var, "Invalid algorithm: ");
                return null;
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // defpackage.et0
    public final u20 h(go0 go0Var) {
        int i = this.c;
        PrivateKey privateKey = this.e;
        rd rdVar = this.d;
        int i2 = this.f;
        switch (i) {
            case 0:
                return null;
            case 1:
                if (go0Var != null && wg0.i(go0Var) == i2) {
                    return rdVar.u("ML-DSA", null, privateKey, false);
                }
                c.p(go0Var, "Invalid algorithm: ");
                return null;
            case 2:
                if (go0Var != null && wg0.i(go0Var) == i2) {
                    int m = wg0.m(i2);
                    String x = rd.x(m);
                    return rdVar.u(r21.p(x).concat("WITHRSAANDMGF1"), r21.w(x, m), privateKey, true);
                }
                c.p(go0Var, "Invalid algorithm: ");
                return null;
            default:
                if (go0Var != null && wg0.i(go0Var) == i2) {
                    return rdVar.u("SLH-DSA", null, privateKey, false);
                }
                c.p(go0Var, "Invalid algorithm: ");
                return null;
        }
    }
}
