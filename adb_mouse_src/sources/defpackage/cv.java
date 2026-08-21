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
public final class cv extends xc {
    static {
        HashSet hashSet = new HashSet();
        hashSet.add(za.r0);
        hashSet.add(za.s0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [ka, java.lang.Object, java.security.PublicKey] */
    @Override // defpackage.t8
    public final PublicKey a(hq0 hq0Var) {
        ?? obj = new Object();
        hv hvVar = (hv) bg0.a(hq0Var);
        obj.c = hvVar;
        obj.d = yp0.f(((dv) hvVar.d).a);
        return obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.security.PrivateKey, ja, java.lang.Object] */
    @Override // defpackage.t8
    public final PrivateKey b(df0 df0Var) {
        ?? obj = new Object();
        fv fvVar = (fv) f20.r(df0Var);
        obj.f = df0Var.f;
        obj.c = fvVar;
        obj.d = yp0.f(((dv) fvVar.d).a);
        return obj;
    }

    @Override // java.security.KeyFactorySpi
    public final KeySpec engineGetKeySpec(Key key, Class cls) {
        if (key instanceof ja) {
            if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new PKCS8EncodedKeySpec(((ja) key).getEncoded());
            }
        } else if (key instanceof ka) {
            if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new X509EncodedKeySpec(((ka) key).getEncoded());
            }
        } else {
            throw new InvalidKeySpecException("Unsupported key type: " + key.getClass() + ".");
        }
        throw new InvalidKeySpecException(qo0.q("Unknown key specification: ", cls, "."));
    }

    @Override // java.security.KeyFactorySpi
    public final Key engineTranslateKey(Key key) {
        if (!(key instanceof ja)) {
            if (key instanceof ka) {
                return key;
            }
            throw new InvalidKeyException("Unsupported key type");
        }
        return key;
    }
}
