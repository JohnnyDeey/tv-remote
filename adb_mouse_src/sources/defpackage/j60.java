package defpackage;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Set;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class j60 extends AbstractMap implements Serializable {
    public static final yk k = new yk(2);
    public final boolean d;
    public i60 e;
    public final i60 h;
    public h60 i;
    public h60 j;
    public int f = 0;
    public int g = 0;
    public final Comparator c = k;

    public j60(boolean z) {
        this.d = z;
        this.h = new i60(z);
    }

    public final i60 a(Object obj, boolean z) {
        int i;
        i60 i60Var;
        Comparable comparable;
        i60 i60Var2;
        i60 i60Var3 = this.e;
        yk ykVar = k;
        Comparator comparator = this.c;
        if (i60Var3 != null) {
            if (comparator == ykVar) {
                comparable = (Comparable) obj;
            } else {
                comparable = null;
            }
            while (true) {
                Object obj2 = i60Var3.h;
                if (comparable != null) {
                    i = comparable.compareTo(obj2);
                } else {
                    i = comparator.compare(obj, obj2);
                }
                if (i == 0) {
                    return i60Var3;
                }
                if (i < 0) {
                    i60Var2 = i60Var3.d;
                } else {
                    i60Var2 = i60Var3.e;
                }
                if (i60Var2 == null) {
                    break;
                }
                i60Var3 = i60Var2;
            }
        } else {
            i = 0;
        }
        i60 i60Var4 = i60Var3;
        if (!z) {
            return null;
        }
        i60 i60Var5 = this.h;
        if (i60Var4 == null) {
            if (comparator == ykVar && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            i60Var = new i60(this.d, i60Var4, obj, i60Var5, i60Var5.g);
            this.e = i60Var;
        } else {
            i60Var = new i60(this.d, i60Var4, obj, i60Var5, i60Var5.g);
            if (i < 0) {
                i60Var4.d = i60Var;
            } else {
                i60Var4.e = i60Var;
            }
            b(i60Var4, true);
        }
        this.f++;
        this.g++;
        return i60Var;
    }

    public final void b(i60 i60Var, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        while (i60Var != null) {
            i60 i60Var2 = i60Var.d;
            i60 i60Var3 = i60Var.e;
            int i5 = 0;
            if (i60Var2 != null) {
                i = i60Var2.k;
            } else {
                i = 0;
            }
            if (i60Var3 != null) {
                i2 = i60Var3.k;
            } else {
                i2 = 0;
            }
            int i6 = i - i2;
            if (i6 == -2) {
                i60 i60Var4 = i60Var3.d;
                i60 i60Var5 = i60Var3.e;
                if (i60Var5 != null) {
                    i4 = i60Var5.k;
                } else {
                    i4 = 0;
                }
                if (i60Var4 != null) {
                    i5 = i60Var4.k;
                }
                int i7 = i5 - i4;
                if (i7 != -1 && (i7 != 0 || z)) {
                    f(i60Var3);
                    e(i60Var);
                } else {
                    e(i60Var);
                }
                if (z) {
                    return;
                }
            } else if (i6 == 2) {
                i60 i60Var6 = i60Var2.d;
                i60 i60Var7 = i60Var2.e;
                if (i60Var7 != null) {
                    i3 = i60Var7.k;
                } else {
                    i3 = 0;
                }
                if (i60Var6 != null) {
                    i5 = i60Var6.k;
                }
                int i8 = i5 - i3;
                if (i8 != 1 && (i8 != 0 || z)) {
                    e(i60Var2);
                    f(i60Var);
                } else {
                    f(i60Var);
                }
                if (z) {
                    return;
                }
            } else if (i6 == 0) {
                i60Var.k = i + 1;
                if (z) {
                    return;
                }
            } else {
                i60Var.k = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            i60Var = i60Var.c;
        }
    }

    public final void c(i60 i60Var, boolean z) {
        i60 i60Var2;
        i60 i60Var3;
        int i;
        if (z) {
            i60 i60Var4 = i60Var.g;
            i60Var4.f = i60Var.f;
            i60Var.f.g = i60Var4;
        }
        i60 i60Var5 = i60Var.d;
        i60 i60Var6 = i60Var.e;
        i60 i60Var7 = i60Var.c;
        int i2 = 0;
        if (i60Var5 != null && i60Var6 != null) {
            if (i60Var5.k > i60Var6.k) {
                i60 i60Var8 = i60Var5.e;
                while (true) {
                    i60 i60Var9 = i60Var8;
                    i60Var3 = i60Var5;
                    i60Var5 = i60Var9;
                    if (i60Var5 == null) {
                        break;
                    } else {
                        i60Var8 = i60Var5.e;
                    }
                }
            } else {
                i60 i60Var10 = i60Var6.d;
                while (true) {
                    i60Var2 = i60Var6;
                    i60Var6 = i60Var10;
                    if (i60Var6 == null) {
                        break;
                    } else {
                        i60Var10 = i60Var6.d;
                    }
                }
                i60Var3 = i60Var2;
            }
            c(i60Var3, false);
            i60 i60Var11 = i60Var.d;
            if (i60Var11 != null) {
                i = i60Var11.k;
                i60Var3.d = i60Var11;
                i60Var11.c = i60Var3;
                i60Var.d = null;
            } else {
                i = 0;
            }
            i60 i60Var12 = i60Var.e;
            if (i60Var12 != null) {
                i2 = i60Var12.k;
                i60Var3.e = i60Var12;
                i60Var12.c = i60Var3;
                i60Var.e = null;
            }
            i60Var3.k = Math.max(i, i2) + 1;
            d(i60Var, i60Var3);
            return;
        }
        if (i60Var5 != null) {
            d(i60Var, i60Var5);
            i60Var.d = null;
        } else if (i60Var6 != null) {
            d(i60Var, i60Var6);
            i60Var.e = null;
        } else {
            d(i60Var, null);
        }
        b(i60Var7, false);
        this.f--;
        this.g++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.e = null;
        this.f = 0;
        this.g++;
        i60 i60Var = this.h;
        i60Var.g = i60Var;
        i60Var.f = i60Var;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        i60 i60Var = null;
        if (obj != null) {
            try {
                i60Var = a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        if (i60Var == null) {
            return false;
        }
        return true;
    }

    public final void d(i60 i60Var, i60 i60Var2) {
        i60 i60Var3 = i60Var.c;
        i60Var.c = null;
        if (i60Var2 != null) {
            i60Var2.c = i60Var3;
        }
        if (i60Var3 != null) {
            if (i60Var3.d == i60Var) {
                i60Var3.d = i60Var2;
                return;
            } else {
                i60Var3.e = i60Var2;
                return;
            }
        }
        this.e = i60Var2;
    }

    public final void e(i60 i60Var) {
        int i;
        int i2;
        i60 i60Var2 = i60Var.d;
        i60 i60Var3 = i60Var.e;
        i60 i60Var4 = i60Var3.d;
        i60 i60Var5 = i60Var3.e;
        i60Var.e = i60Var4;
        if (i60Var4 != null) {
            i60Var4.c = i60Var;
        }
        d(i60Var, i60Var3);
        i60Var3.d = i60Var;
        i60Var.c = i60Var3;
        int i3 = 0;
        if (i60Var2 != null) {
            i = i60Var2.k;
        } else {
            i = 0;
        }
        if (i60Var4 != null) {
            i2 = i60Var4.k;
        } else {
            i2 = 0;
        }
        int max = Math.max(i, i2) + 1;
        i60Var.k = max;
        if (i60Var5 != null) {
            i3 = i60Var5.k;
        }
        i60Var3.k = Math.max(max, i3) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        h60 h60Var = this.i;
        if (h60Var == null) {
            h60 h60Var2 = new h60(this, 0);
            this.i = h60Var2;
            return h60Var2;
        }
        return h60Var;
    }

    public final void f(i60 i60Var) {
        int i;
        int i2;
        i60 i60Var2 = i60Var.d;
        i60 i60Var3 = i60Var.e;
        i60 i60Var4 = i60Var2.d;
        i60 i60Var5 = i60Var2.e;
        i60Var.d = i60Var5;
        if (i60Var5 != null) {
            i60Var5.c = i60Var;
        }
        d(i60Var, i60Var2);
        i60Var2.e = i60Var;
        i60Var.c = i60Var2;
        int i3 = 0;
        if (i60Var3 != null) {
            i = i60Var3.k;
        } else {
            i = 0;
        }
        if (i60Var5 != null) {
            i2 = i60Var5.k;
        } else {
            i2 = 0;
        }
        int max = Math.max(i, i2) + 1;
        i60Var.k = max;
        if (i60Var4 != null) {
            i3 = i60Var4.k;
        }
        i60Var2.k = Math.max(max, i3) + 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x000f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object get(java.lang.Object r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L9
            r1 = 0
            i60 r2 = r2.a(r3, r1)     // Catch: java.lang.ClassCastException -> L9
            goto La
        L9:
            r2 = r0
        La:
            if (r2 == 0) goto Lf
            java.lang.Object r2 = r2.j
            return r2
        Lf:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j60.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        h60 h60Var = this.j;
        if (h60Var == null) {
            h60 h60Var2 = new h60(this, 1);
            this.j = h60Var2;
            return h60Var2;
        }
        return h60Var;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj != null) {
            if (obj2 == null && !this.d) {
                c.g("value == null");
                return null;
            }
            i60 a = a(obj, true);
            Object obj3 = a.j;
            a.j = obj2;
            return obj3;
        }
        c.g("key == null");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0015 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0012  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object remove(java.lang.Object r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L9
            r1 = 0
            i60 r3 = r2.a(r3, r1)     // Catch: java.lang.ClassCastException -> L9
            goto La
        L9:
            r3 = r0
        La:
            if (r3 == 0) goto L10
            r1 = 1
            r2.c(r3, r1)
        L10:
            if (r3 == 0) goto L15
            java.lang.Object r2 = r3.j
            return r2
        L15:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j60.remove(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f;
    }
}
