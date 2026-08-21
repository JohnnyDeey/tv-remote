package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import defpackage.nu0;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public abstract class TwoStatePreference extends Preference {
    public boolean P;
    public CharSequence Q;
    public CharSequence R;
    public boolean S;
    public boolean T;

    public TwoStatePreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // androidx.preference.Preference
    public final void m() {
        boolean z = !this.P;
        if (a(Boolean.valueOf(z))) {
            y(z);
        }
    }

    @Override // androidx.preference.Preference
    public final Object o(TypedArray typedArray, int i) {
        return Boolean.valueOf(typedArray.getBoolean(i, false));
    }

    @Override // androidx.preference.Preference
    public final void p(Parcelable parcelable) {
        if (!parcelable.getClass().equals(nu0.class)) {
            super.p(parcelable);
            return;
        }
        nu0 nu0Var = (nu0) parcelable;
        super.p(nu0Var.getSuperState());
        y(nu0Var.c);
    }

    @Override // androidx.preference.Preference
    public final Parcelable q() {
        super.q();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.t) {
            return absSavedState;
        }
        nu0 nu0Var = new nu0();
        nu0Var.c = this.P;
        return nu0Var;
    }

    @Override // androidx.preference.Preference
    public final void r(Object obj) {
        if (obj == null) {
            obj = Boolean.FALSE;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        if (x()) {
            booleanValue = this.d.c().getBoolean(this.n, booleanValue);
        }
        y(booleanValue);
    }

    @Override // androidx.preference.Preference
    public final boolean w() {
        boolean z = this.T;
        boolean z2 = this.P;
        if (!z) {
            if (!z2) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        if (!z2 && !super.w()) {
            return false;
        }
        return true;
    }

    public final void y(boolean z) {
        boolean z2;
        if (this.P != z) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 || !this.S) {
            this.P = z;
            this.S = true;
            if (x()) {
                boolean z3 = !z;
                boolean x = x();
                String str = this.n;
                if (x) {
                    z3 = this.d.c().getBoolean(str, z3);
                }
                if (z != z3) {
                    SharedPreferences.Editor b = this.d.b();
                    b.putBoolean(str, z);
                    if (!this.d.e) {
                        b.apply();
                    }
                }
            }
            if (z2) {
                i(w());
                h();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z(android.view.View r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof android.widget.TextView
            if (r0 != 0) goto L5
            goto L4c
        L5:
            android.widget.TextView r4 = (android.widget.TextView) r4
            boolean r0 = r3.P
            r1 = 0
            if (r0 == 0) goto L1b
            java.lang.CharSequence r0 = r3.Q
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L1b
            java.lang.CharSequence r0 = r3.Q
            r4.setText(r0)
        L19:
            r0 = r1
            goto L2e
        L1b:
            boolean r0 = r3.P
            if (r0 != 0) goto L2d
            java.lang.CharSequence r0 = r3.R
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L2d
            java.lang.CharSequence r0 = r3.R
            r4.setText(r0)
            goto L19
        L2d:
            r0 = 1
        L2e:
            if (r0 == 0) goto L3e
            java.lang.CharSequence r3 = r3.f()
            boolean r2 = android.text.TextUtils.isEmpty(r3)
            if (r2 != 0) goto L3e
            r4.setText(r3)
            r0 = r1
        L3e:
            if (r0 != 0) goto L41
            goto L43
        L41:
            r1 = 8
        L43:
            int r3 = r4.getVisibility()
            if (r1 == r3) goto L4c
            r4.setVisibility(r1)
        L4c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.TwoStatePreference.z(android.view.View):void");
    }
}
