package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import defpackage.b8;
import defpackage.oa0;
import defpackage.v90;
import defpackage.w90;
import defpackage.z90;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements v90, oa0, AdapterView.OnItemClickListener {
    public static final int[] d = {R.attr.background, R.attr.divider};
    public w90 c;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        b8 J = b8.J(context, attributeSet, d, R.attr.listViewStyle);
        TypedArray typedArray = (TypedArray) J.d;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(J.z(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(J.z(1));
        }
        J.N();
    }

    @Override // defpackage.v90
    public final boolean a(z90 z90Var) {
        return this.c.q(z90Var, null, 0);
    }

    @Override // defpackage.oa0
    public final void b(w90 w90Var) {
        this.c = w90Var;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        a((z90) getAdapter().getItem(i));
    }
}
