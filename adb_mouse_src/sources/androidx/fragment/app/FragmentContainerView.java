package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import defpackage.c;
import defpackage.f5;
import defpackage.gx;
import defpackage.hc;
import defpackage.ix;
import defpackage.jg0;
import defpackage.m11;
import defpackage.qo0;
import defpackage.qx;
import defpackage.ry0;
import defpackage.vx;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.WeakHashMap;
import svarzee.android.apps.adb_mouse.R;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {
    public final ArrayList c;
    public final ArrayList d;
    public View.OnApplyWindowInsetsListener e;
    public boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, vx vxVar) {
        super(context, attributeSet);
        View view;
        f5 f5Var;
        String str;
        context.getClass();
        attributeSet.getClass();
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.f = true;
        String classAttribute = attributeSet.getClassAttribute();
        int i = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, jg0.b, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(0) : classAttribute;
        String string = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
        int id = getId();
        gx z = vxVar.z(id);
        if (classAttribute != null && z == null) {
            if (id == -1) {
                if (string != null) {
                    str = " with tag ".concat(string);
                } else {
                    str = "";
                }
                c.o(qo0.r("FragmentContainerView must have an android:id to add Fragment ", classAttribute, str));
                throw null;
            }
            qx C = vxVar.C();
            context.getClassLoader();
            gx a = C.a(classAttribute);
            a.getClass();
            a.E = true;
            ix ixVar = a.u;
            if (ixVar == null) {
                f5Var = null;
            } else {
                f5Var = ixVar.s;
            }
            if (f5Var != null) {
                a.E = true;
            }
            hc hcVar = new hc(vxVar);
            hcVar.p = true;
            a.F = this;
            hcVar.e(getId(), a, string, 1);
            if (!hcVar.g) {
                hcVar.h = false;
                vx vxVar2 = hcVar.q;
                if (vxVar2.t != null && !vxVar2.G) {
                    vxVar2.w(true);
                    hcVar.a(vxVar2.I, vxVar2.J);
                    vxVar2.b = true;
                    try {
                        vxVar2.Q(vxVar2.I, vxVar2.J);
                        vxVar2.d();
                        vxVar2.b0();
                        if (vxVar2.H) {
                            vxVar2.H = false;
                            vxVar2.Z();
                        }
                        ((HashMap) vxVar2.c.d).values().removeAll(Collections.singleton(null));
                    } catch (Throwable th) {
                        vxVar2.d();
                        throw th;
                    }
                }
            } else {
                c.o("This transaction is already being added to the back stack");
                throw null;
            }
        }
        ArrayList g = vxVar.c.g();
        int size = g.size();
        while (i < size) {
            Object obj = g.get(i);
            i++;
            a aVar = (a) obj;
            gx gxVar = aVar.c;
            if (gxVar.y == getId() && (view = gxVar.G) != null && view.getParent() == null) {
                gxVar.F = this;
                aVar.b();
            }
        }
    }

    public final void a(View view) {
        if (this.d.contains(view)) {
            this.c.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        gx gxVar;
        view.getClass();
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if (tag instanceof gx) {
            gxVar = (gx) tag;
        } else {
            gxVar = null;
        }
        if (gxVar != null) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        m11 m11Var;
        windowInsets.getClass();
        m11 g = m11.g(null, windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.e;
        if (onApplyWindowInsetsListener != null) {
            WindowInsets onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            onApplyWindowInsets.getClass();
            m11Var = m11.g(null, onApplyWindowInsets);
        } else {
            WeakHashMap weakHashMap = ry0.a;
            WindowInsets f = g.f();
            if (f != null && !f.equals(f)) {
                g = m11.g(this, f);
            }
            m11Var = g;
        }
        if (!m11Var.a.q()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                ry0.b(getChildAt(i), m11Var);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.getClass();
        if (this.f) {
            ArrayList arrayList = this.c;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                super.drawChild(canvas, (View) obj, getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        canvas.getClass();
        view.getClass();
        if (this.f) {
            ArrayList arrayList = this.c;
            if (!arrayList.isEmpty() && arrayList.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        view.getClass();
        this.d.remove(view);
        if (this.c.remove(view)) {
            this.f = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends gx> F getFragment() {
        gx gxVar;
        f5 f5Var;
        vx vxVar;
        View view = this;
        while (true) {
            if (view != null) {
                Object tag = view.getTag(R.id.fragment_container_view_tag);
                if (tag instanceof gx) {
                    gxVar = (gx) tag;
                } else {
                    gxVar = null;
                }
                if (gxVar != null) {
                    break;
                }
                Object parent = view.getParent();
                if (parent instanceof View) {
                    view = (View) parent;
                } else {
                    view = null;
                }
            } else {
                gxVar = null;
                break;
            }
        }
        if (gxVar != null) {
            if (gxVar.u != null && gxVar.m) {
                vxVar = gxVar.g();
            } else {
                throw new IllegalStateException("The Fragment " + gxVar + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
        } else {
            Context context = getContext();
            while (true) {
                if (context instanceof ContextWrapper) {
                    if (context instanceof f5) {
                        f5Var = (f5) context;
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                } else {
                    f5Var = null;
                    break;
                }
            }
            if (f5Var != null) {
                vxVar = ((ix) f5Var.u.d).v;
            } else {
                c.e(this, " is not within a subclass of FragmentActivity.", "View ");
                return null;
            }
        }
        return (F) vxVar.z(getId());
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        windowInsets.getClass();
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 < childCount) {
                View childAt = getChildAt(childCount);
                childAt.getClass();
                a(childAt);
            } else {
                super.removeAllViewsInLayout();
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        view.getClass();
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        View childAt = getChildAt(i);
        childAt.getClass();
        a(childAt);
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        view.getClass();
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            childAt.getClass();
            a(childAt);
        }
        super.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            childAt.getClass();
            a(childAt);
        }
        super.removeViewsInLayout(i, i2);
    }

    public final void setDrawDisappearingViewsLast(boolean z) {
        this.f = z;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        onApplyWindowInsetsListener.getClass();
        this.e = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        view.getClass();
        if (view.getParent() == this) {
            this.d.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        String str;
        context.getClass();
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.f = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, jg0.b, 0, 0);
            if (classAttribute == null) {
                classAttribute = obtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = "class";
            }
            obtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + '\"');
        }
    }
}
