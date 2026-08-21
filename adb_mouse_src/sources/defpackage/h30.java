package defpackage;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.KeyGenerator;

/* loaded from: classes.dex */
public final class h30 implements fs0 {
    public final r6 a;

    public h30(r6 r6Var) {
        this.a = r6Var;
    }

    @Override // defpackage.fs0
    public final byte[] a() {
        r6 r6Var = this.a;
        rd rdVar = (rd) r6Var.d;
        try {
            KeyPairGenerator k = ((sb0) rdVar.c).k("ML-KEM");
            k.initialize(x70.a((String) r6Var.e), (SecureRandom) rdVar.d);
            KeyPair generateKeyPair = k.generateKeyPair();
            generateKeyPair.getPrivate();
            PublicKey publicKey = generateKeyPair.getPublic();
            if (publicKey instanceof sa) {
                return ((sa) publicKey).c.getEncoded();
            }
            if ("X.509".equals(publicKey.getFormat())) {
                try {
                    return hq0.i(publicKey.getEncoded()).d.t();
                } catch (Exception e) {
                    f40.a(80, e, null);
                    return null;
                }
            }
            f40.a(80, null, "Public key format unrecognized");
            return null;
        } catch (GeneralSecurityException e2) {
            f40.j("unable to create key pair: ", e2.getMessage(), e2);
            return null;
        }
    }

    @Override // defpackage.fs0
    public final i30 b() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, java.security.spec.AlgorithmParameterSpec] */
    @Override // defpackage.fs0
    public final void c(byte[] bArr) {
        r6 r6Var = this.a;
        try {
            KeyGenerator j = ((sb0) ((rd) r6Var.d).c).j((String) r6Var.e);
            byte[] e = f20.e(bArr);
            s sVar = y11.a;
            s sVar2 = kb0.a;
            ?? obj = new Object();
            f20.e(e);
            j.init((AlgorithmParameterSpec) obj);
            if (j.generateKey() == null) {
                throw null;
            }
            throw new ClassCastException();
        } catch (Exception e2) {
            throw new IllegalArgumentException("invalid key: " + e2.getMessage(), e2);
        }
    }
}
