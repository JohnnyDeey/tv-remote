package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import defpackage.dz0;
import defpackage.g6;
import defpackage.ik;
import defpackage.o2;
import defpackage.r2;
import defpackage.rt0;
import defpackage.u5;
import defpackage.w90;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {
    public TypedValue c;
    public TypedValue d;
    public TypedValue e;
    public TypedValue f;
    public TypedValue g;
    public TypedValue h;
    public final Rect i;
    public ik j;

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.i = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.g == null) {
            this.g = new TypedValue();
        }
        return this.g;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.h == null) {
            this.h = new TypedValue();
        }
        return this.h;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.e == null) {
            this.e = new TypedValue();
        }
        return this.e;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f == null) {
            this.f = new TypedValue();
        }
        return this.f;
    }

    public TypedValue getMinWidthMajor() {
        if (this.c == null) {
            this.c = new TypedValue();
        }
        return this.c;
    }

    public TypedValue getMinWidthMinor() {
        if (this.d == null) {
            this.d = new TypedValue();
        }
        return this.d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ik ikVar = this.j;
        if (ikVar != null) {
            ikVar.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        r2 r2Var;
        super.onDetachedFromWindow();
        ik ikVar = this.j;
        if (ikVar != null) {
            g6 g6Var = ((u5) ikVar).d;
            ActionBarOverlayLayout actionBarOverlayLayout = g6Var.s;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.k();
                ActionMenuView actionMenuView = ((rt0) actionBarOverlayLayout.g).a.c;
                if (actionMenuView != null && (r2Var = actionMenuView.v) != null) {
                    r2Var.d();
                    o2 o2Var = r2Var.v;
                    if (o2Var != null && o2Var.b()) {
                        o2Var.i.dismiss();
                    }
                }
            }
            if (g6Var.x != null) {
                g6Var.n.getDecorView().removeCallbacks(g6Var.y);
                if (g6Var.x.isShowing()) {
                    try {
                        g6Var.x.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                g6Var.x = null;
            }
            dz0 dz0Var = g6Var.z;
            if (dz0Var != null) {
                dz0Var.b();
            }
            w90 w90Var = g6Var.y(0).h;
            if (w90Var != null) {
                w90Var.c(true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ac A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b3  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r17, int r18) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(ik ikVar) {
        this.j = ikVar;
    }
}
