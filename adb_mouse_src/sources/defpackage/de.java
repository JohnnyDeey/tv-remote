package defpackage;

import java.security.AccessController;
import java.security.Provider;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class de extends Provider {
    public static final String d;
    public static final HashMap e;
    public static final Class f;
    public static final String[] g;
    public static final String[] h;
    public static final ce[] i;
    public static final String[] j;
    public static final String[] k;
    public static final String[] l;
    public static final String[] m;
    public static final String[] n;
    public static final String[] o;
    public final ConcurrentHashMap c;

    static {
        Class<?> cls;
        Logger.getLogger(de.class.getName());
        d = "BouncyCastle Security Provider v1.83";
        new ThreadLocal();
        new ThreadLocal();
        new HashSet();
        new HashMap();
        e = new HashMap();
        int i2 = 0;
        try {
            ClassLoader classLoader = de.class.getClassLoader();
            String str = "java.security.cert.PKIXRevocationChecker";
            if (classLoader != null) {
                cls = classLoader.loadClass("java.security.cert.PKIXRevocationChecker");
            } else {
                cls = (Class) AccessController.doPrivileged(new lh(i2, str));
            }
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        f = cls;
        g = new String[]{"PBEPBKDF1", "PBEPBKDF2", "PBEPKCS12", "TLSKDF", "SCRYPT", "HKDF"};
        h = new String[]{"SipHash", "SipHash128", "Poly1305"};
        i = new ce[]{new ce("AES", 0), new ce("ARC4", 0), new ce("ARIA", 0), new ce("Blowfish", 0), new ce("Camellia", 0), new ce("CAST5", 0), new ce("CAST6", 0), new ce("ChaCha", 0), new ce("DES", 0), new ce("DESede", 0), new ce("GOST28147", 0), new ce("Grainv1", 0), new ce("Grain128", 0), new ce("HC128", 0), new ce("HC256", 0), new ce("IDEA", 0), new ce("Noekeon", 0), new ce("RC2", 0), new ce("RC5", 0), new ce("RC6", 0), new ce("Rijndael", 0), new ce("Salsa20", 0), new ce("SEED", 0), new ce("Serpent", 0), new ce("Shacal2", 0), new ce("Skipjack", 0), new ce("SM4", 0), new ce("TEA", 0), new ce("Twofish", 0), new ce("Threefish", 0), new ce("VMPC", 0), new ce("VMPCKSA3", 0), new ce("XTEA", 0), new ce("XSalsa20", 0), new ce("OpenSSLPBKDF", 0), new ce("DSTU7624", 0), new ce("GOST3412_2015", 0), new ce("Zuc", 0)};
        j = new String[]{"X509", "IES", "COMPOSITE", "EXTERNAL", "CompositeSignatures", "NoSig"};
        k = new String[]{"DSA", "DH", "EC", "RSA", "GOST", "ECGOST", "ElGamal", "DSTU4145", "GM", "EdEC", "LMS", "SPHINCSPlus", "Dilithium", "Falcon", "NTRU", "CONTEXT", "SLHDSA", "MLDSA", "MLKEM"};
        l = new String[]{"GOST3411", "Keccak", "MD2", "MD4", "MD5", "SHA1", "RIPEMD128", "RIPEMD160", "RIPEMD256", "RIPEMD320", "SHA224", "SHA256", "SHA384", "SHA512", "SHA3", "Skein", "SM3", "Tiger", "Whirlpool", "Blake2b", "Blake2s", "DSTU7564", "Haraka", "Blake3"};
        m = new String[]{"BC", "BCFKS", "PKCS12"};
        n = new String[]{"DRBG"};
        o = new String[]{"HKDF", "PBEPBKDF2", "SCRYPT"};
    }

    public de() {
        super("BC", 1.83d, d);
        this.c = new ConcurrentHashMap();
        AccessController.doPrivileged(new lh(3, this));
    }

    public static void c(s sVar, t8 t8Var) {
        HashMap hashMap = e;
        synchronized (hashMap) {
            hashMap.put(sVar, t8Var);
        }
    }

    public static void d(String str, String[] strArr) {
        for (int i2 = 0; i2 != strArr.length; i2++) {
            e(str, strArr[i2]);
        }
    }

    public static void e(String str, String str2) {
        Class<?> cls;
        String str3 = str + str2 + "$Mappings";
        try {
            ClassLoader classLoader = de.class.getClassLoader();
            if (classLoader != null) {
                cls = classLoader.loadClass(str3);
            } else {
                cls = (Class) AccessController.doPrivileged(new lh(0, str3));
            }
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        if (cls == null) {
            return;
        }
        try {
            if (cls.newInstance() == null) {
                throw null;
            }
            throw new ClassCastException();
        } catch (Exception e2) {
            throw new InternalError("cannot create instance of " + str + str2 + "$Mappings : " + e2);
        }
    }

    @Override // java.security.Provider
    public final Provider.Service getService(String str, String str2) {
        Object obj;
        Provider.Service service;
        String str3 = str + "." + yp0.f(str2);
        Provider.Service service2 = (Provider.Service) this.c.get(str3);
        if (service2 == null) {
            synchronized (this) {
                try {
                    if (!this.c.containsKey(str3)) {
                        obj = AccessController.doPrivileged(new be(this, str, str2, str3));
                    } else {
                        obj = this.c.get(str3);
                    }
                    service = (Provider.Service) obj;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return service;
        }
        return service2;
    }
}
