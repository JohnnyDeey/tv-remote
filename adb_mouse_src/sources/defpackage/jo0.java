package defpackage;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class jo0 implements Handler.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jo0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        ComponentName componentName = null;
        switch (this.a) {
            case 0:
                if (message.what == 0) {
                    d3 d3Var = (d3) this.b;
                    if (message.obj != null) {
                        c.a();
                    } else {
                        synchronized (d3Var.c) {
                            throw null;
                        }
                    }
                }
                return false;
            default:
                int i = message.what;
                if (i != 0) {
                    if (i != 1) {
                        return false;
                    }
                    qa1 qa1Var = (qa1) this.b;
                    synchronized (qa1Var.a) {
                        try {
                            ka1 ka1Var = (ka1) message.obj;
                            ma1 ma1Var = (ma1) qa1Var.a.get(ka1Var);
                            if (ma1Var != null && ma1Var.b == 3) {
                                String valueOf = String.valueOf(ka1Var);
                                StringBuilder sb = new StringBuilder(valueOf.length() + 47);
                                sb.append("Timeout waiting for ServiceConnection callback ");
                                sb.append(valueOf);
                                Log.e("GmsClientSupervisor", sb.toString(), new Exception());
                                ComponentName componentName2 = ma1Var.f;
                                if (componentName2 == null) {
                                    ka1Var.getClass();
                                } else {
                                    componentName = componentName2;
                                }
                                if (componentName == null) {
                                    String str = ka1Var.b;
                                    wv0.p(str);
                                    componentName = new ComponentName(str, "unknown");
                                }
                                ma1Var.onServiceDisconnected(componentName);
                            }
                        } finally {
                        }
                    }
                } else {
                    qa1 qa1Var2 = (qa1) this.b;
                    synchronized (qa1Var2.a) {
                        try {
                            ka1 ka1Var2 = (ka1) message.obj;
                            ma1 ma1Var2 = (ma1) qa1Var2.a.get(ka1Var2);
                            if (ma1Var2 != null && ma1Var2.a.isEmpty()) {
                                if (ma1Var2.c) {
                                    ka1 ka1Var3 = ma1Var2.e;
                                    qa1 qa1Var3 = ma1Var2.g;
                                    qa1Var3.c.removeMessages(1, ka1Var3);
                                    qa1Var3.d.o(qa1Var3.b, ma1Var2);
                                    ma1Var2.c = false;
                                    ma1Var2.b = 2;
                                }
                                qa1Var2.a.remove(ka1Var2);
                            }
                        } finally {
                        }
                    }
                }
                return true;
        }
    }
}
