package defpackage;

import android.util.Log;
import com.android.billingclient.api.Purchase;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;
import javax.crypto.ShortBufferException;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class rd implements zu, is0 {
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;

    public rd(sb0 sb0Var, c0 c0Var, c0 c0Var2) {
        im0 p = sb0Var.p();
        if (xf0.g.i(p.H.d())) {
            this.c = sb0Var;
            this.d = c0Var;
            this.e = c0Var2;
            byte[] bArr = new byte[((Mac) c0Var.e).getMacLength()];
            this.f = bArr;
            byte[] bArr2 = new byte[((Mac) c0Var2.e).getMacLength()];
            this.g = bArr2;
            sb0Var.q();
            C(p, c0Var, bArr, true);
            C(p, c0Var2, bArr2, false);
            return;
        }
        throw new us0((short) 80, null, null);
    }

    public static boolean A(Purchase purchase) {
        purchase.getClass();
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = purchase.c;
        if (jSONObject.has("productIds")) {
            JSONArray optJSONArray = jSONObject.optJSONArray("productIds");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    arrayList.add(optJSONArray.optString(i));
                }
            }
        } else if (jSONObject.has("productId")) {
            arrayList.add(jSONObject.optString("productId"));
        }
        if (!arrayList.contains("supporter") || jSONObject.optInt("purchaseState", 1) == 4) {
            return false;
        }
        return true;
    }

    public static void C(im0 im0Var, c0 c0Var, byte[] bArr, boolean z) {
        i30 i30Var;
        if (z) {
            i30Var = im0Var.q;
        } else {
            i30Var = im0Var.p;
        }
        if (i30Var != null) {
            int i = im0Var.g;
            int macLength = ((Mac) c0Var.e).getMacLength();
            byte[] bArr2 = ht0.e;
            byte[] e = r21.A(i, macLength, i30Var, "key", bArr2).e();
            byte[] e2 = r21.A(i, macLength, i30Var, "iv", bArr2).e();
            c0Var.a(e, 0, macLength);
            System.arraycopy(e2, 0, bArr, 0, macLength);
            return;
        }
        throw new us0((short) 80, null, null);
    }

    public static u20 t(sb0 sb0Var, String str, AlgorithmParameterSpec algorithmParameterSpec, PrivateKey privateKey, SecureRandom secureRandom) {
        Signature n;
        if (algorithmParameterSpec != null) {
            try {
                try {
                    n = sb0Var.n(str);
                } catch (NoSuchAlgorithmException e) {
                    String f = yp0.f(str);
                    if (f.endsWith("ANDMGF1")) {
                        str = f.replace("ANDMGF1", "SSA-PSS");
                        n = sb0Var.n(str);
                    } else {
                        throw e;
                    }
                }
                n.initSign(privateKey, secureRandom);
                sb0Var = new sb0(n.getProvider());
            } catch (InvalidKeyException e2) {
                String f2 = yp0.f(str);
                if (f2.endsWith("ANDMGF1")) {
                    return t(sb0Var, f2.replace("ANDMGF1", "SSA-PSS"), algorithmParameterSpec, privateKey, secureRandom);
                }
                throw e2;
            }
        }
        Signature n2 = sb0Var.n(str);
        if (algorithmParameterSpec != null) {
            n2.setParameter(algorithmParameterSpec);
        }
        n2.initSign(privateKey, secureRandom);
        return new u20(n2, 1);
    }

    public static String x(int i) {
        switch (i) {
            case 1:
                return "MD5";
            case 2:
                return "SHA-1";
            case 3:
                return "SHA-224";
            case 4:
                return "SHA-256";
            case 5:
                return "SHA-384";
            case 6:
                return "SHA-512";
            case 7:
                return "SM3";
            case 8:
                return "GOST3411-2012-256";
            default:
                c.k(qo0.m("invalid CryptoHashAlgorithm: ", i));
                return null;
        }
    }

    public static String y(int i) {
        switch (i) {
            case 1:
                return "HmacMD5";
            case 2:
                return "HmacSHA1";
            case 3:
                return "HmacSHA224";
            case 4:
                return "HmacSHA256";
            case 5:
                return "HmacSHA384";
            case 6:
                return "HmacSHA512";
            case 7:
                return "HmacSM3";
            case 8:
                return "HmacGOST3411-2012-256";
            default:
                c.k(qo0.m("invalid CryptoHashAlgorithm: ", i));
                return null;
        }
    }

    public void B(td tdVar, List list) {
        tdVar.getClass();
        int i = tdVar.a;
        boolean z = true;
        if (i == 0 && list != null) {
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (A((Purchase) it.next())) {
                        break;
                    }
                }
            }
            z = false;
            if (!Boolean.valueOf(z).equals((Boolean) this.f)) {
                this.f = Boolean.valueOf(z);
                ((f5) this.c).runOnUiThread(new pd(this, z));
                return;
            }
            return;
        }
        if (i != 1) {
            Log.e("BillingManager", "Purchase failed: " + tdVar.c);
        }
    }

    public byte[] a(String str, PrivateKey privateKey, PublicKey publicKey) {
        KeyAgreement g = ((sb0) this.c).g(str);
        g.init(privateKey);
        g.doPhase(publicKey, true);
        try {
            return g.generateSecret("TlsPremasterSecret").getEncoded();
        } catch (NoSuchAlgorithmException e) {
            if (!"X25519".equals(str) && !"X448".equals(str)) {
                throw e;
            }
            return g.generateSecret();
        }
    }

    @Override // defpackage.is0
    public int b(int i) {
        return ((Mac) ((c0) this.d).e).getMacLength() + i + 1;
    }

    @Override // defpackage.is0
    public ps0 c(long j, short s, xf0 xf0Var, byte[] bArr, int i) {
        c0 c0Var = (c0) this.d;
        int macLength = ((Mac) c0Var.e).getMacLength();
        int i2 = i - macLength;
        if (i2 >= 1) {
            c0Var.reset();
            byte[] bArr2 = (byte[]) this.f;
            int length = bArr2.length;
            byte[] bArr3 = new byte[length];
            ht0.c0(length - 8, j, bArr3);
            for (int i3 = 0; i3 < length; i3++) {
                bArr3[i3] = (byte) (bArr3[i3] ^ bArr2[i3]);
            }
            c0Var.update(bArr3, 0, length);
            byte[] bArr4 = new byte[5];
            bArr4[0] = (byte) s;
            ht0.d0(xf0Var, bArr4, 1);
            ht0.a0(bArr4, i, 3);
            try {
                c0Var.update(bArr4, 0, 5);
                c0Var.update(bArr, 5, i2);
                if (!f20.k(macLength, 5 + i2, ((Mac) c0Var.e).doFinal(), bArr)) {
                    throw new us0((short) 20, null, null);
                }
                while (true) {
                    int i4 = i2 - 1;
                    if (i4 >= 0) {
                        byte b = bArr[i2 + 4];
                        if (b != 0) {
                            return new ps0(5, i4, (short) (b & 255), bArr);
                        }
                        i2 = i4;
                    } else {
                        throw new us0((short) 10, null, null);
                    }
                }
            } catch (RuntimeException e) {
                f40.a(20, e, null);
                return null;
            }
        } else {
            throw new us0((short) 50, null, null);
        }
    }

    public BigInteger d(BigInteger bigInteger) {
        BigInteger bigInteger2 = (BigInteger) this.c;
        BigInteger bigInteger3 = il0.a;
        BigInteger mod = bigInteger.mod(bigInteger2);
        if (!mod.equals(il0.a)) {
            this.e = mod;
            this.f = il0.a((c30) this.g, (BigInteger) this.c, null, mod);
            c30 c30Var = (c30) this.g;
            BigInteger bigInteger4 = (BigInteger) this.c;
            BigInteger a = il0.a(c30Var, bigInteger4, bigInteger4, (BigInteger) this.d);
            return ((BigInteger) this.e).subtract(((BigInteger) this.d).modPow(null, (BigInteger) this.c).multiply(a).mod((BigInteger) this.c)).mod((BigInteger) this.c).modPow(((BigInteger) this.f).multiply(null).add(null), (BigInteger) this.c);
        }
        c.k("Invalid public value: 0");
        return null;
    }

    @Override // defpackage.is0
    public boolean e() {
        return true;
    }

    public d30 f(int i, String str, String str2, boolean z) {
        return new d30(this, (sb0) this.c, str, str2, i, z);
    }

    public hs0 g(sb0 sb0Var, String str, int i, boolean z) {
        String concat = str.concat("/CBC/NoPadding");
        boolean i2 = xf0.e.i(((js0) sb0Var.c).a().H.d());
        sb0 sb0Var2 = (sb0) this.c;
        if (i2) {
            return new e30(this, sb0Var2.e(concat), str, i, z);
        }
        return new k3(this, sb0Var2.e(concat), str, z);
    }

    @Override // defpackage.yf0
    public Object get() {
        return new io((Executor) ((yf0) this.c).get(), (qa0) ((yf0) this.d).get(), (b8) ((b8) this.e).get(), (fl0) ((yf0) this.f).get(), (fl0) ((yf0) this.g).get());
    }

    public r6 h(short s, byte[] bArr) {
        if (s == 0) {
            return new r6(this, bArr);
        }
        throw new us0((short) 43, null, null);
    }

    @Override // defpackage.is0
    public ss0 i(long j, short s, xf0 xf0Var, byte[] bArr, int i, int i2) {
        c0 c0Var = (c0) this.e;
        int macLength = ((Mac) c0Var.e).getMacLength();
        c0Var.reset();
        byte[] bArr2 = (byte[]) this.g;
        int length = bArr2.length;
        byte[] bArr3 = new byte[length];
        ht0.c0(length - 8, j, bArr3);
        for (int i3 = 0; i3 < length; i3++) {
            bArr3[i3] = (byte) (bArr3[i3] ^ bArr2[i3]);
        }
        c0Var.update(bArr3, 0, length);
        int i4 = i2 + 1;
        int i5 = macLength + i4;
        int i6 = 5 + i5;
        byte[] bArr4 = new byte[i6];
        byte[] bArr5 = new byte[5];
        bArr5[0] = 23;
        ht0.d0(xf0Var, bArr5, 1);
        ht0.a0(bArr5, i5, 3);
        try {
            System.arraycopy(bArr, i, bArr4, 5, i2);
            bArr4[5 + i2] = (byte) s;
            c0Var.update(bArr5, 0, 5);
            c0Var.update(bArr4, 5, i4);
            try {
                ((Mac) c0Var.e).doFinal(bArr4, i2 + 6);
                return new ss0(bArr4, i6, (short) 23);
            } catch (ShortBufferException e) {
                throw new IllegalArgumentException(e.getMessage());
            }
        } catch (RuntimeException e2) {
            f40.a(80, e2, null);
            return null;
        }
    }

    @Override // defpackage.is0
    public void j() {
        sb0 sb0Var = (sb0) this.c;
        im0 b = ((js0) sb0Var.c).b();
        c0 c0Var = (c0) this.e;
        byte[] bArr = (byte[]) this.g;
        sb0Var.q();
        C(b, c0Var, bArr, false);
    }

    @Override // defpackage.is0
    public void k() {
        sb0 sb0Var = (sb0) this.c;
        im0 b = ((js0) sb0Var.c).b();
        c0 c0Var = (c0) this.d;
        byte[] bArr = (byte[]) this.f;
        sb0Var.q();
        C(b, c0Var, bArr, true);
    }

    public ds0 l(sb0 sb0Var, int i, int i2) {
        return new ds0(sb0Var, f(i, "AES/CCM/NoPadding", "AES", true), f(i, "AES/CCM/NoPadding", "AES", false), i, i2, 1);
    }

    public gs0 m(sb0 sb0Var, String str, int i, int i2) {
        return new gs0(sb0Var, g(sb0Var, str, i, true), g(sb0Var, str, i, false), s(sb0Var, i2), s(sb0Var, i2), i);
    }

    public rs0 n(jk0 jk0Var) {
        int i = jk0Var.b;
        if (i != 29) {
            if (i != 30) {
                return new b8(this, jk0Var);
            }
            return new j30(this, 1);
        }
        return new j30(this, 0);
    }

    public c0 o(int i) {
        String str;
        int i2 = 5;
        if (i != 1 && i != 2 && i != 3 && i != 4 && i != 5) {
            c.k(qo0.m("invalid MACAlgorithm: ", i));
            return null;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            StringBuilder sb = new StringBuilder();
                            if (i != 0) {
                                if (i != 1) {
                                    if (i != 2) {
                                        if (i != 3) {
                                            if (i != 4) {
                                                if (i != 5) {
                                                    str = "UNKNOWN";
                                                } else {
                                                    str = "hmac_sha512";
                                                }
                                            } else {
                                                str = "hmac_sha384";
                                            }
                                        } else {
                                            str = "hmac_sha256";
                                        }
                                    } else {
                                        str = "hmac_sha1";
                                    }
                                } else {
                                    str = "hmac_md5";
                                }
                            } else {
                                str = "null";
                            }
                            sb.append(str);
                            sb.append("(");
                            sb.append(i);
                            sb.append(")");
                            throw new IllegalArgumentException("specified MACAlgorithm not an HMAC: ".concat(sb.toString()));
                        }
                        i2 = 6;
                    }
                } else {
                    i2 = 4;
                }
            } else {
                i2 = 2;
            }
        } else {
            i2 = 1;
        }
        return p(i2);
    }

    public c0 p(int i) {
        String y = y(i);
        try {
            return new c0(i, ((sb0) this.c).l(y), y);
        } catch (GeneralSecurityException e) {
            f40.k("cannot create HMAC: ".concat(y), e);
            return null;
        }
    }

    public c30 q(int i) {
        try {
            return r(x(i));
        } catch (GeneralSecurityException e) {
            throw new IllegalArgumentException("unable to create message digest:" + e.getMessage(), e);
        }
    }

    public c30 r(String str) {
        return new c30(MessageDigest.getInstance(str, (Provider) ((sb0) this.c).c));
    }

    public ws0 s(sb0 sb0Var, int i) {
        if (((js0) sb0Var.c).a().H.k()) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                return new t20(r(x(6)), 64, 128);
                            }
                            throw new us0((short) 80, null, null);
                        }
                        return new t20(r(x(5)), 48, 128);
                    }
                    return new t20(r(x(4)), 32, 64);
                }
                return new t20(r(x(2)), 20, 64);
            }
            return new t20(r(x(1)), 16, 64);
        }
        return o(i);
    }

    public u20 u(String str, PSSParameterSpec pSSParameterSpec, PrivateKey privateKey, boolean z) {
        SecureRandom secureRandom;
        if (z) {
            secureRandom = (SecureRandom) this.d;
        } else {
            secureRandom = null;
        }
        try {
            try {
                return t((sb0) this.c, str, pSSParameterSpec, privateKey, secureRandom);
            } catch (InvalidKeyException e) {
                throw e;
            }
        } catch (GeneralSecurityException e2) {
            f40.a(80, e2, null);
            return null;
        }
    }

    public b8 v(String str, PSSParameterSpec pSSParameterSpec, byte[] bArr, PublicKey publicKey) {
        try {
            sb0 sb0Var = (sb0) this.c;
            if (pSSParameterSpec != null) {
                Signature n = sb0Var.n(str);
                n.initVerify(publicKey);
                sb0Var = new sb0(n.getProvider());
            }
            Signature n2 = sb0Var.n(str);
            if (pSSParameterSpec != null) {
                n2.setParameter(pSSParameterSpec);
            }
            n2.initVerify(publicKey);
            return new b8(n2, bArr);
        } catch (GeneralSecurityException e) {
            f40.a(80, e, null);
            return null;
        }
    }

    public u20 w(String str, PSSParameterSpec pSSParameterSpec, PublicKey publicKey) {
        try {
            sb0 sb0Var = (sb0) this.c;
            if (pSSParameterSpec != null) {
                Signature n = sb0Var.n(str);
                n.initVerify(publicKey);
                sb0Var = new sb0(n.getProvider());
            }
            Signature n2 = sb0Var.n(str);
            if (pSSParameterSpec != null) {
                n2.setParameter(pSSParameterSpec);
            }
            n2.initVerify(publicKey);
            return new u20(n2, 0);
        } catch (GeneralSecurityException e) {
            f40.a(80, e, null);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x00c1, code lost:
    
        if (r7 == null) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x005b A[Catch: GeneralSecurityException -> 0x00c4, TryCatch #1 {GeneralSecurityException -> 0x00c4, blocks: (B:21:0x003b, B:40:0x0045, B:41:0x0048, B:42:0x004b, B:49:0x005b, B:51:0x0061, B:53:0x0068, B:56:0x0075, B:58:0x007a, B:60:0x0080, B:62:0x0086, B:66:0x008d, B:67:0x0090), top: B:16:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x007a A[Catch: GeneralSecurityException -> 0x00c4, TryCatch #1 {GeneralSecurityException -> 0x00c4, blocks: (B:21:0x003b, B:40:0x0045, B:41:0x0048, B:42:0x004b, B:49:0x005b, B:51:0x0061, B:53:0x0068, B:56:0x0075, B:58:0x007a, B:60:0x0080, B:62:0x0086, B:66:0x008d, B:67:0x0090), top: B:16:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean z(int r9) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rd.z(int):boolean");
    }

    public rd(sb0 sb0Var, SecureRandom secureRandom, w20 w20Var) {
        new Hashtable();
        this.f = new Hashtable();
        new Hashtable();
        this.g = new Hashtable();
        this.c = sb0Var;
        this.d = secureRandom;
        this.e = w20Var;
    }
}
