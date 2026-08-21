package defpackage;

import android.content.SharedPreferences;
import android.widget.CompoundButton;
import com.google.android.material.chip.Chip;
import svarzee.android.apps.adb_mouse.MainActivity;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final /* synthetic */ class i80 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i80(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                int i2 = MainActivity.E;
                compoundButton.getClass();
                ((SharedPreferences) ((i81) obj).d).edit().putBoolean("dont_show_paste_mode_info", z).apply();
                return;
            case 1:
                int i3 = MainActivity.E;
                compoundButton.getClass();
                ((SharedPreferences) ((i81) obj).d).edit().putBoolean("dont_show_readme", z).apply();
                return;
            default:
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = ((Chip) obj).k;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z);
                    return;
                }
                return;
        }
    }
}
