package defpackage;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class rn extends pu implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;
    public static final rn k;
    public static final long l;

    /* JADX WARN: Type inference failed for: r0v0, types: [pu, rn] */
    static {
        Long l2;
        ?? puVar = new pu();
        k = puVar;
        puVar.n(false);
        try {
            l2 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l2 = 1000L;
        }
        l = TimeUnit.MILLISECONDS.toNanos(l2.longValue());
    }

    @Override // defpackage.pu
    public final void i(Runnable runnable) {
        if (debugStatus != 4) {
            super.i(runnable);
            return;
        }
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // defpackage.pu
    public final Thread m() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 == null) {
            synchronized (this) {
                thread = _thread;
                if (thread == null) {
                    thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                    _thread = thread;
                    thread.setContextClassLoader(k.getClass().getClassLoader());
                    thread.setDaemon(true);
                    thread.start();
                }
            }
            return thread;
        }
        return thread2;
    }

    @Override // defpackage.pu
    public final void r(long j, nu nuVar) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        boolean z2;
        boolean o;
        tr0.a.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i != 2 && i != 3) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    if (!o) {
                        return;
                    } else {
                        return;
                    }
                }
                debugStatus = 1;
                notifyAll();
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long p = p();
                    if (p == Long.MAX_VALUE) {
                        long nanoTime = System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = l + nanoTime;
                        }
                        long j2 = j - nanoTime;
                        if (j2 <= 0) {
                            _thread = null;
                            t();
                            if (!o()) {
                                m();
                                return;
                            }
                            return;
                        }
                        if (p > j2) {
                            p = j2;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (p > 0) {
                        int i2 = debugStatus;
                        if (i2 != 2 && i2 != 3) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (z2) {
                            _thread = null;
                            t();
                            if (!o()) {
                                m();
                                return;
                            }
                            return;
                        }
                        LockSupport.parkNanos(this, p);
                    }
                }
            }
        } finally {
            _thread = null;
            t();
            if (!o()) {
                m();
            }
        }
    }

    @Override // defpackage.pu
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    public final synchronized void t() {
        boolean z;
        int i = debugStatus;
        if (i != 2 && i != 3) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            return;
        }
        debugStatus = 3;
        pu.h.set(this, null);
        pu.i.set(this, null);
        notifyAll();
    }

    @Override // defpackage.gl
    public final String toString() {
        return "DefaultExecutor";
    }
}
