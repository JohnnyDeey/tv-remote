package androidx.preference;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.AbsSavedState;
import android.view.View;
import android.view.ViewGroup;
import defpackage.c;
import defpackage.f2;
import defpackage.gx;
import defpackage.hc;
import defpackage.hi0;
import defpackage.je0;
import defpackage.ke0;
import defpackage.kg0;
import defpackage.le0;
import defpackage.me0;
import defpackage.qx;
import defpackage.te0;
import defpackage.ve0;
import defpackage.vx;
import java.util.ArrayList;
import svarzee.android.apps.adb_mouse.R;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public class Preference implements Comparable<Preference> {
    public final boolean A;
    public final boolean B;
    public final boolean C;
    public final boolean D;
    public final boolean E;
    public final boolean F;
    public int G;
    public int H;
    public te0 I;
    public ArrayList J;
    public PreferenceGroup K;
    public boolean L;
    public le0 M;
    public me0 N;
    public final f2 O;
    public final Context c;
    public ve0 d;
    public long e;
    public boolean f;
    public je0 g;
    public ke0 h;
    public int i;
    public CharSequence j;
    public CharSequence k;
    public int l;
    public Drawable m;
    public final String n;
    public Intent o;
    public final String p;
    public Bundle q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final String u;
    public final Object v;
    public boolean w;
    public boolean x;
    public final boolean y;
    public final boolean z;

    public Preference(Context context, AttributeSet attributeSet, int i) {
        this.i = Integer.MAX_VALUE;
        this.r = true;
        this.s = true;
        this.t = true;
        this.w = true;
        this.x = true;
        this.y = true;
        this.z = true;
        this.A = true;
        this.C = true;
        this.F = true;
        this.G = R.layout.preference;
        this.O = new f2(3, this);
        this.c = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, kg0.g, i, 0);
        this.l = obtainStyledAttributes.getResourceId(23, obtainStyledAttributes.getResourceId(0, 0));
        String string = obtainStyledAttributes.getString(26);
        this.n = string == null ? obtainStyledAttributes.getString(6) : string;
        CharSequence text = obtainStyledAttributes.getText(34);
        this.j = text == null ? obtainStyledAttributes.getText(4) : text;
        CharSequence text2 = obtainStyledAttributes.getText(33);
        this.k = text2 == null ? obtainStyledAttributes.getText(7) : text2;
        this.i = obtainStyledAttributes.getInt(28, obtainStyledAttributes.getInt(8, Integer.MAX_VALUE));
        String string2 = obtainStyledAttributes.getString(22);
        this.p = string2 == null ? obtainStyledAttributes.getString(13) : string2;
        this.G = obtainStyledAttributes.getResourceId(27, obtainStyledAttributes.getResourceId(3, R.layout.preference));
        this.H = obtainStyledAttributes.getResourceId(35, obtainStyledAttributes.getResourceId(9, 0));
        this.r = obtainStyledAttributes.getBoolean(21, obtainStyledAttributes.getBoolean(2, true));
        boolean z = obtainStyledAttributes.getBoolean(30, obtainStyledAttributes.getBoolean(5, true));
        this.s = z;
        this.t = obtainStyledAttributes.getBoolean(29, obtainStyledAttributes.getBoolean(1, true));
        String string3 = obtainStyledAttributes.getString(19);
        this.u = string3 == null ? obtainStyledAttributes.getString(10) : string3;
        this.z = obtainStyledAttributes.getBoolean(16, obtainStyledAttributes.getBoolean(16, z));
        this.A = obtainStyledAttributes.getBoolean(17, obtainStyledAttributes.getBoolean(17, z));
        if (obtainStyledAttributes.hasValue(18)) {
            this.v = o(obtainStyledAttributes, 18);
        } else if (obtainStyledAttributes.hasValue(11)) {
            this.v = o(obtainStyledAttributes, 11);
        }
        this.F = obtainStyledAttributes.getBoolean(31, obtainStyledAttributes.getBoolean(12, true));
        boolean hasValue = obtainStyledAttributes.hasValue(32);
        this.B = hasValue;
        if (hasValue) {
            this.C = obtainStyledAttributes.getBoolean(32, obtainStyledAttributes.getBoolean(14, true));
        }
        this.D = obtainStyledAttributes.getBoolean(24, obtainStyledAttributes.getBoolean(15, false));
        this.y = obtainStyledAttributes.getBoolean(25, obtainStyledAttributes.getBoolean(25, true));
        this.E = obtainStyledAttributes.getBoolean(20, obtainStyledAttributes.getBoolean(20, false));
        obtainStyledAttributes.recycle();
    }

    public static void u(View view, boolean z) {
        view.setEnabled(z);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                u(viewGroup.getChildAt(childCount), z);
            }
        }
    }

    public final boolean a(Object obj) {
        je0 je0Var = this.g;
        if (je0Var != null && !je0Var.a(this, obj)) {
            return false;
        }
        return true;
    }

    public void b(Bundle bundle) {
        Parcelable parcelable;
        String str = this.n;
        if (!TextUtils.isEmpty(str) && (parcelable = bundle.getParcelable(str)) != null) {
            this.L = false;
            p(parcelable);
            if (!this.L) {
                c.o("Derived class did not call super.onRestoreInstanceState()");
            }
        }
    }

    public void c(Bundle bundle) {
        String str = this.n;
        if (!TextUtils.isEmpty(str)) {
            this.L = false;
            Parcelable q = q();
            if (this.L) {
                if (q != null) {
                    bundle.putParcelable(str, q);
                    return;
                }
                return;
            }
            c.o("Derived class did not call super.onSaveInstanceState()");
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Preference preference) {
        Preference preference2 = preference;
        int i = this.i;
        int i2 = preference2.i;
        if (i != i2) {
            return i - i2;
        }
        CharSequence charSequence = this.j;
        CharSequence charSequence2 = preference2.j;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference2.j.toString());
    }

    public long d() {
        return this.e;
    }

    public final String e(String str) {
        if (!x()) {
            return str;
        }
        return this.d.c().getString(this.n, str);
    }

    public CharSequence f() {
        me0 me0Var = this.N;
        if (me0Var != null) {
            return me0Var.g(this);
        }
        return this.k;
    }

    public boolean g() {
        if (this.r && this.w && this.x) {
            return true;
        }
        return false;
    }

    public void h() {
        int indexOf;
        te0 te0Var = this.I;
        if (te0Var != null && (indexOf = te0Var.f.indexOf(this)) != -1) {
            te0Var.a.c(indexOf, 1, this);
        }
    }

    public void i(boolean z) {
        ArrayList arrayList = this.J;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                Preference preference = (Preference) arrayList.get(i);
                if (preference.w == z) {
                    preference.w = !z;
                    preference.i(preference.w());
                    preference.h();
                }
            }
        }
    }

    public void j() {
        PreferenceScreen preferenceScreen;
        String str = this.u;
        if (!TextUtils.isEmpty(str)) {
            ve0 ve0Var = this.d;
            Preference preference = null;
            if (ve0Var != null && (preferenceScreen = ve0Var.g) != null) {
                preference = preferenceScreen.y(str);
            }
            if (preference != null) {
                if (preference.J == null) {
                    preference.J = new ArrayList();
                }
                preference.J.add(this);
                boolean w = preference.w();
                if (this.w == w) {
                    this.w = !w;
                    i(w());
                    h();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Dependency \"" + str + "\" not found for preference \"" + this.n + "\" (title: \"" + ((Object) this.j) + "\"");
        }
    }

    public final void k(ve0 ve0Var) {
        SharedPreferences sharedPreferences;
        long j;
        this.d = ve0Var;
        if (!this.f) {
            synchronized (ve0Var) {
                j = ve0Var.b;
                ve0Var.b = 1 + j;
            }
            this.e = j;
        }
        if (x()) {
            ve0 ve0Var2 = this.d;
            if (ve0Var2 != null) {
                sharedPreferences = ve0Var2.c();
            } else {
                sharedPreferences = null;
            }
            if (sharedPreferences.contains(this.n)) {
                r(null);
                return;
            }
        }
        Object obj = this.v;
        if (obj != null) {
            r(obj);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void l(defpackage.xe0 r11) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.Preference.l(xe0):void");
    }

    public void n() {
        ArrayList arrayList;
        PreferenceScreen preferenceScreen;
        String str = this.u;
        if (str != null) {
            ve0 ve0Var = this.d;
            Preference preference = null;
            if (ve0Var != null && (preferenceScreen = ve0Var.g) != null) {
                preference = preferenceScreen.y(str);
            }
            if (preference != null && (arrayList = preference.J) != null) {
                arrayList.remove(this);
            }
        }
    }

    public Object o(TypedArray typedArray, int i) {
        return null;
    }

    public void p(Parcelable parcelable) {
        this.L = true;
        if (parcelable != AbsSavedState.EMPTY_STATE && parcelable != null) {
            c.k("Wrong state class -- expecting Preference State");
        }
    }

    public Parcelable q() {
        this.L = true;
        return AbsSavedState.EMPTY_STATE;
    }

    public void s(View view) {
        gx gxVar;
        String str;
        if (g() && this.s) {
            m();
            ke0 ke0Var = this.h;
            if (ke0Var != null) {
                ke0Var.c(this);
                return;
            }
            ve0 ve0Var = this.d;
            if (ve0Var != null && (gxVar = ve0Var.h) != null && (str = this.p) != null) {
                for (gx gxVar2 = gxVar; gxVar2 != null; gxVar2 = gxVar2.w) {
                }
                Log.w("PreferenceFragment", "onPreferenceStartFragment is not implemented in the parent activity - attempting to use a fallback implementation. You should implement this method so that you can configure the new fragment that will be displayed, and set a transition between the fragments.");
                vx j = gxVar.j();
                if (this.q == null) {
                    this.q = new Bundle();
                }
                Bundle bundle = this.q;
                qx C = j.C();
                gxVar.G().getClassLoader();
                gx a = C.a(str);
                a.K(bundle);
                a.L(gxVar);
                hc hcVar = new hc(j);
                int id = ((View) gxVar.I().getParent()).getId();
                if (id != 0) {
                    hcVar.e(id, a, null, 2);
                    if (hcVar.h) {
                        hcVar.g = true;
                        hcVar.i = null;
                        hcVar.d(false);
                        return;
                    }
                    c.o("This FragmentTransaction is not allowed to be added to the back stack.");
                    return;
                }
                c.k("Must use non-zero containerViewId");
                return;
            }
            Intent intent = this.o;
            if (intent != null) {
                this.c.startActivity(intent);
            }
        }
    }

    public final void t(String str) {
        if (x() && !TextUtils.equals(str, e(null))) {
            SharedPreferences.Editor b = this.d.b();
            b.putString(this.n, str);
            if (!this.d.e) {
                b.apply();
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        CharSequence charSequence = this.j;
        if (!TextUtils.isEmpty(charSequence)) {
            sb.append(charSequence);
            sb.append(' ');
        }
        CharSequence f = f();
        if (!TextUtils.isEmpty(f)) {
            sb.append(f);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    public void v(CharSequence charSequence) {
        if (this.N == null) {
            if (!TextUtils.equals(this.k, charSequence)) {
                this.k = charSequence;
                h();
                return;
            }
            return;
        }
        c.o("Preference already has a SummaryProvider set.");
    }

    public boolean w() {
        return !g();
    }

    public final boolean x() {
        if (this.d != null && this.t && !TextUtils.isEmpty(this.n)) {
            return true;
        }
        return false;
    }

    public void m() {
    }

    public void r(Object obj) {
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, hi0.c(context, R.attr.preferenceStyle, android.R.attr.preferenceStyle));
    }
}
