package defpackage;

import android.R;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.preference.DialogPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public abstract class oe0 extends kq implements DialogInterface.OnClickListener {
    public DialogPreference k0;
    public CharSequence l0;
    public CharSequence m0;
    public CharSequence n0;
    public CharSequence o0;
    public int p0;
    public BitmapDrawable q0;
    public int r0;

    @Override // defpackage.kq
    public final Dialog M() {
        this.r0 = -2;
        f61 f61Var = new f61(H());
        CharSequence charSequence = this.l0;
        f4 f4Var = (f4) f61Var.d;
        f4Var.d = charSequence;
        f4Var.c = this.q0;
        f4Var.g = this.m0;
        f4Var.h = this;
        f4Var.i = this.n0;
        f4Var.j = this;
        H();
        int i = this.p0;
        View view = null;
        if (i != 0) {
            LayoutInflater layoutInflater = this.L;
            if (layoutInflater == null) {
                layoutInflater = F();
            }
            view = layoutInflater.inflate(i, (ViewGroup) null);
        }
        if (view != null) {
            O(view);
            f4Var.p = view;
        } else {
            f4Var.f = this.o0;
        }
        Q(f61Var);
        j4 b = f61Var.b();
        if (this instanceof qs) {
            Window window = b.getWindow();
            if (Build.VERSION.SDK_INT >= 30) {
                ne0.a(window);
                return b;
            }
            qs qsVar = (qs) this;
            qsVar.v0 = SystemClock.currentThreadTimeMillis();
            qsVar.R();
        }
        return b;
    }

    public final DialogPreference N() {
        PreferenceScreen preferenceScreen;
        if (this.k0 == null) {
            Bundle bundle = this.h;
            Preference preference = null;
            if (bundle != null) {
                String string = bundle.getString("key");
                ve0 ve0Var = ((qe0) m(true)).X;
                if (ve0Var != null && (preferenceScreen = ve0Var.g) != null) {
                    preference = preferenceScreen.y(string);
                }
                this.k0 = (DialogPreference) preference;
            } else {
                c.e(this, " does not have any arguments.", "Fragment ");
                return null;
            }
        }
        return this.k0;
    }

    public void O(View view) {
        int i;
        View findViewById = view.findViewById(R.id.message);
        if (findViewById != null) {
            CharSequence charSequence = this.o0;
            if (!TextUtils.isEmpty(charSequence)) {
                if (findViewById instanceof TextView) {
                    ((TextView) findViewById).setText(charSequence);
                }
                i = 0;
            } else {
                i = 8;
            }
            if (findViewById.getVisibility() != i) {
                findViewById.setVisibility(i);
            }
        }
    }

    public abstract void P(boolean z);

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.r0 = i;
    }

    @Override // defpackage.kq, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        boolean z;
        super.onDismiss(dialogInterface);
        if (this.r0 == -1) {
            z = true;
        } else {
            z = false;
        }
        P(z);
    }

    @Override // defpackage.kq, defpackage.gx
    public void u(Bundle bundle) {
        PreferenceScreen preferenceScreen;
        super.u(bundle);
        gx m = m(true);
        if (m instanceof qe0) {
            qe0 qe0Var = (qe0) m;
            Bundle bundle2 = this.h;
            if (bundle2 != null) {
                String string = bundle2.getString("key");
                if (bundle == null) {
                    ve0 ve0Var = qe0Var.X;
                    Preference preference = null;
                    if (ve0Var != null && (preferenceScreen = ve0Var.g) != null) {
                        preference = preferenceScreen.y(string);
                    }
                    DialogPreference dialogPreference = (DialogPreference) preference;
                    this.k0 = dialogPreference;
                    this.l0 = dialogPreference.P;
                    this.m0 = dialogPreference.S;
                    this.n0 = dialogPreference.T;
                    this.o0 = dialogPreference.Q;
                    this.p0 = dialogPreference.U;
                    Drawable drawable = dialogPreference.R;
                    if (drawable != null && !(drawable instanceof BitmapDrawable)) {
                        Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                        drawable.draw(canvas);
                        this.q0 = new BitmapDrawable(k(), createBitmap);
                        return;
                    }
                    this.q0 = (BitmapDrawable) drawable;
                    return;
                }
                this.l0 = bundle.getCharSequence("PreferenceDialogFragment.title");
                this.m0 = bundle.getCharSequence("PreferenceDialogFragment.positiveText");
                this.n0 = bundle.getCharSequence("PreferenceDialogFragment.negativeText");
                this.o0 = bundle.getCharSequence("PreferenceDialogFragment.message");
                this.p0 = bundle.getInt("PreferenceDialogFragment.layout", 0);
                Bitmap bitmap = (Bitmap) bundle.getParcelable("PreferenceDialogFragment.icon");
                if (bitmap != null) {
                    this.q0 = new BitmapDrawable(k(), bitmap);
                    return;
                }
                return;
            }
            c.e(this, " does not have any arguments.", "Fragment ");
            return;
        }
        c.o("Target fragment must implement TargetFragment interface");
    }

    @Override // defpackage.kq, defpackage.gx
    public void z(Bundle bundle) {
        super.z(bundle);
        bundle.putCharSequence("PreferenceDialogFragment.title", this.l0);
        bundle.putCharSequence("PreferenceDialogFragment.positiveText", this.m0);
        bundle.putCharSequence("PreferenceDialogFragment.negativeText", this.n0);
        bundle.putCharSequence("PreferenceDialogFragment.message", this.o0);
        bundle.putInt("PreferenceDialogFragment.layout", this.p0);
        BitmapDrawable bitmapDrawable = this.q0;
        if (bitmapDrawable != null) {
            bundle.putParcelable("PreferenceDialogFragment.icon", bitmapDrawable.getBitmap());
        }
    }

    public void Q(f61 f61Var) {
    }
}
