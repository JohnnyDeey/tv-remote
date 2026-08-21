package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.text.PositionedGlyphs;
import android.graphics.text.TextRunShaper;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public abstract class zv0 {
    public static final mi0 a;
    public static final s70 b;
    public static Paint c;

    static {
        wg0.a("TypefaceCompat static init");
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            a = new mi0();
        } else if (i >= 29) {
            a = new mi0();
        } else if (i >= 28) {
            a = new cw0();
        } else if (i >= 26) {
            a = new cw0();
        } else {
            Method method = bw0.f;
            if (method == null) {
                Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
            }
            if (method != null) {
                a = new mi0();
            } else {
                a = new mi0();
            }
        }
        b = new s70(16);
        c = null;
        Trace.endSection();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v11, types: [sb0, java.lang.Object] */
    public static Typeface a(Context context, uw uwVar, Resources resources, int i, String str, int i2, int i3, wg0 wg0Var, boolean z) {
        Typeface h;
        Typeface build;
        Font.Builder fontVariationSettings;
        Font build2;
        FontFamily build3;
        Handler handler;
        int i4 = -3;
        if (uwVar instanceof xw) {
            xw xwVar = (xw) uwVar;
            String str2 = xwVar.d;
            h = null;
            int i5 = 1;
            boolean z2 = false;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            if (TextUtils.isEmpty(str2) || (build = c(str2)) == null) {
                ArrayList arrayList = xwVar.a;
                if (arrayList.size() == 1) {
                    build = c(((nw) arrayList.get(0)).e);
                } else {
                    if (Build.VERSION.SDK_INT >= 31) {
                        int i6 = 0;
                        while (true) {
                            if (i6 >= arrayList.size()) {
                                Typeface.CustomFallbackBuilder customFallbackBuilder = null;
                                int i7 = 0;
                                while (true) {
                                    if (i7 >= arrayList.size()) {
                                        break;
                                    }
                                    nw nwVar = (nw) arrayList.get(i7);
                                    if (i7 == arrayList.size() - 1 && TextUtils.isEmpty(nwVar.f)) {
                                        customFallbackBuilder.setSystemFallback(nwVar.e);
                                        break;
                                    }
                                    String str3 = nwVar.e;
                                    String str4 = nwVar.f;
                                    Font d = d(c(str3));
                                    if (d == null) {
                                        Log.w("TypefaceCompat", "Unable identify the primary font for " + nwVar.e + ". Falling back to provider font.");
                                        break;
                                    }
                                    if (TextUtils.isEmpty(str4)) {
                                        build3 = i1.u(d).build();
                                    } else {
                                        try {
                                            i1.l();
                                            i1.w();
                                            fontVariationSettings = wd.g(d).setFontVariationSettings(str4);
                                            build2 = fontVariationSettings.build();
                                            build3 = i1.h(build2).build();
                                        } catch (IOException unused) {
                                            Log.e("TypefaceCompat", "Failed to clone Font instance. Fall back to provider font.");
                                        }
                                    }
                                    if (customFallbackBuilder != null) {
                                        customFallbackBuilder.addCustomFallback(build3);
                                    } else {
                                        customFallbackBuilder = i1.c(build3);
                                    }
                                    i7++;
                                }
                                build = customFallbackBuilder.build();
                            } else {
                                if (c(((nw) arrayList.get(i6)).e) == null) {
                                    break;
                                }
                                i6++;
                            }
                        }
                    }
                    build = null;
                }
            }
            if (build != null) {
                if (wg0Var != null) {
                    new Handler(Looper.getMainLooper()).post(new p5(wg0Var, 2, build));
                }
                b.j(b(resources, i, str, i2, i3), build);
                return build;
            }
            Object[] objArr3 = !z ? wg0Var != null : xwVar.c != 0;
            int i8 = z ? xwVar.b : -1;
            Handler handler2 = new Handler(Looper.getMainLooper());
            ?? obj = new Object();
            obj.c = wg0Var;
            ArrayList arrayList2 = xwVar.a;
            fj0 fj0Var = new fj0(0, handler2);
            r6 r6Var = new r6(obj, fj0Var, 9, z2);
            int i9 = 5;
            if (objArr3 != false) {
                if (arrayList2.size() <= 1) {
                    nw nwVar2 = (nw) arrayList2.get(0);
                    s70 s70Var = tw.a;
                    ArrayList arrayList3 = new ArrayList(1);
                    Object obj2 = new Object[]{nwVar2}[0];
                    Objects.requireNonNull(obj2);
                    arrayList3.add(obj2);
                    String a2 = tw.a(i3, Collections.unmodifiableList(arrayList3));
                    Typeface typeface = (Typeface) tw.a.f(a2);
                    if (typeface != null) {
                        fj0Var.execute(new m61((Object) obj, i9, typeface));
                        h = typeface;
                    } else if (i8 == -1) {
                        Object[] objArr4 = {nwVar2};
                        ArrayList arrayList4 = new ArrayList(1);
                        Object obj3 = objArr4[0];
                        Objects.requireNonNull(obj3);
                        arrayList4.add(obj3);
                        sw b2 = tw.b(a2, context, Collections.unmodifiableList(arrayList4), i3);
                        r6Var.J(b2);
                        h = b2.a;
                    } else {
                        try {
                            try {
                                try {
                                    sw swVar = (sw) tw.b.submit(new qw(a2, context, nwVar2, i3, 0)).get(i8, TimeUnit.MILLISECONDS);
                                    r6Var.J(swVar);
                                    h = swVar.a;
                                } catch (InterruptedException e) {
                                    throw e;
                                }
                            } catch (ExecutionException e2) {
                                throw new RuntimeException(e2);
                            } catch (TimeoutException unused2) {
                                throw new InterruptedException("timeout");
                            }
                        } catch (InterruptedException unused3) {
                            ((fj0) r6Var.e).execute(new af(i4, (int) (objArr2 == true ? 1 : 0), r6Var.d));
                        }
                    }
                } else {
                    c.k("Fallbacks with blocking fetches are not supported for performance reasons");
                    return null;
                }
            } else {
                String a3 = tw.a(i3, arrayList2);
                Typeface typeface2 = (Typeface) tw.a.f(a3);
                if (typeface2 != null) {
                    fj0Var.execute(new m61((Object) obj, i9, typeface2));
                    h = typeface2;
                } else {
                    rw rwVar = new rw(objArr == true ? 1 : 0, r6Var);
                    synchronized (tw.c) {
                        try {
                            io0 io0Var = tw.d;
                            ArrayList arrayList5 = (ArrayList) io0Var.get(a3);
                            if (arrayList5 != null) {
                                arrayList5.add(rwVar);
                            } else {
                                ArrayList arrayList6 = new ArrayList();
                                arrayList6.add(rwVar);
                                io0Var.put(a3, arrayList6);
                                qw qwVar = new qw(a3, context, arrayList2, i3, 1);
                                ThreadPoolExecutor threadPoolExecutor = tw.b;
                                rw rwVar2 = new rw(i5, a3);
                                if (Looper.myLooper() == null) {
                                    handler = new Handler(Looper.getMainLooper());
                                } else {
                                    handler = new Handler();
                                }
                                gj0 gj0Var = new gj0();
                                gj0Var.d = qwVar;
                                gj0Var.e = rwVar2;
                                gj0Var.f = handler;
                                threadPoolExecutor.execute(gj0Var);
                            }
                        } finally {
                        }
                    }
                }
            }
        } else {
            h = a.h(context, (vw) uwVar, resources, i3);
            if (wg0Var != null) {
                if (h != null) {
                    new Handler(Looper.getMainLooper()).post(new p5(wg0Var, 2, h));
                } else {
                    wg0Var.b(-3);
                }
            }
        }
        if (h != null) {
            b.j(b(resources, i, str, i2, i3), h);
        }
        return h;
    }

    public static String b(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }

    public static Typeface c(String str) {
        if (str != null && !str.isEmpty()) {
            Typeface create = Typeface.create(str, 0);
            Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
            if (create != null && !create.equals(create2)) {
                return create;
            }
        }
        return null;
    }

    public static Font d(Typeface typeface) {
        PositionedGlyphs shapeTextRun;
        int glyphCount;
        Font font;
        if (c == null) {
            c = new Paint();
        }
        c.setTextSize(10.0f);
        c.setTypeface(typeface);
        shapeTextRun = TextRunShaper.shapeTextRun((CharSequence) " ", 0, 1, 0, 1, 0.0f, 0.0f, false, c);
        glyphCount = shapeTextRun.glyphCount();
        if (glyphCount != 0) {
            font = shapeTextRun.getFont(0);
            return font;
        }
        return null;
    }
}
