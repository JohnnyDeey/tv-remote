package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import defpackage.ng0;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public class AlertController$RecycleListView extends ListView {
    public final int c;
    public final int d;

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ng0.t);
        this.d = obtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.c = obtainStyledAttributes.getDimensionPixelOffset(1, -1);
    }
}
