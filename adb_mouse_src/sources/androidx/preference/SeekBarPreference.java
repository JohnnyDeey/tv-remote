package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.AbsSavedState;
import android.widget.SeekBar;
import android.widget.TextView;
import defpackage.jm0;
import defpackage.kg0;
import defpackage.km0;
import defpackage.lm0;
import defpackage.xe0;
import svarzee.android.apps.adb_mouse.R;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public class SeekBarPreference extends Preference {
    public int P;
    public int Q;
    public int R;
    public int S;
    public boolean T;
    public SeekBar U;
    public TextView V;
    public final boolean W;
    public final boolean X;
    public final boolean Y;
    public final jm0 Z;
    public final km0 a0;

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarPreferenceStyle);
        this.Z = new jm0(this);
        this.a0 = new km0(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, kg0.k, R.attr.seekBarPreferenceStyle, 0);
        this.Q = obtainStyledAttributes.getInt(3, 0);
        int i = obtainStyledAttributes.getInt(1, 100);
        int i2 = this.Q;
        i = i < i2 ? i2 : i;
        if (i != this.R) {
            this.R = i;
            h();
        }
        int i3 = obtainStyledAttributes.getInt(4, 0);
        if (i3 != this.S) {
            this.S = Math.min(this.R - this.Q, Math.abs(i3));
            h();
        }
        this.W = obtainStyledAttributes.getBoolean(2, true);
        this.X = obtainStyledAttributes.getBoolean(5, false);
        this.Y = obtainStyledAttributes.getBoolean(6, false);
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public final void l(xe0 xe0Var) {
        super.l(xe0Var);
        xe0Var.a.setOnKeyListener(this.a0);
        this.U = (SeekBar) xe0Var.q(R.id.seekbar);
        TextView textView = (TextView) xe0Var.q(R.id.seekbar_value);
        this.V = textView;
        if (this.X) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
            this.V = null;
        }
        SeekBar seekBar = this.U;
        if (seekBar == null) {
            Log.e("SeekBarPreference", "SeekBar view is null in onBindViewHolder.");
            return;
        }
        seekBar.setOnSeekBarChangeListener(this.Z);
        this.U.setMax(this.R - this.Q);
        int i = this.S;
        SeekBar seekBar2 = this.U;
        if (i != 0) {
            seekBar2.setKeyProgressIncrement(i);
        } else {
            this.S = seekBar2.getKeyProgressIncrement();
        }
        this.U.setProgress(this.P - this.Q);
        int i2 = this.P;
        TextView textView2 = this.V;
        if (textView2 != null) {
            textView2.setText(String.valueOf(i2));
        }
        this.U.setEnabled(g());
    }

    @Override // androidx.preference.Preference
    public final Object o(TypedArray typedArray, int i) {
        return Integer.valueOf(typedArray.getInt(i, 0));
    }

    @Override // androidx.preference.Preference
    public final void p(Parcelable parcelable) {
        if (!parcelable.getClass().equals(lm0.class)) {
            super.p(parcelable);
            return;
        }
        lm0 lm0Var = (lm0) parcelable;
        super.p(lm0Var.getSuperState());
        this.P = lm0Var.c;
        this.Q = lm0Var.d;
        this.R = lm0Var.e;
        h();
    }

    @Override // androidx.preference.Preference
    public final Parcelable q() {
        super.q();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.t) {
            return absSavedState;
        }
        lm0 lm0Var = new lm0();
        lm0Var.c = this.P;
        lm0Var.d = this.Q;
        lm0Var.e = this.R;
        return lm0Var;
    }

    @Override // androidx.preference.Preference
    public final void r(Object obj) {
        if (obj == null) {
            obj = 0;
        }
        int intValue = ((Integer) obj).intValue();
        if (x()) {
            intValue = this.d.c().getInt(this.n, intValue);
        }
        y(intValue, true);
    }

    public final void y(int i, boolean z) {
        int i2 = this.Q;
        if (i < i2) {
            i = i2;
        }
        int i3 = this.R;
        if (i > i3) {
            i = i3;
        }
        if (i != this.P) {
            this.P = i;
            TextView textView = this.V;
            if (textView != null) {
                textView.setText(String.valueOf(i));
            }
            if (x()) {
                int i4 = ~i;
                boolean x = x();
                String str = this.n;
                if (x) {
                    i4 = this.d.c().getInt(str, i4);
                }
                if (i != i4) {
                    SharedPreferences.Editor b = this.d.b();
                    b.putInt(str, i);
                    if (!this.d.e) {
                        b.apply();
                    }
                }
            }
            if (z) {
                h();
            }
        }
    }

    public final void z(SeekBar seekBar) {
        int progress = seekBar.getProgress() + this.Q;
        if (progress != this.P) {
            if (a(Integer.valueOf(progress))) {
                y(progress, false);
                return;
            }
            seekBar.setProgress(this.P - this.Q);
            int i = this.P;
            TextView textView = this.V;
            if (textView != null) {
                textView.setText(String.valueOf(i));
            }
        }
    }
}
