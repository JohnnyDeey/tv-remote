package defpackage;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import android.view.ContentInfo;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.common.internal.a;
import java.nio.charset.Charset;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public class i81 implements la0, u90, p7, wc, y90, jk, lk, ad0, zu, t80 {
    public static final g00 e = new g00(21);
    public final /* synthetic */ int c;
    public final Object d;

    public i81(int i) {
        this.c = i;
        switch (i) {
            case 1:
                if (Build.VERSION.SDK_INT >= 26) {
                    this.d = new t1(this);
                    return;
                } else {
                    this.d = new t1(this);
                    return;
                }
            case 25:
                this.d = new k00();
                return;
            case 26:
                this.d = new LinkedHashMap(0, 0.75f, true);
                return;
            default:
                int i2 = j71.a;
                sb0 sb0Var = new sb0(new l81[]{g00.h, e});
                Charset charset = d81.a;
                this.d = sb0Var;
                return;
        }
    }

    public boolean A(int i, int i2, Bundle bundle) {
        return false;
    }

    public String B(int i, int i2) {
        if (i >= 0 && i < 256) {
            if (i2 >= 0 && i2 < 256) {
                return C(new int[]{i, i2});
            }
            c.k("Failed requirement.");
            return null;
        }
        c.k("Failed requirement.");
        return null;
    }

    public String C(int[] iArr) {
        return ((k00) this.d).c(q80.T(new td0("id", 0), new td0("command", "report"), new td0("report", iArr)));
    }

    public void D(String str, nf0 nf0Var) {
        ((SharedPreferences) this.d).edit().putInt(str.concat(":mouse_sensitivity"), nf0Var.a).putBoolean(str.concat(":horizontal_orientation"), nf0Var.b).putString(str.concat(":ip"), nf0Var.c).putString(str.concat(":port"), nf0Var.d).apply();
    }

    public void E(Set set) {
        ((SharedPreferences) this.d).edit().putStringSet("profiles", set).apply();
    }

    @Override // defpackage.la0
    public void a(w90 w90Var, boolean z) {
        if (w90Var instanceof gq0) {
            ((gq0) w90Var).z.k().c(false);
        }
        la0 la0Var = ((r2) this.d).g;
        if (la0Var != null) {
            la0Var.a(w90Var, z);
        }
    }

    @Override // defpackage.lk
    public ClipData b() {
        ClipData clip;
        clip = ((ContentInfo) this.d).getClip();
        return clip;
    }

    @Override // defpackage.jk
    public mk build() {
        ContentInfo build;
        build = ((ContentInfo.Builder) this.d).build();
        return new mk(new i81(build));
    }

    @Override // defpackage.u90
    public boolean d(w90 w90Var, MenuItem menuItem) {
        u2 u2Var = ((ActionMenuView) this.d).B;
        if (u2Var != null) {
            Iterator it = ((CopyOnWriteArrayList) ((kt0) u2Var).c.I.f).iterator();
            while (it.hasNext()) {
                if (((px) it.next()).a.o()) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.wc
    public void e(jj jjVar) {
        boolean z;
        if (jjVar.d == 0) {
            z = true;
        } else {
            z = false;
        }
        a aVar = (a) this.d;
        if (z) {
            aVar.l(null, aVar.w);
            return;
        }
        sb0 sb0Var = aVar.o;
        if (sb0Var != null) {
            ((d00) sb0Var.c).b(jjVar);
        }
    }

    @Override // defpackage.y90
    public void f(w90 w90Var, MenuItem menuItem) {
        ((rf) this.d).h.removeCallbacksAndMessages(w90Var);
    }

    @Override // defpackage.ad0
    public m11 g(View view, m11 m11Var) {
        boolean z;
        i11 i11Var = m11Var.a;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.d;
        if (!Objects.equals(coordinatorLayout.p, m11Var)) {
            coordinatorLayout.p = m11Var;
            boolean z2 = true;
            if (m11Var.d() > 0) {
                z = true;
            } else {
                z = false;
            }
            coordinatorLayout.q = z;
            if (z || coordinatorLayout.getBackground() != null) {
                z2 = false;
            }
            coordinatorLayout.setWillNotDraw(z2);
            if (!i11Var.q()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    WeakHashMap weakHashMap = ry0.a;
                    if (childAt.getFitsSystemWindows() && ((vk) childAt.getLayoutParams()).a != null && i11Var.q()) {
                        break;
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return m11Var;
    }

    @Override // defpackage.yf0
    public Object get() {
        return new b8((Context) ((d3) this.d).c, new Object(), new g00(18), 7, false);
    }

    @Override // defpackage.lk
    public int h() {
        int flags;
        flags = ((ContentInfo) this.d).getFlags();
        return flags;
    }

    @Override // defpackage.lk
    public ContentInfo i() {
        return (ContentInfo) this.d;
    }

    @Override // defpackage.y90
    public void j(w90 w90Var, z90 z90Var) {
        rf rfVar = (rf) this.d;
        Handler handler = rfVar.h;
        qf qfVar = null;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = rfVar.j;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i < size) {
                if (w90Var == ((qf) arrayList.get(i)).b) {
                    break;
                } else {
                    i++;
                }
            } else {
                i = -1;
                break;
            }
        }
        if (i == -1) {
            return;
        }
        int i2 = i + 1;
        if (i2 < arrayList.size()) {
            qfVar = (qf) arrayList.get(i2);
        }
        handler.postAtTime(new pf(this, qfVar, z90Var, w90Var), w90Var, SystemClock.uptimeMillis() + 200);
    }

    @Override // defpackage.u90
    public void k(w90 w90Var) {
        kt0 kt0Var = ((ActionMenuView) this.d).w;
        if (kt0Var != null) {
            kt0Var.k(w90Var);
        }
    }

    @Override // defpackage.jk
    public void m(Uri uri) {
        ((ContentInfo.Builder) this.d).setLinkUri(uri);
    }

    @Override // defpackage.lk
    public int n() {
        int source;
        source = ((ContentInfo) this.d).getSource();
        return source;
    }

    @Override // defpackage.la0
    public boolean p(w90 w90Var) {
        r2 r2Var = (r2) this.d;
        if (w90Var != r2Var.e) {
            ((gq0) w90Var).A.getClass();
            la0 la0Var = r2Var.g;
            if (la0Var != null) {
                return la0Var.p(w90Var);
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.jk
    public void q(int i) {
        ((ContentInfo.Builder) this.d).setFlags(i);
    }

    public s1 r(int i) {
        return null;
    }

    public s1 s(int i) {
        return null;
    }

    @Override // defpackage.jk
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.d).setExtras(bundle);
    }

    public byte[] t() {
        SecureRandom secureRandom = (SecureRandom) ((i81) this.d).d;
        if (!(secureRandom instanceof qk0)) {
            return secureRandom.generateSeed(32);
        }
        byte[] bArr = new byte[32];
        secureRandom.nextBytes(bArr);
        return bArr;
    }

    public String toString() {
        switch (this.c) {
            case 14:
                return "ContentInfoCompat{" + ((ContentInfo) this.d) + "}";
            default:
                return super.toString();
        }
    }

    public String u() {
        String string = ((SharedPreferences) this.d).getString("profile", "tv");
        string.getClass();
        return string;
    }

    public nf0 v(String str) {
        str.getClass();
        SharedPreferences sharedPreferences = (SharedPreferences) this.d;
        int i = sharedPreferences.getInt(str.concat(":mouse_sensitivity"), 50);
        boolean z = sharedPreferences.getBoolean(str.concat(":horizontal_orientation"), false);
        String string = sharedPreferences.getString(str.concat(":ip"), "");
        string.getClass();
        String string2 = sharedPreferences.getString(str.concat(":port"), "5555");
        string2.getClass();
        return new nf0(i, string, string2, z);
    }

    public Set w() {
        Set<String> stringSet = ((SharedPreferences) this.d).getStringSet("profiles", wt.c);
        stringSet.getClass();
        return stringSet;
    }

    public void x() {
        ((ix) this.d).v.L();
    }

    public void y() {
        Log.d("BillingManager", "Billing service disconnected");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, dg0] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object, dg0] */
    public void z(td tdVar) {
        Handler handler;
        rd rdVar = (rd) this.d;
        md mdVar = (md) rdVar.d;
        tdVar.getClass();
        if (tdVar.a == 0) {
            List P = f20.P(new Object());
            ?? obj = new Object();
            if (!P.isEmpty()) {
                HashSet hashSet = new HashSet();
                Iterator it = P.iterator();
                while (it.hasNext()) {
                    ((eg0) it.next()).getClass();
                    hashSet.add("subs");
                }
                if (hashSet.size() <= 1) {
                    i51 j = i51.j(P);
                    obj.a = j;
                    if (j != null) {
                        ?? obj2 = new Object();
                        obj2.a = obj.a;
                        mdVar.c(obj2, new qd(rdVar));
                        qd qdVar = new qd(rdVar);
                        mdVar.getClass();
                        d51 d51Var = new d51(mdVar, qdVar);
                        m61 m61Var = new m61(mdVar, 16, qdVar);
                        if (Looper.myLooper() == null) {
                            handler = mdVar.e;
                        } else {
                            handler = new Handler(Looper.myLooper());
                        }
                        if (md.f(d51Var, 30000L, m61Var, handler, mdVar.e()) == null) {
                            td l = mdVar.l();
                            mdVar.w(25, 9, l);
                            qdVar.a(l, p51.g);
                            return;
                        }
                        return;
                    }
                    c.k("Product list must be set to a non empty list.");
                    return;
                }
                c.k("All products should be of the same product type.");
                return;
            }
            c.k("Product list cannot be empty.");
            return;
        }
        Log.e("BillingManager", "Billing setup failed: " + tdVar.c);
    }

    @Override // defpackage.p7
    public void c(int i) {
    }

    @Override // defpackage.p7
    public void l(int i) {
    }

    public i81(SecureRandom secureRandom, byte[] bArr) {
        this.c = 22;
        byte[] bArr2 = new byte[32];
        secureRandom.nextBytes(bArr2);
        i81 i81Var = new i81(8, secureRandom);
        byte[] e2 = f20.e(bArr);
        this.d = new qk0(secureRandom, new i81(7, i81Var), new b8(new gk0(1), bArr2, e2, 20));
    }

    public /* synthetic */ i81(int i, Object obj) {
        this.c = i;
        this.d = obj;
    }

    public i81(a aVar) {
        this.c = 6;
        Objects.requireNonNull(aVar);
        this.d = aVar;
    }

    public i81(TextView textView) {
        this.c = 19;
        this.d = new mt(textView);
    }

    public i81(EditText editText) {
        this.c = 18;
        this.d = new r6(editText, 13);
    }

    public i81(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.c = 21;
        if (Build.VERSION.SDK_INT >= 25) {
            this.d = new a20(uri, clipDescription, uri2);
        } else {
            this.d = new b8(uri, clipDescription, uri2, 9);
        }
    }

    public i81(ContentInfo contentInfo) {
        this.c = 14;
        contentInfo.getClass();
        this.d = wd.m(contentInfo);
    }

    public i81(ClipData clipData, int i) {
        this.c = 13;
        this.d = wd.k(clipData, i);
    }

    @Override // defpackage.p7
    public void o(int i, float f) {
    }
}
