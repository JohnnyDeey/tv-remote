package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.preference.EditTextPreference;
import java.util.ArrayList;
import svarzee.android.apps.adb_mouse.R;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final /* synthetic */ class in0 implements vy {
    public final /* synthetic */ View c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ ln0 e;
    public final /* synthetic */ LinearLayout f;
    public final /* synthetic */ int g;
    public final /* synthetic */ EditTextPreference h;
    public final /* synthetic */ j4 i;

    public /* synthetic */ in0(View view, ArrayList arrayList, ln0 ln0Var, LinearLayout linearLayout, int i, EditTextPreference editTextPreference, j4 j4Var) {
        this.c = view;
        this.d = arrayList;
        this.e = ln0Var;
        this.f = linearLayout;
        this.g = i;
        this.h = editTextPreference;
        this.i = j4Var;
    }

    @Override // defpackage.vy
    public final Object h(Object obj) {
        final String str = (String) obj;
        View view = this.c;
        if (view.getVisibility() != 0) {
            view.setVisibility(0);
        }
        this.d.add(str);
        ln0 ln0Var = this.e;
        LayoutInflater layoutInflater = ln0Var.L;
        if (layoutInflater == null) {
            layoutInflater = ln0Var.F();
        }
        ViewGroup viewGroup = this.f;
        View inflate = layoutInflater.inflate(R.layout.ip_search_item, viewGroup, false);
        inflate.getClass();
        TextView textView = (TextView) inflate;
        textView.setText(str + ':' + this.g);
        final EditTextPreference editTextPreference = this.h;
        final j4 j4Var = this.i;
        textView.setOnClickListener(new View.OnClickListener() { // from class: jn0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                EditTextPreference editTextPreference2 = EditTextPreference.this;
                String str2 = str;
                editTextPreference2.y(str2);
                editTextPreference2.a(str2);
                j4Var.dismiss();
            }
        });
        viewGroup.addView(textView);
        return nw0.a;
    }
}
