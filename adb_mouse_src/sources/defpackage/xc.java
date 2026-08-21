package defpackage;

import java.security.KeyFactorySpi;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class xc extends KeyFactorySpi implements t8 {
    public final Set a;
    public final s b;

    public xc(s sVar) {
        this.b = sVar;
        this.a = null;
    }

    public final void c(s sVar) {
        s sVar2 = this.b;
        if (sVar2 != null) {
            if (!sVar2.m(sVar)) {
                throw new InvalidKeySpecException("incorrect algorithm OID for key: " + sVar);
            }
            return;
        }
        if (this.a.contains(sVar)) {
            return;
        }
        throw new InvalidKeySpecException("incorrect algorithm OID for key: " + sVar);
    }

    @Override // java.security.KeyFactorySpi
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) {
        if (keySpec instanceof PKCS8EncodedKeySpec) {
            try {
                df0 i = df0.i(((PKCS8EncodedKeySpec) keySpec).getEncoded());
                c(i.d.c);
                return b(i);
            } catch (IllegalStateException e) {
                throw new InvalidKeySpecException(e.getMessage());
            } catch (InvalidKeySpecException e2) {
                throw e2;
            } catch (Exception e3) {
                c.d(e3);
                return null;
            }
        }
        throw new InvalidKeySpecException("Unsupported key specification: " + keySpec.getClass() + ".");
    }

    @Override // java.security.KeyFactorySpi
    public PublicKey engineGeneratePublic(KeySpec keySpec) {
        if (keySpec instanceof X509EncodedKeySpec) {
            try {
                hq0 i = hq0.i(((X509EncodedKeySpec) keySpec).getEncoded());
                c(i.c.c);
                return a(i);
            } catch (InvalidKeySpecException e) {
                throw e;
            } catch (Exception e2) {
                c.d(e2);
                return null;
            }
        }
        c.s(keySpec, "Unknown key specification: ");
        return null;
    }

    public xc(Set set) {
        this.b = null;
        this.a = set;
    }
}
