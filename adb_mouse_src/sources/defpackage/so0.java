package defpackage;

import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.MessageDigest;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class so0 {
    public static final BigInteger a;
    public static final BigInteger b;
    public static final BigInteger c;
    public static final BigInteger d;
    public static final BigInteger e;
    public static final BigInteger f;
    public static final BigInteger g;
    public static final BigInteger h;
    public static final BigInteger i;
    public static final byte[] j;
    public static final byte[] k;

    static {
        BigInteger subtract = BigInteger.valueOf(2L).pow(255).subtract(BigInteger.valueOf(19L));
        subtract.getClass();
        a = subtract;
        BigInteger mod = BigInteger.valueOf(-121665L).multiply(BigInteger.valueOf(121666L).modInverse(subtract)).mod(subtract);
        mod.getClass();
        b = mod;
        BigInteger add = BigInteger.valueOf(2L).pow(252).add(new BigInteger("27742317777372353535851937790883648493"));
        add.getClass();
        c = add;
        BigInteger mod2 = BigInteger.valueOf(4L).multiply(BigInteger.valueOf(5L).modInverse(subtract)).mod(subtract);
        mod2.getClass();
        d = mod2;
        e = vj0.g(mod2, false);
        f = new BigInteger("31406539342727633121250288103050113562375374900226415211311216773867585644232");
        g = new BigInteger("21177308356423958466833845032658859666296341766942662650232962324899758529114");
        h = new BigInteger("49918732221787544735331783592030787422991506689877079631459872391322455579424");
        i = new BigInteger("54629554431565467720832445949441049581317094546788069926228343916274969994000");
        Charset charset = qg.a;
        byte[] bytes = "adb pair client\u0000".getBytes(charset);
        bytes.getClass();
        j = bytes;
        byte[] bytes2 = "adb pair server\u0000".getBytes(charset);
        bytes2.getClass();
        k = bytes2;
    }

    public static void a(MessageDigest messageDigest, byte[] bArr) {
        byte[] bArr2 = new byte[8];
        long length = bArr.length;
        for (int i2 = 0; i2 < 8; i2++) {
            bArr2[i2] = (byte) (255 & length);
            length >>= 8;
        }
        messageDigest.update(bArr2);
        messageDigest.update(bArr);
    }
}
