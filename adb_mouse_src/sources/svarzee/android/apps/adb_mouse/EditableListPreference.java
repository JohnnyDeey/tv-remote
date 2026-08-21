package svarzee.android.apps.adb_mouse;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import androidx.preference.ListPreference;
import defpackage.i81;
import defpackage.rs;
import defpackage.ve0;
import defpackage.xe0;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class EditableListPreference extends ListPreference {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditableListPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    @Override // androidx.preference.Preference
    public final void l(xe0 xe0Var) {
        super.l(xe0Var);
        Context context = this.c;
        SharedPreferences sharedPreferences = context.getSharedPreferences(ve0.a(context), 0);
        sharedPreferences.getClass();
        i81 i81Var = new i81(12, sharedPreferences);
        View view = xe0Var.a;
        ((Button) view.findViewById(R.id.list_preference_add_button)).setOnClickListener(new rs(this, i81Var));
        ((Button) view.findViewById(R.id.list_preference_delete_button)).setOnClickListener(new rs(i81Var, this, 1));
    }
}
