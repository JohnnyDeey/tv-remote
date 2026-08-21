package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class on0 {
    public f20 a = new Object();
    public f20 b = new Object();
    public f20 c = new Object();
    public f20 d = new Object();
    public al e = new k0(0.0f);
    public al f = new k0(0.0f);
    public al g = new k0(0.0f);
    public al h = new k0(0.0f);
    public os i = new Object();
    public os j = new Object();
    public os k = new Object();
    public os l = new Object();

    public static nn0 a(Context context, int i, int i2, k0 k0Var) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i2 != 0) {
            contextThemeWrapper.getTheme().applyStyle(i2, true);
        }
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(mg0.A);
        try {
            int i3 = obtainStyledAttributes.getInt(0, 0);
            int i4 = obtainStyledAttributes.getInt(3, i3);
            int i5 = obtainStyledAttributes.getInt(4, i3);
            int i6 = obtainStyledAttributes.getInt(2, i3);
            int i7 = obtainStyledAttributes.getInt(1, i3);
            al c = c(obtainStyledAttributes, 5, k0Var);
            al c2 = c(obtainStyledAttributes, 8, c);
            al c3 = c(obtainStyledAttributes, 9, c);
            al c4 = c(obtainStyledAttributes, 7, c);
            al c5 = c(obtainStyledAttributes, 6, c);
            nn0 nn0Var = new nn0();
            nn0Var.a = wv0.t(i4);
            nn0Var.e = c2;
            nn0Var.b = wv0.t(i5);
            nn0Var.f = c3;
            nn0Var.c = wv0.t(i6);
            nn0Var.g = c4;
            nn0Var.d = wv0.t(i7);
            nn0Var.h = c5;
            return nn0Var;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static nn0 b(Context context, AttributeSet attributeSet, int i, int i2) {
        k0 k0Var = new k0(0.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, mg0.t, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return a(context, resourceId, resourceId2, k0Var);
    }

    public static al c(TypedArray typedArray, int i, al alVar) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue != null) {
            int i2 = peekValue.type;
            if (i2 == 5) {
                return new k0(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i2 == 6) {
                return new yi0(peekValue.getFraction(1.0f, 1.0f));
            }
        }
        return alVar;
    }

    public final boolean d() {
        if ((this.b instanceof zj0) && (this.a instanceof zj0) && (this.c instanceof zj0) && (this.d instanceof zj0)) {
            return true;
        }
        return false;
    }

    public final boolean e(RectF rectF) {
        boolean z;
        boolean z2;
        if (this.l.getClass().equals(os.class) && this.j.getClass().equals(os.class) && this.i.getClass().equals(os.class) && this.k.getClass().equals(os.class)) {
            z = true;
        } else {
            z = false;
        }
        float a = this.e.a(rectF);
        if (this.f.a(rectF) == a && this.h.a(rectF) == a && this.g.a(rectF) == a) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z || !z2 || !d()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [nn0, java.lang.Object] */
    public final nn0 f() {
        ?? obj = new Object();
        obj.a = this.a;
        obj.b = this.b;
        obj.c = this.c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f = this.f;
        obj.g = this.g;
        obj.h = this.h;
        obj.i = this.i;
        obj.j = this.j;
        obj.k = this.k;
        obj.l = this.l;
        return obj;
    }

    public final String toString() {
        return "[" + this.e + ", " + this.f + ", " + this.g + ", " + this.h + "]";
    }
}
