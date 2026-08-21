package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public class k90 extends Drawable.ConstantState {
    public on0 a;
    public rp0 b;
    public us c;
    public ColorStateList d;
    public ColorStateList e;
    public ColorStateList f;
    public PorterDuff.Mode g;
    public Rect h;
    public final float i;
    public float j;
    public float k;
    public int l;
    public float m;
    public float n;
    public int o;
    public int p;
    public final Paint.Style q;

    public k90(k90 k90Var) {
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = PorterDuff.Mode.SRC_IN;
        this.h = null;
        this.i = 1.0f;
        this.j = 1.0f;
        this.l = 255;
        this.m = 0.0f;
        this.n = 0.0f;
        this.o = 0;
        this.p = 0;
        this.q = Paint.Style.FILL_AND_STROKE;
        this.a = k90Var.a;
        this.b = k90Var.b;
        this.c = k90Var.c;
        this.k = k90Var.k;
        this.d = k90Var.d;
        this.e = k90Var.e;
        this.g = k90Var.g;
        this.f = k90Var.f;
        this.l = k90Var.l;
        this.i = k90Var.i;
        this.p = k90Var.p;
        this.j = k90Var.j;
        this.m = k90Var.m;
        this.n = k90Var.n;
        this.o = k90Var.o;
        this.q = k90Var.q;
        if (k90Var.h != null) {
            this.h = new Rect(k90Var.h);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        m90 m90Var = new m90(this);
        m90Var.h = true;
        m90Var.i = true;
        return m90Var;
    }

    public k90(on0 on0Var) {
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = PorterDuff.Mode.SRC_IN;
        this.h = null;
        this.i = 1.0f;
        this.j = 1.0f;
        this.l = 255;
        this.m = 0.0f;
        this.n = 0.0f;
        this.o = 0;
        this.p = 0;
        this.q = Paint.Style.FILL_AND_STROKE;
        this.a = on0Var;
        this.c = null;
    }
}
