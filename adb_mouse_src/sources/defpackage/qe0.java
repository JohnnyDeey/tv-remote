package defpackage;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Looper;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.preference.PreferenceScreen;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import svarzee.android.apps.adb_mouse.R;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public abstract class qe0 extends gx {
    public ve0 X;
    public RecyclerView Y;
    public boolean Z;
    public boolean a0;
    public final pe0 W = new pe0(this);
    public int b0 = R.layout.preference_list_fragment;
    public final g4 c0 = new g4(this, Looper.getMainLooper());
    public final l9 d0 = new l9(9, this);

    @Override // defpackage.gx
    public final void A() {
        this.E = true;
        ve0 ve0Var = this.X;
        ve0Var.h = this;
        ve0Var.i = this;
    }

    @Override // defpackage.gx
    public final void B() {
        this.E = true;
        ve0 ve0Var = this.X;
        ve0Var.h = null;
        ve0Var.i = null;
    }

    @Override // defpackage.gx
    public final void C(Bundle bundle) {
        PreferenceScreen preferenceScreen;
        Bundle bundle2;
        PreferenceScreen preferenceScreen2;
        if (bundle != null && (bundle2 = bundle.getBundle("android:preferences")) != null && (preferenceScreen2 = this.X.g) != null) {
            preferenceScreen2.b(bundle2);
        }
        if (this.Z && (preferenceScreen = this.X.g) != null) {
            this.Y.setAdapter(new te0(preferenceScreen));
            preferenceScreen.j();
        }
        this.a0 = true;
    }

    public abstract void M(String str);

    @Override // defpackage.gx
    public final void u(Bundle bundle) {
        String str;
        super.u(bundle);
        TypedValue typedValue = new TypedValue();
        H().getTheme().resolveAttribute(R.attr.preferenceTheme, typedValue, true);
        int i = typedValue.resourceId;
        if (i == 0) {
            i = R.style.PreferenceThemeOverlay;
        }
        H().getTheme().applyStyle(i, false);
        ve0 ve0Var = new ve0(H());
        this.X = ve0Var;
        ve0Var.j = this;
        Bundle bundle2 = this.h;
        if (bundle2 != null) {
            str = bundle2.getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT");
        } else {
            str = null;
        }
        M(str);
    }

    @Override // defpackage.gx
    public final View v(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        RecyclerView recyclerView;
        TypedArray obtainStyledAttributes = H().obtainStyledAttributes(null, kg0.h, R.attr.preferenceFragmentCompatStyle, 0);
        this.b0 = obtainStyledAttributes.getResourceId(0, this.b0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, -1);
        boolean z = obtainStyledAttributes.getBoolean(3, true);
        obtainStyledAttributes.recycle();
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(H());
        View inflate = cloneInContext.inflate(this.b0, viewGroup, false);
        View findViewById = inflate.findViewById(android.R.id.list_container);
        if (findViewById instanceof ViewGroup) {
            ViewGroup viewGroup2 = (ViewGroup) findViewById;
            if (!H().getPackageManager().hasSystemFeature("android.hardware.type.automotive") || (recyclerView = (RecyclerView) viewGroup2.findViewById(R.id.recycler_view)) == null) {
                recyclerView = (RecyclerView) cloneInContext.inflate(R.layout.preference_recyclerview, viewGroup2, false);
                H();
                recyclerView.setLayoutManager(new LinearLayoutManager(1));
                recyclerView.setAccessibilityDelegateCompat(new we0(recyclerView));
            }
            this.Y = recyclerView;
            pe0 pe0Var = this.W;
            recyclerView.g(pe0Var);
            if (drawable != null) {
                pe0Var.getClass();
                pe0Var.b = drawable.getIntrinsicHeight();
            } else {
                pe0Var.b = 0;
            }
            pe0Var.a = drawable;
            qe0 qe0Var = pe0Var.d;
            RecyclerView recyclerView2 = qe0Var.Y;
            if (recyclerView2.q.size() != 0) {
                oh0 oh0Var = recyclerView2.o;
                if (oh0Var != null) {
                    oh0Var.c("Cannot invalidate item decorations during a scroll or layout");
                }
                recyclerView2.N();
                recyclerView2.requestLayout();
            }
            if (dimensionPixelSize != -1) {
                pe0Var.b = dimensionPixelSize;
                RecyclerView recyclerView3 = qe0Var.Y;
                if (recyclerView3.q.size() != 0) {
                    oh0 oh0Var2 = recyclerView3.o;
                    if (oh0Var2 != null) {
                        oh0Var2.c("Cannot invalidate item decorations during a scroll or layout");
                    }
                    recyclerView3.N();
                    recyclerView3.requestLayout();
                }
            }
            pe0Var.c = z;
            if (this.Y.getParent() == null) {
                viewGroup2.addView(this.Y);
            }
            this.c0.post(this.d0);
            return inflate;
        }
        c.o("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
        return null;
    }

    @Override // defpackage.gx
    public void w() {
        l9 l9Var = this.d0;
        g4 g4Var = this.c0;
        g4Var.removeCallbacks(l9Var);
        g4Var.removeMessages(1);
        if (this.Z) {
            this.Y.setAdapter(null);
            PreferenceScreen preferenceScreen = this.X.g;
            if (preferenceScreen != null) {
                preferenceScreen.n();
            }
        }
        this.Y = null;
        this.E = true;
    }

    @Override // defpackage.gx
    public final void z(Bundle bundle) {
        PreferenceScreen preferenceScreen = this.X.g;
        if (preferenceScreen != null) {
            Bundle bundle2 = new Bundle();
            preferenceScreen.c(bundle2);
            bundle.putBundle("android:preferences", bundle2);
        }
    }
}
