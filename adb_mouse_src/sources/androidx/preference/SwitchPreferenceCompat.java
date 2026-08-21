package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import androidx.appcompat.widget.SwitchCompat;
import defpackage.kg0;
import defpackage.rg;
import defpackage.xe0;
import svarzee.android.apps.adb_mouse.R;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public class SwitchPreferenceCompat extends TwoStatePreference {
    public final rg U;
    public final String V;
    public final String W;

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.switchPreferenceCompatStyle);
        this.U = new rg(this, 2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, kg0.m, R.attr.switchPreferenceCompatStyle, 0);
        String string = obtainStyledAttributes.getString(7);
        this.Q = string == null ? obtainStyledAttributes.getString(0) : string;
        if (this.P) {
            h();
        }
        String string2 = obtainStyledAttributes.getString(6);
        this.R = string2 == null ? obtainStyledAttributes.getString(1) : string2;
        if (!this.P) {
            h();
        }
        String string3 = obtainStyledAttributes.getString(9);
        this.V = string3 == null ? obtainStyledAttributes.getString(3) : string3;
        h();
        String string4 = obtainStyledAttributes.getString(8);
        this.W = string4 == null ? obtainStyledAttributes.getString(4) : string4;
        h();
        this.T = obtainStyledAttributes.getBoolean(5, obtainStyledAttributes.getBoolean(2, false));
        obtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A(View view) {
        boolean z = view instanceof SwitchCompat;
        if (z) {
            ((SwitchCompat) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.P);
        }
        if (z) {
            SwitchCompat switchCompat = (SwitchCompat) view;
            switchCompat.setTextOn(this.V);
            switchCompat.setTextOff(this.W);
            switchCompat.setOnCheckedChangeListener(this.U);
        }
    }

    @Override // androidx.preference.Preference
    public final void l(xe0 xe0Var) {
        super.l(xe0Var);
        A(xe0Var.q(R.id.switchWidget));
        z(xe0Var.q(android.R.id.summary));
    }

    @Override // androidx.preference.Preference
    public final void s(View view) {
        super.s(view);
        if (!((AccessibilityManager) this.c.getSystemService("accessibility")).isEnabled()) {
            return;
        }
        A(view.findViewById(R.id.switchWidget));
        z(view.findViewById(android.R.id.summary));
    }
}
