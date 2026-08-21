package defpackage;

import java.io.Serializable;
import java.security.PrivilegedAction;
import java.security.Security;

/* loaded from: classes.dex */
public final class lh implements PrivilegedAction {
    public final /* synthetic */ int a;
    public final /* synthetic */ Serializable b;

    public /* synthetic */ lh(int i, Serializable serializable) {
        this.a = i;
        this.b = serializable;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        String str;
        String str2;
        String str3;
        int i = this.a;
        Serializable serializable = this.b;
        switch (i) {
            case 0:
                try {
                    return ClassLoader.getSystemClassLoader().loadClass((String) serializable);
                } catch (Exception unused) {
                    return null;
                }
            case 1:
                return Security.getProperty((String) serializable);
            case 2:
                return System.getProperty((String) serializable);
            default:
                de deVar = (de) serializable;
                de.d("org.bouncycastle.jcajce.provider.digest.", de.l);
                de.d("org.bouncycastle.jcajce.provider.symmetric.", de.g);
                de.d("org.bouncycastle.jcajce.provider.symmetric.", de.h);
                ce[] ceVarArr = de.i;
                int i2 = 0;
                for (int i3 = 0; i3 != ceVarArr.length; i3++) {
                    ce ceVar = ceVarArr[i3];
                    wl.a();
                    switch (ceVar.c) {
                        case 0:
                            str3 = ceVar.d;
                            break;
                        case 3:
                            str3 = ceVar.d;
                            break;
                        default:
                            str3 = ceVar.d;
                            break;
                    }
                    de.e("org.bouncycastle.jcajce.provider.symmetric.", str3);
                }
                de.d("org.bouncycastle.jcajce.provider.asymmetric.", de.j);
                de.d("org.bouncycastle.jcajce.provider.asymmetric.", de.k);
                de.d("org.bouncycastle.jcajce.provider.keystore.", de.m);
                de.d("org.bouncycastle.jcajce.provider.drbg.", de.n);
                de.d("org.bouncycastle.jcajce.provider.kdf.", de.o);
                qo0.y(za.d);
                qo0.y(za.e);
                qo0.y(za.f);
                qo0.y(za.g);
                qo0.y(za.h);
                qo0.y(za.i);
                qo0.y(za.j);
                qo0.y(za.k);
                qo0.y(za.l);
                qo0.y(za.m);
                qo0.y(za.n);
                qo0.y(za.o);
                qo0.y(za.p);
                qo0.y(za.q);
                qo0.y(za.r);
                qo0.y(za.s);
                qo0.y(za.t);
                qo0.y(za.u);
                qo0.y(za.v);
                qo0.y(za.w);
                qo0.y(za.x);
                qo0.y(za.y);
                qo0.y(za.z);
                qo0.y(za.A);
                qo0.y(za.B);
                qo0.y(za.C);
                qo0.y(za.D);
                qo0.y(za.E);
                qo0.y(za.F);
                qo0.y(za.G);
                qo0.y(za.H);
                qo0.y(za.I);
                qo0.y(za.J);
                qo0.y(za.K);
                qo0.y(za.L);
                qo0.y(za.M);
                qo0.y(za.N);
                qo0.y(za.Q);
                qo0.y(za.S);
                de.c(za.U, new ac(6));
                qo0.y(new s("1.3.9999.6.4.10"));
                qo0.y(za.V);
                qo0.y(za.X);
                qo0.y(za.Z);
                de.c(pd0.a, new ac(7));
                de.c(pd0.b, new ac(3));
                int i4 = 8;
                de.c(pd0.c, new ac(i4));
                de.c(o20.a, new ac(i4));
                int i5 = 9;
                de.c(pd0.d, new ac(i5));
                de.c(o20.b, new ac(i5));
                de.c(od0.m, new ac(2));
                de.c(za.c0, new ac(5));
                de.c(kb0.R, new w70());
                de.c(kb0.S, new w70());
                de.c(kb0.T, new w70());
                s sVar = za.p0;
                de.c(sVar, new xc(sVar));
                s sVar2 = za.q0;
                de.c(sVar2, new xc(sVar2));
                s sVar3 = za.r0;
                de.c(sVar3, new xc(sVar3));
                s sVar4 = za.s0;
                de.c(sVar4, new xc(sVar4));
                de.c(za.t0, new qq());
                de.c(za.u0, new qq());
                de.c(za.v0, new qq());
                de.c(za.w0, new qq());
                de.c(za.x0, new qq());
                de.c(za.y0, new qq());
                int i6 = 1;
                de.c(za.I0, new ac(i6));
                de.c(za.K0, new ac(i6));
                de.c(za.M0, new ac(i6));
                de.c(za.O0, new ac(i6));
                de.c(za.Q0, new ac(i6));
                de.c(za.R1, new ac(i2));
                de.c(za.S1, new ac(i2));
                de.c(za.T1, new ac(i2));
                de.c(za.V1, new r00());
                de.c(za.W1, new r00());
                de.c(za.X1, new r00());
                de.c(za.z1, new p40());
                de.c(za.A1, new p40());
                de.c(za.B1, new p40());
                int i7 = 4;
                de.c(za.t1, new ac(i7));
                de.c(za.u1, new ac(i7));
                de.c(za.v1, new ac(i7));
                de.c(za.w1, new ac(i7));
                de.c(za.Z1, new p90());
                de.c(za.a2, new p90());
                de.c(za.b2, new p90());
                de.c(za.c2, new p90());
                qo0.v(za.e2);
                qo0.v(za.f2);
                qo0.v(za.g2);
                qo0.v(za.h2);
                qo0.v(za.i2);
                qo0.v(za.j2);
                qo0.v(za.k2);
                qo0.v(za.l2);
                qo0.v(za.m2);
                qo0.v(za.n2);
                qo0.v(za.o2);
                qo0.v(za.p2);
                qo0.v(za.u2);
                qo0.v(za.v2);
                qo0.v(za.w2);
                qo0.v(za.x2);
                qo0.v(za.y2);
                qo0.v(za.z2);
                qo0.v(za.A2);
                qo0.v(za.B2);
                qo0.v(za.C2);
                qo0.v(za.D2);
                qo0.v(za.E2);
                qo0.v(za.F2);
                qo0.v(za.G2);
                qo0.v(za.H2);
                qo0.v(za.I2);
                qo0.v(za.J2);
                qo0.v(za.K2);
                qo0.v(za.L2);
                qo0.v(za.M2);
                qo0.v(za.N2);
                qo0.v(za.O2);
                qo0.v(za.P2);
                qo0.v(za.Q2);
                qo0.v(za.R2);
                qo0.v(za.S2);
                qo0.v(za.T2);
                qo0.v(za.U2);
                de.c(za.V2, new lo0());
                deVar.put("X509Store.CERTIFICATE/COLLECTION", "org.bouncycastle.jce.provider.X509StoreCertCollection");
                deVar.put("X509Store.ATTRIBUTECERTIFICATE/COLLECTION", "org.bouncycastle.jce.provider.X509StoreAttrCertCollection");
                deVar.put("X509Store.CRL/COLLECTION", "org.bouncycastle.jce.provider.X509StoreCRLCollection");
                deVar.put("X509Store.CERTIFICATEPAIR/COLLECTION", "org.bouncycastle.jce.provider.X509StoreCertPairCollection");
                deVar.put("X509Store.CERTIFICATE/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPCerts");
                deVar.put("X509Store.CRL/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPCRLs");
                deVar.put("X509Store.ATTRIBUTECERTIFICATE/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPAttrCerts");
                deVar.put("X509Store.CERTIFICATEPAIR/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPCertPairs");
                deVar.put("X509StreamParser.CERTIFICATE", "org.bouncycastle.jce.provider.X509CertParser");
                deVar.put("X509StreamParser.ATTRIBUTECERTIFICATE", "org.bouncycastle.jce.provider.X509AttrCertParser");
                deVar.put("X509StreamParser.CRL", "org.bouncycastle.jce.provider.X509CRLParser");
                deVar.put("X509StreamParser.CERTIFICATEPAIR", "org.bouncycastle.jce.provider.X509CertPairParser");
                deVar.put("Cipher.BROKENPBEWITHMD5ANDDES", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$BrokePBEWithMD5AndDES");
                deVar.put("Cipher.BROKENPBEWITHSHA1ANDDES", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$BrokePBEWithSHA1AndDES");
                deVar.put("Cipher.OLDPBEWITHSHAANDTWOFISH-CBC", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$OldPBEWithSHAAndTwofish");
                Class cls = de.f;
                deVar.put("CertPathValidator.RFC3281", "org.bouncycastle.jce.provider.PKIXAttrCertPathValidatorSpi");
                deVar.put("CertPathBuilder.RFC3281", "org.bouncycastle.jce.provider.PKIXAttrCertPathBuilderSpi");
                if (cls != null) {
                    str = "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi_8";
                    deVar.put("CertPathValidator.RFC3280", "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi_8");
                    str2 = "org.bouncycastle.jce.provider.PKIXCertPathBuilderSpi_8";
                } else {
                    str = "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi";
                    deVar.put("CertPathValidator.RFC3280", "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi");
                    str2 = "org.bouncycastle.jce.provider.PKIXCertPathBuilderSpi";
                }
                deVar.put("CertPathBuilder.RFC3280", str2);
                deVar.put("CertPathValidator.PKIX", str);
                deVar.put("CertPathBuilder.PKIX", str2);
                deVar.put("CertStore.Collection", "org.bouncycastle.jce.provider.CertStoreCollectionSpi");
                deVar.put("CertStore.LDAP", "org.bouncycastle.jce.provider.X509LDAPCertStoreSpi");
                deVar.put("CertStore.Multi", "org.bouncycastle.jce.provider.MultiCertStoreSpi");
                deVar.put("Alg.Alias.CertStore.X509LDAP", "LDAP");
                return null;
        }
    }
}
