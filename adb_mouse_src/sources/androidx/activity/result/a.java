package androidx.activity.result;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import defpackage.b3;
import defpackage.c3;
import defpackage.e3;
import defpackage.f3;
import defpackage.g3;
import defpackage.h3;
import defpackage.i3;
import defpackage.k20;
import defpackage.l50;
import defpackage.m50;
import defpackage.p50;
import defpackage.s50;
import defpackage.t0;
import defpackage.yg0;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public abstract class a {
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public ArrayList d = new ArrayList();
    public final transient HashMap e = new HashMap();
    public final HashMap f = new HashMap();
    public final Bundle g = new Bundle();

    public final boolean a(int i, int i2, Intent intent) {
        String str = (String) this.a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        h3 h3Var = (h3) this.e.get(str);
        if (h3Var != null) {
            c3 c3Var = h3Var.a;
            if (this.d.contains(str)) {
                c3Var.a(h3Var.b.Z(i2, intent));
                this.d.remove(str);
                return true;
            }
        }
        this.f.remove(str);
        this.g.putParcelable(str, new b3(i2, intent));
        return true;
    }

    public abstract void b(int i, k20 k20Var, Object obj);

    public final f3 c(final String str, androidx.activity.a aVar, final e3 e3Var, final c3 c3Var) {
        androidx.lifecycle.a aVar2 = aVar.f;
        if (aVar2.d.compareTo(m50.f) < 0) {
            e(str);
            HashMap hashMap = this.c;
            i3 i3Var = (i3) hashMap.get(str);
            if (i3Var == null) {
                i3Var = new i3(aVar2);
            }
            p50 p50Var = new p50() { // from class: androidx.activity.result.ActivityResultRegistry$1
                @Override // defpackage.p50
                public final void c(s50 s50Var, l50 l50Var) {
                    boolean equals = l50.ON_START.equals(l50Var);
                    String str2 = str;
                    a aVar3 = a.this;
                    if (equals) {
                        HashMap hashMap2 = aVar3.e;
                        Bundle bundle = aVar3.g;
                        HashMap hashMap3 = aVar3.f;
                        c3 c3Var2 = c3Var;
                        hashMap2.put(str2, new h3(c3Var2, e3Var));
                        if (hashMap3.containsKey(str2)) {
                            Object obj = hashMap3.get(str2);
                            hashMap3.remove(str2);
                            c3Var2.a(obj);
                        }
                        b3 b3Var = (b3) bundle.getParcelable(str2);
                        if (b3Var != null) {
                            bundle.remove(str2);
                            c3Var2.a(new b3(b3Var.c, b3Var.d));
                            return;
                        }
                        return;
                    }
                    if (l50.ON_STOP.equals(l50Var)) {
                        aVar3.e.remove(str2);
                    } else if (l50.ON_DESTROY.equals(l50Var)) {
                        aVar3.f(str2);
                    }
                }
            };
            i3Var.a.a(p50Var);
            i3Var.b.add(p50Var);
            hashMap.put(str, i3Var);
            return new f3(this, str, e3Var);
        }
        StringBuilder sb = new StringBuilder("LifecycleOwner ");
        sb.append(aVar);
        m50 m50Var = aVar2.d;
        sb.append(" is attempting to register while current state is ");
        sb.append(m50Var);
        sb.append(". LifecycleOwners must call register before they are STARTED.");
        throw new IllegalStateException(sb.toString());
    }

    public final g3 d(String str, k20 k20Var, c3 c3Var) {
        e(str);
        this.e.put(str, new h3(c3Var, k20Var));
        HashMap hashMap = this.f;
        if (hashMap.containsKey(str)) {
            Object obj = hashMap.get(str);
            hashMap.remove(str);
            c3Var.a(obj);
        }
        Bundle bundle = this.g;
        b3 b3Var = (b3) bundle.getParcelable(str);
        if (b3Var != null) {
            bundle.remove(str);
            c3Var.a(k20Var.Z(b3Var.c, b3Var.d));
        }
        return new g3(this, str, k20Var);
    }

    public final void e(String str) {
        HashMap hashMap = this.b;
        if (((Integer) hashMap.get(str)) != null) {
            return;
        }
        t0 t0Var = yg0.c;
        int nextInt = yg0.c.a().nextInt(2147418112);
        while (true) {
            int i = nextInt + 65536;
            Integer valueOf = Integer.valueOf(i);
            HashMap hashMap2 = this.a;
            if (hashMap2.containsKey(valueOf)) {
                t0 t0Var2 = yg0.c;
                nextInt = yg0.c.a().nextInt(2147418112);
            } else {
                hashMap2.put(Integer.valueOf(i), str);
                hashMap.put(str, Integer.valueOf(i));
                return;
            }
        }
    }

    public final void f(String str) {
        Integer num;
        if (!this.d.contains(str) && (num = (Integer) this.b.remove(str)) != null) {
            this.a.remove(num);
        }
        this.e.remove(str);
        HashMap hashMap = this.f;
        if (hashMap.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + hashMap.get(str));
            hashMap.remove(str);
        }
        Bundle bundle = this.g;
        if (bundle.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + bundle.getParcelable(str));
            bundle.remove(str);
        }
        HashMap hashMap2 = this.c;
        i3 i3Var = (i3) hashMap2.get(str);
        if (i3Var != null) {
            ArrayList arrayList = i3Var.b;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                i3Var.a.f((p50) obj);
            }
            arrayList.clear();
            hashMap2.remove(str);
        }
    }
}
