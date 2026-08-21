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
public final class p40 extends xc {
    public static final HashSet c;

    static {
        HashSet hashSet = new HashSet();
        c = hashSet;
        hashSet.add(kb0.R);
        hashSet.add(kb0.S);
        hashSet.add(kb0.T);
        hashSet.add(za.z1);
        hashSet.add(za.A1);
        hashSet.add(za.B1);
    }

    public p40() {
        super(c);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [oa, java.lang.Object, java.security.PublicKey] */
    @Override // defpackage.t8
    public final PublicKey a(hq0 hq0Var) {
        ?? obj = new Object();
        b80 b80Var = (b80) bg0.a(hq0Var);
        obj.c = b80Var;
        obj.d = yp0.f(((y70) b80Var.d).a);
        return obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [na, java.security.PrivateKey, java.lang.Object] */
    @Override // defpackage.t8
    public final PrivateKey b(df0 df0Var) {
        ?? obj = new Object();
        obj.e = df0Var.f;
        z70 z70Var = (z70) f20.r(df0Var);
        obj.c = z70Var;
        obj.d = yp0.f(((y70) z70Var.d).a);
        return obj;
    }

    @Override // java.security.KeyFactorySpi
    public final KeySpec engineGetKeySpec(Key key, Class cls) {
        if (key instanceof na) {
            if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new PKCS8EncodedKeySpec(((na) key).getEncoded());
            }
        } else if (key instanceof oa) {
            if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new X509EncodedKeySpec(((oa) key).getEncoded());
            }
        } else {
            throw new InvalidKeySpecException("Unsupported key type: " + key.getClass() + ".");
        }
        throw new InvalidKeySpecException(qo0.q("Unknown key specification: ", cls, "."));
    }

    @Override // java.security.KeyFactorySpi
    public final Key engineTranslateKey(Key key) {
        if (!(key instanceof na)) {
            if (key instanceof oa) {
                return key;
            }
            throw new InvalidKeyException("Unsupported key type");
        }
        return key;
    }
}
