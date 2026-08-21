package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.XmlResourceParser;
import androidx.preference.EditTextPreference;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import androidx.preference.SeekBarPreference;
import androidx.preference.SwitchPreference;
import java.util.Collections;
import java.util.Set;
import svarzee.android.apps.adb_mouse.R;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class ln0 extends qe0 {
    public final ki0 e0 = new ki0("^$|^((25[0-5]|(2[0-4]|1\\d|[1-9]|)\\d)(\\.(?!$)|$)){4}$");
    public rd f0;

    /* JADX WARN: Type inference failed for: r2v6, types: [ii0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [rd, java.lang.Object] */
    @Override // defpackage.qe0
    public final void M(String str) {
        Object mdVar;
        ve0 ve0Var = this.X;
        if (ve0Var != null) {
            Context H = H();
            ve0Var.e = true;
            ue0 ue0Var = new ue0(H, ve0Var);
            XmlResourceParser xml = H.getResources().getXml(R.xml.settings);
            try {
                PreferenceGroup c = ue0Var.c(xml);
                xml.close();
                PreferenceScreen preferenceScreen = (PreferenceScreen) c;
                preferenceScreen.k(ve0Var);
                SharedPreferences.Editor editor = ve0Var.d;
                if (editor != null) {
                    editor.apply();
                }
                int i = 0;
                ve0Var.e = false;
                Preference preference = preferenceScreen;
                if (str != null) {
                    Preference y = preferenceScreen.y(str);
                    boolean z = y instanceof PreferenceScreen;
                    preference = y;
                    if (!z) {
                        c.k(qo0.r("Preference object with key ", str, " is not a PreferenceScreen"));
                        return;
                    }
                }
                PreferenceScreen preferenceScreen2 = (PreferenceScreen) preference;
                ve0 ve0Var2 = this.X;
                PreferenceScreen preferenceScreen3 = ve0Var2.g;
                if (preferenceScreen2 != preferenceScreen3) {
                    if (preferenceScreen3 != null) {
                        preferenceScreen3.n();
                    }
                    ve0Var2.g = preferenceScreen2;
                    this.Z = true;
                    if (this.a0) {
                        g4 g4Var = this.c0;
                        if (!g4Var.hasMessages(1)) {
                            g4Var.obtainMessage(1).sendToTarget();
                        }
                    }
                }
                SharedPreferences c2 = this.X.c();
                c2.getClass();
                final i81 i81Var = new i81(12, c2);
                Preference y2 = this.X.g.y("mouse_sensitivity");
                y2.getClass();
                final SeekBarPreference seekBarPreference = (SeekBarPreference) y2;
                Preference y3 = this.X.g.y("horizontal_orientation");
                y3.getClass();
                final SwitchPreference switchPreference = (SwitchPreference) y3;
                Preference y4 = this.X.g.y("ip");
                y4.getClass();
                final EditTextPreference editTextPreference = (EditTextPreference) y4;
                Preference y5 = this.X.g.y("port");
                y5.getClass();
                final EditTextPreference editTextPreference2 = (EditTextPreference) y5;
                Preference y6 = this.X.g.y("profile");
                y6.getClass();
                ListPreference listPreference = (ListPreference) y6;
                if (i81Var.w().isEmpty()) {
                    Set singleton = Collections.singleton("tv");
                    singleton.getClass();
                    i81Var.E(singleton);
                    c2.edit().putString("profile", "tv").apply();
                    int i2 = c2.getInt("mouse_sensitivity", 50);
                    boolean z2 = c2.getBoolean("horizontal_orientation", false);
                    String string = c2.getString("ip", "");
                    string.getClass();
                    String string2 = c2.getString("port", "5555");
                    string2.getClass();
                    c2.edit().putInt("tv".concat(":mouse_sensitivity"), i2).putBoolean("tv".concat(":horizontal_orientation"), z2).putString("tv".concat(":ip"), string).putString("tv".concat(":port"), string2).apply();
                }
                String[] strArr = (String[]) s8.y0((Comparable[]) i81Var.w().toArray(new String[0]));
                listPreference.H = R.layout.list_preference_buttons;
                String[] strArr2 = strArr;
                listPreference.z(strArr2);
                listPreference.W = strArr2;
                listPreference.A(i81Var.u());
                listPreference.a(i81Var.u());
                Preference y7 = this.X.g.y("supporter_subscription");
                y7.getClass();
                ?? obj = new Object();
                f5 G = G();
                ?? obj2 = new Object();
                obj2.c = G;
                ld ldVar = new ld(G);
                ldVar.c = obj2;
                ldVar.b = new g00(12);
                if (((rd) ldVar.c) != null) {
                    if (((g00) ldVar.b) != null) {
                        ((g00) ldVar.b).getClass();
                        rd rdVar = (rd) ldVar.c;
                        g00 g00Var = (g00) ldVar.b;
                        if (rdVar != null) {
                            rd rdVar2 = (rd) ldVar.c;
                            if (ldVar.a()) {
                                mdVar = new n61(g00Var, G, rdVar2, ldVar);
                            } else {
                                mdVar = new md(g00Var, G, rdVar2, ldVar);
                            }
                        } else if (ldVar.a()) {
                            mdVar = new n61(g00Var, G, ldVar);
                        } else {
                            mdVar = new md(g00Var, G, ldVar);
                        }
                        obj2.d = mdVar;
                        obj2.g = new dn0(obj, y7, this);
                        ((md) obj2.d).d(new i81(9, (Object) obj2));
                        this.f0 = obj2;
                        y7.h = new bl0(obj, 1, this);
                        Preference y8 = this.X.g.y("show_help");
                        if (y8 != null) {
                            y8.h = new sf(5, this);
                        }
                        Preference y9 = this.X.g.y("search_automatically");
                        if (y9 != null) {
                            y9.h = new go(this, editTextPreference, i81Var, 4);
                        }
                        listPreference.g = new je0() { // from class: en0
                            @Override // defpackage.je0
                            public final boolean a(Preference preference2, Object obj3) {
                                if (obj3 instanceof String) {
                                    nf0 v = i81.this.v((String) obj3);
                                    seekBarPreference.y(v.a, true);
                                    switchPreference.y(v.b);
                                    editTextPreference.y(v.c);
                                    editTextPreference2.y(v.d);
                                    return true;
                                }
                                return false;
                            }
                        };
                        seekBarPreference.g = new fn0(i81Var, this, i);
                        switchPreference.g = new fn0(i81Var, this, 1);
                        editTextPreference.g = new fn0(this, i81Var);
                        editTextPreference2.g = new fn0(i81Var, this, 3);
                        return;
                    }
                    c.k("Pending purchases for one-time products must be supported.");
                    throw null;
                }
                c.k("Please provide a valid listener for purchases updates.");
                throw null;
            } catch (Throwable th) {
                xml.close();
                throw th;
            }
        }
        f40.f("This should be called after super.onCreate.");
    }

    public final void N(String str) {
        Context h = h();
        h.getClass();
        f61 f61Var = new f61(h);
        String l = l(R.string.invalid_input);
        f4 f4Var = (f4) f61Var.d;
        f4Var.d = l;
        f4Var.f = str;
        f61Var.d(android.R.string.ok, null);
        f61Var.f();
    }

    @Override // defpackage.qe0, defpackage.gx
    public final void w() {
        super.w();
        rd rdVar = this.f0;
        if (rdVar != null) {
            rdVar.g = null;
            ((md) rdVar.d).a();
        }
        this.f0 = null;
    }
}
