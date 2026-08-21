package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsetsController;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import svarzee.android.apps.adb_mouse.R;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public class h90<S> extends kq {
    public int A0;
    public CharSequence B0;
    public TextView C0;
    public CheckableImageButton D0;
    public m90 E0;
    public boolean F0;
    public CharSequence G0;
    public CharSequence H0;
    public final LinkedHashSet k0;
    public final LinkedHashSet l0;
    public int m0;
    public wd0 n0;
    public xe o0;
    public c90 p0;
    public int q0;
    public CharSequence r0;
    public boolean s0;
    public int t0;
    public int u0;
    public CharSequence v0;
    public int w0;
    public CharSequence x0;
    public int y0;
    public CharSequence z0;

    public h90() {
        new LinkedHashSet();
        new LinkedHashSet();
        this.k0 = new LinkedHashSet();
        this.l0 = new LinkedHashSet();
    }

    public static int O(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Calendar b = dx0.b();
        b.set(5, 1);
        Calendar a = dx0.a(b);
        a.get(2);
        a.get(1);
        int maximum = a.getMaximum(7);
        a.getActualMaximum(5);
        a.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    public static boolean P(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(mn.N(R.attr.materialCalendarStyle, context, c90.class.getCanonicalName()).data, new int[]{i});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.kq, defpackage.gx
    public final void A() {
        CharSequence charSequence;
        Integer num;
        boolean z;
        int i;
        boolean z2;
        WindowInsetsController insetsController;
        n11 n11Var;
        WindowInsetsController insetsController2;
        n11 n11Var2;
        WindowInsetsController insetsController3;
        WindowInsetsController insetsController4;
        super.A();
        Dialog dialog = this.f0;
        if (dialog != null) {
            Window window = dialog.getWindow();
            if (this.s0) {
                window.setLayout(-1, -1);
                window.setBackgroundDrawable(this.E0);
                if (!this.F0) {
                    View findViewById = I().findViewById(R.id.fullscreen_header);
                    ColorStateList y = f20.y(findViewById.getBackground());
                    if (y != null) {
                        num = Integer.valueOf(y.getDefaultColor());
                    } else {
                        num = null;
                    }
                    boolean z3 = false;
                    if (num != null && num.intValue() != 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                    int w = f20.w(window.getContext(), android.R.attr.colorBackground, -16777216);
                    if (z) {
                        num = Integer.valueOf(w);
                    }
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 35) {
                        n1.e(window, false);
                    } else if (i2 >= 30) {
                        n1.d(window, false);
                    } else {
                        View decorView = window.getDecorView();
                        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 1792);
                    }
                    window.getContext();
                    Context context = window.getContext();
                    if (i2 < 27) {
                        i = oi.d(f20.w(context, android.R.attr.navigationBarColor, -16777216), 128);
                    } else {
                        i = 0;
                    }
                    window.setStatusBarColor(0);
                    window.setNavigationBarColor(i);
                    boolean L = f20.L(num.intValue());
                    if (!f20.L(0) && !L) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    g00 g00Var = new g00(window.getDecorView());
                    int i3 = Build.VERSION.SDK_INT;
                    if (i3 >= 35) {
                        insetsController4 = window.getInsetsController();
                        q11 q11Var = new q11(insetsController4, g00Var);
                        q11Var.e = window;
                        n11Var = q11Var;
                    } else if (i3 >= 30) {
                        insetsController = window.getInsetsController();
                        q11 q11Var2 = new q11(insetsController, g00Var);
                        q11Var2.e = window;
                        n11Var = q11Var2;
                    } else if (i3 >= 26) {
                        n11Var = new n11(window, g00Var);
                    } else {
                        n11Var = new n11(window, g00Var);
                    }
                    n11Var.z(z2);
                    boolean L2 = f20.L(w);
                    if (f20.L(i) || (i == 0 && L2)) {
                        z3 = true;
                    }
                    g00 g00Var2 = new g00(window.getDecorView());
                    int i4 = Build.VERSION.SDK_INT;
                    if (i4 >= 35) {
                        insetsController3 = window.getInsetsController();
                        q11 q11Var3 = new q11(insetsController3, g00Var2);
                        q11Var3.e = window;
                        n11Var2 = q11Var3;
                    } else if (i4 >= 30) {
                        insetsController2 = window.getInsetsController();
                        q11 q11Var4 = new q11(insetsController2, g00Var2);
                        q11Var4.e = window;
                        n11Var2 = q11Var4;
                    } else if (i4 >= 26) {
                        n11Var2 = new n11(window, g00Var2);
                    } else {
                        n11Var2 = new n11(window, g00Var2);
                    }
                    n11Var2.y(z3);
                    g90 g90Var = new g90(findViewById, findViewById.getLayoutParams().height, findViewById.getPaddingLeft(), findViewById.getPaddingTop(), findViewById.getPaddingRight());
                    WeakHashMap weakHashMap = ry0.a;
                    jy0.c(findViewById, g90Var);
                    this.F0 = true;
                }
            } else {
                window.setLayout(-2, -2);
                int dimensionPixelOffset = k().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
                Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
                window.setBackgroundDrawable(new InsetDrawable((Drawable) this.E0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
                View decorView2 = window.getDecorView();
                Dialog dialog2 = this.f0;
                if (dialog2 != null) {
                    decorView2.setOnTouchListener(new c20(dialog2, rect));
                } else {
                    throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
                }
            }
            H();
            int i5 = this.m0;
            if (i5 != 0) {
                N();
                xe xeVar = this.o0;
                c90 c90Var = new c90();
                Bundle bundle = new Bundle();
                bundle.putInt("THEME_RES_ID_KEY", i5);
                bundle.putParcelable("GRID_SELECTOR_KEY", null);
                bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", xeVar);
                bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
                bundle.putParcelable("CURRENT_MONTH_KEY", xeVar.f);
                c90Var.K(bundle);
                this.p0 = c90Var;
                wd0 wd0Var = c90Var;
                if (this.t0 == 1) {
                    N();
                    xe xeVar2 = this.o0;
                    wd0 n90Var = new n90();
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt("THEME_RES_ID_KEY", i5);
                    bundle2.putParcelable("DATE_SELECTOR_KEY", null);
                    bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", xeVar2);
                    n90Var.K(bundle2);
                    wd0Var = n90Var;
                }
                this.n0 = wd0Var;
                TextView textView = this.C0;
                if (this.t0 == 1 && k().getConfiguration().orientation == 2) {
                    charSequence = this.H0;
                } else {
                    charSequence = this.G0;
                }
                textView.setText(charSequence);
                N();
                throw null;
            }
            N();
            throw null;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    @Override // defpackage.kq, defpackage.gx
    public final void B() {
        this.n0.W.clear();
        super.B();
    }

    @Override // defpackage.kq
    public final Dialog M() {
        Context H = H();
        H();
        int i = this.m0;
        if (i != 0) {
            Dialog dialog = new Dialog(H, i);
            Context context = dialog.getContext();
            this.s0 = P(context, android.R.attr.windowFullscreen);
            this.E0 = new m90(context, null, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, mg0.o, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
            int color = obtainStyledAttributes.getColor(1, 0);
            obtainStyledAttributes.recycle();
            this.E0.k(context);
            this.E0.n(ColorStateList.valueOf(color));
            this.E0.m(dialog.getWindow().getDecorView().getElevation());
            return dialog;
        }
        N();
        throw null;
    }

    public final void N() {
        if (this.h.getParcelable("DATE_SELECTOR_KEY") == null) {
            return;
        }
        c.a();
    }

    @Override // defpackage.kq, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.k0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // defpackage.kq, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.l0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) this.G;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // defpackage.kq, defpackage.gx
    public final void u(Bundle bundle) {
        super.u(bundle);
        if (bundle == null) {
            bundle = this.h;
        }
        this.m0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") == null) {
            this.o0 = (xe) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
            if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") == null) {
                this.q0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
                this.r0 = bundle.getCharSequence("TITLE_TEXT_KEY");
                this.t0 = bundle.getInt("INPUT_MODE_KEY");
                this.u0 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
                this.v0 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
                this.w0 = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
                this.x0 = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
                this.y0 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
                this.z0 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
                this.A0 = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
                this.B0 = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
                CharSequence charSequence = this.r0;
                if (charSequence == null) {
                    charSequence = H().getResources().getText(this.q0);
                }
                this.G0 = charSequence;
                if (charSequence != null) {
                    CharSequence[] split = TextUtils.split(String.valueOf(charSequence), "\n");
                    if (split.length > 1) {
                        charSequence = split[0];
                    }
                } else {
                    charSequence = null;
                }
                this.H0 = charSequence;
                return;
            }
            c.a();
            return;
        }
        c.a();
    }

    @Override // defpackage.gx
    public final View v(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i;
        String string;
        if (this.s0) {
            i = R.layout.mtrl_picker_fullscreen;
        } else {
            i = R.layout.mtrl_picker_dialog;
        }
        View inflate = layoutInflater.inflate(i, viewGroup);
        Context context = inflate.getContext();
        if (this.s0) {
            inflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(O(context), -2));
        } else {
            inflate.findViewById(R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(O(context), -1));
        }
        ((TextView) inflate.findViewById(R.id.mtrl_picker_header_selection_text)).setAccessibilityLiveRegion(1);
        this.D0 = (CheckableImageButton) inflate.findViewById(R.id.mtrl_picker_header_toggle);
        this.C0 = (TextView) inflate.findViewById(R.id.mtrl_picker_title_text);
        this.D0.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.D0;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, r21.r(context, R.drawable.material_ic_calendar_black_24dp));
        boolean z = false;
        stateListDrawable.addState(new int[0], r21.r(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        CheckableImageButton checkableImageButton2 = this.D0;
        if (this.t0 != 0) {
            z = true;
        }
        checkableImageButton2.setChecked(z);
        ry0.m(this.D0, null);
        CheckableImageButton checkableImageButton3 = this.D0;
        if (this.t0 == 1) {
            string = checkableImageButton3.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode);
        } else {
            string = checkableImageButton3.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode);
        }
        this.D0.setContentDescription(string);
        this.D0.setOnClickListener(new ph(3, this));
        N();
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, we] */
    @Override // defpackage.kq, defpackage.gx
    public final void z(Bundle bundle) {
        wa0 wa0Var;
        wa0 b;
        super.z(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.m0);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        xe xeVar = this.o0;
        ?? obj = new Object();
        long j = xeVar.c.h;
        long j2 = xeVar.d.h;
        obj.a = Long.valueOf(xeVar.f.h);
        int i = xeVar.g;
        jn jnVar = xeVar.e;
        c90 c90Var = this.p0;
        if (c90Var == null) {
            wa0Var = null;
        } else {
            wa0Var = c90Var.Z;
        }
        if (wa0Var != null) {
            obj.a = Long.valueOf(wa0Var.h);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", jnVar);
        wa0 b2 = wa0.b(j);
        wa0 b3 = wa0.b(j2);
        jn jnVar2 = (jn) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l = obj.a;
        if (l == null) {
            b = null;
        } else {
            b = wa0.b(l.longValue());
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new xe(b2, b3, jnVar2, b, i));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.q0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.r0);
        bundle.putInt("INPUT_MODE_KEY", this.t0);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.u0);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.v0);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.w0);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.x0);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.y0);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.z0);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.A0);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.B0);
    }
}
