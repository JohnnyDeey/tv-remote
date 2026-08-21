package defpackage;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.datepicker.c;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class b90 extends rh0 {
    public final /* synthetic */ c a;
    public final /* synthetic */ c90 b;

    public b90(c90 c90Var, c cVar) {
        this.b = c90Var;
        this.a = cVar;
    }

    @Override // defpackage.rh0
    public final void b(RecyclerView recyclerView, int i, int i2) {
        int L0;
        xe xeVar = this.a.d;
        c90 c90Var = this.b;
        RecyclerView recyclerView2 = c90Var.d0;
        if (i < 0) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView2.getLayoutManager();
            View N0 = linearLayoutManager.N0(0, linearLayoutManager.v(), false);
            if (N0 == null) {
                L0 = -1;
            } else {
                L0 = oh0.H(N0);
            }
        } else {
            L0 = ((LinearLayoutManager) recyclerView2.getLayoutManager()).L0();
        }
        Calendar a = dx0.a(xeVar.c.c);
        a.add(2, L0);
        wa0 wa0Var = new wa0(a);
        c90Var.Z = wa0Var;
        MaterialButton materialButton = c90Var.i0;
        Calendar a2 = dx0.a(xeVar.c.c);
        a2.add(2, L0);
        a2.set(5, 1);
        Calendar a3 = dx0.a(a2);
        a3.get(2);
        a3.get(1);
        a3.getMaximum(7);
        a3.getActualMaximum(5);
        a3.getTimeInMillis();
        long timeInMillis = a3.getTimeInMillis();
        Locale locale = Locale.getDefault();
        AtomicReference atomicReference = dx0.a;
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMM", locale);
        instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
        instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
        materialButton.setText(instanceForSkeleton.format(new Date(timeInMillis)));
        c90Var.O(xeVar.c.d(wa0Var));
    }
}
