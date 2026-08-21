package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.ImageView;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public class n6 extends ImageButton {
    public final k3 c;
    public final c0 d;
    public boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n6(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        zr0.a(context);
        this.e = false;
        sr0.a(this, getContext());
        k3 k3Var = new k3(this);
        this.c = k3Var;
        k3Var.o(attributeSet, i);
        c0 c0Var = new c0(this);
        this.d = c0Var;
        c0Var.m(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        k3 k3Var = this.c;
        if (k3Var != null) {
            k3Var.e();
        }
        c0 c0Var = this.d;
        if (c0Var != null) {
            c0Var.e();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        k3 k3Var = this.c;
        if (k3Var != null) {
            return k3Var.l();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        k3 k3Var = this.c;
        if (k3Var != null) {
            return k3Var.m();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        as0 as0Var;
        c0 c0Var = this.d;
        if (c0Var == null || (as0Var = (as0) c0Var.f) == null) {
            return null;
        }
        return (ColorStateList) as0Var.e;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        as0 as0Var;
        c0 c0Var = this.d;
        if (c0Var == null || (as0Var = (as0) c0Var.f) == null) {
            return null;
        }
        return (PorterDuff.Mode) as0Var.f;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        if (!(((ImageView) this.d.e).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering()) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        k3 k3Var = this.c;
        if (k3Var != null) {
            k3Var.q();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        k3 k3Var = this.c;
        if (k3Var != null) {
            k3Var.r(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        c0 c0Var = this.d;
        if (c0Var != null) {
            c0Var.e();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        c0 c0Var = this.d;
        if (c0Var != null && drawable != null && !this.e) {
            c0Var.d = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (c0Var != null) {
            c0Var.e();
            if (!this.e) {
                ImageView imageView = (ImageView) c0Var.e;
                if (imageView.getDrawable() != null) {
                    imageView.getDrawable().setLevel(c0Var.d);
                }
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.e = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        c0 c0Var = this.d;
        ImageView imageView = (ImageView) c0Var.e;
        if (i != 0) {
            Drawable r = r21.r(imageView.getContext(), i);
            if (r != null) {
                lr.a(r);
            }
            imageView.setImageDrawable(r);
        } else {
            imageView.setImageDrawable(null);
        }
        c0Var.e();
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        c0 c0Var = this.d;
        if (c0Var != null) {
            c0Var.e();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        k3 k3Var = this.c;
        if (k3Var != null) {
            k3Var.w(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        k3 k3Var = this.c;
        if (k3Var != null) {
            k3Var.x(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        c0 c0Var = this.d;
        if (c0Var != null) {
            if (((as0) c0Var.f) == null) {
                c0Var.f = new Object();
            }
            as0 as0Var = (as0) c0Var.f;
            as0Var.e = colorStateList;
            as0Var.d = true;
            c0Var.e();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        c0 c0Var = this.d;
        if (c0Var != null) {
            if (((as0) c0Var.f) == null) {
                c0Var.f = new Object();
            }
            as0 as0Var = (as0) c0Var.f;
            as0Var.f = mode;
            as0Var.c = true;
            c0Var.e();
        }
    }
}
