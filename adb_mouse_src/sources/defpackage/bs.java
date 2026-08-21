package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import svarzee.android.apps.adb_mouse.R;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class bs extends hu {
    public final int e;
    public final int f;
    public final TimeInterpolator g;
    public AutoCompleteTextView h;
    public final ph i;
    public final qh j;
    public final as k;
    public boolean l;
    public boolean m;
    public boolean n;
    public long o;
    public AccessibilityManager p;
    public ValueAnimator q;
    public ValueAnimator r;

    /* JADX WARN: Type inference failed for: r0v2, types: [as] */
    public bs(gu guVar) {
        super(guVar);
        int i = 1;
        this.i = new ph(i, this);
        this.j = new qh(this, i);
        this.k = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: as
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z) {
                int i2;
                bs bsVar = bs.this;
                AutoCompleteTextView autoCompleteTextView = bsVar.h;
                if (autoCompleteTextView == null || autoCompleteTextView.getInputType() != 0) {
                    return;
                }
                CheckableImageButton checkableImageButton = bsVar.d;
                if (z) {
                    i2 = 2;
                } else {
                    i2 = 1;
                }
                checkableImageButton.setImportantForAccessibility(i2);
            }
        };
        this.o = Long.MAX_VALUE;
        this.f = wv0.U(guVar.getContext(), R.attr.motionDurationShort3, 67);
        this.e = wv0.U(guVar.getContext(), R.attr.motionDurationShort3, 50);
        this.g = wv0.V(guVar.getContext(), R.attr.motionEasingLinearInterpolator, x4.a);
    }

    @Override // defpackage.hu
    public final void a() {
        if (this.p.isTouchExplorationEnabled() && this.h.getInputType() != 0 && !this.d.hasFocus()) {
            this.h.dismissDropDown();
        }
        this.h.post(new x2(7, this));
    }

    @Override // defpackage.hu
    public final int c() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // defpackage.hu
    public final int d() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // defpackage.hu
    public final View.OnFocusChangeListener e() {
        return this.j;
    }

    @Override // defpackage.hu
    public final View.OnClickListener f() {
        return this.i;
    }

    @Override // defpackage.hu
    public final AccessibilityManager.TouchExplorationStateChangeListener h() {
        return this.k;
    }

    @Override // defpackage.hu
    public final boolean i(int i) {
        if (i != 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.hu
    public final boolean k() {
        return this.n;
    }

    @Override // defpackage.hu
    public final void l(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            this.h = autoCompleteTextView;
            autoCompleteTextView.setOnTouchListener(new View.OnTouchListener() { // from class: yr
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    if (motionEvent.getAction() == 1) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        bs bsVar = bs.this;
                        long j = uptimeMillis - bsVar.o;
                        if (j < 0 || j > 300) {
                            bsVar.m = false;
                        }
                        bsVar.t();
                        bsVar.m = true;
                        bsVar.o = SystemClock.uptimeMillis();
                    }
                    return false;
                }
            });
            this.h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: zr
                @Override // android.widget.AutoCompleteTextView.OnDismissListener
                public final void onDismiss() {
                    bs bsVar = bs.this;
                    bsVar.m = true;
                    bsVar.o = SystemClock.uptimeMillis();
                    bsVar.s(false);
                }
            });
            this.h.setThreshold(0);
            TextInputLayout textInputLayout = this.a;
            textInputLayout.setErrorIconDrawable((Drawable) null);
            if (editText.getInputType() == 0 && this.p.isTouchExplorationEnabled()) {
                this.d.setImportantForAccessibility(2);
            }
            textInputLayout.setEndIconVisible(true);
            return;
        }
        f40.f("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    @Override // defpackage.hu
    public final void m(s1 s1Var) {
        boolean e;
        AccessibilityNodeInfo accessibilityNodeInfo = s1Var.a;
        if (this.h.getInputType() == 0) {
            s1Var.i(Spinner.class.getName());
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            e = accessibilityNodeInfo.isShowingHintText();
        } else {
            e = s1Var.e(4);
        }
        if (e) {
            if (i >= 26) {
                accessibilityNodeInfo.setHintText(null);
            } else {
                accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", null);
            }
        }
    }

    @Override // defpackage.hu
    public final void n(AccessibilityEvent accessibilityEvent) {
        boolean z;
        if (!this.p.isEnabled() || this.h.getInputType() != 0) {
            return;
        }
        if ((accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.n && !this.h.isPopupShowing()) {
            z = true;
        } else {
            z = false;
        }
        if (accessibilityEvent.getEventType() == 1 || z) {
            t();
            this.m = true;
            this.o = SystemClock.uptimeMillis();
        }
    }

    @Override // defpackage.hu
    public final void q() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.g;
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.setDuration(this.f);
        int i = 1;
        ofFloat.addUpdateListener(new cp(i, this));
        this.r = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat2.setInterpolator(timeInterpolator);
        ofFloat2.setDuration(this.e);
        ofFloat2.addUpdateListener(new cp(i, this));
        this.q = ofFloat2;
        ofFloat2.addListener(new g2(2, this));
        this.p = (AccessibilityManager) this.c.getSystemService("accessibility");
    }

    @Override // defpackage.hu
    public final void r() {
        AutoCompleteTextView autoCompleteTextView = this.h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.h.setOnDismissListener(null);
        }
    }

    public final void s(boolean z) {
        if (this.n != z) {
            this.n = z;
            this.r.cancel();
            this.q.start();
        }
    }

    public final void t() {
        if (this.h == null) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis() - this.o;
        if (uptimeMillis < 0 || uptimeMillis > 300) {
            this.m = false;
        }
        if (!this.m) {
            s(!this.n);
            boolean z = this.n;
            AutoCompleteTextView autoCompleteTextView = this.h;
            if (z) {
                autoCompleteTextView.requestFocus();
                this.h.showDropDown();
                return;
            } else {
                autoCompleteTextView.dismissDropDown();
                return;
            }
        }
        this.m = false;
    }
}
