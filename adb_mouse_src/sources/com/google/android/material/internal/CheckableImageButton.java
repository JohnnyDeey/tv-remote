package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import defpackage.j0;
import defpackage.n6;
import defpackage.ry0;
import defpackage.sg;
import defpackage.tg;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public class CheckableImageButton extends n6 implements Checkable {
    public static final int[] i = {R.attr.state_checked};
    public boolean f;
    public boolean g;
    public boolean h;

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, svarzee.android.apps.adb_mouse.R.attr.imageButtonStyle);
        this.g = true;
        this.h = true;
        ry0.m(this, new sg(0, this));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i2) {
        if (this.f) {
            return View.mergeDrawableStates(super.onCreateDrawableState(i2 + 1), i);
        }
        return super.onCreateDrawableState(i2);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof tg)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        tg tgVar = (tg) parcelable;
        super.onRestoreInstanceState(tgVar.c);
        setChecked(tgVar.e);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [tg, android.os.Parcelable, j0] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? j0Var = new j0(super.onSaveInstanceState());
        j0Var.e = this.f;
        return j0Var;
    }

    public void setCheckable(boolean z) {
        if (this.g != z) {
            this.g = z;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.g && this.f != z) {
            this.f = z;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    public void setPressable(boolean z) {
        this.h = z;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        if (this.h) {
            super.setPressed(z);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f);
    }
}
