package defpackage;

import android.content.Context;
import android.view.View;
import android.view.Window;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.datepicker.c;
import java.util.Calendar;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class x80 implements View.OnClickListener {
    public final /* synthetic */ int c;
    public final Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: Type inference failed for: r0v1, types: [l2, java.lang.Object] */
    public x80(rt0 rt0Var) {
        this.c = 2;
        this.e = rt0Var;
        Context context = rt0Var.a.getContext();
        CharSequence charSequence = rt0Var.h;
        ?? obj = new Object();
        obj.e = 4096;
        obj.g = 4096;
        obj.l = null;
        obj.m = null;
        obj.n = false;
        obj.o = false;
        obj.p = 16;
        obj.i = context;
        obj.a = charSequence;
        this.d = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int H;
        int i = this.c;
        Object obj = this.d;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                c90 c90Var = (c90) obj2;
                int L0 = ((LinearLayoutManager) c90Var.d0.getLayoutManager()).L0() - 1;
                Calendar a = dx0.a(((c) obj).d.c.c);
                a.add(2, L0);
                c90Var.M(new wa0(a));
                return;
            case 1:
                c90 c90Var2 = (c90) obj2;
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) c90Var2.d0.getLayoutManager();
                View N0 = linearLayoutManager.N0(0, linearLayoutManager.v(), false);
                if (N0 == null) {
                    H = -1;
                } else {
                    H = oh0.H(N0);
                }
                Calendar a2 = dx0.a(((c) obj).d.c.c);
                a2.add(2, H + 1);
                c90Var2.M(new wa0(a2));
                return;
            default:
                rt0 rt0Var = (rt0) obj2;
                Window.Callback callback = rt0Var.k;
                if (callback != null && rt0Var.l) {
                    callback.onMenuItemSelected(0, (l2) obj);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ x80(c90 c90Var, c cVar, int i) {
        this.c = i;
        this.e = c90Var;
        this.d = cVar;
    }
}
