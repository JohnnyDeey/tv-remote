package androidx.preference;

import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.view.AbsSavedState;
import defpackage.db0;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public class MultiSelectListPreference extends DialogPreference {
    public final CharSequence[] V;
    public final CharSequence[] W;
    public final HashSet X;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MultiSelectListPreference(android.content.Context r4, android.util.AttributeSet r5) {
        /*
            r3 = this;
            r0 = 2130903465(0x7f0301a9, float:1.7413749E38)
            r1 = 16842897(0x1010091, float:2.3693964E-38)
            int r0 = defpackage.hi0.c(r4, r0, r1)
            r3.<init>(r4, r5, r0)
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r3.X = r1
            int[] r1 = defpackage.kg0.f
            r2 = 0
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r1, r0, r2)
            r5 = 2
            java.lang.CharSequence[] r5 = r4.getTextArray(r5)
            if (r5 != 0) goto L26
            java.lang.CharSequence[] r5 = r4.getTextArray(r2)
        L26:
            r3.V = r5
            r5 = 3
            java.lang.CharSequence[] r5 = r4.getTextArray(r5)
            if (r5 != 0) goto L34
            r5 = 1
            java.lang.CharSequence[] r5 = r4.getTextArray(r5)
        L34:
            r3.W = r5
            r4.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.MultiSelectListPreference.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    @Override // androidx.preference.Preference
    public final Object o(TypedArray typedArray, int i) {
        CharSequence[] textArray = typedArray.getTextArray(i);
        HashSet hashSet = new HashSet();
        for (CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
    }

    @Override // androidx.preference.Preference
    public final void p(Parcelable parcelable) {
        if (!parcelable.getClass().equals(db0.class)) {
            super.p(parcelable);
            return;
        }
        db0 db0Var = (db0) parcelable;
        super.p(db0Var.getSuperState());
        y(db0Var.c);
    }

    @Override // androidx.preference.Preference
    public final Parcelable q() {
        super.q();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.t) {
            return absSavedState;
        }
        db0 db0Var = new db0();
        db0Var.c = this.X;
        return db0Var;
    }

    @Override // androidx.preference.Preference
    public final void r(Object obj) {
        Set<String> set = (Set) obj;
        if (x()) {
            set = this.d.c().getStringSet(this.n, set);
        }
        y(set);
    }

    public final void y(Set set) {
        HashSet hashSet = this.X;
        hashSet.clear();
        hashSet.addAll(set);
        if (x()) {
            boolean x = x();
            String str = this.n;
            Set<String> set2 = null;
            if (x) {
                set2 = this.d.c().getStringSet(str, null);
            }
            if (!set.equals(set2)) {
                SharedPreferences.Editor b = this.d.b();
                b.putStringSet(str, set);
                if (!this.d.e) {
                    b.apply();
                }
            }
        }
        h();
    }
}
