package defpackage;

import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final /* synthetic */ class fo implements Runnable {
    public final /* synthetic */ int c = 1;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ fo(hn hnVar, mn mnVar, ThreadPoolExecutor threadPoolExecutor) {
        this.d = hnVar;
        this.e = mnVar;
        this.f = threadPoolExecutor;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.c) {
            case 0:
                io ioVar = (io) this.d;
                ca caVar = (ca) this.e;
                String str = caVar.a;
                t9 t9Var = (t9) this.f;
                ioVar.getClass();
                Logger logger = io.f;
                try {
                    ku0 a = ioVar.c.a(str);
                    if (a == null) {
                        String str2 = "Transport backend '" + str + "' is not registered";
                        logger.warning(str2);
                        new IllegalArgumentException(str2);
                    } else {
                        ioVar.e.f(new go(ioVar, caVar, ((uf) a).a(t9Var), 0));
                    }
                    return;
                } catch (Exception e) {
                    logger.warning("Error scheduling event " + e.getMessage());
                    return;
                }
            default:
                hn hnVar = (hn) this.d;
                mn mnVar = (mn) this.e;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.f;
                try {
                    pw j = r21.j(hnVar.a);
                    if (j != null) {
                        ow owVar = (ow) ((ys) j.b);
                        synchronized (owVar.d) {
                            owVar.f = threadPoolExecutor;
                        }
                        ((ys) j.b).a(new at(mnVar, threadPoolExecutor));
                        return;
                    }
                    throw new RuntimeException("EmojiCompat font provider not available on this device.");
                } catch (Throwable th) {
                    mnVar.F(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
        }
    }

    public /* synthetic */ fo(io ioVar, ca caVar, f40 f40Var, t9 t9Var) {
        this.d = ioVar;
        this.e = caVar;
        this.f = t9Var;
    }
}
