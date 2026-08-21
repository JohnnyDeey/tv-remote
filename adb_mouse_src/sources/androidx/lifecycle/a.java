package androidx.lifecycle;

import android.os.Looper;
import defpackage.co;
import defpackage.f40;
import defpackage.f8;
import defpackage.j50;
import defpackage.l50;
import defpackage.lv;
import defpackage.m50;
import defpackage.p50;
import defpackage.pl0;
import defpackage.qo0;
import defpackage.r50;
import defpackage.s50;
import defpackage.t50;
import defpackage.tz;
import defpackage.u50;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class a {
    public final WeakReference e;
    public int f;
    public boolean g;
    public boolean h;
    public final AtomicReference a = new AtomicReference();
    public final boolean b = true;
    public lv c = new lv();
    public m50 d = m50.d;
    public final ArrayList i = new ArrayList();

    public a(s50 s50Var) {
        this.e = new WeakReference(s50Var);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, t50] */
    public final void a(r50 r50Var) {
        p50 reflectiveGenericLifecycleObserver;
        Object obj;
        s50 s50Var;
        l50 l50Var;
        c("addObserver");
        m50 m50Var = this.d;
        m50 m50Var2 = m50.c;
        if (m50Var != m50Var2) {
            m50Var2 = m50.d;
        }
        ?? obj2 = new Object();
        HashMap hashMap = u50.a;
        boolean z = r50Var instanceof p50;
        boolean z2 = r50Var instanceof co;
        boolean z3 = false;
        if (z && z2) {
            reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter((co) r50Var, (p50) r50Var);
        } else if (z2) {
            reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter((co) r50Var, null);
        } else if (z) {
            reflectiveGenericLifecycleObserver = (p50) r50Var;
        } else {
            Class<?> cls = r50Var.getClass();
            if (u50.c(cls) == 2) {
                Object obj3 = u50.b.get(cls);
                obj3.getClass();
                List list = (List) obj3;
                if (list.size() != 1) {
                    int size = list.size();
                    tz[] tzVarArr = new tz[size];
                    if (size <= 0) {
                        reflectiveGenericLifecycleObserver = new CompositeGeneratedAdaptersObserver(tzVarArr);
                    } else {
                        u50.a((Constructor) list.get(0), r50Var);
                        throw null;
                    }
                } else {
                    u50.a((Constructor) list.get(0), r50Var);
                    throw null;
                }
            } else {
                reflectiveGenericLifecycleObserver = new ReflectiveGenericLifecycleObserver(r50Var);
            }
        }
        obj2.b = reflectiveGenericLifecycleObserver;
        obj2.a = m50Var2;
        lv lvVar = this.c;
        pl0 b = lvVar.b(r50Var);
        if (b != null) {
            obj = b.d;
        } else {
            HashMap hashMap2 = lvVar.g;
            pl0 pl0Var = new pl0(r50Var, obj2);
            lvVar.f++;
            pl0 pl0Var2 = lvVar.d;
            if (pl0Var2 == null) {
                lvVar.c = pl0Var;
                lvVar.d = pl0Var;
            } else {
                pl0Var2.e = pl0Var;
                pl0Var.f = pl0Var2;
                lvVar.d = pl0Var;
            }
            hashMap2.put(r50Var, pl0Var);
            obj = null;
        }
        if (((t50) obj) != null || (s50Var = (s50) this.e.get()) == null) {
            return;
        }
        if (this.f != 0 || this.g) {
            z3 = true;
        }
        m50 b2 = b(r50Var);
        this.f++;
        while (obj2.a.compareTo(b2) < 0 && this.c.g.containsKey(r50Var)) {
            m50 m50Var3 = obj2.a;
            ArrayList arrayList = this.i;
            arrayList.add(m50Var3);
            j50 j50Var = l50.Companion;
            m50 m50Var4 = obj2.a;
            j50Var.getClass();
            m50Var4.getClass();
            int ordinal = m50Var4.ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        l50Var = null;
                    } else {
                        l50Var = l50.ON_RESUME;
                    }
                } else {
                    l50Var = l50.ON_START;
                }
            } else {
                l50Var = l50.ON_CREATE;
            }
            if (l50Var != null) {
                obj2.a(s50Var, l50Var);
                arrayList.remove(arrayList.size() - 1);
                b2 = b(r50Var);
            } else {
                f40.e(obj2.a, "no event up from ");
                return;
            }
        }
        if (!z3) {
            g();
        }
        this.f--;
    }

    public final m50 b(r50 r50Var) {
        pl0 pl0Var;
        m50 m50Var;
        HashMap hashMap = this.c.g;
        m50 m50Var2 = null;
        if (hashMap.containsKey(r50Var)) {
            pl0Var = ((pl0) hashMap.get(r50Var)).f;
        } else {
            pl0Var = null;
        }
        if (pl0Var != null) {
            m50Var = ((t50) pl0Var.d).a;
        } else {
            m50Var = null;
        }
        ArrayList arrayList = this.i;
        if (!arrayList.isEmpty()) {
            m50Var2 = (m50) arrayList.get(arrayList.size() - 1);
        }
        m50 m50Var3 = this.d;
        m50Var3.getClass();
        if (m50Var == null || m50Var.compareTo(m50Var3) >= 0) {
            m50Var = m50Var3;
        }
        if (m50Var2 != null && m50Var2.compareTo(m50Var) < 0) {
            return m50Var2;
        }
        return m50Var;
    }

    public final void c(String str) {
        if (this.b) {
            ((f8) f8.x().a).getClass();
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            } else {
                throw new IllegalStateException(qo0.r("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    public final void d(l50 l50Var) {
        l50Var.getClass();
        c("handleLifecycleEvent");
        e(l50Var.a());
    }

    public final void e(m50 m50Var) {
        m50 m50Var2 = this.d;
        if (m50Var2 != m50Var) {
            m50 m50Var3 = m50.d;
            m50 m50Var4 = m50.c;
            if (m50Var2 == m50Var3 && m50Var == m50Var4) {
                StringBuilder sb = new StringBuilder("no event down from ");
                sb.append(this.d);
                Object obj = this.e.get();
                sb.append(" in component ");
                sb.append(obj);
                throw new IllegalStateException(sb.toString().toString());
            }
            this.d = m50Var;
            if (!this.g && this.f == 0) {
                this.g = true;
                g();
                this.g = false;
                if (this.d == m50Var4) {
                    this.c = new lv();
                    return;
                }
                return;
            }
            this.h = true;
        }
    }

    public final void f(r50 r50Var) {
        r50Var.getClass();
        c("removeObserver");
        this.c.c(r50Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        r11.h = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g() {
        /*
            Method dump skipped, instructions count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.a.g():void");
    }
}
