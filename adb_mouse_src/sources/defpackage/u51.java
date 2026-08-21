package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class u51 implements Map, Serializable {
    public static final u51 i = new u51(null, new Object[0], 0);
    public transient r51 c;
    public transient s51 d;
    public transient t51 e;
    public final transient Object f;
    public final transient Object[] g;
    public final transient int h;

    public u51(Object obj, Object[] objArr, int i2) {
        this.f = obj;
        this.g = objArr;
        this.h = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01be  */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.u51 a(int r19, java.lang.Object[] r20, defpackage.c0 r21) {
        /*
            Method dump skipped, instructions count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u51.a(int, java.lang.Object[], c0):u51");
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        t51 t51Var = this.e;
        if (t51Var == null) {
            t51Var = new t51(this.g, 1, this.h);
            this.e = t51Var;
        }
        return t51Var.contains(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        r51 r51Var = this.c;
        if (r51Var == null) {
            r51 r51Var2 = new r51(this, this.g, this.h);
            this.c = r51Var2;
            return r51Var2;
        }
        return r51Var;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        return entrySet().equals(((Map) obj).entrySet());
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x009f A[RETURN] */
    @Override // java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object get(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 0
            if (r9 != 0) goto L6
        L3:
            r8 = r0
            goto L9c
        L6:
            r1 = 1
            int r2 = r8.h
            java.lang.Object[] r3 = r8.g
            if (r2 != r1) goto L20
            r8 = 0
            r8 = r3[r8]
            java.util.Objects.requireNonNull(r8)
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L3
            r8 = r3[r1]
            java.util.Objects.requireNonNull(r8)
            goto L9c
        L20:
            java.lang.Object r8 = r8.f
            if (r8 != 0) goto L25
            goto L3
        L25:
            boolean r2 = r8 instanceof byte[]
            r4 = -1
            if (r2 == 0) goto L51
            r2 = r8
            byte[] r2 = (byte[]) r2
            int r8 = r2.length
            int r5 = r8 + (-1)
            int r8 = r9.hashCode()
            int r8 = defpackage.mi0.T(r8)
        L38:
            r8 = r8 & r5
            r4 = r2[r8]
            r6 = 255(0xff, float:3.57E-43)
            r4 = r4 & r6
            if (r4 != r6) goto L41
            goto L3
        L41:
            r6 = r3[r4]
            boolean r6 = r9.equals(r6)
            if (r6 == 0) goto L4e
            r8 = r4 ^ 1
            r8 = r3[r8]
            goto L9c
        L4e:
            int r8 = r8 + 1
            goto L38
        L51:
            boolean r2 = r8 instanceof short[]
            if (r2 == 0) goto L7d
            r2 = r8
            short[] r2 = (short[]) r2
            int r8 = r2.length
            int r5 = r8 + (-1)
            int r8 = r9.hashCode()
            int r8 = defpackage.mi0.T(r8)
        L63:
            r8 = r8 & r5
            short r4 = r2[r8]
            char r4 = (char) r4
            r6 = 65535(0xffff, float:9.1834E-41)
            if (r4 != r6) goto L6d
            goto L3
        L6d:
            r6 = r3[r4]
            boolean r6 = r9.equals(r6)
            if (r6 == 0) goto L7a
            r8 = r4 ^ 1
            r8 = r3[r8]
            goto L9c
        L7a:
            int r8 = r8 + 1
            goto L63
        L7d:
            int[] r8 = (int[]) r8
            int r2 = r8.length
            int r2 = r2 + r4
            int r5 = r9.hashCode()
            int r5 = defpackage.mi0.T(r5)
        L89:
            r5 = r5 & r2
            r6 = r8[r5]
            if (r6 != r4) goto L90
            goto L3
        L90:
            r7 = r3[r6]
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto La0
            r8 = r6 ^ 1
            r8 = r3[r8]
        L9c:
            if (r8 != 0) goto L9f
            return r0
        L9f:
            return r8
        La0:
            int r5 = r5 + 1
            goto L89
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u51.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        if (obj3 != null) {
            return obj3;
        }
        return obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        int i2;
        r51 r51Var = this.c;
        if (r51Var == null) {
            r51Var = new r51(this, this.g, this.h);
            this.c = r51Var;
        }
        int i3 = 0;
        for (Object obj : r51Var) {
            if (obj != null) {
                i2 = obj.hashCode();
            } else {
                i2 = 0;
            }
            i3 += i2;
        }
        return i3;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final Set keySet() {
        s51 s51Var = this.d;
        if (s51Var == null) {
            s51 s51Var2 = new s51(this, new t51(this.g, 0, this.h));
            this.d = s51Var2;
            return s51Var2;
        }
        return s51Var;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final int size() {
        return this.h;
    }

    public final String toString() {
        int i2 = this.h;
        if (i2 >= 0) {
            StringBuilder sb = new StringBuilder((int) Math.min(i2 * 8, 1073741824L));
            sb.append('{');
            Iterator it = ((r51) entrySet()).iterator();
            boolean z = true;
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (!z) {
                    sb.append(", ");
                }
                sb.append(entry.getKey());
                sb.append('=');
                sb.append(entry.getValue());
                z = false;
            }
            sb.append('}');
            return sb.toString();
        }
        c.k(qo0.m("size cannot be negative but was: ", i2));
        return null;
    }

    @Override // java.util.Map
    public final Collection values() {
        t51 t51Var = this.e;
        if (t51Var == null) {
            t51 t51Var2 = new t51(this.g, 1, this.h);
            this.e = t51Var2;
            return t51Var2;
        }
        return t51Var;
    }
}
