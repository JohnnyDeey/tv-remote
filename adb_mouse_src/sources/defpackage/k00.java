package defpackage;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class k00 {
    public static final ax h = ax.d;
    public static final int i = 1;
    public static final int j = 1;
    public static final int k = 2;
    public final ThreadLocal a;
    public final ConcurrentHashMap b;
    public final g00 c;
    public final t30 d;
    public final List e;
    public final boolean f;
    public final ax g;

    public k00() {
        xc0 xc0Var;
        kc0 kc0Var;
        tu tuVar = tu.e;
        Map map = Collections.EMPTY_MAP;
        List list = Collections.EMPTY_LIST;
        this.a = new ThreadLocal();
        this.b = new ConcurrentHashMap();
        g00 g00Var = new g00(7);
        this.c = g00Var;
        int i2 = 1;
        this.f = true;
        this.g = h;
        ArrayList arrayList = new ArrayList();
        arrayList.add(vv0.z);
        int i3 = j;
        if (i3 == 1) {
            xc0Var = yc0.b;
        } else {
            xc0Var = new xc0(i3);
        }
        arrayList.add(xc0Var);
        arrayList.add(tuVar);
        arrayList.addAll(list);
        arrayList.add(vv0.p);
        arrayList.add(vv0.g);
        arrayList.add(vv0.d);
        arrayList.add(vv0.e);
        arrayList.add(vv0.f);
        tu0 tu0Var = vv0.k;
        arrayList.add(new nv0(Long.TYPE, Long.class, tu0Var));
        arrayList.add(new nv0(Double.TYPE, Double.class, new lc0(i2)));
        arrayList.add(new nv0(Float.TYPE, Float.class, new lc0(2)));
        int i4 = 0;
        if (k == 2) {
            kc0Var = lc0.b;
        } else {
            kc0Var = new kc0(new lc0(i4), i4);
        }
        arrayList.add(kc0Var);
        arrayList.add(vv0.h);
        arrayList.add(vv0.i);
        arrayList.add(new lv0(AtomicLong.class, new i00(tu0Var, 0).a(), i4));
        arrayList.add(new lv0(AtomicLongArray.class, new i00(tu0Var, 1).a(), i4));
        arrayList.add(vv0.j);
        arrayList.add(vv0.l);
        arrayList.add(vv0.q);
        arrayList.add(vv0.r);
        arrayList.add(new lv0(BigDecimal.class, vv0.m, i4));
        arrayList.add(new lv0(BigInteger.class, vv0.n, i4));
        arrayList.add(new lv0(d50.class, vv0.o, i4));
        arrayList.add(vv0.s);
        arrayList.add(vv0.t);
        arrayList.add(vv0.v);
        arrayList.add(vv0.w);
        arrayList.add(vv0.y);
        arrayList.add(vv0.u);
        arrayList.add(vv0.b);
        arrayList.add(pn.b);
        arrayList.add(vv0.x);
        if (ep0.a) {
            arrayList.add(ep0.c);
            arrayList.add(ep0.b);
            arrayList.add(ep0.d);
        }
        arrayList.add(r8.b);
        arrayList.add(vv0.a);
        arrayList.add(new fi(g00Var, i4));
        arrayList.add(new fi(g00Var, i2));
        t30 t30Var = new t30(g00Var);
        this.d = t30Var;
        arrayList.add(t30Var);
        arrayList.add(vv0.A);
        arrayList.add(new xi0(g00Var, i, tuVar, t30Var));
        this.e = Collections.unmodifiableList(arrayList);
    }

    public static void a(double d) {
        if (!Double.isNaN(d) && !Double.isInfinite(d)) {
            return;
        }
        throw new IllegalArgumentException(d + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
    }

    public final pu0 b(xv0 xv0Var) {
        boolean z;
        ConcurrentHashMap concurrentHashMap = this.b;
        pu0 pu0Var = (pu0) concurrentHashMap.get(xv0Var);
        if (pu0Var != null) {
            return pu0Var;
        }
        ThreadLocal threadLocal = this.a;
        Map map = (Map) threadLocal.get();
        if (map == null) {
            map = new HashMap();
            threadLocal.set(map);
            z = true;
        } else {
            pu0 pu0Var2 = (pu0) map.get(xv0Var);
            if (pu0Var2 != null) {
                return pu0Var2;
            }
            z = false;
        }
        try {
            j00 j00Var = new j00();
            map.put(xv0Var, j00Var);
            Iterator it = this.e.iterator();
            pu0 pu0Var3 = null;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                pu0Var3 = ((qu0) it.next()).a(this, xv0Var);
                if (pu0Var3 != null) {
                    if (j00Var.a == null) {
                        j00Var.a = pu0Var3;
                        map.put(xv0Var, pu0Var3);
                    } else {
                        throw new AssertionError("Delegate is already set");
                    }
                }
            }
            if (z) {
                threadLocal.remove();
            }
            if (pu0Var3 != null) {
                if (z) {
                    concurrentHashMap.putAll(map);
                }
                return pu0Var3;
            }
            c.r(xv0Var, "GSON (2.13.2) cannot handle ");
            return null;
        } catch (Throwable th) {
            if (z) {
                threadLocal.remove();
            }
            throw th;
        }
    }

    public final String c(Object obj) {
        Class<?> cls = obj.getClass();
        StringBuilder sb = new StringBuilder();
        try {
            g40 g40Var = new g40(new p70(sb));
            g40Var.k(this.g);
            g40Var.k = this.f;
            g40Var.l(2);
            g40Var.m = false;
            d(obj, cls, g40Var);
            return sb.toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public final void d(Object obj, Class cls, g40 g40Var) {
        pu0 b = b(new xv0(cls));
        int i2 = g40Var.j;
        if (i2 == 2) {
            g40Var.j = 1;
        }
        boolean z = g40Var.k;
        boolean z2 = g40Var.m;
        g40Var.k = this.f;
        g40Var.m = false;
        try {
            try {
                b.b(g40Var, obj);
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (AssertionError e2) {
                throw new AssertionError("AssertionError (GSON 2.13.2): " + e2.getMessage(), e2);
            }
        } finally {
            g40Var.l(i2);
            g40Var.k = z;
            g40Var.m = z2;
        }
    }

    public final String toString() {
        return "{serializeNulls:false,factories:" + this.e + ",instanceCreators:" + this.c + "}";
    }
}
