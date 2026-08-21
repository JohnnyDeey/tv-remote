package androidx.preference;

import android.R;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import defpackage.rg;
import defpackage.xe0;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public class CheckBoxPreference extends TwoStatePreference {
    public final rg U;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CheckBoxPreference(android.content.Context r4, android.util.AttributeSet r5) {
        /*
            r3 = this;
            r0 = 2130903228(0x7f0300bc, float:1.7413268E38)
            r1 = 16842895(0x101008f, float:2.369396E-38)
            int r0 = defpackage.hi0.c(r4, r0, r1)
            r3.<init>(r4, r5, r0)
            rg r1 = new rg
            r2 = 0
            r1.<init>(r3, r2)
            r3.U = r1
            int[] r1 = defpackage.kg0.b
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r1, r0, r2)
            r5 = 5
            java.lang.String r5 = r4.getString(r5)
            if (r5 != 0) goto L26
            java.lang.String r5 = r4.getString(r2)
        L26:
            r3.Q = r5
            boolean r5 = r3.P
            if (r5 == 0) goto L2f
            r3.h()
        L2f:
            r5 = 4
            java.lang.String r5 = r4.getString(r5)
            if (r5 != 0) goto L3b
            r5 = 1
            java.lang.String r5 = r4.getString(r5)
        L3b:
            r3.R = r5
            boolean r5 = r3.P
            if (r5 != 0) goto L44
            r3.h()
        L44:
            r5 = 2
            boolean r5 = r4.getBoolean(r5, r2)
            r0 = 3
            boolean r5 = r4.getBoolean(r0, r5)
            r3.T = r5
            r4.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.CheckBoxPreference.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A(View view) {
        boolean z = view instanceof CompoundButton;
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.P);
        }
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(this.U);
        }
    }

    @Override // androidx.preference.Preference
    public final void l(xe0 xe0Var) {
        super.l(xe0Var);
        A(xe0Var.q(R.id.checkbox));
        z(xe0Var.q(R.id.summary));
    }

    @Override // androidx.preference.Preference
    public final void s(View view) {
        super.s(view);
        if (!((AccessibilityManager) this.c.getSystemService("accessibility")).isEnabled()) {
            return;
        }
        A(view.findViewById(R.id.checkbox));
        z(view.findViewById(R.id.summary));
    }
}
