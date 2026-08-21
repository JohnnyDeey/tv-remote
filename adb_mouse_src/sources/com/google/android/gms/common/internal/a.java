package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import defpackage.a00;
import defpackage.b00;
import defpackage.b41;
import defpackage.b81;
import defpackage.c;
import defpackage.c00;
import defpackage.c41;
import defpackage.d00;
import defpackage.d71;
import defpackage.f40;
import defpackage.i6;
import defpackage.i91;
import defpackage.jj;
import defpackage.ka1;
import defpackage.l9;
import defpackage.m10;
import defpackage.pv;
import defpackage.q61;
import defpackage.q71;
import defpackage.qa1;
import defpackage.sb0;
import defpackage.ta1;
import defpackage.vz;
import defpackage.w41;
import defpackage.wc;
import defpackage.wv0;
import defpackage.y21;
import defpackage.yd;
import defpackage.z4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public abstract class a implements z4 {
    public static final pv[] x = new pv[0];
    public volatile String a;
    public yd b;
    public final Context c;
    public final qa1 d;
    public final w41 e;
    public final Object f;
    public final Object g;
    public c41 h;
    public wc i;
    public IInterface j;
    public final ArrayList k;
    public d71 l;
    public int m;
    public final sb0 n;
    public final sb0 o;
    public final int p;
    public final String q;
    public volatile String r;
    public jj s;
    public boolean t;
    public volatile i91 u;
    public final AtomicInteger v;
    public final Set w;

    public a(Context context, Looper looper, int i, i6 i6Var, c00 c00Var, d00 d00Var) {
        synchronized (qa1.g) {
            try {
                if (qa1.h == null) {
                    qa1.h = new qa1(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        qa1 qa1Var = qa1.h;
        Object obj = a00.b;
        wv0.p(c00Var);
        wv0.p(d00Var);
        sb0 sb0Var = new sb0(c00Var);
        sb0 sb0Var2 = new sb0(d00Var);
        String str = (String) i6Var.d;
        this.a = null;
        this.f = new Object();
        this.g = new Object();
        this.k = new ArrayList();
        this.m = 1;
        this.s = null;
        this.t = false;
        this.u = null;
        this.v = new AtomicInteger(0);
        wv0.q(context, "Context must not be null");
        this.c = context;
        wv0.q(looper, "Looper must not be null");
        wv0.q(qa1Var, "Supervisor must not be null");
        this.d = qa1Var;
        this.e = new w41(this, looper);
        this.p = i;
        this.n = sb0Var;
        this.o = sb0Var2;
        this.q = str;
        Set set = (Set) i6Var.b;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                c.o("Expanding scopes is not permitted, use implied scopes instead");
                throw null;
            }
        }
        this.w = set;
    }

    @Override // defpackage.z4
    public final boolean a() {
        boolean z;
        synchronized (this.f) {
            if (this.m == 4) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.z4
    public final Set b() {
        if (k()) {
            return this.w;
        }
        return Collections.EMPTY_SET;
    }

    @Override // defpackage.z4
    public final void c(String str) {
        this.a = str;
        n();
    }

    @Override // defpackage.z4
    public final void d(sb0 sb0Var) {
        ((y21) sb0Var.c).l.m.post(new l9(18, sb0Var));
    }

    @Override // defpackage.z4
    public final boolean f() {
        boolean z;
        synchronized (this.f) {
            int i = this.m;
            z = true;
            if (i != 2 && i != 3) {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.z4
    public final pv[] g() {
        i91 i91Var = this.u;
        if (i91Var == null) {
            return null;
        }
        return i91Var.d;
    }

    @Override // defpackage.z4
    public final void h() {
        if (a() && this.b != null) {
            return;
        }
        f40.f("Failed to connect when checking package");
    }

    @Override // defpackage.z4
    public final void i(wc wcVar) {
        this.i = wcVar;
        v(2, null);
    }

    @Override // defpackage.z4
    public final String j() {
        return this.a;
    }

    @Override // defpackage.z4
    public boolean k() {
        return false;
    }

    @Override // defpackage.z4
    public final void l(m10 m10Var, Set set) {
        Bundle p = p();
        String str = this.r;
        int i = this.p;
        int i2 = b00.a;
        Scope[] scopeArr = vz.q;
        Bundle bundle = new Bundle();
        pv[] pvVarArr = vz.r;
        vz vzVar = new vz(6, i, i2, null, null, scopeArr, bundle, null, pvVarArr, pvVarArr, true, 0, false, str);
        vzVar.f = this.c.getPackageName();
        vzVar.i = p;
        if (set != null) {
            vzVar.h = (Scope[]) set.toArray(new Scope[0]);
        }
        if (k()) {
            vzVar.j = new Account("<<default account>>", "com.google");
            if (m10Var != null) {
                vzVar.g = ((ta1) m10Var).a;
            }
        }
        vzVar.k = x;
        vzVar.l = o();
        try {
            synchronized (this.g) {
                try {
                    c41 c41Var = this.h;
                    if (c41Var != null) {
                        c41Var.a(new q61(this, this.v.get()), vzVar);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } finally {
                }
            }
        } catch (DeadObjectException e) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i3 = this.v.get();
            w41 w41Var = this.e;
            w41Var.sendMessage(w41Var.obtainMessage(6, i3, 3));
        } catch (RemoteException e2) {
            e = e2;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i4 = this.v.get();
            q71 q71Var = new q71(this, 8, null, null);
            w41 w41Var2 = this.e;
            w41Var2.sendMessage(w41Var2.obtainMessage(1, i4, -1, q71Var));
        } catch (SecurityException e3) {
            throw e3;
        } catch (RuntimeException e4) {
            e = e4;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i42 = this.v.get();
            q71 q71Var2 = new q71(this, 8, null, null);
            w41 w41Var22 = this.e;
            w41Var22.sendMessage(w41Var22.obtainMessage(1, i42, -1, q71Var2));
        }
    }

    public abstract IInterface m(IBinder iBinder);

    public final void n() {
        this.v.incrementAndGet();
        ArrayList arrayList = this.k;
        synchronized (arrayList) {
            try {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    b41 b41Var = (b41) arrayList.get(i);
                    synchronized (b41Var) {
                        b41Var.a = null;
                    }
                }
                arrayList.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.g) {
            this.h = null;
        }
        v(1, null);
    }

    public pv[] o() {
        return x;
    }

    public abstract Bundle p();

    public final IInterface q() {
        IInterface iInterface;
        synchronized (this.f) {
            try {
                if (this.m != 5) {
                    if (a()) {
                        iInterface = this.j;
                        wv0.q(iInterface, "Client is connected but service is null");
                    } else {
                        throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                    }
                } else {
                    throw new DeadObjectException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    public abstract String r();

    public abstract String s();

    public boolean t() {
        if (e() >= 211700000) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ boolean u(int i, int i2, IInterface iInterface) {
        synchronized (this.f) {
            try {
                if (this.m != i) {
                    return false;
                }
                v(i2, iInterface);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void v(int i, IInterface iInterface) {
        boolean z;
        boolean z2;
        yd ydVar;
        boolean z3 = false;
        if (i != 4) {
            z = false;
        } else {
            z = true;
        }
        if (iInterface == null) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z == z2) {
            synchronized (this.f) {
                try {
                    this.m = i;
                    this.j = iInterface;
                    Bundle bundle = null;
                    if (i != 1) {
                        if (i != 2 && i != 3) {
                            if (i == 4) {
                                wv0.p(iInterface);
                                System.currentTimeMillis();
                            }
                        } else {
                            d71 d71Var = this.l;
                            if (d71Var != null && (ydVar = this.b) != null) {
                                String str = (String) ydVar.b;
                                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 70 + "com.google.android.gms".length());
                                sb.append("Calling connect() while still connected, missing disconnect() for ");
                                sb.append(str);
                                sb.append(" on com.google.android.gms");
                                Log.e("GmsClient", sb.toString());
                                qa1 qa1Var = this.d;
                                String str2 = (String) this.b.b;
                                wv0.p(str2);
                                this.b.getClass();
                                if (this.q == null) {
                                    this.c.getClass();
                                }
                                qa1Var.b(str2, d71Var, this.b.a);
                                this.v.incrementAndGet();
                            }
                            d71 d71Var2 = new d71(this, this.v.get());
                            this.l = d71Var2;
                            String s = s();
                            boolean t = t();
                            this.b = new yd(s, t);
                            if (t && e() < 17895000) {
                                throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf((String) this.b.b)));
                            }
                            qa1 qa1Var2 = this.d;
                            String str3 = (String) this.b.b;
                            wv0.p(str3);
                            this.b.getClass();
                            String str4 = this.q;
                            if (str4 == null) {
                                str4 = this.c.getClass().getName();
                            }
                            jj a = qa1Var2.a(new ka1(str3, this.b.a), d71Var2, str4);
                            if (a.d == 0) {
                                z3 = true;
                            }
                            if (!z3) {
                                String str5 = (String) this.b.b;
                                StringBuilder sb2 = new StringBuilder(String.valueOf(str5).length() + 34 + "com.google.android.gms".length());
                                sb2.append("unable to connect to service: ");
                                sb2.append(str5);
                                sb2.append(" on com.google.android.gms");
                                Log.w("GmsClient", sb2.toString());
                                int i2 = a.d;
                                if (i2 == -1) {
                                    i2 = 16;
                                }
                                if (a.e != null) {
                                    bundle = new Bundle();
                                    bundle.putParcelable("pendingIntent", a.e);
                                }
                                int i3 = this.v.get();
                                b81 b81Var = new b81(this, i2, bundle);
                                w41 w41Var = this.e;
                                w41Var.sendMessage(w41Var.obtainMessage(7, i3, -1, b81Var));
                            }
                        }
                    } else {
                        d71 d71Var3 = this.l;
                        if (d71Var3 != null) {
                            qa1 qa1Var3 = this.d;
                            String str6 = (String) this.b.b;
                            wv0.p(str6);
                            this.b.getClass();
                            if (this.q == null) {
                                this.c.getClass();
                            }
                            qa1Var3.b(str6, d71Var3, this.b.a);
                            this.l = null;
                        }
                    }
                } finally {
                }
            }
            return;
        }
        throw new IllegalArgumentException();
    }
}
