package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class b implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ ClockFaceView c;

    public b(ClockFaceView clockFaceView) {
        this.c = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.c;
        ClockHandView clockHandView = clockFaceView.v;
        if (clockFaceView.isShown()) {
            clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
            int height = ((clockFaceView.getHeight() / 2) - clockHandView.f) - clockFaceView.D;
            if (height != clockFaceView.t) {
                clockFaceView.t = height;
                clockFaceView.m();
                clockHandView.n = clockFaceView.t;
                clockHandView.invalidate();
            }
        }
        return true;
    }
}
