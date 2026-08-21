package defpackage;

import java.io.IOException;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.util.Arrays;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPublicKeySpec;

/* loaded from: classes.dex */
public final class g30 implements fs0 {
    public final /* synthetic */ int a;
    public KeyPair b;
    public final Object c;
    public PublicKey d;

    public /* synthetic */ g30(int i, Object obj) {
        this.a = i;
        this.c = obj;
    }

    @Override // defpackage.fs0
    public final byte[] a() {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                jy jyVar = (jy) obj;
                DHParameterSpec dHParameterSpec = (DHParameterSpec) jyVar.c;
                rd rdVar = (rd) jyVar.b;
                try {
                    KeyPairGenerator k = ((sb0) rdVar.c).k("DiffieHellman");
                    k.initialize(dHParameterSpec, (SecureRandom) rdVar.d);
                    KeyPair generateKeyPair = k.generateKeyPair();
                    this.b = generateKeyPair;
                    return kd.a((dHParameterSpec.getP().bitLength() + 7) / 8, ((DHPublicKey) generateKeyPair.getPublic()).getY());
                } catch (GeneralSecurityException e) {
                    throw new ts0("unable to create key pair", e);
                }
            case 1:
                b8 b8Var = (b8) obj;
                rd rdVar2 = (rd) b8Var.d;
                try {
                    KeyPairGenerator k2 = ((sb0) rdVar2.c).k("EC");
                    k2.initialize((ECParameterSpec) b8Var.e, (SecureRandom) rdVar2.d);
                    KeyPair generateKeyPair2 = k2.generateKeyPair();
                    this.b = generateKeyPair2;
                    PublicKey publicKey = generateKeyPair2.getPublic();
                    if (publicKey instanceof ECPublicKey) {
                        ECPoint w = ((ECPublicKey) publicKey).getW();
                        ls a = ((is) b8Var.f).a(w.getAffineX(), w.getAffineY());
                        if (a.h()) {
                            return new byte[1];
                        }
                        ls j = a.j();
                        k20 k20Var = j.b;
                        byte[] a2 = kd.a((k20Var.A() + 7) / 8, k20Var.r0());
                        k20 e2 = j.e();
                        byte[] a3 = kd.a((e2.A() + 7) / 8, e2.r0());
                        byte[] bArr = new byte[a2.length + a3.length + 1];
                        bArr[0] = 4;
                        System.arraycopy(a2, 0, bArr, 1, a2.length);
                        System.arraycopy(a3, 0, bArr, a2.length + 1, a3.length);
                        return bArr;
                    }
                    return hq0.i(publicKey.getEncoded()).d.t();
                } catch (GeneralSecurityException e3) {
                    f40.j("unable to create key pair: ", e3.getMessage(), e3);
                    return null;
                }
            case 2:
                rd rdVar3 = ((j30) obj).d;
                try {
                    KeyPairGenerator k3 = ((sb0) rdVar3.c).k("X25519");
                    k3.initialize(255, (SecureRandom) rdVar3.d);
                    KeyPair generateKeyPair3 = k3.generateKeyPair();
                    this.b = generateKeyPair3;
                    return gi0.f(generateKeyPair3.getPublic());
                } catch (GeneralSecurityException e4) {
                    f40.j("unable to create key pair: ", e4.getMessage(), e4);
                    return null;
                }
            default:
                rd rdVar4 = ((j30) obj).d;
                try {
                    KeyPairGenerator k4 = ((sb0) rdVar4.c).k("X448");
                    k4.initialize(448, (SecureRandom) rdVar4.d);
                    KeyPair generateKeyPair4 = k4.generateKeyPair();
                    this.b = generateKeyPair4;
                    return gi0.f(generateKeyPair4.getPublic());
                } catch (GeneralSecurityException e5) {
                    f40.j("unable to create key pair: ", e5.getMessage(), e5);
                    return null;
                }
        }
    }

    @Override // defpackage.fs0
    public final i30 b() {
        int i = this.a;
        boolean z = true;
        Object obj = this.c;
        switch (i) {
            case 0:
                jy jyVar = (jy) obj;
                DHPrivateKey dHPrivateKey = (DHPrivateKey) this.b.getPrivate();
                DHPublicKey dHPublicKey = (DHPublicKey) this.d;
                rd rdVar = (rd) jyVar.b;
                boolean z2 = jyVar.a;
                try {
                    byte[] a = rdVar.a("DiffieHellman", dHPrivateKey, dHPublicKey);
                    if (z2) {
                        int bitLength = (dHPrivateKey.getParams().getP().bitLength() + 7) / 8;
                        byte[] bArr = new byte[bitLength];
                        System.arraycopy(a, 0, bArr, bitLength - a.length, a.length);
                        Arrays.fill(a, (byte) 0);
                        a = bArr;
                    }
                    return new i30(rdVar, a);
                } catch (GeneralSecurityException e) {
                    throw new ts0("cannot calculate secret", e);
                }
            case 1:
                PrivateKey privateKey = this.b.getPrivate();
                PublicKey publicKey = this.d;
                rd rdVar2 = (rd) ((b8) obj).d;
                try {
                    return new i30(rdVar2, rdVar2.a("ECDH", privateKey, publicKey));
                } catch (GeneralSecurityException e2) {
                    throw new ts0("cannot calculate secret", e2);
                }
            case 2:
                PrivateKey privateKey2 = this.b.getPrivate();
                PublicKey publicKey2 = this.d;
                rd rdVar3 = ((j30) obj).d;
                try {
                    byte[] a2 = rdVar3.a("X25519", privateKey2, publicKey2);
                    if (a2 != null && a2.length == 32) {
                        int i2 = 0;
                        for (byte b : a2) {
                            i2 |= b;
                        }
                        if (i2 != 0) {
                            z = false;
                        }
                        if (!z) {
                            return new i30(rdVar3, a2);
                        }
                        throw new us0((short) 40, null, null);
                    }
                    throw new ts0("invalid secret calculated", null);
                } catch (GeneralSecurityException e3) {
                    throw new ts0("cannot calculate secret", e3);
                }
            default:
                PrivateKey privateKey3 = this.b.getPrivate();
                PublicKey publicKey3 = this.d;
                rd rdVar4 = ((j30) obj).d;
                try {
                    byte[] a3 = rdVar4.a("X448", privateKey3, publicKey3);
                    if (a3 != null && a3.length == 56) {
                        int i3 = 0;
                        for (byte b2 : a3) {
                            i3 |= b2;
                        }
                        if (i3 != 0) {
                            z = false;
                        }
                        if (!z) {
                            return new i30(rdVar4, a3);
                        }
                        throw new us0((short) 40, null, null);
                    }
                    throw new ts0("invalid secret calculated", null);
                } catch (GeneralSecurityException e4) {
                    throw new ts0("cannot calculate secret", e4);
                }
        }
    }

    @Override // defpackage.fs0
    public final void c(byte[] bArr) {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                jy jyVar = (jy) obj;
                try {
                    BigInteger a = jyVar.a(bArr);
                    DHParameterSpec dHParameterSpec = (DHParameterSpec) jyVar.c;
                    this.d = (DHPublicKey) ((sb0) ((rd) jyVar.b).c).i("DiffieHellman").generatePublic(new DHPublicKeySpec(a, dHParameterSpec.getP(), dHParameterSpec.getG()));
                    return;
                } catch (IOException e) {
                    throw e;
                } catch (Exception e2) {
                    f40.a(40, e2, null);
                    return;
                }
            case 1:
                b8 b8Var = (b8) obj;
                try {
                    ls j = b8Var.p(bArr).j();
                    j.c();
                    BigInteger r0 = j.b.r0();
                    j.c();
                    this.d = ((sb0) ((rd) b8Var.d).c).i("EC").generatePublic(new ECPublicKeySpec(new ECPoint(r0, j.e().r0()), (ECParameterSpec) b8Var.e));
                    return;
                } catch (Exception e3) {
                    f40.a(47, e3, null);
                    return;
                }
            case 2:
                this.d = gi0.e(((j30) obj).d, "X25519", ms.a, bArr);
                return;
            default:
                this.d = gi0.e(((j30) obj).d, "X448", ms.b, bArr);
                return;
        }
    }
}
