package androidx.preference;

import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.AbsSavedState;
import defpackage.ps;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public class EditTextPreference extends DialogPreference {
    public String V;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r5v5, types: [os, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public EditTextPreference(android.content.Context r4, android.util.AttributeSet r5) {
        /*
            r3 = this;
            r0 = 2130903505(0x7f0301d1, float:1.741383E38)
            r1 = 16842898(0x1010092, float:2.3693967E-38)
            int r0 = defpackage.hi0.c(r4, r0, r1)
            r3.<init>(r4, r5, r0)
            int[] r1 = defpackage.kg0.d
            r2 = 0
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r1, r0, r2)
            boolean r5 = r4.getBoolean(r2, r2)
            boolean r5 = r4.getBoolean(r2, r5)
            if (r5 == 0) goto L30
            os r5 = defpackage.os.h
            if (r5 != 0) goto L29
            os r5 = new os
            r5.<init>()
            defpackage.os.h = r5
        L29:
            os r5 = defpackage.os.h
            r3.N = r5
            r3.h()
        L30:
            r4.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.EditTextPreference.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    @Override // androidx.preference.Preference
    public final Object o(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    @Override // androidx.preference.Preference
    public final void p(Parcelable parcelable) {
        if (!parcelable.getClass().equals(ps.class)) {
            super.p(parcelable);
            return;
        }
        ps psVar = (ps) parcelable;
        super.p(psVar.getSuperState());
        y(psVar.c);
    }

    @Override // androidx.preference.Preference
    public final Parcelable q() {
        super.q();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.t) {
            return absSavedState;
        }
        ps psVar = new ps();
        psVar.c = this.V;
        return psVar;
    }

    @Override // androidx.preference.Preference
    public final void r(Object obj) {
        y(e((String) obj));
    }

    @Override // androidx.preference.Preference
    public final boolean w() {
        if (!TextUtils.isEmpty(this.V) && !super.w()) {
            return false;
        }
        return true;
    }

    public final void y(String str) {
        boolean w = w();
        this.V = str;
        t(str);
        boolean w2 = w();
        if (w2 != w) {
            i(w2);
        }
        h();
    }
}
