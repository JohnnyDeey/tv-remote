package defpackage;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.Gravity;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class di {
    public CharSequence B;
    public CharSequence C;
    public boolean D;
    public float F;
    public float G;
    public float H;
    public float I;
    public float J;
    public int K;
    public int L;
    public int[] M;
    public boolean N;
    public final TextPaint O;
    public final TextPaint P;
    public TimeInterpolator Q;
    public TimeInterpolator R;
    public float S;
    public float T;
    public float U;
    public ColorStateList V;
    public float W;
    public float X;
    public float Y;
    public StaticLayout Z;
    public final TextInputLayout a;
    public float a0;
    public float b;
    public float b0;
    public final Rect c;
    public float c0;
    public final Rect d;
    public CharSequence d0;
    public final RectF e;
    public ColorStateList j;
    public ColorStateList k;
    public boolean k0;
    public int l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public Typeface s;
    public Typeface t;
    public Typeface u;
    public Typeface v;
    public Typeface w;
    public Typeface x;
    public Typeface y;
    public df z;
    public int f = 16;
    public int g = 16;
    public float h = 15.0f;
    public float i = 15.0f;
    public final TextUtils.TruncateAt A = TextUtils.TruncateAt.END;
    public final boolean E = true;
    public int e0 = 1;
    public int f0 = 1;
    public final float g0 = 1.0f;
    public final int h0 = 1;
    public int i0 = -1;
    public int j0 = -1;

    public di(TextInputLayout textInputLayout) {
        this.a = textInputLayout;
        TextPaint textPaint = new TextPaint(129);
        this.O = textPaint;
        this.P = new TextPaint(textPaint);
        this.d = new Rect();
        this.c = new Rect();
        this.e = new RectF();
        i(textInputLayout.getContext().getResources().getConfiguration());
    }

    public static int a(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb(Math.round((Color.alpha(i2) * f) + (Color.alpha(i) * f2)), Math.round((Color.red(i2) * f) + (Color.red(i) * f2)), Math.round((Color.green(i2) * f) + (Color.green(i) * f2)), Math.round((Color.blue(i2) * f) + (Color.blue(i) * f2)));
    }

    public static float h(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        return x4.a(f, f2, f3);
    }

    public final void b() {
        float f = this.b;
        float f2 = this.c.left;
        Rect rect = this.d;
        float h = h(f2, rect.left, f, this.Q);
        RectF rectF = this.e;
        rectF.left = h;
        rectF.top = h(this.m, this.n, f, this.Q);
        rectF.right = h(r1.right, rect.right, f, this.Q);
        rectF.bottom = h(r1.bottom, rect.bottom, f, this.Q);
        this.q = h(this.o, this.p, f, this.Q);
        this.r = h(this.m, this.n, f, this.Q);
        d(f, false);
        TextInputLayout textInputLayout = this.a;
        textInputLayout.postInvalidateOnAnimation();
        kv kvVar = x4.b;
        this.b0 = 1.0f - h(0.0f, 1.0f, 1.0f - f, kvVar);
        textInputLayout.postInvalidateOnAnimation();
        this.c0 = h(1.0f, 0.0f, f, kvVar);
        textInputLayout.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.k;
        ColorStateList colorStateList2 = this.j;
        TextPaint textPaint = this.O;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(a(g(colorStateList2), g(this.k), f));
        } else {
            textPaint.setColor(g(colorStateList));
        }
        float f3 = this.W;
        float f4 = this.X;
        if (f3 != f4) {
            textPaint.setLetterSpacing(h(f4, f3, f, kvVar));
        } else {
            textPaint.setLetterSpacing(f3);
        }
        this.H = x4.a(0.0f, this.S, f);
        this.I = x4.a(0.0f, this.T, f);
        this.J = x4.a(0.0f, this.U, f);
        int a = a(0, g(this.V), f);
        this.K = a;
        textPaint.setShadowLayer(this.H, this.I, this.J, a);
        textInputLayout.postInvalidateOnAnimation();
    }

    public final boolean c(CharSequence charSequence) {
        yd ydVar;
        boolean z = true;
        if (this.a.getLayoutDirection() != 1) {
            z = false;
        }
        if (this.E) {
            if (z) {
                ydVar = jr0.d;
            } else {
                ydVar = jr0.c;
            }
            return ydVar.b(charSequence, charSequence.length());
        }
        return z;
    }

    public final void d(float f, boolean z) {
        float f2;
        Typeface typeface;
        float f3;
        int i;
        int i2;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        float h;
        if (this.B != null) {
            float width = this.d.width();
            float width2 = this.c.width();
            float f4 = 1.0f;
            if (Math.abs(f - 1.0f) < 1.0E-5f) {
                if (o()) {
                    f2 = this.i;
                } else {
                    f2 = this.h;
                }
                if (o()) {
                    f3 = this.W;
                } else {
                    f3 = this.X;
                }
                if (o()) {
                    h = 1.0f;
                } else {
                    h = h(this.h, this.i, f, this.R) / this.h;
                }
                this.F = h;
                if (!o()) {
                    width = width2;
                }
                typeface = this.s;
                width2 = width;
            } else {
                f2 = this.h;
                float f5 = this.X;
                typeface = this.v;
                if (Math.abs(f - 0.0f) < 1.0E-5f) {
                    this.F = 1.0f;
                } else {
                    this.F = h(this.h, this.i, f, this.R) / this.h;
                }
                float f6 = this.i / this.h;
                float f7 = width2 * f6;
                if (!z && f7 > width && o()) {
                    width2 = Math.min(width / f6, width2);
                }
                f3 = f5;
            }
            if (f < 0.5f) {
                i = this.e0;
            } else {
                i = this.f0;
            }
            TextPaint textPaint = this.O;
            boolean z8 = false;
            if (width2 > 0.0f) {
                if (this.G != f2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (this.Y != f3) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (this.y != typeface) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (this.Z != null && width2 != r12.getWidth()) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (this.L != i) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (!z2 && !z3 && !z5 && !z4 && !z6 && !this.N) {
                    z7 = false;
                } else {
                    z7 = true;
                }
                this.G = f2;
                this.Y = f3;
                this.y = typeface;
                this.N = false;
                this.L = i;
                if (this.F != 1.0f) {
                    z8 = true;
                }
                textPaint.setLinearText(z8);
                z8 = z7;
            }
            if (this.C != null && !z8) {
                return;
            }
            textPaint.setTextSize(this.G);
            textPaint.setTypeface(this.y);
            textPaint.setLetterSpacing(this.Y);
            boolean c = c(this.B);
            this.D = c;
            if ((this.e0 <= 1 && this.f0 <= 1) || c) {
                i2 = 1;
            } else {
                i2 = i;
            }
            CharSequence charSequence = this.B;
            if (!o()) {
                f4 = this.F;
            }
            StaticLayout e = e(i2, textPaint, charSequence, width2 * f4, this.D);
            this.Z = e;
            this.C = e.getText();
        }
    }

    public final StaticLayout e(int i, TextPaint textPaint, CharSequence charSequence, float f, boolean z) {
        Layout.Alignment alignment;
        if (i == 1) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else {
            int absoluteGravity = Gravity.getAbsoluteGravity(this.f, this.D ? 1 : 0) & 7;
            if (absoluteGravity != 1) {
                boolean z2 = this.D;
                if (absoluteGravity != 5) {
                    if (z2) {
                        alignment = Layout.Alignment.ALIGN_OPPOSITE;
                    } else {
                        alignment = Layout.Alignment.ALIGN_NORMAL;
                    }
                } else if (z2) {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                } else {
                    alignment = Layout.Alignment.ALIGN_OPPOSITE;
                }
            } else {
                alignment = Layout.Alignment.ALIGN_CENTER;
            }
        }
        up0 up0Var = new up0(charSequence, textPaint, (int) f);
        up0Var.l = this.A;
        up0Var.k = z;
        up0Var.e = alignment;
        up0Var.j = false;
        up0Var.f = i;
        up0Var.g = 0.0f;
        up0Var.h = this.g0;
        up0Var.i = this.h0;
        up0Var.m = null;
        StaticLayout a = up0Var.a();
        a.getClass();
        return a;
    }

    public final float f() {
        int i = this.i0;
        if (i != -1) {
            return i;
        }
        float f = this.i;
        TextPaint textPaint = this.P;
        textPaint.setTextSize(f);
        textPaint.setTypeface(this.s);
        textPaint.setLetterSpacing(this.W);
        return -textPaint.ascent();
    }

    public final int g(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.M;
        if (iArr != null) {
            return colorStateList.getColorForState(iArr, 0);
        }
        return colorStateList.getDefaultColor();
    }

    public final void i(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.u;
            if (typeface != null) {
                this.t = wg0.u(configuration, typeface);
            }
            Typeface typeface2 = this.x;
            if (typeface2 != null) {
                this.w = wg0.u(configuration, typeface2);
            }
            Typeface typeface3 = this.t;
            if (typeface3 == null) {
                typeface3 = this.u;
            }
            this.s = typeface3;
            Typeface typeface4 = this.w;
            if (typeface4 == null) {
                typeface4 = this.x;
            }
            this.v = typeface4;
            j(true);
        }
    }

    public final void j(boolean z) {
        float f;
        float f2;
        int i;
        TextInputLayout textInputLayout = this.a;
        if ((textInputLayout.getHeight() > 0 && textInputLayout.getWidth() > 0) || z) {
            d(1.0f, z);
            CharSequence charSequence = this.C;
            TextPaint textPaint = this.O;
            if (charSequence != null && this.Z != null) {
                boolean o = o();
                CharSequence charSequence2 = this.C;
                if (o) {
                    charSequence2 = TextUtils.ellipsize(charSequence2, textPaint, this.Z.getWidth(), this.A);
                }
                this.d0 = charSequence2;
            }
            CharSequence charSequence3 = this.d0;
            float f3 = 0.0f;
            if (charSequence3 != null) {
                this.a0 = textPaint.measureText(charSequence3, 0, charSequence3.length());
            } else {
                this.a0 = 0.0f;
            }
            int absoluteGravity = Gravity.getAbsoluteGravity(this.g, this.D ? 1 : 0);
            int i2 = absoluteGravity & 112;
            Rect rect = this.d;
            if (i2 != 48) {
                if (i2 != 80) {
                    this.n = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
                } else {
                    this.n = textPaint.ascent() + rect.bottom;
                }
            } else {
                this.n = rect.top;
            }
            int i3 = absoluteGravity & 8388615;
            if (i3 != 1) {
                if (i3 != 5) {
                    this.p = rect.left;
                } else {
                    this.p = rect.right - this.a0;
                }
            } else {
                this.p = rect.centerX() - (this.a0 / 2.0f);
            }
            if (this.a0 <= rect.width()) {
                float f4 = this.p;
                float max = Math.max(0.0f, rect.left - f4) + f4;
                this.p = max;
                this.p = Math.min(0.0f, rect.right - (this.a0 + max)) + max;
            }
            float f5 = this.i;
            TextPaint textPaint2 = this.P;
            textPaint2.setTextSize(f5);
            textPaint2.setTypeface(this.s);
            textPaint2.setLetterSpacing(this.W);
            if (textPaint2.descent() + (-textPaint2.ascent()) <= rect.height()) {
                float f6 = this.n;
                float max2 = Math.max(0.0f, rect.top - f6) + f6;
                this.n = max2;
                this.n = Math.min(0.0f, rect.bottom - (f() + max2)) + max2;
            }
            d(0.0f, z);
            StaticLayout staticLayout = this.Z;
            if (staticLayout != null) {
                f = staticLayout.getHeight();
            } else {
                f = 0.0f;
            }
            StaticLayout staticLayout2 = this.Z;
            if (staticLayout2 != null && this.e0 > 1) {
                f2 = staticLayout2.getWidth();
            } else {
                CharSequence charSequence4 = this.C;
                if (charSequence4 != null) {
                    f2 = textPaint.measureText(charSequence4, 0, charSequence4.length());
                } else {
                    f2 = 0.0f;
                }
            }
            StaticLayout staticLayout3 = this.Z;
            if (staticLayout3 != null) {
                i = staticLayout3.getLineCount();
            } else {
                i = 0;
            }
            this.l = i;
            int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f, this.D ? 1 : 0);
            int i4 = absoluteGravity2 & 112;
            Rect rect2 = this.c;
            if (i4 != 48) {
                if (i4 != 80) {
                    this.m = rect2.centerY() - (f / 2.0f);
                } else {
                    float f7 = rect2.bottom - f;
                    if (this.k0) {
                        f3 = textPaint.descent();
                    }
                    this.m = f7 + f3;
                }
            } else {
                this.m = rect2.top;
            }
            int i5 = absoluteGravity2 & 8388615;
            if (i5 != 1) {
                if (i5 != 5) {
                    this.o = rect2.left;
                } else {
                    this.o = rect2.right - f2;
                }
            } else {
                this.o = rect2.centerX() - (f2 / 2.0f);
            }
            d(this.b, false);
            textInputLayout.postInvalidateOnAnimation();
            b();
        }
    }

    public final void k(ColorStateList colorStateList) {
        if (this.k == colorStateList && this.j == colorStateList) {
            return;
        }
        this.k = colorStateList;
        this.j = colorStateList;
        j(false);
    }

    public final boolean l(Typeface typeface) {
        df dfVar = this.z;
        if (dfVar != null) {
            dfVar.f = true;
        }
        if (this.u != typeface) {
            this.u = typeface;
            Typeface u = wg0.u(this.a.getContext().getResources().getConfiguration(), typeface);
            this.t = u;
            if (u == null) {
                u = this.u;
            }
            this.s = u;
            return true;
        }
        return false;
    }

    public final void m(float f) {
        float l = mn.l(f, 0.0f, 1.0f);
        if (l != this.b) {
            this.b = l;
            b();
        }
    }

    public final void n(Typeface typeface) {
        boolean z;
        boolean l = l(typeface);
        if (this.x != typeface) {
            this.x = typeface;
            Typeface u = wg0.u(this.a.getContext().getResources().getConfiguration(), typeface);
            this.w = u;
            if (u == null) {
                u = this.x;
            }
            this.v = u;
            z = true;
        } else {
            z = false;
        }
        if (!l && !z) {
            return;
        }
        j(false);
    }

    public final boolean o() {
        if (this.f0 == 1) {
            return true;
        }
        return false;
    }
}
