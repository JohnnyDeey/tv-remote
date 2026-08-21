package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class uf0 implements wc0 {
    public static final Charset f = Charset.forName("UTF-8");
    public static final qv g;
    public static final qv h;
    public static final v30 i;
    public OutputStream a;
    public final HashMap b;
    public final HashMap c;
    public final vc0 d;
    public final vf0 e = new vf0(this);

    static {
        v8 v8Var = new v8(1);
        HashMap hashMap = new HashMap();
        hashMap.put(tf0.class, v8Var);
        g = new qv("key", Collections.unmodifiableMap(new HashMap(hashMap)));
        v8 v8Var2 = new v8(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(tf0.class, v8Var2);
        h = new qv("value", Collections.unmodifiableMap(new HashMap(hashMap2)));
        i = new v30(1);
    }

    public uf0(ByteArrayOutputStream byteArrayOutputStream, HashMap hashMap, HashMap hashMap2, vc0 vc0Var) {
        this.a = byteArrayOutputStream;
        this.b = hashMap;
        this.c = hashMap2;
        this.d = vc0Var;
    }

    public static int g(qv qvVar) {
        tf0 tf0Var = (tf0) ((Annotation) qvVar.b.get(tf0.class));
        if (tf0Var != null) {
            return tf0Var.tag();
        }
        throw new RuntimeException("Field has no @Protobuf config");
    }

    @Override // defpackage.wc0
    public final wc0 a(qv qvVar, Object obj) {
        e(qvVar, obj, true);
        return this;
    }

    public final void b(qv qvVar, int i2, boolean z) {
        if (!z || i2 != 0) {
            tf0 tf0Var = (tf0) ((Annotation) qvVar.b.get(tf0.class));
            if (tf0Var != null) {
                int ordinal = tf0Var.intEncoding().ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            return;
                        }
                        h((tf0Var.tag() << 3) | 5);
                        this.a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(i2).array());
                        return;
                    }
                    h(tf0Var.tag() << 3);
                    h((i2 << 1) ^ (i2 >> 31));
                    return;
                }
                h(tf0Var.tag() << 3);
                h(i2);
                return;
            }
            throw new RuntimeException("Field has no @Protobuf config");
        }
    }

    public final void c(qv qvVar, long j, boolean z) {
        if (!z || j != 0) {
            tf0 tf0Var = (tf0) ((Annotation) qvVar.b.get(tf0.class));
            if (tf0Var != null) {
                int ordinal = tf0Var.intEncoding().ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            return;
                        }
                        h((tf0Var.tag() << 3) | 1);
                        this.a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(j).array());
                        return;
                    }
                    h(tf0Var.tag() << 3);
                    i((j >> 63) ^ (j << 1));
                    return;
                }
                h(tf0Var.tag() << 3);
                i(j);
                return;
            }
            throw new RuntimeException("Field has no @Protobuf config");
        }
    }

    @Override // defpackage.wc0
    public final wc0 d(qv qvVar, long j) {
        c(qvVar, j, true);
        return this;
    }

    public final void e(qv qvVar, Object obj, boolean z) {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z || charSequence.length() != 0) {
                    h((g(qvVar) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(f);
                    h(bytes.length);
                    this.a.write(bytes);
                    return;
                }
                return;
            }
            if (obj instanceof Collection) {
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    e(qvVar, it.next(), false);
                }
                return;
            }
            if (obj instanceof Map) {
                Iterator it2 = ((Map) obj).entrySet().iterator();
                while (it2.hasNext()) {
                    f(i, qvVar, (Map.Entry) it2.next(), false);
                }
                return;
            }
            if (obj instanceof Double) {
                double doubleValue = ((Double) obj).doubleValue();
                if (!z || doubleValue != 0.0d) {
                    h((g(qvVar) << 3) | 1);
                    this.a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(doubleValue).array());
                    return;
                }
                return;
            }
            if (obj instanceof Float) {
                float floatValue = ((Float) obj).floatValue();
                if (!z || floatValue != 0.0f) {
                    h((g(qvVar) << 3) | 5);
                    this.a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(floatValue).array());
                    return;
                }
                return;
            }
            if (obj instanceof Number) {
                c(qvVar, ((Number) obj).longValue(), z);
                return;
            }
            if (obj instanceof Boolean) {
                b(qvVar, ((Boolean) obj).booleanValue() ? 1 : 0, z);
                return;
            }
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                if (z && bArr.length == 0) {
                    return;
                }
                h((g(qvVar) << 3) | 2);
                h(bArr.length);
                this.a.write(bArr);
                return;
            }
            vc0 vc0Var = (vc0) this.b.get(obj.getClass());
            if (vc0Var != null) {
                f(vc0Var, qvVar, obj, z);
                return;
            }
            kx0 kx0Var = (kx0) this.c.get(obj.getClass());
            if (kx0Var != null) {
                vf0 vf0Var = this.e;
                vf0Var.a = false;
                vf0Var.c = qvVar;
                vf0Var.b = z;
                kx0Var.a(obj, vf0Var);
                return;
            }
            if (obj instanceof l70) {
                b(qvVar, ((l70) obj).c, true);
            } else if (obj instanceof Enum) {
                b(qvVar, ((Enum) obj).ordinal(), true);
            } else {
                f(this.d, qvVar, obj, z);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.io.OutputStream, i50] */
    public final void f(vc0 vc0Var, qv qvVar, Object obj, boolean z) {
        ?? outputStream = new OutputStream();
        outputStream.c = 0L;
        try {
            OutputStream outputStream2 = this.a;
            this.a = outputStream;
            try {
                vc0Var.a(obj, this);
                this.a = outputStream2;
                long j = outputStream.c;
                outputStream.close();
                if (z && j == 0) {
                    return;
                }
                h((g(qvVar) << 3) | 2);
                i(j);
                vc0Var.a(obj, this);
            } catch (Throwable th) {
                this.a = outputStream2;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                outputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void h(int i2) {
        while (true) {
            long j = i2 & (-128);
            OutputStream outputStream = this.a;
            if (j != 0) {
                outputStream.write((i2 & 127) | 128);
                i2 >>>= 7;
            } else {
                outputStream.write(i2 & 127);
                return;
            }
        }
    }

    public final void i(long j) {
        while (true) {
            long j2 = (-128) & j;
            OutputStream outputStream = this.a;
            if (j2 != 0) {
                outputStream.write((((int) j) & 127) | 128);
                j >>>= 7;
            } else {
                outputStream.write(((int) j) & 127);
                return;
            }
        }
    }
}
