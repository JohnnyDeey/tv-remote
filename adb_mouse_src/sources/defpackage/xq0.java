package defpackage;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public abstract class xq0 {
    public int a;
    public int b;
    public int c;
    public Object d;

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, vj0] */
    public xq0() {
        if (vj0.g == null) {
            vj0.g = new Object();
        }
    }

    public int a(int i) {
        if (i < this.c) {
            return ((ByteBuffer) this.d).getShort(this.b + i);
        }
        return 0;
    }

    public abstract Object b(View view);

    public abstract void c(View view, Object obj);

    public void d(View view, Object obj) {
        Object tag;
        if (Build.VERSION.SDK_INT >= this.b) {
            c(view, obj);
            return;
        }
        f1 f1Var = null;
        if (Build.VERSION.SDK_INT >= this.b) {
            tag = b(view);
        } else {
            tag = view.getTag(this.a);
            if (!((Class) this.d).isInstance(tag)) {
                tag = null;
            }
        }
        if (e(tag, obj)) {
            View.AccessibilityDelegate d = ry0.d(view);
            if (d != null) {
                if (d instanceof e1) {
                    f1Var = ((e1) d).a;
                } else {
                    f1Var = new f1(d);
                }
            }
            if (f1Var == null) {
                f1Var = new f1();
            }
            ry0.m(view, f1Var);
            view.setTag(this.a, obj);
            ry0.h(view, this.c);
        }
    }

    public abstract boolean e(Object obj, Object obj2);
}
