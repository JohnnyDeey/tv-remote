package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.button.MaterialButton;
import svarzee.android.apps.adb_mouse.R;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class w80 {
    public final MaterialButton a;
    public on0 b;
    public rp0 c;
    public zo0 d;
    public sf e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public PorterDuff.Mode l;
    public ColorStateList m;
    public ColorStateList n;
    public ColorStateList o;
    public m90 p;
    public boolean t;
    public RippleDrawable v;
    public int w;
    public boolean q = false;
    public boolean r = false;
    public boolean s = false;
    public boolean u = true;

    public w80(MaterialButton materialButton, on0 on0Var) {
        this.a = materialButton;
        this.b = on0Var;
    }

    public final m90 a(boolean z) {
        RippleDrawable rippleDrawable = this.v;
        if (rippleDrawable != null && rippleDrawable.getNumberOfLayers() > 0) {
            return (m90) ((LayerDrawable) ((InsetDrawable) this.v.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
        }
        return null;
    }

    public final void b(int i, int i2) {
        MaterialButton materialButton = this.a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i3 = this.h;
        int i4 = this.i;
        this.i = i2;
        this.h = i;
        if (!this.r) {
            c();
        }
        materialButton.setPaddingRelative(paddingStart, (paddingTop + i) - i3, paddingEnd, (paddingBottom + i2) - i4);
    }

    public final void c() {
        int i;
        m90 m90Var = new m90(this.b);
        rp0 rp0Var = this.c;
        if (rp0Var != null) {
            m90Var.o(rp0Var);
        }
        zo0 zo0Var = this.d;
        if (zo0Var != null) {
            m90Var.l(zo0Var);
        }
        sf sfVar = this.e;
        if (sfVar != null) {
            m90Var.F = sfVar;
        }
        MaterialButton materialButton = this.a;
        m90Var.k(materialButton.getContext());
        m90Var.setTintList(this.m);
        PorterDuff.Mode mode = this.l;
        if (mode != null) {
            m90Var.setTintMode(mode);
        }
        float f = this.k;
        ColorStateList colorStateList = this.n;
        m90Var.d.k = f;
        m90Var.invalidateSelf();
        k90 k90Var = m90Var.d;
        if (k90Var.e != colorStateList) {
            k90Var.e = colorStateList;
            m90Var.onStateChange(m90Var.getState());
        }
        m90 m90Var2 = new m90(this.b);
        rp0 rp0Var2 = this.c;
        if (rp0Var2 != null) {
            m90Var2.o(rp0Var2);
        }
        zo0 zo0Var2 = this.d;
        if (zo0Var2 != null) {
            m90Var2.l(zo0Var2);
        }
        m90Var2.setTint(0);
        float f2 = this.k;
        if (this.q) {
            i = f20.x(materialButton, R.attr.colorSurface);
        } else {
            i = 0;
        }
        m90Var2.d.k = f2;
        m90Var2.invalidateSelf();
        ColorStateList valueOf = ColorStateList.valueOf(i);
        k90 k90Var2 = m90Var2.d;
        if (k90Var2.e != valueOf) {
            k90Var2.e = valueOf;
            m90Var2.onStateChange(m90Var2.getState());
        }
        m90 m90Var3 = new m90(this.b);
        this.p = m90Var3;
        rp0 rp0Var3 = this.c;
        if (rp0Var3 != null) {
            m90Var3.o(rp0Var3);
        }
        zo0 zo0Var3 = this.d;
        if (zo0Var3 != null) {
            this.p.l(zo0Var3);
        }
        this.p.setTint(-1);
        RippleDrawable rippleDrawable = new RippleDrawable(uj0.a(this.o), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{m90Var2, m90Var}), this.f, this.h, this.g, this.i), this.p);
        this.v = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        m90 a = a(false);
        if (a != null) {
            a.m(this.w);
            a.setState(materialButton.getDrawableState());
        }
    }

    public final void d() {
        zn0 zn0Var;
        m90 a = a(false);
        if (a != null) {
            rp0 rp0Var = this.c;
            if (rp0Var != null) {
                a.o(rp0Var);
            } else {
                a.setShapeAppearanceModel(this.b);
            }
            zo0 zo0Var = this.d;
            if (zo0Var != null) {
                a.l(zo0Var);
            }
        }
        m90 a2 = a(true);
        if (a2 != null) {
            rp0 rp0Var2 = this.c;
            if (rp0Var2 != null) {
                a2.o(rp0Var2);
            } else {
                a2.setShapeAppearanceModel(this.b);
            }
            zo0 zo0Var2 = this.d;
            if (zo0Var2 != null) {
                a2.l(zo0Var2);
            }
        }
        RippleDrawable rippleDrawable = this.v;
        if (rippleDrawable != null && rippleDrawable.getNumberOfLayers() > 1) {
            int numberOfLayers = this.v.getNumberOfLayers();
            RippleDrawable rippleDrawable2 = this.v;
            if (numberOfLayers > 2) {
                zn0Var = (zn0) rippleDrawable2.getDrawable(2);
            } else {
                zn0Var = (zn0) rippleDrawable2.getDrawable(1);
            }
        } else {
            zn0Var = null;
        }
        if (zn0Var != null) {
            zn0Var.setShapeAppearanceModel(this.b);
            if (zn0Var instanceof m90) {
                m90 m90Var = (m90) zn0Var;
                rp0 rp0Var3 = this.c;
                if (rp0Var3 != null) {
                    m90Var.o(rp0Var3);
                }
                zo0 zo0Var3 = this.d;
                if (zo0Var3 != null) {
                    m90Var.l(zo0Var3);
                }
            }
        }
    }

    public final void e() {
        int i = 0;
        m90 a = a(false);
        m90 a2 = a(true);
        if (a != null) {
            float f = this.k;
            ColorStateList colorStateList = this.n;
            a.d.k = f;
            a.invalidateSelf();
            k90 k90Var = a.d;
            if (k90Var.e != colorStateList) {
                k90Var.e = colorStateList;
                a.onStateChange(a.getState());
            }
            if (a2 != null) {
                float f2 = this.k;
                if (this.q) {
                    i = f20.x(this.a, R.attr.colorSurface);
                }
                a2.d.k = f2;
                a2.invalidateSelf();
                ColorStateList valueOf = ColorStateList.valueOf(i);
                k90 k90Var2 = a2.d;
                if (k90Var2.e != valueOf) {
                    k90Var2.e = valueOf;
                    a2.onStateChange(a2.getState());
                }
            }
        }
    }
}
