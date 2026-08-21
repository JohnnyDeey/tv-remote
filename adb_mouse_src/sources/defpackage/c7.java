package defpackage;

import android.view.View;
import android.widget.AdapterView;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class c7 implements AdapterView.OnItemClickListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ c7(int i, Object obj) {
        this.c = i;
        this.d = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        Object item;
        CharSequence convertSelectionToString;
        int selectedItemPosition;
        int i2 = this.c;
        Object obj = this.d;
        switch (i2) {
            case 0:
                e7 e7Var = (e7) obj;
                h7 h7Var = e7Var.I;
                h7Var.setSelection(i);
                if (h7Var.getOnItemClickListener() != null) {
                    h7Var.performItemClick(view, i, e7Var.F.getItemId(i));
                }
                e7Var.dismiss();
                return;
            default:
                s80 s80Var = (s80) obj;
                t60 t60Var = s80Var.g;
                if (i < 0) {
                    if (!t60Var.B.isShowing()) {
                        item = null;
                    } else {
                        item = t60Var.e.getSelectedItem();
                    }
                } else {
                    item = s80Var.getAdapter().getItem(i);
                }
                convertSelectionToString = s80Var.convertSelectionToString(item);
                s80Var.setText(convertSelectionToString, false);
                AdapterView.OnItemClickListener onItemClickListener = s80Var.getOnItemClickListener();
                if (onItemClickListener != null) {
                    if (view == null || i < 0) {
                        if (!t60Var.B.isShowing()) {
                            view = null;
                        } else {
                            view = t60Var.e.getSelectedView();
                        }
                        if (!t60Var.B.isShowing()) {
                            selectedItemPosition = -1;
                        } else {
                            selectedItemPosition = t60Var.e.getSelectedItemPosition();
                        }
                        i = selectedItemPosition;
                        if (!t60Var.B.isShowing()) {
                            j = Long.MIN_VALUE;
                        } else {
                            j = t60Var.e.getSelectedItemId();
                        }
                    }
                    onItemClickListener.onItemClick(t60Var.e, view, i, j);
                }
                t60Var.dismiss();
                return;
        }
    }
}
