package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class o7 {
    public final TextView a;
    public as0 b;
    public as0 c;
    public as0 d;
    public as0 e;
    public as0 f;
    public as0 g;
    public as0 h;
    public final x7 i;
    public int j = 0;
    public int k = -1;
    public Typeface l;
    public boolean m;

    public o7(TextView textView) {
        this.a = textView;
        this.i = new x7(textView);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, as0] */
    public static as0 c(Context context, j6 j6Var, int i) {
        ColorStateList f;
        synchronized (j6Var) {
            f = j6Var.a.f(context, i);
        }
        if (f != null) {
            ?? obj = new Object();
            obj.d = true;
            obj.e = f;
            return obj;
        }
        return null;
    }

    public static void h(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        int i;
        int i2;
        CharSequence subSequence;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 30 && inputConnection != null) {
            CharSequence text = textView.getText();
            if (i3 >= 30) {
                n1.f(editorInfo, text);
                return;
            }
            text.getClass();
            if (i3 >= 30) {
                n1.f(editorInfo, text);
                return;
            }
            int i4 = editorInfo.initialSelStart;
            int i5 = editorInfo.initialSelEnd;
            if (i4 > i5) {
                i = i5;
            } else {
                i = i4;
            }
            if (i4 <= i5) {
                i4 = i5;
            }
            int length = text.length();
            if (i >= 0 && i4 <= length) {
                int i6 = editorInfo.inputType & 4095;
                if (i6 != 129 && i6 != 225 && i6 != 18) {
                    if (length <= 2048) {
                        k20.h0(editorInfo, text, i, i4);
                        return;
                    }
                    int i7 = i4 - i;
                    if (i7 > 1024) {
                        i2 = 0;
                    } else {
                        i2 = i7;
                    }
                    int i8 = 2048 - i2;
                    int min = Math.min(text.length() - i4, i8 - Math.min(i, (int) (i8 * 0.8d)));
                    int min2 = Math.min(i, i8 - min);
                    int i9 = i - min2;
                    if (Character.isLowSurrogate(text.charAt(i9))) {
                        i9++;
                        min2--;
                    }
                    if (Character.isHighSurrogate(text.charAt((i4 + min) - 1))) {
                        min--;
                    }
                    int i10 = min2 + i2;
                    int i11 = i10 + min;
                    if (i2 != i7) {
                        subSequence = TextUtils.concat(text.subSequence(i9, i9 + min2), text.subSequence(i4, min + i4));
                    } else {
                        subSequence = text.subSequence(i9, i11 + i9);
                    }
                    k20.h0(editorInfo, subSequence, min2, i10);
                    return;
                }
                k20.h0(editorInfo, null, 0, 0);
                return;
            }
            k20.h0(editorInfo, null, 0, 0);
        }
    }

    public final void a(Drawable drawable, as0 as0Var) {
        if (drawable != null && as0Var != null) {
            j6.e(drawable, as0Var, this.a.getDrawableState());
        }
    }

    public final void b() {
        as0 as0Var = this.b;
        TextView textView = this.a;
        if (as0Var != null || this.c != null || this.d != null || this.e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.b);
            a(compoundDrawables[1], this.c);
            a(compoundDrawables[2], this.d);
            a(compoundDrawables[3], this.e);
        }
        if (this.f == null && this.g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f);
        a(compoundDrawablesRelative[2], this.g);
    }

    public final ColorStateList d() {
        as0 as0Var = this.h;
        if (as0Var != null) {
            return (ColorStateList) as0Var.e;
        }
        return null;
    }

    public final PorterDuff.Mode e() {
        as0 as0Var = this.h;
        if (as0Var != null) {
            return (PorterDuff.Mode) as0Var.f;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:172:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:187:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(android.util.AttributeSet r24, int r25) {
        /*
            Method dump skipped, instructions count: 980
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o7.f(android.util.AttributeSet, int):void");
    }

    public final void g(Context context, int i) {
        String string;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, ng0.w);
        b8 b8Var = new b8(context, obtainStyledAttributes);
        boolean hasValue = obtainStyledAttributes.hasValue(14);
        TextView textView = this.a;
        if (hasValue) {
            textView.setAllCaps(obtainStyledAttributes.getBoolean(14, false));
        }
        if (obtainStyledAttributes.hasValue(0) && obtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        n(context, b8Var);
        if (Build.VERSION.SDK_INT >= 26 && obtainStyledAttributes.hasValue(13) && (string = obtainStyledAttributes.getString(13)) != null) {
            m7.d(textView, string);
        }
        b8Var.N();
        Typeface typeface = this.l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.j);
        }
    }

    public final void i(int i, int i2, int i3, int i4) {
        x7 x7Var = this.i;
        if (x7Var.j()) {
            DisplayMetrics displayMetrics = x7Var.j.getResources().getDisplayMetrics();
            x7Var.k(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (x7Var.h()) {
                x7Var.a();
            }
        }
    }

    public final void j(int[] iArr, int i) {
        x7 x7Var = this.i;
        if (x7Var.j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = x7Var.j.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArr2[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                x7Var.f = x7.b(iArr2);
                if (!x7Var.i()) {
                    c.j(Arrays.toString(iArr), "None of the preset sizes is valid: ");
                    return;
                }
            } else {
                x7Var.g = false;
            }
            if (x7Var.h()) {
                x7Var.a();
            }
        }
    }

    public final void k(int i) {
        x7 x7Var = this.i;
        if (x7Var.j()) {
            if (i != 0) {
                if (i == 1) {
                    DisplayMetrics displayMetrics = x7Var.j.getResources().getDisplayMetrics();
                    x7Var.k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                    if (x7Var.h()) {
                        x7Var.a();
                        return;
                    }
                    return;
                }
                c.k(qo0.m("Unknown auto-size text type: ", i));
                return;
            }
            x7Var.a = 0;
            x7Var.d = -1.0f;
            x7Var.e = -1.0f;
            x7Var.c = -1.0f;
            x7Var.f = new int[0];
            x7Var.b = false;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, as0] */
    public final void l(ColorStateList colorStateList) {
        boolean z;
        if (this.h == null) {
            this.h = new Object();
        }
        as0 as0Var = this.h;
        as0Var.e = colorStateList;
        if (colorStateList != null) {
            z = true;
        } else {
            z = false;
        }
        as0Var.d = z;
        this.b = as0Var;
        this.c = as0Var;
        this.d = as0Var;
        this.e = as0Var;
        this.f = as0Var;
        this.g = as0Var;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, as0] */
    public final void m(PorterDuff.Mode mode) {
        boolean z;
        if (this.h == null) {
            this.h = new Object();
        }
        as0 as0Var = this.h;
        as0Var.f = mode;
        if (mode != null) {
            z = true;
        } else {
            z = false;
        }
        as0Var.c = z;
        this.b = as0Var;
        this.c = as0Var;
        this.d = as0Var;
        this.e = as0Var;
        this.f = as0Var;
        this.g = as0Var;
    }

    public final void n(Context context, b8 b8Var) {
        String string;
        boolean z;
        boolean z2;
        int i = this.j;
        TypedArray typedArray = (TypedArray) b8Var.d;
        this.j = typedArray.getInt(2, i);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            int i3 = typedArray.getInt(11, -1);
            this.k = i3;
            if (i3 != -1) {
                this.j &= 2;
            }
        }
        int i4 = 10;
        boolean z3 = false;
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.m = false;
                int i5 = typedArray.getInt(1, 1);
                if (i5 != 1) {
                    if (i5 != 2) {
                        if (i5 == 3) {
                            this.l = Typeface.MONOSPACE;
                            return;
                        }
                        return;
                    }
                    this.l = Typeface.SERIF;
                    return;
                }
                this.l = Typeface.SANS_SERIF;
                return;
            }
            return;
        }
        this.l = null;
        if (typedArray.hasValue(12)) {
            i4 = 12;
        }
        int i6 = this.k;
        int i7 = this.j;
        if (!context.isRestricted()) {
            try {
                Typeface B = b8Var.B(i4, this.j, new j7(this, i6, i7, new WeakReference(this.a)));
                if (B != null) {
                    if (i2 >= 28 && this.k != -1) {
                        Typeface create = Typeface.create(B, 0);
                        int i8 = this.k;
                        if ((this.j & 2) != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        this.l = n7.a(create, i8, z2);
                    } else {
                        this.l = B;
                    }
                }
                if (this.l == null) {
                    z = true;
                } else {
                    z = false;
                }
                this.m = z;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.l == null && (string = typedArray.getString(i4)) != null) {
            if (Build.VERSION.SDK_INT >= 28 && this.k != -1) {
                Typeface create2 = Typeface.create(string, 0);
                int i9 = this.k;
                if ((this.j & 2) != 0) {
                    z3 = true;
                }
                this.l = n7.a(create2, i9, z3);
                return;
            }
            this.l = Typeface.create(string, this.j);
        }
    }
}
