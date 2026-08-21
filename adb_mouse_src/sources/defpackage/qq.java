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
public final class qq extends xc {
    public static final HashSet c;

    static {
        HashSet hashSet = new HashSet();
        c = hashSet;
        hashSet.add(za.t0);
        hashSet.add(za.u0);
        hashSet.add(za.v0);
        hashSet.add(za.w0);
        hashSet.add(za.x0);
        hashSet.add(za.y0);
    }

    public qq() {
        super(c);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [ia, java.lang.Object, java.security.PublicKey] */
    @Override // defpackage.t8
    public final PublicKey a(hq0 hq0Var) {
        ?? obj = new Object();
        tq tqVar = (tq) bg0.a(hq0Var);
        obj.c = tqVar;
        obj.d = yp0.f(((rq) tqVar.d).b);
        return obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.security.PrivateKey, ha, java.lang.Object] */
    @Override // defpackage.t8
    public final PrivateKey b(df0 df0Var) {
        ?? obj = new Object();
        sq sqVar = (sq) f20.r(df0Var);
        obj.f = df0Var.f;
        obj.c = sqVar;
        obj.d = yp0.f(((rq) sqVar.d).b);
        return obj;
    }

    @Override // java.security.KeyFactorySpi
    public final KeySpec engineGetKeySpec(Key key, Class cls) {
        if (key instanceof ha) {
            if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new PKCS8EncodedKeySpec(((ha) key).getEncoded());
            }
        } else if (key instanceof ia) {
            if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new X509EncodedKeySpec(((ia) key).getEncoded());
            }
        } else {
            throw new InvalidKeySpecException("Unsupported key type: " + key.getClass() + ".");
        }
        throw new InvalidKeySpecException(qo0.q("Unknown key specification: ", cls, "."));
    }

    @Override // java.security.KeyFactorySpi
    public final Key engineTranslateKey(Key key) {
        if (!(key instanceof ha)) {
            if (key instanceof ia) {
                return key;
            }
            throw new InvalidKeyException("Unsupported key type");
        }
        return key;
    }
}
