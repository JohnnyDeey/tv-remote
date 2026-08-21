package defpackage;

import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class at extends mn {
    public final /* synthetic */ mn l;
    public final /* synthetic */ ThreadPoolExecutor m;

    public at(mn mnVar, ThreadPoolExecutor threadPoolExecutor) {
        this.l = mnVar;
        this.m = threadPoolExecutor;
    }

    @Override // defpackage.mn
    public final void F(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.m;
        try {
            this.l.F(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // defpackage.mn
    public final void G(l3 l3Var) {
        ThreadPoolExecutor threadPoolExecutor = this.m;
        try {
            this.l.G(l3Var);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
