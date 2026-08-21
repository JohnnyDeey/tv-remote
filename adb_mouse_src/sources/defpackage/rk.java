package defpackage;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public abstract class rk implements qk, nl, Serializable {
    public final qk c;
    public final dl d;
    public transient qk e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public rk(defpackage.qk r2) {
        /*
            r1 = this;
            if (r2 == 0) goto L7
            dl r0 = r2.d()
            goto L8
        L7:
            r0 = 0
        L8:
            r1.<init>(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rk.<init>(qk):void");
    }

    public nl c() {
        qk qkVar = this.c;
        if (qkVar instanceof nl) {
            return (nl) qkVar;
        }
        return null;
    }

    @Override // defpackage.qk
    public dl d() {
        dl dlVar = this.d;
        dlVar.getClass();
        return dlVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.qk
    public final void e(Object obj) {
        while (true) {
            rk rkVar = this;
            qk qkVar = rkVar.c;
            qkVar.getClass();
            try {
                obj = rkVar.l(obj);
                if (obj == ml.c) {
                    return;
                }
            } catch (Throwable th) {
                obj = new sj0(th);
            }
            rkVar.m();
            if (qkVar instanceof rk) {
                this = qkVar;
            } else {
                qkVar.e(obj);
                return;
            }
        }
    }

    public qk j(qk qkVar, Object obj) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public StackTraceElement k() {
        int i;
        String str;
        Method method;
        Object invoke;
        Method method2;
        Object invoke2;
        Object obj;
        Integer num;
        int i2;
        ln lnVar = (ln) getClass().getAnnotation(ln.class);
        String str2 = null;
        if (lnVar == null) {
            return null;
        }
        int v = lnVar.v();
        if (v <= 1) {
            int i3 = -1;
            try {
                Field declaredField = getClass().getDeclaredField("label");
                declaredField.setAccessible(true);
                Object obj2 = declaredField.get(this);
                if (obj2 instanceof Integer) {
                    num = (Integer) obj2;
                } else {
                    num = null;
                }
                if (num != null) {
                    i2 = num.intValue();
                } else {
                    i2 = 0;
                }
                i = i2 - 1;
            } catch (Exception unused) {
                i = -1;
            }
            if (i >= 0) {
                i3 = lnVar.l()[i];
            }
            b8 b8Var = mn.e;
            b8 b8Var2 = mn.f;
            if (b8Var2 == null) {
                try {
                    b8 b8Var3 = new b8(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null), 16);
                    mn.f = b8Var3;
                    b8Var2 = b8Var3;
                } catch (Exception unused2) {
                    mn.f = b8Var;
                    b8Var2 = b8Var;
                }
            }
            if (b8Var2 != b8Var && (method = (Method) b8Var2.d) != null && (invoke = method.invoke(getClass(), null)) != null && (method2 = (Method) b8Var2.e) != null && (invoke2 = method2.invoke(invoke, null)) != null) {
                Method method3 = (Method) b8Var2.f;
                if (method3 != null) {
                    obj = method3.invoke(invoke2, null);
                } else {
                    obj = null;
                }
                if (obj instanceof String) {
                    str2 = (String) obj;
                }
            }
            if (str2 == null) {
                str = lnVar.c();
            } else {
                str = str2 + '/' + lnVar.c();
            }
            return new StackTraceElement(str, lnVar.m(), lnVar.f(), i3);
        }
        throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + v + ". Please update the Kotlin standard library.").toString());
    }

    public abstract Object l(Object obj);

    public void m() {
        ff ffVar;
        qk qkVar = this.e;
        if (qkVar != null && qkVar != this) {
            bl h = d().h(g00.e);
            h.getClass();
            vq vqVar = (vq) qkVar;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = vq.j;
            do {
            } while (atomicReferenceFieldUpdater.get(vqVar) == mn.c);
            Object obj = atomicReferenceFieldUpdater.get(vqVar);
            if (obj instanceof ff) {
                ffVar = (ff) obj;
            } else {
                ffVar = null;
            }
            if (ffVar != null) {
                ffVar.p();
            }
        }
        this.e = ti.d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object k = k();
        if (k == null) {
            k = getClass().getName();
        }
        sb.append(k);
        return sb.toString();
    }

    public rk(qk qkVar, dl dlVar) {
        this.c = qkVar;
        this.d = dlVar;
    }
}
