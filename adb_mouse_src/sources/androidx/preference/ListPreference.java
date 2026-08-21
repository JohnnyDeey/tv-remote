package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.AbsSavedState;
import defpackage.g00;
import defpackage.hi0;
import defpackage.kg0;
import defpackage.me0;
import defpackage.u60;
import svarzee.android.apps.adb_mouse.R;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public class ListPreference extends DialogPreference {
    public CharSequence[] V;
    public CharSequence[] W;
    public String X;
    public String Y;
    public boolean Z;

    public ListPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, kg0.e, i, 0);
        CharSequence[] textArray = obtainStyledAttributes.getTextArray(2);
        this.V = textArray == null ? obtainStyledAttributes.getTextArray(0) : textArray;
        CharSequence[] textArray2 = obtainStyledAttributes.getTextArray(3);
        this.W = textArray2 == null ? obtainStyledAttributes.getTextArray(1) : textArray2;
        if (obtainStyledAttributes.getBoolean(4, obtainStyledAttributes.getBoolean(4, false))) {
            if (g00.i == null) {
                g00.i = new g00(11);
            }
            this.N = g00.i;
            h();
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, kg0.g, i, 0);
        String string = obtainStyledAttributes2.getString(33);
        this.Y = string == null ? obtainStyledAttributes2.getString(7) : string;
        obtainStyledAttributes2.recycle();
    }

    public final void A(String str) {
        boolean equals = TextUtils.equals(this.X, str);
        if (!equals || !this.Z) {
            this.X = str;
            this.Z = true;
            t(str);
            if (!equals) {
                h();
            }
        }
    }

    @Override // androidx.preference.Preference
    public final CharSequence f() {
        CharSequence charSequence;
        CharSequence[] charSequenceArr;
        me0 me0Var = this.N;
        if (me0Var != null) {
            return me0Var.g(this);
        }
        int y = y(this.X);
        if (y >= 0 && (charSequenceArr = this.V) != null) {
            charSequence = charSequenceArr[y];
        } else {
            charSequence = null;
        }
        CharSequence f = super.f();
        String str = this.Y;
        if (str != null) {
            if (charSequence == null) {
                charSequence = "";
            }
            String format = String.format(str, charSequence);
            if (!TextUtils.equals(format, f)) {
                Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
                return format;
            }
        }
        return f;
    }

    @Override // androidx.preference.Preference
    public final Object o(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    @Override // androidx.preference.Preference
    public final void p(Parcelable parcelable) {
        if (!parcelable.getClass().equals(u60.class)) {
            super.p(parcelable);
            return;
        }
        u60 u60Var = (u60) parcelable;
        super.p(u60Var.getSuperState());
        A(u60Var.c);
    }

    @Override // androidx.preference.Preference
    public final Parcelable q() {
        super.q();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.t) {
            return absSavedState;
        }
        u60 u60Var = new u60();
        u60Var.c = this.X;
        return u60Var;
    }

    @Override // androidx.preference.Preference
    public final void r(Object obj) {
        A(e((String) obj));
    }

    @Override // androidx.preference.Preference
    public final void v(CharSequence charSequence) {
        super.v(charSequence);
        if (charSequence == null) {
            this.Y = null;
        } else {
            this.Y = ((String) charSequence).toString();
        }
    }

    public final int y(String str) {
        CharSequence[] charSequenceArr;
        if (str != null && (charSequenceArr = this.W) != null) {
            for (int length = charSequenceArr.length - 1; length >= 0; length--) {
                if (TextUtils.equals(this.W[length].toString(), str)) {
                    return length;
                }
            }
            return -1;
        }
        return -1;
    }

    public void z(CharSequence[] charSequenceArr) {
        this.V = charSequenceArr;
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, hi0.c(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle));
    }
}
