package defpackage;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class ba0 extends FrameLayout implements ci {
    public final CollapsibleActionView c;

    /* JADX WARN: Multi-variable type inference failed */
    public ba0(View view) {
        super(view.getContext());
        this.c = (CollapsibleActionView) view;
        addView(view);
    }
}
