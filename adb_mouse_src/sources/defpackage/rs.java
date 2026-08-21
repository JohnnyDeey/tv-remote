package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.InputFilter;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import svarzee.android.apps.adb_mouse.App;
import svarzee.android.apps.adb_mouse.EditableListPreference;
import svarzee.android.apps.adb_mouse.MainActivity;
import svarzee.android.apps.adb_mouse.R;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final /* synthetic */ class rs implements View.OnClickListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ i81 d;
    public final /* synthetic */ Object e;

    public /* synthetic */ rs(EditableListPreference editableListPreference, i81 i81Var) {
        this.c = 0;
        this.e = editableListPreference;
        this.d = i81Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        Object next;
        int i = 0;
        switch (this.c) {
            case 0:
                EditableListPreference editableListPreference = (EditableListPreference) this.e;
                i81 i81Var = this.d;
                Context context = editableListPreference.c;
                View inflate = View.inflate(context, R.layout.edit_text_dialog_layout, null);
                EditText editText = (EditText) inflate.findViewById(R.id.dialog_edit_text);
                editText.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(32)});
                f61 f61Var = new f61(context);
                f61Var.e(R.string.profile_name);
                ((f4) f61Var.d).p = inflate;
                f61Var.d(android.R.string.ok, new ss(editText, i81Var, editableListPreference, i));
                f61Var.c();
                f61Var.f();
                return;
            case 1:
                i81 i81Var2 = this.d;
                EditableListPreference editableListPreference2 = (EditableListPreference) this.e;
                Set w = i81Var2.w();
                if (w.size() > 1) {
                    String u = i81Var2.u();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : w) {
                        if (!k20.c((String) obj, u)) {
                            arrayList.add(obj);
                        }
                    }
                    Set q0 = gi.q0(arrayList);
                    if (!q0.isEmpty()) {
                        if (q0 instanceof List) {
                            List list = (List) q0;
                            if (!list.isEmpty()) {
                                next = list.get(0);
                            } else {
                                throw new NoSuchElementException("List is empty.");
                            }
                        } else {
                            Iterator it = q0.iterator();
                            if (it.hasNext()) {
                                next = it.next();
                            } else {
                                throw new NoSuchElementException("Collection is empty.");
                            }
                        }
                        str = (String) next;
                    } else {
                        str = "";
                    }
                    i81Var2.E(q0);
                    editableListPreference2.A(str);
                    editableListPreference2.a(str);
                    editableListPreference2.V = (CharSequence[]) s8.y0((Comparable[]) q0.toArray(new String[0]));
                    editableListPreference2.W = (CharSequence[]) s8.y0((Comparable[]) q0.toArray(new String[0]));
                    ((SharedPreferences) i81Var2.d).edit().remove(u.concat(":mouse_sensitivity")).remove(u.concat(":horizontal_orientation")).remove(u.concat(":ip")).remove(u.concat(":port")).apply();
                    return;
                }
                return;
            default:
                i81 i81Var3 = this.d;
                MainActivity mainActivity = (MainActivity) this.e;
                int i2 = MainActivity.E;
                view.performHapticFeedback(1);
                if (!((SharedPreferences) i81Var3.d).getBoolean("dont_show_paste_mode_info", false)) {
                    boolean z = App.c;
                    if (!App.d) {
                        View inflate2 = View.inflate(mainActivity, R.layout.checkbox_dialog, null);
                        ((CheckBox) inflate2.findViewById(R.id.checkbox_dialog_checkbox)).setOnCheckedChangeListener(new i80(i, i81Var3));
                        ((TextView) inflate2.findViewById(R.id.checkbox_dialog_text)).setText(mainActivity.getString(R.string.paste_info_text));
                        f61 f61Var2 = new f61(mainActivity);
                        f61Var2.e(R.string.tip);
                        ((f4) f61Var2.d).p = inflate2;
                        f61Var2.d(android.R.string.ok, null);
                        f61Var2.f();
                        App.d = true;
                        return;
                    }
                }
                Object systemService = mainActivity.getWindow().getDecorView().getContext().getSystemService("input_method");
                systemService.getClass();
                ((InputMethodManager) systemService).showSoftInput(mainActivity.getWindow().getDecorView(), 0);
                return;
        }
    }

    public /* synthetic */ rs(i81 i81Var, Object obj, int i) {
        this.c = i;
        this.d = i81Var;
        this.e = obj;
    }
}
