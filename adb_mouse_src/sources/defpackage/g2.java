package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
import java.util.ArrayList;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class g2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public g2(fz0 fz0Var, View view) {
        this.a = 6;
        this.b = fz0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) obj;
                actionBarOverlayLayout.y = null;
                actionBarOverlayLayout.l = false;
                return;
            case 6:
                ((fz0) obj).b();
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) obj;
                actionBarOverlayLayout.y = null;
                actionBarOverlayLayout.l = false;
                return;
            case 1:
                t4 t4Var = (t4) obj;
                ArrayList arrayList = new ArrayList(t4Var.g);
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((zc) arrayList.get(i2)).a(t4Var);
                }
                return;
            case 2:
                bs bsVar = (bs) obj;
                bsVar.p();
                bsVar.r.start();
                return;
            case 3:
                ((HideBottomViewOnScrollBehavior) obj).k = null;
                return;
            case 4:
                ((HideViewOnScrollBehavior) obj).k = null;
                return;
            case 5:
                ((bu0) obj).m();
                animator.removeListener(this);
                return;
            default:
                ((fz0) obj).a();
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 1:
                t4 t4Var = (t4) obj;
                ArrayList arrayList = new ArrayList(t4Var.g);
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((zc) arrayList.get(i2)).b(t4Var);
                }
                return;
            case 6:
                ((fz0) obj).c();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public /* synthetic */ g2(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
