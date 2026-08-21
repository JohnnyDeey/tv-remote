package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import defpackage.fb0;
import defpackage.gx;
import defpackage.hc;
import defpackage.hi0;
import defpackage.kg0;
import defpackage.kq;
import defpackage.qe0;
import defpackage.qs;
import defpackage.vx;
import defpackage.w60;
import svarzee.android.apps.adb_mouse.R;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public abstract class DialogPreference extends Preference {
    public final CharSequence P;
    public final String Q;
    public final Drawable R;
    public final String S;
    public final String T;
    public final int U;

    public DialogPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, kg0.c, i, 0);
        String string = obtainStyledAttributes.getString(9);
        string = string == null ? obtainStyledAttributes.getString(0) : string;
        this.P = string;
        if (string == null) {
            this.P = this.j;
        }
        String string2 = obtainStyledAttributes.getString(8);
        this.Q = string2 == null ? obtainStyledAttributes.getString(1) : string2;
        Drawable drawable = obtainStyledAttributes.getDrawable(6);
        this.R = drawable == null ? obtainStyledAttributes.getDrawable(2) : drawable;
        String string3 = obtainStyledAttributes.getString(11);
        this.S = string3 == null ? obtainStyledAttributes.getString(3) : string3;
        String string4 = obtainStyledAttributes.getString(10);
        this.T = string4 == null ? obtainStyledAttributes.getString(4) : string4;
        this.U = obtainStyledAttributes.getResourceId(7, obtainStyledAttributes.getResourceId(5, 0));
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public void m() {
        kq fb0Var;
        qe0 qe0Var = this.d.i;
        if (qe0Var != null) {
            for (gx gxVar = qe0Var; gxVar != null; gxVar = gxVar.w) {
            }
            if (qe0Var.j().A("androidx.preference.PreferenceFragment.DIALOG") == null) {
                boolean z = this instanceof EditTextPreference;
                String str = this.n;
                if (z) {
                    fb0Var = new qs();
                    Bundle bundle = new Bundle(1);
                    bundle.putString("key", str);
                    fb0Var.K(bundle);
                } else if (this instanceof ListPreference) {
                    fb0Var = new w60();
                    Bundle bundle2 = new Bundle(1);
                    bundle2.putString("key", str);
                    fb0Var.K(bundle2);
                } else if (this instanceof MultiSelectListPreference) {
                    fb0Var = new fb0();
                    Bundle bundle3 = new Bundle(1);
                    bundle3.putString("key", str);
                    fb0Var.K(bundle3);
                } else {
                    throw new IllegalArgumentException("Cannot display dialog for an unknown Preference type: " + getClass().getSimpleName() + ". Make sure to implement onPreferenceDisplayDialog() to handle displaying a custom dialog for this Preference.");
                }
                fb0Var.L(qe0Var);
                vx j = qe0Var.j();
                fb0Var.h0 = false;
                fb0Var.i0 = true;
                hc hcVar = new hc(j);
                hcVar.p = true;
                hcVar.e(0, fb0Var, "androidx.preference.PreferenceFragment.DIALOG", 1);
                hcVar.d(false);
            }
        }
    }

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, hi0.c(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle));
    }
}
