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
public final class w70 extends xc {
    public static final HashSet c;

    static {
        HashSet hashSet = new HashSet();
        c = hashSet;
        hashSet.add(kb0.R);
        hashSet.add(kb0.S);
        hashSet.add(kb0.T);
    }

    public w70() {
        super(c);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.security.PublicKey, sa] */
    @Override // defpackage.t8
    public final PublicKey a(hq0 hq0Var) {
        ?? obj = new Object();
        b80 b80Var = (b80) bg0.a(hq0Var);
        obj.c = b80Var;
        obj.d = yp0.f(x70.a(((y70) b80Var.d).a).a);
        return obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.security.PrivateKey, java.lang.Object, ra] */
    @Override // defpackage.t8
    public final PrivateKey b(df0 df0Var) {
        ?? obj = new Object();
        obj.e = df0Var.f;
        obj.f = df0Var.getEncoded();
        z70 z70Var = (z70) f20.r(df0Var);
        obj.c = z70Var;
        obj.d = yp0.f(x70.a(((y70) z70Var.d).a).a);
        return obj;
    }

    /* JADX WARN: Type inference failed for: r5v9, types: [java.security.PrivateKey, java.lang.Object, ra] */
    @Override // defpackage.xc, java.security.KeyFactorySpi
    public final PrivateKey engineGeneratePrivate(KeySpec keySpec) {
        z70 z70Var;
        if (keySpec instanceof a80) {
            a80 a80Var = (a80) keySpec;
            byte[] bArr = a80Var.c;
            boolean z = a80Var.f;
            y70 y70Var = (y70) fx0.a.get(a80Var.e.a);
            if (z) {
                if (z) {
                    z70Var = new z70(y70Var, f20.e(bArr), null);
                } else {
                    c.o("KeySpec represents long form");
                    return null;
                }
            } else if (!z) {
                z70 z70Var2 = new z70(y70Var, f20.e(bArr), null);
                if (!z) {
                    byte[] e = f20.e(a80Var.d);
                    if (e != null && !f20.l(e, f20.h(z70Var2.h, z70Var2.i))) {
                        throw new InvalidKeySpecException("public key data does not match private key data");
                    }
                    z70Var = z70Var2;
                } else {
                    c.o("KeySpec represents long form");
                    return null;
                }
            } else {
                c.o("KeySpec represents seed");
                return null;
            }
            ?? obj = new Object();
            obj.c = z70Var;
            obj.d = yp0.f(((y70) z70Var.d).a);
            return obj;
        }
        return super.engineGeneratePrivate(keySpec);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.security.PublicKey, sa] */
    @Override // defpackage.xc, java.security.KeyFactorySpi
    public final PublicKey engineGeneratePublic(KeySpec keySpec) {
        if (keySpec instanceof c80) {
            c80 c80Var = (c80) keySpec;
            b80 b80Var = new b80((y70) fx0.a.get(c80Var.c.a), f20.e(c80Var.d));
            ?? obj = new Object();
            obj.c = b80Var;
            obj.d = yp0.f(x70.a(((y70) b80Var.d).a).a);
            return obj;
        }
        return super.engineGeneratePublic(keySpec);
    }

    @Override // java.security.KeyFactorySpi
    public final KeySpec engineGetKeySpec(Key key, Class cls) {
        if (key instanceof ra) {
            if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new PKCS8EncodedKeySpec(((ra) key).getEncoded());
            }
            if (a80.class.isAssignableFrom(cls)) {
                ra raVar = (ra) key;
                byte[] e = f20.e(raVar.c.j);
                z70 z70Var = raVar.c;
                if (e != null) {
                    return new a80(x70.a(((y70) z70Var.d).a), e);
                }
                x70 a = x70.a(((y70) z70Var.d).a);
                byte[] encoded = raVar.c.getEncoded();
                z70 z70Var2 = raVar.c;
                y70 y70Var = (y70) z70Var2.d;
                byte[] bArr = z70Var2.h;
                byte[] bArr2 = z70Var2.i;
                rj rjVar = new rj(y70Var.b, 2);
                if (bArr.length == rjVar.b) {
                    if (bArr2.length == 32) {
                        byte[] e2 = f20.e(bArr);
                        byte[] e3 = f20.e(bArr2);
                        if (rjVar.a(e2)) {
                            yp0.f(x70.a(y70Var.a).a);
                            return new a80(a, encoded, f20.h(e2, e3));
                        }
                        c.k("Modulus check failed for ML-KEM public key");
                        return null;
                    }
                    c.k("'rho' has invalid length");
                    return null;
                }
                c.k("'t' has invalid length");
                return null;
            }
            if (c80.class.isAssignableFrom(cls)) {
                ra raVar2 = (ra) key;
                x70 a2 = x70.a(((y70) raVar2.c.d).a);
                z70 z70Var3 = raVar2.c;
                y70 y70Var2 = (y70) z70Var3.d;
                byte[] bArr3 = z70Var3.h;
                byte[] bArr4 = z70Var3.i;
                rj rjVar2 = new rj(y70Var2.b, 2);
                if (bArr3.length == rjVar2.b) {
                    if (bArr4.length == 32) {
                        byte[] e4 = f20.e(bArr3);
                        byte[] e5 = f20.e(bArr4);
                        if (rjVar2.a(e4)) {
                            yp0.f(x70.a(y70Var2.a).a);
                            return new c80(a2, f20.h(e4, e5));
                        }
                        c.k("Modulus check failed for ML-KEM public key");
                        return null;
                    }
                    c.k("'rho' has invalid length");
                    return null;
                }
                c.k("'t' has invalid length");
                return null;
            }
        } else if (key instanceof sa) {
            if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new X509EncodedKeySpec(((sa) key).getEncoded());
            }
            if (c80.class.isAssignableFrom(cls)) {
                sa saVar = (sa) key;
                return new c80(x70.a(((y70) saVar.c.d).a), saVar.c.getEncoded());
            }
        } else {
            throw new InvalidKeySpecException("Unsupported key type: " + key.getClass() + ".");
        }
        throw new InvalidKeySpecException(qo0.q("unknown key specification: ", cls, "."));
    }

    @Override // java.security.KeyFactorySpi
    public final Key engineTranslateKey(Key key) {
        if (!(key instanceof ra)) {
            if (key instanceof sa) {
                return key;
            }
            throw new InvalidKeyException("unsupported key type");
        }
        return key;
    }
}
