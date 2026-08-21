package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.a;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class lx implements LayoutInflater.Factory2 {
    public final vx c;

    public lx(vx vxVar) {
        this.c = vxVar;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        gx gxVar;
        f5 f5Var;
        a f;
        int i;
        f5 f5Var2;
        boolean equals = FragmentContainerView.class.getName().equals(str);
        vx vxVar = this.c;
        if (equals) {
            return new FragmentContainerView(context, attributeSet, vxVar);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, jg0.a);
            int i2 = 0;
            if (attributeValue == null) {
                attributeValue = obtainStyledAttributes.getString(0);
            }
            int resourceId = obtainStyledAttributes.getResourceId(1, -1);
            String string = obtainStyledAttributes.getString(2);
            obtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    z = gx.class.isAssignableFrom(qx.b(context.getClassLoader(), attributeValue));
                } catch (ClassNotFoundException unused) {
                    z = false;
                }
                if (z) {
                    if (view != null) {
                        i2 = view.getId();
                    }
                    if (i2 == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    if (resourceId != -1) {
                        gxVar = vxVar.z(resourceId);
                    } else {
                        gxVar = null;
                    }
                    if (gxVar == null && string != null) {
                        gxVar = vxVar.A(string);
                    }
                    if (gxVar == null && i2 != -1) {
                        gxVar = vxVar.z(i2);
                    }
                    if (gxVar == null) {
                        qx C = vxVar.C();
                        context.getClassLoader();
                        gxVar = C.a(attributeValue);
                        gxVar.o = true;
                        if (resourceId != 0) {
                            i = resourceId;
                        } else {
                            i = i2;
                        }
                        gxVar.x = i;
                        gxVar.y = i2;
                        gxVar.z = string;
                        gxVar.p = true;
                        gxVar.t = vxVar;
                        ix ixVar = vxVar.t;
                        gxVar.u = ixVar;
                        f5 f5Var3 = ixVar.t;
                        gxVar.E = true;
                        if (ixVar == null) {
                            f5Var2 = null;
                        } else {
                            f5Var2 = ixVar.s;
                        }
                        if (f5Var2 != null) {
                            gxVar.E = true;
                        }
                        f = vxVar.a(gxVar);
                        if (vx.F(2)) {
                            Log.v("FragmentManager", "Fragment " + gxVar + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    } else if (!gxVar.p) {
                        gxVar.p = true;
                        gxVar.t = vxVar;
                        ix ixVar2 = vxVar.t;
                        gxVar.u = ixVar2;
                        f5 f5Var4 = ixVar2.t;
                        gxVar.E = true;
                        if (ixVar2 == null) {
                            f5Var = null;
                        } else {
                            f5Var = ixVar2.s;
                        }
                        if (f5Var != null) {
                            gxVar.E = true;
                        }
                        f = vxVar.f(gxVar);
                        if (vx.F(2)) {
                            Log.v("FragmentManager", "Retained Fragment " + gxVar + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    } else {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(i2) + " with another fragment for " + attributeValue);
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    cy cyVar = dy.a;
                    dy.b(new tz0(gxVar, "Attempting to use <fragment> tag to add fragment " + gxVar + " to container " + viewGroup));
                    dy.a(gxVar).getClass();
                    gxVar.F = viewGroup;
                    f.k();
                    f.j();
                    View view2 = gxVar.G;
                    if (view2 != null) {
                        if (resourceId != 0) {
                            view2.setId(resourceId);
                        }
                        if (gxVar.G.getTag() == null) {
                            gxVar.G.setTag(string);
                        }
                        gxVar.G.addOnAttachStateChangeListener(new kx(this, f));
                        return gxVar.G;
                    }
                    c.o(qo0.r("Fragment ", attributeValue, " did not create a view."));
                    return null;
                }
            }
        }
        return null;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
