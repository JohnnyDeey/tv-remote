package defpackage;

import android.R;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import android.util.Base64;
import android.util.TypedValue;
import android.view.View;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public abstract class f20 {
    public static Context a;
    public static Boolean b;
    public static final int[] c = {R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};
    public static final int[] d = {R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};
    public static final int[] e = {R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};
    public static final int[] f = {R.attr.name, R.attr.pathData, R.attr.fillType};
    public static final int[] g = {R.attr.drawable};
    public static final int[] h = {R.attr.name, R.attr.animation};
    public static final Object[] i = new Object[0];
    public static final String[] j = {"standard", "accelerate", "decelerate", "linear"};
    public static final Type[] k = new Type[0];
    public static final String[] l = {"sect163k1", "sect163r1", "sect163r2", "sect193r1", "sect193r2", "sect233k1", "sect233r1", "sect239k1", "sect283k1", "sect283r1", "sect409k1", "sect409r1", "sect571k1", "sect571r1", "secp160k1", "secp160r1", "secp160r2", "secp192k1", "secp192r1", "secp224k1", "secp224r1", "secp256k1", "secp256r1", "secp384r1", "secp521r1", "brainpoolP256r1", "brainpoolP384r1", "brainpoolP512r1", "X25519", "X448", "brainpoolP256r1", "brainpoolP384r1", "brainpoolP512r1", "Tc26-Gost-3410-12-256-paramSetA", "GostR3410-2001-CryptoPro-A", "GostR3410-2001-CryptoPro-B", "GostR3410-2001-CryptoPro-C", "Tc26-Gost-3410-12-512-paramSetA", "Tc26-Gost-3410-12-512-paramSetB", "Tc26-Gost-3410-12-512-paramSetC", "sm2p256v1"};
    public static final String[] m = {"ffdhe2048", "ffdhe3072", "ffdhe4096", "ffdhe6144", "ffdhe8192"};
    public static final byte[] n = {112, 114, 111, 0};
    public static final byte[] o = {112, 114, 109, 0};
    public static final Object p = new Object();
    public static final pv q;
    public static final pv[] r;
    public static Boolean s;
    public static Boolean t;
    public static Boolean u;
    public static Boolean v;

    static {
        pv pvVar = new pv("CLIENT_TELEMETRY", -1, 1L, false);
        q = pvVar;
        r = new pv[]{pvVar};
    }

    public static Set A() {
        try {
            Object invoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (invoke == null) {
                return Collections.EMPTY_SET;
            }
            Set set = (Set) invoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    public static Type B(Type type, Class cls, Class cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i2 = 0; i2 < length; i2++) {
                Class<?> cls3 = interfaces[i2];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i2];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return B(cls.getGenericInterfaces()[i2], interfaces[i2], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<?> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return B(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0015. Please report as an issue. */
    public static final Class C(kh khVar) {
        khVar.getClass();
        Class cls = khVar.a;
        if (cls.isPrimitive()) {
            String name = cls.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return cls;
    }

    public static int D(int i2, int i3) {
        int i4 = i3 - i2;
        if (i4 >= 0) {
            return i4;
        }
        throw new IllegalArgumentException(i2 + " > " + i3);
    }

    public static Class E(Type type) {
        String name;
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return (Class) ((ParameterizedType) type).getRawType();
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance((Class<?>) E(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return E(((WildcardType) type).getUpperBounds()[0]);
        }
        if (type == null) {
            name = "null";
        } else {
            name = type.getClass().getName();
        }
        f40.i("Expected a Class, ParameterizedType, or GenericArrayType, but <", type, "> is of type ", name);
        return null;
    }

    public static Type F(Type type, Class cls, Class cls2) {
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        if (cls2.isAssignableFrom(cls)) {
            return c0(type, cls, B(type, cls, cls2), new HashMap());
        }
        throw new IllegalArgumentException(cls + " is not the same as or a subtype of " + cls2);
    }

    public static String G(int i2) {
        String str;
        StringBuilder sb = new StringBuilder();
        if (i2 != 27) {
            if (i2 != 28) {
                if (i2 != 35) {
                    if (i2 != 54) {
                        if (i2 != 65281) {
                            switch (i2) {
                                case 0:
                                    str = "server_name";
                                    break;
                                case 1:
                                    str = "max_fragment_length";
                                    break;
                                case 2:
                                    str = "client_certificate_url";
                                    break;
                                case 3:
                                    str = "trusted_ca_keys";
                                    break;
                                case 4:
                                    str = "truncated_hmac";
                                    break;
                                case 5:
                                    str = "status_request";
                                    break;
                                case 6:
                                    str = "user_mapping";
                                    break;
                                case 7:
                                    str = "client_authz";
                                    break;
                                case 8:
                                    str = "server_authz";
                                    break;
                                case 9:
                                    str = "cert_type";
                                    break;
                                case 10:
                                    str = "supported_groups";
                                    break;
                                case 11:
                                    str = "ec_point_formats";
                                    break;
                                case 12:
                                    str = "srp";
                                    break;
                                case 13:
                                    str = "signature_algorithms";
                                    break;
                                case 14:
                                    str = "use_srtp";
                                    break;
                                case 15:
                                    str = "heartbeat";
                                    break;
                                case 16:
                                    str = "application_layer_protocol_negotiation";
                                    break;
                                case 17:
                                    str = "status_request_v2";
                                    break;
                                case 18:
                                    str = "signed_certificate_timestamp";
                                    break;
                                case 19:
                                    str = "client_certificate_type";
                                    break;
                                case 20:
                                    str = "server_certificate_type";
                                    break;
                                case 21:
                                    str = "padding";
                                    break;
                                case 22:
                                    str = "encrypt_then_mac";
                                    break;
                                case 23:
                                    str = "extended_master_secret";
                                    break;
                                case 24:
                                    str = "token_binding";
                                    break;
                                case 25:
                                    str = "cached_info";
                                    break;
                                default:
                                    switch (i2) {
                                        case 41:
                                            str = "pre_shared_key";
                                            break;
                                        case 42:
                                            str = "early_data";
                                            break;
                                        case 43:
                                            str = "supported_versions";
                                            break;
                                        case 44:
                                            str = "cookie";
                                            break;
                                        case 45:
                                            str = "psk_key_exchange_modes";
                                            break;
                                        default:
                                            switch (i2) {
                                                case 47:
                                                    str = "certificate_authorities";
                                                    break;
                                                case 48:
                                                    str = "oid_filters";
                                                    break;
                                                case 49:
                                                    str = "post_handshake_auth";
                                                    break;
                                                case 50:
                                                    str = "signature_algorithms_cert";
                                                    break;
                                                case 51:
                                                    str = "key_share";
                                                    break;
                                                default:
                                                    str = "UNKNOWN";
                                                    break;
                                            }
                                    }
                            }
                        } else {
                            str = "renegotiation_info";
                        }
                    } else {
                        str = "connection_id";
                    }
                } else {
                    str = "session_ticket";
                }
            } else {
                str = "record_size_limit";
            }
        } else {
            str = "compress_certificate";
        }
        sb.append(str);
        sb.append("(");
        sb.append(i2);
        sb.append(")");
        return sb.toString();
    }

    public static String H(short s2) {
        String str;
        StringBuilder sb = new StringBuilder();
        if (s2 != 0) {
            if (s2 != 10) {
                if (s2 != 30) {
                    if (s2 != 60) {
                        if (s2 != 80) {
                            if (s2 != 86) {
                                if (s2 != 90) {
                                    if (s2 != 100) {
                                        if (s2 != 120) {
                                            if (s2 != 70) {
                                                if (s2 != 71) {
                                                    switch (s2) {
                                                        case 20:
                                                            str = "bad_record_mac";
                                                            break;
                                                        case 21:
                                                            str = "decryption_failed";
                                                            break;
                                                        case 22:
                                                            str = "record_overflow";
                                                            break;
                                                        default:
                                                            switch (s2) {
                                                                case 40:
                                                                    str = "handshake_failure";
                                                                    break;
                                                                case 41:
                                                                    str = "no_certificate";
                                                                    break;
                                                                case 42:
                                                                    str = "bad_certificate";
                                                                    break;
                                                                case 43:
                                                                    str = "unsupported_certificate";
                                                                    break;
                                                                case 44:
                                                                    str = "certificate_revoked";
                                                                    break;
                                                                case 45:
                                                                    str = "certificate_expired";
                                                                    break;
                                                                case 46:
                                                                    str = "certificate_unknown";
                                                                    break;
                                                                case 47:
                                                                    str = "illegal_parameter";
                                                                    break;
                                                                case 48:
                                                                    str = "unknown_ca";
                                                                    break;
                                                                case 49:
                                                                    str = "access_denied";
                                                                    break;
                                                                case 50:
                                                                    str = "decode_error";
                                                                    break;
                                                                case 51:
                                                                    str = "decrypt_error";
                                                                    break;
                                                                default:
                                                                    switch (s2) {
                                                                        case 109:
                                                                            str = "missing_extension";
                                                                            break;
                                                                        case 110:
                                                                            str = "unsupported_extension";
                                                                            break;
                                                                        case 111:
                                                                            str = "certificate_unobtainable";
                                                                            break;
                                                                        case 112:
                                                                            str = "unrecognized_name";
                                                                            break;
                                                                        case 113:
                                                                            str = "bad_certificate_status_response";
                                                                            break;
                                                                        case 114:
                                                                            str = "bad_certificate_hash_value";
                                                                            break;
                                                                        case 115:
                                                                            str = "unknown_psk_identity";
                                                                            break;
                                                                        case 116:
                                                                            str = "certificate_required";
                                                                            break;
                                                                        default:
                                                                            str = "UNKNOWN";
                                                                            break;
                                                                    }
                                                            }
                                                    }
                                                } else {
                                                    str = "insufficient_security";
                                                }
                                            } else {
                                                str = "protocol_version";
                                            }
                                        } else {
                                            str = "no_application_protocol";
                                        }
                                    } else {
                                        str = "no_renegotiation";
                                    }
                                } else {
                                    str = "user_canceled";
                                }
                            } else {
                                str = "inappropriate_fallback";
                            }
                        } else {
                            str = "internal_error";
                        }
                    } else {
                        str = "export_restriction";
                    }
                } else {
                    str = "decompression_failure";
                }
            } else {
                str = "unexpected_message";
            }
        } else {
            str = "close_notify";
        }
        sb.append(str);
        sb.append("(");
        sb.append((int) s2);
        sb.append(")");
        return sb.toString();
    }

    public static String I(short s2) {
        String str;
        StringBuilder sb = new StringBuilder();
        switch (s2) {
            case 0:
                str = "none";
                break;
            case 1:
                str = "md5";
                break;
            case 2:
                str = "sha1";
                break;
            case 3:
                str = "sha224";
                break;
            case 4:
                str = "sha256";
                break;
            case 5:
                str = "sha384";
                break;
            case 6:
                str = "sha512";
                break;
            case 7:
            default:
                str = "UNKNOWN";
                break;
            case 8:
                str = "Intrinsic";
                break;
        }
        sb.append(str);
        sb.append("(");
        sb.append((int) s2);
        sb.append(")");
        return sb.toString();
    }

    public static final void J(dl dlVar, Throwable th) {
        try {
            o4 o4Var = (o4) dlVar.h(vj0.d);
            if (o4Var != null) {
                o4Var.b(th);
            } else {
                mn.y(dlVar, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                mn.a(runtimeException, th);
                th = runtimeException;
            }
            mn.y(dlVar, th);
        }
    }

    public static int K(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        int length = bArr.length;
        int i2 = length + 1;
        while (true) {
            length--;
            if (length >= 0) {
                i2 = (i2 * 257) ^ bArr[length];
            } else {
                return i2;
            }
        }
    }

    public static boolean L(int i2) {
        double pow;
        double pow2;
        double pow3;
        if (i2 != 0) {
            ThreadLocal threadLocal = oi.a;
            double[] dArr = (double[]) threadLocal.get();
            if (dArr == null) {
                dArr = new double[3];
                threadLocal.set(dArr);
            }
            int red = Color.red(i2);
            int green = Color.green(i2);
            int blue = Color.blue(i2);
            if (dArr.length == 3) {
                double d2 = red / 255.0d;
                if (d2 < 0.04045d) {
                    pow = d2 / 12.92d;
                } else {
                    pow = Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
                }
                double d3 = green / 255.0d;
                if (d3 < 0.04045d) {
                    pow2 = d3 / 12.92d;
                } else {
                    pow2 = Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
                }
                double d4 = blue / 255.0d;
                if (d4 < 0.04045d) {
                    pow3 = d4 / 12.92d;
                } else {
                    pow3 = Math.pow((d4 + 0.055d) / 1.055d, 2.4d);
                }
                dArr[0] = ((0.1805d * pow3) + (0.3576d * pow2) + (0.4124d * pow)) * 100.0d;
                double d5 = ((0.0722d * pow3) + (0.7152d * pow2) + (0.2126d * pow)) * 100.0d;
                dArr[1] = d5;
                dArr[2] = ((pow3 * 0.9505d) + (pow2 * 0.1192d) + (pow * 0.0193d)) * 100.0d;
                if (d5 / 100.0d <= 0.5d) {
                    return false;
                }
                return true;
            }
            c.k("outXyz must have a length of 3.");
            return false;
        }
        return false;
    }

    public static boolean M(byte[] bArr) {
        if (bArr == null || bArr.length < 1) {
            return true;
        }
        return false;
    }

    public static boolean N(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (s == null) {
            s = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        s.booleanValue();
        if (t == null) {
            t = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        if (t.booleanValue()) {
            if (!k20.K() || Build.VERSION.SDK_INT >= 30) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static int O(int i2, int i3, float f2) {
        return oi.b(oi.d(i3, Math.round(Color.alpha(i3) * f2)), i2);
    }

    public static List P(Object obj) {
        List singletonList = Collections.singletonList(obj);
        singletonList.getClass();
        return singletonList;
    }

    public static int Q(int i2) {
        boolean z;
        RoundingMode roundingMode = RoundingMode.UNNECESSARY;
        if (i2 > 0) {
            boolean z2 = true;
            switch (g20.a[roundingMode.ordinal()]) {
                case 1:
                    if (i2 > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (((i2 - 1) & i2) != 0) {
                        z2 = false;
                    }
                    if (!(z & z2)) {
                        throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                    }
                    break;
                case 2:
                case 3:
                    break;
                case 4:
                case 5:
                    return 32 - Integer.numberOfLeadingZeros(i2 - 1);
                case 6:
                case 7:
                case 8:
                    int numberOfLeadingZeros = Integer.numberOfLeadingZeros(i2);
                    return (31 - numberOfLeadingZeros) + ((~(~(((-1257966797) >>> numberOfLeadingZeros) - i2))) >>> 31);
                default:
                    throw new AssertionError();
            }
            return 31 - Integer.numberOfLeadingZeros(i2);
        }
        c.k(qo0.n("x (", i2, ") must be > 0"));
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0118 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27, types: [android.content.res.TypedArray] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.uw R(android.content.res.XmlResourceParser r26, android.content.res.Resources r27) {
        /*
            Method dump skipped, instructions count: 626
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f20.R(android.content.res.XmlResourceParser, android.content.res.Resources):uw");
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [sa0, xq0] */
    public static sa0 S(MappedByteBuffer mappedByteBuffer) {
        long j2;
        ByteBuffer duplicate = mappedByteBuffer.duplicate();
        duplicate.order(ByteOrder.BIG_ENDIAN);
        duplicate.position(duplicate.position() + 4);
        int i2 = duplicate.getShort() & 65535;
        if (i2 <= 100) {
            duplicate.position(duplicate.position() + 6);
            int i3 = 0;
            while (true) {
                if (i3 < i2) {
                    int i4 = duplicate.getInt();
                    duplicate.position(duplicate.position() + 4);
                    j2 = duplicate.getInt() & 4294967295L;
                    duplicate.position(duplicate.position() + 4);
                    if (1835365473 == i4) {
                        break;
                    }
                    i3++;
                } else {
                    j2 = -1;
                    break;
                }
            }
            if (j2 != -1) {
                duplicate.position(duplicate.position() + ((int) (j2 - duplicate.position())));
                duplicate.position(duplicate.position() + 12);
                long j3 = duplicate.getInt() & 4294967295L;
                for (int i5 = 0; i5 < j3; i5++) {
                    int i6 = duplicate.getInt();
                    long j4 = duplicate.getInt() & 4294967295L;
                    duplicate.getInt();
                    if (1164798569 == i6 || 1701669481 == i6) {
                        duplicate.position((int) (j4 + j2));
                        ?? xq0Var = new xq0();
                        duplicate.order(ByteOrder.LITTLE_ENDIAN);
                        int position = duplicate.position() + duplicate.getInt(duplicate.position());
                        xq0Var.d = duplicate;
                        xq0Var.a = position;
                        int i7 = position - duplicate.getInt(position);
                        xq0Var.b = i7;
                        xq0Var.c = ((ByteBuffer) xq0Var.d).getShort(i7);
                        return xq0Var;
                    }
                }
            }
            throw new IOException("Cannot read metadata.");
        }
        throw new IOException("Cannot read metadata.");
    }

    public static List T(Resources resources, int i2) {
        if (i2 == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i2);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (obtainTypedArray.getType(0) == 1) {
                for (int i3 = 0; i3 < obtainTypedArray.length(); i3++) {
                    int resourceId = obtainTypedArray.getResourceId(i3, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i2);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    public static int[] U(ByteArrayInputStream byteArrayInputStream, int i2) {
        int[] iArr = new int[i2];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += (int) wv0.T(2, byteArrayInputStream);
            iArr[i4] = i3;
        }
        return iArr;
    }

    public static fq[] V(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, fq[] fqVarArr) {
        byte[] bArr3 = k20.v;
        if (Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(k20.q, bArr2)) {
                if (Arrays.equals(bArr, bArr3)) {
                    int T = (int) wv0.T(1, fileInputStream);
                    byte[] S = wv0.S(fileInputStream, (int) wv0.T(4, fileInputStream), (int) wv0.T(4, fileInputStream));
                    if (fileInputStream.read() <= 0) {
                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(S);
                        try {
                            fq[] W = W(byteArrayInputStream, T, fqVarArr);
                            byteArrayInputStream.close();
                            return W;
                        } catch (Throwable th) {
                            try {
                                byteArrayInputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    c.o("Content found after the end of file");
                    return null;
                }
                c.o("Unsupported meta version");
                return null;
            }
            c.o("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            return null;
        }
        if (Arrays.equals(bArr, k20.w)) {
            int T2 = (int) wv0.T(2, fileInputStream);
            byte[] S2 = wv0.S(fileInputStream, (int) wv0.T(4, fileInputStream), (int) wv0.T(4, fileInputStream));
            if (fileInputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(S2);
                try {
                    fq[] X = X(byteArrayInputStream2, bArr2, T2, fqVarArr);
                    byteArrayInputStream2.close();
                    return X;
                } catch (Throwable th3) {
                    try {
                        byteArrayInputStream2.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            }
            c.o("Content found after the end of file");
            return null;
        }
        c.o("Unsupported meta version");
        return null;
    }

    public static fq[] W(ByteArrayInputStream byteArrayInputStream, int i2, fq[] fqVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new fq[0];
        }
        if (i2 == fqVarArr.length) {
            String[] strArr = new String[i2];
            int[] iArr = new int[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                int T = (int) wv0.T(2, byteArrayInputStream);
                iArr[i3] = (int) wv0.T(2, byteArrayInputStream);
                strArr[i3] = new String(wv0.R(T, byteArrayInputStream), StandardCharsets.UTF_8);
            }
            for (int i4 = 0; i4 < i2; i4++) {
                fq fqVar = fqVarArr[i4];
                if (fqVar.b.equals(strArr[i4])) {
                    int i5 = iArr[i4];
                    fqVar.e = i5;
                    fqVar.h = U(byteArrayInputStream, i5);
                } else {
                    c.o("Order of dexfiles in metadata did not match baseline");
                    return null;
                }
            }
            return fqVarArr;
        }
        c.o("Mismatched number of dex files found in metadata");
        return null;
    }

    public static fq[] X(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i2, fq[] fqVarArr) {
        String str;
        fq fqVar;
        if (byteArrayInputStream.available() == 0) {
            return new fq[0];
        }
        if (i2 == fqVarArr.length) {
            for (int i3 = 0; i3 < i2; i3++) {
                wv0.T(2, byteArrayInputStream);
                String str2 = new String(wv0.R((int) wv0.T(2, byteArrayInputStream), byteArrayInputStream), StandardCharsets.UTF_8);
                long T = wv0.T(4, byteArrayInputStream);
                int T2 = (int) wv0.T(2, byteArrayInputStream);
                if (fqVarArr.length > 0) {
                    int indexOf = str2.indexOf("!");
                    if (indexOf < 0) {
                        indexOf = str2.indexOf(":");
                    }
                    if (indexOf > 0) {
                        str = str2.substring(indexOf + 1);
                    } else {
                        str = str2;
                    }
                    for (int i4 = 0; i4 < fqVarArr.length; i4++) {
                        if (fqVarArr[i4].b.equals(str)) {
                            fqVar = fqVarArr[i4];
                            break;
                        }
                    }
                }
                fqVar = null;
                if (fqVar != null) {
                    fqVar.d = T;
                    int[] U = U(byteArrayInputStream, T2);
                    if (Arrays.equals(bArr, k20.u)) {
                        fqVar.e = T2;
                        fqVar.h = U;
                    }
                } else {
                    c.o("Missing profile key: ".concat(str2));
                    return null;
                }
            }
            return fqVarArr;
        }
        c.o("Mismatched number of dex files found in metadata");
        return null;
    }

    public static fq[] Y(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (Arrays.equals(bArr, k20.r)) {
            int T = (int) wv0.T(1, fileInputStream);
            byte[] S = wv0.S(fileInputStream, (int) wv0.T(4, fileInputStream), (int) wv0.T(4, fileInputStream));
            if (fileInputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(S);
                try {
                    fq[] Z = Z(byteArrayInputStream, str, T);
                    byteArrayInputStream.close();
                    return Z;
                } catch (Throwable th) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            c.o("Content found after the end of file");
            return null;
        }
        c.o("Unsupported version");
        return null;
    }

    public static fq[] Z(ByteArrayInputStream byteArrayInputStream, String str, int i2) {
        int i3;
        int i4 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new fq[0];
        }
        fq[] fqVarArr = new fq[i2];
        for (int i5 = 0; i5 < i2; i5++) {
            int T = (int) wv0.T(2, byteArrayInputStream);
            int T2 = (int) wv0.T(2, byteArrayInputStream);
            fqVarArr[i5] = new fq(str, new String(wv0.R(T, byteArrayInputStream), StandardCharsets.UTF_8), wv0.T(4, byteArrayInputStream), T2, (int) wv0.T(4, byteArrayInputStream), (int) wv0.T(4, byteArrayInputStream), new int[T2], new TreeMap());
        }
        int i6 = 0;
        while (i6 < i2) {
            fq fqVar = fqVarArr[i6];
            int available = byteArrayInputStream.available();
            int i7 = fqVar.f;
            int i8 = fqVar.g;
            TreeMap treeMap = fqVar.i;
            int i9 = available - i7;
            int i10 = i4;
            while (byteArrayInputStream.available() > i9) {
                i10 += (int) wv0.T(2, byteArrayInputStream);
                treeMap.put(Integer.valueOf(i10), 1);
                int T3 = (int) wv0.T(2, byteArrayInputStream);
                while (T3 > 0) {
                    wv0.T(2, byteArrayInputStream);
                    int T4 = (int) wv0.T(1, byteArrayInputStream);
                    if (T4 != 6 && T4 != 7) {
                        while (T4 > 0) {
                            wv0.T(1, byteArrayInputStream);
                            int i11 = i4;
                            int i12 = i6;
                            for (int T5 = (int) wv0.T(1, byteArrayInputStream); T5 > 0; T5--) {
                                wv0.T(2, byteArrayInputStream);
                            }
                            T4--;
                            i4 = i11;
                            i6 = i12;
                        }
                    }
                    T3--;
                    i4 = i4;
                    i6 = i6;
                }
            }
            int i13 = i4;
            int i14 = i6;
            if (byteArrayInputStream.available() == i9) {
                fqVar.h = U(byteArrayInputStream, fqVar.e);
                BitSet valueOf = BitSet.valueOf(wv0.R((((i8 * 2) + 7) & (-8)) / 8, byteArrayInputStream));
                for (int i15 = i13; i15 < i8; i15++) {
                    if (valueOf.get(i15)) {
                        i3 = 2;
                    } else {
                        i3 = i13;
                    }
                    if (valueOf.get(i15 + i8)) {
                        i3 |= 4;
                    }
                    if (i3 != 0) {
                        Integer num = (Integer) treeMap.get(Integer.valueOf(i15));
                        if (num == null) {
                            num = Integer.valueOf(i13);
                        }
                        treeMap.put(Integer.valueOf(i15), Integer.valueOf(i3 | num.intValue()));
                    }
                }
                i6 = i14 + 1;
                i4 = i13;
            } else {
                c.o("Read too much data during profile line parse");
                return null;
            }
        }
        return fqVarArr;
    }

    public static Type a(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (cls.isArray()) {
                return new l00(a(cls.getComponentType()));
            }
            return cls;
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new m00(parameterizedType.getOwnerType(), (Class) parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            return new l00(((GenericArrayType) type).getGenericComponentType());
        }
        if (type instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) type;
            return new n00(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
        }
        return type;
    }

    public static boolean a0(int i2) {
        if (i2 >= 1 && i2 <= 41) {
            return true;
        }
        return false;
    }

    public static void b(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            c.k("Primitive type is not allowed");
        }
    }

    public static boolean b0(int i2) {
        if (i2 >= 256 && i2 <= 260) {
            return true;
        }
        return false;
    }

    public static final void c(int i2) {
        if (i2 >= 1) {
            return;
        }
        f40.b(qo0.m("Expected positive parallelism level, but got ", i2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0141, code lost:
    
        if (r1 == null) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0143, code lost:
    
        r13.put(r1, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0146, code lost:
    
        return r12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0141 A[EDGE_INSN: B:24:0x0141->B:25:0x0141 BREAK  A[LOOP:0: B:2:0x0002->B:29:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[LOOP:0: B:2:0x0002->B:29:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.lang.reflect.Type, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v17, types: [java.lang.reflect.Type[]] */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r12v3, types: [n00] */
    /* JADX WARN: Type inference failed for: r12v4, types: [n00] */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.lang.reflect.ParameterizedType] */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.reflect.GenericArrayType] */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.util.HashMap] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.reflect.Type c0(java.lang.reflect.Type r10, java.lang.Class r11, java.lang.reflect.Type r12, java.util.HashMap r13) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f20.c0(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type, java.util.HashMap):java.lang.reflect.Type");
    }

    public static int d(Context context, String str) {
        int noteProxyOpNoThrow;
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, myPid, myUid) != -1) {
            String permissionToOp = AppOpsManager.permissionToOp(str);
            if (permissionToOp != null) {
                if (packageName == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        packageName = packagesForUid[0];
                    }
                }
                int myUid2 = Process.myUid();
                String packageName2 = context.getPackageName();
                if (myUid2 == myUid && Objects.equals(packageName2, packageName)) {
                    if (Build.VERSION.SDK_INT >= 29) {
                        AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(AppOpsManager.class);
                        int callingUid = Binder.getCallingUid();
                        int i2 = 1;
                        if (appOpsManager == null) {
                            noteProxyOpNoThrow = 1;
                        } else {
                            noteProxyOpNoThrow = appOpsManager.checkOpNoThrow(permissionToOp, callingUid, packageName);
                        }
                        if (noteProxyOpNoThrow == 0) {
                            String a2 = e8.a(context);
                            if (appOpsManager != null) {
                                i2 = appOpsManager.checkOpNoThrow(permissionToOp, myUid, a2);
                            }
                            noteProxyOpNoThrow = i2;
                        }
                    } else {
                        noteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(permissionToOp, packageName);
                    }
                } else {
                    noteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(permissionToOp, packageName);
                }
                if (noteProxyOpNoThrow != 0) {
                    return -2;
                }
            }
            return 0;
        }
        return -1;
    }

    public static void d0(XmlPullParser xmlPullParser) {
        int i2 = 1;
        while (i2 > 0) {
            int next = xmlPullParser.next();
            if (next != 2) {
                if (next == 3) {
                    i2--;
                }
            } else {
                i2++;
            }
        }
    }

    public static byte[] e(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return (byte[]) bArr.clone();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void e0(zy zyVar, m0 m0Var, m0 m0Var2) {
        try {
            mn.O(wv0.G(((rk) zyVar).j(m0Var2, m0Var)), nw0.a);
        } catch (Throwable th) {
            m0Var2.e(new sj0(th));
            throw th;
        }
    }

    public static short[] f(short[] sArr) {
        if (sArr == null) {
            return null;
        }
        return (short[]) sArr.clone();
    }

    public static final Object[] f0(Collection collection) {
        int size = collection.size();
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                Object[] objArr = new Object[size];
                int i2 = 0;
                while (true) {
                    int i3 = i2 + 1;
                    objArr[i2] = it.next();
                    if (i3 >= objArr.length) {
                        if (!it.hasNext()) {
                            return objArr;
                        }
                        int i4 = ((i3 * 3) + 1) >>> 1;
                        if (i4 <= i3) {
                            i4 = 2147483645;
                            if (i3 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArr = Arrays.copyOf(objArr, i4);
                    } else if (!it.hasNext()) {
                        return Arrays.copyOf(objArr, i3);
                    }
                    i2 = i3;
                }
            }
        }
        return i;
    }

    public static int g(int i2, int i3) {
        return oi.d(i2, (Color.alpha(i2) * i3) / 255);
    }

    public static final Object[] g0(Collection collection, Object[] objArr) {
        Object[] objArr2;
        int size = collection.size();
        int i2 = 0;
        if (size == 0) {
            if (objArr.length > 0) {
                objArr[0] = null;
                return objArr;
            }
        } else {
            Iterator it = collection.iterator();
            if (!it.hasNext()) {
                if (objArr.length > 0) {
                    objArr[0] = null;
                }
            } else {
                if (size <= objArr.length) {
                    objArr2 = objArr;
                } else {
                    Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                    newInstance.getClass();
                    objArr2 = (Object[]) newInstance;
                }
                while (true) {
                    int i3 = i2 + 1;
                    objArr2[i2] = it.next();
                    if (i3 >= objArr2.length) {
                        if (!it.hasNext()) {
                            return objArr2;
                        }
                        int i4 = ((i3 * 3) + 1) >>> 1;
                        if (i4 <= i3) {
                            i4 = 2147483645;
                            if (i3 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArr2 = Arrays.copyOf(objArr2, i4);
                    } else if (!it.hasNext()) {
                        if (objArr2 == objArr) {
                            objArr[i3] = null;
                            return objArr;
                        }
                        return Arrays.copyOf(objArr2, i3);
                    }
                    i2 = i3;
                }
            }
        }
        return objArr;
    }

    public static byte[] h(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return e(bArr2);
        }
        if (bArr2 == null) {
            return e(bArr);
        }
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    /* JADX WARN: Finally extract failed */
    public static boolean h0(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, fq[] fqVarArr) {
        int i2;
        long j2;
        int length;
        byte[] bArr2 = k20.u;
        byte[] bArr3 = k20.t;
        byte[] bArr4 = k20.q;
        int i3 = 0;
        if (Arrays.equals(bArr, bArr4)) {
            ArrayList arrayList = new ArrayList(3);
            ArrayList arrayList2 = new ArrayList(3);
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                wv0.f0(byteArrayOutputStream2, fqVarArr.length);
                int i4 = 2;
                int i5 = 2;
                for (fq fqVar : fqVarArr) {
                    wv0.e0(byteArrayOutputStream2, fqVar.c, 4);
                    wv0.e0(byteArrayOutputStream2, fqVar.d, 4);
                    wv0.e0(byteArrayOutputStream2, fqVar.g, 4);
                    String v2 = v(fqVar.a, fqVar.b, bArr4);
                    Charset charset = StandardCharsets.UTF_8;
                    int length2 = v2.getBytes(charset).length;
                    wv0.f0(byteArrayOutputStream2, length2);
                    i5 = i5 + 14 + length2;
                    byteArrayOutputStream2.write(v2.getBytes(charset));
                }
                byte[] byteArray = byteArrayOutputStream2.toByteArray();
                if (i5 == byteArray.length) {
                    u11 u11Var = new u11(1, false, byteArray);
                    byteArrayOutputStream2.close();
                    arrayList.add(u11Var);
                    ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                    int i6 = 0;
                    int i7 = 0;
                    while (i6 < fqVarArr.length) {
                        try {
                            fq fqVar2 = fqVarArr[i6];
                            wv0.f0(byteArrayOutputStream3, i6);
                            wv0.f0(byteArrayOutputStream3, fqVar2.e);
                            i7 = i7 + 4 + (fqVar2.e * i4);
                            int[] iArr = fqVar2.h;
                            int length3 = iArr.length;
                            int i8 = i3;
                            while (i3 < length3) {
                                int i9 = iArr[i3];
                                wv0.f0(byteArrayOutputStream3, i9 - i8);
                                i3++;
                                i4 = i4;
                                i8 = i9;
                            }
                            i6++;
                            i3 = 0;
                        } catch (Throwable th) {
                        }
                    }
                    int i10 = i4;
                    byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
                    if (i7 == byteArray2.length) {
                        u11 u11Var2 = new u11(3, true, byteArray2);
                        byteArrayOutputStream3.close();
                        arrayList.add(u11Var2);
                        byteArrayOutputStream3 = new ByteArrayOutputStream();
                        int i11 = 0;
                        for (int i12 = 0; i12 < fqVarArr.length; i12++) {
                            try {
                                fq fqVar3 = fqVarArr[i12];
                                Iterator it = fqVar3.i.entrySet().iterator();
                                int i13 = 0;
                                while (it.hasNext()) {
                                    i13 |= ((Integer) ((Map.Entry) it.next()).getValue()).intValue();
                                }
                                ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                                try {
                                    l0(byteArrayOutputStream4, i13, fqVar3);
                                    byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                                    byteArrayOutputStream4.close();
                                    byteArrayOutputStream4 = new ByteArrayOutputStream();
                                    try {
                                        m0(byteArrayOutputStream4, fqVar3);
                                        byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                                        byteArrayOutputStream4.close();
                                        wv0.f0(byteArrayOutputStream3, i12);
                                        int length4 = byteArray3.length + 2 + byteArray4.length;
                                        int i14 = i11 + 6;
                                        wv0.e0(byteArrayOutputStream3, length4, 4);
                                        wv0.f0(byteArrayOutputStream3, i13);
                                        byteArrayOutputStream3.write(byteArray3);
                                        byteArrayOutputStream3.write(byteArray4);
                                        i11 = i14 + length4;
                                    } finally {
                                    }
                                } finally {
                                }
                            } finally {
                                try {
                                    byteArrayOutputStream3.close();
                                    throw th;
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            }
                        }
                        byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
                        if (i11 == byteArray5.length) {
                            u11 u11Var3 = new u11(4, true, byteArray5);
                            byteArrayOutputStream3.close();
                            arrayList.add(u11Var3);
                            long size = 12 + (arrayList.size() * 16);
                            wv0.e0(byteArrayOutputStream, arrayList.size(), 4);
                            int i15 = 0;
                            while (i15 < arrayList.size()) {
                                u11 u11Var4 = (u11) arrayList.get(i15);
                                int i16 = u11Var4.a;
                                byte[] bArr5 = u11Var4.b;
                                if (i16 != 1) {
                                    i2 = i10;
                                    if (i16 != i2) {
                                        if (i16 != 3) {
                                            if (i16 != 4) {
                                                if (i16 == 5) {
                                                    j2 = 4;
                                                } else {
                                                    throw null;
                                                }
                                            } else {
                                                j2 = 3;
                                            }
                                        } else {
                                            j2 = 2;
                                        }
                                    } else {
                                        j2 = 1;
                                    }
                                } else {
                                    i2 = i10;
                                    j2 = 0;
                                }
                                wv0.e0(byteArrayOutputStream, j2, 4);
                                wv0.e0(byteArrayOutputStream, size, 4);
                                if (u11Var4.c) {
                                    long length5 = bArr5.length;
                                    byte[] r2 = wv0.r(bArr5);
                                    arrayList2.add(r2);
                                    wv0.e0(byteArrayOutputStream, r2.length, 4);
                                    wv0.e0(byteArrayOutputStream, length5, 4);
                                    length = r2.length;
                                } else {
                                    arrayList2.add(bArr5);
                                    wv0.e0(byteArrayOutputStream, bArr5.length, 4);
                                    wv0.e0(byteArrayOutputStream, 0L, 4);
                                    length = bArr5.length;
                                }
                                size += length;
                                i15++;
                                i10 = i2;
                            }
                            for (int i17 = 0; i17 < arrayList2.size(); i17++) {
                                byteArrayOutputStream.write((byte[]) arrayList2.get(i17));
                            }
                            return true;
                        }
                        throw new IllegalStateException("Expected size " + i11 + ", does not match actual size " + byteArray5.length);
                    }
                    throw new IllegalStateException("Expected size " + i7 + ", does not match actual size " + byteArray2.length);
                }
                throw new IllegalStateException("Expected size " + i5 + ", does not match actual size " + byteArray.length);
            } catch (Throwable th3) {
                try {
                    byteArrayOutputStream2.close();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        }
        byte[] bArr6 = k20.r;
        if (Arrays.equals(bArr, bArr6)) {
            byte[] q2 = q(fqVarArr, bArr6);
            wv0.e0(byteArrayOutputStream, fqVarArr.length, 1);
            wv0.e0(byteArrayOutputStream, q2.length, 4);
            byte[] r3 = wv0.r(q2);
            wv0.e0(byteArrayOutputStream, r3.length, 4);
            byteArrayOutputStream.write(r3);
            return true;
        }
        if (Arrays.equals(bArr, bArr3)) {
            wv0.e0(byteArrayOutputStream, fqVarArr.length, 1);
            for (fq fqVar4 : fqVarArr) {
                int size2 = fqVar4.i.size() * 4;
                String v3 = v(fqVar4.a, fqVar4.b, bArr3);
                Charset charset2 = StandardCharsets.UTF_8;
                wv0.f0(byteArrayOutputStream, v3.getBytes(charset2).length);
                wv0.f0(byteArrayOutputStream, fqVar4.h.length);
                wv0.e0(byteArrayOutputStream, size2, 4);
                wv0.e0(byteArrayOutputStream, fqVar4.c, 4);
                byteArrayOutputStream.write(v3.getBytes(charset2));
                Iterator it2 = fqVar4.i.keySet().iterator();
                while (it2.hasNext()) {
                    wv0.f0(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                    wv0.f0(byteArrayOutputStream, 0);
                }
                for (int i18 : fqVar4.h) {
                    wv0.f0(byteArrayOutputStream, i18);
                }
            }
            return true;
        }
        byte[] bArr7 = k20.s;
        if (Arrays.equals(bArr, bArr7)) {
            byte[] q3 = q(fqVarArr, bArr7);
            wv0.e0(byteArrayOutputStream, fqVarArr.length, 1);
            wv0.e0(byteArrayOutputStream, q3.length, 4);
            byte[] r4 = wv0.r(q3);
            wv0.e0(byteArrayOutputStream, r4.length, 4);
            byteArrayOutputStream.write(r4);
            return true;
        }
        if (Arrays.equals(bArr, bArr2)) {
            wv0.f0(byteArrayOutputStream, fqVarArr.length);
            for (fq fqVar5 : fqVarArr) {
                String str = fqVar5.a;
                TreeMap treeMap = fqVar5.i;
                String v4 = v(str, fqVar5.b, bArr2);
                Charset charset3 = StandardCharsets.UTF_8;
                wv0.f0(byteArrayOutputStream, v4.getBytes(charset3).length);
                wv0.f0(byteArrayOutputStream, treeMap.size());
                wv0.f0(byteArrayOutputStream, fqVar5.h.length);
                wv0.e0(byteArrayOutputStream, fqVar5.c, 4);
                byteArrayOutputStream.write(v4.getBytes(charset3));
                Iterator it3 = treeMap.keySet().iterator();
                while (it3.hasNext()) {
                    wv0.f0(byteArrayOutputStream, ((Integer) it3.next()).intValue());
                }
                for (int i19 : fqVar5.h) {
                    wv0.f0(byteArrayOutputStream, i19);
                }
            }
            return true;
        }
        return false;
    }

    public static byte[] i(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr == null) {
            return h(bArr2, bArr3);
        }
        if (bArr2 == null) {
            return h(bArr, bArr3);
        }
        if (bArr3 == null) {
            return h(bArr, bArr2);
        }
        byte[] bArr4 = new byte[bArr.length + bArr2.length + bArr3.length];
        System.arraycopy(bArr, 0, bArr4, 0, bArr.length);
        int length = bArr.length;
        System.arraycopy(bArr2, 0, bArr4, length, bArr2.length);
        System.arraycopy(bArr3, 0, bArr4, length + bArr2.length, bArr3.length);
        return bArr4;
    }

    public static String i0(Type type) {
        if (type instanceof Class) {
            return ((Class) type).getName();
        }
        return type.toString();
    }

    public static byte[] j(byte[][] bArr) {
        int i2 = 0;
        for (int i3 = 0; i3 != bArr.length; i3++) {
            i2 += bArr[i3].length;
        }
        byte[] bArr2 = new byte[i2];
        int i4 = 0;
        for (int i5 = 0; i5 != bArr.length; i5++) {
            byte[] bArr3 = bArr[i5];
            System.arraycopy(bArr3, 0, bArr2, i4, bArr3.length);
            i4 += bArr[i5].length;
        }
        return bArr2;
    }

    public static void j0(ByteArrayOutputStream byteArrayOutputStream, fq fqVar) {
        m0(byteArrayOutputStream, fqVar);
        int i2 = fqVar.g;
        int[] iArr = fqVar.h;
        int length = iArr.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            int i5 = iArr[i3];
            wv0.f0(byteArrayOutputStream, i5 - i4);
            i3++;
            i4 = i5;
        }
        byte[] bArr = new byte[(((i2 * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : fqVar.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                int i6 = intValue / 8;
                bArr[i6] = (byte) (bArr[i6] | (1 << (intValue % 8)));
            }
            if ((intValue2 & 4) != 0) {
                int i7 = intValue + i2;
                int i8 = i7 / 8;
                bArr[i8] = (byte) ((1 << (i7 % 8)) | bArr[i8]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static boolean k(int i2, int i3, byte[] bArr, byte[] bArr2) {
        if (bArr != null) {
            if (i2 >= 0) {
                if (bArr.length - i2 >= 0) {
                    if (i3 <= bArr2.length - i2) {
                        int i4 = 0;
                        for (int i5 = 0; i5 < i2; i5++) {
                            i4 |= bArr[i5] ^ bArr2[i3 + i5];
                        }
                        if (i4 != 0) {
                            return false;
                        }
                        return true;
                    }
                    c.m("'bOff' value invalid for specified length");
                    return false;
                }
                c.m("'aOff' value invalid for specified length");
                return false;
            }
            c.k("'len' cannot be negative");
            return false;
        }
        c.g("'a' cannot be null");
        return false;
    }

    public static void k0(ByteArrayOutputStream byteArrayOutputStream, fq fqVar, String str) {
        Charset charset = StandardCharsets.UTF_8;
        wv0.f0(byteArrayOutputStream, str.getBytes(charset).length);
        wv0.f0(byteArrayOutputStream, fqVar.e);
        wv0.e0(byteArrayOutputStream, fqVar.f, 4);
        wv0.e0(byteArrayOutputStream, fqVar.c, 4);
        wv0.e0(byteArrayOutputStream, fqVar.g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static boolean l(byte[] bArr, byte[] bArr2) {
        int length;
        if (bArr != null && bArr2 != null) {
            if (bArr == bArr2) {
                return true;
            }
            if (bArr.length < bArr2.length) {
                length = bArr.length;
            } else {
                length = bArr2.length;
            }
            int length2 = bArr.length ^ bArr2.length;
            for (int i2 = 0; i2 != length; i2++) {
                length2 |= bArr[i2] ^ bArr2[i2];
            }
            while (length < bArr2.length) {
                byte b2 = bArr2[length];
                length2 |= b2 ^ (~b2);
                length++;
            }
            if (length2 == 0) {
                return true;
            }
        }
        return false;
    }

    public static void l0(ByteArrayOutputStream byteArrayOutputStream, int i2, fq fqVar) {
        int i3 = fqVar.g;
        byte[] bArr = new byte[(((Integer.bitCount(i2 & (-2)) * i3) + 7) & (-8)) / 8];
        for (Map.Entry entry : fqVar.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            int i4 = 0;
            for (int i5 = 1; i5 <= 4; i5 <<= 1) {
                if (i5 != 1 && (i5 & i2) != 0) {
                    if ((i5 & intValue2) == i5) {
                        int i6 = (i4 * i3) + intValue;
                        int i7 = i6 / 8;
                        bArr[i7] = (byte) ((1 << (i6 % 8)) | bArr[i7]);
                    }
                    i4++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static boolean m(int[] iArr, int i2) {
        for (int i3 : iArr) {
            if (i3 == i2) {
                return true;
            }
        }
        return false;
    }

    public static void m0(ByteArrayOutputStream byteArrayOutputStream, fq fqVar) {
        int i2 = 0;
        for (Map.Entry entry : fqVar.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                wv0.f0(byteArrayOutputStream, intValue - i2);
                wv0.f0(byteArrayOutputStream, 0);
                i2 = intValue;
            }
        }
    }

    public static boolean n(short[] sArr, short s2) {
        for (short s3 : sArr) {
            if (s3 == s2) {
                return true;
            }
        }
        return false;
    }

    public static byte[] o(int i2, byte[] bArr) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i2));
        return bArr2;
    }

    public static byte[] p(byte[] bArr, int i2, int i3) {
        int D = D(i2, i3);
        byte[] bArr2 = new byte[D];
        System.arraycopy(bArr, i2, bArr2, 0, Math.min(bArr.length - i2, D));
        return bArr2;
    }

    public static byte[] q(fq[] fqVarArr, byte[] bArr) {
        int i2 = 0;
        int i3 = 0;
        for (fq fqVar : fqVarArr) {
            i3 += ((((fqVar.g * 2) + 7) & (-8)) / 8) + (fqVar.e * 2) + v(fqVar.a, fqVar.b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + fqVar.f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i3);
        if (Arrays.equals(bArr, k20.s)) {
            int length = fqVarArr.length;
            while (i2 < length) {
                fq fqVar2 = fqVarArr[i2];
                k0(byteArrayOutputStream, fqVar2, v(fqVar2.a, fqVar2.b, bArr));
                j0(byteArrayOutputStream, fqVar2);
                i2++;
            }
        } else {
            for (fq fqVar3 : fqVarArr) {
                k0(byteArrayOutputStream, fqVar3, v(fqVar3.a, fqVar3.b, bArr));
            }
            int length2 = fqVarArr.length;
            while (i2 < length2) {
                j0(byteArrayOutputStream, fqVarArr[i2]);
                i2++;
            }
        }
        if (byteArrayOutputStream.size() == i3) {
            return byteArrayOutputStream.toByteArray();
        }
        c.h("The bytes saved do not match expectation. actual=", byteArrayOutputStream.size(), " expected=", i3);
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [tk0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.lang.Object, uk0] */
    /* JADX WARN: Type inference failed for: r2v56, types: [bc, u8, dk0] */
    /* JADX WARN: Type inference failed for: r2v57, types: [bc, hy, u8] */
    /* JADX WARN: Type inference failed for: r2v59, types: [re, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v39, types: [bc, u8, dc] */
    public static u8 r(df0 df0Var) {
        uk0 uk0Var;
        b80 b80Var;
        d21 d21Var;
        k21 k21Var;
        v70 v70Var;
        re reVar = null;
        r1 = null;
        t tVar = null;
        r1 = null;
        t tVar2 = null;
        if (df0Var != null) {
            t tVar3 = df0Var.e;
            e eVar = df0Var.g;
            k4 k4Var = df0Var.d;
            s sVar = k4Var.c;
            i iVar = k4Var.d;
            if (sVar.m(pd0.a)) {
                return new yk0(t.q(df0Var.j()).c, gx0.e(rk0.i(iVar)));
            }
            boolean z = true;
            if (sVar.m(pd0.b)) {
                byte[] bArr = t.q(df0Var.j()).c;
                int length = bArr.length / 2;
                short[] sArr = new short[length];
                for (int i2 = 0; i2 != length; i2++) {
                    int i3 = i2 * 2;
                    sArr[i2] = (short) (((bArr[i3 + 1] & 255) << 8) | (bArr[i3] & 255));
                }
                return new ib0(sArr);
            }
            if (sVar.m(od0.m)) {
                byte[] bArr2 = tVar3.c;
                t tVar4 = new t(bArr2);
                if (bArr2.length != 64) {
                    if (!gx0.b(bArr2) && bArr2[0] == 4) {
                        tVar = t.q(bArr2);
                    }
                    if (tVar != null) {
                        tVar4 = t.q(tVar);
                    }
                }
                byte[] bArr3 = tVar4.c;
                if (eVar != null) {
                    byte[] t2 = eVar.t();
                    v00 a2 = v00.a(p(bArr3, 4, bArr3.length));
                    w00.a(t2);
                    a2.getClass();
                    return a2;
                }
                return v00.a(p(bArr3, 4, bArr3.length));
            }
            if (!sVar.x(za.d) && !sVar.x(za.O)) {
                HashMap hashMap = gx0.L;
                if (hashMap.containsKey(sVar)) {
                    kk0 kk0Var = (kk0) hashMap.get(sVar);
                    byte[] bArr4 = tVar3.c;
                    t tVar5 = new t(bArr4);
                    if (bArr4.length != kk0Var.a.a() * 4) {
                        if (!gx0.b(bArr4) && bArr4[0] == 4) {
                            tVar2 = t.q(bArr4);
                        }
                        if (tVar2 != null) {
                            tVar5 = t.q(tVar2);
                        }
                    }
                    return new lk0(kk0Var, tVar5.c);
                }
                if (sVar.x(za.b0)) {
                    return new yd0((xd0) gx0.h.get(sVar), t.q(df0Var.j()).c);
                }
                if (sVar.x(za.H0)) {
                    x j2 = df0Var.j();
                    if (j2 != null) {
                        a0 s2 = a0.s(j2);
                        ?? obj = new Object();
                        int t3 = o.q(s2.t(0)).t();
                        obj.c = t3;
                        if (t3 == 0) {
                            obj.d = e(t.q(s2.t(1)).c);
                            obj.e = e(t.q(s2.t(2)).c);
                            obj.f = e(t.q(s2.t(3)).c);
                            obj.g = e(t.q(s2.t(4)).c);
                            obj.h = e(t.q(s2.t(5)).c);
                            if (s2.size() == 7) {
                                obj.i = te.i(s2.t(6));
                            }
                            reVar = obj;
                        } else {
                            c.k("unrecognized version");
                            return null;
                        }
                    }
                    return new se((qe) gx0.n.get(sVar), e(reVar.d), e(reVar.e), e(reVar.f), e(reVar.g), e(reVar.h));
                }
                if (sVar.x(za.S0)) {
                    byte[] bArr5 = t.q(df0Var.j()).c;
                    ?? bcVar = new bc((gy) gx0.j.get(sVar), z);
                    bcVar.e = e(bArr5);
                    return bcVar;
                }
                if (sVar.x(za.Z0)) {
                    byte[] bArr6 = t.q(df0Var.j()).c;
                    ?? bcVar2 = new bc((ck0) gx0.l.get(sVar), z);
                    bcVar2.e = e(bArr6);
                    return bcVar2;
                }
                if (sVar.x(za.s1)) {
                    return new pb0((ob0) gx0.r.get(sVar), t.q(df0Var.j()).c);
                }
                if (!sVar.m(kb0.R) && !sVar.m(kb0.S) && !sVar.m(kb0.T)) {
                    if (sVar.x(za.C1)) {
                        a0 s3 = a0.s(df0Var.j());
                        return new mb0((lb0) gx0.v.get(sVar), t.q(s3.t(0)).c, t.q(s3.t(1)).c, t.q(s3.t(2)).c, t.q(s3.t(3)).c);
                    }
                    if (sVar.x(za.J1)) {
                        a0 s4 = a0.s(df0Var.j());
                        return new ok0((nk0) gx0.x.get(sVar), t.q(s4.t(0)).c, t.q(s4.t(1)).c, t.q(s4.t(2)).c, t.q(s4.t(3)).c, t.q(s4.t(4)).c);
                    }
                    HashMap hashMap2 = gx0.J;
                    if (hashMap2.containsKey(sVar)) {
                        byte[] bArr7 = tVar3.c;
                        t tVar6 = new t(bArr7);
                        Object obj2 = tVar6;
                        if (bArr7.length != 32) {
                            x c2 = gx0.c(bArr7);
                            if (c2 instanceof t) {
                                obj2 = t.q(c2);
                            } else {
                                obj2 = tVar6;
                                if (c2 instanceof a0) {
                                    obj2 = a0.s(c2);
                                }
                            }
                        }
                        t70 t70Var = (t70) hashMap2.get(sVar);
                        if (eVar != null) {
                            v70Var = ag0.b(t70Var, eVar);
                        } else {
                            v70Var = null;
                        }
                        if (obj2 instanceof t) {
                            return new u70(t70Var, ((t) obj2).c, v70Var);
                        }
                        if (obj2 instanceof a0) {
                            a0 a0Var = (a0) obj2;
                            byte[] bArr8 = t.q(a0Var.t(0)).c;
                            byte[] bArr9 = t.q(a0Var.t(1)).c;
                            u70 u70Var = new u70(t70Var, bArr8, v70Var);
                            if (l(u70Var.getEncoded(), bArr9)) {
                                return u70Var;
                            }
                            c.k(qo0.s(new StringBuilder("inconsistent "), t70Var.b, " private key"));
                            return null;
                        }
                        c.k(qo0.s(new StringBuilder("invalid "), t70Var.b, " private key"));
                        return null;
                    }
                    if (!sVar.m(za.t0) && !sVar.m(za.u0) && !sVar.m(za.v0)) {
                        if (!sVar.m(za.r0) && !sVar.m(za.s0)) {
                            if (!sVar.m(za.p0) && !sVar.m(za.q0)) {
                                if (sVar.x(za.Q1)) {
                                    byte[] bArr10 = t.q(df0Var.j()).c;
                                    cc ccVar = (cc) gx0.B.get(sVar);
                                    int i4 = ccVar.b;
                                    int i5 = ccVar.b;
                                    byte[] p2 = p(bArr10, 0, (i4 + 7) / 8);
                                    byte[] p3 = p(bArr10, (i5 + 7) / 8, ((i5 + 7) / 8) * 2);
                                    byte[] p4 = p(bArr10, ((i5 + 7) / 8) * 2, bArr10.length);
                                    ?? bcVar3 = new bc(ccVar, z);
                                    bcVar3.e = e(p2);
                                    bcVar3.f = e(p3);
                                    bcVar3.g = e(p4);
                                    return bcVar3;
                                }
                                if (sVar.x(za.U1)) {
                                    return new t00((s00) gx0.D.get(sVar), t.q(df0Var.j()).c);
                                }
                                if (sVar.x(za.z0)) {
                                    return new ug0((tg0) gx0.F.get(sVar), t.q(df0Var.j()).c);
                                }
                                if (sVar.m(pd0.c)) {
                                    a21 i6 = a21.i(iVar);
                                    s sVar2 = i6.e.c;
                                    x j3 = df0Var.j();
                                    if (j3 != null) {
                                        k21Var = new k21(a0.s(j3));
                                    } else {
                                        k21Var = null;
                                    }
                                    try {
                                        uh0 uh0Var = new uh0(new j21(i6.d, gx0.a(sVar2)));
                                        int i7 = k21Var.d;
                                        byte[] bArr11 = k21Var.j;
                                        uh0Var.a = i7;
                                        uh0Var.d = mi0.e(e(k21Var.e));
                                        uh0Var.e = mi0.e(e(k21Var.f));
                                        uh0Var.f = mi0.e(e(k21Var.g));
                                        uh0Var.g = mi0.e(e(k21Var.h));
                                        if (k21Var.c != 0) {
                                            uh0Var.b = k21Var.i;
                                        }
                                        if (e(bArr11) != null) {
                                            nb nbVar = (nb) mi0.o(e(bArr11), nb.class);
                                            nbVar.getClass();
                                            uh0Var.h = new nb(nbVar, sVar2);
                                        }
                                        return new l21(uh0Var);
                                    } catch (ClassNotFoundException e2) {
                                        c.l(e2.getMessage(), "ClassNotFoundException processing BDS state: ");
                                        return null;
                                    }
                                }
                                if (sVar.m(pd0.d)) {
                                    b21 i8 = b21.i(iVar);
                                    s sVar3 = i8.f.c;
                                    try {
                                        x j4 = df0Var.j();
                                        if (j4 != null) {
                                            d21Var = new d21(a0.s(j4));
                                        } else {
                                            d21Var = null;
                                        }
                                        int i9 = i8.d;
                                        e21 e21Var = new e21(new c21(i9, i8.e, gx0.a(sVar3)));
                                        long j5 = d21Var.d;
                                        byte[] bArr12 = d21Var.j;
                                        e21Var.b = j5;
                                        e21Var.d = mi0.e(e(d21Var.f));
                                        e21Var.e = mi0.e(e(d21Var.g));
                                        e21Var.f = mi0.e(e(d21Var.h));
                                        e21Var.g = mi0.e(e(d21Var.i));
                                        if (d21Var.c != 0) {
                                            e21Var.c = d21Var.e;
                                        }
                                        if (e(bArr12) != null) {
                                            ob a3 = ((ob) mi0.o(e(bArr12), ob.class)).a(sVar3);
                                            if (a3.d == 0) {
                                                e21Var.h = new ob(a3, (1 << i9) - 1);
                                            } else {
                                                e21Var.h = a3;
                                            }
                                        }
                                        return new f21(e21Var);
                                    } catch (ClassNotFoundException e3) {
                                        c.l(e3.getMessage(), "ClassNotFoundException processing BDS state: ");
                                        return null;
                                    }
                                }
                                if (sVar.x(za.Y1)) {
                                    return new r90((q90) gx0.N.get(sVar), t.q(df0Var.j()).c);
                                }
                                if (sVar.x(za.d2)) {
                                    return new no0((mo0) gx0.P.get(sVar), t.q(df0Var.j()).c);
                                }
                                f40.f("algorithm identifier in private key not recognised");
                                return null;
                            }
                            ev i10 = ev.i(df0Var.j());
                            return new fv((dv) gx0.t.get(sVar), e(i10.d), e(i10.e), e(i10.f), i10.g.c);
                        }
                        ev i11 = ev.i(df0Var.j());
                        return new fv((dv) gx0.t.get(sVar), e(i11.d), e(i11.e), e(i11.f), i11.g.c);
                    }
                    x j6 = df0Var.j();
                    rq rqVar = (rq) gx0.z.get(sVar);
                    if (j6 instanceof a0) {
                        a0 s5 = a0.s(j6);
                        int t4 = o.q(s5.t(0)).t();
                        if (t4 == 0) {
                            if (eVar != null) {
                                return new sq(rqVar, e.s(s5.t(1)).t(), e.s(s5.t(2)).t(), e.s(s5.t(3)).t(), e.s(s5.t(4)).t(), e.s(s5.t(5)).t(), e.s(s5.t(6)).t(), e(ag0.a(rqVar, eVar).f));
                            }
                            return new sq(rqVar, e.s(s5.t(1)).t(), e.s(s5.t(2)).t(), e.s(s5.t(3)).t(), e.s(s5.t(4)).t(), e.s(s5.t(5)).t(), e.s(s5.t(6)).t(), null);
                        }
                        throw new IOException(qo0.m("unknown private key version: ", t4));
                    }
                    if (j6 instanceof km) {
                        byte[] bArr13 = t.q(j6).c;
                        if (eVar != null) {
                            return new sq(rqVar, bArr13, ag0.a(rqVar, eVar));
                        }
                        return new sq(rqVar, bArr13, null);
                    }
                    throw new IOException("not supported");
                }
                byte[] bArr14 = tVar3.c;
                t tVar7 = new t(bArr14);
                Object obj3 = tVar7;
                if (bArr14.length != 64) {
                    x c3 = gx0.c(bArr14);
                    if (c3 instanceof t) {
                        obj3 = t.q(c3);
                    } else {
                        obj3 = tVar7;
                        if (c3 instanceof a0) {
                            obj3 = a0.s(c3);
                        }
                    }
                }
                y70 y70Var = (y70) gx0.H.get(sVar);
                if (eVar != null) {
                    try {
                        x n2 = x.n(eVar.t());
                        if (n2 instanceof a0) {
                            a0 s6 = a0.s(n2);
                            b80Var = new b80(y70Var, t.q(s6.t(0)).c, t.q(s6.t(1)).c);
                        } else {
                            b80Var = new b80(y70Var, t.q(n2).c);
                        }
                    } catch (Exception unused) {
                        b80Var = new b80(y70Var, eVar.t());
                    }
                } else {
                    b80Var = null;
                }
                if (obj3 instanceof t) {
                    return new z70(y70Var, ((t) obj3).c, b80Var);
                }
                if (obj3 instanceof a0) {
                    a0 a0Var2 = (a0) obj3;
                    byte[] bArr15 = t.q(a0Var2.t(0)).c;
                    byte[] bArr16 = t.q(a0Var2.t(1)).c;
                    z70 z70Var = new z70(y70Var, bArr15, b80Var);
                    if (l(z70Var.getEncoded(), bArr16)) {
                        return z70Var;
                    }
                    c.k(qo0.s(new StringBuilder("inconsistent "), y70Var.a, " private key"));
                    return null;
                }
                c.k(qo0.s(new StringBuilder("invalid "), y70Var.a, " private key"));
                return null;
            }
            vk0 vk0Var = (vk0) gx0.p.get(sVar);
            x j7 = df0Var.j();
            if (j7 instanceof a0) {
                a0 s7 = a0.s(j7);
                ?? obj4 = new Object();
                int t5 = o.q(s7.t(0)).t();
                obj4.c = t5;
                if (t5 == 0) {
                    obj4.d = e(t.q(s7.t(1)).c);
                    obj4.e = e(t.q(s7.t(2)).c);
                    if (s7.size() == 4) {
                        i t6 = s7.t(3);
                        if (t6 instanceof uk0) {
                            uk0Var = (uk0) t6;
                        } else if (t6 != null) {
                            a0 s8 = a0.s(t6);
                            ?? obj5 = new Object();
                            obj5.c = e(t.q(s8.t(0)).c);
                            obj5.d = e(t.q(s8.t(1)).c);
                            uk0Var = obj5;
                        } else {
                            uk0Var = null;
                        }
                        obj4.f = uk0Var;
                    }
                    uk0 uk0Var2 = obj4.f;
                    return new wk0(vk0Var, e(obj4.d), e(obj4.e), e(uk0Var2.c), e(uk0Var2.d));
                }
                c.k("unrecognized version");
                return null;
            }
            return new wk0(vk0Var, t.q(j7).c);
        }
        c.k("keyInfo array null");
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
    
        if (r0 > 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        if (r4 > 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        if (r4 < 0) goto L19;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x001d. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int s(int r4, int r5) {
        /*
            java.math.RoundingMode r0 = java.math.RoundingMode.CEILING
            r0.getClass()
            if (r5 == 0) goto L4c
            int r1 = r4 / r5
            int r2 = r5 * r1
            int r2 = r4 - r2
            if (r2 != 0) goto L10
            goto L43
        L10:
            r4 = r4 ^ r5
            int r4 = r4 >> 31
            r4 = r4 | 1
            int[] r3 = defpackage.g20.a
            int r0 = r0.ordinal()
            r0 = r3[r0]
            switch(r0) {
                case 1: goto L41;
                case 2: goto L43;
                case 3: goto L3d;
                case 4: goto L3f;
                case 5: goto L3a;
                case 6: goto L26;
                case 7: goto L26;
                case 8: goto L26;
                default: goto L20;
            }
        L20:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            r4.<init>()
            throw r4
        L26:
            int r0 = java.lang.Math.abs(r2)
            int r5 = java.lang.Math.abs(r5)
            int r5 = r5 - r0
            int r0 = r0 - r5
            if (r0 != 0) goto L37
            java.math.RoundingMode r4 = java.math.RoundingMode.HALF_UP
            java.math.RoundingMode r4 = java.math.RoundingMode.HALF_EVEN
            goto L43
        L37:
            if (r0 <= 0) goto L43
            goto L3f
        L3a:
            if (r4 <= 0) goto L43
            goto L3f
        L3d:
            if (r4 >= 0) goto L43
        L3f:
            int r1 = r1 + r4
            return r1
        L41:
            if (r2 != 0) goto L44
        L43:
            return r1
        L44:
            java.lang.ArithmeticException r4 = new java.lang.ArithmeticException
            java.lang.String r5 = "mode was UNNECESSARY, but rounding was necessary"
            r4.<init>(r5)
            throw r4
        L4c:
            java.lang.ArithmeticException r4 = new java.lang.ArithmeticException
            java.lang.String r5 = "/ by zero"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f20.s(int, int):int");
    }

    public static boolean t(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj.equals(obj2)) {
            return true;
        }
        return false;
    }

    public static boolean u(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            if (Objects.equals(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments())) {
                return true;
            }
            return false;
        }
        if (type instanceof GenericArrayType) {
            if (!(type2 instanceof GenericArrayType)) {
                return false;
            }
            return u(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            if (Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds())) {
                return true;
            }
            return false;
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        if (Objects.equals(typeVariable.getGenericDeclaration(), typeVariable2.getGenericDeclaration()) && typeVariable.getName().equals(typeVariable2.getName())) {
            return true;
        }
        return false;
    }

    public static String v(String str, String str2, byte[] bArr) {
        Object obj;
        byte[] bArr2 = k20.t;
        byte[] bArr3 = k20.u;
        String str3 = "!";
        if (!Arrays.equals(bArr, bArr3) && !Arrays.equals(bArr, bArr2)) {
            obj = "!";
        } else {
            obj = ":";
        }
        if (str.length() <= 0) {
            if ("!".equals(obj)) {
                return str2.replace(":", "!");
            }
            if (":".equals(obj)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (!str2.contains("!") && !str2.contains(":")) {
                if (!str2.endsWith(".apk")) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    if (Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) {
                        str3 = ":";
                    }
                    return qo0.s(sb, str3, str2);
                }
            } else {
                if ("!".equals(obj)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(obj)) {
                    return str2.replace("!", ":");
                }
            }
        }
        return str2;
    }

    public static int w(Context context, int i2, int i3) {
        Integer num;
        int i4;
        TypedValue L = mn.L(context, i2);
        if (L != null) {
            int i5 = L.resourceId;
            if (i5 != 0) {
                i4 = context.getColor(i5);
            } else {
                i4 = L.data;
            }
            num = Integer.valueOf(i4);
        } else {
            num = null;
        }
        if (num != null) {
            return num.intValue();
        }
        return i3;
    }

    public static int x(View view, int i2) {
        Context context = view.getContext();
        TypedValue N = mn.N(i2, view.getContext(), view.getClass().getCanonicalName());
        int i3 = N.resourceId;
        if (i3 != 0) {
            return context.getColor(i3);
        }
        return N.data;
    }

    public static ColorStateList y(Drawable drawable) {
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT >= 29 && i1.r(drawable)) {
            return i1.b(i1.d(drawable));
        }
        return null;
    }

    public abstract void z(yn0 yn0Var, float f2, float f3);
}
