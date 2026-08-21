package defpackage;

import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class r00 extends xc {
    public static final HashSet c;

    static {
        HashSet hashSet = new HashSet();
        c = hashSet;
        hashSet.add(za.V1);
        hashSet.add(za.W1);
        hashSet.add(za.X1);
    }

    public r00() {
        super(c);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [ma, java.lang.Object, java.security.PublicKey] */
    @Override // defpackage.t8
    public final PublicKey a(hq0 hq0Var) {
        ?? obj = new Object();
        obj.c = (u00) bg0.a(hq0Var);
        return obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [la, java.security.PrivateKey, java.lang.Object] */
    @Override // defpackage.t8
    public final PrivateKey b(df0 df0Var) {
        ?? obj = new Object();
        obj.d = df0Var.f;
        obj.c = (t00) f20.r(df0Var);
        return obj;
    }

    @Override // defpackage.xc, java.security.KeyFactorySpi
    public final PrivateKey engineGeneratePrivate(KeySpec keySpec) {
        if (keySpec instanceof PKCS8EncodedKeySpec) {
            try {
                return b(df0.i(x.n(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
            } catch (Exception e) {
                c.d(e);
                return null;
            }
        }
        throw new InvalidKeySpecException("Unsupported key specification: " + keySpec.getClass() + ".");
    }

    @Override // defpackage.xc, java.security.KeyFactorySpi
    public final PublicKey engineGeneratePublic(KeySpec keySpec) {
        if (keySpec instanceof X509EncodedKeySpec) {
            try {
                return a(hq0.i(((X509EncodedKeySpec) keySpec).getEncoded()));
            } catch (Exception e) {
                c.d(e);
                return null;
            }
        }
        c.s(keySpec, "Unknown key specification: ");
        return null;
    }

    @Override // java.security.KeyFactorySpi
    public final KeySpec engineGetKeySpec(Key key, Class cls) {
        if (key instanceof la) {
            if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new PKCS8EncodedKeySpec(((la) key).getEncoded());
            }
        } else if (key instanceof ma) {
            if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new X509EncodedKeySpec(((ma) key).getEncoded());
            }
        } else {
            throw new InvalidKeySpecException("Unsupported key type: " + key.getClass() + ".");
        }
        throw new InvalidKeySpecException(qo0.q("Unknown key specification: ", cls, "."));
    }

    @Override // java.security.KeyFactorySpi
    public final Key engineTranslateKey(Key key) {
        if (!(key instanceof la)) {
            if (key instanceof ma) {
                return key;
            }
            throw new InvalidKeyException("Unsupported key type");
        }
        return key;
    }
}
