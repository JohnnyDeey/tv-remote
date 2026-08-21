package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class fg extends bu0 {
    public static final String[] C = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    public static final bg D = new bg(PointF.class, "topLeft", 0);
    public static final bg E = new bg(PointF.class, "bottomRight", 1);
    public static final bg F = new bg(PointF.class, "bottomRight", 2);
    public static final bg G = new bg(PointF.class, "topLeft", 3);
    public static final bg H = new bg(PointF.class, "position", 4);

    public static void I(ju0 ju0Var) {
        View view = ju0Var.b;
        HashMap hashMap = ju0Var.a;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        hashMap.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        hashMap.put("android:changeBounds:parent", view.getParent());
    }

    @Override // defpackage.bu0
    public final void d(ju0 ju0Var) {
        I(ju0Var);
    }

    @Override // defpackage.bu0
    public final void g(ju0 ju0Var) {
        I(ju0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.bu0
    public final Animator k(ViewGroup viewGroup, ju0 ju0Var, ju0 ju0Var2) {
        int i;
        fg fgVar;
        ObjectAnimator a;
        if (ju0Var != null) {
            HashMap hashMap = ju0Var.a;
            if (ju0Var2 != null) {
                HashMap hashMap2 = ju0Var2.a;
                ViewGroup viewGroup2 = (ViewGroup) hashMap.get("android:changeBounds:parent");
                ViewGroup viewGroup3 = (ViewGroup) hashMap2.get("android:changeBounds:parent");
                if (viewGroup2 != null && viewGroup3 != null) {
                    View view = ju0Var2.b;
                    Rect rect = (Rect) hashMap.get("android:changeBounds:bounds");
                    Rect rect2 = (Rect) hashMap2.get("android:changeBounds:bounds");
                    int i2 = rect.left;
                    int i3 = rect2.left;
                    int i4 = rect.top;
                    int i5 = rect2.top;
                    int i6 = rect.right;
                    int i7 = rect2.right;
                    int i8 = rect.bottom;
                    int i9 = rect2.bottom;
                    int i10 = i6 - i2;
                    int i11 = i8 - i4;
                    int i12 = i7 - i3;
                    int i13 = i9 - i5;
                    Rect rect3 = (Rect) hashMap.get("android:changeBounds:clip");
                    Rect rect4 = (Rect) hashMap2.get("android:changeBounds:clip");
                    if ((i10 != 0 && i11 != 0) || (i12 != 0 && i13 != 0)) {
                        if (i2 == i3 && i4 == i5) {
                            i = 0;
                        } else {
                            i = 1;
                        }
                        if (i6 != i7 || i8 != i9) {
                            i++;
                        }
                    } else {
                        i = 0;
                    }
                    if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
                        i++;
                    }
                    int i14 = i;
                    if (i14 > 0) {
                        kz0.a(view, i2, i4, i6, i8);
                        if (i14 == 2) {
                            if (i10 == i12 && i11 == i13) {
                                fgVar = this;
                                fgVar.x.getClass();
                                a = tc0.a(view, H, vj0.c(i2, i4, i3, i5));
                            } else {
                                fgVar = this;
                                eg egVar = new eg(view);
                                fgVar.x.getClass();
                                ObjectAnimator a2 = tc0.a(egVar, D, vj0.c(i2, i4, i3, i5));
                                fgVar.x.getClass();
                                ObjectAnimator a3 = tc0.a(egVar, E, vj0.c(i6, i8, i7, i9));
                                AnimatorSet animatorSet = new AnimatorSet();
                                animatorSet.playTogether(a2, a3);
                                animatorSet.addListener(new cg(egVar));
                                a = animatorSet;
                            }
                        } else {
                            fgVar = this;
                            if (i2 == i3 && i4 == i5) {
                                fgVar.x.getClass();
                                a = tc0.a(view, F, vj0.c(i6, i8, i7, i9));
                            } else {
                                fgVar.x.getClass();
                                a = tc0.a(view, G, vj0.c(i2, i4, i3, i5));
                            }
                        }
                        if (view.getParent() instanceof ViewGroup) {
                            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                            wg0.A(viewGroup4, true);
                            fgVar.o().a(new dg(viewGroup4));
                        }
                        return a;
                    }
                    return null;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    @Override // defpackage.bu0
    public final String[] q() {
        return C;
    }
}
