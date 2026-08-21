package defpackage;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.DecelerateInterpolator;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.Scroller;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.datepicker.c;
import java.util.ArrayList;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class c90<S> extends wd0 {
    public int X;
    public xe Y;
    public wa0 Z;
    public int a0;
    public r6 b0;
    public RecyclerView c0;
    public RecyclerView d0;
    public View e0;
    public View f0;
    public View g0;
    public View h0;
    public MaterialButton i0;
    public AccessibilityManager j0;

    public final void M(wa0 wa0Var) {
        boolean z;
        c cVar = (c) this.d0.getAdapter();
        int d = cVar.d.c.d(wa0Var);
        AccessibilityManager accessibilityManager = this.j0;
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            this.Z = wa0Var;
            this.d0.a0(d);
        } else {
            int d2 = d - cVar.d.c.d(this.Z);
            boolean z2 = false;
            if (Math.abs(d2) > 3) {
                z = true;
            } else {
                z = false;
            }
            if (d2 > 0) {
                z2 = true;
            }
            this.Z = wa0Var;
            int i = 2;
            if (z && z2) {
                this.d0.a0(d - 3);
                this.d0.post(new af(d, i, this));
            } else {
                RecyclerView recyclerView = this.d0;
                if (z) {
                    recyclerView.a0(d + 3);
                    this.d0.post(new af(d, i, this));
                } else {
                    recyclerView.post(new af(d, i, this));
                }
            }
        }
        O(d);
    }

    public final void N(int i) {
        this.a0 = i;
        if (i == 2) {
            this.c0.getLayoutManager().o0(this.Z.e - ((q21) this.c0.getAdapter()).d.Y.c.e);
            this.g0.setVisibility(0);
            this.h0.setVisibility(8);
            this.e0.setVisibility(8);
            this.f0.setVisibility(8);
            return;
        }
        if (i == 1) {
            this.g0.setVisibility(8);
            this.h0.setVisibility(0);
            this.e0.setVisibility(0);
            this.f0.setVisibility(0);
            M(this.Z);
        }
    }

    public final void O(int i) {
        boolean z;
        View view = this.f0;
        boolean z2 = false;
        if (i + 1 < this.d0.getAdapter().a()) {
            z = true;
        } else {
            z = false;
        }
        view.setEnabled(z);
        View view2 = this.e0;
        if (i - 1 >= 0) {
            z2 = true;
        }
        view2.setEnabled(z2);
    }

    @Override // defpackage.gx
    public final void u(Bundle bundle) {
        super.u(bundle);
        if (bundle == null) {
            bundle = this.h;
        }
        this.X = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("GRID_SELECTOR_KEY") == null) {
            this.Y = (xe) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
            if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") == null) {
                this.Z = (wa0) bundle.getParcelable("CURRENT_MONTH_KEY");
                return;
            } else {
                c.a();
                return;
            }
        }
        c.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v12, types: [lh0, java.lang.Object] */
    @Override // defpackage.gx
    public final View v(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i;
        int i2;
        kn knVar;
        sd0 sd0Var;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(h(), this.X);
        this.b0 = new r6((Context) contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        this.j0 = (AccessibilityManager) H().getSystemService("accessibility");
        wa0 wa0Var = this.Y.c;
        int i3 = 0;
        int i4 = 1;
        if (h90.P(contextThemeWrapper, R.attr.windowFullscreen)) {
            i = svarzee.android.apps.adb_mouse.R.layout.mtrl_calendar_vertical;
            i2 = 1;
        } else {
            i = svarzee.android.apps.adb_mouse.R.layout.mtrl_calendar_horizontal;
            i2 = 0;
        }
        View inflate = cloneInContext.inflate(i, viewGroup, false);
        Resources resources = H().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(svarzee.android.apps.adb_mouse.R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(svarzee.android.apps.adb_mouse.R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(svarzee.android.apps.adb_mouse.R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(svarzee.android.apps.adb_mouse.R.dimen.mtrl_calendar_days_of_week_height);
        int i5 = xa0.d;
        inflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(svarzee.android.apps.adb_mouse.R.dimen.mtrl_calendar_month_vertical_padding) * (i5 - 1)) + (resources.getDimensionPixelSize(svarzee.android.apps.adb_mouse.R.dimen.mtrl_calendar_day_height) * i5) + resources.getDimensionPixelOffset(svarzee.android.apps.adb_mouse.R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) inflate.findViewById(svarzee.android.apps.adb_mouse.R.id.mtrl_calendar_days_of_week);
        ry0.m(gridView, new y80(0));
        int i6 = this.Y.g;
        if (i6 > 0) {
            knVar = new kn(i6);
        } else {
            knVar = new kn();
        }
        gridView.setAdapter((ListAdapter) knVar);
        gridView.setNumColumns(wa0Var.f);
        gridView.setEnabled(false);
        this.d0 = (RecyclerView) inflate.findViewById(svarzee.android.apps.adb_mouse.R.id.mtrl_calendar_months);
        this.d0.setLayoutManager(new z80(this, i2, i2));
        this.d0.setTag("MONTHS_VIEW_GROUP_TAG");
        c cVar = new c(contextThemeWrapper, this.Y, new i81(28, this));
        this.d0.setAdapter(cVar);
        int integer = contextThemeWrapper.getResources().getInteger(svarzee.android.apps.adb_mouse.R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView3 = (RecyclerView) inflate.findViewById(svarzee.android.apps.adb_mouse.R.id.mtrl_calendar_year_selector_frame);
        this.c0 = recyclerView3;
        if (recyclerView3 != null) {
            recyclerView3.setHasFixedSize(true);
            this.c0.setLayoutManager(new GridLayoutManager(integer));
            this.c0.setAdapter(new q21(this));
            RecyclerView recyclerView4 = this.c0;
            ?? obj = new Object();
            dx0.c(null);
            dx0.c(null);
            recyclerView4.g(obj);
        }
        View findViewById = inflate.findViewById(svarzee.android.apps.adb_mouse.R.id.month_navigation_fragment_toggle);
        xe xeVar = cVar.d;
        if (findViewById != null) {
            MaterialButton materialButton = (MaterialButton) inflate.findViewById(svarzee.android.apps.adb_mouse.R.id.month_navigation_fragment_toggle);
            this.i0 = materialButton;
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            ry0.m(this.i0, new sg(2, this));
            View findViewById2 = inflate.findViewById(svarzee.android.apps.adb_mouse.R.id.month_navigation_previous);
            this.e0 = findViewById2;
            findViewById2.setTag("NAVIGATION_PREV_TAG");
            View findViewById3 = inflate.findViewById(svarzee.android.apps.adb_mouse.R.id.month_navigation_next);
            this.f0 = findViewById3;
            findViewById3.setTag("NAVIGATION_NEXT_TAG");
            this.g0 = inflate.findViewById(svarzee.android.apps.adb_mouse.R.id.mtrl_calendar_year_selector_frame);
            this.h0 = inflate.findViewById(svarzee.android.apps.adb_mouse.R.id.mtrl_calendar_day_selector_frame);
            N(1);
            this.i0.setText(this.Z.c());
            this.d0.h(new b90(this, cVar));
            this.i0.setOnClickListener(new f2(2, this));
            this.f0.setOnClickListener(new x80(this, cVar, i4));
            this.e0.setOnClickListener(new x80(this, cVar, i3));
            O(xeVar.c.d(this.Z));
        }
        if (!h90.P(contextThemeWrapper, R.attr.windowFullscreen) && (recyclerView2 = (sd0Var = new sd0()).a) != (recyclerView = this.d0)) {
            ko0 ko0Var = sd0Var.b;
            if (recyclerView2 != null) {
                ArrayList arrayList = recyclerView2.j0;
                if (arrayList != null) {
                    arrayList.remove(ko0Var);
                }
                sd0Var.a.setOnFlingListener(null);
            }
            sd0Var.a = recyclerView;
            if (recyclerView != null) {
                if (recyclerView.getOnFlingListener() == null) {
                    sd0Var.a.h(ko0Var);
                    sd0Var.a.setOnFlingListener(sd0Var);
                    new Scroller(sd0Var.a.getContext(), new DecelerateInterpolator());
                    sd0Var.f();
                } else {
                    c.o("An instance of OnFlingListener already set.");
                    return null;
                }
            }
        }
        this.d0.a0(xeVar.c.d(this.Z));
        ry0.m(this.d0, new y80(1));
        return inflate;
    }

    @Override // defpackage.gx
    public final void z(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.X);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.Y);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.Z);
    }
}
