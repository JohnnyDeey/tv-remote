package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class te0 extends gh0 {
    public final PreferenceGroup d;
    public ArrayList e;
    public ArrayList f;
    public final ArrayList g;
    public final l9 i = new l9(10, this);
    public final Handler h = new Handler(Looper.getMainLooper());

    public te0(PreferenceGroup preferenceGroup) {
        this.d = preferenceGroup;
        preferenceGroup.I = this;
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = new ArrayList();
        if (preferenceGroup instanceof PreferenceScreen) {
            f(((PreferenceScreen) preferenceGroup).V);
        } else {
            f(true);
        }
        j();
    }

    @Override // defpackage.gh0
    public final int a() {
        return this.f.size();
    }

    @Override // defpackage.gh0
    public final long b(int i) {
        if (!this.b) {
            return -1L;
        }
        return i(i).d();
    }

    @Override // defpackage.gh0
    public final int c(int i) {
        se0 se0Var = new se0(i(i));
        ArrayList arrayList = this.g;
        int indexOf = arrayList.indexOf(se0Var);
        if (indexOf != -1) {
            return indexOf;
        }
        int size = arrayList.size();
        arrayList.add(se0Var);
        return size;
    }

    @Override // defpackage.gh0
    public final void d(di0 di0Var, int i) {
        xe0 xe0Var = (xe0) di0Var;
        Preference i2 = i(i);
        ColorStateList colorStateList = xe0Var.v;
        View view = xe0Var.a;
        Drawable background = view.getBackground();
        Drawable drawable = xe0Var.u;
        if (background != drawable) {
            WeakHashMap weakHashMap = ry0.a;
            view.setBackground(drawable);
        }
        TextView textView = (TextView) xe0Var.q(R.id.title);
        if (textView != null && colorStateList != null && !textView.getTextColors().equals(colorStateList)) {
            textView.setTextColor(colorStateList);
        }
        i2.l(xe0Var);
    }

    @Override // defpackage.gh0
    public final di0 e(ViewGroup viewGroup, int i) {
        se0 se0Var = (se0) this.g.get(i);
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        TypedArray obtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes((AttributeSet) null, kg0.a);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        if (drawable == null) {
            drawable = r21.r(viewGroup.getContext(), R.drawable.list_selector_background);
        }
        obtainStyledAttributes.recycle();
        View inflate = from.inflate(se0Var.a, viewGroup, false);
        if (inflate.getBackground() == null) {
            WeakHashMap weakHashMap = ry0.a;
            inflate.setBackground(drawable);
        }
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(R.id.widget_frame);
        if (viewGroup2 != null) {
            int i2 = se0Var.b;
            if (i2 != 0) {
                from.inflate(i2, viewGroup2);
            } else {
                viewGroup2.setVisibility(8);
            }
        }
        return new xe0(inflate);
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, androidx.preference.Preference, vu] */
    public final ArrayList g(PreferenceGroup preferenceGroup) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = preferenceGroup.Q.size();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            CharSequence charSequence = null;
            if (i2 < size) {
                Preference z = preferenceGroup.z(i2);
                if (z.y) {
                    int i4 = preferenceGroup.U;
                    if (i4 != Integer.MAX_VALUE && i3 >= i4) {
                        arrayList2.add(z);
                    } else {
                        arrayList.add(z);
                    }
                    if (!(z instanceof PreferenceGroup)) {
                        i3++;
                    } else {
                        PreferenceGroup preferenceGroup2 = (PreferenceGroup) z;
                        if (preferenceGroup2 instanceof PreferenceScreen) {
                            continue;
                        } else {
                            if (preferenceGroup.U != Integer.MAX_VALUE && preferenceGroup2.U != Integer.MAX_VALUE) {
                                c.o("Nesting an expandable group inside of another expandable group is not supported!");
                                return null;
                            }
                            ArrayList g = g(preferenceGroup2);
                            int size2 = g.size();
                            int i5 = 0;
                            while (i5 < size2) {
                                Object obj = g.get(i5);
                                i5++;
                                Preference preference = (Preference) obj;
                                int i6 = preferenceGroup.U;
                                if (i6 != Integer.MAX_VALUE && i3 >= i6) {
                                    arrayList2.add(preference);
                                } else {
                                    arrayList.add(preference);
                                }
                                i3++;
                            }
                        }
                    }
                }
                i2++;
            } else {
                int i7 = preferenceGroup.U;
                if (i7 != Integer.MAX_VALUE && i3 > i7) {
                    Context context = preferenceGroup.c;
                    long j = preferenceGroup.e;
                    ?? preference2 = new Preference(context, null);
                    preference2.G = svarzee.android.apps.adb_mouse.R.layout.expand_button;
                    Context context2 = preference2.c;
                    Drawable r = r21.r(context2, svarzee.android.apps.adb_mouse.R.drawable.ic_arrow_down_24dp);
                    if (preference2.m != r) {
                        preference2.m = r;
                        preference2.l = 0;
                        preference2.h();
                    }
                    preference2.l = svarzee.android.apps.adb_mouse.R.drawable.ic_arrow_down_24dp;
                    String string = context2.getString(svarzee.android.apps.adb_mouse.R.string.expand_button_title);
                    if (!TextUtils.equals(string, preference2.j)) {
                        preference2.j = string;
                        preference2.h();
                    }
                    if (999 != preference2.i) {
                        preference2.i = 999;
                        te0 te0Var = preference2.I;
                        if (te0Var != null) {
                            Handler handler = te0Var.h;
                            l9 l9Var = te0Var.i;
                            handler.removeCallbacks(l9Var);
                            handler.post(l9Var);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList();
                    int size3 = arrayList2.size();
                    while (i < size3) {
                        Object obj2 = arrayList2.get(i);
                        i++;
                        Preference preference3 = (Preference) obj2;
                        CharSequence charSequence2 = preference3.j;
                        boolean z2 = preference3 instanceof PreferenceGroup;
                        if (z2 && !TextUtils.isEmpty(charSequence2)) {
                            arrayList3.add((PreferenceGroup) preference3);
                        }
                        if (arrayList3.contains(preference3.K)) {
                            if (z2) {
                                arrayList3.add((PreferenceGroup) preference3);
                            }
                        } else if (!TextUtils.isEmpty(charSequence2)) {
                            if (charSequence == null) {
                                charSequence = charSequence2;
                            } else {
                                charSequence = context2.getString(svarzee.android.apps.adb_mouse.R.string.summary_collapsed_preference_list, charSequence, charSequence2);
                            }
                        }
                    }
                    preference2.v(charSequence);
                    preference2.P = j + 1000000;
                    preference2.h = new r6(this, 27, preferenceGroup);
                    arrayList.add(preference2);
                }
                return arrayList;
            }
        }
    }

    public final void h(ArrayList arrayList, PreferenceGroup preferenceGroup) {
        synchronized (preferenceGroup) {
            Collections.sort(preferenceGroup.Q);
        }
        int size = preferenceGroup.Q.size();
        for (int i = 0; i < size; i++) {
            Preference z = preferenceGroup.z(i);
            arrayList.add(z);
            se0 se0Var = new se0(z);
            if (!this.g.contains(se0Var)) {
                this.g.add(se0Var);
            }
            if (z instanceof PreferenceGroup) {
                PreferenceGroup preferenceGroup2 = (PreferenceGroup) z;
                if (!(preferenceGroup2 instanceof PreferenceScreen)) {
                    h(arrayList, preferenceGroup2);
                }
            }
            z.I = this;
        }
    }

    public final Preference i(int i) {
        if (i >= 0 && i < this.f.size()) {
            return (Preference) this.f.get(i);
        }
        return null;
    }

    public final void j() {
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((Preference) obj).I = null;
        }
        ArrayList arrayList2 = new ArrayList(this.e.size());
        this.e = arrayList2;
        PreferenceGroup preferenceGroup = this.d;
        h(arrayList2, preferenceGroup);
        this.f = g(preferenceGroup);
        this.a.b();
        ArrayList arrayList3 = this.e;
        int size2 = arrayList3.size();
        while (i < size2) {
            Object obj2 = arrayList3.get(i);
            i++;
            ((Preference) obj2).getClass();
        }
    }
}
