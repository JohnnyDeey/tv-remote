package defpackage;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.KeyPair;
import java.security.MessageDigest;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.interfaces.RSAPublicKey;
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ConcurrentLinkedQueue;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class o3 implements Closeable {
    public final /* synthetic */ int c;
    public Closeable d;

    public o3(int i) {
        this.c = i;
        switch (i) {
            case 1:
                return;
            case 2:
                this.d = new p3(1);
                return;
            default:
                this.d = new z3();
                return;
        }
    }

    public void a(int i) {
        Log.d("NAV", String.valueOf(i));
        p3 p3Var = (p3) this.d;
        synchronized (p3Var) {
            o3 o3Var = p3Var.d;
            if (o3Var != null) {
                cb0 cb0Var = (cb0) p3Var.e;
                cb0Var.getClass();
                if (i >= 0 && i < 256) {
                    o3Var.f(cb0Var.b(new int[]{i}).concat(((cb0) p3Var.e).b(new int[]{0})));
                } else {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            } else {
                k20.p0("session");
                throw null;
            }
        }
    }

    public void b(o3 o3Var) {
        o3Var.getClass();
        p3 p3Var = (p3) this.d;
        p3Var.getClass();
        p3Var.d = o3Var;
        cb0 cb0Var = (cb0) p3Var.e;
        o3Var.f(cb0Var.a.c(q80.T(new td0("id", Integer.valueOf(cb0Var.b)), new td0("command", "register"), new td0("bus", "usb"), new td0("descriptor", new int[]{5, 12, 9, 1, 161, 1, 21, 0, 37, 1, 117, 1, 149, 5, 10, 162, 1, 10, 35, 2, 10, 36, 2, 9, 233, 9, 234, 129, 6, 149, 1, 117, 3, 129, 3, 192}))));
    }

    public void c(y3 y3Var) {
        z3 z3Var = (z3) this.d;
        z3Var.getClass();
        z3Var.c = y3Var;
        z3Var.d = 2000;
        int nextInt = new Random().nextInt();
        z3Var.e = nextInt;
        z3Var.g = false;
        n3 n3Var = y3Var.c;
        if (n3Var != null) {
            n3Var.b(new rc0("shell,v2,raw:hid -\u0000", nextInt));
            n3 n3Var2 = y3Var.c;
            if (n3Var2 != null) {
                r21 a = n3Var2.a();
                if (a instanceof qc0) {
                    z3Var.f = ((qc0) a).k;
                    z3Var.g = true;
                    return;
                } else {
                    f40.l(a, "Expected OKAY command, received ");
                    return;
                }
            }
            k20.p0("connection");
            throw null;
        }
        k20.p0("connection");
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.c) {
            case 0:
                ((z3) this.d).close();
                return;
            case 1:
                u3 u3Var = (u3) this.d;
                if (u3Var != null) {
                    if (u3Var != null) {
                        u3Var.close();
                        return;
                    } else {
                        k20.p0("connection");
                        throw null;
                    }
                }
                return;
            default:
                ((p3) this.d).close();
                return;
        }
    }

    public void d(String str, KeyPair keyPair) {
        boolean z;
        u3 u3Var = (u3) this.d;
        if (u3Var != null) {
            byte[] bytes = str.getBytes(qg.a);
            bytes.getClass();
            byte[] bArr = u3Var.e;
            if (bArr != null) {
                if (bytes.length == 6 && bArr.length == 64) {
                    byte[] array = ByteBuffer.allocate(70).put(bytes).put(bArr).array();
                    SecureRandom secureRandom = new SecureRandom();
                    array.getClass();
                    byte[] bArr2 = new byte[64];
                    secureRandom.nextBytes(bArr2);
                    BigInteger bigInteger = so0.a;
                    BigInteger shiftLeft = vj0.a(bArr2).shiftLeft(3);
                    shiftLeft.getClass();
                    BigInteger[] h = vj0.h(shiftLeft, so0.e, so0.d);
                    byte[] digest = MessageDigest.getInstance("SHA-512").digest(array);
                    digest.getClass();
                    BigInteger a = vj0.a(digest);
                    BigInteger bigInteger2 = so0.c;
                    if (a.testBit(0)) {
                        a = a.add(bigInteger2);
                        a.getClass();
                    }
                    if (a.testBit(1)) {
                        a = a.add(bigInteger2.shiftLeft(1));
                        a.getClass();
                    }
                    if (a.testBit(2)) {
                        a = a.add(bigInteger2.shiftLeft(2));
                        a.getClass();
                    }
                    BigInteger[] h2 = vj0.h(a, so0.f, so0.g);
                    BigInteger[] f = vj0.f(h[0], h[1], h2[0], h2[1]);
                    byte[] b = vj0.b(f[0], f[1]);
                    ByteBuffer allocate = ByteBuffer.allocate(38);
                    ByteBuffer allocate2 = ByteBuffer.allocate(6);
                    ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
                    ByteBuffer order = allocate2.order(byteOrder);
                    order.put((byte) 1);
                    order.put((byte) 0);
                    order.putInt(32);
                    byte[] array2 = order.array();
                    array2.getClass();
                    allocate.put(array2);
                    allocate.put(b);
                    byte[] array3 = allocate.array();
                    array3.getClass();
                    ho0 ho0Var = u3Var.f;
                    if (ho0Var != null) {
                        ho0Var.write(array3);
                        ho0 ho0Var2 = u3Var.f;
                        if (ho0Var2 != null) {
                            ho0Var2.flush();
                            byte[] b2 = u3Var.b(6);
                            if (b2.length == 6) {
                                ByteBuffer order2 = ByteBuffer.wrap(b2).order(byteOrder);
                                byte b3 = order2.get();
                                byte b4 = order2.get();
                                int i = order2.getInt();
                                if (i >= 0) {
                                    if (b3 == 1) {
                                        if (b4 == 0) {
                                            if (i == 32) {
                                                byte[] b5 = u3Var.b(i);
                                                if ((b5[31] & 128) != 0) {
                                                    z = true;
                                                } else {
                                                    z = false;
                                                }
                                                byte[] copyOf = Arrays.copyOf(b5, 32);
                                                copyOf[31] = (byte) (copyOf[31] & Byte.MAX_VALUE);
                                                byte[] bArr3 = new byte[32];
                                                for (int i2 = 0; i2 < 32; i2++) {
                                                    bArr3[i2] = copyOf[31 - i2];
                                                }
                                                BigInteger bigInteger3 = new BigInteger(1, bArr3);
                                                BigInteger[] bigIntegerArr = {vj0.g(bigInteger3, z), bigInteger3};
                                                BigInteger[] h3 = vj0.h(a, so0.h, so0.i);
                                                BigInteger bigInteger4 = bigIntegerArr[0];
                                                BigInteger bigInteger5 = bigIntegerArr[1];
                                                BigInteger bigInteger6 = h3[0];
                                                BigInteger bigInteger7 = h3[1];
                                                BigInteger mod = bigInteger6.negate().mod(so0.a);
                                                mod.getClass();
                                                BigInteger[] f2 = vj0.f(bigInteger4, bigInteger5, mod, bigInteger7);
                                                BigInteger[] h4 = vj0.h(shiftLeft, f2[0], f2[1]);
                                                byte[] b6 = vj0.b(h4[0], h4[1]);
                                                MessageDigest messageDigest = MessageDigest.getInstance("SHA-512");
                                                byte[] bArr4 = so0.j;
                                                byte[] bArr5 = so0.k;
                                                messageDigest.getClass();
                                                so0.a(messageDigest, bArr4);
                                                so0.a(messageDigest, bArr5);
                                                so0.a(messageDigest, b);
                                                so0.a(messageDigest, b5);
                                                so0.a(messageDigest, b6);
                                                so0.a(messageDigest, digest);
                                                byte[] digest2 = messageDigest.digest();
                                                digest2.getClass();
                                                if (digest2.length == 64) {
                                                    byte[] bytes2 = "adb pairing_auth aes-128-gcm key".getBytes(qg.a);
                                                    bytes2.getClass();
                                                    Mac mac = Mac.getInstance("HmacSHA256");
                                                    mac.init(new SecretKeySpec(new byte[32], "HmacSHA256"));
                                                    mac.init(new SecretKeySpec(mac.doFinal(digest2), "HmacSHA256"));
                                                    mac.update(bytes2);
                                                    mac.update((byte) 1);
                                                    byte[] doFinal = mac.doFinal();
                                                    doFinal.getClass();
                                                    byte[] copyOf2 = Arrays.copyOf(doFinal, 16);
                                                    PublicKey publicKey = keyPair.getPublic();
                                                    publicKey.getClass();
                                                    RSAPublicKey rSAPublicKey = (RSAPublicKey) publicKey;
                                                    StringBuilder sb = new StringBuilder();
                                                    nc ncVar = pc.e;
                                                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(524);
                                                    BigInteger modulus = rSAPublicKey.getModulus();
                                                    mn.V(byteArrayOutputStream, 64);
                                                    modulus.getClass();
                                                    long longValue = modulus.and(BigInteger.valueOf(4294967295L)).longValue();
                                                    long j = longValue;
                                                    for (int i3 = 0; i3 < 5; i3++) {
                                                        j *= 2 - (longValue * j);
                                                    }
                                                    mn.V(byteArrayOutputStream, (int) (4294967295L & (4294967296L - (j & 4294967295L))));
                                                    byteArrayOutputStream.write(mn.T(modulus), 0, 256);
                                                    BigInteger shiftLeft2 = BigInteger.ONE.shiftLeft(2048);
                                                    BigInteger mod2 = shiftLeft2.multiply(shiftLeft2).mod(modulus);
                                                    mod2.getClass();
                                                    byteArrayOutputStream.write(mn.T(mod2), 0, 256);
                                                    mn.V(byteArrayOutputStream, rSAPublicKey.getPublicExponent().intValue());
                                                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                                                    byteArray.getClass();
                                                    int length = byteArray.length;
                                                    ncVar.getClass();
                                                    String s = qo0.s(sb, new String(ncVar.c(length, byteArray), qg.b), " mouse\u0000");
                                                    byte[] bArr6 = new byte[8192];
                                                    bArr6[0] = 0;
                                                    byte[] bytes3 = s.getBytes(qg.a);
                                                    bytes3.getClass();
                                                    System.arraycopy(bytes3, 0, bArr6, 1, Math.min(bytes3.length, 8191));
                                                    Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
                                                    ByteBuffer allocate3 = ByteBuffer.allocate(12);
                                                    ByteOrder byteOrder2 = ByteOrder.LITTLE_ENDIAN;
                                                    cipher.init(1, new SecretKeySpec(copyOf2, "AES"), new GCMParameterSpec(128, allocate3.order(byteOrder2).putLong(0L).array()));
                                                    byte[] doFinal2 = cipher.doFinal(bArr6);
                                                    doFinal2.getClass();
                                                    if (doFinal2.length == 8208) {
                                                        int length2 = doFinal2.length;
                                                        ByteBuffer allocate4 = ByteBuffer.allocate(doFinal2.length + 6);
                                                        ByteBuffer allocate5 = ByteBuffer.allocate(6);
                                                        ByteOrder byteOrder3 = ByteOrder.BIG_ENDIAN;
                                                        ByteBuffer order3 = allocate5.order(byteOrder3);
                                                        order3.put((byte) 1);
                                                        order3.put((byte) 1);
                                                        order3.putInt(length2);
                                                        byte[] array4 = order3.array();
                                                        array4.getClass();
                                                        allocate4.put(array4);
                                                        allocate4.put(doFinal2);
                                                        byte[] array5 = allocate4.array();
                                                        array5.getClass();
                                                        ho0 ho0Var3 = u3Var.f;
                                                        if (ho0Var3 != null) {
                                                            ho0Var3.write(array5);
                                                            ho0 ho0Var4 = u3Var.f;
                                                            if (ho0Var4 != null) {
                                                                ho0Var4.flush();
                                                                byte[] b7 = u3Var.b(6);
                                                                if (b7.length == 6) {
                                                                    ByteBuffer order4 = ByteBuffer.wrap(b7).order(byteOrder3);
                                                                    byte b8 = order4.get();
                                                                    byte b9 = order4.get();
                                                                    int i4 = order4.getInt();
                                                                    if (i4 >= 0) {
                                                                        if (b8 == 1) {
                                                                            if (b9 == 1) {
                                                                                if (i4 == 8208) {
                                                                                    byte[] b10 = u3Var.b(i4);
                                                                                    Cipher cipher2 = Cipher.getInstance("AES/GCM/NoPadding");
                                                                                    cipher2.init(2, new SecretKeySpec(copyOf2, "AES"), new GCMParameterSpec(128, ByteBuffer.allocate(12).order(byteOrder2).putLong(0L).array()));
                                                                                    byte[] doFinal3 = cipher2.doFinal(b10);
                                                                                    doFinal3.getClass();
                                                                                    Log.i("ADB", "Pairing successful");
                                                                                    Log.i("ADB", "Host peer info size: " + doFinal3.length);
                                                                                    return;
                                                                                }
                                                                                c.k("Failed requirement.");
                                                                                return;
                                                                            }
                                                                            c.k("Failed requirement.");
                                                                            return;
                                                                        }
                                                                        c.k("Failed requirement.");
                                                                        return;
                                                                    }
                                                                    c.k("Failed requirement.");
                                                                    return;
                                                                }
                                                                c.k("Failed requirement.");
                                                                return;
                                                            }
                                                            k20.p0("output");
                                                            throw null;
                                                        }
                                                        k20.p0("output");
                                                        throw null;
                                                    }
                                                    c.k("Failed requirement.");
                                                    return;
                                                }
                                                c.k("Failed requirement.");
                                                return;
                                            }
                                            c.k("Failed requirement.");
                                            return;
                                        }
                                        c.k("Failed requirement.");
                                        return;
                                    }
                                    c.k("Failed requirement.");
                                    return;
                                }
                                c.k("Failed requirement.");
                                return;
                            }
                            c.k("Failed requirement.");
                            return;
                        }
                        k20.p0("output");
                        throw null;
                    }
                    k20.p0("output");
                    throw null;
                }
                c.k("Failed requirement.");
                return;
            }
            k20.p0("keyMaterial64Bytes");
            throw null;
        }
        k20.p0("connection");
        throw null;
    }

    public void e(String str) {
        long j;
        z3 z3Var = (z3) this.d;
        ConcurrentLinkedQueue concurrentLinkedQueue = z3Var.h;
        y3 y3Var = z3Var.c;
        if (y3Var != null) {
            zz0 zz0Var = new zz0(z3.a(str), z3Var.e, z3Var.f);
            n3 n3Var = y3Var.c;
            if (n3Var != null) {
                n3Var.b(zz0Var);
                long currentTimeMillis = System.currentTimeMillis();
                concurrentLinkedQueue.add(Long.valueOf(currentTimeMillis));
                while (true) {
                    Long l = (Long) concurrentLinkedQueue.peek();
                    if (l != null) {
                        j = l.longValue();
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (currentTimeMillis - j > z3Var.d) {
                        concurrentLinkedQueue.poll();
                        n3 n3Var2 = y3Var.c;
                        if (n3Var2 != null) {
                            r21 a = n3Var2.a();
                            if (!(a instanceof qc0)) {
                                Log.w("ADB", "Unexpected message: " + a);
                            }
                        } else {
                            k20.p0("connection");
                            throw null;
                        }
                    } else {
                        return;
                    }
                }
            } else {
                k20.p0("connection");
                throw null;
            }
        } else {
            k20.p0("protocol");
            throw null;
        }
    }

    public void f(String str) {
        z3 z3Var = (z3) this.d;
        z3Var.getClass();
        y3 y3Var = z3Var.c;
        if (y3Var != null) {
            int i = z3Var.e;
            int i2 = z3Var.f;
            byte[] a = z3.a(str);
            n3 n3Var = y3Var.c;
            if (n3Var != null) {
                n3Var.b(new zz0(a, i, i2));
                n3 n3Var2 = y3Var.c;
                if (n3Var2 != null) {
                    r21 a2 = n3Var2.a();
                    if (a2 instanceof qc0) {
                        return;
                    }
                    f40.l(a2, "Expected OKAY command, received ");
                    return;
                }
                k20.p0("connection");
                throw null;
            }
            k20.p0("connection");
            throw null;
        }
        k20.p0("protocol");
        throw null;
    }
}
