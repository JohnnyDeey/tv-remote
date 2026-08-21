package defpackage;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public class na1 implements u61 {
    public static final boolean f = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger g = Logger.getLogger(na1.class.getName());
    public static final hi0 h;
    public static final Object i;
    public volatile Object c;
    public volatile m81 d;
    public volatile ja1 e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [hi0] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    static {
        ?? r3;
        try {
            th = null;
            r3 = new j91(AtomicReferenceFieldUpdater.newUpdater(ja1.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(ja1.class, ja1.class, "b"), AtomicReferenceFieldUpdater.newUpdater(na1.class, ja1.class, "e"), AtomicReferenceFieldUpdater.newUpdater(na1.class, m81.class, "d"), AtomicReferenceFieldUpdater.newUpdater(na1.class, Object.class, "c"));
        } catch (Throwable th) {
            th = th;
            r3 = new Object();
        }
        Throwable th2 = th;
        h = r3;
        if (th2 != null) {
            g.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "<clinit>", "SafeAtomicHelper is broken!", th2);
        }
        i = new Object();
    }

    public static void c(na1 na1Var) {
        ja1 ja1Var;
        hi0 hi0Var;
        m81 m81Var;
        m81 m81Var2;
        m81 m81Var3;
        do {
            ja1Var = na1Var.e;
            hi0Var = h;
        } while (!hi0Var.w(na1Var, ja1Var, ja1.c));
        while (true) {
            m81Var = null;
            if (ja1Var == null) {
                break;
            }
            Thread thread = ja1Var.a;
            if (thread != null) {
                ja1Var.a = null;
                LockSupport.unpark(thread);
            }
            ja1Var = ja1Var.b;
        }
        do {
            m81Var2 = na1Var.d;
        } while (!hi0Var.t(na1Var, m81Var2, m81.d));
        while (true) {
            m81Var3 = m81Var;
            m81Var = m81Var2;
            if (m81Var == null) {
                break;
            }
            m81Var2 = m81Var.c;
            m81Var.c = m81Var3;
        }
        while (m81Var3 != null) {
            Runnable runnable = m81Var3.a;
            m81 m81Var4 = m81Var3.c;
            e(runnable, m81Var3.b);
            m81Var3 = m81Var4;
        }
    }

    public static void e(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            g.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "executeListener", "RuntimeException while executing runnable " + String.valueOf(runnable) + " with executor " + String.valueOf(executor), (Throwable) e);
        }
    }

    public static final Object g(Object obj) {
        if (!(obj instanceof e71)) {
            if (!(obj instanceof c81)) {
                if (obj == i) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((c81) obj).a);
        }
        Throwable th = ((e71) obj).a;
        CancellationException cancellationException = new CancellationException("Task was cancelled.");
        cancellationException.initCause(th);
        throw cancellationException;
    }

    @Override // defpackage.u61
    public final void a(Runnable runnable, Executor executor) {
        executor.getClass();
        m81 m81Var = this.d;
        m81 m81Var2 = m81.d;
        if (m81Var != m81Var2) {
            m81 m81Var3 = new m81(runnable, executor);
            do {
                m81Var3.c = m81Var;
                if (h.t(this, m81Var, m81Var3)) {
                    return;
                } else {
                    m81Var = this.d;
                }
            } while (m81Var != m81Var2);
        }
        e(runnable, executor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String b() {
        if (this instanceof ScheduledFuture) {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        }
        return null;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        e71 e71Var;
        Object obj = this.c;
        if (obj == null) {
            if (f) {
                e71Var = new e71(new CancellationException("Future.cancel() was called."));
            } else if (z) {
                e71Var = e71.b;
            } else {
                e71Var = e71.c;
            }
            if (h.u(this, obj, e71Var)) {
                c(this);
                return true;
            }
            return false;
        }
        return false;
    }

    public final void d(StringBuilder sb) {
        Object obj;
        String valueOf;
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
            } catch (RuntimeException e) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e.getClass());
                sb.append(" thrown from get()]");
                return;
            } catch (ExecutionException e2) {
                sb.append("FAILURE, cause=[");
                sb.append(e2.getCause());
                sb.append("]");
                return;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        if (obj == this) {
            valueOf = "this future";
        } else {
            valueOf = String.valueOf(obj);
        }
        sb.append(valueOf);
        sb.append("]");
    }

    public final void f(ja1 ja1Var) {
        ja1Var.a = null;
        while (true) {
            ja1 ja1Var2 = this.e;
            if (ja1Var2 != ja1.c) {
                ja1 ja1Var3 = null;
                while (ja1Var2 != null) {
                    ja1 ja1Var4 = ja1Var2.b;
                    if (ja1Var2.a != null) {
                        ja1Var3 = ja1Var2;
                    } else if (ja1Var3 != null) {
                        ja1Var3.b = ja1Var4;
                        if (ja1Var3.a == null) {
                            break;
                        }
                    } else if (!h.w(this, ja1Var2, ja1Var4)) {
                        break;
                    }
                    ja1Var2 = ja1Var4;
                }
                return;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        long j2;
        long nanos = timeUnit.toNanos(j);
        if (!Thread.interrupted()) {
            Object obj = this.c;
            if (obj != null) {
                return g(obj);
            }
            if (nanos > 0) {
                j2 = System.nanoTime() + nanos;
            } else {
                j2 = 0;
            }
            if (nanos >= 1000) {
                ja1 ja1Var = this.e;
                ja1 ja1Var2 = ja1.c;
                if (ja1Var != ja1Var2) {
                    ja1 ja1Var3 = new ja1();
                    do {
                        hi0 hi0Var = h;
                        hi0Var.r(ja1Var3, ja1Var);
                        if (hi0Var.w(this, ja1Var, ja1Var3)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.c;
                                    if (obj2 != null) {
                                        return g(obj2);
                                    }
                                    nanos = j2 - System.nanoTime();
                                } else {
                                    f(ja1Var3);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            f(ja1Var3);
                        } else {
                            ja1Var = this.e;
                        }
                    } while (ja1Var != ja1Var2);
                }
                return g(this.c);
            }
            while (nanos > 0) {
                Object obj3 = this.c;
                if (obj3 != null) {
                    return g(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = j2 - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String na1Var = toString();
            String obj4 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = obj4.toLowerCase(locale);
            String str = "Waited " + j + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String concat = str.concat(" (plus ");
                long j3 = -nanos;
                long convert = timeUnit.convert(j3, TimeUnit.NANOSECONDS);
                long nanos2 = j3 - timeUnit.toNanos(convert);
                boolean z = true;
                if (convert != 0 && nanos2 <= 1000) {
                    z = false;
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
                f40.c(str, na1Var);
                return null;
            }
            throw new TimeoutException(str.concat(" but future completed as timeout expired"));
        }
        throw new InterruptedException();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.c instanceof e71;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        if (this.c != null) {
            return true;
        }
        return false;
    }

    public final String toString() {
        String concat;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.c instanceof e71) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            d(sb);
        } else {
            try {
                concat = b();
            } catch (RuntimeException e) {
                concat = "Exception thrown from implementation: ".concat(String.valueOf(e.getClass()));
            }
            if (concat != null && !concat.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(concat);
                sb.append("]");
            } else if (isDone()) {
                d(sb);
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
        if (!Thread.interrupted()) {
            Object obj2 = this.c;
            if (obj2 != null) {
                return g(obj2);
            }
            ja1 ja1Var = this.e;
            ja1 ja1Var2 = ja1.c;
            if (ja1Var != ja1Var2) {
                ja1 ja1Var3 = new ja1();
                do {
                    hi0 hi0Var = h;
                    hi0Var.r(ja1Var3, ja1Var);
                    if (hi0Var.w(this, ja1Var, ja1Var3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.c;
                            } else {
                                f(ja1Var3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return g(obj);
                    }
                    ja1Var = this.e;
                } while (ja1Var != ja1Var2);
            }
            return g(this.c);
        }
        throw new InterruptedException();
    }
}
