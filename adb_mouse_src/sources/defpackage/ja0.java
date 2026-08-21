package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class ja0 extends wr {
    public final int o;
    public final int p;
    public y90 q;
    public z90 r;

    public ja0(Context context, boolean z) {
        super(context, z);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.o = 21;
            this.p = 22;
        } else {
            this.o = 22;
            this.p = 21;
        }
    }

    @Override // defpackage.wr, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        t90 t90Var;
        int i;
        z90 z90Var;
        int pointToPosition;
        int i2;
        if (this.q != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i = headerViewListAdapter.getHeadersCount();
                t90Var = (t90) headerViewListAdapter.getWrappedAdapter();
            } else {
                t90Var = (t90) adapter;
                i = 0;
            }
            if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i2 = pointToPosition - i) >= 0 && i2 < t90Var.getCount()) {
                z90Var = t90Var.getItem(i2);
            } else {
                z90Var = null;
            }
            z90 z90Var2 = this.r;
            if (z90Var2 != z90Var) {
                w90 w90Var = t90Var.a;
                if (z90Var2 != null) {
                    this.q.f(w90Var, z90Var2);
                }
                this.r = z90Var;
                if (z90Var != null) {
                    this.q.j(w90Var, z90Var);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        t90 t90Var;
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.o) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView != null && i == this.p) {
            setSelection(-1);
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                t90Var = (t90) ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            } else {
                t90Var = (t90) adapter;
            }
            t90Var.a.c(false);
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public void setHoverListener(y90 y90Var) {
        this.q = y90Var;
    }

    @Override // defpackage.wr, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
