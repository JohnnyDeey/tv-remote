package defpackage;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public abstract class a1 implements Future {
    public static final boolean f = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger g = Logger.getLogger(a1.class.getName());
    public static final mn h;
    public static final Object i;
    public volatile Object c;
    public volatile w0 d;
    public volatile z0 e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [mn] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    static {
        ?? r3;
        try {
            th = null;
            r3 = new x0(AtomicReferenceFieldUpdater.newUpdater(z0.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(z0.class, z0.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a1.class, z0.class, "e"), AtomicReferenceFieldUpdater.newUpdater(a1.class, w0.class, "d"), AtomicReferenceFieldUpdater.newUpdater(a1.class, Object.class, "c"));
        } catch (Throwable th) {
            th = th;
            r3 = new Object();
        }
        h = r3;
        if (th != null) {
            g.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        i = new Object();
    }

    public static void c(a1 a1Var) {
        z0 z0Var;
        w0 w0Var;
        do {
            z0Var = a1Var.e;
        } while (!h.h(a1Var, z0Var, z0.c));
        while (z0Var != null) {
            Thread thread = z0Var.a;
            if (thread != null) {
                z0Var.a = null;
                LockSupport.unpark(thread);
            }
            z0Var = z0Var.b;
        }
        do {
            w0Var = a1Var.d;
        } while (!h.f(a1Var, w0Var));
        w0 w0Var2 = null;
        while (w0Var != null) {
            w0 w0Var3 = w0Var.a;
            w0Var.a = w0Var2;
            w0Var2 = w0Var;
            w0Var = w0Var3;
        }
        while (w0Var2 != null) {
            w0Var2 = w0Var2.a;
            try {
                throw null;
                break;
            } catch (RuntimeException e) {
                g.log(Level.SEVERE, "RuntimeException while executing runnable null with executor null", (Throwable) e);
            }
        }
    }

    public static Object d(Object obj) {
        if (!(obj instanceof u0)) {
            if (!(obj instanceof v0)) {
                if (obj == i) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException((Throwable) null);
        }
        Throwable th = ((u0) obj).a;
        CancellationException cancellationException = new CancellationException("Task was cancelled.");
        cancellationException.initCause(th);
        throw cancellationException;
    }

    public static Object e(a1 a1Var) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = a1Var.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public final void b(StringBuilder sb) {
        String valueOf;
        try {
            Object e = e(this);
            sb.append("SUCCESS, result=[");
            if (e == this) {
                valueOf = "this future";
            } else {
                valueOf = String.valueOf(e);
            }
            sb.append(valueOf);
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e3) {
            sb.append("FAILURE, cause=[");
            sb.append(e3.getCause());
            sb.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        u0 u0Var;
        Object obj = this.c;
        if (obj == null) {
            if (f) {
                u0Var = new u0(new CancellationException("Future.cancel() was called."), z);
            } else if (z) {
                u0Var = u0.b;
            } else {
                u0Var = u0.c;
            }
            if (h.g(this, obj, u0Var)) {
                c(this);
                return true;
            }
            return false;
        }
        return false;
    }

    public final void f(z0 z0Var) {
        z0Var.a = null;
        while (true) {
            z0 z0Var2 = this.e;
            if (z0Var2 != z0.c) {
                z0 z0Var3 = null;
                while (z0Var2 != null) {
                    z0 z0Var4 = z0Var2.b;
                    if (z0Var2.a != null) {
                        z0Var3 = z0Var2;
                    } else if (z0Var3 != null) {
                        z0Var3.b = z0Var4;
                        if (z0Var3.a == null) {
                            break;
                        }
                    } else if (!h.h(this, z0Var2, z0Var4)) {
                        break;
                    }
                    z0Var2 = z0Var4;
                }
                return;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        long j2;
        boolean z;
        z0 z0Var = z0.c;
        long nanos = timeUnit.toNanos(j);
        if (!Thread.interrupted()) {
            Object obj = this.c;
            if (obj != null) {
                return d(obj);
            }
            if (nanos > 0) {
                j2 = System.nanoTime() + nanos;
            } else {
                j2 = 0;
            }
            if (nanos >= 1000) {
                z0 z0Var2 = this.e;
                if (z0Var2 != z0Var) {
                    z0 z0Var3 = new z0();
                    do {
                        mn mnVar = h;
                        mnVar.I(z0Var3, z0Var2);
                        if (mnVar.h(this, z0Var2, z0Var3)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.c;
                                    if (obj2 != null) {
                                        return d(obj2);
                                    }
                                    nanos = j2 - System.nanoTime();
                                } else {
                                    f(z0Var3);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            f(z0Var3);
                        } else {
                            z0Var2 = this.e;
                        }
                    } while (z0Var2 != z0Var);
                }
                return d(this.c);
            }
            while (nanos > 0) {
                Object obj3 = this.c;
                if (obj3 != null) {
                    return d(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = j2 - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String a1Var = toString();
            String obj4 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = obj4.toLowerCase(locale);
            String str = "Waited " + j + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String concat = str.concat(" (plus ");
                long j3 = -nanos;
                long convert = timeUnit.convert(j3, TimeUnit.NANOSECONDS);
                long nanos2 = j3 - timeUnit.toNanos(convert);
                if (convert != 0 && nanos2 <= 1000) {
                    z = false;
                } else {
                    z = true;
                }
                if (convert > 0) {
                    String str2 = concat + convert + " " + lowerCase;
                    if (z) {
                        str2 = str2.concat(",");
                    }
                    concat = str2.concat(" ");
                }
                if (z) {
                    concat = concat + nanos2 + " nanoseconds ";
                }
                str = concat.concat("delay)");
            }
            if (!isDone()) {
                f40.c(str, a1Var);
                return null;
            }
            throw new TimeoutException(str.concat(" but future completed as timeout expired"));
        }
        throw new InterruptedException();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.c instanceof u0;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        if (this.c != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.c instanceof u0) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            b(sb);
        } else {
            try {
                if (this instanceof ScheduledFuture) {
                    str = "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
                } else {
                    str = null;
                }
            } catch (RuntimeException e) {
                str = "Exception thrown from implementation: " + e.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                b(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        z0 z0Var = z0.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.c;
            if (obj2 != null) {
                return d(obj2);
            }
            z0 z0Var2 = this.e;
            if (z0Var2 != z0Var) {
                z0 z0Var3 = new z0();
                do {
                    mn mnVar = h;
                    mnVar.I(z0Var3, z0Var2);
                    if (mnVar.h(this, z0Var2, z0Var3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.c;
                            } else {
                                f(z0Var3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return d(obj);
                    }
                    z0Var2 = this.e;
                } while (z0Var2 != z0Var);
            }
            return d(this.c);
        }
        throw new InterruptedException();
    }
}
