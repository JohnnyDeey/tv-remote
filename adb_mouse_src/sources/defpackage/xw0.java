package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.Objects;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final /* synthetic */ class xw0 implements Runnable {
    public final /* synthetic */ cx0 c;
    public final /* synthetic */ ca d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Runnable f;

    public /* synthetic */ xw0(cx0 cx0Var, ca caVar, int i, Runnable runnable) {
        this.c = cx0Var;
        this.d = caVar;
        this.e = i;
        this.f = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final ca caVar = this.d;
        final int i = this.e;
        Runnable runnable = this.f;
        final cx0 cx0Var = this.c;
        fl0 fl0Var = cx0Var.f;
        int i2 = 1;
        try {
            try {
                fl0 fl0Var2 = cx0Var.c;
                Objects.requireNonNull(fl0Var2);
                fl0Var.f(new yw0(fl0Var2, i2));
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) cx0Var.a.getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                    cx0Var.a(caVar, i);
                } else {
                    fl0Var.f(new tq0() { // from class: zw0
                        @Override // defpackage.tq0
                        public final Object a() {
                            cx0.this.d.Q(caVar, i + 1, false);
                            return null;
                        }
                    });
                }
                runnable.run();
            } catch (sq0 unused) {
                cx0Var.d.Q(caVar, i + 1, false);
                runnable.run();
            }
        } catch (Throwable th) {
            runnable.run();
            throw th;
        }
    }
}
