package defpackage;

import android.util.Log;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.InputStream;
import java.math.BigInteger;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.Signature;
import java.util.Date;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class u3 implements Closeable {
    public Socket c;
    public ks0 d;
    public byte[] e;
    public ho0 f;
    public DataInputStream g;

    /* JADX WARN: Type inference failed for: r7v1, types: [hx0, java.lang.Object] */
    public final void a(String str, int i) {
        str.getClass();
        this.c = new Socket(str, i);
        Log.i("ADB", "Connected to " + str + ':' + i);
        Socket socket = this.c;
        if (socket != null) {
            InputStream inputStream = socket.getInputStream();
            Socket socket2 = this.c;
            if (socket2 != null) {
                this.d = new ks0(inputStream, socket2.getOutputStream());
                SecureRandom secureRandom = new SecureRandom();
                KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
                keyPairGenerator.initialize(2048, secureRandom);
                KeyPair generateKeyPair = keyPairGenerator.generateKeyPair();
                long currentTimeMillis = System.currentTimeMillis();
                generateKeyPair.getClass();
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
                obj.g = hq0.i(generateKeyPair.getPublic().getEncoded());
                wq0 a = obj.a();
                Signature signature = Signature.getInstance("SHA256withRSA");
                signature.initSign(generateKeyPair.getPrivate());
                signature.update(a.getEncoded());
                j jVar = new j();
                jVar.d(a);
                jVar.d(k4Var);
                jVar.d(new cm(0, signature.sign()));
                nm nmVar = new nm(jVar, 0);
                nmVar.f = -1;
                byte[] encoded = nmVar.getEncoded();
                encoded.getClass();
                Log.i("ADB", "Generated self-signed certificate");
                sb0 sb0Var = new sb0(new de());
                try {
                    t3 t3Var = new t3(new rd(sb0Var, secureRandom, new w20(sb0Var, secureRandom)), generateKeyPair, encoded, this);
                    ks0 ks0Var = this.d;
                    if (ks0Var != null) {
                        ks0Var.f(t3Var);
                        Log.i("ADB", "TLS handshake completed");
                        ks0 ks0Var2 = this.d;
                        if (ks0Var2 != null) {
                            if (ks0Var2.z) {
                                ho0 ho0Var = ks0Var2.i;
                                ho0Var.getClass();
                                this.f = ho0Var;
                                ks0 ks0Var3 = this.d;
                                if (ks0Var3 != null) {
                                    if (ks0Var3.z) {
                                        this.g = new DataInputStream(ks0Var3.h);
                                        return;
                                    } else {
                                        c.o("Cannot use InputStream in non-blocking mode! Use offerInput() instead.");
                                        return;
                                    }
                                }
                                k20.p0("tlsProtocol");
                                throw null;
                            }
                            c.o("Cannot use OutputStream in non-blocking mode! Use offerOutput() instead.");
                            return;
                        }
                        k20.p0("tlsProtocol");
                        throw null;
                    }
                    k20.p0("tlsProtocol");
                    throw null;
                } catch (GeneralSecurityException e) {
                    f40.j("unable to create JcaTlsCrypto: ", e.getMessage(), e);
                    return;
                }
            }
            k20.p0("socket");
            throw null;
        }
        k20.p0("socket");
        throw null;
    }

    public final byte[] b(int i) {
        byte[] bArr = new byte[i];
        DataInputStream dataInputStream = this.g;
        if (dataInputStream != null) {
            dataInputStream.readFully(bArr);
            return bArr;
        }
        k20.p0("input");
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ks0 ks0Var = this.d;
        if (ks0Var != null) {
            if (ks0Var != null) {
                ks0Var.h(true);
            } else {
                k20.p0("tlsProtocol");
                throw null;
            }
        }
        Socket socket = this.c;
        if (socket != null) {
            if (socket != null) {
                if (!socket.isClosed()) {
                    Socket socket2 = this.c;
                    if (socket2 != null) {
                        socket2.close();
                        return;
                    } else {
                        k20.p0("socket");
                        throw null;
                    }
                }
                return;
            }
            k20.p0("socket");
            throw null;
        }
    }
}
