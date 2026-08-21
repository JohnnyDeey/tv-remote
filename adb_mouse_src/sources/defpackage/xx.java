package defpackage;

import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class xx extends yy0 {
    public final boolean f;
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();
    public final HashMap e = new HashMap();
    public boolean g = false;
    public boolean h = false;

    public xx(boolean z) {
        this.f = z;
    }

    @Override // defpackage.yy0
    public final void a() {
        if (vx.F(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.g = true;
    }

    public final void b(gx gxVar) {
        if (vx.F(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + gxVar);
        }
        c(gxVar.g);
    }

    public final void c(String str) {
        HashMap hashMap = this.d;
        xx xxVar = (xx) hashMap.get(str);
        if (xxVar != null) {
            xxVar.a();
            hashMap.remove(str);
        }
        HashMap hashMap2 = this.e;
        az0 az0Var = (az0) hashMap2.get(str);
        if (az0Var != null) {
            az0Var.a();
            hashMap2.remove(str);
        }
    }

    public final void d(gx gxVar) {
        if (this.h) {
            if (vx.F(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else if (this.c.remove(gxVar.g) != null && vx.F(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + gxVar);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && xx.class == obj.getClass()) {
            xx xxVar = (xx) obj;
            if (this.c.equals(xxVar.c) && this.d.equals(xxVar.d) && this.e.equals(xxVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + (this.c.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.c.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.d.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.e.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
