package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import svarzee.android.apps.adb_mouse.R;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class xa0 extends BaseAdapter {
    public static final int d = dx0.c(null).getMaximum(4);
    public static final int e = (dx0.c(null).getMaximum(7) + dx0.c(null).getMaximum(5)) - 1;
    public final wa0 a;
    public r6 b;
    public final xe c;

    public xa0(wa0 wa0Var, xe xeVar) {
        this.a = wa0Var;
        this.c = xeVar;
        throw null;
    }

    public final int a() {
        int i = this.c.g;
        wa0 wa0Var = this.a;
        Calendar calendar = wa0Var.c;
        int i2 = calendar.get(7);
        if (i <= 0) {
            i = calendar.getFirstDayOfWeek();
        }
        int i3 = i2 - i;
        if (i3 < 0) {
            return i3 + wa0Var.f;
        }
        return i3;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Long getItem(int i) {
        if (i >= a() && i <= c()) {
            int a = (i - a()) + 1;
            Calendar a2 = dx0.a(this.a.c);
            a2.set(5, a);
            return Long.valueOf(a2.getTimeInMillis());
        }
        return null;
    }

    public final int c() {
        return (a() + this.a.g) - 1;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return e;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i / this.a.f;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        if (this.b == null) {
            this.b = new r6(context);
        }
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day, viewGroup, false);
        }
        int a = i - a();
        if (a >= 0) {
            wa0 wa0Var = this.a;
            if (a < wa0Var.g) {
                textView.setTag(wa0Var);
                textView.setText(String.format(textView.getResources().getConfiguration().locale, "%d", Integer.valueOf(a + 1)));
                textView.setVisibility(0);
                textView.setEnabled(true);
                if (getItem(i) == null || textView == null) {
                    return textView;
                }
                textView.getContext();
                dx0.b().getTimeInMillis();
                throw null;
            }
        }
        textView.setVisibility(8);
        textView.setEnabled(false);
        if (getItem(i) == null) {
            textView.getContext();
            dx0.b().getTimeInMillis();
            throw null;
        }
        return textView;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
