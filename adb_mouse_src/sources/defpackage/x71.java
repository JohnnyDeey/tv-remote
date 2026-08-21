package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public abstract class x71 extends h71 {
    private static final Map zzb = new ConcurrentHashMap();
    protected x81 zzc;
    private int zzd;

    public x71() {
        this.zza = 0;
        this.zzd = -1;
        this.zzc = x81.f;
    }

    public static void f(Class cls, x71 x71Var) {
        x71Var.e();
        zzb.put(cls, x71Var);
    }

    public static final boolean i(x71 x71Var, boolean z) {
        byte byteValue = ((Byte) x71Var.j(1)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean h = r81.c.a(x71Var.getClass()).h(x71Var);
        if (z) {
            x71Var.j(2);
        }
        return h;
    }

    public static x71 m(Class cls) {
        Map map = zzb;
        x71 x71Var = (x71) map.get(cls);
        if (x71Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                x71Var = (x71) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (x71Var == null) {
            x71 x71Var2 = (x71) ((x71) c91.g(cls)).j(6);
            if (x71Var2 != null) {
                map.put(cls, x71Var2);
                return x71Var2;
            }
            throw new IllegalStateException();
        }
        return x71Var;
    }

    public static Object o(Method method, x71 x71Var, Object... objArr) {
        try {
            return method.invoke(x71Var, objArr);
        } catch (IllegalAccessException e) {
            f40.k("Couldn't use Java reflection to implement protocol message reflection.", e);
            return null;
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (!(cause instanceof Error)) {
                    f40.k("Unexpected exception thrown by generated accessor method.", cause);
                    return null;
                }
                throw ((Error) cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [sb0, java.lang.Object] */
    @Override // defpackage.h71
    public final void a(p71 p71Var) {
        u81 a = r81.c.a(getClass());
        sb0 sb0Var = p71Var.a;
        sb0 sb0Var2 = sb0Var;
        if (sb0Var == null) {
            ?? obj = new Object();
            Charset charset = d81.a;
            obj.c = p71Var;
            p71Var.a = obj;
            sb0Var2 = obj;
        }
        a.i(this, sb0Var2);
    }

    @Override // defpackage.h71
    public final int c(u81 u81Var) {
        if (h()) {
            int g = u81Var.g(this);
            if (g >= 0) {
                return g;
            }
            c.o(qo0.m("serialized size must be non-negative, was ", g));
            return 0;
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i == Integer.MAX_VALUE) {
            int g2 = u81Var.g(this);
            if (g2 >= 0) {
                this.zzd = (this.zzd & Integer.MIN_VALUE) | g2;
                return g2;
            }
            c.o(qo0.m("serialized size must be non-negative, was ", g2));
            return 0;
        }
        return i;
    }

    @Override // defpackage.h71
    public final int d() {
        if (h()) {
            int g = r81.c.a(getClass()).g(this);
            if (g >= 0) {
                return g;
            }
            c.o(qo0.m("serialized size must be non-negative, was ", g));
            return 0;
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int g2 = r81.c.a(getClass()).g(this);
        if (g2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | g2;
            return g2;
        }
        c.o(qo0.m("serialized size must be non-negative, was ", g2));
        return 0;
    }

    public final void e() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return r81.c.a(getClass()).f(this, (x71) obj);
    }

    public final void g() {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final boolean h() {
        if ((this.zzd & Integer.MIN_VALUE) != 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (!h()) {
            int i = this.zza;
            if (i == 0) {
                int d = r81.c.a(getClass()).d(this);
                this.zza = d;
                return d;
            }
            return i;
        }
        return r81.c.a(getClass()).d(this);
    }

    public abstract Object j(int i);

    public final w71 k() {
        return (w71) j(5);
    }

    public final w71 l() {
        w71 w71Var = (w71) j(5);
        if (!w71Var.c.equals(this)) {
            if (!w71Var.d.h()) {
                x71 n = w71Var.c.n();
                r81.c.a(n.getClass()).b(n, w71Var.d);
                w71Var.d = n;
            }
            x71 x71Var = w71Var.d;
            r81.c.a(x71Var.getClass()).b(x71Var, this);
        }
        return w71Var;
    }

    public final x71 n() {
        return (x71) j(4);
    }

    public final void p() {
        r81.c.a(getClass()).a(this);
        e();
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = n81.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        n81.c(this, sb, 0);
        return sb.toString();
    }
}
