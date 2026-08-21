package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class bw0 extends mi0 {
    public static final Class d;
    public static final Constructor e;
    public static final Method f;
    public static final Method g;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            Class cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi24Impl", e2.getClass().getName(), e2);
            cls = null;
            method = null;
            method2 = null;
        }
        e = constructor;
        d = cls;
        f = method2;
        g = method;
    }

    public static boolean k0(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) f.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface l0(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) d, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) g.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // defpackage.mi0
    public final Typeface h(Context context, vw vwVar, Resources resources, int i) {
        Object obj;
        MappedByteBuffer mappedByteBuffer;
        FileInputStream fileInputStream;
        try {
            obj = e.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            for (ww wwVar : vwVar.a) {
                int i2 = wwVar.f;
                File i3 = oi0.i(context);
                if (i3 != null) {
                    try {
                        if (oi0.c(i3, resources, i2)) {
                            try {
                                fileInputStream = new FileInputStream(i3);
                            } catch (IOException unused2) {
                                mappedByteBuffer = null;
                            }
                            try {
                                FileChannel channel = fileInputStream.getChannel();
                                mappedByteBuffer = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                fileInputStream.close();
                                if (mappedByteBuffer != null && k0(obj, mappedByteBuffer, wwVar.e, wwVar.b, wwVar.c)) {
                                }
                            } finally {
                                break;
                            }
                        }
                    } finally {
                        i3.delete();
                    }
                }
                mappedByteBuffer = null;
                if (mappedByteBuffer != null) {
                }
            }
            return l0(obj);
        }
        return null;
    }

    @Override // defpackage.mi0
    public final Typeface i(Context context, yw[] ywVarArr, int i) {
        Object obj;
        try {
            obj = e.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            int i2 = 0;
            io0 io0Var = new io0(0);
            int length = ywVarArr.length;
            while (true) {
                if (i2 < length) {
                    yw ywVar = ywVarArr[i2];
                    Uri uri = ywVar.a;
                    ByteBuffer byteBuffer = (ByteBuffer) io0Var.get(uri);
                    if (byteBuffer == null) {
                        byteBuffer = oi0.o(context, uri);
                        io0Var.put(uri, byteBuffer);
                    }
                    if (byteBuffer == null || !k0(obj, byteBuffer, ywVar.b, ywVar.c, ywVar.d)) {
                        break;
                    }
                    i2++;
                } else {
                    Typeface l0 = l0(obj);
                    if (l0 != null) {
                        return Typeface.create(l0, i);
                    }
                }
            }
        }
        return null;
    }
}
