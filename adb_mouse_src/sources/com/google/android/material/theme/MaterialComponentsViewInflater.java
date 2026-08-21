package com.google.android.material.theme;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.button.MaterialButton;
import defpackage.a8;
import defpackage.e90;
import defpackage.g5;
import defpackage.h5;
import defpackage.j5;
import defpackage.k20;
import defpackage.mg0;
import defpackage.mn;
import defpackage.r21;
import defpackage.s6;
import defpackage.s7;
import defpackage.s80;
import svarzee.android.apps.adb_mouse.R;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public class MaterialComponentsViewInflater extends a8 {
    @Override // defpackage.a8
    public final g5 a(Context context, AttributeSet attributeSet) {
        return new s80(context, attributeSet);
    }

    @Override // defpackage.a8
    public final h5 b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // defpackage.a8
    public final j5 c(Context context, AttributeSet attributeSet) {
        return new e90(context, attributeSet);
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [i90, s6, android.widget.CompoundButton, android.view.View] */
    @Override // defpackage.a8
    public final s6 d(Context context, AttributeSet attributeSet) {
        ?? s6Var = new s6(r21.Q(context, attributeSet, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet);
        Context context2 = s6Var.getContext();
        TypedArray X = k20.X(context2, attributeSet, mg0.s, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (X.hasValue(0)) {
            s6Var.setButtonTintList(k20.w(context2, X, 0));
        }
        s6Var.h = X.getBoolean(1, false);
        X.recycle();
        return s6Var;
    }

    @Override // defpackage.a8
    public final s7 e(Context context, AttributeSet attributeSet) {
        s7 s7Var = new s7(r21.Q(context, attributeSet, android.R.attr.textViewStyle, 0), attributeSet, android.R.attr.textViewStyle);
        Context context2 = s7Var.getContext();
        if (mn.M(context2, R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = mg0.w;
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, android.R.attr.textViewStyle, 0);
            int[] iArr2 = {1, 2};
            int i = -1;
            for (int i2 = 0; i2 < 2 && i < 0; i2++) {
                i = k20.y(context2, obtainStyledAttributes, iArr2[i2], -1);
            }
            obtainStyledAttributes.recycle();
            if (i == -1) {
                TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, android.R.attr.textViewStyle, 0);
                int resourceId = obtainStyledAttributes2.getResourceId(0, -1);
                obtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    TypedArray obtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, mg0.v);
                    Context context3 = s7Var.getContext();
                    int[] iArr3 = {2, 4};
                    int i3 = -1;
                    for (int i4 = 0; i4 < 2 && i3 < 0; i4++) {
                        i3 = k20.y(context3, obtainStyledAttributes3, iArr3[i4], -1);
                    }
                    obtainStyledAttributes3.recycle();
                    if (i3 >= 0) {
                        s7Var.setLineHeight(i3);
                    }
                }
            }
        }
        return s7Var;
    }
}
