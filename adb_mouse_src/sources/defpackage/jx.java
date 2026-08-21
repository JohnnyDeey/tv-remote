package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class jx extends AnimationSet implements Runnable {
    public final ViewGroup c;
    public final View d;
    public boolean e;
    public boolean f;
    public boolean g;

    public jx(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.g = true;
        this.c = viewGroup;
        this.d = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation) {
        this.g = true;
        if (this.e) {
            return !this.f;
        }
        if (!super.getTransformation(j, transformation)) {
            this.e = true;
            ld0.a(this.c, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = this.e;
        ViewGroup viewGroup = this.c;
        if (!z && this.g) {
            this.g = false;
            viewGroup.post(this);
        } else {
            viewGroup.endViewTransition(this.d);
            this.f = true;
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation, float f) {
        this.g = true;
        if (this.e) {
            return !this.f;
        }
        if (!super.getTransformation(j, transformation, f)) {
            this.e = true;
            ld0.a(this.c, this);
        }
        return true;
    }
}
