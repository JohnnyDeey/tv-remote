package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.AbsSavedState;
import defpackage.c;
import defpackage.io0;
import defpackage.kg0;
import defpackage.re0;
import java.util.ArrayList;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public abstract class PreferenceGroup extends Preference {
    public final io0 P;
    public final ArrayList Q;
    public boolean R;
    public int S;
    public boolean T;
    public int U;

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        this.P = new io0(0);
        new Handler(Looper.getMainLooper());
        this.R = true;
        this.S = 0;
        this.T = false;
        this.U = Integer.MAX_VALUE;
        this.Q = new ArrayList();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, kg0.i, i, 0);
        this.R = obtainStyledAttributes.getBoolean(2, obtainStyledAttributes.getBoolean(2, true));
        if (obtainStyledAttributes.hasValue(1)) {
            int i3 = obtainStyledAttributes.getInt(1, obtainStyledAttributes.getInt(1, Integer.MAX_VALUE));
            if (i3 != Integer.MAX_VALUE && TextUtils.isEmpty(this.n)) {
                Log.e("PreferenceGroup", getClass().getSimpleName().concat(" should have a key defined if it contains an expandable preference"));
            }
            this.U = i3;
        }
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public final void b(Bundle bundle) {
        super.b(bundle);
        int size = this.Q.size();
        for (int i = 0; i < size; i++) {
            z(i).b(bundle);
        }
    }

    @Override // androidx.preference.Preference
    public final void c(Bundle bundle) {
        super.c(bundle);
        int size = this.Q.size();
        for (int i = 0; i < size; i++) {
            z(i).c(bundle);
        }
    }

    @Override // androidx.preference.Preference
    public final void i(boolean z) {
        super.i(z);
        int size = this.Q.size();
        for (int i = 0; i < size; i++) {
            Preference z2 = z(i);
            if (z2.x == z) {
                z2.x = !z;
                z2.i(z2.w());
                z2.h();
            }
        }
    }

    @Override // androidx.preference.Preference
    public final void j() {
        super.j();
        this.T = true;
        int size = this.Q.size();
        for (int i = 0; i < size; i++) {
            z(i).j();
        }
    }

    @Override // androidx.preference.Preference
    public final void n() {
        super.n();
        this.T = false;
        int size = this.Q.size();
        for (int i = 0; i < size; i++) {
            z(i).n();
        }
    }

    @Override // androidx.preference.Preference
    public final void p(Parcelable parcelable) {
        if (!parcelable.getClass().equals(re0.class)) {
            super.p(parcelable);
            return;
        }
        re0 re0Var = (re0) parcelable;
        this.U = re0Var.c;
        super.p(re0Var.getSuperState());
    }

    @Override // androidx.preference.Preference
    public final Parcelable q() {
        super.q();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        return new re0(this.U);
    }

    public final Preference y(CharSequence charSequence) {
        Preference y;
        if (charSequence != null) {
            if (TextUtils.equals(this.n, charSequence)) {
                return this;
            }
            int size = this.Q.size();
            for (int i = 0; i < size; i++) {
                Preference z = z(i);
                if (TextUtils.equals(z.n, charSequence)) {
                    return z;
                }
                if ((z instanceof PreferenceGroup) && (y = ((PreferenceGroup) z).y(charSequence)) != null) {
                    return y;
                }
            }
            return null;
        }
        c.k("Key cannot be null");
        return null;
    }

    public final Preference z(int i) {
        return (Preference) this.Q.get(i);
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0);
    }
}
