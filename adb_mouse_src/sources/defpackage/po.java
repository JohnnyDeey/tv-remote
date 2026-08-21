package defpackage;

import java.util.Hashtable;
import java.util.Vector;

/* loaded from: classes.dex */
public abstract class po {
    public final rd a;
    public js0 b;
    public xf0[] c;
    public int[] d;
    public Vector e;
    public Vector f;

    public po(rd rdVar) {
        this.a = rdVar;
    }

    public static void a(Hashtable hashtable, Integer num) {
        byte[] r = ht0.r(hashtable, num);
        if (r != null) {
            int intValue = num.intValue();
            if (intValue != 10) {
                if (intValue == 11) {
                    if (!f20.n(ht0.m(r), (short) 0)) {
                        throw new us0((short) 47, null, null);
                    }
                    return;
                }
                throw new us0((short) 47, null, null);
            }
            hi0.n(r);
        }
    }

    public abstract l3 b();

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, qo] */
    public final qo c() {
        Vector vector = qo.c;
        ?? obj = new Object();
        obj.a = new Vector(vector);
        obj.b = 2048;
        return obj;
    }

    public abstract int[] d();

    public abstract xf0[] e();

    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x0041. Please report as an issue. */
    public final void g(Hashtable hashtable) {
        if (hashtable != null) {
            im0 c = this.b.c();
            if (ht0.A(c.H)) {
                return;
            }
            a(hashtable, 13);
            a(hashtable, 50);
            a(hashtable, 10);
            int s = ht0.s(c.d);
            if (s != 24 && s != 26) {
                switch (s) {
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                        break;
                    default:
                        a(hashtable, 11);
                        a(hashtable, 21);
                }
            }
            byte[] r = ht0.r(hashtable, 11);
            if (r != null && !f20.n(ht0.m(r), (short) 0)) {
                throw new us0((short) 47, null, null);
            }
            a(hashtable, 21);
        }
    }

    public void f() {
    }
}
