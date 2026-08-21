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
public final class lo0 extends xc {
    public static final HashSet c;

    static {
        HashSet hashSet = new HashSet();
        c = hashSet;
        hashSet.add(za.e2);
        hashSet.add(za.f2);
        hashSet.add(za.g2);
        hashSet.add(za.h2);
        hashSet.add(za.i2);
        hashSet.add(za.j2);
        hashSet.add(za.k2);
        hashSet.add(za.l2);
        hashSet.add(za.m2);
        hashSet.add(za.n2);
        hashSet.add(za.o2);
        hashSet.add(za.p2);
        hashSet.add(za.q2);
        hashSet.add(za.r2);
        hashSet.add(za.s2);
        hashSet.add(za.t2);
        hashSet.add(za.u2);
        hashSet.add(za.v2);
        hashSet.add(za.w2);
        hashSet.add(za.x2);
        hashSet.add(za.y2);
        hashSet.add(za.z2);
        hashSet.add(za.A2);
        hashSet.add(za.B2);
        hashSet.add(za.C2);
        hashSet.add(za.D2);
        hashSet.add(za.E2);
        hashSet.add(za.F2);
        hashSet.add(za.G2);
        hashSet.add(za.H2);
        hashSet.add(za.I2);
        hashSet.add(za.J2);
        hashSet.add(za.K2);
        hashSet.add(za.L2);
        hashSet.add(za.M2);
        hashSet.add(za.N2);
        hashSet.add(za.O2);
        hashSet.add(za.P2);
        hashSet.add(za.Q2);
        hashSet.add(za.R2);
        hashSet.add(za.S2);
        hashSet.add(za.T2);
        hashSet.add(za.U2);
        hashSet.add(za.V2);
    }

    public lo0() {
        super(c);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.security.PublicKey, fb] */
    @Override // defpackage.t8
    public final PublicKey a(hq0 hq0Var) {
        ?? obj = new Object();
        obj.c = (oo0) bg0.a(hq0Var);
        return obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.security.PrivateKey, java.lang.Object, eb] */
    @Override // defpackage.t8
    public final PrivateKey b(df0 df0Var) {
        ?? obj = new Object();
        obj.d = df0Var.f;
        obj.c = (no0) f20.r(df0Var);
        return obj;
    }

    @Override // java.security.KeyFactorySpi
    public final KeySpec engineGetKeySpec(Key key, Class cls) {
        if (key instanceof eb) {
            if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new PKCS8EncodedKeySpec(((eb) key).getEncoded());
            }
        } else if (key instanceof fb) {
            if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new X509EncodedKeySpec(((fb) key).getEncoded());
            }
        } else {
            throw new InvalidKeySpecException("Unsupported key type: " + key.getClass() + ".");
        }
        throw new InvalidKeySpecException(qo0.q("Unknown key specification: ", cls, "."));
    }

    @Override // java.security.KeyFactorySpi
    public final Key engineTranslateKey(Key key) {
        if (!(key instanceof eb)) {
            if (key instanceof fb) {
                return key;
            }
            throw new InvalidKeyException("Unsupported key type");
        }
        return key;
    }
}
