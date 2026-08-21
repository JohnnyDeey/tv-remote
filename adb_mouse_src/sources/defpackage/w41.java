package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.a;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class w41 extends y31 {
    public final /* synthetic */ a a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w41(a aVar, Looper looper) {
        super(looper, 2);
        this.a = aVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Boolean bool;
        PendingIntent pendingIntent;
        PendingIntent pendingIntent2;
        b41 b41Var;
        a aVar = this.a;
        int i = aVar.v.get();
        int i2 = message.arg1;
        int i3 = message.what;
        if (i != i2) {
            if ((i3 == 2 || i3 == 1 || i3 == 7) && (b41Var = (b41) message.obj) != null) {
                synchronized (b41Var) {
                    b41Var.a = null;
                }
                a aVar2 = b41Var.c;
                synchronized (aVar2.k) {
                    aVar2.k.remove(b41Var);
                }
                return;
            }
            return;
        }
        if ((i3 != 1 && i3 != 7 && i3 != 4 && i3 != 5) || aVar.f()) {
            int i4 = message.what;
            if (i4 == 4) {
                aVar.s = new jj(message.arg2, null, null);
                if (!aVar.t && !TextUtils.isEmpty(aVar.r()) && !TextUtils.isEmpty(null)) {
                    try {
                        Class.forName(aVar.r());
                        if (!aVar.t) {
                            aVar.v(3, null);
                            return;
                        }
                    } catch (ClassNotFoundException unused) {
                    }
                }
                jj jjVar = aVar.s;
                if (jjVar == null) {
                    jjVar = new jj(8, null, null);
                }
                aVar.i.e(jjVar);
                System.currentTimeMillis();
                return;
            }
            if (i4 == 5) {
                jj jjVar2 = aVar.s;
                if (jjVar2 == null) {
                    jjVar2 = new jj(8, null, null);
                }
                aVar.i.e(jjVar2);
                System.currentTimeMillis();
                return;
            }
            if (i4 == 3) {
                Object obj = message.obj;
                if (obj instanceof PendingIntent) {
                    pendingIntent2 = (PendingIntent) obj;
                } else {
                    pendingIntent2 = null;
                }
                aVar.i.e(new jj(message.arg2, pendingIntent2, null));
                System.currentTimeMillis();
                return;
            }
            if (i4 == 6) {
                aVar.v(5, null);
                sb0 sb0Var = aVar.n;
                if (sb0Var != null) {
                    ((c00) sb0Var.c).a(message.arg2);
                }
                System.currentTimeMillis();
                aVar.u(5, 1, null);
                return;
            }
            if (i4 == 2 && !aVar.a()) {
                b41 b41Var2 = (b41) message.obj;
                if (b41Var2 != null) {
                    synchronized (b41Var2) {
                        b41Var2.a = null;
                    }
                    a aVar3 = b41Var2.c;
                    synchronized (aVar3.k) {
                        aVar3.k.remove(b41Var2);
                    }
                    return;
                }
                return;
            }
            int i5 = message.what;
            if (i5 != 2 && i5 != 1 && i5 != 7) {
                StringBuilder sb = new StringBuilder(String.valueOf(i5).length() + 34);
                sb.append("Don't know how to handle message: ");
                sb.append(i5);
                Log.wtf("GmsClient", sb.toString(), new Exception());
                return;
            }
            b41 b41Var3 = (b41) message.obj;
            synchronized (b41Var3) {
                try {
                    bool = b41Var3.a;
                    if (b41Var3.b) {
                        String obj2 = b41Var3.toString();
                        StringBuilder sb2 = new StringBuilder(obj2.length() + 47);
                        sb2.append("Callback proxy ");
                        sb2.append(obj2);
                        sb2.append(" being reused. This is not safe.");
                        Log.w("GmsClient", sb2.toString());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (bool != null) {
                a aVar4 = b41Var3.f;
                int i6 = b41Var3.d;
                if (i6 == 0) {
                    if (!b41Var3.a()) {
                        aVar4.v(1, null);
                        b41Var3.b(new jj(8, null, null));
                    }
                } else {
                    aVar4.v(1, null);
                    Bundle bundle = b41Var3.e;
                    if (bundle != null) {
                        pendingIntent = (PendingIntent) bundle.getParcelable("pendingIntent");
                    } else {
                        pendingIntent = null;
                    }
                    b41Var3.b(new jj(i6, pendingIntent, null));
                }
            }
            synchronized (b41Var3) {
                b41Var3.b = true;
            }
            synchronized (b41Var3) {
                b41Var3.a = null;
            }
            a aVar5 = b41Var3.c;
            synchronized (aVar5.k) {
                aVar5.k.remove(b41Var3);
            }
            return;
        }
        b41 b41Var4 = (b41) message.obj;
        if (b41Var4 != null) {
            synchronized (b41Var4) {
                b41Var4.a = null;
            }
            a aVar6 = b41Var4.c;
            synchronized (aVar6.k) {
                aVar6.k.remove(b41Var4);
            }
        }
    }
}
