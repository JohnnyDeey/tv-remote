package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;
import svarzee.android.apps.adb_mouse.R;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class r2 implements ma0 {
    public final Context c;
    public Context d;
    public w90 e;
    public final LayoutInflater f;
    public la0 g;
    public oa0 j;
    public q2 k;
    public Drawable l;
    public boolean m;
    public boolean n;
    public boolean o;
    public int p;
    public int q;
    public int r;
    public boolean s;
    public o2 u;
    public o2 v;
    public m61 w;
    public p2 x;
    public final int h = R.layout.abc_action_menu_layout;
    public final int i = R.layout.abc_action_menu_item_layout;
    public final SparseBooleanArray t = new SparseBooleanArray();
    public final i81 y = new i81(2, this);

    public r2(Context context) {
        this.c = context;
        this.f = LayoutInflater.from(context);
    }

    @Override // defpackage.ma0
    public final void a(w90 w90Var, boolean z) {
        d();
        o2 o2Var = this.v;
        if (o2Var != null && o2Var.b()) {
            o2Var.i.dismiss();
        }
        la0 la0Var = this.g;
        if (la0Var != null) {
            la0Var.a(w90Var, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [na0] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    public final View b(z90 z90Var, View view, ViewGroup viewGroup) {
        ActionMenuItemView actionMenuItemView;
        View actionView = z90Var.getActionView();
        int i = 0;
        if (actionView == null || z90Var.e()) {
            if (view instanceof na0) {
                actionMenuItemView = (na0) view;
            } else {
                actionMenuItemView = (na0) this.f.inflate(this.i, viewGroup, false);
            }
            actionMenuItemView.c(z90Var);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker((ActionMenuView) this.j);
            if (this.x == null) {
                this.x = new p2(this);
            }
            actionMenuItemView2.setPopupCallback(this.x);
            actionView = actionMenuItemView;
        }
        if (z90Var.C) {
            i = 8;
        }
        actionView.setVisibility(i);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof t2)) {
            actionView.setLayoutParams(ActionMenuView.k(layoutParams));
        }
        return actionView;
    }

    @Override // defpackage.ma0
    public final boolean c(z90 z90Var) {
        return false;
    }

    public final boolean d() {
        Object obj;
        m61 m61Var = this.w;
        if (m61Var != null && (obj = this.j) != null) {
            ((View) obj).removeCallbacks(m61Var);
            this.w = null;
            return true;
        }
        o2 o2Var = this.u;
        if (o2Var != null) {
            if (o2Var.b()) {
                o2Var.i.dismiss();
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.ma0
    public final void e(la0 la0Var) {
        throw null;
    }

    @Override // defpackage.ma0
    public final boolean f(z90 z90Var) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ma0
    public final void g() {
        int i;
        z90 z90Var;
        ViewGroup viewGroup = (ViewGroup) this.j;
        ArrayList arrayList = null;
        boolean z = false;
        if (viewGroup != null) {
            w90 w90Var = this.e;
            if (w90Var != null) {
                w90Var.i();
                ArrayList l = this.e.l();
                int size = l.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    z90 z90Var2 = (z90) l.get(i2);
                    if ((z90Var2.x & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i);
                        if (childAt instanceof na0) {
                            z90Var = ((na0) childAt).getItemData();
                        } else {
                            z90Var = null;
                        }
                        View b = b(z90Var2, childAt, viewGroup);
                        if (z90Var2 != z90Var) {
                            b.setPressed(false);
                            b.jumpDrawablesToCurrentState();
                        }
                        if (b != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) b.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(b);
                            }
                            ((ViewGroup) this.j).addView(b, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.k) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View) this.j).requestLayout();
        w90 w90Var2 = this.e;
        if (w90Var2 != null) {
            w90Var2.i();
            ArrayList arrayList2 = w90Var2.i;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                aa0 aa0Var = ((z90) arrayList2.get(i3)).A;
            }
        }
        w90 w90Var3 = this.e;
        if (w90Var3 != null) {
            w90Var3.i();
            arrayList = w90Var3.j;
        }
        if (this.n && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z = !((z90) arrayList.get(0)).C;
            } else if (size3 > 0) {
                z = true;
            }
        }
        q2 q2Var = this.k;
        if (z) {
            if (q2Var == null) {
                this.k = new q2(this, this.c);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.k.getParent();
            if (viewGroup3 != this.j) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.k);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.j;
                q2 q2Var2 = this.k;
                actionMenuView.getClass();
                t2 j = ActionMenuView.j();
                j.a = true;
                actionMenuView.addView(q2Var2, j);
            }
        } else if (q2Var != null) {
            Object parent = q2Var.getParent();
            Object obj = this.j;
            if (parent == obj) {
                ((ViewGroup) obj).removeView(this.k);
            }
        }
        ((ActionMenuView) this.j).setOverflowReserved(this.n);
    }

    public final boolean h() {
        o2 o2Var = this.u;
        if (o2Var != null && o2Var.b()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.ma0
    public final void i(Context context, w90 w90Var) {
        this.d = context;
        LayoutInflater.from(context);
        this.e = w90Var;
        Resources resources = context.getResources();
        if (!this.o) {
            this.n = true;
        }
        int i = 2;
        this.p = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp <= 600 && i2 <= 600 && ((i2 <= 960 || i3 <= 720) && (i2 <= 720 || i3 <= 960))) {
            if (i2 < 500 && ((i2 <= 640 || i3 <= 480) && (i2 <= 480 || i3 <= 640))) {
                if (i2 >= 360) {
                    i = 3;
                }
            } else {
                i = 4;
            }
        } else {
            i = 5;
        }
        this.r = i;
        int i4 = this.p;
        if (this.n) {
            if (this.k == null) {
                q2 q2Var = new q2(this, this.c);
                this.k = q2Var;
                if (this.m) {
                    q2Var.setImageDrawable(this.l);
                    this.l = null;
                    this.m = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.k.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i4 -= this.k.getMeasuredWidth();
        } else {
            this.k = null;
        }
        this.q = i4;
        float f = resources.getDisplayMetrics().density;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ma0
    public final boolean j(gq0 gq0Var) {
        boolean z;
        if (gq0Var.hasVisibleItems()) {
            gq0 gq0Var2 = gq0Var;
            while (true) {
                w90 w90Var = gq0Var2.z;
                if (w90Var == this.e) {
                    break;
                }
                gq0Var2 = (gq0) w90Var;
            }
            z90 z90Var = gq0Var2.A;
            ViewGroup viewGroup = (ViewGroup) this.j;
            View view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                int i = 0;
                while (true) {
                    if (i >= childCount) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i);
                    if ((childAt instanceof na0) && ((na0) childAt).getItemData() == z90Var) {
                        view = childAt;
                        break;
                    }
                    i++;
                }
            }
            if (view != null) {
                gq0Var.A.getClass();
                int size = gq0Var.f.size();
                int i2 = 0;
                while (true) {
                    if (i2 < size) {
                        MenuItem item = gq0Var.getItem(i2);
                        if (item.isVisible() && item.getIcon() != null) {
                            z = true;
                            break;
                        }
                        i2++;
                    } else {
                        z = false;
                        break;
                    }
                }
                o2 o2Var = new o2(this, this.d, gq0Var, view);
                this.v = o2Var;
                o2Var.g = z;
                ea0 ea0Var = o2Var.i;
                if (ea0Var != null) {
                    ea0Var.o(z);
                }
                o2 o2Var2 = this.v;
                if (!o2Var2.b()) {
                    if (o2Var2.e != null) {
                        o2Var2.d(0, 0, false, false);
                    } else {
                        c.o("MenuPopupHelper cannot be used without an anchor");
                        return false;
                    }
                }
                la0 la0Var = this.g;
                if (la0Var != null) {
                    la0Var.p(gq0Var);
                }
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ma0
    public final boolean k() {
        int i;
        ArrayList arrayList;
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        r2 r2Var = this;
        w90 w90Var = r2Var.e;
        if (w90Var != null) {
            arrayList = w90Var.l();
            i = arrayList.size();
        } else {
            i = 0;
            arrayList = null;
        }
        int i3 = r2Var.r;
        int i4 = r2Var.q;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) r2Var.j;
        int i5 = 0;
        boolean z5 = false;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            i2 = 2;
            z = true;
            if (i5 >= i) {
                break;
            }
            z90 z90Var = (z90) arrayList.get(i5);
            int i8 = z90Var.y;
            if ((i8 & 2) == 2) {
                i6++;
            } else if ((i8 & 1) == 1) {
                i7++;
            } else {
                z5 = true;
            }
            if (r2Var.s && z90Var.C) {
                i3 = 0;
            }
            i5++;
        }
        if (r2Var.n && (z5 || i7 + i6 > i3)) {
            i3--;
        }
        int i9 = i3 - i6;
        SparseBooleanArray sparseBooleanArray = r2Var.t;
        sparseBooleanArray.clear();
        int i10 = 0;
        int i11 = 0;
        while (i10 < i) {
            z90 z90Var2 = (z90) arrayList.get(i10);
            int i12 = z90Var2.y;
            if ((i12 & 2) == i2) {
                z2 = z;
            } else {
                z2 = false;
            }
            int i13 = z90Var2.b;
            if (z2) {
                View b = r2Var.b(z90Var2, null, viewGroup);
                b.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = b.getMeasuredWidth();
                i4 -= measuredWidth;
                if (i11 == 0) {
                    i11 = measuredWidth;
                }
                if (i13 != 0) {
                    sparseBooleanArray.put(i13, z);
                }
                z90Var2.f(z);
            } else if ((i12 & 1) == z) {
                boolean z6 = sparseBooleanArray.get(i13);
                if ((i9 > 0 || z6) && i4 > 0) {
                    z3 = z;
                } else {
                    z3 = false;
                }
                if (z3) {
                    View b2 = r2Var.b(z90Var2, null, viewGroup);
                    b2.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = b2.getMeasuredWidth();
                    i4 -= measuredWidth2;
                    if (i11 == 0) {
                        i11 = measuredWidth2;
                    }
                    if (i4 + i11 > 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    z3 &= z4;
                }
                if (z3 && i13 != 0) {
                    sparseBooleanArray.put(i13, true);
                } else if (z6) {
                    sparseBooleanArray.put(i13, false);
                    for (int i14 = 0; i14 < i10; i14++) {
                        z90 z90Var3 = (z90) arrayList.get(i14);
                        if (z90Var3.b == i13) {
                            if ((z90Var3.x & 32) == 32) {
                                i9++;
                            }
                            z90Var3.f(false);
                        }
                    }
                }
                if (z3) {
                    i9--;
                }
                z90Var2.f(z3);
            } else {
                z90Var2.f(false);
                i10++;
                i2 = 2;
                r2Var = this;
                z = true;
            }
            i10++;
            i2 = 2;
            r2Var = this;
            z = true;
        }
        return z;
    }

    public final boolean l() {
        w90 w90Var;
        boolean z = false;
        if (this.n && !h() && (w90Var = this.e) != null && this.j != null && this.w == null) {
            w90Var.i();
            if (!w90Var.j.isEmpty()) {
                m61 m61Var = new m61(this, new o2(this, this.d, this.e, this.k), 1, z);
                this.w = m61Var;
                ((View) this.j).post(m61Var);
                return true;
            }
        }
        return false;
    }
}
