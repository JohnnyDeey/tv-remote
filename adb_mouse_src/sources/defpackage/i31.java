package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class i31 extends w21 implements c00, d00 {
    public static final s21 i = k31.a;
    public final Context b;
    public final Handler c;
    public final s21 d;
    public final Set e;
    public final i6 f;
    public eo0 g;
    public a31 h;

    public i31(Context context, y31 y31Var, i6 i6Var) {
        super(0);
        attachInterface(this, "com.google.android.gms.signin.internal.ISignInCallbacks");
        this.b = context;
        this.c = y31Var;
        this.f = i6Var;
        this.e = (Set) i6Var.a;
        this.d = i;
    }

    @Override // defpackage.c00
    public final void a(int i2) {
        a31 a31Var = this.h;
        y21 y21Var = (y21) ((e00) a31Var.h).j.get((c5) a31Var.e);
        if (y21Var != null) {
            if (y21Var.i) {
                y21Var.p(new jj(17, null, null));
            } else {
                y21Var.a(i2);
            }
        }
    }

    @Override // defpackage.d00
    public final void b(jj jjVar) {
        this.h.a(jjVar);
    }

    @Override // defpackage.c00
    public final void c() {
        GoogleSignInAccount googleSignInAccount;
        Parcel obtain;
        Parcel obtain2;
        eo0 eo0Var = this.g;
        eo0Var.getClass();
        int i2 = 12;
        boolean z = false;
        try {
            eo0Var.z.getClass();
            Account account = new Account("<<default account>>", "com.google");
            try {
                if ("<<default account>>".equals(account.name)) {
                    Context context = eo0Var.c;
                    ReentrantLock reentrantLock = vp0.c;
                    wv0.p(context);
                    ReentrantLock reentrantLock2 = vp0.c;
                    reentrantLock2.lock();
                    try {
                        if (vp0.d == null) {
                            vp0.d = new vp0(context.getApplicationContext());
                        }
                        vp0 vp0Var = vp0.d;
                        reentrantLock2.unlock();
                        String a = vp0Var.a("defaultGoogleSignInAccount");
                        if (!TextUtils.isEmpty(a)) {
                            String a2 = vp0Var.a("googleSignInAccount:" + a);
                            if (a2 != null) {
                                try {
                                    googleSignInAccount = GoogleSignInAccount.a(a2);
                                } catch (JSONException unused) {
                                }
                                Integer num = eo0Var.B;
                                wv0.p(num);
                                x31 x31Var = new x31(2, account, num.intValue(), googleSignInAccount);
                                m31 m31Var = (m31) eo0Var.q();
                                obtain = Parcel.obtain();
                                obtain.writeInterfaceToken(m31Var.c);
                                int i3 = e31.a;
                                obtain.writeInt(1);
                                int J = oi0.J(obtain, 20293);
                                oi0.F(obtain, 1, 4);
                                obtain.writeInt(1);
                                oi0.A(obtain, 2, x31Var, 0);
                                oi0.L(obtain, J);
                                obtain.writeStrongBinder(this);
                                obtain2 = Parcel.obtain();
                                m31Var.b.transact(12, obtain, obtain2, 0);
                                obtain2.readException();
                                obtain.recycle();
                                obtain2.recycle();
                                return;
                            }
                        }
                    } catch (Throwable th) {
                        reentrantLock2.unlock();
                        throw th;
                    }
                }
                m31Var.b.transact(12, obtain, obtain2, 0);
                obtain2.readException();
                obtain.recycle();
                obtain2.recycle();
                return;
            } catch (Throwable th2) {
                obtain.recycle();
                obtain2.recycle();
                throw th2;
            }
            googleSignInAccount = null;
            Integer num2 = eo0Var.B;
            wv0.p(num2);
            x31 x31Var2 = new x31(2, account, num2.intValue(), googleSignInAccount);
            m31 m31Var2 = (m31) eo0Var.q();
            obtain = Parcel.obtain();
            obtain.writeInterfaceToken(m31Var2.c);
            int i32 = e31.a;
            obtain.writeInt(1);
            int J2 = oi0.J(obtain, 20293);
            oi0.F(obtain, 1, 4);
            obtain.writeInt(1);
            oi0.A(obtain, 2, x31Var2, 0);
            oi0.L(obtain, J2);
            obtain.writeStrongBinder(this);
            obtain2 = Parcel.obtain();
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                this.c.post(new m61(this, new t31(1, new jj(8, null, null), null), i2, z));
            } catch (RemoteException unused2) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }
}
