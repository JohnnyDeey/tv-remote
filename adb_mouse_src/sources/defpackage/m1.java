package defpackage;

import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class m1 {
    public static final m1 e;
    public static final m1 f;
    public static final m1 g;
    public static final m1 h;
    public static final m1 i;
    public static final m1 j;
    public static final m1 k;
    public static final m1 l;
    public final Object a;
    public final int b;
    public final Class c;
    public final c2 d;

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0257, code lost:
    
        if (r0 >= 3600001) goto L67;
     */
    static {
        /*
            Method dump skipped, instructions count: 620
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m1.<clinit>():void");
    }

    public m1(Object obj, int i2, CharSequence charSequence, c2 c2Var, Class cls) {
        this.b = i2;
        this.d = c2Var;
        if (obj == null) {
            this.a = new AccessibilityNodeInfo.AccessibilityAction(i2, charSequence);
        } else {
            this.a = obj;
        }
        this.c = cls;
    }

    public final int a() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.a).getId();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof m1)) {
            return false;
        }
        Object obj2 = ((m1) obj).a;
        Object obj3 = this.a;
        if (obj3 == null) {
            if (obj2 != null) {
                return false;
            }
            return true;
        }
        if (!obj3.equals(obj2)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String d = s1.d(this.b);
        if (d.equals("ACTION_UNKNOWN")) {
            Object obj = this.a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                d = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb.append(d);
        return sb.toString();
    }

    public m1(int i2, Class cls) {
        this(null, i2, null, null, cls);
    }

    public m1(String str, int i2) {
        this(null, i2, str, null, null);
    }
}
