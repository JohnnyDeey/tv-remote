package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;
import svarzee.android.apps.adb_mouse.R;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class l60 extends BaseAdapter {
    public int a = -1;
    public final /* synthetic */ m60 b;

    public l60(m60 m60Var) {
        this.b = m60Var;
        a();
    }

    public final void a() {
        w90 w90Var = this.b.e;
        z90 z90Var = w90Var.v;
        if (z90Var != null) {
            w90Var.i();
            ArrayList arrayList = w90Var.j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((z90) arrayList.get(i)) == z90Var) {
                    this.a = i;
                    return;
                }
            }
        }
        this.a = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final z90 getItem(int i) {
        m60 m60Var = this.b;
        w90 w90Var = m60Var.e;
        w90Var.i();
        ArrayList arrayList = w90Var.j;
        m60Var.getClass();
        int i2 = this.a;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (z90) arrayList.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        m60 m60Var = this.b;
        w90 w90Var = m60Var.e;
        w90Var.i();
        int size = w90Var.j.size();
        m60Var.getClass();
        if (this.a < 0) {
            return size;
        }
        return size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.b.d.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((na0) view).c(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
