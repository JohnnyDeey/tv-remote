package defpackage;

import java.io.Closeable;
import java.io.DataInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.interfaces.RSAPublicKey;
import java.util.Arrays;
import java.util.Date;
import javax.crypto.Cipher;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class y3 implements Closeable {
    public n3 c;
    public int d;
    public int e;

    public final void a(int i, int i2) {
        n3 n3Var = this.c;
        if (n3Var != null) {
            n3Var.b(new oe(i, i2));
            n3 n3Var2 = this.c;
            if (n3Var2 != null) {
                r21 a = n3Var2.a();
                if (a instanceof oe) {
                    return;
                }
                f40.l(a, "Expected CLSE command, received ");
                return;
            }
            k20.p0("connection");
            throw null;
        }
        k20.p0("connection");
        throw null;
    }

    /* JADX WARN: Type inference failed for: r12v1, types: [hx0, java.lang.Object] */
    public final mn b(KeyPair keyPair) {
        v3 v3Var = v3.l;
        n3 n3Var = this.c;
        if (n3Var != null) {
            n3Var.b(new ve("host::features=shell_v2,cmd,stat_v2,ls_v2,fixed_push_mkdir,apex,abb,fixed_push_symlink_timestamp,abb_exec,remount_shell,track_app,sendrecv_v2,sendrecv_v2_brotli,sendrecv_v2_lz4,sendrecv_v2_zstd,sendrecv_v2_dry_run_send,openscreen_mdns", 16777217, 1048576));
            n3 n3Var2 = this.c;
            if (n3Var2 != null) {
                r21 a = n3Var2.a();
                if (a instanceof g0) {
                    g0 g0Var = (g0) a;
                    f0 f0Var = g0Var.k;
                    f0 f0Var2 = f0.e;
                    if (f0Var == f0Var2) {
                        byte[] bArr = g0Var.l;
                        PrivateKey privateKey = keyPair.getPrivate();
                        privateKey.getClass();
                        try {
                            int length = bArr.length;
                            byte[] copyOf = Arrays.copyOf(new byte[]{48, 33, 48, 9, 6, 5, 43, 14, 3, 2, 26, 5, 0, 4, 20}, 15 + length);
                            System.arraycopy(bArr, 0, copyOf, 15, length);
                            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
                            cipher.init(1, privateKey);
                            byte[] doFinal = cipher.doFinal(copyOf);
                            doFinal.getClass();
                            n3 n3Var3 = this.c;
                            if (n3Var3 != null) {
                                n3Var3.b(new g0(f0.f, doFinal));
                                n3 n3Var4 = this.c;
                                if (n3Var4 != null) {
                                    r21 a2 = n3Var4.a();
                                    if (a2 instanceof g0) {
                                        f0 f0Var3 = ((g0) a2).k;
                                        if (f0Var3 == f0Var2) {
                                            return w3.l;
                                        }
                                        f40.l(f0Var3, "Expected auth type TOKEN, received ");
                                        return null;
                                    }
                                    if (!(a2 instanceof ve)) {
                                        c.t(a2, "Expected CNXN or AUTH command, received ");
                                        return null;
                                    }
                                } else {
                                    k20.p0("connection");
                                    throw null;
                                }
                            } else {
                                k20.p0("connection");
                                throw null;
                            }
                        } catch (Exception e) {
                            throw new IllegalStateException(e);
                        }
                    } else {
                        f40.l(f0Var, "Expected auth type TOKEN, received ");
                        return null;
                    }
                } else if (a instanceof kl0) {
                    n3 n3Var5 = this.c;
                    if (n3Var5 != null) {
                        n3Var5.b(new kl0(((kl0) a).k));
                        n3 n3Var6 = this.c;
                        if (n3Var6 != null) {
                            SecureRandom secureRandom = new SecureRandom();
                            long currentTimeMillis = System.currentTimeMillis();
                            BigInteger valueOf = BigInteger.valueOf(currentTimeMillis);
                            valueOf.getClass();
                            Date date = new Date(currentTimeMillis);
                            Date date2 = new Date(currentTimeMillis + 31536000000L);
                            k4 k4Var = new k4(od0.e);
                            v11 v11Var = new v11();
                            ?? obj = new Object();
                            obj.a = new o(valueOf);
                            obj.b = k4Var;
                            obj.c = v11Var;
                            obj.d = new wr0(date);
                            obj.e = new wr0(date2);
                            obj.f = v11Var;
                            obj.g = hq0.i(keyPair.getPublic().getEncoded());
                            wq0 a3 = obj.a();
                            Signature signature = Signature.getInstance("SHA256withRSA");
                            signature.initSign(keyPair.getPrivate());
                            signature.update(a3.getEncoded());
                            j jVar = new j();
                            jVar.d(a3);
                            jVar.d(k4Var);
                            jVar.d(new cm(0, signature.sign()));
                            nm nmVar = new nm(jVar, 0);
                            nmVar.f = -1;
                            byte[] encoded = nmVar.getEncoded();
                            encoded.getClass();
                            sb0 sb0Var = new sb0(new de());
                            try {
                                rd rdVar = new rd(sb0Var, secureRandom, new w20(sb0Var, secureRandom));
                                Socket socket = n3Var6.c;
                                if (socket != null) {
                                    InputStream inputStream = socket.getInputStream();
                                    Socket socket2 = n3Var6.c;
                                    if (socket2 != null) {
                                        ks0 ks0Var = new ks0(inputStream, socket2.getOutputStream());
                                        ks0Var.f(new m3(rdVar, keyPair, encoded));
                                        boolean z = ks0Var.z;
                                        if (z) {
                                            ho0 ho0Var = ks0Var.i;
                                            ho0Var.getClass();
                                            n3Var6.d = ho0Var;
                                            if (z) {
                                                n3Var6.e = new DataInputStream(ks0Var.h);
                                                try {
                                                    n3 n3Var7 = this.c;
                                                    if (n3Var7 != null) {
                                                        r21 a4 = n3Var7.a();
                                                        if (!(a4 instanceof ve)) {
                                                            throw new IllegalStateException(("Expected CNXN after TLS upgrade, received " + a4).toString());
                                                        }
                                                    } else {
                                                        k20.p0("connection");
                                                        throw null;
                                                    }
                                                } catch (vs0 e2) {
                                                    if (e2.d == 46) {
                                                        return x3.l;
                                                    }
                                                    throw e2;
                                                }
                                            } else {
                                                c.o("Cannot use InputStream in non-blocking mode! Use offerInput() instead.");
                                                return null;
                                            }
                                        } else {
                                            c.o("Cannot use OutputStream in non-blocking mode! Use offerOutput() instead.");
                                            return null;
                                        }
                                    } else {
                                        k20.p0("socket");
                                        throw null;
                                    }
                                } else {
                                    k20.p0("socket");
                                    throw null;
                                }
                            } catch (GeneralSecurityException e3) {
                                f40.j("unable to create JcaTlsCrypto: ", e3.getMessage(), e3);
                                return null;
                            }
                        } else {
                            k20.p0("connection");
                            throw null;
                        }
                    } else {
                        k20.p0("connection");
                        throw null;
                    }
                } else if (!(a instanceof ve)) {
                    c.t(a, "Expected CNXN, AUTH, or STLS command, received ");
                    return null;
                }
                return v3Var;
            }
            k20.p0("connection");
            throw null;
        }
        k20.p0("connection");
        throw null;
    }

    public final void c() {
        n3 n3Var = this.c;
        if (n3Var != null) {
            n3Var.b(new ve("host::features=shell_v2,cmd,stat_v2,ls_v2,fixed_push_mkdir,apex,abb,fixed_push_symlink_timestamp,abb_exec,remount_shell,track_app,sendrecv_v2,sendrecv_v2_brotli,sendrecv_v2_lz4,sendrecv_v2_zstd,sendrecv_v2_dry_run_send,openscreen_mdns", 16777217, 1048576));
            n3 n3Var2 = this.c;
            if (n3Var2 != null) {
                r21 a = n3Var2.a();
                if (a instanceof g0) {
                    f0 f0Var = ((g0) a).k;
                    if (f0Var != f0.e) {
                        f40.l(f0Var, "Expected auth type TOKEN, received ");
                        return;
                    }
                    return;
                }
                if (!(a instanceof kl0) && !(a instanceof ve)) {
                    c.t(a, "Expected CNXN, AUTH, or STLS command, received ");
                    return;
                }
                return;
            }
            k20.p0("connection");
            throw null;
        }
        k20.p0("connection");
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        n3 n3Var = this.c;
        if (n3Var != null) {
            if (n3Var != null) {
                n3Var.close();
            } else {
                k20.p0("connection");
                throw null;
            }
        }
    }

    public final void d(KeyPair keyPair) {
        PublicKey publicKey = keyPair.getPublic();
        publicKey.getClass();
        RSAPublicKey rSAPublicKey = (RSAPublicKey) publicKey;
        int bitLength = (rSAPublicKey.getModulus().bitLength() / 8) / 4;
        BigInteger modulus = rSAPublicKey.getModulus();
        BigInteger bigInteger = BigInteger.ZERO;
        BigInteger modPow = bigInteger.setBit(bitLength * 32).modPow(BigInteger.valueOf(2L), modulus);
        int intValue = modulus.remainder(bigInteger.setBit(32)).modInverse(bigInteger.setBit(32)).negate().intValue();
        int intValue2 = rSAPublicKey.getPublicExponent().intValue();
        ByteBuffer order = ByteBuffer.allocate((bitLength * 8) + 12).order(ByteOrder.LITTLE_ENDIAN);
        order.putInt(bitLength);
        order.putInt(intValue);
        byte[] byteArray = modulus.toByteArray();
        byteArray.getClass();
        int i = bitLength * 4;
        order.put(s8.x0(byteArray), 0, i);
        byte[] byteArray2 = modPow.toByteArray();
        byteArray2.getClass();
        order.put(s8.x0(byteArray2), 0, i);
        order.putInt(intValue2);
        byte[] array = order.array();
        array.getClass();
        nc ncVar = pc.e;
        int length = array.length;
        ncVar.getClass();
        byte[] c = ncVar.c(length, array);
        byte[] bytes = " adbmouse@adbmouse.app\u0000".getBytes(qg.a);
        bytes.getClass();
        int length2 = c.length;
        int length3 = bytes.length;
        byte[] copyOf = Arrays.copyOf(c, length2 + length3);
        System.arraycopy(bytes, 0, copyOf, length2, length3);
        n3 n3Var = this.c;
        if (n3Var != null) {
            n3Var.b(new g0(f0.g, copyOf));
            n3 n3Var2 = this.c;
            if (n3Var2 != null) {
                int i2 = this.e;
                Socket socket = n3Var2.c;
                if (socket != null) {
                    socket.setSoTimeout(i2);
                    n3 n3Var3 = this.c;
                    if (n3Var3 != null) {
                        r21 a = n3Var3.a();
                        n3 n3Var4 = this.c;
                        if (n3Var4 != null) {
                            int i3 = this.d;
                            Socket socket2 = n3Var4.c;
                            if (socket2 != null) {
                                socket2.setSoTimeout(i3);
                                if (a instanceof ve) {
                                    return;
                                }
                                f40.l(a, "Expected CNXN command, received ");
                                return;
                            }
                            k20.p0("socket");
                            throw null;
                        }
                        k20.p0("connection");
                        throw null;
                    }
                    k20.p0("connection");
                    throw null;
                }
                k20.p0("socket");
                throw null;
            }
            k20.p0("connection");
            throw null;
        }
        k20.p0("connection");
        throw null;
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [n3, java.lang.Object] */
    public final void e(String str, int i, int i2, int i3) {
        str.getClass();
        this.d = 2000;
        this.e = i3;
        ?? obj = new Object();
        this.c = obj;
        Socket socket = new Socket();
        socket.setTcpNoDelay(true);
        socket.setTrafficClass(16);
        socket.setSoTimeout(2000);
        obj.c = socket;
        socket.connect(new InetSocketAddress(str, i), i2);
        Socket socket2 = obj.c;
        if (socket2 != null) {
            OutputStream outputStream = socket2.getOutputStream();
            outputStream.getClass();
            obj.d = outputStream;
            Socket socket3 = obj.c;
            if (socket3 != null) {
                obj.e = new DataInputStream(socket3.getInputStream());
                return;
            } else {
                k20.p0("socket");
                throw null;
            }
        }
        k20.p0("socket");
        throw null;
    }
}
