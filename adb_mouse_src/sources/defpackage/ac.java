package defpackage;

import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactorySpi;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

/* loaded from: classes.dex */
public final class ac extends KeyFactorySpi implements t8 {
    public final /* synthetic */ int a;

    public /* synthetic */ ac(int i) {
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [mb, java.lang.Object, java.security.PublicKey] */
    /* JADX WARN: Type inference failed for: r1v11, types: [kb, java.lang.Object, java.security.PublicKey] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.security.PublicKey, ea] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, ga, java.security.PublicKey] */
    /* JADX WARN: Type inference failed for: r1v4, types: [qa, java.lang.Object, java.security.PublicKey] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, wa, java.security.PublicKey] */
    /* JADX WARN: Type inference failed for: r1v6, types: [ya, java.lang.Object, java.security.PublicKey] */
    /* JADX WARN: Type inference failed for: r1v7, types: [bb, java.lang.Object, java.security.PublicKey] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, java.security.PublicKey, db] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, hb, java.security.PublicKey] */
    @Override // defpackage.t8
    public final PublicKey a(hq0 hq0Var) {
        switch (this.a) {
            case 0:
                ?? obj = new Object();
                obj.c = (ec) bg0.a(hq0Var);
                return obj;
            case 1:
                ?? obj2 = new Object();
                obj2.c = (ue) bg0.a(hq0Var);
                return obj2;
            case 2:
                ?? obj3 = new Object();
                obj3.c = (t40) bg0.a(hq0Var);
                return obj3;
            case 3:
                ?? obj4 = new Object();
                obj4.c = (jb0) bg0.a(hq0Var);
                return obj4;
            case 4:
                ?? obj5 = new Object();
                obj5.c = (qb0) bg0.a(hq0Var);
                return obj5;
            case 5:
                ?? obj6 = new Object();
                obj6.c = (zd0) bg0.a(hq0Var);
                return obj6;
            case 6:
                ?? obj7 = new Object();
                obj7.c = (xk0) bg0.a(hq0Var);
                return obj7;
            case 7:
                ?? obj8 = new Object();
                obj8.c = rk0.i(hq0Var.c.d).d.c;
                obj8.d = (zk0) bg0.a(hq0Var);
                return obj8;
            case 8:
                ?? obj9 = new Object();
                n21 n21Var = (n21) bg0.a(hq0Var);
                obj9.c = n21Var;
                obj9.d = k20.x(n21Var.d);
                return obj9;
            default:
                ?? obj10 = new Object();
                h21 h21Var = (h21) bg0.a(hq0Var);
                obj10.d = h21Var;
                obj10.c = k20.x(h21Var.d);
                return obj10;
        }
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [java.security.PrivateKey, lb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.security.PrivateKey, jb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.security.PrivateKey, java.lang.Object, da] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.security.PrivateKey, java.lang.Object, fa] */
    /* JADX WARN: Type inference failed for: r1v4, types: [pa, java.security.PrivateKey, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.security.PrivateKey, java.lang.Object, va] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.security.PrivateKey, xa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [ab, java.security.PrivateKey, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.security.PrivateKey, java.lang.Object, cb] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.security.PrivateKey, java.lang.Object, gb] */
    @Override // defpackage.t8
    public final PrivateKey b(df0 df0Var) {
        switch (this.a) {
            case 0:
                ?? obj = new Object();
                obj.d = df0Var.f;
                obj.c = (dc) f20.r(df0Var);
                return obj;
            case 1:
                ?? obj2 = new Object();
                obj2.d = df0Var.f;
                obj2.c = (se) f20.r(df0Var);
                return obj2;
            case 2:
                ?? obj3 = new Object();
                obj3.d = df0Var.f;
                obj3.c = (t40) f20.r(df0Var);
                return obj3;
            case 3:
                ?? obj4 = new Object();
                obj4.d = df0Var.f;
                obj4.c = (ib0) f20.r(df0Var);
                return obj4;
            case 4:
                ?? obj5 = new Object();
                obj5.d = df0Var.f;
                obj5.c = (pb0) f20.r(df0Var);
                return obj5;
            case 5:
                ?? obj6 = new Object();
                obj6.d = df0Var.f;
                obj6.c = (yd0) f20.r(df0Var);
                return obj6;
            case 6:
                ?? obj7 = new Object();
                obj7.d = df0Var.f;
                obj7.c = (wk0) f20.r(df0Var);
                return obj7;
            case 7:
                ?? obj8 = new Object();
                obj8.e = df0Var.f;
                obj8.c = rk0.i(df0Var.d.d).d.c;
                obj8.d = (yk0) f20.r(df0Var);
                return obj8;
            case 8:
                ?? obj9 = new Object();
                obj9.e = df0Var.f;
                obj9.d = a21.i(df0Var.d.d).e.c;
                obj9.c = (l21) f20.r(df0Var);
                return obj9;
            default:
                ?? obj10 = new Object();
                obj10.e = df0Var.f;
                obj10.c = b21.i(df0Var.d.d).f.c;
                obj10.d = (f21) f20.r(df0Var);
                return obj10;
        }
    }

    @Override // java.security.KeyFactorySpi
    public final PrivateKey engineGeneratePrivate(KeySpec keySpec) {
        switch (this.a) {
            case 0:
                if (keySpec instanceof PKCS8EncodedKeySpec) {
                    try {
                        return b(df0.i(x.n(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
                    } catch (Exception e) {
                        c.d(e);
                        return null;
                    }
                }
                throw new InvalidKeySpecException("Unsupported key specification: " + keySpec.getClass() + ".");
            case 1:
                if (keySpec instanceof PKCS8EncodedKeySpec) {
                    try {
                        return b(df0.i(x.n(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
                    } catch (Exception e2) {
                        c.d(e2);
                        return null;
                    }
                }
                throw new InvalidKeySpecException("Unsupported key specification: " + keySpec.getClass() + ".");
            case 2:
                if (keySpec instanceof PKCS8EncodedKeySpec) {
                    try {
                        return b(df0.i(x.n(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
                    } catch (Exception e3) {
                        throw new InvalidKeySpecException(e3.toString(), e3);
                    }
                }
                throw new InvalidKeySpecException("unsupported key specification: " + keySpec.getClass() + ".");
            case 3:
                if (keySpec instanceof PKCS8EncodedKeySpec) {
                    try {
                        return b(df0.i(x.n(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
                    } catch (Exception e4) {
                        c.d(e4);
                        return null;
                    }
                }
                throw new InvalidKeySpecException("Unsupported key specification: " + keySpec.getClass() + ".");
            case 4:
                if (keySpec instanceof PKCS8EncodedKeySpec) {
                    try {
                        return b(df0.i(x.n(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
                    } catch (Exception e5) {
                        c.d(e5);
                        return null;
                    }
                }
                throw new InvalidKeySpecException("Unsupported key specification: " + keySpec.getClass() + ".");
            case 5:
                if (keySpec instanceof PKCS8EncodedKeySpec) {
                    try {
                        return b(df0.i(x.n(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
                    } catch (Exception e6) {
                        c.d(e6);
                        return null;
                    }
                }
                throw new InvalidKeySpecException("Unsupported key specification: " + keySpec.getClass() + ".");
            case 6:
                if (keySpec instanceof PKCS8EncodedKeySpec) {
                    try {
                        return b(df0.i(x.n(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
                    } catch (Exception e7) {
                        c.d(e7);
                        return null;
                    }
                }
                throw new InvalidKeySpecException("Unsupported key specification: " + keySpec.getClass() + ".");
            case 7:
                if (keySpec instanceof PKCS8EncodedKeySpec) {
                    try {
                        return b(df0.i(x.n(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
                    } catch (Exception e8) {
                        c.d(e8);
                        return null;
                    }
                }
                throw new InvalidKeySpecException("Unsupported key specification: " + keySpec.getClass() + ".");
            case 8:
                if (keySpec instanceof PKCS8EncodedKeySpec) {
                    try {
                        return b(df0.i(x.n(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
                    } catch (Exception e9) {
                        c.d(e9);
                        return null;
                    }
                }
                throw new InvalidKeySpecException("unsupported key specification: " + keySpec.getClass() + ".");
            default:
                if (keySpec instanceof PKCS8EncodedKeySpec) {
                    try {
                        return b(df0.i(x.n(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
                    } catch (Exception e10) {
                        c.d(e10);
                        return null;
                    }
                }
                throw new InvalidKeySpecException("unsupported key specification: " + keySpec.getClass() + ".");
        }
    }

    @Override // java.security.KeyFactorySpi
    public final PublicKey engineGeneratePublic(KeySpec keySpec) {
        switch (this.a) {
            case 0:
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
            case 1:
                if (keySpec instanceof X509EncodedKeySpec) {
                    try {
                        return a(hq0.i(((X509EncodedKeySpec) keySpec).getEncoded()));
                    } catch (Exception e2) {
                        c.d(e2);
                        return null;
                    }
                }
                c.s(keySpec, "Unknown key specification: ");
                return null;
            case 2:
                if (keySpec instanceof X509EncodedKeySpec) {
                    try {
                        return a(hq0.i(((X509EncodedKeySpec) keySpec).getEncoded()));
                    } catch (Exception e3) {
                        throw new InvalidKeySpecException(e3.toString(), e3);
                    }
                }
                c.s(keySpec, "unknown key specification: ");
                return null;
            case 3:
                if (keySpec instanceof X509EncodedKeySpec) {
                    try {
                        return a(hq0.i(((X509EncodedKeySpec) keySpec).getEncoded()));
                    } catch (Exception e4) {
                        c.d(e4);
                        return null;
                    }
                }
                c.s(keySpec, "Unknown key specification: ");
                return null;
            case 4:
                if (keySpec instanceof X509EncodedKeySpec) {
                    try {
                        return a(hq0.i(((X509EncodedKeySpec) keySpec).getEncoded()));
                    } catch (Exception e5) {
                        c.d(e5);
                        return null;
                    }
                }
                c.s(keySpec, "Unknown key specification: ");
                return null;
            case 5:
                if (keySpec instanceof X509EncodedKeySpec) {
                    try {
                        return a(hq0.i(((X509EncodedKeySpec) keySpec).getEncoded()));
                    } catch (Exception e6) {
                        c.d(e6);
                        return null;
                    }
                }
                c.s(keySpec, "Unknown key specification: ");
                return null;
            case 6:
                if (keySpec instanceof X509EncodedKeySpec) {
                    try {
                        return a(hq0.i(((X509EncodedKeySpec) keySpec).getEncoded()));
                    } catch (Exception e7) {
                        c.d(e7);
                        return null;
                    }
                }
                c.s(keySpec, "Unknown key specification: ");
                return null;
            case 7:
                if (keySpec instanceof X509EncodedKeySpec) {
                    try {
                        return a(hq0.i(((X509EncodedKeySpec) keySpec).getEncoded()));
                    } catch (Exception e8) {
                        c.d(e8);
                        return null;
                    }
                }
                c.s(keySpec, "Unknown key specification: ");
                return null;
            case 8:
                if (keySpec instanceof X509EncodedKeySpec) {
                    try {
                        return a(hq0.i(((X509EncodedKeySpec) keySpec).getEncoded()));
                    } catch (Exception e9) {
                        c.d(e9);
                        return null;
                    }
                }
                c.s(keySpec, "unknown key specification: ");
                return null;
            default:
                if (keySpec instanceof X509EncodedKeySpec) {
                    try {
                        return a(hq0.i(((X509EncodedKeySpec) keySpec).getEncoded()));
                    } catch (Exception e10) {
                        c.d(e10);
                        return null;
                    }
                }
                c.s(keySpec, "unknown key specification: ");
                return null;
        }
    }

    @Override // java.security.KeyFactorySpi
    public final KeySpec engineGetKeySpec(Key key, Class cls) {
        switch (this.a) {
            case 0:
                if (key instanceof da) {
                    if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new PKCS8EncodedKeySpec(((da) key).getEncoded());
                    }
                } else if (key instanceof ea) {
                    if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new X509EncodedKeySpec(((ea) key).getEncoded());
                    }
                } else {
                    throw new InvalidKeySpecException("Unsupported key type: " + key.getClass() + ".");
                }
                throw new InvalidKeySpecException(qo0.q("Unknown key specification: ", cls, "."));
            case 1:
                if (key instanceof fa) {
                    if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new PKCS8EncodedKeySpec(((fa) key).getEncoded());
                    }
                } else if (key instanceof ga) {
                    if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new X509EncodedKeySpec(((ga) key).getEncoded());
                    }
                } else {
                    throw new InvalidKeySpecException("Unsupported key type: " + key.getClass() + ".");
                }
                throw new InvalidKeySpecException(qo0.q("Unknown key specification: ", cls, "."));
            case 2:
                if (key instanceof pa) {
                    if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new PKCS8EncodedKeySpec(((pa) key).getEncoded());
                    }
                } else if (key instanceof qa) {
                    if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new X509EncodedKeySpec(((qa) key).getEncoded());
                    }
                } else {
                    throw new InvalidKeySpecException("unsupported key type: " + key.getClass() + ".");
                }
                throw new InvalidKeySpecException(qo0.q("unknown key specification: ", cls, "."));
            case 3:
                if (key instanceof va) {
                    if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new PKCS8EncodedKeySpec(((va) key).getEncoded());
                    }
                } else if (key instanceof wa) {
                    if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new X509EncodedKeySpec(((wa) key).getEncoded());
                    }
                } else {
                    throw new InvalidKeySpecException("Unsupported key type: " + key.getClass() + ".");
                }
                throw new InvalidKeySpecException(qo0.q("Unknown key specification: ", cls, "."));
            case 4:
                if (key instanceof xa) {
                    if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new PKCS8EncodedKeySpec(((xa) key).getEncoded());
                    }
                } else if (key instanceof ya) {
                    if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new X509EncodedKeySpec(((ya) key).getEncoded());
                    }
                } else {
                    throw new InvalidKeySpecException("Unsupported key type: " + key.getClass() + ".");
                }
                throw new InvalidKeySpecException(qo0.q("Unknown key specification: ", cls, "."));
            case 5:
                if (key instanceof ab) {
                    if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new PKCS8EncodedKeySpec(((ab) key).getEncoded());
                    }
                } else if (key instanceof bb) {
                    if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new X509EncodedKeySpec(((bb) key).getEncoded());
                    }
                } else {
                    throw new InvalidKeySpecException("Unsupported key type: " + key.getClass() + ".");
                }
                throw new InvalidKeySpecException(qo0.q("Unknown key specification: ", cls, "."));
            case 6:
                if (key instanceof cb) {
                    if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new PKCS8EncodedKeySpec(((cb) key).getEncoded());
                    }
                } else if (key instanceof db) {
                    if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new X509EncodedKeySpec(((db) key).getEncoded());
                    }
                } else {
                    throw new InvalidKeySpecException("Unsupported key type: " + key.getClass() + ".");
                }
                throw new InvalidKeySpecException(qo0.q("Unknown key specification: ", cls, "."));
            case 7:
                if (key instanceof gb) {
                    if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new PKCS8EncodedKeySpec(((gb) key).getEncoded());
                    }
                } else if (key instanceof hb) {
                    if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new X509EncodedKeySpec(((hb) key).getEncoded());
                    }
                } else {
                    throw new InvalidKeySpecException("Unsupported key type: " + key.getClass() + ".");
                }
                throw new InvalidKeySpecException(qo0.q("Unknown key specification: ", cls, "."));
            case 8:
                if (key instanceof lb) {
                    if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new PKCS8EncodedKeySpec(((lb) key).getEncoded());
                    }
                } else if (key instanceof mb) {
                    if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new X509EncodedKeySpec(((mb) key).getEncoded());
                    }
                } else {
                    throw new InvalidKeySpecException("unsupported key type: " + key.getClass() + ".");
                }
                throw new InvalidKeySpecException(qo0.q("unknown key specification: ", cls, "."));
            default:
                if (key instanceof jb) {
                    if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new PKCS8EncodedKeySpec(((jb) key).getEncoded());
                    }
                } else if (key instanceof kb) {
                    if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new X509EncodedKeySpec(((kb) key).getEncoded());
                    }
                } else {
                    throw new InvalidKeySpecException("unsupported key type: " + key.getClass() + ".");
                }
                throw new InvalidKeySpecException(qo0.q("unknown key specification: ", cls, "."));
        }
    }

    @Override // java.security.KeyFactorySpi
    public final Key engineTranslateKey(Key key) {
        switch (this.a) {
            case 0:
                if (!(key instanceof da) && !(key instanceof ea)) {
                    throw new InvalidKeyException("Unsupported key type");
                }
                return key;
            case 1:
                if (!(key instanceof fa) && !(key instanceof ga)) {
                    throw new InvalidKeyException("Unsupported key type");
                }
                return key;
            case 2:
                if (!(key instanceof pa) && !(key instanceof qa)) {
                    throw new InvalidKeyException("unsupported key type");
                }
                return key;
            case 3:
                if (!(key instanceof va) && !(key instanceof wa)) {
                    throw new InvalidKeyException("Unsupported key type");
                }
                return key;
            case 4:
                if (!(key instanceof xa) && !(key instanceof ya)) {
                    throw new InvalidKeyException("Unsupported key type");
                }
                return key;
            case 5:
                if (!(key instanceof ab) && !(key instanceof bb)) {
                    throw new InvalidKeyException("Unsupported key type");
                }
                return key;
            case 6:
                if (!(key instanceof cb) && !(key instanceof db)) {
                    throw new InvalidKeyException("Unsupported key type");
                }
                return key;
            case 7:
                if (!(key instanceof gb) && !(key instanceof hb)) {
                    throw new InvalidKeyException("Unsupported key type");
                }
                return key;
            case 8:
                if (!(key instanceof lb) && !(key instanceof mb)) {
                    throw new InvalidKeyException("unsupported key type");
                }
                return key;
            default:
                if (!(key instanceof jb) && !(key instanceof kb)) {
                    throw new InvalidKeyException("unsupported key type");
                }
                return key;
        }
    }
}
