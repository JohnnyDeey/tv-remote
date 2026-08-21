package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;
import defpackage.c90;
import defpackage.xa0;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class a implements AdapterView.OnItemClickListener {
    public final /* synthetic */ MaterialCalendarGridView c;
    public final /* synthetic */ c d;

    public a(c cVar, MaterialCalendarGridView materialCalendarGridView) {
        this.d = cVar;
        this.c = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        MaterialCalendarGridView materialCalendarGridView = this.c;
        xa0 a = materialCalendarGridView.a();
        if (i >= a.a() && i <= a.c()) {
            if (materialCalendarGridView.a().getItem(i).longValue() < ((c90) this.d.e.d).Y.e.c) {
            } else {
                throw null;
            }
        }
    }
}
