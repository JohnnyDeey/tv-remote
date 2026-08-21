package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class r80 extends ArrayAdapter {
    public ColorStateList a;
    public ColorStateList b;
    public final /* synthetic */ s80 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r80(s80 s80Var, Context context, int i, String[] strArr) {
        super(context, i, strArr);
        this.c = s80Var;
        a();
    }

    public final void a() {
        ColorStateList colorStateList;
        s80 s80Var = this.c;
        ColorStateList colorStateList2 = s80Var.n;
        ColorStateList colorStateList3 = null;
        if (colorStateList2 != null) {
            int[] iArr = {R.attr.state_pressed};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
        } else {
            colorStateList = null;
        }
        this.b = colorStateList;
        if (s80Var.m != 0 && s80Var.n != null) {
            int[] iArr2 = {R.attr.state_hovered, -16842919};
            int[] iArr3 = {R.attr.state_selected, -16842919};
            colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{oi.b(s80Var.n.getColorForState(iArr3, 0), s80Var.m), oi.b(s80Var.n.getColorForState(iArr2, 0), s80Var.m), s80Var.m});
        }
        this.a = colorStateList3;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            s80 s80Var = this.c;
            Drawable drawable = null;
            if (s80Var.getText().toString().contentEquals(textView.getText()) && s80Var.m != 0) {
                ColorDrawable colorDrawable = new ColorDrawable(s80Var.m);
                if (this.b != null) {
                    colorDrawable.setTintList(this.a);
                    drawable = new RippleDrawable(this.b, colorDrawable, null);
                } else {
                    drawable = colorDrawable;
                }
            }
            textView.setBackground(drawable);
        }
        return view2;
    }
}
