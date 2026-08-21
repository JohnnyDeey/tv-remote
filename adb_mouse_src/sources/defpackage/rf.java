package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.util.ArrayList;
import svarzee.android.apps.adb_mouse.R;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class rf extends ea0 implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public PopupWindow.OnDismissListener A;
    public boolean B;
    public final Context d;
    public final int e;
    public final int f;
    public final boolean g;
    public final Handler h;
    public View p;
    public View q;
    public int r;
    public boolean s;
    public boolean t;
    public int u;
    public int v;
    public boolean x;
    public la0 y;
    public ViewTreeObserver z;
    public final ArrayList i = new ArrayList();
    public final ArrayList j = new ArrayList();
    public final y6 k = new y6(2, this);
    public final of l = new of(0, this);
    public final i81 m = new i81(10, this);
    public int n = 0;
    public int o = 0;
    public boolean w = false;

    public rf(Context context, View view, int i, boolean z) {
        this.d = context;
        this.p = view;
        this.f = i;
        this.g = z;
        this.r = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.e = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.h = new Handler();
    }

    @Override // defpackage.ma0
    public final void a(w90 w90Var, boolean z) {
        int i;
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                if (w90Var == ((qf) arrayList.get(i2)).b) {
                    break;
                } else {
                    i2++;
                }
            } else {
                i2 = -1;
                break;
            }
        }
        if (i2 >= 0) {
            int i3 = i2 + 1;
            if (i3 < arrayList.size()) {
                ((qf) arrayList.get(i3)).b.c(false);
            }
            qf qfVar = (qf) arrayList.remove(i2);
            w90 w90Var2 = qfVar.b;
            ka0 ka0Var = qfVar.a;
            q6 q6Var = ka0Var.B;
            w90Var2.r(this);
            if (this.B) {
                ha0.b(q6Var, null);
                q6Var.setAnimationStyle(0);
            }
            ka0Var.dismiss();
            int size2 = arrayList.size();
            if (size2 > 0) {
                this.r = ((qf) arrayList.get(size2 - 1)).c;
            } else {
                if (this.p.getLayoutDirection() == 1) {
                    i = 0;
                } else {
                    i = 1;
                }
                this.r = i;
            }
            if (size2 == 0) {
                dismiss();
                la0 la0Var = this.y;
                if (la0Var != null) {
                    la0Var.a(w90Var, true);
                }
                ViewTreeObserver viewTreeObserver = this.z;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.z.removeGlobalOnLayoutListener(this.k);
                    }
                    this.z = null;
                }
                this.q.removeOnAttachStateChangeListener(this.l);
                this.A.onDismiss();
                return;
            }
            if (z) {
                ((qf) arrayList.get(0)).b.c(false);
            }
        }
    }

    @Override // defpackage.bo0
    public final boolean b() {
        ArrayList arrayList = this.j;
        if (arrayList.size() <= 0 || !((qf) arrayList.get(0)).a.B.isShowing()) {
            return false;
        }
        return true;
    }

    @Override // defpackage.bo0
    public final void d() {
        if (!b()) {
            ArrayList arrayList = this.i;
            int size = arrayList.size();
            boolean z = false;
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                u((w90) obj);
            }
            arrayList.clear();
            View view = this.p;
            this.q = view;
            if (view != null) {
                if (this.z == null) {
                    z = true;
                }
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                this.z = viewTreeObserver;
                if (z) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.k);
                }
                this.q.addOnAttachStateChangeListener(this.l);
            }
        }
    }

    @Override // defpackage.bo0
    public final void dismiss() {
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        if (size > 0) {
            qf[] qfVarArr = (qf[]) arrayList.toArray(new qf[size]);
            for (int i = size - 1; i >= 0; i--) {
                qf qfVar = qfVarArr[i];
                if (qfVar.a.B.isShowing()) {
                    qfVar.a.dismiss();
                }
            }
        }
    }

    @Override // defpackage.ma0
    public final void e(la0 la0Var) {
        this.y = la0Var;
    }

    @Override // defpackage.ma0
    public final void g() {
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ListAdapter adapter = ((qf) obj).a.e.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((t90) adapter).notifyDataSetChanged();
        }
    }

    @Override // defpackage.bo0
    public final wr h() {
        ArrayList arrayList = this.j;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((qf) arrayList.get(arrayList.size() - 1)).a.e;
    }

    @Override // defpackage.ma0
    public final boolean j(gq0 gq0Var) {
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            qf qfVar = (qf) obj;
            if (gq0Var == qfVar.b) {
                qfVar.a.e.requestFocus();
                return true;
            }
        }
        if (!gq0Var.hasVisibleItems()) {
            return false;
        }
        l(gq0Var);
        la0 la0Var = this.y;
        if (la0Var != null) {
            la0Var.p(gq0Var);
        }
        return true;
    }

    @Override // defpackage.ma0
    public final boolean k() {
        return false;
    }

    @Override // defpackage.ea0
    public final void l(w90 w90Var) {
        w90Var.b(this, this.d);
        if (b()) {
            u(w90Var);
        } else {
            this.i.add(w90Var);
        }
    }

    @Override // defpackage.ea0
    public final void n(View view) {
        if (this.p != view) {
            this.p = view;
            this.o = Gravity.getAbsoluteGravity(this.n, view.getLayoutDirection());
        }
    }

    @Override // defpackage.ea0
    public final void o(boolean z) {
        this.w = z;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        qf qfVar;
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i < size) {
                qfVar = (qf) arrayList.get(i);
                if (!qfVar.a.B.isShowing()) {
                    break;
                } else {
                    i++;
                }
            } else {
                qfVar = null;
                break;
            }
        }
        if (qfVar != null) {
            qfVar.b.c(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i == 82) {
            dismiss();
            return true;
        }
        return false;
    }

    @Override // defpackage.ea0
    public final void p(int i) {
        if (this.n != i) {
            this.n = i;
            this.o = Gravity.getAbsoluteGravity(i, this.p.getLayoutDirection());
        }
    }

    @Override // defpackage.ea0
    public final void q(int i) {
        this.s = true;
        this.u = i;
    }

    @Override // defpackage.ea0
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.A = onDismissListener;
    }

    @Override // defpackage.ea0
    public final void s(boolean z) {
        this.x = z;
    }

    @Override // defpackage.ea0
    public final void t(int i) {
        this.t = true;
        this.v = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0178  */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r17v7 */
    /* JADX WARN: Type inference failed for: r17v8 */
    /* JADX WARN: Type inference failed for: r8v3, types: [ka0, t60] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u(defpackage.w90 r20) {
        /*
            Method dump skipped, instructions count: 572
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rf.u(w90):void");
    }
}
