package defpackage;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Constructor;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public class a8 {
    public static final Class[] b = {Context.class, AttributeSet.class};
    public static final int[] c = {R.attr.onClick};
    public static final int[] d = {R.attr.accessibilityHeading};
    public static final int[] e = {R.attr.accessibilityPaneTitle};
    public static final int[] f = {R.attr.screenReaderFocusable};
    public static final String[] g = {"android.widget.", "android.view.", "android.webkit."};
    public static final io0 h = new io0(0);
    public final Object[] a = new Object[2];

    public g5 a(Context context, AttributeSet attributeSet) {
        return new g5(context, attributeSet);
    }

    public h5 b(Context context, AttributeSet attributeSet) {
        return new h5(context, attributeSet, svarzee.android.apps.adb_mouse.R.attr.buttonStyle);
    }

    public j5 c(Context context, AttributeSet attributeSet) {
        return new j5(context, attributeSet, svarzee.android.apps.adb_mouse.R.attr.checkboxStyle);
    }

    public s6 d(Context context, AttributeSet attributeSet) {
        return new s6(context, attributeSet);
    }

    public s7 e(Context context, AttributeSet attributeSet) {
        return new s7(context, attributeSet);
    }

    public final View f(Context context, String str, String str2) {
        String concat;
        io0 io0Var = h;
        Constructor constructor = (Constructor) io0Var.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    concat = str2.concat(str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                concat = str;
            }
            constructor = Class.forName(concat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(b);
            io0Var.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.a);
    }
}
