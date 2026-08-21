package com.google.android.material.datepicker;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import defpackage.di0;
import defpackage.dx0;
import defpackage.gh0;
import defpackage.h90;
import defpackage.i81;
import defpackage.ph0;
import defpackage.wa0;
import defpackage.xa0;
import defpackage.xe;
import java.util.Calendar;
import svarzee.android.apps.adb_mouse.R;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class c extends gh0 {
    public final xe d;
    public final i81 e;
    public final int f;

    public c(ContextThemeWrapper contextThemeWrapper, xe xeVar, i81 i81Var) {
        int i;
        wa0 wa0Var = xeVar.c;
        wa0 wa0Var2 = xeVar.d;
        wa0 wa0Var3 = xeVar.f;
        if (wa0Var.c.compareTo(wa0Var3.c) <= 0) {
            if (wa0Var3.c.compareTo(wa0Var2.c) <= 0) {
                int dimensionPixelSize = contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * xa0.d;
                if (h90.P(contextThemeWrapper, android.R.attr.windowFullscreen)) {
                    i = contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height);
                } else {
                    i = 0;
                }
                this.f = dimensionPixelSize + i;
                this.d = xeVar;
                this.e = i81Var;
                f(true);
                return;
            }
            defpackage.c.k("currentPage cannot be after lastPage");
            throw null;
        }
        defpackage.c.k("firstPage cannot be after currentPage");
        throw null;
    }

    @Override // defpackage.gh0
    public final int a() {
        return this.d.i;
    }

    @Override // defpackage.gh0
    public final long b(int i) {
        Calendar a = dx0.a(this.d.c.c);
        a.add(2, i);
        a.set(5, 1);
        Calendar a2 = dx0.a(a);
        a2.get(2);
        a2.get(1);
        a2.getMaximum(7);
        a2.getActualMaximum(5);
        a2.getTimeInMillis();
        return a2.getTimeInMillis();
    }

    @Override // defpackage.gh0
    public final void d(di0 di0Var, int i) {
        b bVar = (b) di0Var;
        xe xeVar = this.d;
        Calendar a = dx0.a(xeVar.c.c);
        a.add(2, i);
        wa0 wa0Var = new wa0(a);
        bVar.u.setText(wa0Var.c());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) bVar.v.findViewById(R.id.month_grid);
        if (materialCalendarGridView.a() != null && wa0Var.equals(materialCalendarGridView.a().a)) {
            materialCalendarGridView.invalidate();
            materialCalendarGridView.a().getClass();
            throw null;
        }
        new xa0(wa0Var, xeVar);
        throw null;
    }

    @Override // defpackage.gh0
    public final di0 e(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (h90.P(viewGroup.getContext(), android.R.attr.windowFullscreen)) {
            linearLayout.setLayoutParams(new ph0(-1, this.f));
            return new b(linearLayout, true);
        }
        return new b(linearLayout, false);
    }
}
