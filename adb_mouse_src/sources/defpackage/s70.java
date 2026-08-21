package defpackage;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public class s70 {
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public final Object f;
    public final Object g;

    public s70(int i) {
        this.a = 0;
        this.b = i;
        if (i > 0) {
            this.f = new i81(26);
            this.g = new Object();
        } else {
            c.k("maxSize <= 0");
            throw null;
        }
    }

    public static int k(c0 c0Var, int i, int i2, byte[] bArr, int i3) {
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            int i6 = i5 + 3;
            if (i6 > i3) {
                break;
            }
            short s = (short) (bArr[i5] & 255);
            short s2 = (short) (bArr[i5 + 1] & 255);
            short s3 = (short) ((s | (s2 << 8)) & 4095);
            short s4 = (short) (((((short) (bArr[i5 + 2] & 255)) << 4) | (s2 >> 4)) & 4095);
            if (s3 < 3329) {
                ((short[]) c0Var.e)[i + i4] = s3;
                i4++;
            }
            if (i4 < i2 && s4 < 3329) {
                ((short[]) c0Var.e)[i + i4] = s4;
                i4++;
            }
            i5 = i6;
        }
        return i4;
    }

    public void a() {
        View view = (View) ((ArrayList) this.f).get(r0.size() - 1);
        hp0 hp0Var = (hp0) view.getLayoutParams();
        this.c = ((StaggeredGridLayoutManager) this.g).r.b(view);
        hp0Var.getClass();
    }

    public void b() {
        ((ArrayList) this.f).clear();
        this.b = Integer.MIN_VALUE;
        this.c = Integer.MIN_VALUE;
        this.d = 0;
    }

    public int c() {
        boolean z = ((StaggeredGridLayoutManager) this.g).w;
        ArrayList arrayList = (ArrayList) this.f;
        if (z) {
            return e(arrayList.size() - 1, -1);
        }
        return e(0, arrayList.size());
    }

    public int d() {
        boolean z = ((StaggeredGridLayoutManager) this.g).w;
        ArrayList arrayList = (ArrayList) this.f;
        if (z) {
            return e(0, arrayList.size());
        }
        return e(arrayList.size() - 1, -1);
    }

    public int e(int i, int i2) {
        int i3;
        boolean z;
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.g;
        int k = staggeredGridLayoutManager.r.k();
        int g = staggeredGridLayoutManager.r.g();
        if (i2 > i) {
            i3 = 1;
        } else {
            i3 = -1;
        }
        while (i != i2) {
            View view = (View) ((ArrayList) this.f).get(i);
            int e = staggeredGridLayoutManager.r.e(view);
            int b = staggeredGridLayoutManager.r.b(view);
            boolean z2 = false;
            if (e <= g) {
                z = true;
            } else {
                z = false;
            }
            if (b >= k) {
                z2 = true;
            }
            if (z && z2 && (e < k || b > g)) {
                return oh0.H(view);
            }
            i += i3;
        }
        return -1;
    }

    public Object f(Object obj) {
        synchronized (((os) this.g)) {
            i81 i81Var = (i81) this.f;
            i81Var.getClass();
            Object obj2 = ((LinkedHashMap) i81Var.d).get(obj);
            if (obj2 != null) {
                this.d++;
                return obj2;
            }
            this.e++;
            return null;
        }
    }

    public int g(int i) {
        int i2 = this.c;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (((ArrayList) this.f).size() == 0) {
            return i;
        }
        a();
        return this.c;
    }

    public View h(int i, int i2) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.g;
        ArrayList arrayList = (ArrayList) this.f;
        View view = null;
        if (i2 == -1) {
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                View view2 = (View) arrayList.get(i3);
                if ((staggeredGridLayoutManager.w && oh0.H(view2) <= i) || ((!staggeredGridLayoutManager.w && oh0.H(view2) >= i) || !view2.hasFocusable())) {
                    break;
                }
                i3++;
                view = view2;
            }
            return view;
        }
        int size2 = arrayList.size() - 1;
        while (size2 >= 0) {
            View view3 = (View) arrayList.get(size2);
            if ((staggeredGridLayoutManager.w && oh0.H(view3) >= i) || ((!staggeredGridLayoutManager.w && oh0.H(view3) <= i) || !view3.hasFocusable())) {
                break;
            }
            size2--;
            view = view3;
        }
        return view;
    }

    public int i(int i) {
        ArrayList arrayList = (ArrayList) this.f;
        int i2 = this.b;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (arrayList.size() == 0) {
            return i;
        }
        View view = (View) arrayList.get(0);
        hp0 hp0Var = (hp0) view.getLayoutParams();
        this.b = ((StaggeredGridLayoutManager) this.g).r.e(view);
        hp0Var.getClass();
        return this.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b6, code lost:
    
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object j(java.lang.Object r5, java.lang.Object r6) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.g
            os r0 = (defpackage.os) r0
            monitor-enter(r0)
            int r1 = r4.c     // Catch: java.lang.Throwable -> L20
            int r1 = r1 + 1
            r4.c = r1     // Catch: java.lang.Throwable -> L20
            java.lang.Object r1 = r4.f     // Catch: java.lang.Throwable -> L20
            i81 r1 = (defpackage.i81) r1     // Catch: java.lang.Throwable -> L20
            java.lang.Object r1 = r1.d     // Catch: java.lang.Throwable -> L20
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1     // Catch: java.lang.Throwable -> L20
            java.lang.Object r5 = r1.put(r5, r6)     // Catch: java.lang.Throwable -> L20
            if (r5 == 0) goto L23
            int r6 = r4.c     // Catch: java.lang.Throwable -> L20
            int r6 = r6 + (-1)
            r4.c = r6     // Catch: java.lang.Throwable -> L20
            goto L23
        L20:
            r4 = move-exception
            goto Lc1
        L23:
            monitor-exit(r0)
            int r6 = r4.b
        L26:
            java.lang.Object r0 = r4.g
            os r0 = (defpackage.os) r0
            monitor-enter(r0)
            int r1 = r4.c     // Catch: java.lang.Throwable -> L42
            if (r1 < 0) goto Lb7
            java.lang.Object r1 = r4.f     // Catch: java.lang.Throwable -> L42
            i81 r1 = (defpackage.i81) r1     // Catch: java.lang.Throwable -> L42
            java.lang.Object r1 = r1.d     // Catch: java.lang.Throwable -> L42
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1     // Catch: java.lang.Throwable -> L42
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L42
            if (r1 == 0) goto L45
            int r1 = r4.c     // Catch: java.lang.Throwable -> L42
            if (r1 != 0) goto Lb7
            goto L45
        L42:
            r4 = move-exception
            goto Lbf
        L45:
            int r1 = r4.c     // Catch: java.lang.Throwable -> L42
            if (r1 <= r6) goto Lb5
            java.lang.Object r1 = r4.f     // Catch: java.lang.Throwable -> L42
            i81 r1 = (defpackage.i81) r1     // Catch: java.lang.Throwable -> L42
            java.lang.Object r1 = r1.d     // Catch: java.lang.Throwable -> L42
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1     // Catch: java.lang.Throwable -> L42
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L42
            if (r1 == 0) goto L58
            goto Lb5
        L58:
            java.lang.Object r1 = r4.f     // Catch: java.lang.Throwable -> L42
            i81 r1 = (defpackage.i81) r1     // Catch: java.lang.Throwable -> L42
            java.lang.Object r1 = r1.d     // Catch: java.lang.Throwable -> L42
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1     // Catch: java.lang.Throwable -> L42
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L42
            r1.getClass()     // Catch: java.lang.Throwable -> L42
            boolean r2 = r1 instanceof java.util.List     // Catch: java.lang.Throwable -> L42
            r3 = 0
            if (r2 == 0) goto L7b
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L42
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> L42
            if (r2 == 0) goto L75
            goto L8a
        L75:
            r2 = 0
            java.lang.Object r3 = r1.get(r2)     // Catch: java.lang.Throwable -> L42
            goto L8a
        L7b:
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L42
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L42
            if (r2 != 0) goto L86
            goto L8a
        L86:
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L42
        L8a:
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Throwable -> L42
            if (r3 != 0) goto L90
            monitor-exit(r0)
            return r5
        L90:
            java.lang.Object r1 = r3.getKey()     // Catch: java.lang.Throwable -> L42
            java.lang.Object r2 = r3.getValue()     // Catch: java.lang.Throwable -> L42
            java.lang.Object r3 = r4.f     // Catch: java.lang.Throwable -> L42
            i81 r3 = (defpackage.i81) r3     // Catch: java.lang.Throwable -> L42
            r3.getClass()     // Catch: java.lang.Throwable -> L42
            r1.getClass()     // Catch: java.lang.Throwable -> L42
            java.lang.Object r3 = r3.d     // Catch: java.lang.Throwable -> L42
            java.util.LinkedHashMap r3 = (java.util.LinkedHashMap) r3     // Catch: java.lang.Throwable -> L42
            r3.remove(r1)     // Catch: java.lang.Throwable -> L42
            int r1 = r4.c     // Catch: java.lang.Throwable -> L42
            r2.getClass()     // Catch: java.lang.Throwable -> L42
            int r1 = r1 + (-1)
            r4.c = r1     // Catch: java.lang.Throwable -> L42
            monitor-exit(r0)
            goto L26
        Lb5:
            monitor-exit(r0)
            return r5
        Lb7:
            java.lang.String r4 = "LruCache.sizeOf() is reporting inconsistent results!"
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L42
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L42
            throw r5     // Catch: java.lang.Throwable -> L42
        Lbf:
            monitor-exit(r0)
            throw r4
        Lc1:
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s70.j(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public String toString() {
        int i;
        String str;
        switch (this.a) {
            case 0:
                synchronized (((os) this.g)) {
                    try {
                        int i2 = this.d;
                        int i3 = this.e + i2;
                        if (i3 != 0) {
                            i = (i2 * 100) / i3;
                        } else {
                            i = 0;
                        }
                        str = "LruCache[maxSize=" + this.b + ",hits=" + this.d + ",misses=" + this.e + ",hitRate=" + i + "%]";
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str;
            default:
                return super.toString();
        }
    }

    public s70(rj rjVar) {
        this.a = 1;
        this.f = rjVar;
        this.b = rjVar.a;
        this.c = rjVar.f;
        this.d = rjVar.b;
        l3 l3Var = (l3) rjVar.h;
        this.g = l3Var;
        l3Var.getClass();
        this.e = 3;
    }

    public s70(StaggeredGridLayoutManager staggeredGridLayoutManager, int i) {
        this.a = 2;
        this.g = staggeredGridLayoutManager;
        this.f = new ArrayList();
        this.b = Integer.MIN_VALUE;
        this.c = Integer.MIN_VALUE;
        this.d = 0;
        this.e = i;
    }
}
