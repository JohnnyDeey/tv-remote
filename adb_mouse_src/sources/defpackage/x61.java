package defpackage;

import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class x61 extends e61 implements u61 {
    public u61 j;
    public ScheduledFuture k;

    public static Object d(Object obj) {
        if (!(obj instanceof v51)) {
            if (!(obj instanceof y51)) {
                if (obj == e61.f) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((y51) obj).a);
        }
        Throwable th = ((v51) obj).b;
        CancellationException cancellationException = new CancellationException("Task was cancelled.");
        cancellationException.initCause(th);
        throw cancellationException;
    }

    public static boolean f(Object obj) {
        if (!(obj instanceof w51)) {
            return true;
        }
        return false;
    }

    public static Object g(u61 u61Var) {
        Object obj;
        Throwable c;
        if (u61Var instanceof x61) {
            Object obj2 = ((x61) u61Var).c;
            if (obj2 instanceof v51) {
                v51 v51Var = (v51) obj2;
                if (v51Var.a) {
                    Throwable th = v51Var.b;
                    obj2 = th != null ? new v51(th, false) : v51.d;
                }
            }
            Objects.requireNonNull(obj2);
            return obj2;
        }
        if ((u61Var instanceof e61) && (c = ((e61) u61Var).c()) != null) {
            return new y51(c);
        }
        boolean isCancelled = u61Var.isCancelled();
        boolean z = true;
        if ((!e61.h) & isCancelled) {
            v51 v51Var2 = v51.d;
            Objects.requireNonNull(v51Var2);
            return v51Var2;
        }
        boolean z2 = false;
        while (true) {
            try {
                try {
                    try {
                        obj = u61Var.get();
                        break;
                    } catch (Error e) {
                        e = e;
                        return new y51(e);
                    }
                } catch (InterruptedException unused) {
                    z2 = z;
                } catch (Throwable th2) {
                    if (z2) {
                        Thread.currentThread().interrupt();
                    }
                    throw th2;
                }
            } catch (Error | Exception e2) {
                e = e2;
                return new y51(e);
            } catch (CancellationException e3) {
                if (!isCancelled) {
                    return new y51(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(u61Var)), e3));
                }
                return new v51(e3, false);
            } catch (ExecutionException e4) {
                if (isCancelled) {
                    return new v51(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(u61Var)), e4), false);
                }
                return new y51(e4.getCause());
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        if (isCancelled) {
            return new v51(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(u61Var))), false);
        }
        if (obj == null) {
            return e61.f;
        }
        return obj;
    }

    public static void i(x61 x61Var) {
        boolean z;
        z51 z51Var;
        z51 z51Var2 = null;
        while (true) {
            x61Var.getClass();
            for (d61 E = e61.i.E(x61Var); E != null; E = E.b) {
                Thread thread = E.a;
                if (thread != null) {
                    E.a = null;
                    LockSupport.unpark(thread);
                }
            }
            u61 u61Var = x61Var.j;
            boolean z2 = x61Var.c instanceof v51;
            boolean z3 = true;
            if (u61Var != null) {
                z = true;
            } else {
                z = false;
            }
            if (z2 & z) {
                Object obj = x61Var.c;
                if (!(obj instanceof v51) || !((v51) obj).a) {
                    z3 = false;
                }
                u61Var.cancel(z3);
            }
            ScheduledFuture scheduledFuture = x61Var.k;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            x61Var.j = null;
            x61Var.k = null;
            z51 z51Var3 = z51Var2;
            z51 C = e61.i.C(x61Var);
            z51 z51Var4 = z51Var3;
            while (C != null) {
                z51 z51Var5 = C.c;
                C.c = z51Var4;
                z51Var4 = C;
                C = z51Var5;
            }
            while (z51Var4 != null) {
                Runnable runnable = z51Var4.a;
                z51Var = z51Var4.c;
                Objects.requireNonNull(runnable);
                if (runnable instanceof w51) {
                    w51 w51Var = (w51) runnable;
                    x61Var = w51Var.c;
                    if (x61Var.c == w51Var) {
                        if (e61.i.L(x61Var, w51Var, g(w51Var.d))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = z51Var4.b;
                    Objects.requireNonNull(executor);
                    j(runnable, executor);
                }
                z51Var4 = z51Var;
            }
            return;
            z51Var2 = z51Var;
        }
    }

    public static void j(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            e61.g.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", "RuntimeException while executing runnable " + String.valueOf(runnable) + " with executor " + String.valueOf(executor), (Throwable) e);
        }
    }

    @Override // defpackage.u61
    public final void a(Runnable runnable, Executor executor) {
        z51 z51Var;
        z51 z51Var2 = z51.d;
        if (executor != null) {
            if (!isDone() && (z51Var = this.d) != z51Var2) {
                z51 z51Var3 = new z51(runnable, executor);
                do {
                    z51Var3.c = z51Var;
                    if (!e61.i.J(this, z51Var, z51Var3)) {
                        z51Var = this.d;
                    } else {
                        return;
                    }
                } while (z51Var != z51Var2);
            }
            j(runnable, executor);
            return;
        }
        c.g("Executor was null.");
    }

    @Override // defpackage.e61
    public final Throwable c() {
        if (this instanceof x61) {
            Object obj = this.c;
            if (obj instanceof y51) {
                return ((y51) obj).a;
            }
            return null;
        }
        return null;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean z2;
        v51 v51Var;
        boolean z3;
        Object obj = this.c;
        boolean z4 = obj instanceof w51;
        if (obj == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!(z4 | z2)) {
            return false;
        }
        if (e61.h) {
            v51Var = new v51(new CancellationException("Future.cancel() was called."), z);
        } else {
            if (z) {
                v51Var = v51.c;
            } else {
                v51Var = v51.d;
            }
            Objects.requireNonNull(v51Var);
        }
        boolean z5 = false;
        while (true) {
            if (e61.i.L(this, obj, v51Var)) {
                i(this);
                if (!(obj instanceof w51)) {
                    break;
                }
                u61 u61Var = ((w51) obj).d;
                if (u61Var instanceof x61) {
                    this = (x61) u61Var;
                    obj = this.c;
                    if (obj == null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!z3 && !(obj instanceof w51)) {
                        break;
                    }
                    z5 = true;
                } else {
                    u61Var.cancel(z);
                    break;
                }
            } else {
                obj = this.c;
                if (f(obj)) {
                    return z5;
                }
            }
        }
        return true;
    }

    public final String e() {
        u61 u61Var = this.j;
        ScheduledFuture scheduledFuture = this.k;
        if (u61Var != null) {
            String r = qo0.r("inputFuture=[", u61Var.toString(), "]");
            if (scheduledFuture != null) {
                long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
                if (delay > 0) {
                    return r + ", remaining delay=[" + delay + " ms]";
                }
            }
            return r;
        }
        return null;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        boolean z;
        long j2;
        long j3;
        boolean z2;
        boolean z3;
        boolean z4;
        d61 d61Var = d61.c;
        long nanos = timeUnit.toNanos(j);
        if (!Thread.interrupted()) {
            Object obj = this.c;
            if (obj != null) {
                z = true;
            } else {
                z = false;
            }
            if (z & f(obj)) {
                return d(obj);
            }
            long j4 = 0;
            if (nanos > 0) {
                j2 = System.nanoTime() + nanos;
            } else {
                j2 = 0;
            }
            if (nanos >= 1000) {
                d61 d61Var2 = this.e;
                if (d61Var2 != d61Var) {
                    d61 d61Var3 = new d61();
                    while (true) {
                        wg0 wg0Var = e61.i;
                        wg0Var.G(d61Var3, d61Var2);
                        if (wg0Var.M(this, d61Var2, d61Var3)) {
                            j3 = j4;
                            do {
                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.c;
                                    if (obj2 != null) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    if (z4 & f(obj2)) {
                                        return d(obj2);
                                    }
                                    nanos = j2 - System.nanoTime();
                                } else {
                                    b(d61Var3);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            b(d61Var3);
                        } else {
                            long j5 = j4;
                            d61Var2 = this.e;
                            if (d61Var2 == d61Var) {
                                break;
                            }
                            j4 = j5;
                        }
                    }
                }
                Object obj3 = this.c;
                Objects.requireNonNull(obj3);
                return d(obj3);
            }
            j3 = 0;
            while (nanos > j3) {
                Object obj4 = this.c;
                if (obj4 != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3 & f(obj4)) {
                    return d(obj4);
                }
                if (!Thread.interrupted()) {
                    nanos = j2 - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String x61Var = toString();
            String obj5 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = obj5.toLowerCase(locale);
            String str = "Waited " + j + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < j3) {
                String concat = str.concat(" (plus ");
                long j6 = -nanos;
                long convert = timeUnit.convert(j6, TimeUnit.NANOSECONDS);
                long nanos2 = j6 - timeUnit.toNanos(convert);
                if (convert == j3 || nanos2 > 1000) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (convert > j3) {
                    String str2 = concat + convert + " " + lowerCase;
                    if (z2) {
                        str2 = str2.concat(",");
                    }
                    concat = str2.concat(" ");
                }
                if (z2) {
                    concat = concat + nanos2 + " nanoseconds ";
                }
                str = concat.concat("delay)");
            }
            if (!isDone()) {
                f40.c(str, x61Var);
                return null;
            }
            throw new TimeoutException(str.concat(" but future completed as timeout expired"));
        }
        throw new InterruptedException();
    }

    public final void h(StringBuilder sb) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (CancellationException unused2) {
                sb.append("CANCELLED");
                return;
            } catch (ExecutionException e) {
                sb.append("FAILURE, cause=[");
                sb.append(e.getCause());
                sb.append("]");
                return;
            } catch (Exception e2) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e2.getClass());
                sb.append(" thrown from get()]");
                return;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        if (obj == null) {
            sb.append("null");
        } else if (obj == this) {
            sb.append("this future");
        } else {
            sb.append(obj.getClass().getName());
            sb.append("@");
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
        }
        sb.append("]");
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.c instanceof v51;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        boolean z;
        Object obj = this.c;
        boolean f = f(obj);
        if (obj != null) {
            z = true;
        } else {
            z = false;
        }
        return z & f;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r6.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "com.google.common.util.concurrent."
            boolean r1 = r1.startsWith(r2)
            if (r1 == 0) goto L21
            java.lang.Class r1 = r6.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            goto L2c
        L21:
            java.lang.Class r1 = r6.getClass()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
        L2c:
            r1 = 64
            r0.append(r1)
            int r1 = java.lang.System.identityHashCode(r6)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = "[status="
            r0.append(r1)
            java.lang.Object r1 = r6.c
            boolean r1 = r1 instanceof defpackage.v51
            java.lang.String r2 = "]"
            if (r1 == 0) goto L50
            java.lang.String r6 = "CANCELLED"
            r0.append(r6)
            goto Le8
        L50:
            boolean r1 = r6.isDone()
            if (r1 == 0) goto L5b
            r6.h(r0)
            goto Le8
        L5b:
            int r1 = r0.length()
            java.lang.String r3 = "PENDING"
            r0.append(r3)
            java.lang.Object r3 = r6.c
            boolean r4 = r3 instanceof defpackage.w51
            java.lang.String r5 = "Exception thrown from implementation: "
            if (r4 == 0) goto L9d
            java.lang.String r4 = ", setFuture=["
            r0.append(r4)
            w51 r3 = (defpackage.w51) r3
            u61 r3 = r3.d
            if (r3 != r6) goto L7f
            java.lang.String r3 = "this future"
            r0.append(r3)     // Catch: java.lang.Throwable -> L7d
            goto L99
        L7d:
            r3 = move-exception
            goto L83
        L7f:
            r0.append(r3)     // Catch: java.lang.Throwable -> L7d
            goto L99
        L83:
            boolean r4 = r3 instanceof java.lang.Error
            if (r4 == 0) goto L8f
            boolean r4 = r3 instanceof java.lang.StackOverflowError
            if (r4 == 0) goto L8c
            goto L8f
        L8c:
            java.lang.Error r3 = (java.lang.Error) r3
            throw r3
        L8f:
            r0.append(r5)
            java.lang.Class r3 = r3.getClass()
            r0.append(r3)
        L99:
            r0.append(r2)
            goto Ld8
        L9d:
            java.lang.String r3 = r6.e()     // Catch: java.lang.Throwable -> Lac
            if (r3 == 0) goto Lae
            boolean r4 = r3.isEmpty()     // Catch: java.lang.Throwable -> Lac
            if (r4 == 0) goto Laa
            goto Lae
        Laa:
            r4 = 0
            goto Laf
        Lac:
            r3 = move-exception
            goto Lb3
        Lae:
            r4 = 1
        Laf:
            if (r4 == 0) goto Lcb
            r3 = 0
            goto Lcb
        Lb3:
            boolean r4 = r3 instanceof java.lang.Error
            if (r4 == 0) goto Lbf
            boolean r4 = r3 instanceof java.lang.StackOverflowError
            if (r4 == 0) goto Lbc
            goto Lbf
        Lbc:
            java.lang.Error r3 = (java.lang.Error) r3
            throw r3
        Lbf:
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r3 = r5.concat(r3)
        Lcb:
            if (r3 == 0) goto Ld8
            java.lang.String r4 = ", info=["
            r0.append(r4)
            r0.append(r3)
            r0.append(r2)
        Ld8:
            boolean r3 = r6.isDone()
            if (r3 == 0) goto Le8
            int r3 = r0.length()
            r0.delete(r1, r3)
            r6.h(r0)
        Le8:
            r0.append(r2)
            java.lang.String r6 = r0.toString()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x61.toString():java.lang.String");
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        d61 d61Var = d61.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.c;
            if ((obj2 != null) & f(obj2)) {
                return d(obj2);
            }
            d61 d61Var2 = this.e;
            if (d61Var2 != d61Var) {
                d61 d61Var3 = new d61();
                do {
                    wg0 wg0Var = e61.i;
                    wg0Var.G(d61Var3, d61Var2);
                    if (wg0Var.M(this, d61Var2, d61Var3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.c;
                            } else {
                                b(d61Var3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & f(obj)));
                        return d(obj);
                    }
                    d61Var2 = this.e;
                } while (d61Var2 != d61Var);
            }
            Object obj3 = this.c;
            Objects.requireNonNull(obj3);
            return d(obj3);
        }
        throw new InterruptedException();
    }
}
