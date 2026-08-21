package androidx.preference;

import android.R;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.Switch;
import defpackage.rg;
import defpackage.xe0;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public class SwitchPreference extends TwoStatePreference {
    public final rg U;
    public final String V;
    public final String W;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SwitchPreference(android.content.Context r5, android.util.AttributeSet r6) {
        /*
            r4 = this;
            r0 = 2130904259(0x7f0304c3, float:1.741536E38)
            r1 = 16843629(0x101036d, float:2.3696016E-38)
            int r0 = defpackage.hi0.c(r5, r0, r1)
            r4.<init>(r5, r6, r0)
            rg r1 = new rg
            r2 = 1
            r1.<init>(r4, r2)
            r4.U = r1
            int[] r1 = defpackage.kg0.l
            r3 = 0
            android.content.res.TypedArray r5 = r5.obtainStyledAttributes(r6, r1, r0, r3)
            r6 = 7
            java.lang.String r6 = r5.getString(r6)
            if (r6 != 0) goto L27
            java.lang.String r6 = r5.getString(r3)
        L27:
            r4.Q = r6
            boolean r6 = r4.P
            if (r6 == 0) goto L30
            r4.h()
        L30:
            r6 = 6
            java.lang.String r6 = r5.getString(r6)
            if (r6 != 0) goto L3b
            java.lang.String r6 = r5.getString(r2)
        L3b:
            r4.R = r6
            boolean r6 = r4.P
            if (r6 != 0) goto L44
            r4.h()
        L44:
            r6 = 9
            java.lang.String r6 = r5.getString(r6)
            if (r6 != 0) goto L51
            r6 = 3
            java.lang.String r6 = r5.getString(r6)
        L51:
            r4.V = r6
            r4.h()
            r6 = 8
            java.lang.String r6 = r5.getString(r6)
            if (r6 != 0) goto L63
            r6 = 4
            java.lang.String r6 = r5.getString(r6)
        L63:
            r4.W = r6
            r4.h()
            r6 = 2
            boolean r6 = r5.getBoolean(r6, r3)
            r0 = 5
            boolean r6 = r5.getBoolean(r0, r6)
            r4.T = r6
            r5.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.SwitchPreference.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A(View view) {
        boolean z = view instanceof Switch;
        if (z) {
            ((Switch) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.P);
        }
        if (z) {
            Switch r4 = (Switch) view;
            r4.setTextOn(this.V);
            r4.setTextOff(this.W);
            r4.setOnCheckedChangeListener(this.U);
        }
    }

    @Override // androidx.preference.Preference
    public final void l(xe0 xe0Var) {
        super.l(xe0Var);
        A(xe0Var.q(R.id.switch_widget));
        z(xe0Var.q(R.id.summary));
    }

    @Override // androidx.preference.Preference
    public final void s(View view) {
        super.s(view);
        if (!((AccessibilityManager) this.c.getSystemService("accessibility")).isEnabled()) {
            return;
        }
        A(view.findViewById(R.id.switch_widget));
        z(view.findViewById(R.id.summary));
    }
}
